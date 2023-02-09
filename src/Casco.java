public class Casco extends Armadura {

    public Casco(int nivel_rareza, int nivel, String nombre, double defensa, double multiplicador) {
        super(nivel_rareza, nivel, nombre, defensa, multiplicador);
    }
    public String accion_especial(boolean proyectil) {
        if (proyectil == true) {
            return "estás protegido";
        }

        return "has muerto";
    }
}
