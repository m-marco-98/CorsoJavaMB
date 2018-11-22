Un dizionario � una raccolta di coppie chiave-valore. La classe astratta
Dictionary definisce l'uso dei dizionari nel pacchetto java.util.
I dizionari hanno diversi tipi di implementazioni (Hashtable,
Properties, ...).
Metodi:
Enumeration elements()			Restituisce l'enumerazione dei
					valori presenti nel dizionario.
Object get(Object key)			Restituisce il valore
					dell'elemento con chiave key,
					o null se tale elemento non fa
					parte dell'insieme.
boolean isEmpty				Restituisce true se l'insieme
					� vuoto.
Enumeration keys()			Restituisce l'enumerazione delle
					chiavi presenti nel dizionario.
Object put(Object key, Object value)	Nel caso non esista un elemento
					con chiave key, lo crea con
					valore value. In caso contrario,
					ne aggiorna semplicemente il
					valore. In caso di
					aggiornamento, il vecchio valore
					viene restituito, altrimenti
					sar� ritornato null.
Object remove(Object key)		Rimuove dall'insieme l'elemento
					con chiave key. Se l'elemento
					non esiste, restituisce null,
					altrimenti ritorna il suo
					valore.
int size()				Restituisce il numero degli
					elementi presenti nell'insieme.
Properties deriva da Hashtable e definisce nuovi metodi:
String getProperty(String key)		Restituisce il valore dalla
					propriet� chiamata key, o null
					se tale propriet� non esiste.
String getProperty(String key,		Restituisce il valore dalla
String defaultValue)			propriet� chiamata key, o
					defaultValue se tale propriet�
					non esiste.
list(java.io.PrintStream out)		Elenca tutte le propriet� nel
					canale out.
load(java.io.InputStream in)		Carica dal canale di input in
					un insieme di propriet�
					precedentemente salvato.
Enumerations propertyNames()		Restituisce l'enumerazione dei
					nomi di ogni propriet�
					conservata nell'insieme.
Object setProperty(String key,		Nel caso non esista una
String value)				propriet� chiamata key, la
					crea con valore value. In caso
					contrario, ne aggiorna
					semplicemente il valore. In
					caso di aggiornamento, il 
					vecchio valore viene
					restituito, altrimenti sar�
					ritornato null.
void store(java.io.OutputStream out,	Salva tutte le propriet� nel
String header)				canale out, facendole
					precedere dall'intestazione
					header.