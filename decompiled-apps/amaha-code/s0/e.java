package s0;
/* compiled from: Pools.java */
/* loaded from: classes.dex */
public final class e<T> extends v.e {

    /* renamed from: d  reason: collision with root package name */
    public final Object f31066d;

    public e(int i6) {
        super(i6, 1);
        this.f31066d = new Object();
    }

    @Override // v.e, s0.d
    public final boolean a(T t3) {
        boolean a10;
        synchronized (this.f31066d) {
            a10 = super.a(t3);
        }
        return a10;
    }

    @Override // v.e, s0.d
    public final T b() {
        T t3;
        synchronized (this.f31066d) {
            t3 = (T) super.b();
        }
        return t3;
    }
}
