import javax.swing.*;

public class Bidimensional0803 {
    public static void main(String[] args) {
        float notas[][] = new float[3][2];
        int aluno = 0, nota;
        while (aluno < 3) {
            nota = 0;
            while (nota < 2) {
                notas[aluno][nota] = Float.parseFloat(JOptionPane.showInputDialog(null, "Forneça a nota " + (nota + 1) + " do aluno " + (aluno + 1)));
                nota++;
            }
            aluno++;
        }

        aluno = Integer.parseInt(JOptionPane.showInputDialog(null, "Forneça o número do aluno a consultar:"));
        JOptionPane.showMessageDialog(null, "Consulta de notas: " +
                "\n Aluno: " + aluno +
                "\n Nota1: " + notas[aluno - 1][0] +
                "\n Nota2: " + notas[aluno - 1][1] +
                "\n Media: " + ((notas[aluno - 1][0] + notas[aluno - 1][1]) / 2));
        System.exit(0);
    }
}