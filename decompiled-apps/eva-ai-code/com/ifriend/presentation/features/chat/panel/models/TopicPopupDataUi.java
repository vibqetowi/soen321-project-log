package com.ifriend.presentation.features.chat.panel.models;

import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatTopicUi.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\fJ8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/ifriend/presentation/features/chat/panel/models/TopicPopupDataUi;", "", "title", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, NativeProtocol.WEB_DIALOG_ACTION, "iconResId", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getAction", "()Ljava/lang/String;", "getIconResId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMessage", "getTitle", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/ifriend/presentation/features/chat/panel/models/TopicPopupDataUi;", "equals", "", "other", "hashCode", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TopicPopupDataUi {
    public static final int $stable = 0;
    private final String action;
    private final Integer iconResId;
    private final String message;
    private final String title;

    public static /* synthetic */ TopicPopupDataUi copy$default(TopicPopupDataUi topicPopupDataUi, String str, String str2, String str3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = topicPopupDataUi.title;
        }
        if ((i & 2) != 0) {
            str2 = topicPopupDataUi.message;
        }
        if ((i & 4) != 0) {
            str3 = topicPopupDataUi.action;
        }
        if ((i & 8) != 0) {
            num = topicPopupDataUi.iconResId;
        }
        return topicPopupDataUi.copy(str, str2, str3, num);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.message;
    }

    public final String component3() {
        return this.action;
    }

    public final Integer component4() {
        return this.iconResId;
    }

    public final TopicPopupDataUi copy(String title, String message, String action, Integer num) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(action, "action");
        return new TopicPopupDataUi(title, message, action, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TopicPopupDataUi) {
            TopicPopupDataUi topicPopupDataUi = (TopicPopupDataUi) obj;
            return Intrinsics.areEqual(this.title, topicPopupDataUi.title) && Intrinsics.areEqual(this.message, topicPopupDataUi.message) && Intrinsics.areEqual(this.action, topicPopupDataUi.action) && Intrinsics.areEqual(this.iconResId, topicPopupDataUi.iconResId);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.title.hashCode() * 31) + this.message.hashCode()) * 31) + this.action.hashCode()) * 31;
        Integer num = this.iconResId;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        String str = this.title;
        String str2 = this.message;
        String str3 = this.action;
        Integer num = this.iconResId;
        return "TopicPopupDataUi(title=" + str + ", message=" + str2 + ", action=" + str3 + ", iconResId=" + num + ")";
    }

    public TopicPopupDataUi(String title, String message, String action, Integer num) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(action, "action");
        this.title = title;
        this.message = message;
        this.action = action;
        this.iconResId = num;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getAction() {
        return this.action;
    }

    public final Integer getIconResId() {
        return this.iconResId;
    }
}
