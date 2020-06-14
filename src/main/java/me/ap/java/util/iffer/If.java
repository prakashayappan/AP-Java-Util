package me.ap.java.util.iffer;

import java.util.function.Supplier;

/*
 * One Liner If Condition
 * 
 * @author Prakash Ayappan
 */
public class If {

	/*
	 * On True
	 */
	public static final void on(Boolean condition, Voider success) {
		if (condition) success.get();
	}

	/*
	 * On True & False
	 */
	public static final void on(Boolean condition, Voider success, Voider failure) {
		if (condition) {
			success.get();
		} else {
			failure.get();
		}
	}

	/*
	 * On True & False with Return
	 */
	public static final <T> T on(Boolean condition, Supplier<T> success, Supplier<T> failure) {
		if (condition) {
			return success.get();
		} else {
			return failure.get();
		}
	}

}
