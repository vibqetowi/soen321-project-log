package sv;

import zv.i;
/* compiled from: Http2.kt */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f32122a = new d();

    /* renamed from: b  reason: collision with root package name */
    public static final zv.i f32123b;

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f32124c;

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f32125d;

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f32126e;

    static {
        zv.i iVar = zv.i.f39888x;
        f32123b = i.a.c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f32124c = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f32125d = new String[64];
        String[] strArr = new String[256];
        int i6 = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            kotlin.jvm.internal.i.f(binaryString, "toBinaryString(it)");
            strArr[i10] = gv.n.E0(mv.b.i("%8s", binaryString), ' ', '0');
        }
        f32126e = strArr;
        String[] strArr2 = f32125d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        strArr2[9] = kotlin.jvm.internal.i.n("|PADDED", "END_STREAM");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i11 = 0;
        while (i11 < 3) {
            int i12 = iArr2[i11];
            i11++;
            int i13 = iArr[0];
            String[] strArr3 = f32125d;
            int i14 = i13 | i12;
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) strArr3[i13]);
            sb2.append('|');
            sb2.append((Object) strArr3[i12]);
            strArr3[i14] = sb2.toString();
            strArr3[i14 | 8] = ((Object) strArr3[i13]) + '|' + ((Object) strArr3[i12]) + "|PADDED";
        }
        int length = f32125d.length;
        while (i6 < length) {
            int i15 = i6 + 1;
            String[] strArr4 = f32125d;
            if (strArr4[i6] == null) {
                strArr4[i6] = f32126e[i6];
            }
            i6 = i15;
        }
    }

    public static String a(int i6, int i10, int i11, int i12, boolean z10) {
        String i13;
        String str;
        String str2;
        String str3;
        String[] strArr = f32124c;
        if (i11 < strArr.length) {
            i13 = strArr[i11];
        } else {
            i13 = mv.b.i("0x%02x", Integer.valueOf(i11));
        }
        if (i12 == 0) {
            str = "";
        } else {
            String[] strArr2 = f32126e;
            if (i11 != 2 && i11 != 3) {
                if (i11 != 4 && i11 != 6) {
                    if (i11 != 7 && i11 != 8) {
                        String[] strArr3 = f32125d;
                        if (i12 < strArr3.length) {
                            str2 = strArr3[i12];
                            kotlin.jvm.internal.i.d(str2);
                        } else {
                            str2 = strArr2[i12];
                        }
                        if (i11 == 5 && (i12 & 4) != 0) {
                            str = gv.n.F0(str2, "HEADERS", "PUSH_PROMISE");
                        } else if (i11 == 0 && (i12 & 32) != 0) {
                            str = gv.n.F0(str2, "PRIORITY", "COMPRESSED");
                        } else {
                            str = str2;
                        }
                    }
                } else if (i12 == 1) {
                    str = "ACK";
                } else {
                    str = strArr2[i12];
                }
            }
            str = strArr2[i12];
        }
        if (z10) {
            str3 = "<<";
        } else {
            str3 = ">>";
        }
        return mv.b.i("%s 0x%08x %5d %-13s %s", str3, Integer.valueOf(i6), Integer.valueOf(i10), i13, str);
    }
}
