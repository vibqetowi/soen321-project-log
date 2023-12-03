package com.theinnerhour.b2b.components.goals.model;

import com.appsflyer.R;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import pl.a;
import v.g;
/* compiled from: NotificationGoal.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003JY\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000e¨\u0006)"}, d2 = {"Lcom/theinnerhour/b2b/components/goals/model/NotificationGoal;", "Ljava/io/Serializable;", "goalId", "", "goalName", "goalType", "courseName", "title", "body", "goalScheduleTime", "", "notificationType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getBody", "()Ljava/lang/String;", "getCourseName", "getGoalId", "getGoalName", "getGoalScheduleTime", "()J", "setGoalScheduleTime", "(J)V", "getGoalType", "getNotificationType", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class NotificationGoal implements Serializable {
    private final String body;
    private final String courseName;
    private final String goalId;
    private final String goalName;
    private long goalScheduleTime;
    private final String goalType;
    private final String notificationType;
    private final String title;

    public NotificationGoal(String goalId, String goalName, String goalType, String courseName, String title, String body, long j10, String notificationType) {
        i.g(goalId, "goalId");
        i.g(goalName, "goalName");
        i.g(goalType, "goalType");
        i.g(courseName, "courseName");
        i.g(title, "title");
        i.g(body, "body");
        i.g(notificationType, "notificationType");
        this.goalId = goalId;
        this.goalName = goalName;
        this.goalType = goalType;
        this.courseName = courseName;
        this.title = title;
        this.body = body;
        this.goalScheduleTime = j10;
        this.notificationType = notificationType;
    }

    public static /* synthetic */ NotificationGoal copy$default(NotificationGoal notificationGoal, String str, String str2, String str3, String str4, String str5, String str6, long j10, String str7, int i6, Object obj) {
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        long j11;
        String str14;
        if ((i6 & 1) != 0) {
            str8 = notificationGoal.goalId;
        } else {
            str8 = str;
        }
        if ((i6 & 2) != 0) {
            str9 = notificationGoal.goalName;
        } else {
            str9 = str2;
        }
        if ((i6 & 4) != 0) {
            str10 = notificationGoal.goalType;
        } else {
            str10 = str3;
        }
        if ((i6 & 8) != 0) {
            str11 = notificationGoal.courseName;
        } else {
            str11 = str4;
        }
        if ((i6 & 16) != 0) {
            str12 = notificationGoal.title;
        } else {
            str12 = str5;
        }
        if ((i6 & 32) != 0) {
            str13 = notificationGoal.body;
        } else {
            str13 = str6;
        }
        if ((i6 & 64) != 0) {
            j11 = notificationGoal.goalScheduleTime;
        } else {
            j11 = j10;
        }
        if ((i6 & 128) != 0) {
            str14 = notificationGoal.notificationType;
        } else {
            str14 = str7;
        }
        return notificationGoal.copy(str8, str9, str10, str11, str12, str13, j11, str14);
    }

    public final String component1() {
        return this.goalId;
    }

    public final String component2() {
        return this.goalName;
    }

    public final String component3() {
        return this.goalType;
    }

    public final String component4() {
        return this.courseName;
    }

    public final String component5() {
        return this.title;
    }

    public final String component6() {
        return this.body;
    }

    public final long component7() {
        return this.goalScheduleTime;
    }

    public final String component8() {
        return this.notificationType;
    }

    public final NotificationGoal copy(String goalId, String goalName, String goalType, String courseName, String title, String body, long j10, String notificationType) {
        i.g(goalId, "goalId");
        i.g(goalName, "goalName");
        i.g(goalType, "goalType");
        i.g(courseName, "courseName");
        i.g(title, "title");
        i.g(body, "body");
        i.g(notificationType, "notificationType");
        return new NotificationGoal(goalId, goalName, goalType, courseName, title, body, j10, notificationType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationGoal)) {
            return false;
        }
        NotificationGoal notificationGoal = (NotificationGoal) obj;
        if (i.b(this.goalId, notificationGoal.goalId) && i.b(this.goalName, notificationGoal.goalName) && i.b(this.goalType, notificationGoal.goalType) && i.b(this.courseName, notificationGoal.courseName) && i.b(this.title, notificationGoal.title) && i.b(this.body, notificationGoal.body) && this.goalScheduleTime == notificationGoal.goalScheduleTime && i.b(this.notificationType, notificationGoal.notificationType)) {
            return true;
        }
        return false;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getCourseName() {
        return this.courseName;
    }

    public final String getGoalId() {
        return this.goalId;
    }

    public final String getGoalName() {
        return this.goalName;
    }

    public final long getGoalScheduleTime() {
        return this.goalScheduleTime;
    }

    public final String getGoalType() {
        return this.goalType;
    }

    public final String getNotificationType() {
        return this.notificationType;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int c10 = a.c(this.body, a.c(this.title, a.c(this.courseName, a.c(this.goalType, a.c(this.goalName, this.goalId.hashCode() * 31, 31), 31), 31), 31), 31);
        long j10 = this.goalScheduleTime;
        return this.notificationType.hashCode() + ((c10 + ((int) (j10 ^ (j10 >>> 32)))) * 31);
    }

    public final void setGoalScheduleTime(long j10) {
        this.goalScheduleTime = j10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NotificationGoal(goalId=");
        sb2.append(this.goalId);
        sb2.append(", goalName=");
        sb2.append(this.goalName);
        sb2.append(", goalType=");
        sb2.append(this.goalType);
        sb2.append(", courseName=");
        sb2.append(this.courseName);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", body=");
        sb2.append(this.body);
        sb2.append(", goalScheduleTime=");
        sb2.append(this.goalScheduleTime);
        sb2.append(", notificationType=");
        return g.c(sb2, this.notificationType, ')');
    }
}
