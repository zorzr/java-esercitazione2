# java-esercitazione2
Esercitazione 2 - Ereditarietà, Polimorfismo e Interfacce

1. Ereditarietà

Definire la classe astratta Forma, con:

	attributo Colore e relativo getter

	costruttore

	metodi (astratti?) per area e perimetro


Definire le classi che estendono Forma (Cerchio, Quadrato, Rettangolo):

	definire relativi attributi

	implementare metodi (astratti?)



2. Polimorfismo

Gestione di immagini vettoriali a colori:

	Ogni immagine è costituita da un insieme di oggetti grafici (cerchi, rettangoli, quadrati, ecc.) di cui è possibile calcolare area e perimetro, caratterizzati da un colore:

	Definire la classe lmgVect, con relativi attributi

	Numero massimo di forme per immagine

	Contatore incrementale dell’ultima forma inserita

	Costruttore

	Possibilità di aggiungere una nuova forma

	Di ogni immagine si deve poter calcolare l'area di tutti i suoi componenti e di quelli di uno specifico colore.


3. Tester

Il programma deve creare una immagine vettoriale e aggiungervi oggetti grafici:

	Stampare l'elenco dei componenti (con relative informazioni)

	Stampare la somma delle aree degli oggetti per colore

	
4. Interfacce

Leggere la documentazione del metodo public static void sort il quale vuole come attributo un Array di Object. Capire come:

	Implementare l’interfaccia Comparable nella classe Forma e definire il metodo compareTo() secondo l'area di una Forma.

	Ordinare per area totale degli oggetti grafici crescente e stamparne il contenuto (NEL TESTER).