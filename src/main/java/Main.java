
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int[][] bidimensao = {
            {1, 5, 6},
            {8, 3, 2},
            {7, 9, 4}};

        int coluna = 0;
        int somaColuna = 0;
        String resultado = "";

        //Soma primeira coluna
        for (int i = 0; i < bidimensao.length; i++) {
            somaColuna += bidimensao[i][coluna];
        }

        JOptionPane.showMessageDialog(null, "Soma da primeira coluna: " + somaColuna);
        somaColuna = 0;

        //Soma cada coluna
        for (int j = 0; j < bidimensao[j].length; j++) {

            for (int i = 0; i < bidimensao.length; i++) {
                somaColuna += bidimensao[i][j];
            }
            resultado += "Soma da coluna " + (j + 1) + ": " + somaColuna + "\n";
            somaColuna = 0;

        }
        JOptionPane.showMessageDialog(null, resultado);

        //Multiplicação da primeira linha
        int produto = 1, linha = 0;

        for (int j = 0; j < bidimensao[linha].length; j++) {
            produto *= bidimensao[linha][j];
        }

        JOptionPane.showMessageDialog(null, "Produto da primeira linha: " + produto);

        //Soma de todos os elementos 
        int somaTotal = 0;

        for (int i = 0; i < bidimensao.length; i++) {
            for (int j = 0; j < bidimensao[i].length; j++) {
                somaTotal += bidimensao[i][j];
            }
        }
        JOptionPane.showMessageDialog(null, "Soma total dos elementos: " + somaTotal);

        //Média
        double media = 0;
        somaTotal = 0;

        for (int i = 0; i < bidimensao.length; i++) {
            for (int j = 0; j < bidimensao[i].length; j++) {
                somaTotal += bidimensao[i][j];
            }
        }
        media = (double) somaTotal / (bidimensao.length * bidimensao[0].length);

        JOptionPane.showMessageDialog(null, "Média da matriz: " + media);

        //Números maiores que a média
        somaTotal = 0;
        media = 0;
        String maiores = "";

        for (int i = 0; i < bidimensao.length; i++) {
            for (int j = 0; j < bidimensao[i].length; j++) {
                somaTotal += bidimensao[i][j];
            }
        }

        media = (double) somaTotal / (bidimensao.length * bidimensao[0].length);
        
        for (int i = 0; i < bidimensao.length; i++) {
            for (int j = 0; j < bidimensao[i].length; j++) {
                if(bidimensao[i][j] > media){
                    maiores += "O número " + bidimensao[i][j] + " é maior que a média " + media + "\n";
                }
            }
        }
        if(maiores.equals("")){
            maiores = "Nenhum número é maior que a média";
        }
        JOptionPane.showMessageDialog(null, maiores);
    }
}
