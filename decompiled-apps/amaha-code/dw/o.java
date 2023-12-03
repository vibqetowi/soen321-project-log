package dw;
/* compiled from: KotlinExtensions.kt */
/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.k implements ss.l<Throwable, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ b f13581u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(b bVar) {
        super(1);
        this.f13581u = bVar;
    }

    @Override // ss.l
    public final hs.k invoke(Throwable th2) {
        this.f13581u.cancel();
        return hs.k.f19476a;
    }
}
