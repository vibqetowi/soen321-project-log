package g;

import android.view.View;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
/* compiled from: AppCompatDelegateImpl.java */
/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.b0 {
    public final /* synthetic */ k e0;

    public o(k kVar) {
        this.e0 = kVar;
    }

    @Override // kotlin.jvm.internal.b0, t0.p0
    public final void d() {
        k kVar = this.e0;
        kVar.P.setVisibility(0);
        if (kVar.P.getParent() instanceof View) {
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            d0.h.c((View) kVar.P.getParent());
        }
    }

    @Override // t0.p0
    public final void e() {
        k kVar = this.e0;
        kVar.P.setAlpha(1.0f);
        kVar.S.d(null);
        kVar.S = null;
    }
}
