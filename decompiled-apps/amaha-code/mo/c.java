package mo;

import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Utils;
import hs.k;
import is.u;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.d0;
import ns.i;
import ss.p;
/* compiled from: ProDashboardRepository.kt */
@ns.e(c = "com.theinnerhour.b2b.components.pro.dashboard.repository.ProDashboardRepository$getTrackedGoalsInfo$2", f = "ProDashboardRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends i implements p<d0, ls.d<? super Integer>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ArrayList<Goal> f25658u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ArrayList<Goal> arrayList, ls.d<? super c> dVar) {
        super(2, dVar);
        this.f25658u = arrayList;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new c(this.f25658u, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super Integer> dVar) {
        return ((c) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        Integer num;
        boolean z10;
        sp.b.d0(obj);
        ArrayList<Goal> arrayList = this.f25658u;
        if (arrayList != null && (!arrayList.isEmpty())) {
            Calendar todayCalendar = Utils.INSTANCE.getTodayCalendar();
            v vVar = new v();
            vVar.f23467u = -1;
            HashSet hashSet = new HashSet();
            ArrayList<Goal> arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                Goal goal = (Goal) obj2;
                long j10 = 1000;
                if (goal.getStartDate().getTime() * j10 <= todayCalendar.getTimeInMillis() && goal.getEndDate().getTime() * j10 > todayCalendar.getTimeInMillis()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    arrayList2.add(obj2);
                }
            }
            for (Goal goal2 : arrayList2) {
                String goalId = goal2.getGoalId();
                String str = "";
                if (goalId == null) {
                    goalId = "";
                }
                String courseId = goal2.getCourseId();
                if (courseId != null) {
                    str = courseId;
                }
                hashSet.add(new hs.f(goalId, str));
            }
            ArrayList<Goal> userGoals = FirebasePersistence.getInstance().getUser().getUserGoals();
            kotlin.jvm.internal.i.f(userGoals, "getInstance().user.userGoals");
            for (Goal goal3 : userGoals) {
                if (u.Z1(hashSet, new hs.f(goal3.getGoalId(), goal3.getCourseId())) && (!goal3.getTrackMap().containsKey(todayCalendar.getTime()) || (goal3.getTrackMap().containsKey(todayCalendar.getTime()) && ((num = goal3.getTrackMap().get(todayCalendar.getTime())) == null || num.intValue() != 2)))) {
                    int i6 = vVar.f23467u;
                    if (i6 == -1) {
                        vVar.f23467u = 1;
                    } else {
                        vVar.f23467u = i6 + 1;
                    }
                }
            }
            return new Integer(vVar.f23467u);
        }
        return new Integer(-1);
    }
}
