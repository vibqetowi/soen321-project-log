package com.ifriend.chat.new_chat.list.ui.model;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatPhotoBotMessageUi.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/ifriend/chat/new_chat/list/ui/model/ChatPhotoUserMessageUi;", "Lcom/ifriend/chat/new_chat/list/ui/model/ChatPhotoMessageUi;", ViewHierarchyConstants.TAG_KEY, "", "messageId", "previewImageUrl", "imageUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImageUrl", "()Ljava/lang/String;", "getMessageId", "getPreviewImageUrl", "getTag", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatPhotoUserMessageUi implements ChatPhotoMessageUi {
    public static final int $stable = 0;
    private final String imageUrl;
    private final String messageId;
    private final String previewImageUrl;
    private final String tag;

    public static /* synthetic */ ChatPhotoUserMessageUi copy$default(ChatPhotoUserMessageUi chatPhotoUserMessageUi, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatPhotoUserMessageUi.tag;
        }
        if ((i & 2) != 0) {
            str2 = chatPhotoUserMessageUi.messageId;
        }
        if ((i & 4) != 0) {
            str3 = chatPhotoUserMessageUi.previewImageUrl;
        }
        if ((i & 8) != 0) {
            str4 = chatPhotoUserMessageUi.imageUrl;
        }
        return chatPhotoUserMessageUi.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.tag;
    }

    public final String component2() {
        return this.messageId;
    }

    public final String component3() {
        return this.previewImageUrl;
    }

    public final String component4() {
        return this.imageUrl;
    }

    public final ChatPhotoUserMessageUi copy(String tag, String messageId, String previewImageUrl, String imageUrl) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(previewImageUrl, "previewImageUrl");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return new ChatPhotoUserMessageUi(tag, messageId, previewImageUrl, imageUrl);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatPhotoUserMessageUi) {
            ChatPhotoUserMessageUi chatPhotoUserMessageUi = (ChatPhotoUserMessageUi) obj;
            return Intrinsics.areEqual(this.tag, chatPhotoUserMessageUi.tag) && Intrinsics.areEqual(this.messageId, chatPhotoUserMessageUi.messageId) && Intrinsics.areEqual(this.previewImageUrl, chatPhotoUserMessageUi.previewImageUrl) && Intrinsics.areEqual(this.imageUrl, chatPhotoUserMessageUi.imageUrl);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.tag.hashCode() * 31) + this.messageId.hashCode()) * 31) + this.previewImageUrl.hashCode()) * 31) + this.imageUrl.hashCode();
    }

    public String toString() {
        String str = this.tag;
        String str2 = this.messageId;
        String str3 = this.previewImageUrl;
        String str4 = this.imageUrl;
        return "ChatPhotoUserMessageUi(tag=" + str + ", messageId=" + str2 + ", previewImageUrl=" + str3 + ", imageUrl=" + str4 + ")";
    }

    public ChatPhotoUserMessageUi(String tag, String messageId, String previewImageUrl, String imageUrl) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(previewImageUrl, "previewImageUrl");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.tag = tag;
        this.messageId = messageId;
        this.previewImageUrl = previewImageUrl;
        this.imageUrl = imageUrl;
    }

    @Override // com.ifriend.chat.new_chat.list.ui.model.TagHolder
    public String getTag() {
        return this.tag;
    }

    @Override // com.ifriend.chat.new_chat.list.ui.model.ChatPhotoMessageUi
    public String getMessageId() {
        return this.messageId;
    }

    @Override // com.ifriend.chat.new_chat.list.ui.model.ChatPhotoMessageUi
    public String getPreviewImageUrl() {
        return this.previewImageUrl;
    }

    @Override // com.ifriend.chat.new_chat.list.ui.model.ChatPhotoMessageUi
    public String getImageUrl() {
        return this.imageUrl;
    }
}
