package o7;

import android.database.Cursor;
import android.view.View;
import android.view.ViewParent;
import c9.j;
import com.google.android.exoplayer2.w;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.Reference;
import java.util.WeakHashMap;
import je.q0;
import r1.b0;
import t0.d0;
import t0.o0;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements j.a, u0.l, ya.b, oe.l, oe.i {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f27205u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f27206v;

    public /* synthetic */ k(int i6, Object obj) {
        this.f27206v = obj;
        this.f27205u = i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    @Override // u0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(View view) {
        String str;
        boolean z10;
        SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f27206v;
        sideSheetBehavior.getClass();
        int i6 = this.f27205u;
        if (i6 != 1 && i6 != 2) {
            Reference reference = sideSheetBehavior.f9119n;
            if (reference != null && reference.get() != null) {
                View view2 = (View) sideSheetBehavior.f9119n.get();
                i0.g gVar = new i0.g(i6, 2, sideSheetBehavior);
                ViewParent parent = view2.getParent();
                if (parent != null && parent.isLayoutRequested()) {
                    WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                    if (d0.g.b(view2)) {
                        z10 = true;
                        if (!z10) {
                            view2.post(gVar);
                        } else {
                            gVar.run();
                        }
                    }
                }
                z10 = false;
                if (!z10) {
                }
            } else {
                sideSheetBehavior.setStateInternal(i6);
            }
            return true;
        }
        StringBuilder sb2 = new StringBuilder("STATE_");
        if (i6 == 1) {
            str = "DRAGGING";
        } else {
            str = "SETTLING";
        }
        throw new IllegalArgumentException(b0.b(sb2, str, " should not be set externally."));
    }

    @Override // oe.i
    public final Object apply(Object obj) {
        q0 q0Var = (q0) this.f27206v;
        q0Var.getClass();
        return q0Var.k(((Cursor) obj).getBlob(0), this.f27205u);
    }

    @Override // oe.l
    public final Object get() {
        boolean z10;
        je.k kVar = (je.k) this.f27206v;
        je.w wVar = kVar.f21848c;
        int i6 = this.f27205u;
        le.g g5 = wVar.g(i6);
        if (g5 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ca.a.u0(z10, "Attempt to reject nonexistent batch!", new Object[0]);
        kVar.f21848c.c(g5);
        kVar.f21848c.a();
        kVar.f21849d.e(i6);
        je.h hVar = kVar.f;
        hVar.g(hVar.f21830a.e(g5.b()));
        return kVar.f.b(g5.b());
    }

    @Override // c9.j.a
    public final void invoke(Object obj) {
        ((w.b) obj).R((com.google.android.exoplayer2.q) this.f27206v, this.f27205u);
    }

    @Override // ya.b
    public final Object then(ya.h hVar) {
        ya.h<String> d10;
        ge.d dVar = (ge.d) this.f27206v;
        int i6 = this.f27205u;
        synchronized (dVar) {
            if (i6 != dVar.f16465y) {
                kc.f.A(1, "FirebaseAuthCredentialsProvider", "getToken aborted due to token change", new Object[0]);
                d10 = dVar.j();
            } else if (hVar.isSuccessful()) {
                d10 = ya.k.e(((fd.g) hVar.getResult()).f14954a);
            } else {
                d10 = ya.k.d(hVar.getException());
            }
        }
        return d10;
    }
}
