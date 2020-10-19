abstract class C extends B {
    private void a() {
        System.out.print(" kun");
    }
    void x() {super.x(); a(); super.y();
    }
    void y() { }
}