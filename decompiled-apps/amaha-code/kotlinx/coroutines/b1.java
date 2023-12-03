package kotlinx.coroutines;
/* compiled from: JobSupport.kt */
/* loaded from: classes2.dex */
public final class b1 extends f1 {

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ int f23487y;

    /* renamed from: z  reason: collision with root package name */
    public final Object f23488z;

    public /* synthetic */ b1(int i6, Object obj) {
        this.f23487y = i6;
        this.f23488z = obj;
    }

    @Override // kotlinx.coroutines.w
    public final void B(Throwable th2) {
        int i6 = this.f23487y;
        Object obj = this.f23488z;
        switch (i6) {
            case 0:
                ((ss.l) obj).invoke(th2);
                return;
            case 1:
                Object Q = C().Q();
                if (Q instanceof u) {
                    ((k) obj).resumeWith(sp.b.j(((u) Q).f23703a));
                    return;
                } else {
                    ((k) obj).resumeWith(kotlin.jvm.internal.b0.s(Q));
                    return;
                }
            default:
                ((ls.d) obj).resumeWith(hs.k.f19476a);
                return;
        }
    }

    @Override // ss.l
    public final /* bridge */ /* synthetic */ hs.k invoke(Throwable th2) {
        switch (this.f23487y) {
            case 0:
                B(th2);
                return hs.k.f19476a;
            case 1:
                B(th2);
                return hs.k.f19476a;
            default:
                B(th2);
                return hs.k.f19476a;
        }
    }
}
