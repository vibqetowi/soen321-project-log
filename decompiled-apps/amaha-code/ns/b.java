package ns;
/* compiled from: ContinuationImpl.kt */
/* loaded from: classes2.dex */
public final class b implements ls.d<Object> {

    /* renamed from: u  reason: collision with root package name */
    public static final b f26775u = new b();

    @Override // ls.d
    public final ls.f getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // ls.d
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
