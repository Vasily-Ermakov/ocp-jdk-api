public interface Stream<T> extends BaseStream<T, Stream<T>> {
	public static <T> Stream<T> empty() {/*implementation*/}
	public static <T> Stream<T> of(T t) {/*implementation*/}
	public static <T> Stream<T> of(T... values) {/*implementation*/}
	public static <T> Stream<T> generate(Supplier<T> s) {/*implementation*/}
	public static <T> Stream<T> iterate(final T seed, final UnaryOperator<T> f) {/*implementation*/}
	boolean allMatch(Predicate<? super T> predicate);
	boolean anyMatch(Predicate<? super T> predicate);
	boolean noneMatch(Predicate<? super T> predicate);
	<R, A> R collect(Collector<? super T, A, R> collector);
	<R> R collect(Supplier<R> supplier, BiConsumer<R, ? super T> accumulator, BiConsumer<R, R> combiner);
	long count();
	Optional<T> findAny();
	Optional<T> findFirst();
	void forEach(Consumer<? super T> action);
	void forEachOrdered(Consumer<? super T> action);
	Optional<T> min(Comparator<? super T> comparator);
	Optional<T> max(Comparator<? super T> comparator);
	Optional<T> reduce(BinaryOperator<T> accumulator);
	T reduce(T identiry, BinaryOperator<T> accumulator);
	<U> U reduce(U identity, BiFunction<U, ? super T, U> accumulator, BinaryOperator<U> combiner);
	Stream<T> filter(Predicate<? super T> predicate);
	Stream<T> distinct();
	Stream<T> limit(long maxSize);
	Stream<T> skip(long n);
	<R> Stream<R> map(Function<? super T, ? super R> mapper>);
	<R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper>);
	Stream<T> sorted();
	Stream<T> sorted(Comparator<? super T> comparator);
	Stream<T> peek(Consumer<? super T> action);
	IntStream mapToInt(ToIntFunction<? super T> mapper);
	LongStream mapToLong(ToLongFunction<? super T> mapper);
	DoubleStream mapToDouble(ToDoubleFunction<? super T> mapper);
	IntStream flatMapToInt(Function<? super T, ? extends IntStream> mapper);
	LongStream flatMapToLong(Function<? super T, ? extends LongStream> mapper);
	DoubleStream flatMapToDouble(Function<? super T, ? extends DoubleStream> mapper);
}

public interface BaseStream<T, S extends BaseStream<T, S>> extends AutoCloseable {
	S parallel();
}

public interface Collector<T, A, R> {
	Set<Characteristics> characteristics();
	enum Characteristics {
	}
}

public final class Collectors {
	public static <T, C extends Collection<T>> Collector<T, ?, C> toCollection(Supplier<C> collectionFactory) {/*implementation*/}
	public static <T> Collector<T, ?, Set<T>> toSet() {/*implementation*/}
	public static <T> Collector<T, ?, List<T>> toList() {/*implementation*/}
	public static <T, K, U> Collector<T, ?, ConcurrentMap<K, U>> toConcurrentMap(Function<? super T, ? extends K> keyMapper, Function<? super T, ? extends U> valueMapper) {/*implementation*/}
	public static <T, K, U> Collector<T, ?, ConcurrentMap<K, U>> toConcurrentMap(Function<? super T, ? extends K> keyMapper, Function<? super T, ? extends U> valueMapper, BinaryOperator<U> mergeFunction) {/*implementation*/}
	public static <T, K, U, M extends ConcurrentMap<K, U>> Collector<T, ?, M> toConcurrentMap(Function<? super T, ? extends K> keyMapper, Function<? super T, ? extends U> valueMapper, BinaryOperator<U> mergeFunction, Supplier<M> mapSupplier) {/*implementation*/}
	public static <T, K> Collector<T, ?, ConcurrentMap<K, List<T>>> groupingByConcurrent(Function<? super T, ? extends K> classifier) {/*implementation*/}
	public static <T, K, A, D> Collector<T, ?, ConcurrentMap<K, D>> groupingByConcurrent(Function<? super T, ? extends K> classifier, Collector<? super T, A, D> downstream) {/*implementation*/}
	public static <T, K, A, D, M extends ConcurrentMap<K, D>> Collector<T, ?, M> groupingByConcurrent(Function<? super T, ? extends K> classifier, Supplier<M> mapFactory, Collector<? super T, A, D> downstream) {/*implementation*/}
	public static <T> Collector<T, ?, Double> averagingDouble(ToDoubleFunction<? super T> mapper) {/*implementation*/}
	public static <T> Collector<T, ?, Double> averagingInt(ToIntFunction<? super T> mapper) {/*implementation*/}
	public static <T> Collector<T, ?, Double> averagingLong(ToLongFunction<? super T> mapper) {/*implementation*/}
	public static <T> Collector<T, ?, Long> counting() {/*implementation*/}
	public static <T, K> Collector<T, ?, Map<K, List<T>>> groupingBy(Function<? super T, ? extends K> classifier) {/*implementation*/}
	public static <T, K, A, D> Collector<T, ?, Map<K, D>> groupingBy(Function<? super T, ? extends K> classifier, Collector<? super T, A, D> downstream) {/*implementation*/}
	public static <T, K, D, A, M extends Map<K, D>> Collector<T, ?, M> groupingBy(Function<? super T, ? extends K> classifier, Supplier<M> mapFactory, Collector<? super T, A, D> downstream) {/*implementation*/}
	public static Collector<CharSequence, ?, String> joining() {/*implementation*/}
	public static Collector<CharSequence, ?, String> joining(CharSequence delimiter) {/*implementation*/}
	public static <T> Collector<T, ?, Optional<T>> maxBy(Comparator<? super T> comparator) {/*implementation*/}
	public static <T> Collector<T, ?, Optional<T>> minBy(Comparator<? super T> comparator) {/*implementation*/}
	public static <T, U, A, R> Collector<T, ?, R> mapping(Function<? super T, ? extends U> mapper, Collector<? super U, A, R> downstream) {/*implementation*/}
	public static <T> Collector<T, ?, Map<Boolean, List<T>>> partitioningBy(Predicate<? super T> predicate) {/*implementation*/}
	public static <T, A, D> Collector<T, ?, Map<Boolean, D>> partitioningBy(Predicate<? super T> predicate, Collector<? super T, A, D> downstream) {/*implementation*/}
	public static <T> Collector<T, ?, DoubleSummaryStatistics> summarizingDouble(ToDoubleFunction<? super T> mapper) {/*implementation*/}
	public static <T> Collector<T, ?, IntSummaryStatistics> summarizingInt(ToIntFunction<? super T> mapper) {/*implementation*/}
	public static <T> Collector<T, ?, LongSummaryStatistics> summarizingLong(ToLongFunction<? super T> mapper) {/*implementation*/}
	public static <T> Collector<T, ?, Double> summingDouble(ToDoubleFunction<? super T> mapper) {/*implementation*/}
	public static <T> Collector<T, ?, Integer> summingInt(ToIntFunction<? super T> mapper) {/*implementation*/}
	public static <T> Collector<T, ?, Long> summingLong(ToLongFunction<? super T> mapper) {/*implementation*/}
	public static <T, K, U> Collector<T, ?, Map<K, U>> toMap(Function<? super T, ? extends K> keyMapper, Function<? super T, ? extends U> valueMapper) {/*implementation*/}
	public static <T, K, U> Collector<T, ?, Map<K, U>> toMap(Function<? super T, ? extends K> keyMapper, Function<? super T, ? extends U> valueMapper, BinaryOperator<U> mergeFunction) {/*implementation*/}
	public static <T, K, U, M extends Map<K, V>> Collector<T, ?, M> toMap(Function<? super T, ? extends K> keyMapper, Function<? super T, ? extends U> valueMapper, BinaryOperator<U> mergeFunction, Supplier<M> mapSupplier) {/*implementation*/}
}

public interface IntStream extends BaseStream<Integer, IntStream> {
	int sum();
	OptionalDouble average();
	public static IntStream empty() {/*implementation*/}
	public static IntStream of(int t) {/*implementation*/}
	public static IntStream of(int... values) {/*implementation*/}
	void forEach(IntConsumer action);
	public static IntStream generate(IntSupplier s) {/*implementation*/}
	public static IntStream iterate(final int seed, final IntUnaryOperator f) {/*implementation*/}
	IntStream limit(long maxSize);
	public static IntStream range(int startInclusive, int endExclusive) {/*implementation*/}
	public static IntStream rangeClosed(int startInclusive, int endInclusive) {/*implementation*/}
	<U> Stream<U> mapToObj(IntFunction<? extends U> mapper);
	IntStream map(IntUnaryOperator mapper);
	LongStream mapToLong(IntToLongFunction mapper);
	DoubleStream mapToDouble(IntToDoubleFunction mapper);
	OptionalInt max();
	OptionalInt min();
	IntSummaryStatistics summaryStatistics();
}

public interface LongStream extends BaseStream<Long, LongStream> {
	long sum();
	OptionalDouble average();
	public static LongStream empty() {/*implementation*/}
	public static LongStream of(int t) {/*implementation*/}
	public static LongStream of(int... values) {/*implementation*/}
	void forEach(LongConsumer action);
	public static LongStream generate(LongSupplier s) {/*implementation*/}
	public static LongStream iterate(final long seed, final LongUnaryOperator f) {/*implementation*/}
	LongStream limit(long maxSize);
	public static LongStream range(long startInclusive, final long endExclusive) {/*implementation*/}
	public static LongStream rangeClosed(long startInclusive, final long endInclusive) {/*implementation*/}
	<U> Stream<U> mapToObj(LongFunction<? extends U> mapper);
	LongStream map(LongUnaryOperator mapper);
	IntStream mapToInt(LongToIntFunction mapper);
	DoubleStream mapToDouble(LongToDoubleFunction mapper);
	OptionalLong max();
	OptionalLong min();
	LongSummaryStatistics summaryStatistics();
}

public interface DoubleStream extends BaseStream<Double, DoubleStream> {
	double sum();
	OptionalDouble average();
	public static DoubleStream empty() {/*implementation*/}
	public static DoubleStream of(int t) {/*implementation*/}
	public static DoubleStream of(int... values) {/*implementation*/}
	void forEach(DoubleConsumer action);
	public static DoubleStream generate(DoubleSupplier s) {/*implementation*/}
	public static DoubleStream iterate(final double seed, final DoubleUnaryOperator f) {/*implementation*/}
	DoubleStream limit(long maxSize);
	<U> Stream<U> mapToObj(DoubleFunction<? extends U> mapper);
	DoubleStream map(DoubleUnaryOperator mapper);
	IntStream mapToLong(DoubleToLongFunction mapper);
	LongStream mapToLong(DoubleToLongFunction mapper);
	OptionalDouble max();
	OptionalDouble min();
	DoubleSummaryStatistics summaryStatistics();
}
