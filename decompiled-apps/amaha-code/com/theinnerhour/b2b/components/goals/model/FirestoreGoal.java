package com.theinnerhour.b2b.components.goals.model;

import com.theinnerhour.b2b.model.CustomDate;
import com.theinnerhour.b2b.utils.Constants;
import fe.i;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlinx.coroutines.flow.p;
import tr.r;
import v.g;
/* compiled from: FirestoreGoal.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B£\u0001\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\r\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\r\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bX\u0010YJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\bHÆ\u0003J\t\u0010\f\u001a\u00020\bHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0011\u001a\u00020\rHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003J¥\u0001\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001f\u001a\u00020\r2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\"\u001a\u00020\u0002HÖ\u0001J\t\u0010$\u001a\u00020#HÖ\u0001J\u0013\u0010&\u001a\u00020\r2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010'\u001a\u0004\b,\u0010)\"\u0004\b-\u0010+R$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010'\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010'\u001a\u0004\b0\u0010)\"\u0004\b1\u0010+R$\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010'\u001a\u0004\b2\u0010)\"\u0004\b3\u0010+R\"\u0010\u0018\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010\u0019\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u00104\u001a\u0004\b9\u00106\"\u0004\b:\u00108R\"\u0010\u001a\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u00104\u001a\u0004\b;\u00106\"\u0004\b<\u00108R\"\u0010\u001b\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u00104\u001a\u0004\b=\u00106\"\u0004\b>\u00108R\"\u0010\u001c\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010'\u001a\u0004\bD\u0010)\"\u0004\bE\u0010+R$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010'\u001a\u0004\bF\u0010)\"\u0004\bG\u0010+R\"\u0010\u001f\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010?\u001a\u0004\b\u001f\u0010A\"\u0004\bH\u0010CR$\u0010 \u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010'\u001a\u0004\bI\u0010)\"\u0004\bJ\u0010+RV\u0010O\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0Lj\b\u0012\u0004\u0012\u00020\r`M0K2\u001c\u0010N\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0Lj\b\u0012\u0004\u0012\u00020\r`M0K8G@GX\u0087\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR6\u0010U\u001a\b\u0012\u0004\u0012\u00020\r0K2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\r0K8G@GX\u0087\u000e¢\u0006\u0012\n\u0004\bU\u0010P\u001a\u0004\bV\u0010R\"\u0004\bW\u0010T¨\u0006Z"}, d2 = {"Lcom/theinnerhour/b2b/components/goals/model/FirestoreGoal;", "", "", "component1", "component2", "component3", "component4", "component5", "Lcom/theinnerhour/b2b/model/CustomDate;", "component6", "component7", "component8", "component9", "", "component10", "component11", "component12", "component13", "component14", "courseId", "goalId", "courseName", "goalName", "source", "startDate", "endDate", "lastAdded", "scheduledDate", "notificationScheduled", "dynamicVariant", "type", "isVisible", "dataTypeKey", "copy", "toString", "", "hashCode", "other", "equals", "Ljava/lang/String;", "getCourseId", "()Ljava/lang/String;", "setCourseId", "(Ljava/lang/String;)V", "getGoalId", "setGoalId", "getCourseName", "setCourseName", "getGoalName", "setGoalName", "getSource", "setSource", "Lcom/theinnerhour/b2b/model/CustomDate;", "getStartDate", "()Lcom/theinnerhour/b2b/model/CustomDate;", "setStartDate", "(Lcom/theinnerhour/b2b/model/CustomDate;)V", "getEndDate", "setEndDate", "getLastAdded", "setLastAdded", "getScheduledDate", "setScheduledDate", "Z", "getNotificationScheduled", "()Z", "setNotificationScheduled", "(Z)V", "getDynamicVariant", "setDynamicVariant", "getType", "setType", "setVisible", "getDataTypeKey", "setDataTypeKey", "Lkotlinx/coroutines/flow/p;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "<set-?>", "trackListFlow", "Lkotlinx/coroutines/flow/p;", "getTrackListFlow", "()Lkotlinx/coroutines/flow/p;", "setTrackListFlow", "(Lkotlinx/coroutines/flow/p;)V", "loading", "getLoading", "setLoading", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/theinnerhour/b2b/model/CustomDate;Lcom/theinnerhour/b2b/model/CustomDate;Lcom/theinnerhour/b2b/model/CustomDate;Lcom/theinnerhour/b2b/model/CustomDate;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class FirestoreGoal {
    private String courseId;
    private String courseName;
    private String dataTypeKey;
    private String dynamicVariant;
    private CustomDate endDate;
    private String goalId;
    private String goalName;
    private boolean isVisible;
    private CustomDate lastAdded;
    @i
    private p<Boolean> loading;
    private boolean notificationScheduled;
    private CustomDate scheduledDate;
    private String source;
    private CustomDate startDate;
    @i
    private p<ArrayList<Boolean>> trackListFlow;
    private String type;

    public FirestoreGoal() {
        this(null, null, null, null, null, null, null, null, null, false, null, null, false, null, 16383, null);
    }

    public final String component1() {
        return this.courseId;
    }

    public final boolean component10() {
        return this.notificationScheduled;
    }

    public final String component11() {
        return this.dynamicVariant;
    }

    public final String component12() {
        return this.type;
    }

    public final boolean component13() {
        return this.isVisible;
    }

    public final String component14() {
        return this.dataTypeKey;
    }

    public final String component2() {
        return this.goalId;
    }

    public final String component3() {
        return this.courseName;
    }

    public final String component4() {
        return this.goalName;
    }

    public final String component5() {
        return this.source;
    }

    public final CustomDate component6() {
        return this.startDate;
    }

    public final CustomDate component7() {
        return this.endDate;
    }

    public final CustomDate component8() {
        return this.lastAdded;
    }

    public final CustomDate component9() {
        return this.scheduledDate;
    }

    public final FirestoreGoal copy(String str, String str2, String str3, String str4, String str5, CustomDate startDate, CustomDate endDate, CustomDate lastAdded, CustomDate scheduledDate, boolean z10, String str6, String str7, boolean z11, String str8) {
        kotlin.jvm.internal.i.g(startDate, "startDate");
        kotlin.jvm.internal.i.g(endDate, "endDate");
        kotlin.jvm.internal.i.g(lastAdded, "lastAdded");
        kotlin.jvm.internal.i.g(scheduledDate, "scheduledDate");
        return new FirestoreGoal(str, str2, str3, str4, str5, startDate, endDate, lastAdded, scheduledDate, z10, str6, str7, z11, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FirestoreGoal)) {
            return false;
        }
        FirestoreGoal firestoreGoal = (FirestoreGoal) obj;
        if (kotlin.jvm.internal.i.b(this.courseId, firestoreGoal.courseId) && kotlin.jvm.internal.i.b(this.goalId, firestoreGoal.goalId) && kotlin.jvm.internal.i.b(this.courseName, firestoreGoal.courseName) && kotlin.jvm.internal.i.b(this.goalName, firestoreGoal.goalName) && kotlin.jvm.internal.i.b(this.source, firestoreGoal.source) && kotlin.jvm.internal.i.b(this.startDate, firestoreGoal.startDate) && kotlin.jvm.internal.i.b(this.endDate, firestoreGoal.endDate) && kotlin.jvm.internal.i.b(this.lastAdded, firestoreGoal.lastAdded) && kotlin.jvm.internal.i.b(this.scheduledDate, firestoreGoal.scheduledDate) && this.notificationScheduled == firestoreGoal.notificationScheduled && kotlin.jvm.internal.i.b(this.dynamicVariant, firestoreGoal.dynamicVariant) && kotlin.jvm.internal.i.b(this.type, firestoreGoal.type) && this.isVisible == firestoreGoal.isVisible && kotlin.jvm.internal.i.b(this.dataTypeKey, firestoreGoal.dataTypeKey)) {
            return true;
        }
        return false;
    }

    public final String getCourseId() {
        return this.courseId;
    }

    public final String getCourseName() {
        return this.courseName;
    }

    public final String getDataTypeKey() {
        return this.dataTypeKey;
    }

    public final String getDynamicVariant() {
        return this.dynamicVariant;
    }

    public final CustomDate getEndDate() {
        return this.endDate;
    }

    public final String getGoalId() {
        return this.goalId;
    }

    public final String getGoalName() {
        return this.goalName;
    }

    public final CustomDate getLastAdded() {
        return this.lastAdded;
    }

    @i
    public final p<Boolean> getLoading() {
        return this.loading;
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

    @i
    public final p<ArrayList<Boolean>> getTrackListFlow() {
        return this.trackListFlow;
    }

    public final String getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        String str = this.courseId;
        int i6 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.goalId;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str3 = this.courseName;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str4 = this.goalName;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        String str5 = this.source;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int hashCode8 = this.startDate.hashCode();
        int hashCode9 = this.endDate.hashCode();
        int hashCode10 = this.lastAdded.hashCode();
        int hashCode11 = (this.scheduledDate.hashCode() + ((hashCode10 + ((hashCode9 + ((hashCode8 + ((i13 + hashCode5) * 31)) * 31)) * 31)) * 31)) * 31;
        boolean z10 = this.notificationScheduled;
        int i14 = 1;
        int i15 = z10;
        if (z10 != 0) {
            i15 = 1;
        }
        int i16 = (hashCode11 + i15) * 31;
        String str6 = this.dynamicVariant;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i17 = (i16 + hashCode6) * 31;
        String str7 = this.type;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i18 = (i17 + hashCode7) * 31;
        boolean z11 = this.isVisible;
        if (!z11) {
            i14 = z11 ? 1 : 0;
        }
        int i19 = (i18 + i14) * 31;
        String str8 = this.dataTypeKey;
        if (str8 != null) {
            i6 = str8.hashCode();
        }
        return i19 + i6;
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

    public final void setDataTypeKey(String str) {
        this.dataTypeKey = str;
    }

    public final void setDynamicVariant(String str) {
        this.dynamicVariant = str;
    }

    public final void setEndDate(CustomDate customDate) {
        kotlin.jvm.internal.i.g(customDate, "<set-?>");
        this.endDate = customDate;
    }

    public final void setGoalId(String str) {
        this.goalId = str;
    }

    public final void setGoalName(String str) {
        this.goalName = str;
    }

    public final void setLastAdded(CustomDate customDate) {
        kotlin.jvm.internal.i.g(customDate, "<set-?>");
        this.lastAdded = customDate;
    }

    @i
    public final void setLoading(p<Boolean> pVar) {
        kotlin.jvm.internal.i.g(pVar, "<set-?>");
        this.loading = pVar;
    }

    public final void setNotificationScheduled(boolean z10) {
        this.notificationScheduled = z10;
    }

    public final void setScheduledDate(CustomDate customDate) {
        kotlin.jvm.internal.i.g(customDate, "<set-?>");
        this.scheduledDate = customDate;
    }

    public final void setSource(String str) {
        this.source = str;
    }

    public final void setStartDate(CustomDate customDate) {
        kotlin.jvm.internal.i.g(customDate, "<set-?>");
        this.startDate = customDate;
    }

    @i
    public final void setTrackListFlow(p<ArrayList<Boolean>> pVar) {
        kotlin.jvm.internal.i.g(pVar, "<set-?>");
        this.trackListFlow = pVar;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setVisible(boolean z10) {
        this.isVisible = z10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FirestoreGoal(courseId=");
        sb2.append(this.courseId);
        sb2.append(", goalId=");
        sb2.append(this.goalId);
        sb2.append(", courseName=");
        sb2.append(this.courseName);
        sb2.append(", goalName=");
        sb2.append(this.goalName);
        sb2.append(", source=");
        sb2.append(this.source);
        sb2.append(", startDate=");
        sb2.append(this.startDate);
        sb2.append(", endDate=");
        sb2.append(this.endDate);
        sb2.append(", lastAdded=");
        sb2.append(this.lastAdded);
        sb2.append(", scheduledDate=");
        sb2.append(this.scheduledDate);
        sb2.append(", notificationScheduled=");
        sb2.append(this.notificationScheduled);
        sb2.append(", dynamicVariant=");
        sb2.append(this.dynamicVariant);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", isVisible=");
        sb2.append(this.isVisible);
        sb2.append(", dataTypeKey=");
        return g.c(sb2, this.dataTypeKey, ')');
    }

    public FirestoreGoal(String str, String str2, String str3, String str4, String str5, CustomDate startDate, CustomDate endDate, CustomDate lastAdded, CustomDate scheduledDate, boolean z10, String str6, String str7, boolean z11, String str8) {
        kotlin.jvm.internal.i.g(startDate, "startDate");
        kotlin.jvm.internal.i.g(endDate, "endDate");
        kotlin.jvm.internal.i.g(lastAdded, "lastAdded");
        kotlin.jvm.internal.i.g(scheduledDate, "scheduledDate");
        this.courseId = str;
        this.goalId = str2;
        this.courseName = str3;
        this.goalName = str4;
        this.source = str5;
        this.startDate = startDate;
        this.endDate = endDate;
        this.lastAdded = lastAdded;
        this.scheduledDate = scheduledDate;
        this.notificationScheduled = z10;
        this.dynamicVariant = str6;
        this.type = str7;
        this.isVisible = z11;
        this.dataTypeKey = str8;
        this.trackListFlow = r.f(new ArrayList());
        this.loading = r.f(Boolean.TRUE);
    }

    public /* synthetic */ FirestoreGoal(String str, String str2, String str3, String str4, String str5, CustomDate customDate, CustomDate customDate2, CustomDate customDate3, CustomDate customDate4, boolean z10, String str6, String str7, boolean z11, String str8, int i6, d dVar) {
        this((i6 & 1) != 0 ? null : str, (i6 & 2) != 0 ? null : str2, (i6 & 4) != 0 ? null : str3, (i6 & 8) != 0 ? null : str4, (i6 & 16) != 0 ? null : str5, (i6 & 32) != 0 ? new CustomDate() : customDate, (i6 & 64) != 0 ? new CustomDate() : customDate2, (i6 & 128) != 0 ? new CustomDate() : customDate3, (i6 & 256) != 0 ? new CustomDate() : customDate4, (i6 & 512) != 0 ? false : z10, (i6 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 0 ? null : str6, (i6 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) != 0 ? null : str7, (i6 & 4096) == 0 ? z11 : false, (i6 & 8192) == 0 ? str8 : null);
    }
}
