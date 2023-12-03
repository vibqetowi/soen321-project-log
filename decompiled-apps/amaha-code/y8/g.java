package y8;

import c9.q;
import c9.w;
import com.google.android.exoplayer2.ParserException;
import java.util.regex.Pattern;
/* compiled from: WebvttParserUtil.java */
/* loaded from: classes.dex */
public final class g {
    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    public static float a(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long b(String str) {
        int i6 = w.f5205a;
        String[] split = str.split("\\.", 2);
        long j10 = 0;
        for (String str2 : split[0].split(":", -1)) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (split.length == 2) {
            j11 += Long.parseLong(split[1]);
        }
        return j11 * 1000;
    }

    public static void c(q qVar) {
        boolean z10;
        String str;
        int i6 = qVar.f5187b;
        String d10 = qVar.d();
        if (d10 != null && d10.startsWith("WEBVTT")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            qVar.A(i6);
            String valueOf = String.valueOf(qVar.d());
            if (valueOf.length() != 0) {
                str = "Expected WEBVTT. Got ".concat(valueOf);
            } else {
                str = new String("Expected WEBVTT. Got ");
            }
            throw ParserException.a(str, null);
        }
    }
}
