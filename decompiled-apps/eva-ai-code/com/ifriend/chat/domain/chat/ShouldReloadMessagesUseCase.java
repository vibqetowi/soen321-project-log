package com.ifriend.chat.domain.chat;

import com.ifriend.domain.socket.MessagesSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ShouldReloadMessagesUseCase.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0006H\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ifriend/chat/domain/chat/ShouldReloadMessagesUseCase;", "", "messagesSource", "Lcom/ifriend/domain/socket/MessagesSource;", "(Lcom/ifriend/domain/socket/MessagesSource;)V", "invoke", "", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShouldReloadMessagesUseCase {
    private final MessagesSource messagesSource;

    public ShouldReloadMessagesUseCase(MessagesSource messagesSource) {
        Intrinsics.checkNotNullParameter(messagesSource, "messagesSource");
        this.messagesSource = messagesSource;
    }

    public final boolean invoke() {
        long lastSync = this.messagesSource.getLastSync();
        if (lastSync == 0) {
            return false;
        }
        return System.currentTimeMillis() > lastSync + 270000;
    }
}
