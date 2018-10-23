# Benchmark-UFO

Af Emilie Hinsch Nielsen & Philip West Christiansen

## Formulate a hypothesis/problem statement about behavior of ping times of these three servers.

Vi formoder at en større afstand resulterere i længere responstid til server. Dermed vil ping blive højere desto længere væk vi er fra serverens fysiske adresse. 

## Plan an experiment, which measures response times of these three servers.

Vi har valgt at skrive et program i Python. Programmet hedder "pingingServers.py" og findes i dette repository. Eksperimentet går ud på at pinge hver server 20 gange, og herefter finde gennemsnittet af responstiden.

## Execute the experiment, which measures response times of these three servers.

![Analysis Report](https://github.com/ehn94/UFO_course/blob/master/Benchmarking-UFO/images/pingingServersScreenshot.png)

Her er resultatet af vores eksperiment: 

| IP              | Avg. Responsetime |
|-----------------|-------------------|
| 128.199.144.199 | 269 ms            |
| 167.99.51.33    | 117 ms            |
| 46.101.253.149  | 39 ms             |

## Evaluate your experiment and interpret the measurements and results.

På baggrund af vores eksperiment vurderer vi at serveren med ping "128.199.144.199" befinder sig længst væk fra os. "167.99.51.33" er den midterste og "46.101.253.149" er vi tættest på.

## Discussion

I vores eksperiment pinger vi de tre forskellige servere 20 forskellige gange, og finder herefter den gennemsnitlige ping tid. Dette gøres ved brug af ping funktionen i Python. 

Når man laver denne form for eksperimenter er det vigtigt at tage højde for andre processer der kører i baggrunden, når man ekseverer eksperimentet. Dette nævner Peter Sestoft i hans [benchmarking.pdf](https://www.itu.dk/people/sestoft/papers/benchmarking.pdf). Dette undgår vi ved at bruge ping kommandoen som kun udregner den tid det tager få forbindelse til serveren, og få et svar. Der er mange ting der kan have indvirkning på responstiden såsom, distance, server repsonstid og trafik. 
