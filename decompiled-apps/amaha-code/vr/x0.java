package vr;

import java.io.Serializable;
import java.nio.charset.Charset;
import tr.c0;
import tr.y;
import vr.a;
/* compiled from: Http2ClientStreamTransportState.java */
/* loaded from: classes2.dex */
public abstract class x0 extends a.b {

    /* renamed from: v  reason: collision with root package name */
    public static final c0.f f36113v = tr.y.a(":status", new a());
    public tr.i0 r;

    /* renamed from: s  reason: collision with root package name */
    public tr.c0 f36114s;

    /* renamed from: t  reason: collision with root package name */
    public Charset f36115t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f36116u;

    /* compiled from: Http2ClientStreamTransportState.java */
    /* loaded from: classes2.dex */
    public class a implements y.a<Integer> {
        @Override // tr.c0.g
        public final byte[] a(Serializable serializable) {
            Integer num = (Integer) serializable;
            throw new UnsupportedOperationException();
        }

        @Override // tr.c0.g
        public final Object b(byte[] bArr) {
            if (bArr.length >= 3) {
                int i6 = (bArr[1] - 48) * 10;
                return Integer.valueOf((bArr[2] - 48) + i6 + ((bArr[0] - 48) * 100));
            }
            throw new NumberFormatException("Malformed status code ".concat(new String(bArr, tr.y.f33590a)));
        }
    }

    public x0(int i6, g3 g3Var, m3 m3Var) {
        super(i6, g3Var, m3Var);
        this.f36115t = nc.c.f25988c;
    }

    public static Charset m(tr.c0 c0Var) {
        String str = (String) c0Var.c(u0.f35980i);
        if (str != null) {
            String[] split = str.split("charset=", 2);
            try {
                return Charset.forName(split[split.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return nc.c.f25988c;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static tr.i0 n(tr.c0 c0Var) {
        boolean z10;
        char charAt;
        Integer num = (Integer) c0Var.c(f36113v);
        if (num == null) {
            return tr.i0.f33487l.g("Missing HTTP status code");
        }
        String str = (String) c0Var.c(u0.f35980i);
        if (str != null && 16 <= str.length()) {
            String lowerCase = str.toLowerCase();
            if (lowerCase.startsWith("application/grpc") && (lowerCase.length() == 16 || (charAt = lowerCase.charAt(16)) == '+' || charAt == ';')) {
                z10 = true;
                if (z10) {
                    tr.i0 f = u0.f(num.intValue());
                    return f.a("invalid content-type: " + str);
                }
                return null;
            }
        }
        z10 = false;
        if (z10) {
        }
    }
}
