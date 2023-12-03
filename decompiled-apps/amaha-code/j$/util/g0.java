package j$.util;
/* loaded from: classes3.dex */
public abstract class g0 {

    /* renamed from: a  reason: collision with root package name */
    private static final S f21223a = new c0();

    /* renamed from: b  reason: collision with root package name */
    private static final I f21224b = new a0();

    /* renamed from: c  reason: collision with root package name */
    private static final L f21225c = new b0();

    /* renamed from: d  reason: collision with root package name */
    private static final F f21226d = new Z();

    private static void a(int i6, int i10, int i11) {
        if (i10 <= i11) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException(i10);
            }
            if (i11 > i6) {
                throw new ArrayIndexOutOfBoundsException(i11);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i10 + ") > fence(" + i11 + ")");
    }

    public static F b() {
        return f21226d;
    }

    public static I c() {
        return f21224b;
    }

    public static L d() {
        return f21225c;
    }

    public static S e() {
        return f21223a;
    }

    public static InterfaceC0730s f(F f) {
        Objects.requireNonNull(f);
        return new W(f);
    }

    public static InterfaceC0856w g(I i6) {
        Objects.requireNonNull(i6);
        return new U(i6);
    }

    public static A h(L l2) {
        Objects.requireNonNull(l2);
        return new V(l2);
    }

    public static java.util.Iterator i(S s10) {
        Objects.requireNonNull(s10);
        return new T(s10);
    }

    public static F j(double[] dArr, int i6, int i10) {
        a(((double[]) Objects.requireNonNull(dArr)).length, i6, i10);
        return new Y(dArr, i6, i10, 1040);
    }

    public static I k(int[] iArr, int i6, int i10) {
        a(((int[]) Objects.requireNonNull(iArr)).length, i6, i10);
        return new d0(iArr, i6, i10, 1040);
    }

    public static L l(long[] jArr, int i6, int i10) {
        a(((long[]) Objects.requireNonNull(jArr)).length, i6, i10);
        return new f0(jArr, i6, i10, 1040);
    }

    public static S m(Object[] objArr, int i6, int i10) {
        a(((Object[]) Objects.requireNonNull(objArr)).length, i6, i10);
        return new X(objArr, i6, i10, 1040);
    }
}
