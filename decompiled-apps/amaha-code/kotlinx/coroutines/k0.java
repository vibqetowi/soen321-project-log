package kotlinx.coroutines;
/* compiled from: CoroutineExceptionHandlerImpl.kt */
/* loaded from: classes2.dex */
public final class k0 extends RuntimeException {

    /* renamed from: u  reason: collision with root package name */
    public final ls.f f23633u;

    public k0(ls.f fVar) {
        this.f23633u = fVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f23633u.toString();
    }
}
