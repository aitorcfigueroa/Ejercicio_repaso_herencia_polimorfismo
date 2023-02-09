public class Main {

    public static void main(String[] args) {
        Espada espada = new Espada(3,2,"espada",6.0,1.3,4.0,1.3);
        Lanza lanza = new Lanza(3,2,"lanza",4.0,1.5,8.0,1.3);
        Hacha hacha = new Hacha(3,2,"hacha",8.0,1.7,2.0,1.3);
        Casco casco = new Casco(1, 1, "casco", 2.0, 1.5);
        Botas botas = new Botas(1, 1, "botas", 2.0, 1.5);

        Equipo[] equipo = {espada, lanza, hacha, casco, botas};

        for (Equipo item: equipo) {
            if (item instanceof Arma) {
                double daño = ((Arma) item).doing_damage(5.0);
                System.out.println("El arma " + item.getNombre() + " ha hecho " + daño + " puntos de daño.");
            } else if (item instanceof Botas) {
                String respuesta = ((Botas) item).accion_especial(true, 6);
                System.out.println(respuesta);
            } else if (item instanceof Casco) {
                String respuesta = ((Casco) item).accion_especial(true);
                System.out.println(respuesta);
            }
        }
    }
}