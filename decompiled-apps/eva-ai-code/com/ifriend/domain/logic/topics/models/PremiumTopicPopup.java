package com.ifriend.domain.logic.topics.models;

import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: PremiumTopicPopup.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/ifriend/domain/logic/topics/models/PremiumTopicPopup;", "", "icon", "", "title", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "callToAction", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCallToAction", "()Ljava/lang/String;", "getIcon", "getMessage", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PremiumTopicPopup {
    private final String callToAction;
    private final String icon;
    private final String message;
    private final String title;

    public static /* synthetic */ PremiumTopicPopup copy$default(PremiumTopicPopup premiumTopicPopup, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = premiumTopicPopup.icon;
        }
        if ((i & 2) != 0) {
            str2 = premiumTopicPopup.title;
        }
        if ((i & 4) != 0) {
            str3 = premiumTopicPopup.message;
        }
        if ((i & 8) != 0) {
            str4 = premiumTopicPopup.callToAction;
        }
        return premiumTopicPopup.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.icon;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.message;
    }

    public final String component4() {
        return this.callToAction;
    }

    public final PremiumTopicPopup copy(String str, String str2, String str3, String str4) {
        return new PremiumTopicPopup(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PremiumTopicPopup) {
            PremiumTopicPopup premiumTopicPopup = (PremiumTopicPopup) obj;
            return Intrinsics.areEqual(this.icon, premiumTopicPopup.icon) && Intrinsics.areEqual(this.title, premiumTopicPopup.title) && Intrinsics.areEqual(this.message, premiumTopicPopup.message) && Intrinsics.areEqual(this.callToAction, premiumTopicPopup.callToAction);
        }
        return false;
    }

    public int hashCode() {
        String str = this.icon;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.message;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.callToAction;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.icon;
        String str2 = this.title;
        String str3 = this.message;
        String str4 = this.callToAction;
        return "PremiumTopicPopup(icon=" + str + ", title=" + str2 + ", message=" + str3 + ", callToAction=" + str4 + ")";
    }

    public PremiumTopicPopup(String str, String str2, String str3, String str4) {
        this.icon = str;
        this.title = str2;
        this.message = str3;
        this.callToAction = str4;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getCallToAction() {
        return this.callToAction;
    }
}
