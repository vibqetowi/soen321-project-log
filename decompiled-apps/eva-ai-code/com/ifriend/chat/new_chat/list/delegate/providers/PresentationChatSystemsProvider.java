package com.ifriend.chat.new_chat.list.delegate.providers;

import com.ifriend.chat.new_chat.list.presentationSystems.levels.ExperienceMessageAnalyticsSystem;
import com.ifriend.core.tools.api.AppIdentityConverter;
import com.ifriend.domain.socket.MessagesSource;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: PresentationChatSystemsProvider.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ifriend/chat/new_chat/list/delegate/providers/PresentationChatSystemsProvider;", "", "messagesSource", "Lcom/ifriend/domain/socket/MessagesSource;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "appIdentityConverter", "Lcom/ifriend/core/tools/api/AppIdentityConverter;", "(Lcom/ifriend/domain/socket/MessagesSource;Lkotlinx/coroutines/CoroutineScope;Lcom/ifriend/core/tools/api/AppIdentityConverter;)V", "getExperienceMessageAnalyticsSystem", "Lcom/ifriend/chat/new_chat/list/presentationSystems/levels/ExperienceMessageAnalyticsSystem;", "chatId", "", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PresentationChatSystemsProvider {
    public static final int $stable = 8;
    private final AppIdentityConverter appIdentityConverter;
    private final CoroutineScope coroutineScope;
    private final MessagesSource messagesSource;

    @Inject
    public PresentationChatSystemsProvider(MessagesSource messagesSource, CoroutineScope coroutineScope, AppIdentityConverter appIdentityConverter) {
        Intrinsics.checkNotNullParameter(messagesSource, "messagesSource");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(appIdentityConverter, "appIdentityConverter");
        this.messagesSource = messagesSource;
        this.coroutineScope = coroutineScope;
        this.appIdentityConverter = appIdentityConverter;
    }

    public final ExperienceMessageAnalyticsSystem getExperienceMessageAnalyticsSystem(String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        return new ExperienceMessageAnalyticsSystem(this.messagesSource, this.coroutineScope, chatId, this.appIdentityConverter);
    }
}
