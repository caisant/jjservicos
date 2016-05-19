package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entity.Cliente;

public class DAOImpl implements DAO{

	public void adicionar(Cliente cliente) {
		Connection con = DAOUtil.getInstance().getConnection();
		String sql = "INSERT INTO tb_mensagem " +
				"(id, nome, sobrenome, email, telefone, mensagem) " +
				"VALUES (?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement st = 
					con.prepareStatement(sql);
			st.setInt(1,0);
			st.setString(2, cliente.getNome());
			st.setString(3, cliente.getSobrenome());
			st.setString(4, cliente.getEmail());
			st.setString(5, cliente.getTelefone());
			st.setString(6, cliente.getMensagem());
			st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
