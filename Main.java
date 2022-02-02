package observerPattern;

/**
 *
 * @author Roger
 */
public class Main {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        Person PersonOne=new Person("Tobias");
        Person PersonTwo=new Person("Jhon");
        
        
        Product livro=new Product("Livro", "PHP", "Not available");
        
        //When you opt for option "Notify me when product is available".Below registerObserver method
        //get executed        
        livro.registerObserver(PersonOne);
        livro.registerObserver(PersonTwo);
         
        //Now product is available and the notification will be sent
        livro.setAvailability("Disponivel");
        
    }
}