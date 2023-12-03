package com.theinnerhour.b2b.network.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import tf.b;
import v.g;
/* compiled from: TelecommunicationsHomeworkNotificationResponseModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/theinnerhour/b2b/network/model/TelecommunicationHomeworkNotificationAssessment;", "", "id", "", "assessmentId", "slug", "", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getAssessmentId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getId", "getSlug", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/theinnerhour/b2b/network/model/TelecommunicationHomeworkNotificationAssessment;", "equals", "", "other", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class TelecommunicationHomeworkNotificationAssessment {
    @b("assessment_id")
    private final Integer assessmentId;
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private final Integer f11777id;
    @b("slug")
    private final String slug;

    public TelecommunicationHomeworkNotificationAssessment(Integer num, Integer num2, String str) {
        this.f11777id = num;
        this.assessmentId = num2;
        this.slug = str;
    }

    public static /* synthetic */ TelecommunicationHomeworkNotificationAssessment copy$default(TelecommunicationHomeworkNotificationAssessment telecommunicationHomeworkNotificationAssessment, Integer num, Integer num2, String str, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            num = telecommunicationHomeworkNotificationAssessment.f11777id;
        }
        if ((i6 & 2) != 0) {
            num2 = telecommunicationHomeworkNotificationAssessment.assessmentId;
        }
        if ((i6 & 4) != 0) {
            str = telecommunicationHomeworkNotificationAssessment.slug;
        }
        return telecommunicationHomeworkNotificationAssessment.copy(num, num2, str);
    }

    public final Integer component1() {
        return this.f11777id;
    }

    public final Integer component2() {
        return this.assessmentId;
    }

    public final String component3() {
        return this.slug;
    }

    public final TelecommunicationHomeworkNotificationAssessment copy(Integer num, Integer num2, String str) {
        return new TelecommunicationHomeworkNotificationAssessment(num, num2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TelecommunicationHomeworkNotificationAssessment)) {
            return false;
        }
        TelecommunicationHomeworkNotificationAssessment telecommunicationHomeworkNotificationAssessment = (TelecommunicationHomeworkNotificationAssessment) obj;
        if (i.b(this.f11777id, telecommunicationHomeworkNotificationAssessment.f11777id) && i.b(this.assessmentId, telecommunicationHomeworkNotificationAssessment.assessmentId) && i.b(this.slug, telecommunicationHomeworkNotificationAssessment.slug)) {
            return true;
        }
        return false;
    }

    public final Integer getAssessmentId() {
        return this.assessmentId;
    }

    public final Integer getId() {
        return this.f11777id;
    }

    public final String getSlug() {
        return this.slug;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        Integer num = this.f11777id;
        int i6 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i10 = hashCode * 31;
        Integer num2 = this.assessmentId;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str = this.slug;
        if (str != null) {
            i6 = str.hashCode();
        }
        return i11 + i6;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TelecommunicationHomeworkNotificationAssessment(id=");
        sb2.append(this.f11777id);
        sb2.append(", assessmentId=");
        sb2.append(this.assessmentId);
        sb2.append(", slug=");
        return g.c(sb2, this.slug, ')');
    }
}
