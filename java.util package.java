public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, java.io.Serializable { 
}

public interface Collection<E> extends Iterable<E> {
	boolean add(E e);
	int size();
	boolean remove(Object o);
	boolean isEmpty();
	void clear();
	boolean contains(Object o);
	Object[] toArray()
	default boolean removeIf(Predicate<? super E> filter) {/*implementation*/}
	default Stream<E> stream() {/*implementation*/}
	default Stream<E> parallelStream() {/*implementation*/}
}

public interface List<E> extends Collection<E> {
	E get(int index);
	E remove(int index);
	void add(int index, E element);
	int indexOf(Object o);
	int lastIndexOf(Object o);
	E set(int index, E element);
	default void replaceAll(UnaryOperator<? super E> operator) {/*implementation*/}
}

public class Arrays {
	public static <T> T asList(T.. a) {
		return new java.util.Arrays.ArrayList<>(a);
	}
	public static <T> void sort(T[] a, Comparator<? super T> c) {/*implementation*/}
	public static <T> int binarySearch(T[] a, T key, Comparator<? super T> c) {/*implementation*/}
}

public class Collections {
	public static <? extends Comparable<? super T>> void sort(List<T> list) {/*implementation*/}
	public static <T> void sort(List<T> list, Comparator<? super T> c) {/*implementation*/}
	public static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key) {/*implementation*/}
	public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c) {/*implementation*/}
	public static <T> Collection<T> synchronizedCollection(Collection<T> c) {/*implementation*/}
	public static <T> List<T> synchronizedList(List<T> list) {/*implementation*/}
	public static <K, V> Map<K, V> synchronizedMap(Map<K, V> m) {/*implementation*/}
	public static <K, V> NavigableMap<K, V> synchronizedNavigableMap(NavigableMap<K, V> m) {/*implementation*/}
	public static <T> NavigableSet<T> synchronizedNavigableSet(NavigableSet<T> s) {/*implementation*/}
	public static <T> Set<T> synchronizedSet(Set<T> s) {/*implementation*/}
	public static <K, V> SortedMap<K, V> synchronizedSortedMap(SortedMap<K, V> m) {/*implementation*/}
	public static <T> SortedSet<T> synchronizedSortedSet(SortedSet<T> s) {/*implementation*/}
}

public interface Set<E> extends Collection<E> {
}

public interface Queue<E> extends Collection<E> {
	/**
	 * @throws NoSuchElementException if this queue is empty
	*/
	E element();
	boolean offer(E e);
	/**
	 * @throws NoSuchElementException if this queue is empty
	*/
	E remove();
	E peek();
	E poll();
}

public interface Map<K, V> {
	void clear();
	boolean isEmpty();
	int size();
	V get(Object key);
	V put(K key, V value);
	V remove(Object key);
	boolean containsKey(Object key);
	boolean containsValue(Object value);
	Set<K> keySet();
	Collection<V> values();
	/**
	 * If the specified key is not already associated with a value (or is mapped to {@code null}) associates it with the given value and returns {@code null}, else returns the current value.
	*/
	default V putIfAbsent(K key, V value) {/*implementation*/}
	/**
	 * If the function returns {@code null} the mapping is removed.
	*/
	default V merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction) {/*implementation*/}
	/**
	 * If the function returns {@code null}, the mapping is removed.
	*/
	default V computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {/*implementation*/}
	/**
	 * If the function returns {@code null} no mapping is recorded.
	*/
	default V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction) {/*implementation*/}
}

public class HashSet<E> extends AbstractSet<E> implements Set<E>, Cloneable, java.io.Serializable {
}

public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, java.io.Serializable {
}

public class Vector<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, java.io.Serializable { 
}

public class Stack<E> extends Vector<E> {
}

public interface Iterator<E> {
	boolean hasNext();
	E next();
}

public class TreeSet<E> extends AbstractSet<E> implements NavigableSet<E>, Cloneable, java.io.Serializable {
	public TreeSet(Comparator<? super E> comparator) {/*implementation*/}
	/**
	 * @throws ClassCastException if the specified object cannot be compared with the elements currently in the set
	*/
	@Override
	public boolean add(E e) {/*implementation*/}
}

public interface NavigableSet<E> extends SortedSet<E> {
	E lower(E e);
	E floor(E e);
	E ceiling(E e);
	E higher(E e);
}

public interface SortedSet<E> extends Set<E> {
}

public interface Deque<E> extends Queue<E>{
	/**
	 * @throws IllegalStateException if the element cannot be added at this time due to capacity restrictions
	*/
	void push(E e);
	/**
	 * @throws NoSuchElementException if this deque is empty
	*/
	E pop();
}

public class ArrayDeque<E> extends AbstractCollection<E> implements Deque<E>, Cloneable, Serializable {
}

public abstract class AbstractCollection<E> implements Collection<E> {
}

public class HashMap<K, V> extends AbstractMap<K, V> implements Map<K, V>, Cloneable, java.io.Serializable {
}

public class TreeMap<K, V> extends AbstractMap<K, V> implements NavigableMap<K, V>, Cloneable, java.io.Serializable {
	/**
	 * @throws ClassCastException if the specified key cannot be compared with the keys currently in the map
	*/
	@Override
	public V put(K key, V value) {/*implementation*/}
}

public interface NavigableMap<K, V> extends SortedMap<K, V> {
}

public interface SortedMap<K, V> extends Map<K, V> {
}

public class LinkedHashMap<K, V> extends HashMap<K, V> implements Map<K, V> {
}

public class Hashtable<K, V> extends Dictionary<K, V> implements Map<K, V>, Cloneable, java.io.Serializable {
}

@FunctionalInterface
public interface Comparator<T> {
	public int compare(T o1, T o2);
	public static <T extends Comparable<? super T>> reverseOrder() {/*implementation*/}
}

public final class Optional<T> {
	public static <T> Optional<T> empty() {/*implementation*/}
	/**
     * @throws NullPointerException if value is null
    */
	public static <T> Optional<T> of (T t) {/*implementation*/}
	public static <T> Optional<T> ofNullable(T t) {/*implementation*/}
	public boolean isPresent() {/*implementation*/}
	/**
	 * @throws NoSuchElementException if there is no value present
	*/
	public T get() {/*implementation*/}
	public void ifPresent(Consumer<? super T> consumer) {/*implementation*/}
	public T orElse(T other) {/*implementation*/}
	public T orElseGet(Supplier<? extends T> other) {/*implementation*/}
	public <X extends Throwable> T orElseThrow(Supplier<? extends X> exceptionSupplier) throws X {/*implementation*/}
	public <U> Optional<U> map(Function<? super T, ? extends U> mapper) {/*implementation*/}
	public Optional<T> filter(Predicate<? super T> predicate) {/*implementation*/}
	public <U> Optional<U> flatMap(Function<? super T, Optional<U>> mapper) {/*implementation*/}
}

public final class OptionalDouble {
	public double getAsDouble() {/*implementation*/}
	public double orElseGet(DoubleSupplier other) {/*implementation*/}
	public <X extends Throwable> double orElseThrow(Supplier<X> exceptionSupplier) throws X {/*implementation*/}
}

public final class OptionalInt {
	public int getAsInt() {/*implementation*/}
	public int orElseGet(IntSupplier other) {/*implementation*/}
	public <X extends Throwable> int orElseThrow(Supplier<X> exceptionSupplier) throws X {/*implementation*/}
}

public final class OptionalLong {
	public long getAsLong() {/*implementation*/}
	public long orElseGet(LongSupplier other) {/*implementation*/}
	public <X extends Throwable> long orElseThrow(Supplier<X> exceptionSupplier) throws X {/*implementation*/}
}

public class DoubleSummaryStatistics implements DoubleConsumer {
	public final long getCount() {/*implementation*/}
	public final double getMax() {/*implementation*/}
	public final double getMin() {/*implementation*/}
}

public class IntSummaryStatistics implements IntConsumer {
	public final long getCount() {/*implementation*/}
	public final int getMax() {/*implementation*/}
	public final int getMin() {/*implementation*/}
}

public class LongSummaryStatistics implements LongConsumer {
	public final long getCount() {/*implementation*/}
	public final long getMax() {/*implementation*/}
	public final long getMin() {/*implementation*/}
}

public final class Locale implements Cloneable, Serializable {
	public static Locale getDefault() {/*implementation*/}
	public static synchronized void setDefault(Locale newLocale) {/*implementation*/}
	public static final class Builder {
		public Builder() {/*implementation*/}
		public Builder setLanguage(Stirng language) {/*implementation*/}
		public Builder setRegion(Stirng region) {/*implementation*/}
		public Locale build() {/*implementation*/}
	}
	public Locale(String language) {/*implementation*/}
	public Locale(String language, String country) {/*implementation*/}
}

public abstract class ResourceBundle {
	public static final ResourceBundle getBundle(String baseName) {/*implementation*/}
	public static final ResourceBundle getBundle(String baseName, Locale locale) {/*implementation*/}
	public final String getString(String key) {/*implementation*/}
	public Set<String> keySet() {/*implementation*/}
	public final Object getObject(String key) {/*implementation*/}
}

public class Properties extends Hashtable<Object, Object> {
	public Properties() {/*implementation*/}
	public String getProperty(String key) {/*implementation*/}
	public String getProperty(String key, String defaultValue) {/*implementation*/}
}

public abstract class ListResourceBundle {
	abstract protected Object[][] getContents();
}