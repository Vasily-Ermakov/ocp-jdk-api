public abstract class NumberFormat extends Format {
	public final static NumberFormat getInstance() {/*implementation*/}
	public static NumberFormat getInstance(Locale locale) {/*implementation*/}
	public final static NumberFormat getNumberInstance() {/*implementation*/}
	public static NumberFormat getNumberInstance(Locale inLocale) {/*implementation*/}
	public final static NumberFormat getPercentInstance() {/*implementation*/}
	public static NumberFormat getPercentInstance(Locale inLocale) {/*implementation*/}
	public final static NumberFormat getIntegerInstance(Locale inLocale) {/*implementation*/}
	public static NumberFormat getIntegerInstance(Locale inLocale) {/*implementation*/}
	public final String format(long number) {/*implementation*/}
	public final String format(double number) {/*implementation*/}
	/**
	 * @exception ParseException if the beginning of the specified string cannot be parsed.
	 */
	public Number parse(String source) throws ParseException {/*implementation*/}
}

public abstract class Format implements Serializable, Cloneable {
}