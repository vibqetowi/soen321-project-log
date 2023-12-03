package j$.time.format;

import j$.time.AbstractC0689a;
import j$.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class l implements InterfaceC0710g {

    /* renamed from: d  reason: collision with root package name */
    static final String[] f20903d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};

    /* renamed from: e  reason: collision with root package name */
    static final l f20904e = new l("+HH:MM:ss", "Z");
    static final l f = new l("+HH:MM:ss", "0");

    /* renamed from: a  reason: collision with root package name */
    private final String f20905a;

    /* renamed from: b  reason: collision with root package name */
    private final int f20906b;

    /* renamed from: c  reason: collision with root package name */
    private final int f20907c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(String str, String str2) {
        Objects.requireNonNull(str, "pattern");
        Objects.requireNonNull(str2, "noOffsetText");
        int i6 = 0;
        while (true) {
            String[] strArr = f20903d;
            if (i6 >= 22) {
                throw new IllegalArgumentException("Invalid zone offset pattern: " + str);
            } else if (strArr[i6].equals(str)) {
                this.f20906b = i6;
                this.f20907c = i6 % 11;
                this.f20905a = str2;
                return;
            } else {
                i6++;
            }
        }
    }

    private static void a(boolean z10, int i6, StringBuilder sb2) {
        sb2.append(z10 ? ":" : "");
        sb2.append((char) ((i6 / 10) + 48));
        sb2.append((char) ((i6 % 10) + 48));
    }

    private static boolean b(CharSequence charSequence, boolean z10, int i6, int[] iArr) {
        int i10 = iArr[0];
        if (i10 < 0) {
            return true;
        }
        if (z10 && i6 != 1) {
            int i11 = i10 + 1;
            if (i11 > charSequence.length() || charSequence.charAt(i10) != ':') {
                return false;
            }
            i10 = i11;
        }
        if (i10 + 2 > charSequence.length()) {
            return false;
        }
        int i12 = i10 + 1;
        char charAt = charSequence.charAt(i10);
        int i13 = i12 + 1;
        char charAt2 = charSequence.charAt(i12);
        if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
            int i14 = (charAt2 - '0') + ((charAt - '0') * 10);
            if (i14 >= 0 && i14 <= 59) {
                iArr[i6] = i14;
                iArr[0] = i13;
                return true;
            }
        }
        return false;
    }

    private static void c(CharSequence charSequence, boolean z10, int[] iArr) {
        if (!z10) {
            e(charSequence, 1, 2, iArr);
        } else if (b(charSequence, false, 1, iArr)) {
        } else {
            iArr[0] = ~iArr[0];
        }
    }

    private static void d(CharSequence charSequence, boolean z10, boolean z11, int[] iArr) {
        if (b(charSequence, z10, 2, iArr) || !z11) {
            return;
        }
        iArr[0] = ~iArr[0];
    }

    private static void e(CharSequence charSequence, int i6, int i10, int[] iArr) {
        int i11;
        int i12 = iArr[0];
        char[] cArr = new char[i10];
        int i13 = 0;
        int i14 = 0;
        while (i13 < i10 && (i11 = i12 + 1) <= charSequence.length()) {
            char charAt = charSequence.charAt(i12);
            if (charAt < '0' || charAt > '9') {
                i12 = i11 - 1;
                break;
            }
            cArr[i13] = charAt;
            i14++;
            i13++;
            i12 = i11;
        }
        if (i14 < i6) {
            iArr[0] = ~iArr[0];
            return;
        }
        switch (i14) {
            case 1:
                iArr[1] = cArr[0] - '0';
                break;
            case 2:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                break;
            case 3:
                iArr[1] = cArr[0] - '0';
                iArr[2] = (cArr[2] - '0') + ((cArr[1] - '0') * 10);
                break;
            case 4:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                iArr[2] = (cArr[3] - '0') + ((cArr[2] - '0') * 10);
                break;
            case 5:
                iArr[1] = cArr[0] - '0';
                iArr[2] = (cArr[2] - '0') + ((cArr[1] - '0') * 10);
                iArr[3] = (cArr[4] - '0') + ((cArr[3] - '0') * 10);
                break;
            case 6:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                iArr[2] = (cArr[3] - '0') + ((cArr[2] - '0') * 10);
                iArr[3] = (cArr[5] - '0') + ((cArr[4] - '0') * 10);
                break;
        }
        iArr[0] = i12;
    }

    @Override // j$.time.format.InterfaceC0710g
    public final boolean l(A a10, StringBuilder sb2) {
        Long e10 = a10.e(j$.time.temporal.a.OFFSET_SECONDS);
        boolean z10 = false;
        if (e10 == null) {
            return false;
        }
        int i6 = AbstractC0689a.i(e10.longValue());
        if (i6 != 0) {
            int abs = Math.abs((i6 / 3600) % 100);
            int abs2 = Math.abs((i6 / 60) % 60);
            int abs3 = Math.abs(i6 % 60);
            int length = sb2.length();
            sb2.append(i6 < 0 ? "-" : "+");
            if ((this.f20906b < 11) || abs >= 10) {
                a(false, abs, sb2);
            } else {
                sb2.append((char) (abs + 48));
            }
            int i10 = this.f20907c;
            if ((i10 >= 3 && i10 <= 8) || ((i10 >= 9 && abs3 > 0) || (i10 >= 1 && abs2 > 0))) {
                a(i10 > 0 && i10 % 2 == 0, abs2, sb2);
                abs += abs2;
                if (i10 == 7 || i10 == 8 || (i10 >= 5 && abs3 > 0)) {
                    if (i10 > 0 && i10 % 2 == 0) {
                        z10 = true;
                    }
                    a(z10, abs3, sb2);
                    abs += abs3;
                }
            }
            if (abs == 0) {
                sb2.setLength(length);
            }
            return true;
        }
        sb2.append(this.f20905a);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
        if (r19 == r9) goto L78;
     */
    @Override // j$.time.format.InterfaceC0710g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m(x xVar, CharSequence charSequence, int i6) {
        int i10;
        long j10;
        j$.time.temporal.a aVar;
        int i11;
        int i12;
        int i13;
        int i14;
        int length = charSequence.length();
        int length2 = this.f20905a.length();
        if (length2 != 0) {
            if (i6 == length) {
                return ~i6;
            }
            if (xVar.s(charSequence, i6, this.f20905a, 0, length2)) {
                i10 = i6 + length2;
                j10 = 0;
                aVar = j$.time.temporal.a.OFFSET_SECONDS;
                return xVar.o(aVar, j10, i6, i10);
            }
        }
        char charAt = charSequence.charAt(i6);
        if (charAt == '+' || charAt == '-') {
            int i15 = charAt == '-' ? -1 : 1;
            int i16 = this.f20907c;
            boolean z10 = i16 > 0 && i16 % 2 == 0;
            int i17 = this.f20906b;
            boolean z11 = i17 < 11;
            int[] iArr = new int[4];
            iArr[0] = i6 + 1;
            if (!xVar.l()) {
                if (z11) {
                    if (z10 || (i17 == 0 && length > (i14 = i6 + 3) && charSequence.charAt(i14) == ':')) {
                        i17 = 10;
                        z10 = true;
                    } else {
                        i17 = 9;
                    }
                } else if (z10 || (i17 == 11 && length > (i13 = i6 + 3) && (charSequence.charAt(i6 + 2) == ':' || charSequence.charAt(i13) == ':'))) {
                    i17 = 21;
                    z10 = true;
                } else {
                    i17 = 20;
                }
                aVar = j$.time.temporal.a.OFFSET_SECONDS;
                i10 = i6;
                j10 = 0;
                return xVar.o(aVar, j10, i6, i10);
            }
            switch (i17) {
                case 0:
                case 11:
                    c(charSequence, z11, iArr);
                    break;
                case 1:
                case 2:
                case 13:
                    c(charSequence, z11, iArr);
                    d(charSequence, z10, false, iArr);
                    break;
                case 3:
                case 4:
                case 15:
                    c(charSequence, z11, iArr);
                    d(charSequence, z10, true, iArr);
                    break;
                case 5:
                case 6:
                case 17:
                    c(charSequence, z11, iArr);
                    d(charSequence, z10, true, iArr);
                    b(charSequence, z10, 3, iArr);
                    break;
                case 7:
                case 8:
                case 19:
                    c(charSequence, z11, iArr);
                    d(charSequence, z10, true, iArr);
                    if (!b(charSequence, z10, 3, iArr)) {
                        iArr[0] = ~iArr[0];
                        break;
                    }
                    break;
                case 9:
                case 10:
                case 21:
                    c(charSequence, z11, iArr);
                    if (b(charSequence, z10, 2, iArr)) {
                        b(charSequence, z10, 3, iArr);
                        break;
                    }
                    break;
                case 12:
                    e(charSequence, 1, 4, iArr);
                    break;
                case 14:
                    e(charSequence, 3, 4, iArr);
                    break;
                case 16:
                    e(charSequence, 3, 6, iArr);
                    break;
                case 18:
                    e(charSequence, 5, 6, iArr);
                    break;
                case 20:
                    e(charSequence, 1, 6, iArr);
                    break;
            }
            int i18 = iArr[0];
            if (i18 > 0) {
                int i19 = iArr[1];
                if (i19 > 23 || (i11 = iArr[2]) > 59 || (i12 = iArr[3]) > 59) {
                    throw new j$.time.d("Value out of range: Hour[0-23], Minute[0-59], Second[0-59]");
                }
                aVar = j$.time.temporal.a.OFFSET_SECONDS;
                i10 = i18;
                j10 = ((i11 * 60) + (i19 * 3600) + i12) * i15;
                return xVar.o(aVar, j10, i6, i10);
            }
        }
        if (length2 != 0) {
            return ~i6;
        }
        aVar = j$.time.temporal.a.OFFSET_SECONDS;
        i10 = i6;
        j10 = 0;
        return xVar.o(aVar, j10, i6, i10);
    }

    public final String toString() {
        String replace = this.f20905a.replace("'", "''");
        String str = f20903d[this.f20906b];
        return "Offset(" + str + ",'" + replace + "')";
    }
}
