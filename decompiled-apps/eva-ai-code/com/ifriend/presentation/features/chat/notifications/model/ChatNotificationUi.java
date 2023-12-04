package com.ifriend.presentation.features.chat.notifications.model;

import androidx.compose.ui.graphics.vector.ImageVector;
import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatNotificationUi.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003J[\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010#\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\rHÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006'"}, d2 = {"Lcom/ifriend/presentation/features/chat/notifications/model/ChatNotificationUi;", "", "id", "", "chatId", "title", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "isContentHidden", "", "avatarUrl", "messageIcon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "order", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;I)V", "getAvatarUrl", "()Ljava/lang/String;", "getChatId", "getId", "()Z", "getMessage", "getMessageIcon", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "getOrder", "()I", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatNotificationUi {
    public static final int $stable = 0;
    private final String avatarUrl;
    private final String chatId;
    private final String id;
    private final boolean isContentHidden;
    private final String message;
    private final ImageVector messageIcon;
    private final int order;
    private final String title;

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.chatId;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.message;
    }

    public final boolean component5() {
        return this.isContentHidden;
    }

    public final String component6() {
        return this.avatarUrl;
    }

    public final ImageVector component7() {
        return this.messageIcon;
    }

    public final int component8() {
        return this.order;
    }

    public final ChatNotificationUi copy(String id, String chatId, String title, String message, boolean z, String avatarUrl, ImageVector imageVector, int i) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        return new ChatNotificationUi(id, chatId, title, message, z, avatarUrl, imageVector, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatNotificationUi) {
            ChatNotificationUi chatNotificationUi = (ChatNotificationUi) obj;
            return Intrinsics.areEqual(this.id, chatNotificationUi.id) && Intrinsics.areEqual(this.chatId, chatNotificationUi.chatId) && Intrinsics.areEqual(this.title, chatNotificationUi.title) && Intrinsics.areEqual(this.message, chatNotificationUi.message) && this.isContentHidden == chatNotificationUi.isContentHidden && Intrinsics.areEqual(this.avatarUrl, chatNotificationUi.avatarUrl) && Intrinsics.areEqual(this.messageIcon, chatNotificationUi.messageIcon) && this.order == chatNotificationUi.order;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.id.hashCode() * 31) + this.chatId.hashCode()) * 31) + this.title.hashCode()) * 31) + this.message.hashCode()) * 31;
        boolean z = this.isContentHidden;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((hashCode + i) * 31) + this.avatarUrl.hashCode()) * 31;
        ImageVector imageVector = this.messageIcon;
        return ((hashCode2 + (imageVector == null ? 0 : imageVector.hashCode())) * 31) + this.order;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.chatId;
        String str3 = this.title;
        String str4 = this.message;
        boolean z = this.isContentHidden;
        String str5 = this.avatarUrl;
        ImageVector imageVector = this.messageIcon;
        int i = this.order;
        return "ChatNotificationUi(id=" + str + ", chatId=" + str2 + ", title=" + str3 + ", message=" + str4 + ", isContentHidden=" + z + ", avatarUrl=" + str5 + ", messageIcon=" + imageVector + ", order=" + i + ")";
    }

    public ChatNotificationUi(String id, String chatId, String title, String message, boolean z, String avatarUrl, ImageVector imageVector, int i) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        this.id = id;
        this.chatId = chatId;
        this.title = title;
        this.message = message;
        this.isContentHidden = z;
        this.avatarUrl = avatarUrl;
        this.messageIcon = imageVector;
        this.order = i;
    }

    public final String getId() {
        return this.id;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getMessage() {
        return this.message;
    }

    public final boolean isContentHidden() {
        return this.isContentHidden;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final ImageVector getMessageIcon() {
        return this.messageIcon;
    }

    public final int getOrder() {
        return this.order;
    }
}
