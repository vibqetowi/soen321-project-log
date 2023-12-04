package org.threeten.bp.format;

import org.threeten.bp.DateTimeException;
/* loaded from: classes5.dex */
public class DateTimeParseException extends DateTimeException {
    private static final long serialVersionUID = 4304633501674722597L;
    private final int errorIndex;
    private final String parsedString;

    public DateTimeParseException(String str, CharSequence charSequence, int i) {
        super(str);
        this.parsedString = charSequence.toString();
        this.errorIndex = i;
    }

    public DateTimeParseException(String str, CharSequence charSequence, int i, Throwable th) {
        super(str, th);
        this.parsedString = charSequence.toString();
        this.errorIndex = i;
    }

    public String getParsedString() {
        return this.parsedString;
    }

    public int getErrorIndex() {
        return this.errorIndex;
    }
}
