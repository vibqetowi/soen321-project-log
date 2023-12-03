package com.theinnerhour.b2b.utils;

import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.GoalDateObj;
import is.u;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
/* compiled from: GoalHelper.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u000b\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0016\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002J.\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00122\u001a\u0010\u0015\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00120\u0011R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/theinnerhour/b2b/utils/GoalHelper;", "", "", "dateInMillis", "Ljava/util/ArrayList;", "Ljava/util/Calendar;", "getWeekOf", "Lcom/theinnerhour/b2b/model/Goal;", Constants.GOAL, "", "isWeeklyActivityIncompleteAndScheduled", "isDailyActivityIncompleteAndScheduled", "isOneTimeActivityIncompleteAndScheduled", "goalScheduledTimeInMillis", "currentTimeInMillis", "", "getWeekdayOffset", "", "Lhs/f;", "Lcom/theinnerhour/b2b/components/goals/model/FirestoreGoal;", "Lcom/theinnerhour/b2b/model/GoalDateObj;", "list", "isPendingGoals", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class GoalHelper {
    private final String TAG = LogHelper.INSTANCE.makeLogTag(GoalHelper.class);

    public final ArrayList<Calendar> getWeekOf(long j10) {
        ArrayList<Calendar> arrayList = new ArrayList<>();
        if (j10 > 0) {
            try {
                Calendar.getInstance().setTimeInMillis(j10);
                int i6 = 0;
                String dayText = LocalDateTime.ofEpochSecond(j10 / 1000, 0, ZoneId.systemDefault().getRules().getOffset(Instant.ofEpochMilli(j10))).format(DateTimeFormatter.ofPattern("EEEE").withLocale(Locale.ENGLISH));
                kotlin.jvm.internal.i.f(dayText, "dayText");
                String substring = dayText.substring(0, 3);
                kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                switch (substring.hashCode()) {
                    case 70909:
                        if (substring.equals("Fri")) {
                            i6 = 4;
                            break;
                        } else {
                            i6 = -1;
                            break;
                        }
                    case 77548:
                        if (!substring.equals("Mon")) {
                            i6 = -1;
                            break;
                        }
                        break;
                    case 82886:
                        if (substring.equals("Sat")) {
                            i6 = 5;
                            break;
                        } else {
                            i6 = -1;
                            break;
                        }
                    case 83500:
                        if (substring.equals("Sun")) {
                            i6 = 6;
                            break;
                        } else {
                            i6 = -1;
                            break;
                        }
                    case 84065:
                        if (substring.equals("Thu")) {
                            i6 = 3;
                            break;
                        } else {
                            i6 = -1;
                            break;
                        }
                    case 84452:
                        if (substring.equals("Tue")) {
                            i6 = 1;
                            break;
                        } else {
                            i6 = -1;
                            break;
                        }
                    case 86838:
                        if (substring.equals("Wed")) {
                            i6 = 2;
                            break;
                        } else {
                            i6 = -1;
                            break;
                        }
                    default:
                        i6 = -1;
                        break;
                }
                while (-1 < i6) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(j10);
                    calendar.add(5, i6 * (-1));
                    arrayList.add(calendar);
                    i6--;
                }
                int size = 8 - arrayList.size();
                for (int i10 = 1; i10 < size; i10++) {
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTimeInMillis(j10);
                    calendar2.add(5, i10);
                    arrayList.add(calendar2);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.TAG, e10);
            }
        }
        return arrayList;
    }

    public final int getWeekdayOffset(long j10, long j11) {
        if (j10 < 0 || j11 < 0) {
            return -1;
        }
        try {
            String[] strArr = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
            ZoneOffset offset = ZoneId.systemDefault().getRules().getOffset(Instant.ofEpochMilli(j10));
            long j12 = 1000;
            LocalDateTime ofEpochSecond = LocalDateTime.ofEpochSecond(j10 / j12, 0, offset);
            DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("EEEE");
            Locale locale = Locale.ENGLISH;
            String dayText = ofEpochSecond.format(ofPattern.withLocale(locale));
            String todayText = LocalDateTime.ofEpochSecond(j11 / j12, 0, offset).format(DateTimeFormatter.ofPattern("EEEE").withLocale(locale));
            kotlin.jvm.internal.i.f(dayText, "dayText");
            String substring = dayText.substring(0, 3);
            kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            kotlin.jvm.internal.i.f(todayText, "todayText");
            String substring2 = todayText.substring(0, 3);
            kotlin.jvm.internal.i.f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            return is.k.W1(substring, strArr) - is.k.W1(substring2, strArr);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.TAG, e10);
            return -1;
        }
    }

    public final boolean isDailyActivityIncompleteAndScheduled(Goal goal) {
        Integer num;
        if (goal != null) {
            try {
                if (!goal.getNotificationScheduled()) {
                    return false;
                }
                HashMap<Date, Integer> trackMap = goal.getTrackMap();
                int i6 = -1;
                if (trackMap != null) {
                    Date time = Utils.INSTANCE.getTodayCalendar().getTime();
                    if (trackMap.containsKey(time) && (num = trackMap.get(time)) != null) {
                        i6 = num.intValue();
                    }
                }
                if (i6 == 2) {
                    return false;
                }
                return true;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.TAG, e10);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001d A[Catch: Exception -> 0x003b, TryCatch #0 {Exception -> 0x003b, blocks: (B:4:0x0003, B:7:0x000a, B:9:0x0011, B:15:0x001d, B:17:0x0028), top: B:25:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isOneTimeActivityIncompleteAndScheduled(Goal goal) {
        boolean z10;
        if (goal != null) {
            try {
                if (!goal.getNotificationScheduled()) {
                    return false;
                }
                ArrayList<GoalDateObj> trackList = goal.getTrackList();
                if (trackList != null && !trackList.isEmpty()) {
                    z10 = false;
                    if (!z10) {
                        if (!(!goal.getTrackList().isEmpty())) {
                            return false;
                        }
                        if (((GoalDateObj) u.o2(goal.getTrackList())).getVal() == 2) {
                            return false;
                        }
                    }
                    return true;
                }
                z10 = true;
                if (!z10) {
                }
                return true;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.TAG, e10);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hs.f<Boolean, Boolean> isPendingGoals(List<hs.f<FirestoreGoal, GoalDateObj>> list) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        kotlin.jvm.internal.i.g(list, "list");
        boolean z14 = !list.isEmpty();
        Iterator<T> it = list.iterator();
        boolean z15 = true;
        while (it.hasNext()) {
            hs.f fVar = (hs.f) it.next();
            String type = ((FirestoreGoal) fVar.f19464u).getType();
            boolean z16 = false;
            B b10 = fVar.f19465v;
            if (type != null) {
                int hashCode = type.hashCode();
                if (hashCode != -1036290639) {
                    if (hashCode != -517891900) {
                        if (hashCode == 777898929 && type.equals(Constants.GOAL_TYPE_ACTIVITY_WEEKLY)) {
                            if (b10 != 0) {
                                kotlin.jvm.internal.i.d(b10);
                                if (((GoalDateObj) b10).getVal() == 2) {
                                    kotlin.jvm.internal.i.d(b10);
                                    long j10 = 1000;
                                    if (kotlin.jvm.internal.i.b(u.g2(getWeekOf(((GoalDateObj) b10).getDate().getTime() * j10)), u.g2(getWeekOf(Utils.INSTANCE.getTodayTimeInSeconds() * j10)))) {
                                        z13 = true;
                                        if (z15) {
                                            if (!z13) {
                                            }
                                            z16 = true;
                                        }
                                        z15 = z16;
                                    }
                                }
                            }
                            z13 = false;
                            if (z15) {
                            }
                            z15 = z16;
                        }
                    } else if (type.equals("activity_scheduling")) {
                        if (b10 != 0) {
                            kotlin.jvm.internal.i.d(b10);
                            if (((GoalDateObj) b10).getVal() >= 0) {
                                z12 = true;
                                if (z15) {
                                    if (!z12) {
                                    }
                                    z16 = true;
                                }
                                z15 = z16;
                            }
                        }
                        z12 = false;
                        if (z15) {
                        }
                        z15 = z16;
                    }
                } else if (type.equals(Constants.GOAL_TYPE_ACTIVITY_ONCE)) {
                    if (b10 != 0) {
                        kotlin.jvm.internal.i.d(b10);
                        if (((GoalDateObj) b10).getVal() == 2) {
                            z11 = true;
                            if (z15) {
                                if (!z11) {
                                }
                                z16 = true;
                            }
                            z15 = z16;
                        }
                    }
                    z11 = false;
                    if (z15) {
                    }
                    z15 = z16;
                }
            }
            if (b10 != 0) {
                kotlin.jvm.internal.i.d(b10);
                if (((GoalDateObj) b10).getDate().getTime() == Utils.INSTANCE.getTodayTimeInSeconds()) {
                    kotlin.jvm.internal.i.d(b10);
                    if (((GoalDateObj) b10).getVal() == 2) {
                        z10 = true;
                        if (z15) {
                            if (!z10) {
                            }
                            z16 = true;
                        }
                        z15 = z16;
                    }
                }
            }
            z10 = false;
            if (z15) {
            }
            z15 = z16;
        }
        return new hs.f<>(Boolean.valueOf(z15), Boolean.valueOf(z14));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
        r2 = r1.getVal();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isWeeklyActivityIncompleteAndScheduled(Goal goal) {
        if (goal != null) {
            try {
                if (!goal.getNotificationScheduled()) {
                    return false;
                }
                int i6 = -1;
                if (goal.getTrackList() != null && goal.getTrackList().size() > 0) {
                    Iterator<GoalDateObj> it = goal.getTrackList().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        GoalDateObj next = it.next();
                        if (kotlin.jvm.internal.i.b(getWeekOf(next.getDate().getTime() * 1000).get(0), getWeekOf(Utils.INSTANCE.getTodayCalendar().getTime().getTime()).get(0))) {
                            break;
                        }
                    }
                }
                if (i6 == 2) {
                    return false;
                }
                return true;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.TAG, e10);
            }
        }
        return false;
    }
}
