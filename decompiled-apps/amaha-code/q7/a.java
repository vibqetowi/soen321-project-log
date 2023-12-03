package q7;

import android.util.Log;
import com.google.android.exoplayer2.ParserException;
import u7.x;
/* compiled from: AacUtil.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f29228a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f29229b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* compiled from: AacUtil.java */
    /* renamed from: q7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0493a {

        /* renamed from: a  reason: collision with root package name */
        public final int f29230a;

        /* renamed from: b  reason: collision with root package name */
        public final int f29231b;

        /* renamed from: c  reason: collision with root package name */
        public final String f29232c;

        public C0493a(int i6, int i10, String str) {
            this.f29230a = i6;
            this.f29231b = i10;
            this.f29232c = str;
        }
    }

    public static int a(x xVar) {
        int i6 = xVar.i(4);
        if (i6 == 15) {
            return xVar.i(24);
        }
        if (i6 < 13) {
            return f29228a[i6];
        }
        throw ParserException.a(null, null);
    }

    public static C0493a b(x xVar, boolean z10) {
        int i6 = xVar.i(5);
        if (i6 == 31) {
            i6 = xVar.i(6) + 32;
        }
        int a10 = a(xVar);
        int i10 = xVar.i(4);
        String h10 = defpackage.b.h(19, "mp4a.40.", i6);
        if (i6 == 5 || i6 == 29) {
            a10 = a(xVar);
            int i11 = xVar.i(5);
            if (i11 == 31) {
                i11 = xVar.i(6) + 32;
            }
            i6 = i11;
            if (i6 == 22) {
                i10 = xVar.i(4);
            }
        }
        if (z10) {
            if (i6 != 1 && i6 != 2 && i6 != 3 && i6 != 4 && i6 != 6 && i6 != 7 && i6 != 17) {
                switch (i6) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        StringBuilder sb2 = new StringBuilder(42);
                        sb2.append("Unsupported audio object type: ");
                        sb2.append(i6);
                        throw ParserException.b(sb2.toString());
                }
            }
            if (xVar.h()) {
                Log.w("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (xVar.h()) {
                xVar.r(14);
            }
            boolean h11 = xVar.h();
            if (i10 != 0) {
                if (i6 == 6 || i6 == 20) {
                    xVar.r(3);
                }
                if (h11) {
                    if (i6 == 22) {
                        xVar.r(16);
                    }
                    if (i6 == 17 || i6 == 19 || i6 == 20 || i6 == 23) {
                        xVar.r(3);
                    }
                    xVar.r(1);
                }
                switch (i6) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int i12 = xVar.i(2);
                        if (i12 == 2 || i12 == 3) {
                            StringBuilder sb3 = new StringBuilder(33);
                            sb3.append("Unsupported epConfig: ");
                            sb3.append(i12);
                            throw ParserException.b(sb3.toString());
                        }
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i13 = f29229b[i10];
        if (i13 != -1) {
            return new C0493a(a10, i13, h10);
        }
        throw ParserException.a(null, null);
    }

    public static C0493a c(byte[] bArr) {
        return b(new x(bArr, 1, 0), false);
    }
}
