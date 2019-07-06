public final class FileTime implements Comparable<FileTime> {
	public long toMillis() {/*implementation*/}
	public static FileTime fromMillis(long value) {/*implementation*/}
}

public interface UserPrincipal extends Principal {
	public String getName():
}

public abstract class UserPrincipalLookupService {
	public abstract UserPrincipal lookupPrincipalByName(String name) throws IOException;
}

public interface AttributeView {
}

public interface FileAttributeView extends AttributeView {
}

public interface BasicFileAttributeView extends FileAttributeView {
	void setTimes(FileTime lastModifiedTime, FileTime lastAccessTime, FileTime createTime) throws IOException;
}

public interface BasicFileAttributes {
	boolean isDirectory();
	boolean isRegularFile();
	boolean isSymbolicLink();
	boolean isOther();
	long size();
	FileTime creationTime();
	FileTime lastModifiedTime();
	FileTime lastAccessTime();
	Object fileKey();
}

public interface DosFileAttributes extends BasicFileAttributes {
}

public interface PosixFileAttributes extends BasicFileAttributes {
}
