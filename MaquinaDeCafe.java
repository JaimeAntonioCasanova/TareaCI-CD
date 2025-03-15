public class MaquinaDeCafe {
    private Cafetera cafetera;
    private Vaso vasosPequeno;
    private Vaso vasosMediano;
    private Vaso vasosGrande;
    private Azucarero azucarero;

    public void setCafetera(Cafetera cafetera) {
        this.cafetera = cafetera;
    }

    public Cafetera getCafetera() {
        return cafetera;
    }

    public void setVasosPequenos(Vaso vasosPequeno) {
        this.vasosPequeno = vasosPequeno;
    }

    public Vaso getVasosPequeno() {
        return vasosPequeno;
    }

    public void setVasosMediano(Vaso vasosMediano) {
        this.vasosMediano = vasosMediano;
    }

    public Vaso getVasosMediano() {
        return vasosMediano;
    }

    public void setVasosGrande(Vaso vasosGrande) {
        this.vasosGrande = vasosGrande;
    }

    public Vaso getVasosGrande() {
        return vasosGrande;
    }

    public void setAzucarero(Azucarero azucarero) {
        this.azucarero = azucarero;
    }

    public Azucarero getAzucarero() {
        return azucarero;
    }

    public Vaso getTipoDeVaso(String tipoDeVaso) {
        switch (tipoDeVaso.toLowerCase()) {
            case "pequeno":
                return vasosPequeno;
            case "mediano":
                return vasosMediano;
            case "grande":
                return vasosGrande;
            default:
                return null;
        }
    }

    public String getVasoDeCafe(Vaso vaso, int cantidadDeVasos, int cantidadDeAzucar) {
        if (!vaso.hasVasos(cantidadDeVasos)) {
            return "No hay Vasos";
        }
        if (!cafetera.hasCafe(vaso.getContenido() * cantidadDeVasos)) {
            return "No hay Cafe";
        }
        if (!azucarero.hasAzucar(cantidadDeAzucar * cantidadDeVasos)) {
            return "No hay Azucar";
        }

        vaso.giveVasos(cantidadDeVasos);
        cafetera.giveCafe(vaso.getContenido() * cantidadDeVasos);
        azucarero.giveAzucar(cantidadDeAzucar * cantidadDeVasos);

        return "Felicitaciones";
    }
}
