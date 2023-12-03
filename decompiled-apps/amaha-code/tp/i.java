package tp;

import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.topicalcourses.activity.TopicalGoalsActivity;
import java.util.Date;
/* compiled from: TopicalGoalsActivity.kt */
/* loaded from: classes2.dex */
public final class i implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ TopicalGoalsActivity f33411u;

    public i(TopicalGoalsActivity topicalGoalsActivity) {
        this.f33411u = topicalGoalsActivity;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        TopicalGoalsActivity topicalGoalsActivity = this.f33411u;
        xp.d dVar = topicalGoalsActivity.J;
        if (dVar != null) {
            Date displayDate = topicalGoalsActivity.E;
            kotlin.jvm.internal.i.f(displayDate, "displayDate");
            dVar.e(displayDate);
            ((RecyclerView) topicalGoalsActivity.n0(R.id.goalRecyclerView)).getViewTreeObserver().removeOnGlobalLayoutListener(this);
            return;
        }
        kotlin.jvm.internal.i.q("goalViewModel");
        throw null;
    }
}
