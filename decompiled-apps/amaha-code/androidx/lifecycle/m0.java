package androidx.lifecycle;

import androidx.lifecycle.l0;
import androidx.lifecycle.o0;
/* compiled from: ViewModelLazy.kt */
/* loaded from: classes.dex */
public final class m0<VM extends l0> implements hs.d<VM> {

    /* renamed from: u  reason: collision with root package name */
    public final ys.d<VM> f2440u;

    /* renamed from: v  reason: collision with root package name */
    public final ss.a<q0> f2441v;

    /* renamed from: w  reason: collision with root package name */
    public final ss.a<o0.b> f2442w;

    /* renamed from: x  reason: collision with root package name */
    public final ss.a<k1.a> f2443x;

    /* renamed from: y  reason: collision with root package name */
    public VM f2444y;

    /* JADX WARN: Multi-variable type inference failed */
    public m0(ys.d<VM> viewModelClass, ss.a<? extends q0> aVar, ss.a<? extends o0.b> aVar2, ss.a<? extends k1.a> aVar3) {
        kotlin.jvm.internal.i.g(viewModelClass, "viewModelClass");
        this.f2440u = viewModelClass;
        this.f2441v = aVar;
        this.f2442w = aVar2;
        this.f2443x = aVar3;
    }

    @Override // hs.d
    /* renamed from: a */
    public final VM getValue() {
        VM vm2 = this.f2444y;
        if (vm2 == null) {
            VM vm3 = (VM) new o0(this.f2441v.invoke(), this.f2442w.invoke(), this.f2443x.invoke()).a(sp.b.C(this.f2440u));
            this.f2444y = vm3;
            return vm3;
        }
        return vm2;
    }
}
