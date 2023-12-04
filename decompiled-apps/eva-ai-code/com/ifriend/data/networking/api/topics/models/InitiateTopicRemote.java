package com.ifriend.data.networking.api.topics.models;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: InitiateTopicRemote.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0010B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ifriend/data/networking/api/topics/models/InitiateTopicRemote;", "", "popupData", "Lcom/ifriend/data/networking/api/topics/models/InitiateTopicRemote$PopupData;", "(Lcom/ifriend/data/networking/api/topics/models/InitiateTopicRemote$PopupData;)V", "getPopupData", "()Lcom/ifriend/data/networking/api/topics/models/InitiateTopicRemote$PopupData;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "PopupData", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InitiateTopicRemote {
    @SerializedName(ViewHierarchyConstants.VIEW_KEY)
    private final PopupData popupData;

    public static /* synthetic */ InitiateTopicRemote copy$default(InitiateTopicRemote initiateTopicRemote, PopupData popupData, int i, Object obj) {
        if ((i & 1) != 0) {
            popupData = initiateTopicRemote.popupData;
        }
        return initiateTopicRemote.copy(popupData);
    }

    public final PopupData component1() {
        return this.popupData;
    }

    public final InitiateTopicRemote copy(PopupData popupData) {
        return new InitiateTopicRemote(popupData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InitiateTopicRemote) && Intrinsics.areEqual(this.popupData, ((InitiateTopicRemote) obj).popupData);
    }

    public int hashCode() {
        PopupData popupData = this.popupData;
        if (popupData == null) {
            return 0;
        }
        return popupData.hashCode();
    }

    public String toString() {
        PopupData popupData = this.popupData;
        return "InitiateTopicRemote(popupData=" + popupData + ")";
    }

    public InitiateTopicRemote(PopupData popupData) {
        this.popupData = popupData;
    }

    public final PopupData getPopupData() {
        return this.popupData;
    }

    /* compiled from: InitiateTopicRemote.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/ifriend/data/networking/api/topics/models/InitiateTopicRemote$PopupData;", "", "icon", "", "title", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "callToAction", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCallToAction", "()Ljava/lang/String;", "getIcon", "getMessage", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class PopupData {
        @SerializedName("callToAction")
        private final String callToAction;
        @SerializedName("icon")
        private final String icon;
        @SerializedName(ShareConstants.WEB_DIALOG_PARAM_MESSAGE)
        private final String message;
        @SerializedName("title")
        private final String title;

        public static /* synthetic */ PopupData copy$default(PopupData popupData, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = popupData.icon;
            }
            if ((i & 2) != 0) {
                str2 = popupData.title;
            }
            if ((i & 4) != 0) {
                str3 = popupData.message;
            }
            if ((i & 8) != 0) {
                str4 = popupData.callToAction;
            }
            return popupData.copy(str, str2, str3, str4);
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

        public final PopupData copy(String str, String str2, String str3, String str4) {
            return new PopupData(str, str2, str3, str4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PopupData) {
                PopupData popupData = (PopupData) obj;
                return Intrinsics.areEqual(this.icon, popupData.icon) && Intrinsics.areEqual(this.title, popupData.title) && Intrinsics.areEqual(this.message, popupData.message) && Intrinsics.areEqual(this.callToAction, popupData.callToAction);
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
            return "PopupData(icon=" + str + ", title=" + str2 + ", message=" + str3 + ", callToAction=" + str4 + ")";
        }

        public PopupData(String str, String str2, String str3, String str4) {
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
}
