public class Espada extends Arma {
    public Espada(int nivel_rareza, int nivel, String nombre, double damage, double multiplicador, double distancia, double tiempo_para_damage) {
        super(nivel_rareza, nivel, nombre, damage, multiplicador, distancia, tiempo_para_damage);
    }
    @Override
    public double doing_damage(double distancia_enemigo){
        if(distancia_enemigo<=this.getDistancia()){
            return this.getMultiplicador() * this.getDamage() * (this.getDistancia() - distancia_enemigo);
        }
        return 0.0;
    }
}
