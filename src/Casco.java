public class Casco extends Armadura {

    public String accion_especial(boolean proyectil) {
        if (proyectil == true) {
            System.out.println("hola");
            return "estás protegido";
        }

        return "has muerto";
    }
}
