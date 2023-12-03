package dm;

import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.GoalType;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import gv.n;
import is.p;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.i;
/* compiled from: GoalRepository.kt */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f13146a = LogHelper.INSTANCE.makeLogTag(c.class);

    public static ArrayList a(ArrayList arrayList, Date displayDate) {
        boolean z10;
        i.g(displayDate, "displayDate");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            boolean z11 = false;
            if (it.hasNext()) {
                Object next = it.next();
                Goal goal = (Goal) next;
                if (goal.isVisible()) {
                    String courseName = goal.getCourseName();
                    if (courseName != null && !n.B0(courseName)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (!z10 && (displayDate.getTime() == goal.getmStartDate().getTime() || displayDate.after(goal.getmStartDate()))) {
                        z11 = true;
                    }
                }
                if (z11) {
                    arrayList2.add(next);
                }
            } else {
                p.P1(arrayList2, new a(b.f13145u, 0));
                return arrayList2;
            }
        }
    }

    public final hs.f<ArrayList<Object>, Integer[]> b(Date displayDate) {
        Integer num;
        Integer num2;
        i.g(displayDate, "displayDate");
        try {
            ArrayList<Goal> userGoals = FirebasePersistence.getInstance().getUser().getUserGoals();
            i.f(userGoals, "getInstance().user.userGoals");
            ArrayList a10 = a(userGoals, displayDate);
            Integer[] numArr = {-1, -1, -1, -1, -1, -1, -1, -1, -1};
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            HashMap<String, GoalType> goalsHashMap = Constants.getGoalsHashMap();
            i.f(goalsHashMap, "getGoalsHashMap()");
            Iterator it = a10.iterator();
            int i6 = 0;
            int i10 = 0;
            int i11 = 0;
            while (it.hasNext()) {
                Goal goal = (Goal) it.next();
                GoalType goalType = goalsHashMap.get(goal.getGoalId());
                if (goalType != null) {
                    if (!i.b(goalType.getType(), Constants.GOAL_TYPE_HABIT) && !i.b(goalType.getType(), "physical_activity") && !i.b(goalType.getType(), Constants.GOAL_TYPE_RELAXATION_ACTIVITY) && !i.b(goalType.getType(), Constants.GOAL_TYPE_DAILY_ACTIVITY)) {
                        if (i.b(goalType.getType(), Constants.GOAL_TYPE_THOUGHT)) {
                            arrayList2.add(goal);
                            HashMap<Date, Integer> trackMap = goal.getTrackMap();
                            if (trackMap.containsKey(displayDate) && (num2 = trackMap.get(displayDate)) != null && num2.intValue() == 2) {
                                i10++;
                            }
                        } else if (i.b(goalType.getType(), "activity_scheduling")) {
                            arrayList3.add(goal);
                            HashMap<Date, Integer> trackMap2 = goal.getTrackMap();
                            if (trackMap2.containsKey(displayDate)) {
                                Integer num3 = trackMap2.get(displayDate);
                                if (num3 == null) {
                                    num3 = -1;
                                }
                                if (num3.intValue() >= 0) {
                                    i11++;
                                }
                            }
                        }
                    }
                    arrayList.add(goal);
                    HashMap<Date, Integer> trackMap3 = goal.getTrackMap();
                    if (trackMap3.containsKey(displayDate) && (num = trackMap3.get(displayDate)) != null && num.intValue() == 2) {
                        i6++;
                    }
                } else if (goal.getType() != null && i.b(goal.getType(), Constants.GOAL_TYPE_DAILY_ACTIVITY)) {
                    arrayList.add(goal);
                    HashMap<Date, Integer> trackMap4 = goal.getTrackMap();
                    if (trackMap4.containsKey(displayDate)) {
                        Integer num4 = trackMap4.get(displayDate);
                        if (num4 != null) {
                            if (num4.intValue() != 2) {
                            }
                            i6++;
                        }
                    }
                }
            }
            numArr[0] = Integer.valueOf(i6);
            numArr[1] = Integer.valueOf(i10);
            numArr[2] = Integer.valueOf(i11);
            if (!arrayList.isEmpty()) {
                numArr[3] = Integer.valueOf(arrayList.size());
                numArr[6] = Integer.valueOf(arrayList4.size());
                arrayList4.add(new hs.f("D", Integer.valueOf(i6)));
                arrayList4.addAll(arrayList);
            }
            if (!arrayList2.isEmpty()) {
                numArr[4] = Integer.valueOf(arrayList2.size());
                numArr[7] = Integer.valueOf(arrayList4.size());
                arrayList4.add(new hs.f("T", Integer.valueOf(i10)));
                arrayList4.addAll(arrayList2);
            }
            if (!arrayList3.isEmpty()) {
                numArr[5] = Integer.valueOf(arrayList3.size());
                numArr[8] = Integer.valueOf(arrayList4.size());
                arrayList4.add(new hs.f("S", Integer.valueOf(i11)));
                arrayList4.addAll(arrayList3);
            }
            if ((!arrayList4.isEmpty()) && !displayDate.before(Utils.INSTANCE.getTodayCalendar().getTime())) {
                arrayList4.add(new hs.f("C", -1));
            }
            return new hs.f<>(arrayList4, numArr);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f13146a, e10);
            return null;
        }
    }
}
