public class Scizor extends Pokemon implements MovimientosPlanta {

    public Scizor(String tipo, int id_pokedex, String nombre) {
        super(tipo, id_pokedex, nombre);
    }

    @Override
    public void ataqueAranyazo() {
        super.ataqueAranyazo(); 
    }

    @Override
    public void hojaAguda() {
        System.out.println(nombre+" ha atacado con Hoja Aguda");

    }

    @Override
    public void latigoCepa() {
        System.out.println(nombre+"ha atacado con Hoja Aguda");
    }

}
