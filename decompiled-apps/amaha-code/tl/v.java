package tl;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import java.util.Timer;
/* compiled from: TherapistExpertInfoFragment.kt */
/* loaded from: classes2.dex */
public final class v implements RecyclerView.q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f33280a;

    public v(q qVar) {
        this.f33280a = qVar;
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
        q qVar = this.f33280a;
        Timer timer = qVar.F;
        if (timer != null) {
            timer.cancel();
        }
        qVar.F = null;
        RecyclerView recyclerView = (RecyclerView) qVar._$_findCachedViewById(R.id.rvExpertCareInfoListingRecycler);
        if (recyclerView != null) {
            recyclerView.b0(this);
            return false;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void e(boolean z10) {
    }
}
