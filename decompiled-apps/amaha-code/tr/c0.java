package tr;

import com.google.common.io.BaseEncoding;
import com.theinnerhour.b2b.utils.SessionManager;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: Metadata.java */
/* loaded from: classes2.dex */
public final class c0 {

    /* renamed from: c  reason: collision with root package name */
    public static final Logger f33439c = Logger.getLogger(c0.class.getName());

    /* renamed from: d  reason: collision with root package name */
    public static final a f33440d = new a();

    /* renamed from: e  reason: collision with root package name */
    public static final BaseEncoding f33441e;

    /* renamed from: a  reason: collision with root package name */
    public Object[] f33442a;

    /* renamed from: b  reason: collision with root package name */
    public int f33443b;

    /* compiled from: Metadata.java */
    /* loaded from: classes2.dex */
    public static class b<T> extends d<T> {

        /* renamed from: e  reason: collision with root package name */
        public final c<T> f33444e;

        public b(String str, c cVar) {
            super(str, false, cVar);
            sc.b.r(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            sc.b.w(cVar, "marshaller");
            this.f33444e = cVar;
        }

        @Override // tr.c0.d
        public final T a(byte[] bArr) {
            return this.f33444e.b(new String(bArr, nc.c.f25986a));
        }

        @Override // tr.c0.d
        public final byte[] b(Serializable serializable) {
            return this.f33444e.a(serializable).getBytes(nc.c.f25986a);
        }
    }

    /* compiled from: Metadata.java */
    /* loaded from: classes2.dex */
    public interface c<T> {
        String a(Serializable serializable);

        T b(String str);
    }

    /* compiled from: Metadata.java */
    /* loaded from: classes2.dex */
    public static abstract class d<T> {

        /* renamed from: d  reason: collision with root package name */
        public static final BitSet f33445d;

        /* renamed from: a  reason: collision with root package name */
        public final String f33446a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f33447b;

        /* renamed from: c  reason: collision with root package name */
        public final Object f33448c;

        static {
            BitSet bitSet = new BitSet(127);
            bitSet.set(45);
            bitSet.set(95);
            bitSet.set(46);
            for (char c10 = '0'; c10 <= '9'; c10 = (char) (c10 + 1)) {
                bitSet.set(c10);
            }
            for (char c11 = 'a'; c11 <= 'z'; c11 = (char) (c11 + 1)) {
                bitSet.set(c11);
            }
            f33445d = bitSet;
        }

        public d(String str, boolean z10, Object obj) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            sc.b.w(lowerCase, SessionManager.KEY_NAME);
            sc.b.s("token must have at least 1 tchar", !lowerCase.isEmpty());
            if (lowerCase.equals("connection")) {
                c0.f33439c.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
            }
            for (int i6 = 0; i6 < lowerCase.length(); i6++) {
                char charAt = lowerCase.charAt(i6);
                if ((!z10 || charAt != ':' || i6 != 0) && !f33445d.get(charAt)) {
                    throw new IllegalArgumentException(kotlin.jvm.internal.h.P("Invalid character '%s' in key name '%s'", Character.valueOf(charAt), lowerCase));
                }
            }
            this.f33446a = lowerCase;
            this.f33447b = lowerCase.getBytes(nc.c.f25986a);
            this.f33448c = obj;
        }

        public abstract T a(byte[] bArr);

        public abstract byte[] b(Serializable serializable);

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.f33446a.equals(((d) obj).f33446a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f33446a.hashCode();
        }

        public final String toString() {
            return r1.b0.b(new StringBuilder("Key{name='"), this.f33446a, "'}");
        }
    }

    /* compiled from: Metadata.java */
    /* loaded from: classes2.dex */
    public static final class e<T> {
        public e() {
            throw null;
        }

        public final byte[] a() {
            synchronized (this) {
                throw null;
            }
        }
    }

    /* compiled from: Metadata.java */
    /* loaded from: classes2.dex */
    public static final class f<T> extends d<T> {

        /* renamed from: e  reason: collision with root package name */
        public final g<T> f33449e;

        public f(String str, boolean z10, g gVar) {
            super(str, z10, gVar);
            sc.b.r(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            this.f33449e = gVar;
        }

        @Override // tr.c0.d
        public final T a(byte[] bArr) {
            return this.f33449e.b(bArr);
        }

        @Override // tr.c0.d
        public final byte[] b(Serializable serializable) {
            return this.f33449e.a(serializable);
        }
    }

    /* compiled from: Metadata.java */
    /* loaded from: classes2.dex */
    public interface g<T> {
        byte[] a(Serializable serializable);

        T b(byte[] bArr);
    }

    static {
        BaseEncoding.c cVar = BaseEncoding.f9523a;
        Character ch2 = cVar.f9533c;
        BaseEncoding baseEncoding = cVar;
        if (ch2 != null) {
            baseEncoding = cVar.g(cVar.f9532b);
        }
        f33441e = baseEncoding;
    }

    public c0() {
    }

    public c0(byte[]... bArr) {
        this.f33443b = bArr.length / 2;
        this.f33442a = bArr;
    }

    public final <T> void a(d<T> dVar) {
        boolean z10;
        int i6;
        if (this.f33443b == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = this.f33443b;
            if (i10 < i12) {
                if (!Arrays.equals(dVar.f33447b, e(i10))) {
                    byte[] e10 = e(i10);
                    Object[] objArr = this.f33442a;
                    int i13 = i11 * 2;
                    objArr[i13] = e10;
                    Object obj = objArr[(i10 * 2) + 1];
                    if (objArr instanceof byte[][]) {
                        if (objArr != null) {
                            i6 = objArr.length;
                        } else {
                            i6 = 0;
                        }
                        b(i6);
                    }
                    this.f33442a[i13 + 1] = obj;
                    i11++;
                }
                i10++;
            } else {
                Arrays.fill(this.f33442a, i11 * 2, i12 * 2, (Object) null);
                this.f33443b = i11;
                return;
            }
        }
    }

    public final void b(int i6) {
        boolean z10;
        Object[] objArr = new Object[i6];
        int i10 = this.f33443b;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            System.arraycopy(this.f33442a, 0, objArr, 0, i10 * 2);
        }
        this.f33442a = objArr;
    }

    public final <T> T c(d<T> dVar) {
        int i6 = this.f33443b;
        do {
            i6--;
            if (i6 < 0) {
                return null;
            }
        } while (!Arrays.equals(dVar.f33447b, e(i6)));
        Object obj = this.f33442a[(i6 * 2) + 1];
        if (obj instanceof byte[]) {
            return dVar.a((byte[]) obj);
        }
        e eVar = (e) obj;
        eVar.getClass();
        return dVar.a(eVar.a());
    }

    public final void d(c0 c0Var) {
        boolean z10;
        int i6;
        int i10 = c0Var.f33443b;
        boolean z11 = true;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        Object[] objArr = this.f33442a;
        if (objArr != null) {
            i6 = objArr.length;
        } else {
            i6 = 0;
        }
        int i11 = this.f33443b;
        int i12 = i6 - (i11 * 2);
        if (i11 != 0) {
            z11 = false;
        }
        if (z11 || i12 < i10 * 2) {
            b((i10 * 2) + (i11 * 2));
        }
        System.arraycopy(c0Var.f33442a, 0, this.f33442a, this.f33443b * 2, c0Var.f33443b * 2);
        this.f33443b += c0Var.f33443b;
    }

    public final byte[] e(int i6) {
        return (byte[]) this.f33442a[i6 * 2];
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (r1 == r2) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(d dVar, Serializable serializable) {
        int i6;
        sc.b.w(dVar, "key");
        sc.b.w(serializable, "value");
        int i10 = this.f33443b;
        int i11 = i10 * 2;
        if (i11 != 0) {
            Object[] objArr = this.f33442a;
            if (objArr != null) {
                i6 = objArr.length;
            } else {
                i6 = 0;
            }
        }
        b(Math.max(i10 * 2 * 2, 8));
        int i12 = this.f33443b;
        this.f33442a[i12 * 2] = dVar.f33447b;
        this.f33442a[(i12 * 2) + 1] = dVar.b(serializable);
        this.f33443b++;
    }

    public final byte[] g(int i6) {
        Object obj = this.f33442a[(i6 * 2) + 1];
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        return ((e) obj).a();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Metadata(");
        for (int i6 = 0; i6 < this.f33443b; i6++) {
            if (i6 != 0) {
                sb2.append(',');
            }
            byte[] e10 = e(i6);
            Charset charset = nc.c.f25986a;
            String str = new String(e10, charset);
            sb2.append(str);
            sb2.append('=');
            if (str.endsWith("-bin")) {
                sb2.append(f33441e.c(g(i6)));
            } else {
                sb2.append(new String(g(i6), charset));
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    /* compiled from: Metadata.java */
    /* loaded from: classes2.dex */
    public class a implements c<String> {
        @Override // tr.c0.c
        public final String a(Serializable serializable) {
            return (String) serializable;
        }

        @Override // tr.c0.c
        public final String b(String str) {
            return str;
        }
    }
}
