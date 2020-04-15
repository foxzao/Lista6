import javax.swing.*;
public class TesteAtribuicao{
   public static void main(String [] args){
      String nome;
      String boleana;
      int idade;
      boolean pratica;
            
      nome = JOptionPane.showInputDialog("Digite o nome do professor");
      idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do professor"));
      Professor professor = new Professor(nome, idade);
      
      nome = JOptionPane.showInputDialog("Digite o nome da disciplina");
      boleana = JOptionPane.showInputDialog("Digite sim caso a disciplina seja pratica");
      pratica = boleana.equals("Sim");
      Disciplina disciplina = new Disciplina(nome, pratica);
         
      Atribuicao atribuicao = new Atribuicao(professor, disciplina);
      
      JOptionPane.showMessageDialog(null, atribuicao.getDados());   
   }
}
