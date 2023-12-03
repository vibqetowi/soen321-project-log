package sv;
/* compiled from: TaskQueue.kt */
/* loaded from: classes2.dex */
public final class m extends ov.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ e f32162e;
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ a f32163g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, e eVar, int i6, a aVar) {
        super(str, true);
        this.f32162e = eVar;
        this.f = i6;
        this.f32163g = aVar;
    }

    @Override // ov.a
    public final long a() {
        ca.a aVar = this.f32162e.F;
        a errorCode = this.f32163g;
        aVar.getClass();
        kotlin.jvm.internal.i.g(errorCode, "errorCode");
        synchronized (this.f32162e) {
            this.f32162e.U.remove(Integer.valueOf(this.f));
            hs.k kVar = hs.k.f19476a;
        }
        return -1L;
    }
}
