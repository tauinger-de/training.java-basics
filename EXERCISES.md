# KONTEN PROJEKT

## 7) Refactoring

1. Ändern Sie die Felder `kontoNummer` und `besitzer` auf `private` Sichtbarkeit
2. Fügen Sie der Klasse `Girokonto` eine überschriebene `kontoStatus()` Methode hinzu
3. Erstellen Sie Konstruktoren, so dass Konten ohne Angabe eines Kontostands erzeugt werden können.
In diesem Fall ist der Kontostand 0.0
4. Die Klasse `Konto` soll keine Setter-Methode für den Kontostand mehr haben, 
stattdessen soll dieser intern durch die Geschäftslogik-Methoden verändert werden
(nachdem er initial im Konstruktor gesetzt wurde)
5. Die Klasse `Konto` braucht eine neue interne Methode zur Prüfung der Bonität, die dann bei
einer Überweisung aus `Konto` und `Girokonto` genutzt wird. Damit wollen wir die überschriebene
Methode zur Überweisung schlanker gestalten

# ARRAYS

## Durchschnitt ohne Ausreißer

Berechnen Sie den Durchschnitt aller Werte in einem Array ohne den größten und kleinsten Wert zu beachten.

Bsp: `centeredAvg( [1, 2, 3, 4, 100] ) == 3`

## Anzahl 

Berechnen Sie die Anzahl der Vorkommen von mindestens zwei gleichen 
Elementen hintereinander ("Klumpen").

Bsp: `countClumps( [1, 2, 2, 3, 4, 4] ) == 2`
