package gv;

import java.util.NoSuchElementException;
/* compiled from: _Strings.kt */
/* loaded from: classes2.dex */
public class s extends r {
    public static final char j1(String str) {
        boolean z10;
        if (str.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return str.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static final String k1(int i6, String str) {
        boolean z10;
        kotlin.jvm.internal.i.g(str, "<this>");
        if (i6 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int length = str.length();
            if (i6 > length) {
                i6 = length;
            }
            String substring = str.substring(0, i6);
            kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(defpackage.c.q("Requested character count ", i6, " is less than zero.").toString());
    }
}
