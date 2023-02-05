public class Espada extends Arma {
    @Override
    public double doing_damage(double distancia_enemigo){
        if(distancia_enemigo<=this.getDistancia()){
            return this.getMultiplicador() * this.getDamage() * (this.getDistancia() - distancia_enemigo);
        }
        return 0.0;
    }
}
