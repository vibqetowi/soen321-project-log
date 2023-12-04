package com.ifriend.chat.new_chat.list.ui.model;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatPhotoBotMessageUi.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/ifriend/chat/new_chat/list/ui/model/ChatPhotoBotMessageUi;", "Lcom/ifriend/chat/new_chat/list/ui/model/ChatPhotoMessageUi;", ViewHierarchyConstants.TAG_KEY, "", "messageId", "previewImageUrl", "imageUrl", "amount", "isShowAmountContent", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAmount", "()Ljava/lang/String;", "getImageUrl", "()Z", "getMessageId", "getPreviewImageUrl", "getTag", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatPhotoBotMessageUi implements ChatPhotoMessageUi {
    public static final int $stable = 0;
    private final String amount;
    private final String imageUrl;
    private final boolean isShowAmountContent;
    private final String messageId;
    private final String previewImageUrl;
    private final String tag;

    public static /* synthetic */ ChatPhotoBotMessageUi copy$default(ChatPhotoBotMessageUi chatPhotoBotMessageUi, String str, String str2, String str3, String str4, String str5, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatPhotoBotMessageUi.tag;
        }
        if ((i & 2) != 0) {
            str2 = chatPhotoBotMessageUi.messageId;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = chatPhotoBotMessageUi.previewImageUrl;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = chatPhotoBotMessageUi.imageUrl;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = chatPhotoBotMessageUi.amount;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            z = chatPhotoBotMessageUi.isShowAmountContent;
        }
        return chatPhotoBotMessageUi.copy(str, str6, str7, str8, str9, z);
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

    public final String component5() {
        return this.amount;
    }

    public final boolean component6() {
        return this.isShowAmountContent;
    }

    public final ChatPhotoBotMessageUi copy(String tag, String messageId, String previewImageUrl, String imageUrl, String amount, boolean z) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(previewImageUrl, "previewImageUrl");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(amount, "amount");
        return new ChatPhotoBotMessageUi(tag, messageId, previewImageUrl, imageUrl, amount, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatPhotoBotMessageUi) {
            ChatPhotoBotMessageUi chatPhotoBotMessageUi = (ChatPhotoBotMessageUi) obj;
            return Intrinsics.areEqual(this.tag, chatPhotoBotMessageUi.tag) && Intrinsics.areEqual(this.messageId, chatPhotoBotMessageUi.messageId) && Intrinsics.areEqual(this.previewImageUrl, chatPhotoBotMessageUi.previewImageUrl) && Intrinsics.areEqual(this.imageUrl, chatPhotoBotMessageUi.imageUrl) && Intrinsics.areEqual(this.amount, chatPhotoBotMessageUi.amount) && this.isShowAmountContent == chatPhotoBotMessageUi.isShowAmountContent;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((this.tag.hashCode() * 31) + this.messageId.hashCode()) * 31) + this.previewImageUrl.hashCode()) * 31) + this.imageUrl.hashCode()) * 31) + this.amount.hashCode()) * 31;
        boolean z = this.isShowAmountContent;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.tag;
        String str2 = this.messageId;
        String str3 = this.previewImageUrl;
        String str4 = this.imageUrl;
        String str5 = this.amount;
        boolean z = this.isShowAmountContent;
        return "ChatPhotoBotMessageUi(tag=" + str + ", messageId=" + str2 + ", previewImageUrl=" + str3 + ", imageUrl=" + str4 + ", amount=" + str5 + ", isShowAmountContent=" + z + ")";
    }

    public ChatPhotoBotMessageUi(String tag, String messageId, String previewImageUrl, String imageUrl, String amount, boolean z) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(previewImageUrl, "previewImageUrl");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.tag = tag;
        this.messageId = messageId;
        this.previewImageUrl = previewImageUrl;
        this.imageUrl = imageUrl;
        this.amount = amount;
        this.isShowAmountContent = z;
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

    public final String getAmount() {
        return this.amount;
    }

    public final boolean isShowAmountContent() {
        return this.isShowAmountContent;
    }
}
