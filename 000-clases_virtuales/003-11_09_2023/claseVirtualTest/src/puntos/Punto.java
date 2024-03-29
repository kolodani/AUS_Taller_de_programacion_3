package puntos;

public class Punto {

    private int x;
    private int y;

    public Punto() {
        // Constructor por defecto, x e y se inicializan en 0 por eso no hace falta
        // hacerlo
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(Punto p2) {
        return Math.sqrt(Math.pow(x - p2.x, 2) + Math.pow(y - p2.y, 2));
    }

}
