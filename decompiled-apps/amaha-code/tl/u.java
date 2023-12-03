package tl;

import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import java.util.TimerTask;
/* compiled from: TherapistExpertInfoFragment.kt */
/* loaded from: classes2.dex */
public final class u extends TimerTask {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ q f33278u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f33279v;

    public u(q qVar, int i6) {
        this.f33278u = qVar;
        this.f33279v = i6;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = (RecyclerView) this.f33278u._$_findCachedViewById(R.id.rvExpertCareInfoListingRecycler);
        if (recyclerView != null) {
            recyclerView.j0(this.f33279v, 0);
        }
    }
}
