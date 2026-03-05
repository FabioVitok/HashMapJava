import java.lang.StringBuilder;
public class Animal
{
    private String especie;
    private String habilidade;
    
    public Animal(String especie, String habilidade){
        this.especie = especie;
        this.habilidade = habilidade;
    }
    
    public String getEspecie() {
        return this.especie;
    }
    
    public String getHabilidade() {
        return this.habilidade;
    }
    
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Especie: ").append(this.especie);
        sb.append("Habilidade: ").append(this.habilidade);
        return sb.toString();
    }
}