package com.theinnerhour.b2b.model;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;
import com.theinnerhour.b2b.components.dashboard.experiment.model.SuggestedActivityModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import tf.b;
/* compiled from: Course.kt */
@IgnoreExtraProperties
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0017\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\bZ\u0010[B/\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\n\u0012\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00110\u001b\u0012\u0006\u0010\"\u001a\u00020\n\u0012\u0006\u00101\u001a\u00020\u0011¢\u0006\u0004\bZ\u0010]J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R(\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\"\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\f\u001a\u0004\b#\u0010\u000e\"\u0004\b$\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010%R\"\u0010'\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010-\u001a\u0004\b\b\u0010.\"\u0004\b/\u00100R\"\u00101\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u0013\u001a\u0004\b2\u0010\u0015\"\u0004\b3\u0010\u0017R(\u00105\u001a\b\u0012\u0004\u0012\u0002040\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010\u001d\u001a\u0004\b6\u0010\u001f\"\u0004\b7\u0010!R(\u00109\u001a\b\u0012\u0004\u0012\u0002080\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010\u001d\u001a\u0004\b:\u0010\u001f\"\u0004\b;\u0010!R(\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010\u001d\u001a\u0004\b>\u0010\u001f\"\u0004\b?\u0010!R\"\u0010@\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010\u0013\u001a\u0004\bA\u0010\u0015\"\u0004\bB\u0010\u0017R\"\u0010C\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010\u0013\u001a\u0004\bD\u0010\u0015\"\u0004\bE\u0010\u0017R\"\u0010G\u001a\u00020F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010H\u001a\u0004\bN\u0010J\"\u0004\bO\u0010LR(\u0010P\u001a\b\u0012\u0004\u0012\u00020\n0\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010\u001d\u001a\u0004\bQ\u0010\u001f\"\u0004\bR\u0010!R(\u0010T\u001a\b\u0012\u0004\u0012\u00020S0\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010\u001d\u001a\u0004\bU\u0010\u001f\"\u0004\bV\u0010!R$\u0010W\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010\f\u001a\u0004\bX\u0010\u000e\"\u0004\bY\u0010\u0010¨\u0006^"}, d2 = {"Lcom/theinnerhour/b2b/model/Course;", "", "Ljava/util/Date;", "getmStartDate", "mStartDate", "Lhs/k;", "setmStartDate", "", "isCourseStarted", "setIsCourseStarted", "", "_id", "Ljava/lang/String;", "get_id", "()Ljava/lang/String;", "set_id", "(Ljava/lang/String;)V", "", "coursePosition", "I", "getCoursePosition", "()I", "setCoursePosition", "(I)V", "courseName", "getCourseName", "setCourseName", "Ljava/util/ArrayList;", "goalTypesForCourse", "Ljava/util/ArrayList;", "getGoalTypesForCourse", "()Ljava/util/ArrayList;", "setGoalTypesForCourse", "(Ljava/util/ArrayList;)V", "displayName", "getDisplayName", "setDisplayName", "Ljava/util/Date;", "Lcom/theinnerhour/b2b/model/CustomDate;", "startDate", "Lcom/theinnerhour/b2b/model/CustomDate;", "getStartDate", "()Lcom/theinnerhour/b2b/model/CustomDate;", "setStartDate", "(Lcom/theinnerhour/b2b/model/CustomDate;)V", "Z", "()Z", "setCourseStarted", "(Z)V", "type", "getType", "setType", "Lcom/theinnerhour/b2b/model/CourseDayModel;", "plan", "getPlan", "setPlan", "Lcom/theinnerhour/b2b/model/CourseDayModelV1;", "planV3", "getPlanV3", "setPlanV3", "Lcom/theinnerhour/b2b/components/dashboard/experiment/model/SuggestedActivityModel;", "planSuggested", "getPlanSuggested", "setPlanSuggested", "initialAssessmentScore", "getInitialAssessmentScore", "setInitialAssessmentScore", "finalAssessmentScore", "getFinalAssessmentScore", "setFinalAssessmentScore", "", "courseOpenDate", "J", "getCourseOpenDate", "()J", "setCourseOpenDate", "(J)V", "courseOpenDay", "getCourseOpenDay", "setCourseOpenDay", Constants.GOAL_TYPE_CAUSES, "getCauses", "setCauses", "Lcom/theinnerhour/b2b/model/AssessmentResponseAll;", "assessments", "getAssessments", "setAssessments", "set", "getSet", "setSet", "<init>", "()V", "list", "(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;I)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public class Course {
    private String _id;
    private ArrayList<AssessmentResponseAll> assessments;
    private ArrayList<String> causes;
    @b(SessionManager.KEY_NAME)
    private String courseName;
    private long courseOpenDate;
    private long courseOpenDay;
    private int coursePosition;
    private String displayName;
    private int finalAssessmentScore;
    private ArrayList<Integer> goalTypesForCourse;
    private int initialAssessmentScore;
    @Exclude
    private boolean isCourseStarted;
    @Exclude
    private Date mStartDate;
    private ArrayList<CourseDayModel> plan;
    private ArrayList<SuggestedActivityModel> planSuggested;
    private ArrayList<CourseDayModelV1> planV3;
    private String set;
    private CustomDate startDate;
    private int type;

    public Course() {
        this.goalTypesForCourse = new ArrayList<>();
        this.startDate = new CustomDate();
        this.plan = new ArrayList<>();
        this.planV3 = new ArrayList<>();
        this.planSuggested = new ArrayList<>();
        this.initialAssessmentScore = -1;
        this.finalAssessmentScore = -1;
        this.causes = new ArrayList<>();
        this.assessments = new ArrayList<>();
    }

    public final ArrayList<AssessmentResponseAll> getAssessments() {
        return this.assessments;
    }

    public final ArrayList<String> getCauses() {
        return this.causes;
    }

    public final String getCourseName() {
        return this.courseName;
    }

    public final long getCourseOpenDate() {
        return this.courseOpenDate;
    }

    public final long getCourseOpenDay() {
        return this.courseOpenDay;
    }

    public final int getCoursePosition() {
        return this.coursePosition;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final int getFinalAssessmentScore() {
        return this.finalAssessmentScore;
    }

    public final ArrayList<Integer> getGoalTypesForCourse() {
        return this.goalTypesForCourse;
    }

    public final int getInitialAssessmentScore() {
        return this.initialAssessmentScore;
    }

    public final ArrayList<CourseDayModel> getPlan() {
        return this.plan;
    }

    public final ArrayList<SuggestedActivityModel> getPlanSuggested() {
        return this.planSuggested;
    }

    public final ArrayList<CourseDayModelV1> getPlanV3() {
        return this.planV3;
    }

    public final String getSet() {
        return this.set;
    }

    public final CustomDate getStartDate() {
        return this.startDate;
    }

    public final int getType() {
        return this.type;
    }

    public final String get_id() {
        return this._id;
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

    public final boolean isCourseStarted() {
        return this.isCourseStarted;
    }

    public final void setAssessments(ArrayList<AssessmentResponseAll> arrayList) {
        i.g(arrayList, "<set-?>");
        this.assessments = arrayList;
    }

    public final void setCauses(ArrayList<String> arrayList) {
        i.g(arrayList, "<set-?>");
        this.causes = arrayList;
    }

    public final void setCourseName(String str) {
        this.courseName = str;
    }

    public final void setCourseOpenDate(long j10) {
        this.courseOpenDate = j10;
    }

    public final void setCourseOpenDay(long j10) {
        this.courseOpenDay = j10;
    }

    public final void setCoursePosition(int i6) {
        this.coursePosition = i6;
    }

    public final void setCourseStarted(boolean z10) {
        this.isCourseStarted = z10;
    }

    public final void setDisplayName(String str) {
        this.displayName = str;
    }

    public final void setFinalAssessmentScore(int i6) {
        this.finalAssessmentScore = i6;
    }

    public final void setGoalTypesForCourse(ArrayList<Integer> arrayList) {
        i.g(arrayList, "<set-?>");
        this.goalTypesForCourse = arrayList;
    }

    public final void setInitialAssessmentScore(int i6) {
        this.initialAssessmentScore = i6;
    }

    @Exclude
    public final void setIsCourseStarted(boolean z10) {
        this.isCourseStarted = z10;
    }

    public final void setPlan(ArrayList<CourseDayModel> arrayList) {
        i.g(arrayList, "<set-?>");
        this.plan = arrayList;
    }

    public final void setPlanSuggested(ArrayList<SuggestedActivityModel> arrayList) {
        i.g(arrayList, "<set-?>");
        this.planSuggested = arrayList;
    }

    public final void setPlanV3(ArrayList<CourseDayModelV1> arrayList) {
        i.g(arrayList, "<set-?>");
        this.planV3 = arrayList;
    }

    public final void setSet(String str) {
        this.set = str;
    }

    public final void setStartDate(CustomDate customDate) {
        i.g(customDate, "<set-?>");
        this.startDate = customDate;
    }

    public final void setType(int i6) {
        this.type = i6;
    }

    public final void set_id(String str) {
        this._id = str;
    }

    @Exclude
    public final void setmStartDate(Date mStartDate) {
        i.g(mStartDate, "mStartDate");
        this.mStartDate = mStartDate;
        this.startDate.setTime(mStartDate.getTime());
    }

    public Course(String courseName, ArrayList<Integer> list, String displayName, int i6) {
        i.g(courseName, "courseName");
        i.g(list, "list");
        i.g(displayName, "displayName");
        this.goalTypesForCourse = new ArrayList<>();
        this.startDate = new CustomDate();
        this.plan = new ArrayList<>();
        this.planV3 = new ArrayList<>();
        this.planSuggested = new ArrayList<>();
        this.initialAssessmentScore = -1;
        this.finalAssessmentScore = -1;
        this.causes = new ArrayList<>();
        this.assessments = new ArrayList<>();
        this.courseName = courseName;
        this.goalTypesForCourse = list;
        this.displayName = displayName;
        this.type = i6;
        Date time = Calendar.getInstance().getTime();
        i.f(time, "getInstance().time");
        setmStartDate(time);
    }
}
