package com.theinnerhour.b2b.network.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import tf.b;
import v.g;
/* compiled from: CrossProviderRecommendationModel.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/theinnerhour/b2b/network/model/CrossProviderRecommendationModel;", "", "notification", "Lcom/theinnerhour/b2b/network/model/CrossProviderRecommendationNotificationModel;", "message", "", "(Lcom/theinnerhour/b2b/network/model/CrossProviderRecommendationNotificationModel;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getNotification", "()Lcom/theinnerhour/b2b/network/model/CrossProviderRecommendationNotificationModel;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class CrossProviderRecommendationModel {
    @b("message")
    private final String message;
    @b("notification")
    private final CrossProviderRecommendationNotificationModel notification;

    public CrossProviderRecommendationModel(CrossProviderRecommendationNotificationModel notification, String str) {
        i.g(notification, "notification");
        this.notification = notification;
        this.message = str;
    }

    public static /* synthetic */ CrossProviderRecommendationModel copy$default(CrossProviderRecommendationModel crossProviderRecommendationModel, CrossProviderRecommendationNotificationModel crossProviderRecommendationNotificationModel, String str, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            crossProviderRecommendationNotificationModel = crossProviderRecommendationModel.notification;
        }
        if ((i6 & 2) != 0) {
            str = crossProviderRecommendationModel.message;
        }
        return crossProviderRecommendationModel.copy(crossProviderRecommendationNotificationModel, str);
    }

    public final CrossProviderRecommendationNotificationModel component1() {
        return this.notification;
    }

    public final String component2() {
        return this.message;
    }

    public final CrossProviderRecommendationModel copy(CrossProviderRecommendationNotificationModel notification, String str) {
        i.g(notification, "notification");
        return new CrossProviderRecommendationModel(notification, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CrossProviderRecommendationModel)) {
            return false;
        }
        CrossProviderRecommendationModel crossProviderRecommendationModel = (CrossProviderRecommendationModel) obj;
        if (i.b(this.notification, crossProviderRecommendationModel.notification) && i.b(this.message, crossProviderRecommendationModel.message)) {
            return true;
        }
        return false;
    }

    public final String getMessage() {
        return this.message;
    }

    public final CrossProviderRecommendationNotificationModel getNotification() {
        return this.notification;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.notification.hashCode() * 31;
        String str = this.message;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CrossProviderRecommendationModel(notification=");
        sb2.append(this.notification);
        sb2.append(", message=");
        return g.c(sb2, this.message, ')');
    }
}
