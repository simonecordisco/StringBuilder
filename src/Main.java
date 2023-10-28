public class Main {
    public static void uniCode(String stringa,int posizione) {
        int toUnicode=stringa.codePointAt(posizione);

        StringBuilder risultato = new StringBuilder("la posizione è ");
        risultato.append(toUnicode);
        System.out.println(risultato);

    }
    public static void main (String[] args){uniCode("StringBuilder", 5);}
}