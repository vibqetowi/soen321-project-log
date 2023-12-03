package qo;

import com.theinnerhour.b2b.components.pro.goal.model.DaySpecificDailyGoal;
import com.theinnerhour.b2b.components.pro.goal.model.SimpleGoalModel;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.GoalHelper;
import com.theinnerhour.b2b.utils.Utils;
import hs.f;
import hs.k;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.d0;
import ls.d;
import ns.e;
import ns.i;
import ss.p;
/* compiled from: GoalCoachViewModelNew.kt */
@e(c = "com.theinnerhour.b2b.components.pro.goal.viewmodel.GoalCoachViewModelNew$fetchData$1", f = "GoalCoachViewModelNew.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class a extends i implements p<d0, d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Date f29978u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ b f29979v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ ArrayList<SimpleGoalModel> f29980w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Date date, b bVar, ArrayList<SimpleGoalModel> arrayList, d<? super a> dVar) {
        super(2, dVar);
        this.f29978u = date;
        this.f29979v = bVar;
        this.f29980w = arrayList;
    }

    @Override // ns.a
    public final d<k> create(Object obj, d<?> dVar) {
        return new a(this.f29978u, this.f29979v, this.f29980w, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, d<? super k> dVar) {
        return ((a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        Date date;
        b bVar;
        Long l2;
        Date startDate;
        sp.b.d0(obj);
        ArrayList<f<String, ?>> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Calendar todayCalendar = Utils.INSTANCE.getTodayCalendar();
        GoalHelper goalHelper = new GoalHelper();
        v vVar = new v();
        v vVar2 = new v();
        HashMap hashMap = new HashMap();
        Iterator<T> it = this.f29980w.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            date = this.f29978u;
            if (!hasNext) {
                break;
            }
            SimpleGoalModel simpleGoalModel = (SimpleGoalModel) it.next();
            if (simpleGoalModel.getStartDate().getTime() <= date.getTime() && simpleGoalModel.getEndDate().getTime() > date.getTime()) {
                hashMap.put(new f(simpleGoalModel.getGoalId(), simpleGoalModel.getCourseId()), simpleGoalModel);
            }
        }
        Iterator<Goal> it2 = FirebasePersistence.getInstance().getUser().getUserGoals().iterator();
        while (true) {
            boolean hasNext2 = it2.hasNext();
            bVar = this.f29979v;
            if (!hasNext2) {
                break;
            }
            Goal next = it2.next();
            if (hashMap.containsKey(new f(next.getGoalId(), next.getCourseId()))) {
                SimpleGoalModel simpleGoalModel2 = (SimpleGoalModel) hashMap.get(new f(next.getGoalId(), next.getCourseId()));
                DaySpecificDailyGoal daySpecificDailyGoal = new DaySpecificDailyGoal(next, date, goalHelper);
                if (simpleGoalModel2 != null && simpleGoalModel2.getStartDate().getTime() <= date.getTime() && simpleGoalModel2.getEndDate().getTime() > date.getTime()) {
                    if (simpleGoalModel2.getStartDate().getTime() <= todayCalendar.getTimeInMillis() && simpleGoalModel2.getEndDate().getTime() > todayCalendar.getTimeInMillis()) {
                        arrayList2.add(new f("enabled", daySpecificDailyGoal));
                    } else {
                        arrayList3.add(new f("disabled", daySpecificDailyGoal));
                    }
                    vVar.f23467u++;
                    if (daySpecificDailyGoal.getTrackedForDay()) {
                        vVar2.f23467u++;
                    }
                }
                if (simpleGoalModel2 != null && (startDate = simpleGoalModel2.getStartDate()) != null) {
                    l2 = new Long(startDate.getTime());
                } else {
                    l2 = null;
                }
                if (l2 != null) {
                    long time = simpleGoalModel2.getStartDate().getTime();
                    HashMap hashMap2 = hashMap;
                    Iterator<Goal> it3 = it2;
                    long j10 = bVar.A;
                    if (time < j10 || j10 == 0) {
                        bVar.A = simpleGoalModel2.getStartDate().getTime();
                    }
                    hashMap = hashMap2;
                    it2 = it3;
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(new f<>("enabled_divider", new f(new Integer(vVar2.f23467u), new Integer(vVar.f23467u))));
            arrayList.addAll(arrayList2);
        } else if (!arrayList3.isEmpty()) {
            arrayList.add(new f<>("disabled_divider", new f(new Integer(vVar2.f23467u), new Integer(vVar.f23467u))));
            arrayList.addAll(arrayList3);
        }
        if (arrayList.isEmpty() && date.getTime() > bVar.A) {
            arrayList.add(new f<>("gap_day_divider", new f(new Integer(0), new Integer(0))));
        } else if ((!arrayList.isEmpty()) && ApplicationPersistence.getInstance().getBooleanValue("pro_goal_alert_1", true)) {
            arrayList.add(new f<>("alert", "alert"));
        }
        bVar.f29981x.i(arrayList);
        bVar.f29982y.i(Boolean.valueOf(!arrayList2.isEmpty()));
        if (date.getTime() == todayCalendar.getTimeInMillis()) {
            bVar.f29983z.i(new f<>(new Integer(vVar2.f23467u), new Integer(vVar.f23467u)));
        }
        return k.f19476a;
    }
}
