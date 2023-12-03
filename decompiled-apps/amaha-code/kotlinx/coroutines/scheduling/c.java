package kotlinx.coroutines.scheduling;
/* compiled from: Dispatcher.kt */
/* loaded from: classes2.dex */
public final class c extends f {

    /* renamed from: x  reason: collision with root package name */
    public static final c f23668x = new c();

    public c() {
        super(j.f23677d, j.f23675b, j.f23676c);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.a0
    public final String toString() {
        return "Dispatchers.Default";
    }
}
