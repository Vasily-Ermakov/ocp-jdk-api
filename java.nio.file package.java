public interface OpenOption {
}

public interface CopyOption {
}

public enum LinkOption implements OpenOption, CopyOption {
	NOFOLLOW_LINKS;
}

public interface Watchable {
}

public interface Path extends Comparable<Path>, Iterable<Path>, Watchable {
	URI toUri();
	File file();
	int getNameCount();
	Path getName(int index);
	Path getFilename();
	Path getParent();
	Path getRoot();
	boolean isAbsolute();
	Path toAbsolutePath();
	Path subpath(int beginIndex, int endIndex);
	Path relativize(Path other);
	Path resolve(Path other);
	Path normalize();
	Path toRealPath(LinkOption... options) throws IOException;
}

public final class Paths {
	public static Path get(String first, String... more) {/*implementation*/}
	public static Path get(URI uri) {/*implementation*/}
}

public abstract class FileSystem interface Closeable {
	public abstract Path getPath(String first, String... more);
	public abstract UserPrincipalLookupService getUserPrincipalLookupService();
}

public final class FileSystems {
	public static FileSystem getDefault() {/*implementation*/}
}

public interface FileAttribute<T> {
}

public enum FileVisitOption {
	FOLLOW_LINKS;
}

public final class Files {
	public static boolean exists(Path path, LinkOption... options) {/*implementation*/}
	public static boolean isSameFile(Path path, Path path2) throws IOException {/*implementation*/}
	public static Path createDirectory(Path dir, FileAttribute<?>... attrs) throws IOException {/*implementation*/}
	public static Path createDirectories(Path dir, FileAttribute<?>... attrs) throws IOException {/*implementation*/}
	public static Path copy(Path source, Path target, CopyOption... options) {/*implementation*/}
	public static long copy(InputStream in, Path target, CopyOption... options) throws IOException {/*implementation*/}
	public static long copy(Path source, OutputStream out) throws IOException {/*implementation*/}
	public static move(Path source, Path target, CopyOption... options) throws IOException {/*implementation*/}
	public static void delete(Path path) throws IOException {/*implementation*/}
	public static boolean deleteIfExists(Path path) throws IOException {/*implementation*/}
	public static BufferedReader newBufferedReader(Path path, Charset cs) throws IOException {/*implementation*/}
	public static BufferedWriter newBufferedWriter(Path path, Charset cs, OpenOption... options) throws IOException {/*implementation*/}
	public static List<String> readAllLines(Path path) throws IOException {/*implementation*/}
	public static List<String> readAllLines(Path path, Charset cs) throws IOException {/*implementation*/}
	public static boolean isDirectory(Path path, LinkOption... options) {/*implementation*/}
	public static boolean isRegularFile(Path path, LinkOption... options) {/*implementation*/}
	public static boolean isSymbolicLink(Path path) {/*implementation*/}
	public static boolean isHidden(Path path) throws IOException {/*implementation*/}
	public static boolean isReadable(Path path) {/*implementation*/}
	public static boolean isExecutable(Path path) {/*implementation*/}
	public static long size(Path path) throws IOException {/*implementation*/}
	public static FileTime getLastModifiedTime(Path path, LinkOption... options) throws IOException {/*implementation*/}
	public static Path setLastModifiedTime(Path path, FileTime time) throws IOException {/*implementation*/}
	public static UserPrincipal getOwner(Path path, LinkOption... options) throws IOException {/*implementation*/}
	public static Path setOwner(Path path, UserPrincipal owner) throws IOException {/*implementation*/}
	public static <A extends BasicFileAttributes> A readAttributes(Path path, Class<A> type, LinkOption... options) {/*implementation*/}
	public static <V extends FileAttributeView> V getFileAttributeView(Path path, Class<V> type, LinkOption... options) {/*implementation*/}
	public static Stream<Path> walk(Path start, FileVisitOption... options) throws IOException {/*implementation*/}
	public static Stream<Path> walk(Path start, int maxDepth, FileVisitOption... options) throws IOException {/*implementation*/}
	public static Stream<Path> find(Path start, int maxDepth, BiPredicate<Path, BasicFileAttributes> matcher, FileVisitOption... options) throws IOException {/*implementation*/}
	public static Stream<Path> list(Path dir) throws IOException {/*implementation*/}
	public static Stream<String> lines(Path path) throws IOException {/*implementation*/}
}