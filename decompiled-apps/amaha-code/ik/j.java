package ik;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Timer;
/* compiled from: ExptInitialAssessmentA3VarBTeleConsultationFragment.kt */
/* loaded from: classes2.dex */
public final class j implements RecyclerView.q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f20202a;

    public j(k kVar) {
        this.f20202a = kVar;
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
        k kVar = this.f20202a;
        Timer timer = kVar.f20215v;
        if (timer != null) {
            if (timer != null) {
                timer.cancel();
            }
            kVar.f20215v = null;
            return false;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void e(boolean z10) {
    }
}
