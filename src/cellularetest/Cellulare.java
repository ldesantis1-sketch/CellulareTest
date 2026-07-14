package cellularetest;

public class Cellulare {

    private float CreditoDisponibile;
    private int chiamateEffettuate;
    private float tariffa;

    public Cellulare(float cred, int chiaeffe, float tarr) {
        this.CreditoDisponibile = cred;
        this.chiamateEffettuate = chiaeffe;
        this.tariffa = tarr;
    }

    public void Ricarica(int r) {
        CreditoDisponibile += r;
    }

    public void Tariffa(float t) {
        tariffa = t;
    }

    public void Chiama(int telefono, float minuti) {
        float r = minuti * tariffa;
        if (CreditoDisponibile == 0 && tariffa !=0) {
            System.out.println("Il Credito disponibile e' 0, la chiamata non potra essere effettuata");
        } else if (CreditoDisponibile > r) {
            System.out.println("La chiamata puo essere effettuata");
            CreditoDisponibile -= r;
            chiamateEffettuate++;
        } else {
            
            CreditoDisponibile = 0;
            chiamateEffettuate++;
            System.out.println("Il credito disponibile non e' sufficiente per effettuare la chiamata");
        }
    }

    public void Credito() {
        System.out.println("Il credito Disponibile e' " + CreditoDisponibile);
    }
    public void ChiamateEffetuate() {
        System.out.println("Il credito Disponibile e' " + chiamateEffettuate);
    }
    public void AzzeraChiamate() {
        chiamateEffettuate=0;
        System.out.println("Numero chiamate effettuate azzerato con successo" );
    }
    
}
