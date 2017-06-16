package proxy;

/**
 *
 * @author rzfzr
 */
public class Proxy {

   public static void main(String[] args) {
      Item item = new ItemProxy("teste");
      item.mostrar(); 
      
      item.mostrar(); 	
   }
    
}
