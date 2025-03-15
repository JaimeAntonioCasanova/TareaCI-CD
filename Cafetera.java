public class Cafetera {
    private int cantidadCafe;

    public Cafetera(int cantidadCafe) {
        this.cantidadCafe = cantidadCafe;
    }

    public void setCantidadDeCafe(int cantidadCafe) {
        this.cantidadCafe = cantidadCafe;
    }

    public int getCantidadCafe() {
        return cantidadCafe;
    }

    public boolean hasCafe(int cantidadCafe) {
        return this.cantidadCafe >= cantidadCafe;
    }

    public void giveCafe(int cantidadCafe) {
        if (hasCafe(cantidadCafe)) {
            this.cantidadCafe -= cantidadCafe;
        }
    }
}
