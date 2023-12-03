package j$.time.format;

import j$.time.AbstractC0689a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class j implements InterfaceC0710g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f20896a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f20897b;

    public /* synthetic */ j(Object obj, int i6) {
        this.f20896a = i6;
        this.f20897b = obj;
    }

    private static void a(StringBuilder sb2, int i6) {
        sb2.append((char) ((i6 / 10) + 48));
        sb2.append((char) ((i6 % 10) + 48));
    }

    static int b(CharSequence charSequence, int i6) {
        char charAt = charSequence.charAt(i6);
        if (charAt < '0' || charAt > '9') {
            return -1;
        }
        return charAt - '0';
    }

    @Override // j$.time.format.InterfaceC0710g
    public final boolean l(A a10, StringBuilder sb2) {
        int i6 = this.f20896a;
        Object obj = this.f20897b;
        switch (i6) {
            case 0:
                Long e10 = a10.e(j$.time.temporal.a.OFFSET_SECONDS);
                if (e10 == null) {
                    return false;
                }
                sb2.append("GMT");
                int i10 = AbstractC0689a.i(e10.longValue());
                if (i10 != 0) {
                    int abs = Math.abs((i10 / 3600) % 100);
                    int abs2 = Math.abs((i10 / 60) % 60);
                    int abs3 = Math.abs(i10 % 60);
                    sb2.append(i10 < 0 ? "-" : "+");
                    if (((H) obj) == H.FULL) {
                        a(sb2, abs);
                        sb2.append(':');
                        a(sb2, abs2);
                        if (abs3 == 0) {
                            return true;
                        }
                    } else {
                        if (abs >= 10) {
                            sb2.append((char) ((abs / 10) + 48));
                        }
                        sb2.append((char) ((abs % 10) + 48));
                        if (abs2 == 0 && abs3 == 0) {
                            return true;
                        }
                        sb2.append(':');
                        a(sb2, abs2);
                        if (abs3 == 0) {
                            return true;
                        }
                    }
                    sb2.append(':');
                    a(sb2, abs3);
                    return true;
                }
                return true;
            default:
                sb2.append((String) obj);
                return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:
        if (r2 >= 0) goto L27;
     */
    @Override // j$.time.format.InterfaceC0710g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m(x xVar, CharSequence charSequence, int i6) {
        j$.time.temporal.a aVar;
        long j10;
        x xVar2;
        int i10;
        int i11;
        int b10;
        int i12;
        int i13;
        int i14;
        int b11;
        int i15;
        int i16 = this.f20896a;
        Object obj = this.f20897b;
        switch (i16) {
            case 0:
                int length = charSequence.length();
                if (xVar.s(charSequence, i6, "GMT", 0, 3)) {
                    int i17 = i6 + 3;
                    if (i17 != length) {
                        char charAt = charSequence.charAt(i17);
                        if (charAt == '+') {
                            i11 = 1;
                        } else {
                            i11 = charAt == '-' ? -1 : -1;
                        }
                        int i18 = i17 + 1;
                        int i19 = 0;
                        if (((H) obj) == H.FULL) {
                            int i20 = i18 + 1;
                            int b12 = b(charSequence, i18);
                            int i21 = i20 + 1;
                            int b13 = b(charSequence, i20);
                            if (b12 >= 0 && b13 >= 0) {
                                int i22 = i21 + 1;
                                if (charSequence.charAt(i21) == ':') {
                                    b10 = (b12 * 10) + b13;
                                    int i23 = i22 + 1;
                                    int b14 = b(charSequence, i22);
                                    i14 = i23 + 1;
                                    int b15 = b(charSequence, i23);
                                    if (b14 >= 0 && b15 >= 0) {
                                        i13 = (b14 * 10) + b15;
                                        int i24 = i14 + 2;
                                        if (i24 < length && charSequence.charAt(i14) == ':') {
                                            b11 = b(charSequence, i14 + 1);
                                            i15 = b(charSequence, i24);
                                            if (b11 >= 0) {
                                            }
                                        }
                                        j10 = ((i13 * 60) + (b10 * 3600) + i19) * i11;
                                        aVar = j$.time.temporal.a.OFFSET_SECONDS;
                                        xVar2 = xVar;
                                        i10 = i6;
                                        i17 = i14;
                                    }
                                }
                            }
                        } else {
                            int i25 = i18 + 1;
                            b10 = b(charSequence, i18);
                            if (b10 >= 0) {
                                if (i25 < length) {
                                    int b16 = b(charSequence, i25);
                                    if (b16 >= 0) {
                                        b10 = (b10 * 10) + b16;
                                        i25++;
                                    }
                                    int i26 = i25 + 2;
                                    if (i26 < length && charSequence.charAt(i25) == ':' && i26 < length && charSequence.charAt(i25) == ':') {
                                        int b17 = b(charSequence, i25 + 1);
                                        int b18 = b(charSequence, i26);
                                        if (b17 >= 0 && b18 >= 0) {
                                            i12 = (b17 * 10) + b18;
                                            i25 += 3;
                                            int i27 = i25 + 2;
                                            if (i27 < length && charSequence.charAt(i25) == ':') {
                                                b11 = b(charSequence, i25 + 1);
                                                int b19 = b(charSequence, i27);
                                                if (b11 >= 0 && b19 >= 0) {
                                                    i14 = i25;
                                                    i15 = b19;
                                                    i13 = i12;
                                                    i19 = (b11 * 10) + i15;
                                                    i14 += 3;
                                                    j10 = ((i13 * 60) + (b10 * 3600) + i19) * i11;
                                                    aVar = j$.time.temporal.a.OFFSET_SECONDS;
                                                    xVar2 = xVar;
                                                    i10 = i6;
                                                    i17 = i14;
                                                }
                                            }
                                            i13 = i12;
                                            i14 = i25;
                                            j10 = ((i13 * 60) + (b10 * 3600) + i19) * i11;
                                            aVar = j$.time.temporal.a.OFFSET_SECONDS;
                                            xVar2 = xVar;
                                            i10 = i6;
                                            i17 = i14;
                                        }
                                    }
                                }
                                i12 = 0;
                                i13 = i12;
                                i14 = i25;
                                j10 = ((i13 * 60) + (b10 * 3600) + i19) * i11;
                                aVar = j$.time.temporal.a.OFFSET_SECONDS;
                                xVar2 = xVar;
                                i10 = i6;
                                i17 = i14;
                            }
                        }
                        return xVar2.o(aVar, j10, i10, i17);
                    }
                    aVar = j$.time.temporal.a.OFFSET_SECONDS;
                    j10 = 0;
                    xVar2 = xVar;
                    i10 = i6;
                    return xVar2.o(aVar, j10, i10, i17);
                }
                return ~i6;
            default:
                if (i6 > charSequence.length() || i6 < 0) {
                    throw new IndexOutOfBoundsException();
                }
                String str = (String) obj;
                return !xVar.s(charSequence, i6, str, 0, str.length()) ? ~i6 : str.length() + i6;
        }
    }

    public final String toString() {
        int i6 = this.f20896a;
        Object obj = this.f20897b;
        switch (i6) {
            case 0:
                return "LocalizedOffset(" + ((H) obj) + ")";
            default:
                String replace = ((String) obj).replace("'", "''");
                return "'" + replace + "'";
        }
    }
}
