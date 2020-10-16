import java.util.*;
public class teht1 {

    /* Tehtävänanto:
    a) Määritä olio-ohjelmoinnilla kylttityypit niin, että merkkijonosta m
    voidaan suoraviivaisesti rakentaa mikä tahansa em. kolmesta kylttityypistä.
    Kylttien parametreja ei tarvitse pystyä muuttamaan kuten viime kerralla,
    mutta huomioi suunnittelussa, että tätä voidaan haluta myöhemmin.

    b) Kyltit tulee voida tallentaa taulukkoon ja taulukossa olevat kyltit pitää
    voida tulostaa peräjälkeen tietämättä etukäteen kunkin kyltin tarkkaa
    tyyppiä ja piirtotapaa. Toteuta esimerkkimetodi luoKyltit, joka luo yhden
    kutakin kylttityyppiä, lisää nämä kolme kylttiä taulukkoon ja palauttaa ko. taulukon.
    Tämän jälkeen, toteuta toinen metodi tulostaKyltit, joka ottaa syötteenä kylttitaulukon
    ja tulostaa kunkin kyltin peräjälkeen. Metodi tulostaKyltit saa olla pituudeltaan
    maksimissaan kaksi riviä {}-merkkien välisenä koodina ja rivipituus
    alle 60 merkkiä (älä siis käytä "instanceof-menetelmää" - instanceof keskittää
    toiminnallisuuden "väärälle" puolelle ohjelmaa laajennettavuuden kannalta).

       */

    //* Tämän viikon lisäykset kylttitehtävään:

    //* Yksinkertaistettu kyltti:

    void tulosta2(final String t) {
        System.out.println("--{ " + t + " }--");
    }

    //* peruskyltti, joka on muuten samanlainen kuin viime kerran kustomoitava
    // kolmen parametrin (leveys, korkeus ja täyte) määrittämä kyltti, mutta
    // parametreille on vakioitu kiinteät arvot:
    // leveys = 40, korkeus = 5 ja täyte = Asteriski.






        //* viimeviikon kylttitehtävä:

        public static void main(String[] args) {

            Kyltti kyltti1 = new Kyltti(0, 0, "", "");
            Kyltti kyltti2 = new Kyltti(0, 0, "", "");
            Kyltti kyltti3 = new Kyltti(0, 0, "", "");
            luokyltti(kyltti1);
            tulosta(kyltti1);
            kylttimuutos(kyltti1);

            System.out.println("Haluatko luoda toisen kyltin? (vastaa 'kyllä' tai 'ei')");
            Scanner scanner = new Scanner(System.in);
            String vastaus1 = scanner.nextLine();
            if (vastaus1.equals("ei")) {
                System.out.println("Tämä oli kylttisi:");
                tulosta(kyltti1);
                System.exit(0);
            } else {
                luokyltti(kyltti2);
                tulosta(kyltti2);
                kylttimuutos(kyltti2);
            }

            System.out.println("Haluatko luoda kolmannen kyltin? (vastaa 'kyllä' tai 'ei')");
            Scanner scanneri = new Scanner(System.in);
            String vastaus2 = scanneri.nextLine();
            if (vastaus2.equals("ei")) {
                System.out.println("Kylttisi olivat nämä:");
                tulosta(kyltti1);
                tulosta(kyltti2);
                System.exit(0);
            } else {
                luokyltti(kyltti3);
                tulosta(kyltti3);
                kylttimuutos(kyltti3);
            }

            System.out.println("Haluatko vielä muokata jotain kylttiä? Kirjoita kyltin numero (1,2,3) tai 'ei'");
            tulosta(kyltti1);
            System.out.println();
            tulosta(kyltti2);
            System.out.println();
            tulosta(kyltti3);
            Scanner skanner = new Scanner(System.in);
            String vastaus3 = skanner.nextLine();

            switch (vastaus3) {
                case "1":
                    kylttimuutos(kyltti1);
                    System.out.println("Kylttisi olivat:");
                    tulosta(kyltti1);
                    System.out.println();
                    tulosta(kyltti2);
                    System.out.println();
                    tulosta(kyltti3);
                    System.exit(0);

                case "2":
                    kylttimuutos(kyltti2);
                    System.out.println("Kylttisi olivat:");
                    tulosta(kyltti1);
                    System.out.println();
                    tulosta(kyltti2);
                    System.out.println();
                    tulosta(kyltti3);
                    System.exit(0);

                case "3":
                    kylttimuutos(kyltti3);
                    System.out.println("Kylttisi olivat:");
                    tulosta(kyltti1);
                    System.out.println();
                    tulosta(kyltti2);
                    System.out.println();
                    tulosta(kyltti3);
                    System.exit(0);

                default:
                    System.out.println("Kylttisi olivat:");
                    tulosta(kyltti1);
                    System.out.println();
                    tulosta(kyltti2);
                    System.out.println();
                    tulosta(kyltti3);
                    System.exit(0);

            }

        }

        public static Kyltti luokyltti(Kyltti kyltti) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Anna leveys välillä 8-40");
            int leveys = scanner.nextInt();
            System.out.println("Anna korkeus välillä 3-6");
            int korkeus = scanner.nextInt();
            System.out.println("Anna kyltin teksti");
            scanner.nextLine();
            String teksti = scanner.nextLine();
            System.out.println("Valitse täyte (*, # tai -)");
            String täyte = scanner.nextLine();

            kyltti.asetaTäyte(täyte);
            kyltti.asetaKorkeus(korkeus);
            kyltti.asetaLeveys(leveys);
            kyltti.asetaTeksti(teksti);

            return kyltti;
        }


        public static void kylttimuutos(Kyltti kyltti) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Haluatko muuttaa täytettä? Kirjoita *, # , - , tai 'ei' jos haluat lopettaa.");

            String uusitäyte = scanner.nextLine();
            if (uusitäyte.equals("ei")) {
                System.exit(0);
            } else {
                kyltti.asetaTäyte(uusitäyte);
                tulosta(kyltti);
            }

            System.out.println("Haluatko muuttaa leveyttä? Kirjoita uusi leveys välillä 8-40, tai '0' jos haluat lopettaa");

            int uusileveys = scanner.nextInt();
            if (uusileveys == 0) {
                System.exit(0);
            } else {
                kyltti.asetaLeveys(uusileveys);
                tulosta(kyltti);
            }

            System.out.println("Haluatko muuttaa korkeutta? Kirjoita uusi korkeus välillä 3-6, tai '0' jos haluat lopettaa");

            int uusikorkeus = scanner.nextInt();
            if (uusikorkeus == 0) {
                System.exit(0);
            } else {
                kyltti.asetaKorkeus(uusikorkeus);
                tulosta(kyltti);
            }

            System.out.println("Haluatko muuttaa vielä kerran täytettä? Kirjoita uusi täyte (*, # tai -) tai 'ei' jos lopetat");
            scanner.nextLine();
            String uusiuusitäyte = scanner.nextLine();
            if (uusiuusitäyte.equals("ei")) {
                System.exit(0);
            } else {
                kyltti.asetaTäyte(uusiuusitäyte);
                tulosta(kyltti);
            }
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
