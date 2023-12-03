package com.theinnerhour.b2b.components.pro.goal.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.GoalHelper;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: DaySpecificDailyGoal.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/theinnerhour/b2b/components/pro/goal/model/DaySpecificDailyGoal;", "", Constants.GOAL, "Lcom/theinnerhour/b2b/model/Goal;", "date", "Ljava/util/Date;", "goalHelper", "Lcom/theinnerhour/b2b/utils/GoalHelper;", "(Lcom/theinnerhour/b2b/model/Goal;Ljava/util/Date;Lcom/theinnerhour/b2b/utils/GoalHelper;)V", "getGoal", "()Lcom/theinnerhour/b2b/model/Goal;", "trackedForDay", "", "getTrackedForDay", "()Z", "setTrackedForDay", "(Z)V", "weekTrackStatus", "", "", "getWeekTrackStatus", "()[Ljava/lang/Integer;", "[Ljava/lang/Integer;", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class DaySpecificDailyGoal {
    private final Goal goal;
    private boolean trackedForDay;
    private final Integer[] weekTrackStatus;

    public DaySpecificDailyGoal(Goal goal, Date date, GoalHelper goalHelper) {
        int i6;
        Integer num;
        boolean z10;
        i.g(goal, "goal");
        i.g(date, "date");
        i.g(goalHelper, "goalHelper");
        this.goal = goal;
        this.weekTrackStatus = new Integer[]{-1, -1, -1, -1, -1, -1, -1};
        HashMap<Date, Integer> trackMap = goal.getTrackMap();
        ArrayList<Calendar> weekOf = goalHelper.getWeekOf(date.getTime());
        int size = weekOf.size();
        for (int i10 = 0; i10 < size; i10++) {
            Integer[] numArr = this.weekTrackStatus;
            if (weekOf.get(i10).getTimeInMillis() > date.getTime()) {
                i6 = -1;
            } else if (trackMap.containsKey(weekOf.get(i10).getTime()) && (num = trackMap.get(weekOf.get(i10).getTime())) != null && num.intValue() == 2) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            numArr[i10] = Integer.valueOf(i6);
            if (weekOf.get(i10).getTimeInMillis() == date.getTime()) {
                if (this.weekTrackStatus[i10].intValue() == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.trackedForDay = z10;
            }
        }
    }

    public final Goal getGoal() {
        return this.goal;
    }

    public final boolean getTrackedForDay() {
        return this.trackedForDay;
    }

    public final Integer[] getWeekTrackStatus() {
        return this.weekTrackStatus;
    }

    public final void setTrackedForDay(boolean z10) {
        this.trackedForDay = z10;
    }
}
