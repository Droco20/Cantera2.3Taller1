
/** Crea una instancia de la clase persona */

public class Person {
     public String name;
     public String lastName1;
     public String lastName2;
     public int dateBirth;
     public double heigth;

     /** constructor de un objeto predeterminado */

     public Person() {
          name = "Lourdes";
          lastName1 = "Zapata";
          lastName2 = "Rojas";
          dateBirth = 1986;
          heigth = 0;

          /** imprime los valores dados por defecto */

          System.out.println(name);
          System.out.println(lastName1);
          System.out.println(lastName2);
          System.out.println(dateBirth);
     }

     /**
      * @return the name
      * 
      */
     public String getName() {
          return name;
     }

     /**
      * @param name the name to set
      * 
      */
     public void setName(String name) {
          this.name = name;
     }

     public String getLastName1() {
          return lastName1;
     }

     public void setLastName1(String lastName1) {
          this.lastName1 = lastName1;
     }

     @Override
     public String toString() {
          return "Person [dateBirth=" + dateBirth + ", heigth=" + heigth + ", lastName1=" + lastName1 + ", lastName2="
                    + lastName2 + ", name=" + name + "]";
     }

}