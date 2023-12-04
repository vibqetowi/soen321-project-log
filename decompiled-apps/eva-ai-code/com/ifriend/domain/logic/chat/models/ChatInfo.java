package com.ifriend.domain.logic.chat.models;

import com.ifriend.domain.logic.chat.models.ChatPaymentStatus;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatInfo.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000f0\fHÆ\u0003J\t\u0010/\u001a\u00020\u0011HÆ\u0003Jo\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u00101\u001a\u00020\u00182\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u001b\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0014R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0014¨\u00066"}, d2 = {"Lcom/ifriend/domain/logic/chat/models/ChatInfo;", "", "uId", "", "chatId", "chatType", "Lcom/ifriend/domain/logic/chat/models/ChatType;", "name", "roundAvatarUrl", "paymentStatus", "Lcom/ifriend/domain/logic/chat/models/ChatPaymentStatus;", "paymentOptions", "", "Lcom/ifriend/domain/logic/chat/models/ChatInfoPaymentOption;", "tags", "Lcom/ifriend/domain/logic/chat/models/ChatInfoTag;", "promote", "Lcom/ifriend/domain/logic/chat/models/ChatPromote;", "(Ljava/lang/String;Ljava/lang/String;Lcom/ifriend/domain/logic/chat/models/ChatType;Ljava/lang/String;Ljava/lang/String;Lcom/ifriend/domain/logic/chat/models/ChatPaymentStatus;Ljava/util/List;Ljava/util/List;Lcom/ifriend/domain/logic/chat/models/ChatPromote;)V", "getChatId", "()Ljava/lang/String;", "getChatType", "()Lcom/ifriend/domain/logic/chat/models/ChatType;", "isMain", "", "()Z", "isPromote", "isSubscriptionActivated", "isVerified", "getName", "getPaymentOptions", "()Ljava/util/List;", "getPaymentStatus", "()Lcom/ifriend/domain/logic/chat/models/ChatPaymentStatus;", "getPromote", "()Lcom/ifriend/domain/logic/chat/models/ChatPromote;", "getRoundAvatarUrl", "getTags", "getUId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatInfo {
    private final String chatId;
    private final ChatType chatType;
    private final String name;
    private final List<ChatInfoPaymentOption> paymentOptions;
    private final ChatPaymentStatus paymentStatus;
    private final ChatPromote promote;
    private final String roundAvatarUrl;
    private final List<ChatInfoTag> tags;
    private final String uId;

    public final String component1() {
        return this.uId;
    }

    public final String component2() {
        return this.chatId;
    }

    public final ChatType component3() {
        return this.chatType;
    }

    public final String component4() {
        return this.name;
    }

    public final String component5() {
        return this.roundAvatarUrl;
    }

    public final ChatPaymentStatus component6() {
        return this.paymentStatus;
    }

    public final List<ChatInfoPaymentOption> component7() {
        return this.paymentOptions;
    }

    public final List<ChatInfoTag> component8() {
        return this.tags;
    }

    public final ChatPromote component9() {
        return this.promote;
    }

    public final ChatInfo copy(String uId, String chatId, ChatType chatType, String name, String roundAvatarUrl, ChatPaymentStatus paymentStatus, List<ChatInfoPaymentOption> paymentOptions, List<? extends ChatInfoTag> tags, ChatPromote promote) {
        Intrinsics.checkNotNullParameter(uId, "uId");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(chatType, "chatType");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(roundAvatarUrl, "roundAvatarUrl");
        Intrinsics.checkNotNullParameter(paymentStatus, "paymentStatus");
        Intrinsics.checkNotNullParameter(paymentOptions, "paymentOptions");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(promote, "promote");
        return new ChatInfo(uId, chatId, chatType, name, roundAvatarUrl, paymentStatus, paymentOptions, tags, promote);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatInfo) {
            ChatInfo chatInfo = (ChatInfo) obj;
            return Intrinsics.areEqual(this.uId, chatInfo.uId) && Intrinsics.areEqual(this.chatId, chatInfo.chatId) && this.chatType == chatInfo.chatType && Intrinsics.areEqual(this.name, chatInfo.name) && Intrinsics.areEqual(this.roundAvatarUrl, chatInfo.roundAvatarUrl) && Intrinsics.areEqual(this.paymentStatus, chatInfo.paymentStatus) && Intrinsics.areEqual(this.paymentOptions, chatInfo.paymentOptions) && Intrinsics.areEqual(this.tags, chatInfo.tags) && Intrinsics.areEqual(this.promote, chatInfo.promote);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((this.uId.hashCode() * 31) + this.chatId.hashCode()) * 31) + this.chatType.hashCode()) * 31) + this.name.hashCode()) * 31) + this.roundAvatarUrl.hashCode()) * 31) + this.paymentStatus.hashCode()) * 31) + this.paymentOptions.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.promote.hashCode();
    }

    public String toString() {
        String str = this.uId;
        String str2 = this.chatId;
        ChatType chatType = this.chatType;
        String str3 = this.name;
        String str4 = this.roundAvatarUrl;
        ChatPaymentStatus chatPaymentStatus = this.paymentStatus;
        List<ChatInfoPaymentOption> list = this.paymentOptions;
        List<ChatInfoTag> list2 = this.tags;
        ChatPromote chatPromote = this.promote;
        return "ChatInfo(uId=" + str + ", chatId=" + str2 + ", chatType=" + chatType + ", name=" + str3 + ", roundAvatarUrl=" + str4 + ", paymentStatus=" + chatPaymentStatus + ", paymentOptions=" + list + ", tags=" + list2 + ", promote=" + chatPromote + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChatInfo(String uId, String chatId, ChatType chatType, String name, String roundAvatarUrl, ChatPaymentStatus paymentStatus, List<ChatInfoPaymentOption> paymentOptions, List<? extends ChatInfoTag> tags, ChatPromote promote) {
        Intrinsics.checkNotNullParameter(uId, "uId");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(chatType, "chatType");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(roundAvatarUrl, "roundAvatarUrl");
        Intrinsics.checkNotNullParameter(paymentStatus, "paymentStatus");
        Intrinsics.checkNotNullParameter(paymentOptions, "paymentOptions");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(promote, "promote");
        this.uId = uId;
        this.chatId = chatId;
        this.chatType = chatType;
        this.name = name;
        this.roundAvatarUrl = roundAvatarUrl;
        this.paymentStatus = paymentStatus;
        this.paymentOptions = paymentOptions;
        this.tags = tags;
        this.promote = promote;
    }

    public final String getUId() {
        return this.uId;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final ChatType getChatType() {
        return this.chatType;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRoundAvatarUrl() {
        return this.roundAvatarUrl;
    }

    public final ChatPaymentStatus getPaymentStatus() {
        return this.paymentStatus;
    }

    public final List<ChatInfoPaymentOption> getPaymentOptions() {
        return this.paymentOptions;
    }

    public final List<ChatInfoTag> getTags() {
        return this.tags;
    }

    public final ChatPromote getPromote() {
        return this.promote;
    }

    public final boolean isMain() {
        return this.chatType == ChatType.MAIN;
    }

    public final boolean isPromote() {
        return this.promote.isPromote();
    }

    public final boolean isVerified() {
        return this.tags.contains(ChatInfoTag.VERIFIED_ACCOUNT);
    }

    public final boolean isSubscriptionActivated() {
        ChatPaymentStatus chatPaymentStatus = this.paymentStatus;
        return (chatPaymentStatus instanceof ChatPaymentStatus.Subscription) && ((ChatPaymentStatus.Subscription) chatPaymentStatus).getHasSubscription();
    }
}
