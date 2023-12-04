package com.ifriend.presentation.features.home.ui.models;

import com.ifriend.presentation.features.home.ui.models.HomeChatUi;
import io.grpc.netty.shaded.io.netty.handler.codec.rtsp.RtspHeaders;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: HomeChatUi.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0002\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0014\u0010\r\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0017R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\n\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0014\u0010\t\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/ifriend/presentation/features/home/ui/models/HomeActiveChatUi;", "Lcom/ifriend/presentation/features/home/ui/models/HomeChatUi;", "chatId", "", "chatName", "chatAvatarUri", "avatarBadgeLabel", "sorting", "Lcom/ifriend/presentation/features/home/ui/models/HomeChatUi$Sorting;", "unreadMessagesCount", RtspHeaders.Values.TIME, "isVerified", "", "isCanChatting", "lastMessage", "Lcom/ifriend/presentation/features/home/ui/models/HomeLastChatMessageUi;", "isInfluencer", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ifriend/presentation/features/home/ui/models/HomeChatUi$Sorting;Ljava/lang/String;Ljava/lang/String;ZZLcom/ifriend/presentation/features/home/ui/models/HomeLastChatMessageUi;Z)V", "getAvatarBadgeLabel", "()Ljava/lang/String;", "getChatAvatarUri", "getChatId", "getChatName", "()Z", "getLastMessage", "()Lcom/ifriend/presentation/features/home/ui/models/HomeLastChatMessageUi;", "getSorting", "()Lcom/ifriend/presentation/features/home/ui/models/HomeChatUi$Sorting;", "getTime", "getUnreadMessagesCount", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HomeActiveChatUi implements HomeChatUi {
    public static final int $stable = 8;
    private final String avatarBadgeLabel;
    private final String chatAvatarUri;
    private final String chatId;
    private final String chatName;
    private final boolean isCanChatting;
    private final boolean isInfluencer;
    private final boolean isVerified;
    private final HomeLastChatMessageUi lastMessage;
    private final HomeChatUi.Sorting sorting;
    private final String time;
    private final String unreadMessagesCount;

    public HomeActiveChatUi(String chatId, String chatName, String chatAvatarUri, String avatarBadgeLabel, HomeChatUi.Sorting sorting, String unreadMessagesCount, String time, boolean z, boolean z2, HomeLastChatMessageUi homeLastChatMessageUi, boolean z3) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(chatName, "chatName");
        Intrinsics.checkNotNullParameter(chatAvatarUri, "chatAvatarUri");
        Intrinsics.checkNotNullParameter(avatarBadgeLabel, "avatarBadgeLabel");
        Intrinsics.checkNotNullParameter(sorting, "sorting");
        Intrinsics.checkNotNullParameter(unreadMessagesCount, "unreadMessagesCount");
        Intrinsics.checkNotNullParameter(time, "time");
        this.chatId = chatId;
        this.chatName = chatName;
        this.chatAvatarUri = chatAvatarUri;
        this.avatarBadgeLabel = avatarBadgeLabel;
        this.sorting = sorting;
        this.unreadMessagesCount = unreadMessagesCount;
        this.time = time;
        this.isVerified = z;
        this.isCanChatting = z2;
        this.lastMessage = homeLastChatMessageUi;
        this.isInfluencer = z3;
    }

    @Override // com.ifriend.presentation.features.home.ui.models.HomeChatUi
    public String getChatId() {
        return this.chatId;
    }

    @Override // com.ifriend.presentation.features.home.ui.models.HomeChatUi
    public String getChatName() {
        return this.chatName;
    }

    @Override // com.ifriend.presentation.features.home.ui.models.HomeChatUi
    public String getChatAvatarUri() {
        return this.chatAvatarUri;
    }

    @Override // com.ifriend.presentation.features.home.ui.models.HomeChatUi
    public String getAvatarBadgeLabel() {
        return this.avatarBadgeLabel;
    }

    @Override // com.ifriend.presentation.features.home.ui.models.HomeChatUi
    public HomeChatUi.Sorting getSorting() {
        return this.sorting;
    }

    @Override // com.ifriend.presentation.features.home.ui.models.HomeChatUi
    public String getUnreadMessagesCount() {
        return this.unreadMessagesCount;
    }

    @Override // com.ifriend.presentation.features.home.ui.models.HomeChatUi
    public String getTime() {
        return this.time;
    }

    @Override // com.ifriend.presentation.features.home.ui.models.HomeChatUi
    public boolean isVerified() {
        return this.isVerified;
    }

    @Override // com.ifriend.presentation.features.home.ui.models.HomeChatUi
    public boolean isCanChatting() {
        return this.isCanChatting;
    }

    public final HomeLastChatMessageUi getLastMessage() {
        return this.lastMessage;
    }

    public final boolean isInfluencer() {
        return this.isInfluencer;
    }
}
