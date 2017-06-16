package proxy;

/**
 *
 * @author rzfzr
 */
public class ItemProxy implements Item{

   private ItemReal itemReal;
   private String nome;

   public ItemProxy(String nome){
      this.nome = nome;
   }

   @Override
   public void mostrar() {
      if(itemReal == null){
         itemReal = new ItemReal(nome);
      }
      itemReal.mostrar();
   }
}