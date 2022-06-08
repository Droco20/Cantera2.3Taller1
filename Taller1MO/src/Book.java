/**
 * crea una instancia de la clase Book la cual me muetra el libro que tiene mas
 * paginas
 */

public class Book {

     /** Atributos de la clase */

     private int Code;
     private String title;
     private String author;
     private int numPages;

     public Book(int pCode, String pTitle, String pAuthor, int pNumpages) {

          /** Constructores */

          Code = pCode;
          title = pTitle;
          author = pAuthor;

     }

     /** Metodos */
     public int getCode() {
          return Code;
     }

     public void setCode(int code) {
          Code = code;
     }

     public String getTitle() {
          return title;
     }

     public void setTitle(String title) {
          this.title = title;
     }

     public String getAuthor() {
          return author;
     }

     public void setAuthor(String author) {
          this.author = author;
     }

     public int getNumPages() {
          return numPages;
     }

     public void setNumPages(int numPages) {
          this.numPages = numPages;
     }

     public String toString() {
          return "El libro" + title + " con Codigo" + Code + "creado por el autor" + author + "tien" + numPages
                    + "paginas";

     }

}
