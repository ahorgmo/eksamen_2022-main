/*package no.shoppifly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CartServiceTest {

    @Test
    public void shouldRemoveCartAfterCheckout() {

        CartService service = new NaiveCartImpl();
        Cart theCart = Cart.builder().build();
        service.update(theCart);
        assertEquals(1, service.getAllsCarts().size());
        String orderId = service.checkout(theCart);
        assertNotNull(orderId);

        // Jim; This must be wrong, right? Shouldn't the cart be removed after checkout
        
        //Updated test to be equal to 0, because the cart is removed after checkout,
        //test should now pass.
        assertEquals(0, service.getAllsCarts().size());
    }

}
*/