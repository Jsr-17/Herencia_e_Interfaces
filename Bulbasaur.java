public class Bulbasaur extends Pokemon implements MovimientosPlanta,MovimientosNormal{

    public Bulbasaur(String tipo,int id_pokedex,String nombre){
        super(tipo,id_pokedex,nombre);
    }


    @Override
    public void ataqueAranyazo() {
       System.out.println("No tengo acceso a este movimiento");
    }


    @Override
    public void hojaAguda() {
        System.out.println("Bulbasaur usa hoja aguda");
        
    }


    @Override
    public void latigoCepa() {
        System.out.println("Bulbasaur usa latigo cepa");

        
    }



    
}
