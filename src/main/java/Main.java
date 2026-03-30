
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
        for (int j = 0; j < bidimensao[0].length; j++) {

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
                if (bidimensao[i][j] > media) {
                    maiores += "O número " + bidimensao[i][j] + " é maior que a média " + media + "\n";
                }
            }
        }
        if (maiores.equals("")) {
            maiores = "Nenhum número é maior que a média";
        }
        JOptionPane.showMessageDialog(null, maiores);

        //O maior elemento da matriz e sua posição
        int maior = bidimensao[0][0];
        int linhaMaior = 0;
        int colunaMaior = 0;

        for (int i = 0; i < bidimensao.length; i++) {
            for (int j = 0; j < bidimensao[i].length; j++) {
                if (bidimensao[i][j] > maior) {
                    maior = bidimensao[i][j];
                    linhaMaior = i;
                    colunaMaior = j;

                }
            }
        }

        JOptionPane.showMessageDialog(null, "O número " + maior + " é o maior número da matriz e se encontra em [" + linhaMaior + "][" + colunaMaior + "]");

        //O menor elemento da matriz e sua posição
        int menor = bidimensao[0][0];
        int linhaMenor = 0;
        int colunaMenor = 0;

        for (int i = 0; i < bidimensao.length; i++) {
            for (int j = 0; j < bidimensao[i].length; j++) {
                if (menor > bidimensao[i][j]) {
                    menor = bidimensao[i][j];
                    linhaMenor = i;
                    colunaMenor = j;
                }
            }
        }

        JOptionPane.showMessageDialog(null, "O número " + menor + " é o menor número da matriz e se encontra em [" + linhaMenor + "][" + colunaMenor + "]");
        
        //Calcula e mostra a soma dos elementos na diagonal principal 
        int controle = 0;
        int somaD = 0;
        
        for (int i = 0; i < bidimensao.length; i++) {
            for (int j = 0; j < bidimensao[i].length; j++) {
                if (i  == controle && j == controle){
                    somaD += bidimensao[i][j];
                    controle += 1;        
                } 
            }
        }
        JOptionPane.showMessageDialog(null, "A soma da diagonal principal é: " + somaD);
        
        //Forma otimizada
        /*for (int i = 0; i < bidimensao.length; i++) {
            somaD += bidimensao[i][i];
        }*/
    }
}
