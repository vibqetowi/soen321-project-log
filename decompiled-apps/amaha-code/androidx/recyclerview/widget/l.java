package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import java.util.ArrayList;
/* compiled from: ItemTouchHelper.java */
/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ k.f f3039u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f3040v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ k f3041w;

    public l(k kVar, k.f fVar, int i6) {
        this.f3041w = kVar;
        this.f3039u = fVar;
        this.f3040v = i6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k kVar = this.f3041w;
        RecyclerView recyclerView = kVar.r;
        if (recyclerView != null && recyclerView.isAttachedToWindow()) {
            k.f fVar = this.f3039u;
            if (!fVar.f3036k) {
                RecyclerView.c0 c0Var = fVar.f3031e;
                if (c0Var.e() != -1) {
                    RecyclerView.j itemAnimator = kVar.r.getItemAnimator();
                    if (itemAnimator == null || !itemAnimator.j()) {
                        ArrayList arrayList = kVar.f3010p;
                        int size = arrayList.size();
                        boolean z10 = false;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size) {
                                break;
                            } else if (!((k.f) arrayList.get(i6)).f3037l) {
                                z10 = true;
                                break;
                            } else {
                                i6++;
                            }
                        }
                        if (!z10) {
                            kVar.f3007m.onSwiped(c0Var, this.f3040v);
                            return;
                        }
                    }
                    kVar.r.post(this);
                }
            }
        }
    }
}
