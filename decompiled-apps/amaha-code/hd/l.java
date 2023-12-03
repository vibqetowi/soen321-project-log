package hd;
/* compiled from: Lazy.java */
/* loaded from: classes.dex */
public final class l<T> implements re.b<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f17429c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f17430a = f17429c;

    /* renamed from: b  reason: collision with root package name */
    public volatile re.b<T> f17431b;

    public l(re.b<T> bVar) {
        this.f17431b = bVar;
    }

    @Override // re.b
    public final T get() {
        T t3 = (T) this.f17430a;
        Object obj = f17429c;
        if (t3 == obj) {
            synchronized (this) {
                t3 = this.f17430a;
                if (t3 == obj) {
                    t3 = this.f17431b.get();
                    this.f17430a = t3;
                    this.f17431b = null;
                }
            }
        }
        return t3;
    }
}
