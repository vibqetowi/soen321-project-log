package androidx.work;
/* compiled from: ListenableFuture.kt */
/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.k implements ss.l<Throwable, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ rc.b<Object> f3330u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(rc.b<Object> bVar) {
        super(1);
        this.f3330u = bVar;
    }

    @Override // ss.l
    public final hs.k invoke(Throwable th2) {
        this.f3330u.cancel(false);
        return hs.k.f19476a;
    }
}
