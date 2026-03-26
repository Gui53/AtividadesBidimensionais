
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int[][] bidimensao = {
            {1, 5, 6}, 
            {8, 3, 2},
            {7, 9, 4}};
        
        int coluna = 0;
        int somaColuna = 0;
        
        for (int i = 0; i < bidimensao.length; i++) {
            somaColuna += bidimensao[i][coluna];
        }
        
        JOptionPane.showMessageDialog(null, "Soma da primeira coluna: " + somaColuna);
    }
}
