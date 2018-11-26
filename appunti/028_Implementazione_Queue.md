# Implementazione di Queue

* L’interfaccia Queue rappresenta un insieme di elementi gestiti mediante FIFO. 
* Questa interfaccia estende Collection definendo nuovi metodi per l’inserimento, la rimozione e l’utilizzo dei dati. 
* Ognuno di questi metodi è presente in due forme:
* la prima lancia un’eccezione se l’operazione fallisce
* la seconda ritorna un valore speciale (come null o false) se l’operazione fallisce


## L’implementazione di Queue è PriorityQueue.

Esempio di Queue.

```java
Queue coda = new PriorityQueue();
for (int i=0; i<50; i++) {
	coda.offer("String #" + i);
}
while (!coda.isEmpty()) {
	System.out.println(coda.poll());
}
```
La PriorityQueue è una coda che estrae gli elementi secondo la priorità assegnata.