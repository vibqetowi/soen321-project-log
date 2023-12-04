package com.ifriend.presentation.features.chat.intro.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatIntroUiState.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006 "}, d2 = {"Lcom/ifriend/presentation/features/chat/intro/model/ChatIntroUiState;", "", "isVisible", "", "avatarUrl", "", "name", "chatId", "description", "cardUiParams", "Lcom/ifriend/presentation/features/chat/intro/model/ChatIntroCardUiParams;", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ifriend/presentation/features/chat/intro/model/ChatIntroCardUiParams;)V", "getAvatarUrl", "()Ljava/lang/String;", "getCardUiParams", "()Lcom/ifriend/presentation/features/chat/intro/model/ChatIntroCardUiParams;", "getChatId", "getDescription", "()Z", "getName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatIntroUiState {
    public static final int $stable = 0;
    private final String avatarUrl;
    private final ChatIntroCardUiParams cardUiParams;
    private final String chatId;
    private final String description;
    private final boolean isVisible;
    private final String name;

    public ChatIntroUiState() {
        this(false, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ ChatIntroUiState copy$default(ChatIntroUiState chatIntroUiState, boolean z, String str, String str2, String str3, String str4, ChatIntroCardUiParams chatIntroCardUiParams, int i, Object obj) {
        if ((i & 1) != 0) {
            z = chatIntroUiState.isVisible;
        }
        if ((i & 2) != 0) {
            str = chatIntroUiState.avatarUrl;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = chatIntroUiState.name;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = chatIntroUiState.chatId;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = chatIntroUiState.description;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            chatIntroCardUiParams = chatIntroUiState.cardUiParams;
        }
        return chatIntroUiState.copy(z, str5, str6, str7, str8, chatIntroCardUiParams);
    }

    public final boolean component1() {
        return this.isVisible;
    }

    public final String component2() {
        return this.avatarUrl;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.chatId;
    }

    public final String component5() {
        return this.description;
    }

    public final ChatIntroCardUiParams component6() {
        return this.cardUiParams;
    }

    public final ChatIntroUiState copy(boolean z, String avatarUrl, String name, String chatId, String description, ChatIntroCardUiParams cardUiParams) {
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(cardUiParams, "cardUiParams");
        return new ChatIntroUiState(z, avatarUrl, name, chatId, description, cardUiParams);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatIntroUiState) {
            ChatIntroUiState chatIntroUiState = (ChatIntroUiState) obj;
            return this.isVisible == chatIntroUiState.isVisible && Intrinsics.areEqual(this.avatarUrl, chatIntroUiState.avatarUrl) && Intrinsics.areEqual(this.name, chatIntroUiState.name) && Intrinsics.areEqual(this.chatId, chatIntroUiState.chatId) && Intrinsics.areEqual(this.description, chatIntroUiState.description) && Intrinsics.areEqual(this.cardUiParams, chatIntroUiState.cardUiParams);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    public int hashCode() {
        boolean z = this.isVisible;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((((((((r0 * 31) + this.avatarUrl.hashCode()) * 31) + this.name.hashCode()) * 31) + this.chatId.hashCode()) * 31) + this.description.hashCode()) * 31) + this.cardUiParams.hashCode();
    }

    public String toString() {
        boolean z = this.isVisible;
        String str = this.avatarUrl;
        String str2 = this.name;
        String str3 = this.chatId;
        String str4 = this.description;
        ChatIntroCardUiParams chatIntroCardUiParams = this.cardUiParams;
        return "ChatIntroUiState(isVisible=" + z + ", avatarUrl=" + str + ", name=" + str2 + ", chatId=" + str3 + ", description=" + str4 + ", cardUiParams=" + chatIntroCardUiParams + ")";
    }

    public ChatIntroUiState(boolean z, String avatarUrl, String name, String chatId, String description, ChatIntroCardUiParams cardUiParams) {
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(cardUiParams, "cardUiParams");
        this.isVisible = z;
        this.avatarUrl = avatarUrl;
        this.name = name;
        this.chatId = chatId;
        this.description = description;
        this.cardUiParams = cardUiParams;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final String getDescription() {
        return this.description;
    }

    public /* synthetic */ ChatIntroUiState(boolean z, String str, String str2, String str3, String str4, ChatIntroCardUiParams chatIntroCardUiParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) == 0 ? str4 : "", (i & 32) != 0 ? new ChatIntroCardUiParams(null, null, null, false, 15, null) : chatIntroCardUiParams);
    }

    public final ChatIntroCardUiParams getCardUiParams() {
        return this.cardUiParams;
    }
}
