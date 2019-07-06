@FunctionalInterface
public interface Predicate<T> {
	boolean test();
}

@FunctionalInterface
public interface Consumer<T> {
	void accept(T t);
}

@FunctionalInterface
public interface Supplier<T> {
	T get();
}

@FunctionalInterface
public interface UnaryOperator<T> extends Function<T, T> {
}

@FunctionalInterface
public interface Function<T, R> {
	R apply(T t);
}

@FunctionalInterface
public interface BiFunction<T, U, R> {
	R apply(T t, U u);
}

@FunctionalInterface
public interface BiConsumer<T, U> {
	void accept(T t, U u);
}

@FunctionalInterface
public interface BiPredicate<T, U> {
	void boolean(T t, U u);
}

@FunctionalInterface
public interface BinaryOperator<T> extends BiFunction<T, T, T> {
}

@FunctionalInterface
public interface ToIntFunction<T> {
	int applyAsInt(T value);
}

@FunctionalInterface
public interface ToLongFunction<T> {
	long applyAsLong(T value);
}

@FunctionalInterface
public interface ToDoubleFunction<T> {
	double applyAsDouble(T value);
}

@FunctionalInterface
public interface IntConsumer {
	void accept(int value);
}

@FunctionalInterface
public interface LongConsumer {
	void accept(long value);
}

@FunctionalInterface
public interface DoubleConsumer {
	void accept(double value);
}

@FunctionalInterface
public interface IntSupplier {
	int getAsInt();
}

@FunctionalInterface
public interface LongSupplier {
	long getAsLong();
}

@FunctionalInterface
public interface DoubleSupplier {
	double getAsDouble();
}

@FunctionalInterface
public interface IntUnaryOperator {
	int applyAsInt(int operand);
}

@FunctionalInterface
public interface LongUnaryOperator {
	long applyAsLong(long operand);
}

@FunctionalInterface
public interface DoubleUnaryOperator {
	double applyAsDouble(double operand);
}

@FunctionalInterface
public interface IntFunction<R> {
	R apply(int value);
}

@FunctionalInterface
public interface LongFunction<R> {
	R apply(long value);
}

@FunctionalInterface
public interface DoubleFunction<R> {
	R apply(double value);
}

@FunctionalInterface
public interface IntToLongFunction {
	long applyAsLong(int value);
}

@FunctionalInterface
public interface IntToDoubleFunction {
	double applyAsDouble(int value);
}

@FunctionalInterface
public interface LongToIntFunction {
	int applyAsInt(long value);
}

@FunctionalInterface
public interface LongToDoubleFunction {
	double applyAsDouble(long value);
}

@FunctionalInterface
public interface DoubleToIntFunction {
	int applyAsInt(double value);
}

@FunctionalInterface
public interface DoubleToLongFunction {
	long applyAsLong(double value);
}

@FunctionalInterface
public interface BooleanSupplier() {
	boolean getaAsBoolean();
}

@FunctionalInterface
public interface ObjDoubleConsumer<T> {
	void accept(T t, double value);
}

@FunctionalInterface
public interface ObjIntConsumer<T> {
	void accept(T t, int value);
}

@FunctionalInterface
public interface ObjLongConsumer<T> {
	void accept(T t, long value);
}