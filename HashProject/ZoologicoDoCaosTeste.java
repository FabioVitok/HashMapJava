public class ZoologicoDoCaosTeste
{
   public static void amin(String[] args) {
       Animal a1 = new Animal("Felpudo", "Faz rum rum");
       Animal a2 = new Animal("Orelhudo", "Come cenouras");
       Animal a3 = new Animal("Duduzinho", "Faz rom rom");
       Animal a4 = new Animal("Jimmy Jones", "Faz Roc Roc");
       Animal a5 = new Animal("Palmi", "Faz contas de somar");
       
       ZoologicoDoCaos zoo1 = new ZoologicoDoCaos("Zoo caotico");
       
       zoo1.adicionarAnimal(a1);
       zoo1.adicionarAnimal(a2);
       zoo1.adicionarAnimal(a3);
       zoo1.adicionarAnimal(a4);
       zoo1.adicionarAnimal(a5);
       
       zoo1.removerAnimal(a1);
       System.out.println(zoo1.toString());
   }
}