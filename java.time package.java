public final class LocalDate implements Temporal, TemporalAdjuster, ChronoLocalDate, Serializable {
	private LocalDate(int year, int month, int dayOfMonth) {/*implementation*/}
	public static LocalDate now() {/*implementation*/}
	public static LocalDate of(int year, int month, int dayOfMonth) {/*implementation*/}
	public static LocalDate of(int year, Month month, int dayOfMonth) {/*implementation*/}
	public static LocalDate parse(CharSequence text) {/*implementation*/}
	public static LocalDate parse(CharSequence text, DateTimeFormatter formatter) {/*implementation*/}
	public LocalDate plusDays(long daysToAdd) {/*implementation*/}
	public LocalDate minusDays(long daysToSubtract) {/*implementation*/}
	public LocalDate plusWeeks(long weeksToAdd) {/*implementation*/}
	public LocalDate minusWeeks(long weeksToSubtract) {/*implementation*/}
	/**
	 * This method adds the specified amount to the months field in three steps:
     * <ol>
     * <li>Add the input months to the month-of-year field</li>
     * <li>Check if the resulting date would be invalid</li>
     * <li>Adjust the day-of-month to the last valid day if necessary</li>
     * </ol>
	 */
	public LocalDate plusMonths(long monthToAdd) {/*implementation*/}
	/**
	 * This method subtracts the specified amount from the months field in three steps:
     * <ol>
     * <li>Subtract the input months from the month-of-year field</li>
     * <li>Check if the resulting date would be invalid</li>
     * <li>Adjust the day-of-month to the last valid day if necessary</li>
     * </ol>
     * <p>
	 */
	public LocalDate minusMonths(long monthToSubtract) {/*implementation*/}
	/**
	 * This method adds the specified amount to the years field in three steps:
     * <ol>
     * <li>Add the input years to the year field</li>
     * <li>Check if the resulting date would be invalid</li>
     * <li>Adjust the day-of-month to the last valid day if necessary</li>
     * </ol>
	 */
	public LocalDate plusYears(long yearsToAdd) {/*implementation*/}
	/**
     * This method subtracts the specified amount from the years field in three steps:
     * <ol>
     * <li>Subtract the input years from the year field</li>
     * <li>Check if the resulting date would be invalid</li>
     * <li>Adjust the day-of-month to the last valid day if necessary</li>
     * </ol>
	 */
	public LocalDate minusYears(long yearsToSubtract) {/*implementation*/}
}

public final class LocalTime implements Temporal, TemporalAdjuster, Comparable<LocalTime>, Serializable {
	public static LocalTime now() {/*implementation*/}
	public static LocalTime of(int hour, int minute) {/*implementation*/}
	public static LocalTime of(int hour, int minute, int second) {/*implementation*/}
	public static LocalTime of(int hour, int minute, int second, int nanoOfSecond) {/*implementation*/}
	public static LocalTime parse(CharSequence text) {/*implementation*/}
	public static LocalTime parse(CharSequence text, DateTimeFormatter formatter) {/*implementation*/}
	public LocalTime plusHours(long hoursToAdd) {/*implementation*/}
	public LocalTime minusHours(long hoursToSubtract) {/*implementation*/}
	public LocalTime plusMinutes(long minutesToAdd) {/*implementation*/}
	public LocalTime minusMinutes(long minutesToSubtract) {/*implementation*/}
	public LocalTime plusSeconds(long secondsToAdd) {/*implementation*/}
	public LocalTime minusSeconds(long secondsToSubtract) {/*implementation*/}
	public LocalTime plusNanos(long nanosToAdd) {/*implementation*/}
	public LocalTime minusNanos(long nanosToSubtract) {/*implementation*/}
	public String format(DateTimeFormatter formatter) {/*implementation*/}
}

public final class LocalDateTime implements Temporal, TemporalAdjuster, ChronoLocalDateTime<LocalDate>, Serializable {
	public static LocalDateTime now() {/*implementation*/}
	public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute) {/*implementation*/}
	public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second) {/*implementation*/}
	public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond) {/*implementation*/}
	public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute) {/*implementation*/}
	public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute, int second) {/*implementation*/}
	public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond) {/*implementation*/}
	public static LocalDateTime of(LocalDate date, LocalTime time) {/*implementation*/}
	public static LocalDateTime parse(CharSequence text) {/*implementation*/}
	public static LocalDateTime parse(CharSequence text, DateTimeFormatter formatter) {/*implementation*/}
	public LocalDateTime plusDays(long days) {/*implementation*/}
	public LocalDateTime minusDays(long days) {/*implementation*/}
	public LocalDateTime plusWeeks(long weeks) {/*implementation*/}
	public LocalDateTime minusWeeks(long weeks) {/*implementation*/}
	public LocalDateTime plusMonths(long month) {/*implementation*/}
	public LocalDateTime minusMonths(long month) {/*implementation*/}
	public LocalDateTime plusYears(long years) {/*implementation*/}
	public LocalDateTime minusYears(long years) {/*implementation*/}
	public LocalDateTime plusHours(long hours) {/*implementation*/}
	public LocalDateTime minusHours(long hours) {/*implementation*/}
	public LocalDateTime plusMinutes(long minutes) {/*implementation*/}
	public LocalDateTime minusMinutes(long minutes) {/*implementation*/}
	public LocalDateTime plusSeconds(long seconds) {/*implementation*/}
	public LocalDateTime minusSeconds(long seconds) {/*implementation*/}
	public LocalDateTime plusNanos(long nanos) {/*implementation*/}
	public LocalDateTime minusNanos(long nanos) {/*implementation*/}
}

public final class ZonedDateTime implements Temporal, ChronoZonedDateTime<LocalDate>, Serializable {
	public static ZonedDateTime now() {/*implementation*/}
	public static ZonedDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond, ZoneId zone) {/*implementation*/}
	public static ZonedDateTime of(LocalDate date, LocalTime time, ZoneId zone) {/*implementation*/}
	public static ZonedDateTime of(LocalDateTime localDateTime, ZoneId zone) {/*implementation*/}
	public static ZonedDateTime parse(CharSequence text) {/*implementation*/}
	public static ZonedDateTime parse(CharSequence text, DateTimeFormatter formatter) {/*implementation*/}
	public ZonedDateTime plusDays(long days) {/*implementation*/}
	public ZonedDateTime minusDays(long days) {/*implementation*/}
	public ZonedDateTime plusWeeks(long weeks) {/*implementation*/}
	public ZonedDateTime minusWeeks(long weeks) {/*implementation*/}
	public ZonedDateTime plusMonths(long month) {/*implementation*/}
	public ZonedDateTime minusMonths(long month) {/*implementation*/}
	public ZonedDateTime plusYears(long years) {/*implementation*/}
	public ZonedDateTime minusYears(long years) {/*implementation*/}
	public ZonedDateTime plusHours(long hours) {/*implementation*/}
	public ZonedDateTime minusHours(long hours) {/*implementation*/}
	public ZonedDateTime plusMinutes(long minutes) {/*implementation*/}
	public ZonedDateTime minusMinutes(long minutes) {/*implementation*/}
	public ZonedDateTime plusSeconds(long seconds) {/*implementation*/}
	public ZonedDateTime minusSeconds(long seconds) {/*implementation*/}
	public ZonedDateTime plusNanos(long nanos) {/*implementation*/}
	public ZonedDateTime minusNanos(long nanos) {/*implementation*/}
}

public enum Month implements TemporalAccessor, TemporalAdjuster {
}

public abstract class ZoneId implements Serializable {
	public static ZoneId of(String zoneId) {/*implementation*/}
}

public final class Period implements ChronoPeriod, Serializable {
	public static Period of(int years, int months, int days) {/*implementation*/}
	public static Period ofDays(int days) {/*implementation*/}
	public static Period ofMonths(int months) {/*implementation*/}
	public static Period ofWeeks(int weeks) {/*implementation*/}
	public static Period ofYears(int years) {/*implementation*/}
}

public interface ChronoPeriod extends TemporalAmount {
}

public interface TemporalAmount {
}

public interface Temporal extends TemporalAccessor {
	default Temporal plus(TemporalAmount amount) {/*implementation*/}
}

public final class Duration implements TemporalAmount, Comparable<Duration>, Serializable {
	public static Duration of(long amount, Temporal unit) {/*implementation*/}
	public static Duration ofDays(long days) {/*implementation*/}
	public static Duration ofHours(long hours) {/*implementation*/}
	public static Duration ofMinutes(long minutes) {/*implementation*/}
	public static Duration ofSeconds(long seconds) {/*implementation*/}
	public static Duration ofMillis(long millis) {/*implementation*/}
	public static Duration ofNanos(long nanos) {/*implementation*/}
	public static Duration between(Temporal startInclusive, Temporal endExclusive) {/*implementation*/}
	public long toMillis() {/*implementation*/}
}

public interface TemporalUnit {
}

public enum ChronoUnit implements TemporalUnit {
}

public final class Instant implements Temporal, TemporalAdjuster, Comparable<Instant>, Serializable {
	public static Instant now() {/*implementation*/}
	public static Instant ofEpochSecond(long epochSecond) {/*implementation*/}
}

public interface ChronoZonedDateTime<D extends ChronoLocalDate> extends Temporal, Comparable<ChronoZonedDateTime<?>> {
	default Instant toInstant() {/*implementation*/}
	default Stirng format(DateTimeFormatter formatter) {/*implementation*/}
}

public interface ChronoLocalDate extends Temporal, TemporalAdjuster, Comparable<ChronoLocalDate> {
	default String format(DateTimeFormatter formatter) {/*implementation*/}
}

public interface ChronoLocalDateTime<D extends ChronoLocalDate> extends Temporal, TemporalAdjuster, Comparable<ChronoLocalDateTime<?>> {
	default Stirng format(DateTimeFormatter formatter) {/*implementation*/}
}