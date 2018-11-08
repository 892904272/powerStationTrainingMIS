package persistences.depart;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import util.DBUtil;
import dto.department.DepartDTO;


public class DepartDAO {
	private DBUtil dbUtil;
	private Connection conn;
	
	public DepartDAO(){
		dbUtil = new DBUtil();
		conn = dbUtil.getConnection();
	}
	
	public int getDepartCount(){
		int departCount = 0;
		String sql = "select count(*) from t_base_unit_info";
		QueryRunner qr = new QueryRunner();
		
		
		try {
			departCount = (qr.query(conn, sql, new ScalarHandler<Long>())).intValue();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return departCount;
	}
	
	
	public List<DepartDTO> getAllDeparts(){
		List<DepartDTO> allDeparts =  new ArrayList<DepartDTO>();
		String sql = "select * from t_base_unit_info order by unit_id";
		QueryRunner qr = new QueryRunner();
		
		try {
			allDeparts = qr.query(conn, sql, new BeanListHandler<DepartDTO>(DepartDTO.class));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				DbUtils.close(conn);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return allDeparts;
	}
	
	public DepartDTO getDepartById(String id){
		DepartDTO depart = new DepartDTO();
		QueryRunner qr = new QueryRunner();
		String sql = "select * from t_base_unit_info where unit_id = ?";
		
		try {
			depart = qr.query(conn, sql, new BeanHandler<DepartDTO>(DepartDTO.class), id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				DbUtils.close(conn);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return depart;
	}

}
