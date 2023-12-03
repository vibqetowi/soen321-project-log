package hl;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Timer;
/* compiled from: NotV4DashboardFragment.kt */
/* loaded from: classes2.dex */
public final class y implements RecyclerView.q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s f17771a;

    public y(s sVar) {
        this.f17771a = sVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void a(RecyclerView rv2, MotionEvent e10) {
        kotlin.jvm.internal.i.g(rv2, "rv");
        kotlin.jvm.internal.i.g(e10, "e");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final boolean c(RecyclerView rv2, MotionEvent e10) {
        kotlin.jvm.internal.i.g(rv2, "rv");
        kotlin.jvm.internal.i.g(e10, "e");
        s sVar = this.f17771a;
        Timer timer = sVar.f17738z;
        if (timer != null) {
            if (timer != null) {
                timer.cancel();
            }
            sVar.f17738z = null;
            return false;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void e(boolean z10) {
    }
}
