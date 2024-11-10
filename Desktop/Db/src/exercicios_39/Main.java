package exercicios_39;

import javax.swing.*;

public class Main {

    public static void main(String [] args){

        Aluno aluno = new Aluno("", "", 0,0,0,0,0, 0, 0);



        try {



            aluno.setNome(JOptionPane.showInputDialog("digite o nome do aluno"));
            aluno.setDisciplina(JOptionPane.showInputDialog("digite a materia de " + aluno.getNome() + " "));
            aluno.setNumeroAulas(Integer.parseInt(JOptionPane.showInputDialog("digite o numero de aulas da materia " + aluno.getDisciplina() + " ")));
            if (aluno.getNumeroAulas() > 100) {
                JOptionPane.showMessageDialog(null, "valor invalido refaça a operação, programa fechando.....");
                throw new RuntimeException();
            }
            aluno.setNumeroFaltas(Integer.parseInt(JOptionPane.showInputDialog("digite a quantidade de faltas")));
            aluno.setNotaAV1(Double.parseDouble(JOptionPane.showInputDialog("digite a primeira nota de avaliação do " + aluno.getNome() + " ")));
            if (aluno.getNotaAV1() > 10 || aluno.getNotaAV1() < 0) {
                JOptionPane.showMessageDialog(null, "valor invalido refaça a operação, programa fechando.....");
                throw new RuntimeException();
            }
            aluno.setNotaAV2(Double.parseDouble(JOptionPane.showInputDialog("digite a segunda nota de avaliação do " + aluno.getNome() + " ")));
            if (aluno.getNotaAV2() > 10 || aluno.getNotaAV2() < 0) {
                JOptionPane.showMessageDialog(null, "valor invalido refaça a operação, programa fechando.....");
                throw new RuntimeException();
            }
            aluno.setNotaAV3(Double.parseDouble(JOptionPane.showInputDialog("digite a terceira nota de avaliação do " + aluno.getNome() + " ")));
            if (aluno.getNotaAV3() > 10 || aluno.getNotaAV3() < 0) {
                JOptionPane.showMessageDialog(null, "valor invalido refaça a operação, programa fechando.....");
                throw new RuntimeException();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {



        JOptionPane.showMessageDialog(null, " aluno = "+aluno.getNome() +"\n disciplina = "+aluno.getDisciplina()+
                "\n  numero de aulas = "+aluno.getNumeroAulas()+ "\n numero de faltas ="+aluno.getNumeroFaltas() +"\n nota 1 = "+aluno.getNotaAV1() +
                "\n  nota 2 = "+ aluno.getNotaAV2()+"\n nota 3 = "+aluno.getNotaAV3());

        aluno.calcularLimiteFaltas();
        aluno.calcularMedia();
        aluno.verificarSituacao(aluno.getMedia(), aluno.getNumeroFaltas());
        }

        Db alunoDAO = new Db();
        Db.inserirAluno(aluno);










    }
}
