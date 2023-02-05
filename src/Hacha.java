public class Hacha extends Arma {
    @Override
    public double doing_damage(double distancia_enemigo){
        if(distancia_enemigo == this.getDistancia()){
            return this.getMultiplicador() * this.getDamage() * 3;
        }
        return 0.0;
    }
}