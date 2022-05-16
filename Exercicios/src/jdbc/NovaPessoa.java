package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {

    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o nome: ");
        String nome = sc.nextLine();

        Connection conexao = FabricaConexao.getConexao();

        // ! Concatenação pode gerar uma SQLInjection
        // String sql = "INSERT INTO pessoas (nome) values ('" + nome + "')";

        String sql = "INSERT INTO pessoas (nome) values (?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nome);

        stmt.execute();

        System.out.println("Pessoa incluída com sucesso");

        conexao.close();
        sc.close();
    }
}
