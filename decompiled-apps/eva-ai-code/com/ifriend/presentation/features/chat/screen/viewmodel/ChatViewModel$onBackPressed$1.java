package com.ifriend.presentation.features.chat.screen.viewmodel;

import com.ifriend.domain.logic.chat.models.ChatsState;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel$onBackPressed$1", f = "ChatViewModel.kt", i = {}, l = {298, 300}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatViewModel$onBackPressed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ChatViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$onBackPressed$1(ChatViewModel chatViewModel, Continuation<? super ChatViewModel$onBackPressed$1> continuation) {
        super(2, continuation);
        this.this$0 = chatViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatViewModel$onBackPressed$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatViewModel$onBackPressed$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.this$0.chatsInfoInteractor.getChatsState(this);
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
        ChatsState chatsState = (ChatsState) obj;
        if (Intrinsics.areEqual(chatsState, ChatsState.ChatListChats.INSTANCE)) {
            this.this$0.onBackClick();
        } else if (Intrinsics.areEqual(chatsState, ChatsState.SingleChat.INSTANCE)) {
            UiStateDelegate<ChatViewModel.UiState, ChatViewModel.Event> uiStateDelegate = this.this$0;
            this.label = 2;
            if (uiStateDelegate.sendEvent2(uiStateDelegate, (ChatViewModel.Event) ChatViewModel.Event.NavigateCloseApp.INSTANCE, (Continuation<? super Unit>) this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
