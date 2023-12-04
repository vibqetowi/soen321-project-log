package io.sentry.util;

import java.text.StringCharacterIterator;
import java.util.Locale;
/* loaded from: classes4.dex */
public final class StringUtils {
    private StringUtils() {
    }

    public static String getStringAfterDot(String str) {
        int i;
        if (str != null) {
            int lastIndexOf = str.lastIndexOf(".");
            return (lastIndexOf < 0 || str.length() <= (i = lastIndexOf + 1)) ? str : str.substring(i);
        }
        return null;
    }

    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase(Locale.ROOT) + str.substring(1).toLowerCase(Locale.ROOT);
    }

    public static String removeSurrounding(String str, String str2) {
        return (str == null || str2 == null || !str.startsWith(str2) || !str.endsWith(str2)) ? str : str.substring(str2.length(), str.length() - str2.length());
    }

    public static String byteCountToString(long j) {
        if (-1000 < j && j < 1000) {
            return j + " B";
        }
        StringCharacterIterator stringCharacterIterator = new StringCharacterIterator("kMGTPE");
        while (true) {
            if (j > -999950 && j < 999950) {
                return String.format(Locale.ROOT, "%.1f %cB", Double.valueOf(j / 1000.0d), Character.valueOf(stringCharacterIterator.current()));
            }
            j /= 1000;
            stringCharacterIterator.next();
        }
    }
}
