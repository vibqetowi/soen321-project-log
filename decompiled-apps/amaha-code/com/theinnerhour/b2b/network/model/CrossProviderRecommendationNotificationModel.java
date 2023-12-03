package com.theinnerhour.b2b.network.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import tf.b;
import v.g;
/* compiled from: CrossProviderRecommendationModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, d2 = {"Lcom/theinnerhour/b2b/network/model/CrossProviderRecommendationNotificationModel;", "", "id", "", "message", "cta", "status", "route", "createdAt", "updatedAt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCreatedAt", "()Ljava/lang/String;", "getCta", "getId", "getMessage", "getRoute", "getStatus", "getUpdatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class CrossProviderRecommendationNotificationModel {
    @b("createdAt")
    private final String createdAt;
    @b("cta")
    private final String cta;
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private final String f11772id;
    @b("message")
    private final String message;
    @b("route")
    private final String route;
    @b("status")
    private final String status;
    @b("updatedAt")
    private final String updatedAt;

    public CrossProviderRecommendationNotificationModel(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f11772id = str;
        this.message = str2;
        this.cta = str3;
        this.status = str4;
        this.route = str5;
        this.createdAt = str6;
        this.updatedAt = str7;
    }

    public static /* synthetic */ CrossProviderRecommendationNotificationModel copy$default(CrossProviderRecommendationNotificationModel crossProviderRecommendationNotificationModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = crossProviderRecommendationNotificationModel.f11772id;
        }
        if ((i6 & 2) != 0) {
            str2 = crossProviderRecommendationNotificationModel.message;
        }
        String str8 = str2;
        if ((i6 & 4) != 0) {
            str3 = crossProviderRecommendationNotificationModel.cta;
        }
        String str9 = str3;
        if ((i6 & 8) != 0) {
            str4 = crossProviderRecommendationNotificationModel.status;
        }
        String str10 = str4;
        if ((i6 & 16) != 0) {
            str5 = crossProviderRecommendationNotificationModel.route;
        }
        String str11 = str5;
        if ((i6 & 32) != 0) {
            str6 = crossProviderRecommendationNotificationModel.createdAt;
        }
        String str12 = str6;
        if ((i6 & 64) != 0) {
            str7 = crossProviderRecommendationNotificationModel.updatedAt;
        }
        return crossProviderRecommendationNotificationModel.copy(str, str8, str9, str10, str11, str12, str7);
    }

    public final String component1() {
        return this.f11772id;
    }

    public final String component2() {
        return this.message;
    }

    public final String component3() {
        return this.cta;
    }

    public final String component4() {
        return this.status;
    }

    public final String component5() {
        return this.route;
    }

    public final String component6() {
        return this.createdAt;
    }

    public final String component7() {
        return this.updatedAt;
    }

    public final CrossProviderRecommendationNotificationModel copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new CrossProviderRecommendationNotificationModel(str, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CrossProviderRecommendationNotificationModel)) {
            return false;
        }
        CrossProviderRecommendationNotificationModel crossProviderRecommendationNotificationModel = (CrossProviderRecommendationNotificationModel) obj;
        if (i.b(this.f11772id, crossProviderRecommendationNotificationModel.f11772id) && i.b(this.message, crossProviderRecommendationNotificationModel.message) && i.b(this.cta, crossProviderRecommendationNotificationModel.cta) && i.b(this.status, crossProviderRecommendationNotificationModel.status) && i.b(this.route, crossProviderRecommendationNotificationModel.route) && i.b(this.createdAt, crossProviderRecommendationNotificationModel.createdAt) && i.b(this.updatedAt, crossProviderRecommendationNotificationModel.updatedAt)) {
            return true;
        }
        return false;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getCta() {
        return this.cta;
    }

    public final String getId() {
        return this.f11772id;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getRoute() {
        return this.route;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        String str = this.f11772id;
        int i6 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.message;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str3 = this.cta;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str4 = this.status;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        String str5 = this.route;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        String str6 = this.createdAt;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i15 = (i14 + hashCode6) * 31;
        String str7 = this.updatedAt;
        if (str7 != null) {
            i6 = str7.hashCode();
        }
        return i15 + i6;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CrossProviderRecommendationNotificationModel(id=");
        sb2.append(this.f11772id);
        sb2.append(", message=");
        sb2.append(this.message);
        sb2.append(", cta=");
        sb2.append(this.cta);
        sb2.append(", status=");
        sb2.append(this.status);
        sb2.append(", route=");
        sb2.append(this.route);
        sb2.append(", createdAt=");
        sb2.append(this.createdAt);
        sb2.append(", updatedAt=");
        return g.c(sb2, this.updatedAt, ')');
    }
}
