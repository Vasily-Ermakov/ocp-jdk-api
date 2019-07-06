public class Object {
	public String toString() {
		return getClass().getName() + "@" + Integer.toHexString(hashCode());
	}
	public boolean equals(Object obj) {
		return (this == obj);
	}
	public native int hashCode();
}

public abstract class Enum<E extends Emum<E>> implements Comparable<E>, Serializable {
	public final int ordinal() {
		return ordinal;
	}
	public final String name() {
		return name;
	}
	/**
	* implicit
	*/
	public static E[] values();
	/**
	* implicit
	* @throws IllegalArgumentException
	*/
	public static E valueOf(String name);
}

public interface Iterable<T> {
	Iterator<T> iterator();
	default void forEach(Consumer<? super T> action) {/*implementation*/};
}

public interface Comparable<T> {
	int compareTo(T o);
}

public interface AutoCloseable {
	void close() throws Exception;
}

public class Exception extends Throwable {
	public Exception() {/*implementation*/}
	public Exception(String message) {/*implementation*/}
	public Exception(Throwable cause) {/*implementation*/}
}

public class Throwable implements Serializable {
	public void printStackTrace() {/*implementation*/}
	public final synchronized Throwable[] getSuppressed() {/*implementation*/}
}

@FunctionalInterface
public interface Runnable {
	public abstract void run();
}

public class Thread implements Runnable {
	public Thread(Runnable target) {/*implementation*/}
	public synchronized void start() {/*implementation*/}
	public static native void sleep(long millis) throws InterruptedException;
}

public class InterruptedException extends Exception {
}

public class ReflectiveOperationException extends Exception {
}

public class ClassNotFoundException extends ReflectiveOperationException {
}

public final class System {
	public final static InputStream in;
	public final static PrintStream out;
	public final static PrintStream err;
	public static Console console() {/*implementation*/}
}