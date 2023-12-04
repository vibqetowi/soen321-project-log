package com.ifriend.presentation.features.profile.actions;

import com.ifriend.domain.notifications.AvatarGenerated;
import com.ifriend.domain.notifications.LongTermNotification;
import com.ifriend.domain.useCases.bot.BotHaveUpdateUseCase;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel;
import java.util.SortedSet;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatProfileActionDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.profile.actions.ChatProfileActionDelegateImpl$navigateToBotProfile$1", f = "ChatProfileActionDelegate.kt", i = {}, l = {74, 75}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatProfileActionDelegateImpl$navigateToBotProfile$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChatViewModel $$context_receiver_0;
    int label;
    final /* synthetic */ ChatProfileActionDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatProfileActionDelegateImpl$navigateToBotProfile$1(ChatProfileActionDelegateImpl chatProfileActionDelegateImpl, ChatViewModel chatViewModel, Continuation<? super ChatProfileActionDelegateImpl$navigateToBotProfile$1> continuation) {
        super(2, continuation);
        this.this$0 = chatProfileActionDelegateImpl;
        this.$$context_receiver_0 = chatViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatProfileActionDelegateImpl$navigateToBotProfile$1(this.this$0, this.$$context_receiver_0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatProfileActionDelegateImpl$navigateToBotProfile$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BotHaveUpdateUseCase botHaveUpdateUseCase;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            botHaveUpdateUseCase = this.this$0.botHaveUpdateUseCase;
            this.label = 1;
            obj = FlowKt.firstOrNull(botHaveUpdateUseCase.notificationsFlow(), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        SortedSet sortedSet = (SortedSet) obj;
        UiStateDelegate<ChatViewModel.UiState, ChatViewModel.Event> uiStateDelegate = this.$$context_receiver_0;
        UiStateDelegate<ChatViewModel.UiState, ChatViewModel.Event> uiStateDelegate2 = uiStateDelegate;
        ChatViewModel.Event.OpenBotProfile openBotProfile = (sortedSet != null ? (LongTermNotification) CollectionsKt.lastOrNull(sortedSet) : null) instanceof AvatarGenerated ? ChatViewModel.Event.OpenSelectGeneratedAvatar.INSTANCE : ChatViewModel.Event.OpenBotProfile.INSTANCE;
        this.label = 2;
        if (uiStateDelegate.sendEvent2(uiStateDelegate2, openBotProfile, (Continuation<? super Unit>) this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
