package s1;

import java.util.Iterator;
import s1.a0;
/* compiled from: NavController.kt */
/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.k implements ss.l<b0, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ u f31187u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ i f31188v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(u uVar, i iVar) {
        super(1);
        this.f31187u = uVar;
        this.f31188v = iVar;
    }

    @Override // ss.l
    public final hs.k invoke(b0 b0Var) {
        boolean z10;
        w wVar;
        b0 navOptions = b0Var;
        kotlin.jvm.internal.i.g(navOptions, "$this$navOptions");
        j animBuilder = j.f31179u;
        kotlin.jvm.internal.i.g(animBuilder, "animBuilder");
        b bVar = new b();
        animBuilder.invoke(bVar);
        int i6 = bVar.f31082a;
        a0.a aVar = navOptions.f31086a;
        aVar.f31078a = i6;
        aVar.f31079b = bVar.f31083b;
        aVar.f31080c = bVar.f31084c;
        aVar.f31081d = bVar.f31085d;
        u uVar = this.f31187u;
        boolean z11 = uVar instanceof w;
        boolean z12 = false;
        i iVar = this.f31188v;
        if (z11) {
            int i10 = u.D;
            kotlin.jvm.internal.i.g(uVar, "<this>");
            Iterator it = fv.k.x0(t.f31227u, uVar).iterator();
            while (true) {
                if (it.hasNext()) {
                    u uVar2 = (u) it.next();
                    u f = iVar.f();
                    if (f != null) {
                        wVar = f.f31229v;
                    } else {
                        wVar = null;
                    }
                    if (kotlin.jvm.internal.i.b(uVar2, wVar)) {
                        z10 = false;
                        break;
                    }
                } else {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                z12 = true;
            }
        }
        if (z12) {
            int i11 = w.I;
            w h10 = iVar.h();
            int i12 = ((u) fv.t.F0(fv.k.x0(v.f31239u, h10.z(h10.F, true)))).B;
            k popUpToBuilder = k.f31185u;
            kotlin.jvm.internal.i.g(popUpToBuilder, "popUpToBuilder");
            navOptions.f31088c = i12;
            k0 k0Var = new k0();
            popUpToBuilder.invoke(k0Var);
            navOptions.f31089d = k0Var.f31186a;
        }
        return hs.k.f19476a;
    }
}
