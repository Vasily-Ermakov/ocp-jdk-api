public interface ExecutorService extends Executor {
	Future<?> submit(Runnable task);
	<T> Future<T> submit(Callable<T> task);
	<T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException;
	<T> T invokeAny(Collection<? extends Callable<T>> tasks) throws InterruptedException, ExecutionException;
	void shutdown();
	List<Runnable> shutdownNow();
	boolean isShutdown();
	boolean isTerminated();
	boolean awaitTermination(long timeout, TimeUnit unit);
}

public interface Executor {
	/**
	 * @throws RejectedExecutionException if this task cannot be accepted for execution
	 */ 
	void execute(Runnable command);
}

public class Executors {
	public static ExecutorService newSingleThreadExecutor() {/*implementation*/}
	public static ScheduledExecutorService newSingleThreadScheduledExecutor() {/*implementation*/}
	public static ExecutorService newCachedThreadPool() {/*implementation*/}
	public static ExecutorService newFixedThreadPool(int nThreads) {/*implementation*/}
	public static ScheduledExecutorService newScheduledThreadPool(int corePoolSize) {/*implementation*/}
}

@FunctionalInterface
public interface Callable<V> {
	V call() throws Exception;
}

public class ExecutionException extends Exception {
}

public interface Future<V> {
	boolean isDone();
	boolean isCancelled();
	boolean cancel(boolean mayInterruptIfRunning);
	V get() throws InterruptedException, ExecutionException;
	V get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException;
}

public class TimeoutException extends Exception {
}

public enum TimeUnit {
}

public interface ScheduledExecutorService extends ExecutorService {
	public <V> ScheduledFuture<V> schedule(Callable<V> callable, long delay, TimeUnit unit);
	public ScheduledFuture<?> schedule(Runnable command, long delay, TimeUnit unit);
	public ScheduledFuture<?> scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit);
	public ScheduledFuture<?> scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit);
}

public interface ScheduledFuture<V> extends Delayed, Future<V> {
}

public interface Delayed extends Comparable<Delayed> {
	long getDelay(TimeUnit unit);
}

public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
}

public interface ConcurrentMap<K, V> extends Map<K, V> {
}

public class ConcurrentLinkedDeque<E> extends AbstractCollection<E> implements Deque<E>, Serializable {
}

public class ConcurrentLinkedQueue<E> extends AbstractQueue<E> implements Queue<E>, Serializable {
}

public class ConcurrentSkipListMap<K, V> extends AbstractMap<K, V> implements ConcurrentNavigableMap<K, V>, Cloneable, Serializable {
}

public interface ConcurrentNavigableMap<K, V> extends ConcurrentMap<K, V>, NavigableMap<K, V> {
}

public class ConcurrentSkipListSet<E> extends AbstractSet<E> implements NavigableSet<E>, Cloneable, Serializable {
}

public class CopyOnWriteArrayList<E> implements List<E>, RandomAccess, Cloneable, Serializable {
}

public class CopyOnWriteArraySet<E> extends AbstractSet<E> implements Serializable {
}

public class LinkedBlockingDeque<E> extends AbstractQueue<E> implements AbstractQueue<E> implements BlockingDeque<E>, Serializable {
}

public interface BlockingDeque<E> extends BlockingQueue<E>, Deque<E> {
	boolean offerFirst(E e, long timeout, TimeUnit unit) throws InterruptedException;
	boolean offerLast(E e, long timeout, TimeUnit unit) throws InterruptedException;
	E pollFirst(long timeout, TimeUnit unit) throws InterruptedException;
	E pollLast(long timeout, TimeUnit unit) throws InterruptedException;
}

public class LinkedBlockingQueue<E> extends AbstractQueue<E> implements BlockingQueue<E>, Serializable {
}

public interface BlockingQueue<E> extends Queue<E> {
	boolean offer(E e, long timeout, TimeUnit unit) throws InterruptedException;
	E poll(long timeout, TimeUnit unit) throws InterruptedException;
}

public class CyclicBarrier {
	public CyclicBarrier(int parties) {/*implementation*/}
	public CyclicBarrier(int parties, Runnable barrierAction) {/*implementation*/}
	public int await throws InterruptedException, BrokenBarrierException {/*implementation*/}
}

public abstract class ForkJoinTask<V> implements Future<V>, Serializable {
	public static void invokeAll(ForkJoinTask<?>... tasks) {/*implementation*/}
	public final ForkJoinTask<V> fork() {/*implementation*/}
	public final V join() {/*implementation*/}
}

public abstract class RecursiveAction extends ForkJoinTask<Void> {
	protected abstract void compute();
}

public abstract class RecursiveTask<V> extends ForkJoinTask<V> {
	protected abstract V compute();
}

public class ForkJoinPool extends AbstractExecutorService {
	public ForkJoinPool() {/*implementation*/}
	public <T> T invoke(ForkJoinTask<T> task) {/*implementation*/}
}

public abstract class AbstractExecutorService implements ExecutorService {
}