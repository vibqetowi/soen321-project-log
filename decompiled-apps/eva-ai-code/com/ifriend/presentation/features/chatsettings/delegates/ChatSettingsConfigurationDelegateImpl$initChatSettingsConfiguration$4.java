package com.ifriend.presentation.features.chatsettings.delegates;

import androidx.lifecycle.ViewModelKt;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.logic.chat.subscription.ChatSubscriptionInteractor;
import com.ifriend.presentation.features.chatsettings.viewmodel.ChatSettingsViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: ChatSettingsConfigurationDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chatsettings.delegates.ChatSettingsConfigurationDelegateImpl$initChatSettingsConfiguration$4", f = "ChatSettingsConfigurationDelegate.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatSettingsConfigurationDelegateImpl$initChatSettingsConfiguration$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChatSettingsViewModel $$context_receiver_0;
    final /* synthetic */ String $chatId;
    int label;
    final /* synthetic */ ChatSettingsConfigurationDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSettingsConfigurationDelegateImpl$initChatSettingsConfiguration$4(ChatSettingsConfigurationDelegateImpl chatSettingsConfigurationDelegateImpl, String str, ChatSettingsViewModel chatSettingsViewModel, Continuation<? super ChatSettingsConfigurationDelegateImpl$initChatSettingsConfiguration$4> continuation) {
        super(2, continuation);
        this.this$0 = chatSettingsConfigurationDelegateImpl;
        this.$chatId = str;
        this.$$context_receiver_0 = chatSettingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatSettingsConfigurationDelegateImpl$initChatSettingsConfiguration$4(this.this$0, this.$chatId, this.$$context_receiver_0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatSettingsConfigurationDelegateImpl$initChatSettingsConfiguration$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChatSubscriptionInteractor chatSubscriptionInteractor;
        DispatcherProvider dispatcherProvider;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            chatSubscriptionInteractor = this.this$0.chatSubscriptionInteractor;
            this.label = 1;
            obj = chatSubscriptionInteractor.getChatSubscriptionStateFlow(this.$chatId, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        dispatcherProvider = this.this$0.dispatcherProvider;
        Flow flowOn = FlowKt.flowOn((Flow) obj, dispatcherProvider.background());
        BuildersKt.launch(ViewModelKt.getViewModelScope(this.$$context_receiver_0), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new ChatSettingsConfigurationDelegateImpl$initChatSettingsConfiguration$4$invokeSuspend$$inlined$collectIn$default$1(flowOn, null, this.this$0, this.$$context_receiver_0));
        return Unit.INSTANCE;
    }
}
