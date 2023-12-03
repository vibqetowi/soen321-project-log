package g;

import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
/* compiled from: AppCompatDelegateImpl.java */
/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ k f16118u;

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class a extends kotlin.jvm.internal.b0 {
        public a() {
        }

        @Override // kotlin.jvm.internal.b0, t0.p0
        public final void d() {
            n.this.f16118u.P.setVisibility(0);
        }

        @Override // t0.p0
        public final void e() {
            n nVar = n.this;
            nVar.f16118u.P.setAlpha(1.0f);
            k kVar = nVar.f16118u;
            kVar.S.d(null);
            kVar.S = null;
        }
    }

    public n(k kVar) {
        this.f16118u = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        ViewGroup viewGroup;
        k kVar = this.f16118u;
        kVar.Q.showAtLocation(kVar.P, 55, 0, 0);
        o0 o0Var = kVar.S;
        if (o0Var != null) {
            o0Var.b();
        }
        if (kVar.U && (viewGroup = kVar.V) != null) {
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            if (d0.g.c(viewGroup)) {
                z10 = true;
                if (!z10) {
                    kVar.P.setAlpha(0.0f);
                    o0 a10 = d0.a(kVar.P);
                    a10.a(1.0f);
                    kVar.S = a10;
                    a10.d(new a());
                    return;
                }
                kVar.P.setAlpha(1.0f);
                kVar.P.setVisibility(0);
                return;
            }
        }
        z10 = false;
        if (!z10) {
        }
    }
}
