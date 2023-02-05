public class Lanza extends Arma {
    @Override
    public double doing_damage(double distancia_enemigo){
        if(distancia_enemigo <= this.getDistancia() && distancia_enemigo >= (this.getDistancia()/2)) {
            return getMultiplicador() * getDamage();
        }
        return 0.0;
    }
}
