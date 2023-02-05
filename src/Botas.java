public class Botas extends Armadura {
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
