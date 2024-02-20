public abstract class Pokemon {

    public String tipo;
    public int id_pokedex;
    public String nombre;

    public void ataqueAranyazo(){
        System.out.println(this.nombre+" ataca con Arañazo ");
    }
    public void ataquePlacaje(){
        System.out.println(this.nombre+" ataca con Placaje ");
    }

    public Pokemon(String tipo,int id_pokedex,String nombre){
        this.tipo=tipo;
        this.id_pokedex=id_pokedex;
        this.nombre=nombre;
    }


}