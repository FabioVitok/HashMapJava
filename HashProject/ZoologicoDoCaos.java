import java.util.HashMap;
public class ZoologicoDoCaos
{
     private String nome;
     HashMap<String, Animal> animais;
     
     public ZoologicoDoCaos(String nome) {
         this.nome = nome;
         this.animais = new HashMap<>();
     }
     
     public String getNome() {
         return this.nome;
     }
     
     public void SetNome(String nome) {
         this.nome = nome;
     }
     
     public HashMap getAnimais() {
         return this.animais;
     }
     
     public void adicionarAnimal (Animal novoAnimal){
         this.animais.put(novoAnimal.getEspecie(), novoAnimal);
     }
     
     public void removerAnimal (Animal animal){
         this.animais.remove(animal.getEspecie());
     }
    
     
     @Override
      public String toString() {
         return "-" + this.nome + "-"+ this.animais.toString();
     }
}