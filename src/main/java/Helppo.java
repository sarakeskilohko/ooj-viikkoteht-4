/* tehtävänanto:
     Saat lisätä toteutukseen x()- ja y()-metodeihin pelkästään
     lauseita (statement, päättyy puolipisteeseen), jotka kutsuvat
     muita tässä esimerkissä esiteltyjä metodeita (jokin a(), x() tai y()).
     Esimerkiksi uusia olioita ei saa luoda eikä System.out.print-rutiinia kutsua
     suoraan. Miten ratkaisisit tehtävän vai onko ratkaisu edes mahdollinen Javassa?

     */
public class Helppo {
        public static void main(String[] args) {
            E e = new E();
            e.x();
        }
    }


/*on mahdollista, käytimme "super" käskyä luokkien välillä*/



