package cellularetest;

import java.util.Scanner;

public class CellulareTest {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Scegli l'opzione che vuoi eseguire: ");
        int scelta;
        Cellulare c1 = new Cellulare(5, 0, 0);
        do {
            System.out.println("1) Eseguire Ricarica del Credito");
            System.out.println("2) Imposta Tariffa");
            System.out.println("3) Effettua la chiamata");
            System.out.println("4) Visualizza il credito disponibile");
            System.out.println("5) Visualizza le chiamate effettuate");
            System.out.println("6) Azzera il numero di chiamate");
            System.out.println("7) Spegni il Cellulare");
            scelta = s.nextInt();
            switch (scelta) {
                case 1:
                    System.out.println("Quanto vuoi ricaricare?");
                    int ricarica = s.nextInt();
                    c1.Ricarica(ricarica);
                    break;
                case 2:
                    System.out.println("Inserisci la tariffa da applicare");
                    float tariffa = s.nextFloat();
                    c1.Tariffa(tariffa);
                    break;
                case 3:
                    System.out.println("Inserisci il numero da chiamare");
                    String numero = s.next();
                    System.out.println("Inserisci quanti minuti durerera la chiamata");
                    float minuti = s.nextInt();
                    c1.Chiama(numero, minuti);
                    break;
                case 4:
                    c1.Credito();
                    break;
                case 5:
                    c1.ChiamateEffetuate();
                    break;
                case 6:
                    c1.AzzeraChiamate();
                    break;
            }
        } while (scelta < 7);
        System.out.println("Arrivederci!");

    }
}
