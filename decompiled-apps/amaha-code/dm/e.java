package dm;

import com.google.gson.JsonIOException;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.GoalDateObj;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.GoalHelper;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import is.p;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.i;
import uf.l;
/* compiled from: V3CustomGoalRepository.kt */
/* loaded from: classes2.dex */
public final class e implements l {

    /* renamed from: u  reason: collision with root package name */
    public final String f13148u;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
        if (r11.after(r3.getmStartDate()) != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x000e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList a(ArrayList arrayList, Date displayDate) {
        i.g(displayDate, "displayDate");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            boolean z10 = true;
            if (it.hasNext()) {
                Object next = it.next();
                Goal goal = (Goal) next;
                if (i.b(goal.getCourseName(), "independent") && goal.getGoalId() != null) {
                    String goalId = goal.getGoalId();
                    i.d(goalId);
                    if (goalId.length() >= 7) {
                        String goalId2 = goal.getGoalId();
                        i.d(goalId2);
                        String substring = goalId2.substring(0, 7);
                        i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        if (i.b(substring, "custom_")) {
                            if (goal.isVisible()) {
                                if (displayDate.getTime() != goal.getmStartDate().getTime()) {
                                }
                                if (!z10) {
                                    arrayList2.add(next);
                                }
                            }
                        }
                    }
                }
                z10 = false;
                if (!z10) {
                }
            } else {
                p.P1(arrayList2, new a(d.f13147u, 1));
                return arrayList2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0116 A[Catch: Exception -> 0x02f2, TryCatch #0 {Exception -> 0x02f2, blocks: (B:3:0x0007, B:4:0x0094, B:6:0x009a, B:9:0x00b2, B:11:0x00be, B:13:0x00ca, B:15:0x00d6, B:18:0x00e4, B:20:0x00f0, B:22:0x010a, B:28:0x0116, B:29:0x011e, B:31:0x0124, B:33:0x0148, B:35:0x014f, B:38:0x015a, B:39:0x0166, B:41:0x0174, B:43:0x0180, B:45:0x0192, B:47:0x0199, B:49:0x01a8, B:50:0x01b4, B:52:0x01ba, B:54:0x01d2, B:57:0x01df, B:59:0x01e8, B:61:0x01f8, B:65:0x0201, B:66:0x020b, B:68:0x0222, B:75:0x0263, B:77:0x026b, B:78:0x0291, B:80:0x0299, B:81:0x02bf, B:83:0x02c7, B:84:0x02ec, B:72:0x024d, B:74:0x0254), top: B:89:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hs.f b(Date displayDate, boolean z10) {
        GoalHelper goalHelper;
        GoalHelper goalHelper2;
        String str;
        Integer num;
        Object obj;
        boolean z11;
        Object obj2;
        i.g(displayDate, "displayDate");
        try {
            GoalHelper goalHelper3 = new GoalHelper();
            ArrayList<Goal> userGoals = FirebasePersistence.getInstance().getUser().getUserGoals();
            i.f(userGoals, "getInstance().user.userGoals");
            ArrayList a10 = a(userGoals, displayDate);
            ArrayList<Calendar> weekOf = goalHelper3.getWeekOf(displayDate.getTime());
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            int i6 = 0;
            Integer[] numArr = {-1, -1, -1, -1, -1, -1, -1, -1, -1};
            ArrayList arrayList5 = new ArrayList();
            Iterator it = a10.iterator();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (it.hasNext()) {
                Goal goal = (Goal) it.next();
                if (!i.b(goal.getType(), Constants.GOAL_TYPE_HABIT) && !i.b(goal.getType(), "physical_activity") && !i.b(goal.getType(), Constants.GOAL_TYPE_RELAXATION_ACTIVITY) && !i.b(goal.getType(), Constants.GOAL_TYPE_DAILY_ACTIVITY) && !i.b(goal.getType(), Constants.GOAL_TYPE_ACTIVITY_DAILY)) {
                    if (i.b(goal.getType(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY)) {
                        Object obj3 = "1";
                        Calendar calendar = goalHelper3.getWeekOf(displayDate.getTime()).get(i6);
                        i.f(calendar, "goalHelper.getWeekOf(displayDate.time)[0]");
                        Calendar calendar2 = calendar;
                        ArrayList<GoalDateObj> trackList = goal.getTrackList();
                        if (trackList != null && !trackList.isEmpty()) {
                            z11 = false;
                            if (!z11) {
                                Iterator<GoalDateObj> it2 = goal.getTrackList().iterator();
                                while (it2.hasNext()) {
                                    GoalDateObj next = it2.next();
                                    Object obj4 = obj3;
                                    if (i.b(goalHelper3.getWeekOf(1000 * next.getDate().getTime()).get(0), calendar2) && next.getVal() == 2) {
                                        i11++;
                                        obj2 = obj4;
                                        break;
                                    }
                                    obj3 = obj4;
                                }
                            }
                            obj2 = "0";
                            arrayList2.add(new hs.f(obj2, goal));
                            arrayList5.add(goal);
                        }
                        z11 = true;
                        if (!z11) {
                        }
                        obj2 = "0";
                        arrayList2.add(new hs.f(obj2, goal));
                        arrayList5.add(goal);
                    } else if (i.b(goal.getType(), Constants.GOAL_TYPE_ACTIVITY_ONCE)) {
                        if (!(!goal.getTrackList().isEmpty()) || goal.getTrackList().get(0).getVal() != 2) {
                            obj = "0";
                        } else {
                            i12++;
                            obj = "1";
                        }
                        arrayList3.add(new hs.f(obj, goal));
                        arrayList5.add(goal);
                    }
                    goalHelper = goalHelper3;
                    goalHelper3 = goalHelper;
                    i6 = 0;
                }
                String str2 = "";
                HashMap<Date, Integer> trackMap = goal.getTrackMap();
                Iterator<Calendar> it3 = weekOf.iterator();
                while (it3.hasNext()) {
                    Calendar next2 = it3.next();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    if (trackMap.containsKey(next2.getTime()) && (num = trackMap.get(next2.getTime())) != null) {
                        goalHelper2 = goalHelper3;
                        if (num.intValue() == 2) {
                            if (next2.getTime().getTime() == displayDate.getTime()) {
                                i10++;
                            }
                            str = "1";
                            sb2.append(str);
                            str2 = sb2.toString();
                            goalHelper3 = goalHelper2;
                        }
                        str = "0";
                        sb2.append(str);
                        str2 = sb2.toString();
                        goalHelper3 = goalHelper2;
                    }
                    goalHelper2 = goalHelper3;
                    str = "0";
                    sb2.append(str);
                    str2 = sb2.toString();
                    goalHelper3 = goalHelper2;
                }
                goalHelper = goalHelper3;
                arrayList.add(new hs.f(str2, goal));
                arrayList5.add(goal);
                goalHelper3 = goalHelper;
                i6 = 0;
            }
            numArr[0] = Integer.valueOf(i10);
            numArr[1] = Integer.valueOf(i11);
            numArr[2] = Integer.valueOf(i12);
            boolean z12 = !displayDate.before(Utils.INSTANCE.getTodayCalendar().getTime());
            if ((z12 || (!z12 && !z10)) && (!arrayList5.isEmpty())) {
                arrayList4.add(new hs.f("C", -1));
            }
            if (!arrayList.isEmpty()) {
                numArr[3] = Integer.valueOf(arrayList.size());
                numArr[6] = Integer.valueOf(arrayList4.size());
                arrayList4.add(new hs.f("D", Integer.valueOf(i10)));
                arrayList4.addAll(arrayList);
            }
            if (!arrayList2.isEmpty()) {
                numArr[4] = Integer.valueOf(arrayList2.size());
                numArr[7] = Integer.valueOf(arrayList4.size());
                arrayList4.add(new hs.f("W", Integer.valueOf(i11)));
                arrayList4.addAll(arrayList2);
            }
            if (!arrayList3.isEmpty()) {
                numArr[5] = Integer.valueOf(arrayList3.size());
                numArr[8] = Integer.valueOf(arrayList4.size());
                arrayList4.add(new hs.f("O", Integer.valueOf(i12)));
                arrayList4.addAll(arrayList3);
            }
            return new hs.f(arrayList4, numArr);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f13148u, e10);
            return null;
        }
    }

    @Override // uf.l
    public Object i() {
        throw new JsonIOException(this.f13148u);
    }
}
