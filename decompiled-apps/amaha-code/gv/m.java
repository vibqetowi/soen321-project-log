package gv;

import androidx.recyclerview.widget.LinearLayoutManager;
/* compiled from: StringNumberConversions.kt */
/* loaded from: classes2.dex */
public class m extends l {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r3 == '+') goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Integer w0(String str) {
        int i6;
        int i10;
        boolean z10;
        int i11;
        kotlin.jvm.internal.i.g(str, "<this>");
        ca.a.x(10);
        int length = str.length();
        if (length != 0) {
            int i12 = 0;
            char charAt = str.charAt(0);
            if (kotlin.jvm.internal.i.i(charAt, 48) < 0) {
                i6 = 1;
                if (length != 1) {
                    if (charAt == '-') {
                        i10 = LinearLayoutManager.INVALID_OFFSET;
                        z10 = true;
                        int i13 = -59652323;
                        while (i6 < length) {
                            int digit = Character.digit((int) str.charAt(i6), 10);
                            if (digit >= 0 && ((i12 >= i13 || (i13 == -59652323 && i12 >= (i13 = i10 / 10))) && (i11 = i12 * 10) >= i10 + digit)) {
                                i12 = i11 - digit;
                                i6++;
                            }
                        }
                        if (!z10) {
                            return Integer.valueOf(i12);
                        }
                        return Integer.valueOf(-i12);
                    }
                }
            } else {
                i6 = 0;
            }
            i10 = -2147483647;
            z10 = false;
            int i132 = -59652323;
            while (i6 < length) {
            }
            if (!z10) {
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r4 == '+') goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Long x0(String str) {
        int i6;
        long j10;
        ca.a.x(10);
        int length = str.length();
        if (length != 0) {
            boolean z10 = false;
            char charAt = str.charAt(0);
            if (kotlin.jvm.internal.i.i(charAt, 48) < 0) {
                i6 = 1;
                if (length != 1) {
                    if (charAt == '-') {
                        j10 = Long.MIN_VALUE;
                        z10 = true;
                        long j11 = 0;
                        long j12 = -256204778801521550L;
                        while (i6 < length) {
                            int digit = Character.digit((int) str.charAt(i6), 10);
                            if (digit >= 0) {
                                if (j11 < j12) {
                                    if (j12 == -256204778801521550L) {
                                        j12 = j10 / 10;
                                        if (j11 < j12) {
                                        }
                                    }
                                }
                                long j13 = j11 * 10;
                                long j14 = digit;
                                if (j13 >= j10 + j14) {
                                    j11 = j13 - j14;
                                    i6++;
                                }
                            }
                        }
                        if (!z10) {
                            return Long.valueOf(j11);
                        }
                        return Long.valueOf(-j11);
                    }
                }
            } else {
                i6 = 0;
            }
            j10 = -9223372036854775807L;
            long j112 = 0;
            long j122 = -256204778801521550L;
            while (i6 < length) {
            }
            if (!z10) {
            }
        }
        return null;
    }
}
