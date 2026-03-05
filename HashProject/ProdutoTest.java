import java.util.HashMap;

public class ProdutoTest
{
   public static void main (String[] args )
    {
        Produto produto1 = new Produto("Laranja", 0.50, 100);
        Produto produto2 = new Produto("Limão", 0.50, 100);
        Produto produto3 = new Produto("Maçã", 0.40, 89);
        Produto produto4 = new Produto("Pera", 0.50, 100);
        Produto produto5 = new Produto("Morangos", 0.69, 140);
        
        HashMap<String, Produto> produtos = new HashMap<>();
        produtos.put("P001", produto1);
        produtos.put("P002", produto2);
        produtos.put("P003", produto3);
        produtos.put("P004", produto4);
        produtos.put("P005", produto5);
        
        for(String key : produtos.keySet()){
           System.out.println("O valor da chave é: " + key);
           System.out.println("E o seu produto é: " + produtos.get(key));
       }
    }
}