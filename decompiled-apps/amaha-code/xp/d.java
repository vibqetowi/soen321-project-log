package xp;

import androidx.lifecycle.l0;
import androidx.lifecycle.w;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import is.p;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import kotlin.jvm.internal.i;
/* compiled from: TopicalGoalViewModel.kt */
/* loaded from: classes2.dex */
public final class d extends l0 {

    /* renamed from: x  reason: collision with root package name */
    public final String f37887x = LogHelper.INSTANCE.makeLogTag(d.class);

    /* renamed from: y  reason: collision with root package name */
    public final w<ArrayList<Goal>> f37888y = new w<>();

    /* renamed from: z  reason: collision with root package name */
    public final w<Integer> f37889z = new w<>(-1);
    public final w<Integer> A = new w<>(0);

    public final void e(Date date) {
        int i6;
        try {
            Date date2 = new Date(date.getTime() + 1);
            ArrayList<Goal> topicalGoals = FirebasePersistence.getInstance().getUser().getTopicalGoals();
            i.f(topicalGoals, "getInstance().user.topicalGoals");
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = topicalGoals.iterator();
            while (true) {
                boolean z10 = true;
                i6 = 0;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Goal goal = (Goal) next;
                if (i.b(goal.getCourseName(), "") || !goal.isVisible() || !date2.after(goal.getmStartDate())) {
                    z10 = false;
                }
                if (z10) {
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty()) {
                p.P1(arrayList, new dm.a(c.f37886u, 21));
            }
            ArrayList<Goal> arrayList2 = new ArrayList<>();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Goal goal2 = (Goal) it2.next();
                if (i.b(goal2.getType(), Constants.GOAL_TYPE_HABIT) || i.b(goal2.getType(), "physical_activity") || i.b(goal2.getType(), Constants.GOAL_TYPE_RELAXATION_ACTIVITY) || i.b(goal2.getType(), Constants.GOAL_TYPE_DAILY_ACTIVITY) || i.b(goal2.getType(), Constants.GOAL_TYPE_ACTIVITY_DAILY)) {
                    arrayList2.add(goal2);
                    Integer num = goal2.getTrackMap().get(date);
                    if (num == null) {
                        num = -1;
                    }
                    if (num.intValue() == 2) {
                        i6++;
                    }
                }
            }
            this.f37888y.l(arrayList2);
            this.A.l(Integer.valueOf(arrayList2.size()));
            this.f37889z.l(Integer.valueOf(i6));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f37887x, e10);
        }
    }
}
