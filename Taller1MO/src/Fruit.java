
import java.util.ArrayList;

/** Crea una instancia de la clase fruta */

public class Fruit {
     private int id;
     public String name;
     public String color;
     private float averageWeight;
     public boolean imported;

     /** metodo constructor para crear el objeto del atributo lista color */
     public Fruit(String color) {
          this.color = color;
     }

     /** metodo constructor para crear el objeto */
     public Fruit(int id, String name, String color, float averageWeight, boolean imported) {
          this.id = id;
          this.name = name;
          this.color = color;
          this.averageWeight = averageWeight;
          this.imported = imported;
     }

     public float getAverageWeight() {
          return averageWeight;
     }

     public void setAverageWeight(float averageWeight) {
          this.averageWeight = averageWeight;
     }

     public String getColor() {
          return color;
     }

     public void setColor(String color) {
          this.color = color;
     }

}
