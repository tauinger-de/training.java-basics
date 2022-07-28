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
2. Fangen Sie die Exception in der main-Klasse und behandeln Sie diese durch eine
   einfache "System.out"-Ausgabe.

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

## 10) Arrays

1. Erweitern Sie den `NameValidator` um ein Array von Strings. Diese sollen in einem gültigen
   Namen nicht vorkommen, sind also eine Art "bad words".
2. Ändern Sie die Validierungsmethode so ab, dass die Validierung fehlschlägt, wenn mindestens
   ein "bad word" im Namen gefunden wurde (z.B. "Muster" oder "Beispiel"). Tipp: Eine String-Instanz
   hat Methoden, um auf enthaltene Zeichenketten zu prüfen.
3. Machen Sie eine oder mehrere der Übungen aus dem Abschnitt "ZUSATZÜBUNGEN ARRAYS" weiter unten

## 11) ArrayList & Komposition

1. Es sollen alle Transaktionen in einem Konto memoriert werden.
   Benutzen Sie dafür eine `ArrayList` namens `transaktionen`, in der die erfolgreich
   durchgeführten Transaktionen gespeichert werden.
2. Eine Methode `Konto.getTransaktionen()` soll alle Vorgänge ausgeben.
3. Ist diese Liste an Transaktionen sicher bzgl. weiterer Manipulationen von außerhalb?

## 12) Aggregation

1. Erstellen Sie eine Klasse `Kunde`. Dieser hat einen Namen. 
2. Ersetzen Sie das Attribut `String besitzer` im Konto durch eine Referenz auf den Kunden,
denn ein Konto soll seinen Kunden kennen.

# ZUSATZÜBUNGEN ARRAYS

## Durchschnitt ohne Extremwerte

Berechnen Sie den Durchschnitt aller Werte in einem unsortierten Array ohne den
größten und kleinsten Wert zu beachten.

Bsp:
- `centeredAvg( [1, 2, 3, 7, 100] ) == 4`
- `centeredAvg( [99, 98, 2, 2] ) == 50`

## Anzahl Klumpen

Berechnen Sie die Anzahl der Vorkommen von mindestens zwei gleichen
Elementen hintereinander ("Klumpen").

Bsp: `countClumps( [1, 2, 2, 3, 4, 4] ) == 2`

## Balancierbar

Gibt es eine Stelle in einem Array, der beide Teile in Balance hält?
Berechnen Sie, ob es in einem Array eine Position/Index gibt, der das Array so in zwei Teile
teilt, dass die Summe der Werte beider Teile gleich ist.

Bsp:

- `canBalance( [1, 1, 1, 2, 1] ) == true`
- `canBalance( [2, 1, 2] ) == false`
- `canBalance( [5, 5] ) == true`