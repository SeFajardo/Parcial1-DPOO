package main;
import logic.Automovil;
import logic.Motocicleta;
import logic.Autonomia;

public class Main {
    public static void main(String[] args) {
        Automovil auto = new Automovil();
        auto.setCilindraje(500);
        auto.setPeso(200);
        auto.setTamanoTanque(2);
        System.out.println("La autonomía del carro es: " + auto.autonomia() + " km");

        Motocicleta moto = new Motocicleta();
        moto.setCilindraje(250);
        moto.setPeso(180);
        moto.setTamanoTanque(2.1);

        System.out.println("La autonomía de la moto es: " + moto.autonomia() + " km");
    }
}
