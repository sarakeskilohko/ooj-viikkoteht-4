import java.util.Random;

public class teht3 {
    //*
    // toteuta Henkilöstä kolme variaatiota,
    // a) yksi luokan oletushajautuksella,
    // b) yksi itse keksimälläsi hajautusarvon laskennalla ja
    // c) kolmas käyttämällä Objects.hash-metodia.
    // Laadi 500 eri satunnaista henkilö ja demonstroi 20-paikkaista taulua näyttäen,
    // miten oliot hajautuvat tauluun hajautusarvollaan (modulo (%) taulukon koko).
    // Käytännössä jokainen generoitu olio siis kasvattaa paikkansa laskuria.
    // Mikä hajautus näistä on mielestäsi teoriassa paras, entä käytännössä?


    public void taulukko() {
        int x = 20;
        int[] taulu = new int[x];
        for (int i = 0; i < x; i++) System.out.print(taulu[i] + " ");
        System.out.println();
    }

    public static String merkkijono() {
        int x = 50;
        byte[] array = new byte[x];
        new java.util.Random().nextBytes(array);
        for (int i = 0; i < x; i++) {
            array[i] &= 127;
            array[i] %= 94;
            array[i] += 32;
        }
        String foo = new String(array, java.nio.charset.Charset.forName("UTF-8"));
        return foo;
    }

    public static void main(String[] args){
        Random random = new Random();
        for(int i = 0; i < 500; i++){
            String nimi = merkkijono();
            int ikä = random.nextInt(100);
            new Henkilö(nimi, ikä);

        }
    }
}
