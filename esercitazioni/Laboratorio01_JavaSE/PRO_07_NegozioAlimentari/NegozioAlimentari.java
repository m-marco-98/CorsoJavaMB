package progetti.negozioAlimentari;

/**
 * Realizzare il sistema software per la gestione di
 un negozio di generi alimentari.
 Il sistema deve gestire:

 1) Gli inventari
 La Classe CassaNegozio contiene tutte le funzionalità.
 E' possibile definire l'inventario (elencando tutti i
 tipi di prodotto) ed aggiungere nuovi prodotti
 attraverso il metodo aggiungiProdotto. Un prodotto è
 caratterizzato da un codice univoco, da una descrizione
 e dal prezzo lordo di vendita. Per esempio:
 Codice	Descrizione	Prezzo
 C00001	Pasta Barilla	0.7
 C00002	Latte TappoRosso	1.65
 C00003	Caffe' Latazza	2.5
 C00004	Caffe' Illy	2.0
 C00005	Biscotti Cioccolato 2.0
 C00006	Vino Rosso	2.0

 2) Gli sconti
 E' possibile stabilire un prezzo promozionale (sconto)
 per un particolare prodotto. Per semplicità si assuma
 che è possibile avere un solo prodotto in promozione
 per volta. Per attivare la promozione si utilizza il
 metodo promozione() che riceve come parametri il codice
 del prodotto da promuovere e un intero che indica la
 percentuale di sconto da applicare (e.g., il numero
 intero 20 indica uno sconto del 20%). Per disabilitare
 la promozione si passa al metodo il codice di un prodotto
 inesistente.

 3) I prodotti venduti
 Ogni volta che viene letto il codice di un prodotto, la
 cassa accede ad un listino di prodotti e recupera il
 prezzo e la descrizione del prodotto. Il metodo leggi(),
 restituisce informazioni sul pezzo acquistato.
 E' possibile, in qualsiasi momento, ottenere l'importo
 totale al lordo delle tasse attraverso il metodo
 totale(). E' inoltre possibile ottenere l'importo totale
 netto e l'ammontare dell'IVA attraverso i metodi netto()
 e tasse(). Il metodo stampa() permette di stampare a
 video l'elenco degli articoli venduti; la lista è
 ordinata lessicograficamente. Il metodo chiude() conclude
 la registrazione dei prodotti venduti.
 */
public class NegozioAlimentari {

    public static void main(String[] args) {

    CassaNegozio cassa1 = new CassaNegozio();

    cassa1.aggiungiProdotto("C00001","Pasta Barilla",	0.7);
    cassa1.aggiungiProdotto("C00002","Latte TappoRosso",	1.65);
    cassa1.aggiungiProdotto("C00003","Caffe' Latazza",	2.5);
    cassa1.aggiungiProdotto("C00004","Caffe' Illy",	2.0);
    cassa1.aggiungiProdotto("C00005","Biscotti Cioccolato", 2.0);
    cassa1.aggiungiProdotto("C00006","Vino Rosso",	2.0);

    cassa1.promozione("C00003", 20);

        try {
            cassa1.leggi("C00001", 5);
            cassa1.leggi("C00002", 5);
            cassa1.leggi("C00003", 5);
            cassa1.leggi("C00004", 5);
            cassa1.leggi("C00005", 5);
            cassa1.leggi("C00006", 5);
            //cassa1.leggi("C0001", 5);
        } catch (ProdottoInesistente e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }

        System.out.println("stampa scontrino");
        cassa1.stampa();
        System.out.println();
        System.out.println(cassa1.netto());
        System.out.println(cassa1.tasse());
        System.out.println(cassa1.totale());

    }



}
