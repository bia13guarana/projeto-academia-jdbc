package academia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexaoJDBC {

	public static void main(String[] args) throws SQLException {

		String driver = "mysql";
		String dataBaseAddress = "localhost";
		String dataBaseName = "alunos";
		String user = "root";
		String password = "mysql";

		StringBuilder sb = new StringBuilder("jdbc:").append(driver).append("://").append(dataBaseAddress).append("/")
				.append(dataBaseName);

		Connection conexao = DriverManager.getConnection(sb.toString(),user,password);
		String sql = "SELECT * FROM alunos";
		PreparedStatement pst = conexao.prepareStatement(sql);
		ResultSet resultado = pst.executeQuery();

		if (resultado.next()) {
			System.out.println(resultado.getString(0));
		}

	}

}
