package com.theinnerhour.b2b.model;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Utils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: Goal.kt */
@IgnoreExtraProperties
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b]\u0010^B\u001b\b\u0016\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010_\u001a\u00020\u0010¢\u0006\u0004\b]\u0010`J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0007J\b\u0010\n\u001a\u00020\u0002H\u0007J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0007J\b\u0010\r\u001a\u00020\u0002H\u0007J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0002H\u0007R$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R$\u0010\u001a\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R$\u0010\u001d\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R$\u0010 \u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0012\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010#R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010#R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010#R\"\u0010%\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R\"\u0010.\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010&\u001a\u0004\b/\u0010(\"\u0004\b0\u0010*R\"\u00101\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010&\u001a\u0004\b2\u0010(\"\u0004\b3\u0010*R(\u00106\u001a\b\u0012\u0004\u0012\u000205048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R(\u0010=\u001a\b\u0012\u0004\u0012\u00020<048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u00107\u001a\u0004\b>\u00109\"\u0004\b?\u0010;R\"\u0010A\u001a\u00020@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010G\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010\u0012\u001a\u0004\bH\u0010\u0014\"\u0004\bI\u0010\u0016R\"\u0010J\u001a\u00020@8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bJ\u0010B\u001a\u0004\bJ\u0010D\"\u0004\bK\u0010FR$\u0010L\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010\u0012\u001a\u0004\bM\u0010\u0014\"\u0004\bN\u0010\u0016R.\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010O8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u001d\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020V0O8G¢\u0006\u0006\u001a\u0004\bW\u0010SR\u001d\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020V0O8G¢\u0006\u0006\u001a\u0004\bY\u0010SR\u001d\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002050O8G¢\u0006\u0006\u001a\u0004\b[\u0010S¨\u0006a"}, d2 = {"Lcom/theinnerhour/b2b/model/Goal;", "", "Ljava/util/Date;", "getmLastAdded", "mLastAdded", "Lhs/k;", "setmLastAdded", "getmScheduleDate", "mScheduleDate", "setmScheduleDate", "getmStartDate", "mStartDate", "setmStartDate", "getmEndDate", "mEndDate", "setmEndDate", "", "courseId", "Ljava/lang/String;", "getCourseId", "()Ljava/lang/String;", "setCourseId", "(Ljava/lang/String;)V", "goalId", "getGoalId", "setGoalId", "courseName", "getCourseName", "setCourseName", "goalName", "getGoalName", "setGoalName", "source", "getSource", "setSource", "Ljava/util/Date;", "Lcom/theinnerhour/b2b/model/CustomDate;", "startDate", "Lcom/theinnerhour/b2b/model/CustomDate;", "getStartDate", "()Lcom/theinnerhour/b2b/model/CustomDate;", "setStartDate", "(Lcom/theinnerhour/b2b/model/CustomDate;)V", "endDate", "getEndDate", "setEndDate", "lastAdded", "getLastAdded", "setLastAdded", "scheduledDate", "getScheduledDate", "setScheduledDate", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/model/GoalDateObj;", "trackList", "Ljava/util/ArrayList;", "getTrackList", "()Ljava/util/ArrayList;", "setTrackList", "(Ljava/util/ArrayList;)V", "Lcom/theinnerhour/b2b/model/GamificationModel;", "goalgamificationList", "getGoalgamificationList", "setGoalgamificationList", "", "notificationScheduled", "Z", "getNotificationScheduled", "()Z", "setNotificationScheduled", "(Z)V", "dynamicVariant", "getDynamicVariant", "setDynamicVariant", "isVisible", "setVisible", "type", "getType", "setType", "Ljava/util/HashMap;", "data", "Ljava/util/HashMap;", "getData", "()Ljava/util/HashMap;", "setData", "(Ljava/util/HashMap;)V", "", "getTrackMap", "trackMap", "getLast7DayMap", "last7DayMap", "getGoalDateObjMap", "goalDateObjMap", "<init>", "()V", "GoalId", "(Ljava/lang/String;Ljava/lang/String;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class Goal {
    private String courseId;
    private String courseName;
    private HashMap<String, Object> data;
    private String dynamicVariant;
    private CustomDate endDate;
    private String goalId;
    private String goalName;
    private ArrayList<GamificationModel> goalgamificationList;
    @Exclude
    private boolean isVisible;
    private CustomDate lastAdded;
    @Exclude
    private Date mEndDate;
    @Exclude
    private Date mLastAdded;
    @Exclude
    private Date mScheduleDate;
    @Exclude
    private Date mStartDate;
    private boolean notificationScheduled;
    private CustomDate scheduledDate;
    private String source;
    private CustomDate startDate;
    private ArrayList<GoalDateObj> trackList;
    private String type;

    public Goal() {
        this.startDate = new CustomDate();
        this.endDate = new CustomDate();
        this.lastAdded = new CustomDate();
        this.scheduledDate = new CustomDate();
        this.trackList = new ArrayList<>();
        this.goalgamificationList = new ArrayList<>();
        this.data = new HashMap<>();
    }

    public final String getCourseId() {
        return this.courseId;
    }

    public final String getCourseName() {
        return this.courseName;
    }

    public final HashMap<String, Object> getData() {
        return this.data;
    }

    public final String getDynamicVariant() {
        return this.dynamicVariant;
    }

    public final CustomDate getEndDate() {
        return this.endDate;
    }

    @Exclude
    public final HashMap<Date, GoalDateObj> getGoalDateObjMap() {
        HashMap<Date, GoalDateObj> hashMap = new HashMap<>();
        Iterator<GoalDateObj> it = this.trackList.iterator();
        while (it.hasNext()) {
            GoalDateObj next = it.next();
            hashMap.put(next.getmDate(), next);
        }
        return hashMap;
    }

    public final String getGoalId() {
        return this.goalId;
    }

    public final String getGoalName() {
        return this.goalName;
    }

    public final ArrayList<GamificationModel> getGoalgamificationList() {
        return this.goalgamificationList;
    }

    @Exclude
    public final HashMap<Date, Integer> getLast7DayMap() {
        HashMap<Date, Integer> hashMap = new HashMap<>();
        Calendar todayCalendar = Utils.INSTANCE.getTodayCalendar();
        HashMap<Date, Integer> trackMap = getTrackMap();
        for (int i6 = 0; i6 < 7; i6++) {
            if (trackMap.containsKey(todayCalendar.getTime())) {
                Date time = todayCalendar.getTime();
                i.f(time, "cal.time");
                Integer num = trackMap.get(todayCalendar.getTime());
                i.d(num);
                hashMap.put(time, num);
            }
            todayCalendar.add(5, -1);
        }
        return hashMap;
    }

    public final CustomDate getLastAdded() {
        return this.lastAdded;
    }

    public final boolean getNotificationScheduled() {
        return this.notificationScheduled;
    }

    public final CustomDate getScheduledDate() {
        return this.scheduledDate;
    }

    public final String getSource() {
        return this.source;
    }

    public final CustomDate getStartDate() {
        return this.startDate;
    }

    public final ArrayList<GoalDateObj> getTrackList() {
        return this.trackList;
    }

    @Exclude
    public final HashMap<Date, Integer> getTrackMap() {
        HashMap<Date, Integer> hashMap = new HashMap<>();
        Iterator<GoalDateObj> it = this.trackList.iterator();
        while (it.hasNext()) {
            GoalDateObj next = it.next();
            hashMap.put(next.getmDate(), Integer.valueOf(next.getVal()));
        }
        return hashMap;
    }

    public final String getType() {
        return this.type;
    }

    @Exclude
    public final Date getmEndDate() {
        if (this.mEndDate == null) {
            this.mEndDate = new Date(this.endDate.getTime() * 1000);
        }
        Date date = this.mEndDate;
        i.d(date);
        return date;
    }

    @Exclude
    public final Date getmLastAdded() {
        if (this.mLastAdded == null) {
            this.mLastAdded = new Date(this.lastAdded.getTime() * 1000);
        }
        Date date = this.mLastAdded;
        i.d(date);
        return date;
    }

    @Exclude
    public final Date getmScheduleDate() {
        if (this.mScheduleDate == null) {
            this.mScheduleDate = new Date(this.scheduledDate.getTime() * 1000);
        }
        Date date = this.mScheduleDate;
        i.d(date);
        return date;
    }

    @Exclude
    public final Date getmStartDate() {
        if (this.mStartDate == null) {
            this.mStartDate = new Date(this.startDate.getTime() * 1000);
        }
        Date date = this.mStartDate;
        i.d(date);
        return date;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final void setCourseId(String str) {
        this.courseId = str;
    }

    public final void setCourseName(String str) {
        this.courseName = str;
    }

    public final void setData(HashMap<String, Object> hashMap) {
        i.g(hashMap, "<set-?>");
        this.data = hashMap;
    }

    public final void setDynamicVariant(String str) {
        this.dynamicVariant = str;
    }

    public final void setEndDate(CustomDate customDate) {
        i.g(customDate, "<set-?>");
        this.endDate = customDate;
    }

    public final void setGoalId(String str) {
        this.goalId = str;
    }

    public final void setGoalName(String str) {
        this.goalName = str;
    }

    public final void setGoalgamificationList(ArrayList<GamificationModel> arrayList) {
        i.g(arrayList, "<set-?>");
        this.goalgamificationList = arrayList;
    }

    public final void setLastAdded(CustomDate customDate) {
        i.g(customDate, "<set-?>");
        this.lastAdded = customDate;
    }

    public final void setNotificationScheduled(boolean z10) {
        this.notificationScheduled = z10;
    }

    public final void setScheduledDate(CustomDate customDate) {
        i.g(customDate, "<set-?>");
        this.scheduledDate = customDate;
    }

    public final void setSource(String str) {
        this.source = str;
    }

    public final void setStartDate(CustomDate customDate) {
        i.g(customDate, "<set-?>");
        this.startDate = customDate;
    }

    public final void setTrackList(ArrayList<GoalDateObj> arrayList) {
        i.g(arrayList, "<set-?>");
        this.trackList = arrayList;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setVisible(boolean z10) {
        this.isVisible = z10;
    }

    @Exclude
    public final void setmEndDate(Date mEndDate) {
        i.g(mEndDate, "mEndDate");
        this.mEndDate = mEndDate;
        this.endDate.setTime(mEndDate.getTime());
    }

    @Exclude
    public final void setmLastAdded(Date mLastAdded) {
        i.g(mLastAdded, "mLastAdded");
        this.mLastAdded = mLastAdded;
        this.lastAdded.setTime(mLastAdded.getTime());
    }

    @Exclude
    public final void setmScheduleDate(Date mScheduleDate) {
        i.g(mScheduleDate, "mScheduleDate");
        this.mScheduleDate = mScheduleDate;
        this.scheduledDate.setTime(mScheduleDate.getTime());
    }

    @Exclude
    public final void setmStartDate(Date mStartDate) {
        i.g(mStartDate, "mStartDate");
        this.mStartDate = mStartDate;
        this.startDate.setTime(mStartDate.getTime());
    }

    public Goal(String str, String GoalId) {
        i.g(GoalId, "GoalId");
        this.startDate = new CustomDate();
        this.endDate = new CustomDate();
        this.lastAdded = new CustomDate();
        this.scheduledDate = new CustomDate();
        this.trackList = new ArrayList<>();
        this.goalgamificationList = new ArrayList<>();
        this.data = new HashMap<>();
        this.courseId = str;
        this.goalId = GoalId;
        Calendar todayCalendar = Utils.INSTANCE.getTodayCalendar();
        Date time = todayCalendar.getTime();
        i.f(time, "cal.time");
        setmStartDate(time);
        Date time2 = todayCalendar.getTime();
        i.f(time2, "cal.time");
        setmEndDate(time2);
        this.courseName = Constants.getCourseName(str);
        this.goalName = Constants.getGoalName(GoalId);
        this.isVisible = true;
        Date time3 = Calendar.getInstance().getTime();
        i.f(time3, "getInstance().time");
        setmLastAdded(time3);
    }
}
