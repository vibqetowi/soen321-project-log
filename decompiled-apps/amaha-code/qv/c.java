package qv;

import hs.k;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/* compiled from: dates.kt */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f30143a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f30144b;

    /* renamed from: c  reason: collision with root package name */
    public static final DateFormat[] f30145c;

    /* compiled from: dates.kt */
    /* loaded from: classes2.dex */
    public static final class a extends ThreadLocal<DateFormat> {
        @Override // java.lang.ThreadLocal
        public final DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(mv.b.f25759e);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f30144b = strArr;
        f30145c = new DateFormat[strArr.length];
    }

    public static final Date a(String str) {
        boolean z10;
        kotlin.jvm.internal.i.g(str, "<this>");
        if (str.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = f30143a.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        String[] strArr = f30144b;
        synchronized (strArr) {
            int length = strArr.length;
            int i6 = 0;
            while (i6 < length) {
                int i10 = i6 + 1;
                DateFormat[] dateFormatArr = f30145c;
                DateFormat dateFormat = dateFormatArr[i6];
                if (dateFormat == null) {
                    dateFormat = new SimpleDateFormat(f30144b[i6], Locale.US);
                    dateFormat.setTimeZone(mv.b.f25759e);
                    dateFormatArr[i6] = dateFormat;
                }
                parsePosition.setIndex(0);
                Date parse2 = dateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
                i6 = i10;
            }
            k kVar = k.f19476a;
            return null;
        }
    }
}
