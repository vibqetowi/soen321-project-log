package com.theinnerhour.b2b.components.pro.goal.model;

import com.appsflyer.R;
import java.io.Serializable;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: SimpleGoalModel.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/theinnerhour/b2b/components/pro/goal/model/SimpleGoalModel;", "Ljava/io/Serializable;", "goalId", "", "courseId", "startDate", "Ljava/util/Date;", "endDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V", "getCourseId", "()Ljava/lang/String;", "getEndDate", "()Ljava/util/Date;", "getGoalId", "getStartDate", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class SimpleGoalModel implements Serializable {
    private final String courseId;
    private final Date endDate;
    private final String goalId;
    private final Date startDate;

    public SimpleGoalModel(String goalId, String courseId, Date startDate, Date endDate) {
        i.g(goalId, "goalId");
        i.g(courseId, "courseId");
        i.g(startDate, "startDate");
        i.g(endDate, "endDate");
        this.goalId = goalId;
        this.courseId = courseId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public final String getCourseId() {
        return this.courseId;
    }

    public final Date getEndDate() {
        return this.endDate;
    }

    public final String getGoalId() {
        return this.goalId;
    }

    public final Date getStartDate() {
        return this.startDate;
    }
}
