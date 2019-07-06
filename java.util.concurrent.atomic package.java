public class AtomicBoolean implements Serializable {
	public final boolean get() {/*implementation*/}
	public final void set(boolean newValue) {/*implementation*/}
	public final boolean getAndSet(boolean newValue) {/*implementation*/}
}

public class AtomicInteger extends Number implements Serializable {
	public final int get() {/*implementation*/}
	public final void set(int newValue) {/*implementation*/}
	public final int getAndSet(int newValue) {/*implementation*/}
	public final int incrementAndGet() {/*implementation*/}
	public final int getAndIncrement() {/*implementation*/}
	public final int decrementAndGet() {/*implementation*/}
	public final int getAndDecrement() {/*implementation*/}
}

public class AtomicIntegerArray implements Serializable {
	public final int get(int i) {/*implementation*/}
	public final void set(int i, int newValue) {/*implementation*/}
	public final int getAndSet(int i, int newValue) {/*implementation*/}
}

public class AtomicLong extends Number implements Serializable {
	public final long get() {/*implementation*/}
	public final void set(long newValue) {/*implementation*/}
	public final long getAndSet(long newValue) {/*implementation*/}
	public final long incrementAndGet() {/*implementation*/}
	public final long getAndIncrement() {/*implementation*/}
	public final long decrementAndGet() {/*implementation*/}
	public final long getAndDecrement() {/*implementation*/}
}

public class AtomicLongArray implements Serializable {
	public final long get(int i) {/*implementation*/}
	public final void set(int i, long newValue) {/*implementation*/}
	public final long getAndSet(int i, long newValue) {/*implementation*/}
}

public class AtomicReference<V> implements Serializable {
	public final V get() {/*implementation*/}
	public final void set(V newValue) {/*implementation*/}
	public final V getAndSet(V newValue) {/*implementation*/}
}

public class AtomicReferenceArray<E> implements Serializable {
	public final E get(int i) {/*implementation*/}
	public final void set(int i, E newValue) {/*implementation*/}
	public final E getAndSet(int i, E newValue) {/*implementation*/}
}