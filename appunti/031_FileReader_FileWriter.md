FileReader e FileWriter estendono, rispettivamente, InputStreamReader
e OutputStreamWriter. Sussiste un'estrema somiglianza tra FileReader
e FileInputStream, e tra FileWriter e FileOutputStream.
FileReader definisce i costruttori:
FileReader(File f)
FileReader(String pathname)
FileWriter, invece, ha:
FileWriter(File f)
FileWriter(File f, boolean append)
FileWriter(String pathname)
FileWriter(String pathname, boolean append)
Nota: i surrogati di Reader e Writer sono consigliati quando si ha a
che fare con del testo, mentre gli stream di tipo classico gestiscono
meglio le informazioni binarie.