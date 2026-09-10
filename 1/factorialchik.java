public class factorialchik {
    public static void main(String[] args) {
        int chislo = 5;
        int resultat = 1;

        for (int schetchik = 1; schetchik <= chislo; schetchik = schetchik + 1) {
            resultat = resultat * schetchik;
        }

        System.out.println(resultat);
    }
}
