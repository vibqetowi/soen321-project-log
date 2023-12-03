package l3;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import v.g;
import zv.e;
import zv.i;
import zv.q;
/* compiled from: JsonReader.java */
/* loaded from: classes.dex */
public abstract class c implements Closeable {

    /* renamed from: y  reason: collision with root package name */
    public static final String[] f24004y = new String[128];

    /* renamed from: u  reason: collision with root package name */
    public int f24005u;

    /* renamed from: v  reason: collision with root package name */
    public int[] f24006v = new int[32];

    /* renamed from: w  reason: collision with root package name */
    public String[] f24007w = new String[32];

    /* renamed from: x  reason: collision with root package name */
    public int[] f24008x = new int[32];

    /* compiled from: JsonReader.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String[] f24009a;

        /* renamed from: b  reason: collision with root package name */
        public final q f24010b;

        public a(String[] strArr, q qVar) {
            this.f24009a = strArr;
            this.f24010b = qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[Catch: IOException -> 0x0069, TryCatch #0 {IOException -> 0x0069, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:25:0x0059), top: B:30:0x0000 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static a a(String... strArr) {
            String str;
            try {
                i[] iVarArr = new i[strArr.length];
                e eVar = new e();
                for (int i6 = 0; i6 < strArr.length; i6++) {
                    String str2 = strArr[i6];
                    String[] strArr2 = c.f24004y;
                    eVar.L0(34);
                    int length = str2.length();
                    int i10 = 0;
                    for (int i11 = 0; i11 < length; i11++) {
                        char charAt = str2.charAt(i11);
                        if (charAt < 128) {
                            str = strArr2[charAt];
                            if (str == null) {
                            }
                            if (i10 < i11) {
                                eVar.Q0(i10, i11, str2);
                            }
                            eVar.R0(str);
                            i10 = i11 + 1;
                        } else {
                            if (charAt == 8232) {
                                str = "\\u2028";
                            } else if (charAt == 8233) {
                                str = "\\u2029";
                            }
                            if (i10 < i11) {
                            }
                            eVar.R0(str);
                            i10 = i11 + 1;
                        }
                    }
                    if (i10 < length) {
                        eVar.Q0(i10, length, str2);
                    }
                    eVar.L0(34);
                    eVar.readByte();
                    iVarArr[i6] = eVar.e0();
                }
                return new a((String[]) strArr.clone(), q.a.b(iVarArr));
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    static {
        for (int i6 = 0; i6 <= 31; i6++) {
            f24004y[i6] = String.format("\\u%04x", Integer.valueOf(i6));
        }
        String[] strArr = f24004y;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract int G();

    public abstract String I();

    public abstract int J();

    public final void O(int i6) {
        int i10 = this.f24005u;
        int[] iArr = this.f24006v;
        if (i10 == iArr.length) {
            if (i10 != 256) {
                this.f24006v = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f24007w;
                this.f24007w = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f24008x;
                this.f24008x = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new l3.a("Nesting too deep at " + j());
            }
        }
        int[] iArr3 = this.f24006v;
        int i11 = this.f24005u;
        this.f24005u = i11 + 1;
        iArr3[i11] = i6;
    }

    public abstract int R(a aVar);

    public abstract void a();

    public abstract void c0();

    public abstract void e();

    public abstract void e0();

    public final void f0(String str) {
        StringBuilder d10 = g.d(str, " at path ");
        d10.append(j());
        throw new b(d10.toString());
    }

    public abstract void g();

    public abstract void h();

    public final String j() {
        int i6 = this.f24005u;
        int[] iArr = this.f24006v;
        String[] strArr = this.f24007w;
        int[] iArr2 = this.f24008x;
        StringBuilder sb2 = new StringBuilder("$");
        for (int i10 = 0; i10 < i6; i10++) {
            int i11 = iArr[i10];
            if (i11 != 1 && i11 != 2) {
                if (i11 == 3 || i11 == 4 || i11 == 5) {
                    sb2.append('.');
                    String str = strArr[i10];
                    if (str != null) {
                        sb2.append(str);
                    }
                }
            } else {
                sb2.append('[');
                sb2.append(iArr2[i10]);
                sb2.append(']');
            }
        }
        return sb2.toString();
    }

    public abstract boolean m();

    public abstract boolean o();

    public abstract double s();
}
