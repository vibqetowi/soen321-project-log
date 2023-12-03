package hl;

import android.view.ViewTreeObserver;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
/* compiled from: NotV4DashboardFragment.kt */
/* loaded from: classes2.dex */
public final class g0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ s f17694u;

    public g0(s sVar) {
        this.f17694u = sVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        s sVar = this.f17694u;
        ((RecyclerView) sVar._$_findCachedViewById(R.id.rvNotV4DashboardRecentRecycler)).getViewTreeObserver().removeOnGlobalLayoutListener(this);
        MotionLayout motionLayout = (MotionLayout) sVar._$_findCachedViewById(R.id.layoutNotV4DbRecent);
        if (motionLayout != null) {
            motionLayout.A();
        }
    }
}
