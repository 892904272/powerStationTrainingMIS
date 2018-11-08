package persistences;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import dto.UserDTO;
import util.CommUtil;
import util.DBUtil;

public class UserDAO {
	private DBUtil dbUtil;
	private Connection conn;

	public UserDAO() {
		dbUtil = new DBUtil();
		conn = dbUtil.getConnection();
	}

	public boolean findUser(String name, String psw) {
		boolean result = false;
		QueryRunner qr = new QueryRunner();
		UserDTO userDTO = null;

		String sql = "select * from t_base_user_info where user_name=? and password=?";

		try {
			userDTO = qr.query(conn, sql, new BeanHandler<UserDTO>(
					UserDTO.class), name, psw);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (userDTO != null) {
			result = true;
			System.out.println(userDTO.getUser_name() + "  "
					+ userDTO.getPassword());
		}

		return result;
	}

	public List<UserDTO> getAllUser() {
		QueryRunner qr = new QueryRunner();
		List<UserDTO> allUsers = null;

		String sql = "select user_id,NAME,sex,card_id,birthday,userInfo.unit_id,depart.unit_name,userInfo.telephone,duty,TECDUTY,userInfo.email from t_base_user_info userInfo,t_base_unit_info depart where userInfo.unit_id = depart.unit_id;";
		try {
			allUsers = qr.query(conn, sql, new BeanListHandler<UserDTO>(
					UserDTO.class));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				DbUtils.close(conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return allUsers;

	}

	public boolean saveUser(UserDTO user) {
		boolean result = false;
		int insertRows = 0;
		QueryRunner qr = new QueryRunner();

		String sql = "insert into t_base_user_info (user_id,user_name,password) values(?,?,?)";
		String userId = CommUtil.getId();

		try {
			insertRows = qr.update(conn, sql, userId, user.getUser_name(),
					user.getPassword());

			System.out.println("*******" + insertRows);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				DbUtils.close(conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		result = (insertRows == 1) ? true : false;
		System.out.println("*******" + result);
		return result;
	}

	public Boolean nameExisted(String userName) {
		boolean existed = false;
		UserDTO userDTO = null;

		QueryRunner qr = new QueryRunner();
		String sql = "select user_id,user_name,password from t_base_user_info where user_name = ?";
		try {
			userDTO = qr.query(conn, sql, new BeanHandler<UserDTO>(
					UserDTO.class), userName);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				DbUtils.close(conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (userDTO != null) {
			System.out.println("inputed name:" + userName + "****");
			System.out.println("query name:" + userDTO.getUser_name() + "****");
		}
		existed = userDTO == null ? false : true;
		return existed;
	}
}
