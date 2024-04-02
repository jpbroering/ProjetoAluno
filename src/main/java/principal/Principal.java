
package principal;

import javax.swing.JOptionPane;
import model.Aluno;

public class Principal {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome(JOptionPane.showInputDialog("Digite o nome do Aluno"));
        a1.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota")));
        a1.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota")));
        a1.setNota3(Double.parseDouble(JOptionPane.showInputDialog("Digite a terceiro nota")));
        
        JOptionPane.showMessageDialog(null,"A media do aluno "+a1.getNome()+" é "+a1.getMedia());
    }
}
