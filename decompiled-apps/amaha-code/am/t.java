package am;

import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.goals.activity.V2GoalsActivity;
import com.theinnerhour.b2b.utils.Utils;
import java.util.concurrent.TimeUnit;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f664u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ V2GoalsActivity f665v;

    public /* synthetic */ t(V2GoalsActivity v2GoalsActivity, int i6) {
        this.f664u = i6;
        this.f665v = v2GoalsActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f664u;
        V2GoalsActivity this$0 = this.f665v;
        switch (i6) {
            case 0:
                int i10 = V2GoalsActivity.Q;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                TimeUnit timeUnit = TimeUnit.DAYS;
                long timeInMillis = Utils.INSTANCE.getTodayCalendar().getTimeInMillis();
                bm.k kVar = this$0.f11175x;
                if (kVar != null) {
                    ((RecyclerView) this$0.n0(R.id.rvGoalsListCalendar)).h0((int) (timeUnit.convert(timeInMillis - kVar.f4480x, TimeUnit.MILLISECONDS) + 1));
                    return;
                } else {
                    kotlin.jvm.internal.i.q("goalsCalendarAdapter");
                    throw null;
                }
            default:
                int i11 = V2GoalsActivity.Q;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                bm.i iVar = this$0.O;
                if (iVar != null) {
                    iVar.i();
                    return;
                }
                return;
        }
    }
}
