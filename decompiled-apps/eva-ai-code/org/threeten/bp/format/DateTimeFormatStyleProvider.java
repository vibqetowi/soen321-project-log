package org.threeten.bp.format;

import java.util.Locale;
import org.threeten.bp.chrono.Chronology;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class DateTimeFormatStyleProvider {
    public abstract DateTimeFormatter getFormatter(FormatStyle formatStyle, FormatStyle formatStyle2, Chronology chronology, Locale locale);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DateTimeFormatStyleProvider getInstance() {
        return new SimpleDateTimeFormatStyleProvider();
    }

    public Locale[] getAvailableLocales() {
        throw new UnsupportedOperationException();
    }
}
