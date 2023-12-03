package tr;

import io.grpc.StatusException;
import io.grpc.StatusRuntimeException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import nc.f;
import tr.c0;
/* compiled from: Status.java */
/* loaded from: classes2.dex */
public final class i0 {

    /* renamed from: d  reason: collision with root package name */
    public static final List<i0> f33480d;

    /* renamed from: e  reason: collision with root package name */
    public static final i0 f33481e;
    public static final i0 f;

    /* renamed from: g  reason: collision with root package name */
    public static final i0 f33482g;

    /* renamed from: h  reason: collision with root package name */
    public static final i0 f33483h;

    /* renamed from: i  reason: collision with root package name */
    public static final i0 f33484i;

    /* renamed from: j  reason: collision with root package name */
    public static final i0 f33485j;

    /* renamed from: k  reason: collision with root package name */
    public static final i0 f33486k;

    /* renamed from: l  reason: collision with root package name */
    public static final i0 f33487l;

    /* renamed from: m  reason: collision with root package name */
    public static final i0 f33488m;

    /* renamed from: n  reason: collision with root package name */
    public static final c0.f f33489n;

    /* renamed from: o  reason: collision with root package name */
    public static final c0.f f33490o;

    /* renamed from: a  reason: collision with root package name */
    public final a f33491a;

    /* renamed from: b  reason: collision with root package name */
    public final String f33492b;

    /* renamed from: c  reason: collision with root package name */
    public final Throwable f33493c;

    /* compiled from: Status.java */
    /* loaded from: classes2.dex */
    public enum a {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);
        

        /* renamed from: u  reason: collision with root package name */
        public final int f33498u;

        /* renamed from: v  reason: collision with root package name */
        public final byte[] f33499v;

        a(int i6) {
            this.f33498u = i6;
            this.f33499v = Integer.toString(i6).getBytes(nc.c.f25986a);
        }

        public final i0 d() {
            return i0.f33480d.get(this.f33498u);
        }
    }

    /* compiled from: Status.java */
    /* loaded from: classes2.dex */
    public static final class b implements c0.g<i0> {
        @Override // tr.c0.g
        public final byte[] a(Serializable serializable) {
            return ((i0) serializable).f33491a.f33499v;
        }

        @Override // tr.c0.g
        public final i0 b(byte[] bArr) {
            byte b10;
            char c10 = 1;
            int i6 = 0;
            if (bArr.length == 1 && bArr[0] == 48) {
                return i0.f33481e;
            }
            int length = bArr.length;
            if (length != 1) {
                if (length == 2 && (b10 = bArr[0]) >= 48 && b10 <= 57) {
                    i6 = 0 + ((b10 - 48) * 10);
                }
                return i0.f33482g.g("Unknown code ".concat(new String(bArr, nc.c.f25986a)));
            }
            c10 = 0;
            byte b11 = bArr[c10];
            if (b11 >= 48 && b11 <= 57) {
                int i10 = (b11 - 48) + i6;
                List<i0> list = i0.f33480d;
                if (i10 < list.size()) {
                    return list.get(i10);
                }
            }
            return i0.f33482g.g("Unknown code ".concat(new String(bArr, nc.c.f25986a)));
        }
    }

    /* compiled from: Status.java */
    /* loaded from: classes2.dex */
    public static final class c implements c0.g<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final byte[] f33500a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

        @Override // tr.c0.g
        public final byte[] a(Serializable serializable) {
            boolean z10;
            boolean z11;
            byte[] bytes = ((String) serializable).getBytes(nc.c.f25988c);
            int i6 = 0;
            while (i6 < bytes.length) {
                byte b10 = bytes[i6];
                if (b10 >= 32 && b10 < 126 && b10 != 37) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    byte[] bArr = new byte[((bytes.length - i6) * 3) + i6];
                    if (i6 != 0) {
                        System.arraycopy(bytes, 0, bArr, 0, i6);
                    }
                    int i10 = i6;
                    while (i6 < bytes.length) {
                        byte b11 = bytes[i6];
                        if (b11 >= 32 && b11 < 126 && b11 != 37) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (z11) {
                            bArr[i10] = 37;
                            byte[] bArr2 = f33500a;
                            bArr[i10 + 1] = bArr2[(b11 >> 4) & 15];
                            bArr[i10 + 2] = bArr2[b11 & 15];
                            i10 += 3;
                        } else {
                            bArr[i10] = b11;
                            i10++;
                        }
                        i6++;
                    }
                    return Arrays.copyOf(bArr, i10);
                }
                i6++;
            }
            return bytes;
        }

        @Override // tr.c0.g
        public final String b(byte[] bArr) {
            for (int i6 = 0; i6 < bArr.length; i6++) {
                byte b10 = bArr[i6];
                if (b10 < 32 || b10 >= 126 || (b10 == 37 && i6 + 2 < bArr.length)) {
                    ByteBuffer allocate = ByteBuffer.allocate(bArr.length);
                    int i10 = 0;
                    while (i10 < bArr.length) {
                        if (bArr[i10] == 37 && i10 + 2 < bArr.length) {
                            try {
                                allocate.put((byte) Integer.parseInt(new String(bArr, i10 + 1, 2, nc.c.f25986a), 16));
                                i10 += 3;
                            } catch (NumberFormatException unused) {
                            }
                        }
                        allocate.put(bArr[i10]);
                        i10++;
                    }
                    return new String(allocate.array(), 0, allocate.position(), nc.c.f25988c);
                }
            }
            return new String(bArr, 0);
        }
    }

    static {
        a[] values;
        i0 i0Var;
        Boolean.parseBoolean(System.getProperty("io.grpc.Status.failOnEqualsForTest", "false"));
        TreeMap treeMap = new TreeMap();
        for (a aVar : a.values()) {
            if (((i0) treeMap.put(Integer.valueOf(aVar.f33498u), new i0(aVar, null, null))) != null) {
                throw new IllegalStateException("Code value duplication between " + i0Var.f33491a.name() + " & " + aVar.name());
            }
        }
        f33480d = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        f33481e = a.OK.d();
        f = a.CANCELLED.d();
        f33482g = a.UNKNOWN.d();
        a.INVALID_ARGUMENT.d();
        f33483h = a.DEADLINE_EXCEEDED.d();
        a.NOT_FOUND.d();
        a.ALREADY_EXISTS.d();
        f33484i = a.PERMISSION_DENIED.d();
        f33485j = a.UNAUTHENTICATED.d();
        f33486k = a.RESOURCE_EXHAUSTED.d();
        a.FAILED_PRECONDITION.d();
        a.ABORTED.d();
        a.OUT_OF_RANGE.d();
        a.UNIMPLEMENTED.d();
        f33487l = a.INTERNAL.d();
        f33488m = a.UNAVAILABLE.d();
        a.DATA_LOSS.d();
        f33489n = new c0.f("grpc-status", false, new b());
        f33490o = new c0.f("grpc-message", false, new c());
    }

    public i0(a aVar, String str, Throwable th2) {
        sc.b.w(aVar, "code");
        this.f33491a = aVar;
        this.f33492b = str;
        this.f33493c = th2;
    }

    public static String b(i0 i0Var) {
        String str = i0Var.f33492b;
        a aVar = i0Var.f33491a;
        if (str == null) {
            return aVar.toString();
        }
        return aVar + ": " + i0Var.f33492b;
    }

    public static i0 c(int i6) {
        if (i6 >= 0) {
            List<i0> list = f33480d;
            if (i6 <= list.size()) {
                return list.get(i6);
            }
        }
        return f33482g.g("Unknown code " + i6);
    }

    public static i0 d(Throwable th2) {
        sc.b.w(th2, "t");
        for (Throwable th3 = th2; th3 != null; th3 = th3.getCause()) {
            if (th3 instanceof StatusException) {
                return ((StatusException) th3).f20422u;
            }
            if (th3 instanceof StatusRuntimeException) {
                return ((StatusRuntimeException) th3).f20424u;
            }
        }
        return f33482g.f(th2);
    }

    public final i0 a(String str) {
        if (str == null) {
            return this;
        }
        Throwable th2 = this.f33493c;
        a aVar = this.f33491a;
        String str2 = this.f33492b;
        if (str2 == null) {
            return new i0(aVar, str, th2);
        }
        return new i0(aVar, defpackage.d.f(str2, "\n", str), th2);
    }

    public final boolean e() {
        if (a.OK == this.f33491a) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final i0 f(Throwable th2) {
        if (f6.b.v0(this.f33493c, th2)) {
            return this;
        }
        return new i0(this.f33491a, this.f33492b, th2);
    }

    public final i0 g(String str) {
        if (f6.b.v0(this.f33492b, str)) {
            return this;
        }
        return new i0(this.f33491a, str, this.f33493c);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        f.a c10 = nc.f.c(this);
        c10.c(this.f33491a.name(), "code");
        c10.c(this.f33492b, "description");
        Throwable th2 = this.f33493c;
        String str = th2;
        if (th2 != null) {
            Object obj = nc.n.f26014a;
            StringWriter stringWriter = new StringWriter();
            th2.printStackTrace(new PrintWriter(stringWriter));
            str = stringWriter.toString();
        }
        c10.c(str, "cause");
        return c10.toString();
    }
}
