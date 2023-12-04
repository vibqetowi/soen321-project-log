package com.ifriend.presentation.features.chatsettings.delegates;

import androidx.exifinterface.media.ExifInterface;
import com.ifriend.domain.logic.chat.subscription.ChatSubscriptionState;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.chatsettings.viewmodel.ChatSettingsViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: flow.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¨\u0006\u0003"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "com/ifriend/common_utils/extensions/FlowKt$collectIn$1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chatsettings.delegates.ChatSettingsConfigurationDelegateImpl$initChatSettingsConfiguration$4$invokeSuspend$$inlined$collectIn$default$1", f = "ChatSettingsConfigurationDelegate.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatSettingsConfigurationDelegateImpl$initChatSettingsConfiguration$4$invokeSuspend$$inlined$collectIn$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChatSettingsViewModel $$context_receiver_0$inlined;
    final /* synthetic */ Flow $this_collectIn;
    int label;
    final /* synthetic */ ChatSettingsConfigurationDelegateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSettingsConfigurationDelegateImpl$initChatSettingsConfiguration$4$invokeSuspend$$inlined$collectIn$default$1(Flow flow, Continuation continuation, ChatSettingsConfigurationDelegateImpl chatSettingsConfigurationDelegateImpl, ChatSettingsViewModel chatSettingsViewModel) {
        super(2, continuation);
        this.$this_collectIn = flow;
        this.this$0 = chatSettingsConfigurationDelegateImpl;
        this.$$context_receiver_0$inlined = chatSettingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatSettingsConfigurationDelegateImpl$initChatSettingsConfiguration$4$invokeSuspend$$inlined$collectIn$default$1(this.$this_collectIn, continuation, this.this$0, this.$$context_receiver_0$inlined);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatSettingsConfigurationDelegateImpl$initChatSettingsConfiguration$4$invokeSuspend$$inlined$collectIn$default$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flow = this.$this_collectIn;
            final ChatSettingsConfigurationDelegateImpl chatSettingsConfigurationDelegateImpl = this.this$0;
            final ChatSettingsViewModel chatSettingsViewModel = this.$$context_receiver_0$inlined;
            this.label = 1;
            if (flow.collect(new FlowCollector() { // from class: com.ifriend.presentation.features.chatsettings.delegates.ChatSettingsConfigurationDelegateImpl$initChatSettingsConfiguration$4$invokeSuspend$$inlined$collectIn$default$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(T t, Continuation<? super Unit> continuation) {
                    String subscriptionStatusLabel;
                    boolean isShowSubscriptionState;
                    ChatSubscriptionState chatSubscriptionState = (ChatSubscriptionState) t;
                    subscriptionStatusLabel = ChatSettingsConfigurationDelegateImpl.this.getSubscriptionStatusLabel(chatSubscriptionState);
                    isShowSubscriptionState = ChatSettingsConfigurationDelegateImpl.this.isShowSubscriptionState(chatSubscriptionState);
                    UiStateDelegate<ChatSettingsViewModel.UiState, Object> uiStateDelegate = chatSettingsViewModel;
                    Object updateUiState = uiStateDelegate.updateUiState(uiStateDelegate, new ChatSettingsConfigurationDelegateImpl$initChatSettingsConfiguration$4$1$1(subscriptionStatusLabel, isShowSubscriptionState), continuation);
                    return updateUiState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateUiState : Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
