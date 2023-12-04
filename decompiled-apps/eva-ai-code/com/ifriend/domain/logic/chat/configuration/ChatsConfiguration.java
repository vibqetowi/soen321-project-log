package com.ifriend.domain.logic.chat.configuration;

import com.ifriend.domain.logic.chat.models.ChatInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatsConfiguration.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ifriend/domain/logic/chat/configuration/ChatsConfiguration;", "", "chatInfo", "Lcom/ifriend/domain/logic/chat/models/ChatInfo;", "chatConfig", "Lcom/ifriend/domain/logic/chat/configuration/ChatConfig;", "(Lcom/ifriend/domain/logic/chat/models/ChatInfo;Lcom/ifriend/domain/logic/chat/configuration/ChatConfig;)V", "getChatConfig", "()Lcom/ifriend/domain/logic/chat/configuration/ChatConfig;", "getChatInfo", "()Lcom/ifriend/domain/logic/chat/models/ChatInfo;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatsConfiguration {
    private final ChatConfig chatConfig;
    private final ChatInfo chatInfo;

    public static /* synthetic */ ChatsConfiguration copy$default(ChatsConfiguration chatsConfiguration, ChatInfo chatInfo, ChatConfig chatConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            chatInfo = chatsConfiguration.chatInfo;
        }
        if ((i & 2) != 0) {
            chatConfig = chatsConfiguration.chatConfig;
        }
        return chatsConfiguration.copy(chatInfo, chatConfig);
    }

    public final ChatInfo component1() {
        return this.chatInfo;
    }

    public final ChatConfig component2() {
        return this.chatConfig;
    }

    public final ChatsConfiguration copy(ChatInfo chatInfo, ChatConfig chatConfig) {
        Intrinsics.checkNotNullParameter(chatInfo, "chatInfo");
        return new ChatsConfiguration(chatInfo, chatConfig);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatsConfiguration) {
            ChatsConfiguration chatsConfiguration = (ChatsConfiguration) obj;
            return Intrinsics.areEqual(this.chatInfo, chatsConfiguration.chatInfo) && Intrinsics.areEqual(this.chatConfig, chatsConfiguration.chatConfig);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.chatInfo.hashCode() * 31;
        ChatConfig chatConfig = this.chatConfig;
        return hashCode + (chatConfig == null ? 0 : chatConfig.hashCode());
    }

    public String toString() {
        ChatInfo chatInfo = this.chatInfo;
        ChatConfig chatConfig = this.chatConfig;
        return "ChatsConfiguration(chatInfo=" + chatInfo + ", chatConfig=" + chatConfig + ")";
    }

    public ChatsConfiguration(ChatInfo chatInfo, ChatConfig chatConfig) {
        Intrinsics.checkNotNullParameter(chatInfo, "chatInfo");
        this.chatInfo = chatInfo;
        this.chatConfig = chatConfig;
    }

    public final ChatInfo getChatInfo() {
        return this.chatInfo;
    }

    public final ChatConfig getChatConfig() {
        return this.chatConfig;
    }
}
