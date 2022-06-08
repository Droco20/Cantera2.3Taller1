public class BankAccount {
     public String numAccount;
     public String owner;
     private double balance;

     public BankAccount(String numAccount, String owner, boolean accountOn) {
          this.numAccount = numAccount;
          this.owner = owner;
          this.balance = balance;
          this.accountOn = accountOn;
     }

     protected boolean accountOn = false;

     /** constructor */
     public BankAccount(String numAccount, String owner) {
          this.numAccount = numAccount;
          this.owner = owner;

     }

     /** Metodos Modificadores y de acceso */

     private void accountOn() {
          this.accountOn = true;
          System.out.println("La cuenta esta Activa");

     }

     void accountOf() {
          this.accountOn = false;
          System.out.println("La cuenta esta Inactiva");

     }

     /** Metodo para mostrar el estado de la cuenta */

     public void status() {
          if (this.accountOn == true)
               System.out.println("La Cuenta esta Activa");
          else
               System.out.println("La Cuenta esta Inactiva");

     }

     /** metodos Getter y Setter */

     public String getNumAccount() {
          return numAccount;
     }

     public void setNumAccount(String numAccount) {
          this.numAccount = numAccount;
     }

     public String getOwner() {
          return owner;
     }

     public void setOwner(String owner) {
          this.owner = owner;
     }

     /** metodo para mostar la cuenta */

     public void Showaccount() {
          System.out.println("numAccount" + getNumAccount() + "owner" + getOwner());

     }

     public double getBalance() {
          return balance;
     }

     public void setBalance(double balance) {
          this.balance = balance;
     }

     public boolean isAccountOn() {
          return accountOn;
     }

     public void setAccountOn(boolean accountOn) {
          this.accountOn = accountOn;
     }

}
