/** crea una instancia de la clase carro */

public class Car {
     private String brand;
     private String model;
     public String color;
     protected String numberSerial;

     public Car() {
          brand = "";
          model = "";
     }

     /** constructor */
     public Car(String brand, String model, String color, String numberSerial) {
          this.brand = brand;
          this.model = model;
          this.color = color;
          this.numberSerial = numberSerial;
     }

     /** metodos Getter y Setter */

     public String getBrand() {
          return brand;
     }

     public void setBrand(String brand) {
          this.brand = brand;
     }

     public String getModel() {
          return model;
     }

     public void setModel(String model) {
          this.model = model;
     }

     public String getColor() {
          return color;
     }

     public void setColor(String color) {
          this.color = color;
     }

     public String getNumberSerial() {
          return numberSerial;
     }

     public void setNumberSerial(String numberSerial) {
          this.numberSerial = numberSerial;
     }

}
