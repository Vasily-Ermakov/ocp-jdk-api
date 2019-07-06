public interface Driver {
}

public interface Wrapper {
}

public interface Connection extends Wrapper, AutoCloseable {
	Statement createStatement() throws SQLException;
	Statement createStatement(int resultSetType, int resultSetConcurrency) throws SQLException;
}

public interface Statement extends Wrapper, AutoCloseable {
	int executeUpdate(String sql) throws SQLException;
	ResultSet executeQuery(String sql) throws SQLException;
	boolean execute(String sql) throws SQLException;
	ResultSet getResultSet() throws SQLException;
	int getUpdateCount() throws SQLException;
}

public class Date extends java.util.Date {
	@SuppressWarnings("deprecation")
	public LocalDate toLocalDate() {/*imlementation*/}
}

public class Time extends java.util.Date {
	@SuppressWarnings("deprecation")
	public LocalTime toLocalTime() {/*imlementation*/}
}

public class Timestamp extends java.util.Date {
	@SuppressWarnings("deprecation")
	public LocalDateTime toLocalDateTime() {/*imlementation*/}
}

public interface ResultSet extends Wrapper, AutoCloseable {
	int TYPE_FORWARD_ONLY = 1003;
	int TYPE_SCROLL_INSENSITIVE = 1004;
	int TYPE_SCROLL_SENSITIVE = 1005;
	int CONCUR_READ_ONLY = 1007;
	int CONCUR_UPDATABLE = 1008;
	boolean next() throws SQLException;
	boolean previous() throws SQLException;
	boolean first() throws SQLException;
	boolean last() throws SQLException;
	void beforeFirst() throws SQLException;
	void afterLast() throws SQLException;
	boolean absolute(int row) throws SQLException;
	boolean relative(int rows) throws SQLException;
	int getInt(String columnLabel) throws SQLException;
	int getInt(int columnIndex) throws SQLException;
	String getString(String columnLabel) throws SQLException;
	String getString(int columnIndex) throws SQLException;
	boolean getBoolean(String columnLabel) throws SQLException;
	boolean getBoolean(int columnIndex) throws SQLException;
	Date getDate(String columnLabel) throws SQLException;
	Date getDate(int columnIndex) throws SQLException;
	double getDouble(String columnLabel) throws SQLException;
	double getDouble(int columnIndex) throws SQLException;
	long getLong(String columnLabel) throws SQLException;
	long getLong(int columnIndex) throws SQLException;
	Object getObject(String columnLabel) throws SQLException;
	Object getObject(int columnIndex) throws SQLException;
	Time getTime(String columnLabel) throws SQLException;
	Time getTime(int columnIndex) throws SQLException;
	Timestamp getTimestamp(String columnLabel) throws SQLException;
	Timestamp getTimestamp(int columnIndex) throws SQLException;
}

public class SQLException extends Exception implements Iterable<Throwable> {
	public String getSQLState() {/*imlementation*/}
	public int getErrorCode() {/*imlementation*/}
}

public class DriverManager {
	public static Connection getConnection(String url) throws SQLException {/*imlementation*/}
	public static Connection getConnection(String url, String user, String password) throws SQLException {/*imlementation*/}
}