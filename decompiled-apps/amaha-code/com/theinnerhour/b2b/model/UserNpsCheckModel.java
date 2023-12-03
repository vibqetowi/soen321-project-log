package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: UserNpsCheckModel.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b!\u0018\u00002\u00020\u0001B©\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0005j\b\u0012\u0004\u0012\u00020\f`\u0007\u0012\u0018\b\u0002\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0005j\b\u0012\u0004\u0012\u00020\f`\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0005j\b\u0012\u0004\u0012\u00020\f`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0005j\b\u0012\u0004\u0012\u00020\f`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R*\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010-\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\"\"\u0004\b/\u0010$R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010-\u001a\u0004\b0\u0010*\"\u0004\b1\u0010,¨\u00062"}, d2 = {"Lcom/theinnerhour/b2b/model/UserNpsCheckModel;", "", "lastNpsDisplay", "", "therapyNps", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/model/NpsSessionTrack;", "Lkotlin/collections/ArrayList;", "psychiatryNps", "dashboardNps", "Lcom/theinnerhour/b2b/model/DashboardNpsDayTrack;", "mainPlanNps", "Lcom/theinnerhour/b2b/model/NpsCourseTrack;", "miniCourseNps", "goalsNps", "Lcom/theinnerhour/b2b/model/NpsGoalTrack;", "therapyNpsFirstSessionId", "", "psychiatryNpsFirstSessionId", "(Ljava/lang/Long;Ljava/util/ArrayList;Ljava/util/ArrayList;Lcom/theinnerhour/b2b/model/DashboardNpsDayTrack;Ljava/util/ArrayList;Ljava/util/ArrayList;Lcom/theinnerhour/b2b/model/NpsGoalTrack;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getDashboardNps", "()Lcom/theinnerhour/b2b/model/DashboardNpsDayTrack;", "setDashboardNps", "(Lcom/theinnerhour/b2b/model/DashboardNpsDayTrack;)V", "getGoalsNps", "()Lcom/theinnerhour/b2b/model/NpsGoalTrack;", "setGoalsNps", "(Lcom/theinnerhour/b2b/model/NpsGoalTrack;)V", "getLastNpsDisplay", "()Ljava/lang/Long;", "setLastNpsDisplay", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getMainPlanNps", "()Ljava/util/ArrayList;", "setMainPlanNps", "(Ljava/util/ArrayList;)V", "getMiniCourseNps", "setMiniCourseNps", "getPsychiatryNps", "setPsychiatryNps", "getPsychiatryNpsFirstSessionId", "()Ljava/lang/Integer;", "setPsychiatryNpsFirstSessionId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTherapyNps", "setTherapyNps", "getTherapyNpsFirstSessionId", "setTherapyNpsFirstSessionId", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class UserNpsCheckModel {
    private DashboardNpsDayTrack dashboardNps;
    private NpsGoalTrack goalsNps;
    private Long lastNpsDisplay;
    private ArrayList<NpsCourseTrack> mainPlanNps;
    private ArrayList<NpsCourseTrack> miniCourseNps;
    private ArrayList<NpsSessionTrack> psychiatryNps;
    private Integer psychiatryNpsFirstSessionId;
    private ArrayList<NpsSessionTrack> therapyNps;
    private Integer therapyNpsFirstSessionId;

    public UserNpsCheckModel() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public final DashboardNpsDayTrack getDashboardNps() {
        return this.dashboardNps;
    }

    public final NpsGoalTrack getGoalsNps() {
        return this.goalsNps;
    }

    public final Long getLastNpsDisplay() {
        return this.lastNpsDisplay;
    }

    public final ArrayList<NpsCourseTrack> getMainPlanNps() {
        return this.mainPlanNps;
    }

    public final ArrayList<NpsCourseTrack> getMiniCourseNps() {
        return this.miniCourseNps;
    }

    public final ArrayList<NpsSessionTrack> getPsychiatryNps() {
        return this.psychiatryNps;
    }

    public final Integer getPsychiatryNpsFirstSessionId() {
        return this.psychiatryNpsFirstSessionId;
    }

    public final ArrayList<NpsSessionTrack> getTherapyNps() {
        return this.therapyNps;
    }

    public final Integer getTherapyNpsFirstSessionId() {
        return this.therapyNpsFirstSessionId;
    }

    public final void setDashboardNps(DashboardNpsDayTrack dashboardNpsDayTrack) {
        this.dashboardNps = dashboardNpsDayTrack;
    }

    public final void setGoalsNps(NpsGoalTrack npsGoalTrack) {
        this.goalsNps = npsGoalTrack;
    }

    public final void setLastNpsDisplay(Long l2) {
        this.lastNpsDisplay = l2;
    }

    public final void setMainPlanNps(ArrayList<NpsCourseTrack> arrayList) {
        i.g(arrayList, "<set-?>");
        this.mainPlanNps = arrayList;
    }

    public final void setMiniCourseNps(ArrayList<NpsCourseTrack> arrayList) {
        i.g(arrayList, "<set-?>");
        this.miniCourseNps = arrayList;
    }

    public final void setPsychiatryNps(ArrayList<NpsSessionTrack> arrayList) {
        i.g(arrayList, "<set-?>");
        this.psychiatryNps = arrayList;
    }

    public final void setPsychiatryNpsFirstSessionId(Integer num) {
        this.psychiatryNpsFirstSessionId = num;
    }

    public final void setTherapyNps(ArrayList<NpsSessionTrack> arrayList) {
        i.g(arrayList, "<set-?>");
        this.therapyNps = arrayList;
    }

    public final void setTherapyNpsFirstSessionId(Integer num) {
        this.therapyNpsFirstSessionId = num;
    }

    public UserNpsCheckModel(Long l2, ArrayList<NpsSessionTrack> therapyNps, ArrayList<NpsSessionTrack> psychiatryNps, DashboardNpsDayTrack dashboardNpsDayTrack, ArrayList<NpsCourseTrack> mainPlanNps, ArrayList<NpsCourseTrack> miniCourseNps, NpsGoalTrack npsGoalTrack, Integer num, Integer num2) {
        i.g(therapyNps, "therapyNps");
        i.g(psychiatryNps, "psychiatryNps");
        i.g(mainPlanNps, "mainPlanNps");
        i.g(miniCourseNps, "miniCourseNps");
        this.lastNpsDisplay = l2;
        this.therapyNps = therapyNps;
        this.psychiatryNps = psychiatryNps;
        this.dashboardNps = dashboardNpsDayTrack;
        this.mainPlanNps = mainPlanNps;
        this.miniCourseNps = miniCourseNps;
        this.goalsNps = npsGoalTrack;
        this.therapyNpsFirstSessionId = num;
        this.psychiatryNpsFirstSessionId = num2;
    }

    public /* synthetic */ UserNpsCheckModel(Long l2, ArrayList arrayList, ArrayList arrayList2, DashboardNpsDayTrack dashboardNpsDayTrack, ArrayList arrayList3, ArrayList arrayList4, NpsGoalTrack npsGoalTrack, Integer num, Integer num2, int i6, d dVar) {
        this((i6 & 1) != 0 ? null : l2, (i6 & 2) != 0 ? new ArrayList() : arrayList, (i6 & 4) != 0 ? new ArrayList() : arrayList2, (i6 & 8) != 0 ? null : dashboardNpsDayTrack, (i6 & 16) != 0 ? new ArrayList() : arrayList3, (i6 & 32) != 0 ? new ArrayList() : arrayList4, (i6 & 64) != 0 ? null : npsGoalTrack, (i6 & 128) != 0 ? null : num, (i6 & 256) == 0 ? num2 : null);
    }
}
