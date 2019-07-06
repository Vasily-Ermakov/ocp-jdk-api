public interface Closeable extends AutoCloseable {
	@Override
	public void close() throws IOException;
}

public class File implements Serializable, Comparable<File> {
	public static final String separator;
	public File(String pathname) {/*implementation*/}
	public File(File parent, String child) {/*implementation*/}
	public boolean exists() {/*implementation*/}
	public String getName() {/*implementation*/}
	public String getAbsolutePath() {/*implementation*/}
	public boolean isDirectory() {/*implementation*/}
	public boolean isFile() {/*implementation*/}
	public long length() {/*implementation*/}
	public long lastModified() {/*implementation*/}
	public boolean delete() {/*implementation*/}
	public boolean renameTo(File dest) {/*implementation*/}
	public boolean mkdir() {/*implementation*/}
	public boolean mkdirs() {/*implementation*/}
	public File[] listFiles() {/*implementation*/}
	public Path toPath() {/*implementation*/}
}

public interface Flushable {
	void flush() throws IOException;
}

public abstract class InputStream implements Closeable {
	public boolean markSupported() {/*implementation*/}
	public synchronized void mark(int readlimit) {/*implementation*/}
	public synchronized void reset() throws IOException {/*implementation*/}
	public long skip(long n) throws IOException {/*implementation*/}
	public abstract int read() throws IOException;
	public int read(byte b[]) throws IOException {/*implementation*/}
}

public abstract class OutputStream implements Closeable, Flushable {
	public abstract void write(int b) throws IOException;
	public void write(byte b[]) throws IOException {/*implementation*/}
	public void write(byte b[], int off, int len) throws IOException {/*implementation*/}
}

public interface Readable {
}

public abstract class Reader implements Readable, Closeable {
	public boolean markSupported() {/*implementation*/}
	public void mark(int readAheadLimit) throws IOException {/*implementation*/}
	public void reset() throws IOException {/*implementation*/}
	public long skip(long n) throws IOException {/*implementation*/}
	public int read() throws IOException {/*implementation*/}
}

public interface Appendable {
	Appendable append(CharSequence csq) throws IOException;
}

public abstract class Writer implements Appendable, Closeable, Flushable {
	public void write(String str) throws IOException {/*implementation*/}
}

public class FileInputStream extends InputStream {
	public FileInputStream(String name) throws FileNotFoundException {/*implementation*/}
	public FileInputStream(File file) throws FileNotFoundException {/*implementation*/}
}

public class FileOutputStream extends OutputStream {
	public FileOutputStream(String name) throws FileNotFoundException {/*implementation*/}
	public FileOutputStream(File file) throws FileNotFoundException {/*implementation*/}
}

public class InputStreamReader extends Reader {
}

public class OutputStreamWriter extends Writer {
}

public class FileReader extends InputStreamReader {
}

public class FileWriter extends OutputStreamWriter {
}

public class BufferedReader exists Reader {
	public BufferedReader(Reader in) {/*implementation*/}
	public String readLine() throws IOException {/*implementation*/}
}

public class BufferedWriter extends Writer {
	public BufferedWriter(Writer out) {/*implementation*/}
	public void newLine() throws IOException {/*implementation*/}
}

public interface DataInput {
}

public interface ObjectInput extends DataInput, AutoCloseable {
	public Object readObject() throws ClassNotFoundException, IOException;
}

public interface ObjectStreamConstants {
}

public class ObjectInputStream extends InputStream implements ObjectInput, ObjectStreamConstants {
}

public interface ObjectOutput extends DataOutput, AutoCloseable {
	public void writeObject(Object object) throws IOException;
}

public interface DataOutput {
}

public class ObjectOutputStream extends OutputStream implements ObjectOutput, ObjectStreamConstants {
}

public class FilterOutputStream extends OutputStream {
}

public class PrintStream extends FilterOutputStream implements Appendable, Closeable {
	public PrintStream(File file) throws FileNotFoundException {/*implementation*/}
	public PrintStream(String fileName) throws FileNotFoundException {/*implementation*/}
	public void print(Object obj) {/*implementation*/}
	public void println() {/*implementation*/}
	public PrintStream format(String format, Object... args) {/*implementation*/}
	public PrintStream printf(String format, Object... args) {/*implementation*/}
	public boolean checkError() {/*implementation*/}
}

public class PrintWriter extends Writer {
	public PrintWriter(File file) throws FileNotFoundException {/*implementation*/}
	public PrintWriter(String fileName) throws FileNotFoundException {/*implementation*/}
	public PrintWriter(OutputStream out) {/*implementation*/}
	public void print(Object obj) {/*implementation*/}
	public void println() {/*implementation*/}
	public PrintWriter format(String format, Object... args) {/*implementation*/}
	public PrintWriter format(Locale l, String format, Object... args) {/*implementation*/}
	public PrintWriter printf(String format, Object... args) {/*implementation*/}
	public PrintWriter printf(Locale l, String format, Object... args) {/*implementation*/}
	public boolean checkError() {/*implementation*/}
}

public class IOException extends Exception {
}

public class FileNotFoundException extends IOException {
}

public class ObjectStreamException exists IOException {
}

public class NotSerializableException extends ObjectStreamException {
}

public final class Console implements Flushable {
	public String readLine() {/*implementation*/}
	public String readLine(String fmt, Object... args) {/*implementation*/}
	public Reader reader() {/*implementation*/}
	public PrintWriter writer() {/*implementation*/}
	public Console format(String fmt, Object... args) {/*implementation*/}
	public Console printf(String format, Object... args) {/*implementation*/}
	public char[] readPassword() {/*implementation*/}
	public char[] readPassword(String fmt, Object... args) {/*implementation*/}
}