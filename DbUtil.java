import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
    //here add jdbc string for mysql - for example
    //jdbc:mysql://localhost:3306/db_name?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
    private static final String DB_URL = "SOME CONNECTION STRING";
    //specify user
    private static final String DB_USER = "";
    //specify pass
	private static final String DB_PASS = "coderslab";

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
	}
}