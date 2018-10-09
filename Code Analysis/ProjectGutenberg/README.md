# Code Analysis

## Valg af projekt
Jeg har valgt at bruge projektet fra database kurset på 1. semester, 'Projekt Gutenberg'. 

## Opgave 1
Til denne opgave benytter jeg mig af NetBeans IDE 8.2, hvortil jeg har installeret et plugin kaldet EasyPMD. 
Følgende er en liste over de metrikker jeg har valgt, samt argumentation for valgene. 

**Comments**

Jeg mener det er vigtigt ikke at have mange unødvendige kommentarer liggende i sin kode. Det medfører uoverskuelig kode.
Dog er det ligeså vigtigt at de 'rigtige' kommentare i sin kode, som f.eks. dokumentation af metoder og eventuelle forklaringer
på komplekse kodeblokke. 

**Coupling**

Dette punkt er især relevant da vi arbejder objektorienteret. 
Det er vigtigt med lav kobling for at få en kode der er mere robust og nemmere at vedligeholde, derfor er det fint med et sådant tjek
in case der er koblinger man ikke har opdaget.

**Design** 

Hjælper til at best practices bliver overholdt. Eventuelle forbedringer medført af dette punkt er med til at give en mere overskuelig
kode, samt en kode der er nemmere at vedligeholde. 

**Naming**

Navnekonventioner er rigtig vigtige for overskuelighed og gennemskueligehed. En nem forståelse af koden kan stå og falde med ordentlige
navnekonventioner. 
Det gør det desuden nemmere for nytilkomne at sætte sig ind i koden. 

**Strict Exceptions**

Det er vigtigt at håndtere exceptions korrekt, da det er med til at gøre debugging væsentlig nemmere. 

**Optimization** 

**Ubrugte variabler/ubrugt kode**

Ubrugt kode er kun med til at gøre koden mere uoverskuelig og giver ingen værdi på nogen måde. Derfor skal det undgås til hver en tid. 

**System.out.println**

Disse bliver ofte brugt under udviklingen af koden, men skal helst undgås i produktion. 
Mener man at de er absolut nødvendige skal man overveje om man kan lave en log i stedet for. 

**Ubrugte imports**

Bliver de ikke brugt skal de ikke være i koden. 
