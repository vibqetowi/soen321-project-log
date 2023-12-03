package wu;

import java.util.ArrayList;
import java.util.List;
import wu.w0;
/* compiled from: AbstractTypeChecker.kt */
/* loaded from: classes2.dex */
public final class e extends kotlin.jvm.internal.k implements ss.l<w0.a, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ List<zu.i> f37225u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ w0 f37226v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ zu.n f37227w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ zu.i f37228x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ArrayList arrayList, w0 w0Var, zu.n nVar, zu.i iVar) {
        super(1);
        this.f37225u = arrayList;
        this.f37226v = w0Var;
        this.f37227w = nVar;
        this.f37228x = iVar;
    }

    @Override // ss.l
    public final hs.k invoke(w0.a aVar) {
        w0.a runForkingPoint = aVar;
        kotlin.jvm.internal.i.g(runForkingPoint, "$this$runForkingPoint");
        for (zu.i iVar : this.f37225u) {
            runForkingPoint.a(new d(this.f37226v, this.f37227w, iVar, this.f37228x));
        }
        return hs.k.f19476a;
    }
}
