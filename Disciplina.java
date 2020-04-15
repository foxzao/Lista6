public class Disciplina{
   private String nome;
   private boolean pratica;
   
   public String getNome(){
      return nome;
   }
   public boolean getPratica(){
      return pratica;
   }
   public void setPratica(boolean pratica){
      this.pratica= pratica;
   }
   public void setNome(String nome){
      this.nome= nome;
   }
   public Disciplina(String nome, boolean pratica){
      this.nome = nome;
      this.pratica = pratica; 
   }
   public String getDados(){
      return "\n Nome: " + nome + "\n Pratica: " + pratica;
   }
}