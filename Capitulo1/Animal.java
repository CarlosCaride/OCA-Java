/**
 * Esto es un comentario para Javadoc (por /**) de la clase animal
 * Es multilinea!! Le pondre quien es el autor!
 * @author Carlos Caride Santeiro
 */
public class Animal {
    // Este es un comentario de una línea
    // Para escribir otra line tengo que poner de nuevo //
    String nombre;
    
    /**
     * El javadoc también se puede usar en métodos
     * @return Aquí describo lo que devuelve el método
     */
    public String getNombre() {
        /* Este es un comentario de multiples lineas
        sigue siendo comentario con el retorno de carro.
        para cerrarlo hay que escribir */
        return nombre;
    }

    /**
     * El javadoc también se puede usar en métodos
     * @param nuevoNombre Aquí describo el parametro
     */
    public void setNombre(String nuevoNombre) {
        // Puedo ponerlo donde quiera
        nombre = nuevoNombre;
        // Incluso aquí
    }
}
// O aquí!!!

//Tiene que ser privada. Si tuviese que ser publica, tendría que estar en Animal2.java
class Animal2 {
    
}



