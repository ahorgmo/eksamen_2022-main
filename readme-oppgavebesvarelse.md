## Del 1 DevOps-prinsipper
### Hva er utfordringene med dagens systemutviklingsprosess – og hvordan vil innføring av DevOps kunne være med på å løse disse? Hvilke DevOps prinsipper blir brutt?

Hvis vi dykker inn i dagens systemutviklingsprosess så ser vi først og fremst at de deployer kode fire ganger i året, nemlig hver første mandag i kvartalet. Hvis man kun ser på denne prosessen med antall deployments fra et DevOps perspektiv, vil man helst ha så mange deploys som mulig, helst daglig. Det vil eliminere unødvendige arbeidsprosesser. Se for deg hvis en utvikler har fått et oppdrag, og teknologien må oppdateres eller er utdatert innen den tiden det skal deployes, så har hele arbeidet vært bortkastet. Ved å sette søkelys på små prosesser vil du ha mulighet til å utvikle deg i takt med markedet og ta tak i problemer som oppstår raskere og mer effektivt. 

Går man videre i deres utviklingsprosess ser vi at de pleide å deploye ofte før, og at dette førte til ustabilitet. Som en løsning på problemet ansatte de flere testere og startet en prosess der ledere måtte se over og godkjenne. De senket samtidig frekvensen på leveransene for å oppnå bedre stabilitet. Denne prosessen sett på fra et DevOps perspektiv så burde man redusere «work in progress», redusere antall overlevering, redusere ekstra prosesser, venting og manuelt arbeid. I dagens systemprosess så er alle disse tingene blitt lagt til, som en «løsning» på problemet deres, så her er det mye som er feil. Det vil nok også være en del oppgavebytter eller «task switches» siden det kan bli mye tid brukt på å kommunisere frem og tilbake gjennom de ekstra leddene. Ved å sette opp en infrastruktur og automatisere testing, vil det sørge for en tryggere prosess med deployments. Her vil man tidlig se problemer som oppstår, og kun publisere kode som faktisk vil være aktuell og skape minst mulig problemer.

Når de deployer, feiler det fortsatt ofte. Da ruller de tilbake til forrige versjon, og ny funksjonalitet blir derfor ofte forsinket i månedsvis. I denne prosessen ser vi at når koden deployes så feiler den ofte. Ved å kun deploye kode 4 ganger i et år vil funksjonalitet naturligvis bli forsinket kraftig ved feilende deploys. Hvis man øker deploys og oppgavestørrelsen vil man fort finne ut problemer og feil, og kunne løse de mer effektivt. Når kode eller en deploy feiler, burde man se problemene når de dukker opp, og gjøre det man kan for å løse problemet så fort som mulig. Ved å gjøre dette vil man kunne bygge mer kunnskap som kan brukes til fremtidige deploys og problemer som kan oppstå. Dette vil da også føre til økt kvalitet, stabilitet og trygghet.

Siste systemutviklingsprosess er at leveransen skjer ved at et eget utviklingsteam bruker FTP til å overføre en JAR sammen med dokumentasjon i en ZIP. Hvor en egen avdeling da tar imot disse filene og installerer i AWS / Produksjon. Først å fremst så vil man redusere overleveringer. Her kan man se på overføringen som en overlevering som ikke er trygg i det hele tatt. Her risikerer man at filer mistes, stjeles eller blir endret på uten å vite det. Man kunne brukt tid og ressurser på å kryptere filene, men igjen så fører ikke dette til at pakker kan gå tapt eller ende på avveie. Et prosjekt kan funke bra hos utviklingsteamet, men krasje hos avdelingen som kjører drift. Dette fører til at det kan ta lang tid for å fikse problemer, det kan bli veldig dyrt, og er ekstremt risikabelt. 

Hvis man ser på hele utviklingsprosessen i en helhet, så ser man at denne bedriften hadde hatt stor utnytte av en DevOps utviklingsprosess. 

### En vanlig respons på mange feil under release av ny funksjonalitet er å gjøre det mindre hyppig, og samtidig forsøke å legge på mer kontroll og QA. Hva er problemet med dette ut ifra et DevOps perspektiv, og hva kan være en bedre tilnærming?

Problemet med å release ny funksjonalitet mindre hyppig, og samtidig forsøke å legge på mer kontroll og QA kan føre til at effektiviteten og lønnsomheten stuper. Her snakker vi da ekstra prosesser, mer usikkerhet, flere steder ting kan gå galt og bygge opp større og kompliserte problemer. Ved å release mer hyppig, med automatiserte tester vil man raskere se problemer som oppstår. Hvis man tar et og et problem om gangen, eller mindre oppgaver, vil man se at kvaliteten på funksjonaliteten vil øke. Hvis man ender opp med å ha mye arbeid, og i tillegg må endre oppgaver og løse feil og problemer andre steder vil det lede til mye uferdig arbeid, mye venting, og øke «work in progress».

### Teamet overleverer kode til en annen avdeling som har ansvar for drift – hva er utfordringen med dette ut ifra et DevOps perspektiv, og hvilke gevinster kan man få ved at team har ansvar for både drift- og utvikling?

Når man har to separate avdelinger som driver med utvikling og drift kan man få problemer ved feil som oppstår. Error handling ville vært mye mer effektivt ved å ha de som bygget koden til å kjøre den og ta seg av problemer som dukker opp. Det vil være et ekstra ledd man må kommunisere gjennom, som igjen fører til ventetid og ekstra unødvendig bevegelse. Ved å ha en avdeling som er ansvarlig for begge vil man kunne gjøre arbeidet synlig, som vil føre til bedre oversikt, og lettere for alle å lære av hverandres feil og problemer som dukker opp. Man vil løse feil på en mye mer effektiv måte, og kunne forhindre slike feil I fremtiden. Da løser man et problem ved å ha færrest mulig overleveringer.

### Å release kode ofte kan også by på utfordringer. Beskriv hvilke- og hvordan vi kan bruke DevOps prinsipper til å redusere eller fjerne risiko ved hyppige leveranser.

Ved å ta i bruk DevOps prinsipper som automatiserte tester, kontinuerlig leveranser og kontinuerlig integrasjon vil man kunne fjerne eller redusere risiko ved hyppige leveranser. Man vil da kunne se tidlig i byggeprosessen om kode feiler eller ikke. Dette reduserer risiko for at kode vil feile eller lede til store problemer etter release. Det vil da også være enklere å gjøre hyppigere leveranser siden man løser et problem av gangen og har mulighet til å lære av de feilene som oppstår. Kvaliteten på koden vil også øke ved å gjennomføre dette. Ved å gjøre hyppige leveranser vil man kunne ha en bedre dialog med kunden, som igjen fører til et bedre produkt, og mer fornøyde kunder. Det åpner opp for mer feedback, som man tar med seg videre og bruker til å utvikle ny funksjonalitet.


## Del 2 – CI
### Oppgave 3 – Branch protection og status sjekker - Beskriv hva sensor må gjøre for å konfigurere sin fork på en slik måte

Etter man har klonet repoet på GitHub kan man gjøre følgende:
1.	Gå til Settings
2.	Gå til Branches
3.	Branch protection rules -> Add rule
4.	Skriv main i «branch name pattern»
5.	Velg Require a pull request before merging -> Require approvals -> Required number of approvals before merging: 1
6.	Velg Require status check to pass before merging -> Skriv build I søkefeltet og velg build med GitHub Actions
7.	Velg Do not allow bypassing the above settings


## Del 3 - Docker
### Oppgave 1 – Hva må du gjøre for å få workflow til å fungere med din DockerHub konto? Hvorfor feiler workflowen? 

For at workflowen skal fungere med egen DockerHub konto trenger man å lage en DockerHub token på egen DockerHub profil. Når man har generert en token, må man legge den inn i GitHub secrets, i dette tilfelle må den hete DOCKER_HUB_TOKEN, også må man lage en GitHub secret for brukernavnet på DockerHub også, denne må kalles DOCKER_HUB_USERNAME. Gjør man dette vil workflowen fungere med egen DockerHub konto.
Workflowen feiler først på steget «Login to Docker Hub» fordi den mangler brukernavn og token. Dette fører til at «Build and push» også vil feile.

### Oppgave 3 – Beskriv med egne ord hva sensor må gjøre for å få sin fork til å laste opp container image til sitt eget ECR repo

*§ Jeg antar at sensor vil bruke samme AWS miljø som studentene og læreren har brukt. URL for AWS login og region vil derfor være samme som den brukt i forelesning og øving. §*

For at workflowen for å pushe docker container til ECR skal fungere for sensor må sensor generere AWS access key og access key id. Det gjør man ved å:

1.	Gå til IAM i AWS og finne egen IAM bruker.
2.	Velg Security credentials
3.	Velg Create Access key

Sensor må så legge inn disse to verdiene inn i GitHub secrets ved å gjøre følgende fra GitHub repo:

1.	Gå til Settings
2.	Gå til Secrets -> Actions
3.	Velg New repository secret
4.	Legg inn AWS access key id og kall den AWS_ACCESS_KEY_ID
5.	Lag en til. Legg inn AWS secret access key og kall den AWS_SECRET_ACCESS_KEY

Workflowen vil nå fungere og pushe et docker container til ECR. I docker.yml filen kan sensor endre tagnavn ved å endre verdien som er streket under med GUL på bildet under. Sensor kan endre ECR navn ved å endre verdiene som er streket under med RØD på bildet under.

![image](https://user-images.githubusercontent.com/77099261/206321171-f40bf3a4-2a42-45aa-adfc-b0af43de2f2b.png)

1.	Hvis sensor skal pushe et docker image til ECR manuelt må man først logge inn på docker og bygge en container. Det gjør man ved å kjøre kommandoene:

docker login
docker tag <tag> <dockerhub_brukernavn>/<tag_remote>
docker push <dockerhub_brukernavn>/<tag_remote>

2.	Deretter kjører man følgende for å connecte mot AWS:

aws ecr get-login-password --region eu-west-1 | docker login --username AWS --password-stdin 244530008913.dkr.ecr.eu-west-1.amazonaws.com

3.	Og deretter kjører man for å pushe docker image:

docker build -t <ditt tagnavn> .
docker tag <ditt tagnavn> 244530008913.dkr.ecr.eu-west-1.amazonaws.com/<ditt ECR repo navn>
docker push 244530008913.dkr.ecr.eu-west-1.amazonaws.com/<ditt ECR repo navn>

## Del 5 - Terraform og CloudWatch Dashboards
### Oppgave 1 – Hva er årsaken til dette problemet? Hvorfor forsøker Terraform å opprette en bucket, når den allerede eksisterer?
