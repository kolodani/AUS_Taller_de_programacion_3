class Useful {
    public void f() {}
    public void g() {}
}

class MoreUseful extends Useful {
    public void f() {}
    public void g() {}
    public void u() {}
    public void v() {}
    public void w() {}
}

public class RTTI {
    public static void main(String[] args) {
        Useful[] x = {
            new Useful(),
            new MoreUseful()
        };
        x[0].f();
        x[1].g();
        // Tiempo de compilacion: metodo no encontrado en Useful:
        //! x[1].u();
        ((MoreUseful)x[1]).u(); // Especializacion/RTTI
        ((MoreUseful)x[0]).u(); // Excepcion generada
    }
}
