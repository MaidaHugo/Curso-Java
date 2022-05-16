package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarPessoa {

    public static void main(String[] args) throws SQLException, InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual nome deseja atualizar? ");
        String nomeAtual = sc.nextLine();

        Connection conexao = FabricaConexao.getConexao();

        new Thread();
        Thread.currentThread();
        String sql = "SELECT * FROM pessoas WHERE nome = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nomeAtual);

        ResultSet resultado = stmt.executeQuery();

        if (resultado.next()) {
            Pessoa p = new Pessoa(resultado.getInt("codigo"), resultado.getString("nome"));

            System.out.println("O nome atual é " + p.getNome());

            System.out.print("Digite o novo nome: ");
            String nomeNovo = sc.nextLine();

            stmt.close();

            sql = "UPDATE pessoas SET nome = ? "
                    + " WHERE codigo = ? ";
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, nomeNovo);
            stmt.setInt(2, p.getCodigo());
            stmt.execute();

            System.out.println("Nome alterado com sucesso!");

        } else {
            System.out.println("Nome não encontrado!");
        }

        conexao.close();
        sc.close();

    }

}
