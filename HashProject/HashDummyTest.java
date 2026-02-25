import java.util.HashMap;
public class HashDummyTest
{
   public static void main(String[] arfs){
       System.out.println("Trabalhar com hassmap!!!");
       // 1. Criar umavariavel do tipo hashmap
       HashMap<String, Integer> alunos = new HashMap<>();
       // 2. Adicionar valores ao HashMap
       alunos.put("Ana",17);
       alunos.put("João",20);
       alunos.put("Marcos",19);
       // 3. Verificar o tamanho do Hashmap
       int tamanho = alunos.size();
       System.out.println("Tamanho do HashMap: " + tamanho);
       // Adicionar outra Ana
       alunos.put("Ana",27);
       // 5. Verificar o tamanho outra vez
       System.out.println("Tamanho do HashMap: " + tamanho);
       boolean existe = alunos.containsKey("Ana");
       System.out.println(existe);
       
       // 6. Apanhar o que está guardado na chave Marcos
       Integer valorDaChaveMarcos = alunos.get("Marcos");
       
       int valorDaChaveMarcos2 = alunos.get("Marcos");
       
       System.out.println("O valor de Marcos é " + valorDaChaveMarcos2);
       //7. Verificar se um valor existe no HMap
       boolean existe19 = alunos.containsValue(19);
       System.out.println("19 existe: " + existe19);

       
       alunos = verificarAdicionar(alunos,"Fernando", 6); 
       tamanho = alunos.size();
       System.out.println("Tamanho do HashMap: " + tamanho);
       System.out.println(alunos.get("Fernando"));
   }
   
   public static HashMap<String, Integer> verificarAdicionar(HashMap<String, Integer> alunos, String aluno, Integer valor){
       boolean existe = alunos.containsKey(aluno);
       if(!existe){
           alunos.put(aluno,valor); 
       }
       return alunos;
   }
}