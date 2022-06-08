/**
 * Representa la creacion de un molde vehiculo moto con la posibilidad de
 * heredar desde una nueva clase los atribustos para crear un nuevo modelo de
 * esta.
 */

public class Motorcycle {
     public double weight;
     public String displacement;
     public String model;
     private boolean powerOn = false;

     public Motorcycle(String model) {
          this.weight = 180;
          this.displacement = "250 km";
          this.model = model;
     }

     public double showWeight() {
          return this.weight;
     }

     /** este metodo sirve para encender el vehiculo moto */
     public void powerOn() {
          this.powerOn = true;
          System.out.println("La Motocicleta esta encendida");

     }

     /** este metodo sirve para apagar el vehiculo moto */
     public void powerOf() {
          this.powerOn = false;
          System.out.println("La Motocicleta esta apagada");

     }

     /** este metodo me muestra el estado del vehiculo moto */
     public void status() {
          if (this.powerOn == true)
               System.out.println("La Motocicleta esta encendida");
          else
               System.out.println("La Motocicleta esta apagada");

     }

}

/**
 * clase creada para heredad de la clase madre los atributos y asi mostrar un
 * nuevo modelo
 */

class MotorcycleKTM extends Motorcycle {

     public MotorcycleKTM(String model) {
          super(model);
          // TODO Auto-generated constructor stub

          this.model = "KTM";

     }

     public void turbo() {
          System.out.println("Aceleracion al maximo ");
     }

}
