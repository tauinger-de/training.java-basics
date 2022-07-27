# KONTEN PROJEKT

## 7) Refactoring

1. Ändern Sie die Felder `kontoNummer` und `besitzer` auf `private` Sichtbarkeit
2. Fügen Sie der Klasse `Girokonto` eine überschriebene `kontoStatus()` Methode hinzu
3. Erstellen Sie Konstruktoren, sodass Konten ohne Angabe eines Kontostands erzeugt werden können.
   In diesem Fall ist der Kontostand 0.0
4. Die Klasse `Konto` soll keine Setter-Methode für den Kontostand mehr haben,
   stattdessen soll dieser intern durch die Geschäftslogik-Methoden verändert werden
   (nachdem er initial im Konstruktor gesetzt wurde)
5. Die Klasse `Konto` braucht eine neue interne Methode zur Prüfung der Bonität, die dann bei
   einer Überweisung aus `Konto` und `Girokonto` genutzt wird. Damit wollen wir die überschriebene
   Methode zur Überweisung schlanker gestalten

## 8) Ausnahmebehandlung

1. Erstellen Sie eine `InsufficientBalanceException` (als Subtyp von `RuntimeException`),
   die in der Bonitätsprüfung geworfen wird, wenn
   keine Deckung vorliegt. Diese soll eine Message enthalten und in der `Girokonto` Subklasse einen
   anderen Text haben als in der Superklasse
2. Fangen Sie die Exception in der main-Klasse und behandeln Sie diese durch eine einfache System.out
   Ausgabe.

## 9) Klassenattribute

1. Erstellen Sie eine Klasse `NameValidator`, die prüft, ob ein Kundenname richtig formatiert ist.
   Eine richtige Formatierung liegt dann vor, wenn der Name mindestens 5 Zeichen enthält (Sie können
   gerne noch weitere Regeln sich ausdenken)
2. Die Prüfmethode soll zusätzlich bei jedem zweiten Aufruf eine `ServiceNotAvailableException`
   (Superklasse `Exception`) werfen, da der Dienst sehr unzuverlässig ist.
   Diese Klasse müssen Sie selbst erstellen.
3. Erstellen Sie eine neue Klasse `ToolsFactory`
4. Legen Sie eine statische Methode namens `getNameValidator` an, die eine Instanz des `NameValidator`
   zurückgibt.
5. Nutzen Sie den `NameValidator` (geholt aus der `ToolsFactory`) beim Anlegen eines neuen Kontos. Wenn der Dienst nicht
   zur Verfügung
   steht, dann soll der Name des Kunden mit doppelten Pfeilklammern im Konto hinterlegt werden, also
   z.B. "<<Max Mustermann>>",
   damit später noch eine Prüfung nachgeholt werden kann.

# ARRAYS

## Durchschnitt ohne Ausreißer

Berechnen Sie den Durchschnitt aller Werte in einem Array ohne den größten und kleinsten Wert zu beachten.

Bsp: `centeredAvg( [1, 2, 3, 4, 100] ) == 3`

## Anzahl

Berechnen Sie die Anzahl der Vorkommen von mindestens zwei gleichen
Elementen hintereinander ("Klumpen").

Bsp: `countClumps( [1, 2, 2, 3, 4, 4] ) == 2`
