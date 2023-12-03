package am;

import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import java.util.Calendar;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b0 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f617u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Goal f618v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Calendar f619w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ V3GoalsActivity f620x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ int f621y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Dialog f622z;

    public /* synthetic */ b0(Goal goal, Calendar calendar, V3GoalsActivity v3GoalsActivity, int i6, Dialog dialog, int i10) {
        this.f617u = i10;
        this.f618v = goal;
        this.f619w = calendar;
        this.f620x = v3GoalsActivity;
        this.f621y = i6;
        this.f622z = dialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f617u;
        int i10 = this.f621y;
        Fragment fragment = null;
        Calendar calendar = this.f619w;
        Dialog dialog = this.f622z;
        V3GoalsActivity this$0 = this.f620x;
        Goal goal = this.f618v;
        switch (i6) {
            case 0:
                int i11 = V3GoalsActivity.X;
                kotlin.jvm.internal.i.g(goal, "$goal");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                goal.getScheduledDate().setTime(calendar.getTimeInMillis() / 1000);
                FirebasePersistence.getInstance().updateGoal(goal, Boolean.FALSE);
                V3GoalsActivity.a aVar = this$0.P;
                if (aVar != null) {
                    fragment = aVar.q(0);
                }
                kotlin.jvm.internal.i.e(fragment, "null cannot be cast to non-null type com.theinnerhour.b2b.components.goals.fragment.V3GoalsRegularFragment");
                cm.c0 c0Var = (cm.c0) fragment;
                try {
                    if (i10 != -1) {
                        bm.o oVar = c0Var.f5319x;
                        if (oVar != null) {
                            oVar.j(i10);
                        }
                    } else {
                        bm.o oVar2 = c0Var.f5319x;
                        if (oVar2 != null) {
                            oVar2.i();
                        }
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(c0Var.f5316u, e10);
                }
                dialog.dismiss();
                Utils.INSTANCE.showCustomToast(this$0, "Updated!");
                String str = gk.a.f16573a;
                gk.a.b(UtilsKt.getAnalyticsBundle(), "weekly_goal_reschedule");
                return;
            default:
                int i12 = V3GoalsActivity.X;
                kotlin.jvm.internal.i.g(goal, "$goal");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                goal.getScheduledDate().setTime(calendar.getTimeInMillis() / 1000);
                FirebasePersistence.getInstance().updateGoal(goal, Boolean.FALSE);
                V3GoalsActivity.a aVar2 = this$0.P;
                if (aVar2 != null) {
                    fragment = aVar2.q(1);
                }
                kotlin.jvm.internal.i.e(fragment, "null cannot be cast to non-null type com.theinnerhour.b2b.components.goals.fragment.V3GoalsCustomFragment");
                cm.z zVar = (cm.z) fragment;
                try {
                    if (i10 != -1) {
                        bm.m mVar = zVar.f5393x;
                        if (mVar != null) {
                            mVar.j(i10);
                        }
                    } else {
                        bm.m mVar2 = zVar.f5393x;
                        if (mVar2 != null) {
                            mVar2.i();
                        }
                    }
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(zVar.f5390u, e11);
                }
                dialog.dismiss();
                Utils.INSTANCE.showCustomToast(this$0, "Updated!");
                String str2 = gk.a.f16573a;
                gk.a.b(UtilsKt.getAnalyticsBundle(), "weekly_goal_reschedule");
                return;
        }
    }
}
