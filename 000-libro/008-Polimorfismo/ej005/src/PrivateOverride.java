// Intento de sustituir un metodo privado.

public class PrivateOverride {
    private void f() {
        System.out.println("private f()");
    }
    public static void main (String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }
}
