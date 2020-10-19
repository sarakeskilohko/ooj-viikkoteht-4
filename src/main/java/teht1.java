import java.lang.reflect.Array;
import java.util.*;
public class teht1 {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> kyltit = new ArrayList<String>();
    static Kyltti esimerkki = new Kyltti(30, 5, "Esimerkki", "#");


    /* b) Kyltit tulee voida tallentaa taulukkoon ja taulukossa olevat kyltit pitää
    voida tulostaa peräjälkeen tietämättä etukäteen kunkin kyltin tarkkaa
    tyyppiä ja piirtotapaa. Toteuta esimerkkimetodi luoKyltit, joka luo yhden
    kutakin kylttityyppiä, lisää nämä kolme kylttiä taulukkoon ja palauttaa ko. taulukon.
    Tämän jälkeen, toteuta toinen metodi tulostaKyltit, joka ottaa syötteenä kylttitaulukon
    ja tulostaa kunkin kyltin peräjälkeen. Metodi tulostaKyltit saa olla pituudeltaan
    maksimissaan kaksi riviä {}-merkkien välisenä koodina ja rivipituus
    alle 60 merkkiä (älä siis käytä "instanceof-menetelmää" - instanceof keskittää
    toiminnallisuuden "väärälle" puolelle ohjelmaa laajennettavuuden kannalta).

       */

    //* moi :)
    //* moi 2

    //* Tämän viikon lisäykset kylttitehtävään:

    //* Yksinkertaistettu kyltti:
    public static void yksinkertainenKyltti(final String teksti){
            System.out.println("--{ " + teksti + " }--");

    }
    //* Peruskyltti:
    public static void peruskyltti(final String teksti) {
        Kyltti kylttiperus = new Kyltti(40, 5, "" , "*");
        kylttiperus.asetaTeksti(teksti);
        tulosta(kylttiperus);

    }


        public static void main(String[] args) {
            System.out.println("Luodaan kyltti");
            kysykyltti();

            System.out.println("Haluatko luoda toisen kyltin? (vastaa 'kyllä' tai 'ei')");;
            String vastaus1 = scanner.nextLine();
            if (vastaus1.equals("ei")) {
                System.exit(0);
            } else {
                kysykyltti();
            }

            System.out.println("Haluatko luoda kolmannen kyltin? (vastaa 'kyllä' tai 'ei')");
            String vastaus2 = scanner.nextLine();
            if (vastaus2.equals("ei")) {
                System.exit(0);
            } else {
                kysykyltti();
            }

            System.out.println("Luodaan esimerkkikyltit");
            luoKyltit();
            System.out.println("Kyltit tallennettiin taulukkoon.");
            System.out.println("Haetaan kyltit taulukosta.");
            System.out.println("Esimerkkikyltit olivat:");
            tulostaKyltit();

        }

    public static void kysykyltti() {
        System.out.println("Minkä tekstin haluat kylttiin?");
        String kylttiteksti = scanner.nextLine();
        System.out.println("Minkälaisen kyltin haluat luoda? (perus, yksinkertainen, kustomoitava)");
        String tyyppi = scanner.nextLine();
        tyyppi.toLowerCase();
        if (tyyppi.equals("perus")) {
            peruskyltti(kylttiteksti);
        } else if (tyyppi.equals("yksinkertainen")) {
            yksinkertainenKyltti(kylttiteksti);
        } else if (tyyppi.equals("kustomoitava")) {
            Kyltti kyltti1 = new Kyltti(0, 0, kylttiteksti, "");
            luokyltti(kyltti1);
            tulosta(kyltti1);
        } else {
            System.out.println("Anna oikea kylttityyppi.");
            kysykyltti();
        }
    }

        public static Kyltti luokyltti(Kyltti kyltti) {

            System.out.println("Anna leveys välillä 8-40");
            int leveys = scanner.nextInt();
            System.out.println("Anna korkeus välillä 3-6");
            int korkeus = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Valitse täyte (*, # tai -)");
            String täyte = scanner.nextLine();

            kyltti.asetaTäyte(täyte);
            kyltti.asetaKorkeus(korkeus);
            kyltti.asetaLeveys(leveys);


            return kyltti;
        }

        //esimerkki metodit
        public static ArrayList<String> luoKyltit(){

        yksinkertainenKyltti("Esimerkki");
        asetaTaulukkoon(yksinkertaisetarvot("Esimerkki"));
        peruskyltti("Esimerkki");
        Kyltti perusesimerkkikyltti = new Kyltti(40,5,"Esimerkki","*");
        asetaTaulukkoon(arvot(perusesimerkkikyltti));
        asetaTaulukkoon(arvot(esimerkki));
        tulosta(esimerkki);
        return kyltit;
        }

        public  static void tulostaKyltit(){
            kylttiTulostus();
        }

        public static String[] pilko1(ArrayList<String> kyltit){
        String kylt1 = kyltit.get(0);
        String[] k1 = kylt1.split(" ");
        return k1;

        }

    public static String[] pilko2(ArrayList<String> kyltit){
        String kylt2 = kyltit.get(1);
        String[] k2 = kylt2.split(" ");
        return k2;

    }

    public static String[] pilko3(ArrayList<String> kyltit) {
        String kylt3 = kyltit.get(2);
        String[] k3 = kylt3.split(" ");
        return k3;

    }

    public static void kylttiTulostus(){
        String [] kk1 = pilko1(kyltit);
        String [] kk2 = pilko2(kyltit);
        String [] kk3 = pilko3(kyltit);
        Kyltti esimerkki1 = new Kyltti(0, 0, "", "");
        Kyltti esimerkki2 = new Kyltti(0, 0, "", "");

        if(((String) Array.get(kk1, 0)).equals("0")){
            String tekst = (String)Array.get(kk1, 2);
            System.out.println("--{ " + tekst + " }--");
            int välileveys = Integer.parseInt((String)Array.get(kk2, 0));
            esimerkki1.asetaLeveys(välileveys);
            int välikorkeus = Integer.parseInt((String)Array.get(kk2, 1));
            esimerkki1.asetaKorkeus(välikorkeus);
            esimerkki1.asetaTeksti((String)Array.get(kk2, 2));
            esimerkki1.asetaTäyte((String)Array.get(kk2, 3));
            int välileveys1 = Integer.parseInt((String)Array.get(kk3, 0));
            esimerkki2.asetaLeveys(välileveys1);
            int välikorkeus1 = Integer.parseInt((String)Array.get(kk3, 1));
            esimerkki2.asetaKorkeus(välikorkeus1);
            esimerkki2.asetaTeksti((String)Array.get(kk3, 2));
            esimerkki2.asetaTäyte((String)Array.get(kk3, 3));
            tulosta(esimerkki1);
            tulosta(esimerkki2);
        }else if(((String) Array.get(kk2, 0)).equals("0")){
            String tekst = (String)Array.get(kk2, 2);
            System.out.println("--{ " + tekst + " }--");
            int välileveys = Integer.parseInt((String)Array.get(kk1, 0));
            esimerkki1.asetaLeveys(välileveys);
            int välikorkeus = Integer.parseInt((String)Array.get(kk1, 1));
            esimerkki1.asetaKorkeus(välikorkeus);
            esimerkki1.asetaTeksti((String)Array.get(kk1, 2));
            esimerkki1.asetaTäyte((String)Array.get(kk1, 3));
            int välileveys1 = Integer.parseInt((String)Array.get(kk3, 0));
            esimerkki2.asetaLeveys(välileveys1);
            int välikorkeus1 = Integer.parseInt((String)Array.get(kk3, 1));
            esimerkki2.asetaKorkeus(välikorkeus1);
            esimerkki2.asetaTeksti((String)Array.get(kk3, 2));
            esimerkki2.asetaTäyte((String)Array.get(kk3, 3));
            tulosta(esimerkki1);
            tulosta(esimerkki2);
    }else {
            String tekst = (String)Array.get(kk3, 2);
            System.out.println("--{ " + tekst + " }--");
            int välileveys = Integer.parseInt((String)Array.get(kk2, 0));
            esimerkki1.asetaLeveys(välileveys);
            int välikorkeus = Integer.parseInt((String)Array.get(kk2, 1));
            esimerkki1.asetaKorkeus(välikorkeus);
            esimerkki1.asetaTeksti((String)Array.get(kk2, 2));
            esimerkki1.asetaTäyte((String)Array.get(kk2, 3));
            int välileveys1 = Integer.parseInt((String)Array.get(kk1, 0));
            esimerkki2.asetaLeveys(välileveys1);
            int välikorkeus1 = Integer.parseInt((String)Array.get(kk1, 1));
            esimerkki2.asetaKorkeus(välikorkeus1);
            esimerkki2.asetaTeksti((String)Array.get(kk1, 2));
            esimerkki2.asetaTäyte((String)Array.get(kk1, 3));
            tulosta(esimerkki1);
            tulosta(esimerkki2);
    }
    }

        public static String arvot(Kyltti kyltti){
        String l = Integer.toString(kyltti.annaLeveys());
        String k = Integer.toString(kyltti.annaKorkeus());
        String te = kyltti.annaTeksti();
        String t = kyltti.annaTäyte();
        String arvo = l + " " + k + " " + te + " " + t;
        return arvo;
        }

        public static String yksinkertaisetarvot(String teksti){
        String yksinkertainenarvo = "0 0 " + teksti + " 0";
        return yksinkertainenarvo;
        }

        public static void asetaTaulukkoon(String arvo){
        kyltit.add(arvo);
        }

        public static void tulosta(Kyltti kyltti) {
            final int k2 = (kyltti.annaKorkeus() - 1) / 2;
            final int l2 = (kyltti.annaLeveys() - kyltti.annaTeksti().length() - 2) / 2;
            String r = "";
            //aluksin luodaan "ylärivi"
            for (int i = 0; i < kyltti.annaLeveys(); i++) r += kyltti.annaTäyte();
            //tulostetaan ylärivi(t)
            for (int i = 0; i < k2; i++) System.out.println(r);
            //tulostetaan tekstin vasemmassa reunassa oleva täyte
            for (int i = 0; i < l2; i++) System.out.print(kyltti.annaTäyte());
            //tulostetaan haluttu teksti
            System.out.print(" " + kyltti.annaTeksti() + " ");
            //tulostetaan tekstin oikean puoleinen täyte
            for (int i = 0; i < kyltti.annaLeveys() - l2 - kyltti.annaTeksti().length() - 2; i++)
                System.out.print(kyltti.annaTäyte());
            System.out.println();
            //tulostetaan alarivi(t)
            for (int i = 0; i < kyltti.annaKorkeus() - k2 - 1; i++) System.out.println(r);
        }
    }
