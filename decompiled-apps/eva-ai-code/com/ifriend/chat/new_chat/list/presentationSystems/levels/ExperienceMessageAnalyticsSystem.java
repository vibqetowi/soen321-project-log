package com.ifriend.chat.new_chat.list.presentationSystems.levels;

import com.ifriend.common_entities_engine.CoroutineScopeSystem;
import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.core.tools.api.AppIdentityConverter;
import com.ifriend.domain.socket.MessagesSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ExperienceMessageAnalyticsSystem.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ifriend/chat/new_chat/list/presentationSystems/levels/ExperienceMessageAnalyticsSystem;", "Lcom/ifriend/common_entities_engine/CoroutineScopeSystem;", "Lcom/ifriend/common_entities_engine/EntitiesState;", "messagesSource", "Lcom/ifriend/domain/socket/MessagesSource;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "chatId", "", "appIdentityConverter", "Lcom/ifriend/core/tools/api/AppIdentityConverter;", "(Lcom/ifriend/domain/socket/MessagesSource;Lkotlinx/coroutines/CoroutineScope;Ljava/lang/String;Lcom/ifriend/core/tools/api/AppIdentityConverter;)V", "onStart", "", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExperienceMessageAnalyticsSystem extends CoroutineScopeSystem<EntitiesState> {
    public static final int $stable = 8;
    private final AppIdentityConverter appIdentityConverter;
    private final String chatId;
    private final MessagesSource messagesSource;

    public static final /* synthetic */ EntitiesState access$currentState(ExperienceMessageAnalyticsSystem experienceMessageAnalyticsSystem) {
        return (EntitiesState) experienceMessageAnalyticsSystem.currentState();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExperienceMessageAnalyticsSystem(MessagesSource messagesSource, CoroutineScope coroutineScope, String chatId, AppIdentityConverter appIdentityConverter) {
        super(coroutineScope);
        Intrinsics.checkNotNullParameter(messagesSource, "messagesSource");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(appIdentityConverter, "appIdentityConverter");
        this.messagesSource = messagesSource;
        this.chatId = chatId;
        this.appIdentityConverter = appIdentityConverter;
    }

    @Override // com.ifriend.common_entities_engine.System
    public void onStart() {
        super.onStart();
        BuildersKt.launch$default(this, null, null, new ExperienceMessageAnalyticsSystem$onStart$1(this, null), 3, null);
    }
}
