package project;

import java.sql.ResultSet;
import java.sql.SQLException;

import tools.MySqlUtil;

public class ConnectToDataBase {
	public static void main(String[] args) throws SQLException {
		MySqlUtil sqlUtil = getSqlUitlDataBaseM1();
		String sql = "SELECT COUNT(*) AS count FROM test.mk_allot_user201702241817";
		ResultSet result = sqlUtil.Query(sql);
		while (result.next()) {
			System.out.println(result.getInt("count"));
		}
	}

	public static MySqlUtil getSqlUitlDataBaseM1() {
		MySqlUtil sqlUtil = new MySqlUtil("172.20.20.102:3316", "writer", "Bj3CYvoKsPUUMR8H");
		sqlUtil.Connect();
		return sqlUtil;
	}

	public static MySqlUtil getSqlUitlDataBaseM2() {
		MySqlUtil sqlUtil = new MySqlUtil("172.20.20.102:3326", "writer", "Bj3CYvoKsPUUMR8H");
		sqlUtil.Connect();
		return sqlUtil;
	}

	public static MySqlUtil getSqlUitlDataBaseM3() {
		MySqlUtil sqlUtil = new MySqlUtil("172.20.20.102:3336", "writer", "Bj3CYvoKsPUUMR8H");
		sqlUtil.Connect();
		return sqlUtil;
	}

	public static MySqlUtil getSqlUitlDataBaseM4() {
		MySqlUtil sqlUtil = new MySqlUtil("172.20.20.102:3346", "writer", "Bj3CYvoKsPUUMR8H");
		sqlUtil.Connect();
		return sqlUtil;
	}

	public static MySqlUtil getSqlUitlDataBaseM5() {
		MySqlUtil sqlUtil = new MySqlUtil("172.20.20.102:3356", "writer", "Bj3CYvoKsPUUMR8H");
		sqlUtil.Connect();
		return sqlUtil;
	}

	public static MySqlUtil getSqlUitlDataBaseM6() {
		MySqlUtil sqlUtil = new MySqlUtil("172.20.20.102:3366", "writer", "Bj3CYvoKsPUUMR8H");
		sqlUtil.Connect();
		return sqlUtil;
	}
}
