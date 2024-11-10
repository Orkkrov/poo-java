package exercicios_39;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Db {



    private static final String URL = "jdbc:mysql://localhost:3306/escola";
    private static final String USUARIO = "root";
    private static final String SENHA = "478319";

    public static void inserirAluno(Aluno aluno) {
        String sql = "INSERT INTO Alunos (nome, disciplina, numeroAulas, numeroFaltas, notaAV1, notaAV2, notaAV3, media ) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
             PreparedStatement pstmt = conexao.prepareStatement(sql)) {

            // Define os valores dos parâmetros usando os métodos do objeto aluno
            pstmt.setString(1, aluno.getNome());
            pstmt.setString(2, aluno.getDisciplina());
            pstmt.setInt(3, aluno.getNumeroAulas());
            pstmt.setInt(4, aluno.getNumeroFaltas());
            pstmt.setDouble(5, aluno.getNotaAV1());
            pstmt.setDouble(6, aluno.getNotaAV2());
            pstmt.setDouble(7, aluno.getNotaAV3());
            pstmt.setDouble(8, aluno.getMedia());


            // Executa a inserção
            int linhasAfetadas = pstmt.executeUpdate();
            System.out.println("Inserção bem-sucedida! Linhas afetadas: " + linhasAfetadas);

        } catch (SQLException e) {
            System.out.println("Erro ao inserir dados: " + e.getMessage());
        }


    }
}

