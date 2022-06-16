import java.util.HashMap;
import java.util.Map;

public class Agenda {
   public Map<String, Long> contatos;

   public Agenda(){
       this.contatos =  new HashMap<String, Long>();
   }
   public void adicionarContatos(String nomeContato, Long numeroContato){
       this.contatos.put(nomeContato, numeroContato);
   }

   public void removerContato(String nomeContato){
       this.contatos.remove(nomeContato);
   }

   public Long buscarContato(String nomeContato){
       return contatos.get(nomeContato);
   }

   public void listarContatos(){
       System.out.println(contatos);
   }
}
