package kotlinx.coroutines.internal;
/* compiled from: OnUndeliveredElement.kt */
/* loaded from: classes2.dex */
public final class l extends kotlin.jvm.internal.k implements ss.l<Throwable, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ss.l<Object, hs.k> f23609u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f23610v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ ls.f f23611w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ss.l<Object, hs.k> lVar, Object obj, ls.f fVar) {
        super(1);
        this.f23609u = lVar;
        this.f23610v = obj;
        this.f23611w = fVar;
    }

    @Override // ss.l
    public final hs.k invoke(Throwable th2) {
        UndeliveredElementException l2 = kc.f.l(this.f23609u, this.f23610v, null);
        if (l2 != null) {
            ta.v.z(this.f23611w, l2);
        }
        return hs.k.f19476a;
    }
}
