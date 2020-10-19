abstract class B extends D {
    private void a() {
        System.out.print("poa");
    }
    void x() {super.x();
    a();
    super.y();}
    void y() { a();}
}