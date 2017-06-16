package proxy;

/**
 *
 * @author rzfzr
 */
public class ItemReal implements Item {

   private String nome;

   public ItemReal(String nome){
      this.nome = nome;
      carregarDisco(nome);
   }

   @Override
   public void mostrar() {
      System.out.println("Mostrando " + nome);
   }

   private void carregarDisco(String nome){
      System.out.println("Carregando " + nome);
   }
}