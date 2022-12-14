package no.shoppifly;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.annotation.Timed;
import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.MeterRegistry;

@RestController()
public class ShoppingCartController implements ApplicationListener<ApplicationReadyEvent> {
    
    private MeterRegistry meterRegistry;

    @Autowired
    private final CartService cartService;
    
    @Autowired
    public ShoppingCartController(MeterRegistry meterRegistry, CartService cartService) {
		this.meterRegistry = meterRegistry;
		this.cartService = cartService;
	}


    @GetMapping(path = "/cart/{id}")
    public Cart getCart(@PathVariable String id) {
        return cartService.getCart(id);
    }

    /**
     * Checks out a shopping cart. Removes the cart, and returns an order ID
     *
     * @return an order ID
     */
    @PostMapping(path = "/cart/checkout")
    @Timed
    public String checkout(@RequestBody Cart cart) {
        meterRegistry.counter("checkouts").increment();
        
        // Random timer to simulate dely
        try {
            Thread.sleep((long) (250 * Math.random()));
        } catch (InterruptedException ignored) {
        }
        
        return cartService.checkout(cart);
    }

    /**
     * Updates a shopping cart, replacing it's contents if it already exists. If no cart exists (id is null)
     * a new cart is created.
     *
     * @return the updated cart
     */
    @PostMapping(path = "/cart")
    public Cart updateCart(@RequestBody Cart cart) {
        return cartService.update(cart);
    }

    /**
     * return all cart IDs
     *
     * @return
     */
    @GetMapping(path = "/carts")
    public List<String> getAllCarts() {
        return cartService.getAllsCarts();
    }

	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		
		Gauge.builder("carts_count", cartService,
		b -> b.getAllsCarts().size()).register(meterRegistry);
		
		Gauge.builder("cartsvalue_count", cartService,
		b -> b.total()).register(meterRegistry); 
	}
}