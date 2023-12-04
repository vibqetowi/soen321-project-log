package com.ifriend.chat.new_chat.di;

import com.ifriend.base.di.Feature;
import com.ifriend.presentation.common.observers.FlowObserver;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.features.chat.common.ChatEvents;
import com.ifriend.presentation.features.chat.common.ChatEventsObserver;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatEventsObserverModule.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0003\u001a\u0011\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004j\u0002`\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u001f\u0010\n\u001a\u0011\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u000bj\u0002`\f2\u0006\u0010\b\u001a\u00020\tH\u0007J\b\u0010\r\u001a\u00020\tH\u0007¨\u0006\u000e"}, d2 = {"Lcom/ifriend/chat/new_chat/di/ChatEventsObserverModule;", "", "()V", "provideChatEventsEmitter", "Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;", "Lcom/ifriend/presentation/features/chat/common/ChatEvents;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/ifriend/presentation/features/chat/common/ChatEventsEmitter;", "observer", "Lcom/ifriend/presentation/features/chat/common/ChatEventsObserver;", "provideChatEventsFlow", "Lcom/ifriend/presentation/common/observers/FlowObserver;", "Lcom/ifriend/presentation/features/chat/common/ChatEventsFlow;", "provideChatEventsObserver", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public final class ChatEventsObserverModule {
    public static final int $stable = 0;

    @Provides
    @Feature
    public final ChatEventsObserver provideChatEventsObserver() {
        return new ChatEventsObserver();
    }

    @Provides
    @Feature
    public final FlowObserver<ChatEvents> provideChatEventsFlow(ChatEventsObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        return observer;
    }

    @Provides
    @Feature
    public final FlowObserverEmitter<ChatEvents> provideChatEventsEmitter(ChatEventsObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        return observer;
    }
}
