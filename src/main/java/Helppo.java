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





/*abstract class A {
  private void a() {
    System.out.print("help");
  }
  void x() { }
  void y() { }
}
abstract class B extends D {
  private void a() {
    System.out.print("poa");
  }
  void x() { }
  void y() { }
}
abstract class C extends B {
  private void a() {
    System.out.print(" kun");
  }
  void x() { }
  void y() { }
}
abstract class D extends A {
  private void a() {
    System.out.print(" sen");
  }
  void x() { }
  void y() { }
}
final class E extends C {
  private void a() {
    System.out.print(" osaa");
  }
  void x() { }
  void y() { }
}

public class Helppo {
  public static void main(String[] args) {
	  E e = new E();
	  e.x();
  }
}

 */
