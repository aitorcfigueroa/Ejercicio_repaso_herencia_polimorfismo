public class Botas extends Armadura {
    public Botas(int nivel_rareza, int nivel, String nombre, double defensa, double multiplicador) {
        super(nivel_rareza, nivel, nombre, defensa, multiplicador);
    }
    public String accion_especial (boolean melee, int distancia) {
        if (melee == true && distancia <= 5) {
            return "ataque corto";
        } else if (melee == false && distancia > 5) {
            return "ataque largo";
        } else if (melee == false && distancia <= 5) {
            return "ataque repelido";
        } else {
            return "ataque fallido";
        }
    }
}
