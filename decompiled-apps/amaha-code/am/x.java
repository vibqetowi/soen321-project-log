package am;

import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.goals.activity.V2GoalsActivity;
import fm.o1;
import java.util.Date;
/* compiled from: V2GoalsActivity.kt */
/* loaded from: classes2.dex */
public final class x implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ V2GoalsActivity f672u;

    public x(V2GoalsActivity v2GoalsActivity) {
        this.f672u = v2GoalsActivity;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        V2GoalsActivity v2GoalsActivity = this.f672u;
        o1 o1Var = v2GoalsActivity.J;
        if (o1Var != null) {
            Date displayDate = v2GoalsActivity.M;
            kotlin.jvm.internal.i.f(displayDate, "displayDate");
            o1Var.e(displayDate);
            ((RecyclerView) v2GoalsActivity.n0(R.id.goalRecyclerView)).getViewTreeObserver().removeOnGlobalLayoutListener(this);
            return;
        }
        kotlin.jvm.internal.i.q("goalViewModel");
        throw null;
    }
}
