public class Gastly extends Pokemon implements MovimientoFantasma {

    public Gastly(String Tipo, int ID, String Nombre) {
        super(Tipo, ID, Nombre);
    }

    @Override
    public void ataquePlacaje() {
        System.out.println(this.nombre+" no tiene acceso a placaje");
    }

    
    public void lenguetazo() {
        System.out.println(this.nombre+" ha utilizado lenguetazo");
    }
}