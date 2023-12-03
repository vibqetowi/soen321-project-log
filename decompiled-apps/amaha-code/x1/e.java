package x1;
/* compiled from: EntityInsertionAdapter.kt */
/* loaded from: classes.dex */
public abstract class e<T> extends u {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(n database) {
        super(database);
        kotlin.jvm.internal.i.g(database, "database");
    }

    public abstract void e(b2.f fVar, T t3);

    public final void f(T t3) {
        b2.f a10 = a();
        try {
            e(a10, t3);
            a10.G0();
        } finally {
            d(a10);
        }
    }
}
