package u7;

import com.google.android.exoplayer2.ParserException;
/* compiled from: VorbisUtil.java */
/* loaded from: classes.dex */
public final class y {

    /* compiled from: VorbisUtil.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String[] f33928a;

        public a(String[] strArr) {
            this.f33928a = strArr;
        }
    }

    /* compiled from: VorbisUtil.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f33929a;

        public b(boolean z10) {
            this.f33929a = z10;
        }
    }

    /* compiled from: VorbisUtil.java */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f33930a;

        /* renamed from: b  reason: collision with root package name */
        public final int f33931b;

        /* renamed from: c  reason: collision with root package name */
        public final int f33932c;

        /* renamed from: d  reason: collision with root package name */
        public final int f33933d;

        /* renamed from: e  reason: collision with root package name */
        public final int f33934e;
        public final int f;

        /* renamed from: g  reason: collision with root package name */
        public final byte[] f33935g;

        public c(int i6, int i10, int i11, int i12, int i13, int i14, byte[] bArr) {
            this.f33930a = i6;
            this.f33931b = i10;
            this.f33932c = i11;
            this.f33933d = i12;
            this.f33934e = i13;
            this.f = i14;
            this.f33935g = bArr;
        }
    }

    public static a a(c9.q qVar, boolean z10, boolean z11) {
        if (z10) {
            b(3, qVar, false);
        }
        qVar.n((int) qVar.g());
        long g5 = qVar.g();
        String[] strArr = new String[(int) g5];
        for (int i6 = 0; i6 < g5; i6++) {
            strArr[i6] = qVar.n((int) qVar.g());
        }
        if (z11 && (qVar.q() & 1) == 0) {
            throw ParserException.a("framing bit expected to be set", null);
        }
        return new a(strArr);
    }

    public static boolean b(int i6, c9.q qVar, boolean z10) {
        String str;
        int i10 = qVar.f5188c - qVar.f5187b;
        if (i10 < 7) {
            if (z10) {
                return false;
            }
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("too short header: ");
            sb2.append(i10);
            throw ParserException.a(sb2.toString(), null);
        } else if (qVar.q() != i6) {
            if (z10) {
                return false;
            }
            String valueOf = String.valueOf(Integer.toHexString(i6));
            if (valueOf.length() != 0) {
                str = "expected header type ".concat(valueOf);
            } else {
                str = new String("expected header type ");
            }
            throw ParserException.a(str, null);
        } else if (qVar.q() == 118 && qVar.q() == 111 && qVar.q() == 114 && qVar.q() == 98 && qVar.q() == 105 && qVar.q() == 115) {
            return true;
        } else {
            if (z10) {
                return false;
            }
            throw ParserException.a("expected characters 'vorbis'", null);
        }
    }
}
