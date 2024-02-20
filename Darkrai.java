public class Darkrai extends Pokemon implements  MovimientosOscuro{
    public Darkrai(String tipo,int id_pokedex,String nombre){
        super(tipo, id_pokedex, nombre);
        }
    
        @Override
        public void BolaSombra(){
            System.out.println("Darkrai usó Bola Sombra, (pum pum mataooo)");
        }
    
        @Override
        public void ataquePlacaje(){
            System.out.println(this.nombre+" ataca con Placaje ");
        }
    
        @Override
        public void PulsoUmbrio(){
            System.out.println(this.nombre+ " ha usado Pulso umbrío (esta no la cuentas)");
        }
}
