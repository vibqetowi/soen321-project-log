package i0;

import android.util.SparseArray;
import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import i0.f;
import java.util.Iterator;
import je.b1;
import je.k;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f19639u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f19640v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f19641w;

    public /* synthetic */ g(int i6, int i10, Object obj) {
        this.f19639u = i10;
        this.f19641w = obj;
        this.f19640v = i6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        int i6 = this.f19639u;
        boolean z11 = true;
        int i10 = this.f19640v;
        Object obj = this.f19641w;
        switch (i6) {
            case 0:
                ((f.e) obj).c(i10);
                return;
            case 1:
                com.google.android.exoplayer2.c cVar = com.google.android.exoplayer2.c.this;
                cVar.getClass();
                if (i10 != -3 && i10 != -2) {
                    if (i10 != -1) {
                        if (i10 != 1) {
                            defpackage.d.k(38, "Unknown focus change type: ", i10, "AudioFocusManager");
                            return;
                        }
                        cVar.d(1);
                        cVar.b(1);
                        return;
                    }
                    cVar.b(-1);
                    cVar.a();
                    return;
                }
                if (i10 != -2) {
                    q7.d dVar = cVar.f6340d;
                    if (!((dVar == null || dVar.f29243u != 1) ? false : false)) {
                        cVar.d(3);
                        return;
                    }
                }
                cVar.b(0);
                cVar.d(2);
                return;
            case 2:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                View view = (View) sideSheetBehavior.f9119n.get();
                if (view != null) {
                    sideSheetBehavior.startSettling(view, i10, false);
                    return;
                }
                return;
            default:
                k kVar = (k) obj;
                SparseArray<b1> sparseArray = kVar.f21854j;
                b1 b1Var = sparseArray.get(i10);
                if (b1Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ca.a.u0(z10, "Tried to release nonexistent target: %s", Integer.valueOf(i10));
                Iterator it = kVar.f21852h.l(i10).iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    androidx.work.k kVar2 = kVar.f21846a;
                    if (hasNext) {
                        kVar2.r().i((ke.i) it.next());
                    } else {
                        kVar2.r().j(b1Var);
                        sparseArray.remove(i10);
                        kVar.f21855k.remove(b1Var.f21796a);
                        return;
                    }
                }
        }
    }
}
