package com.ifriend.presentation.features.chat.panel.delegate;

import com.ifriend.domain.logic.topics.ChatPanelActionsInteractor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatPanelActionsDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.panel.delegate.ChatPanelActionsDelegateImpl$refreshActions$2", f = "ChatPanelActionsDelegate.kt", i = {}, l = {165}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatPanelActionsDelegateImpl$refreshActions$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chatId;
    int label;
    final /* synthetic */ ChatPanelActionsDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatPanelActionsDelegateImpl$refreshActions$2(ChatPanelActionsDelegateImpl chatPanelActionsDelegateImpl, String str, Continuation<? super ChatPanelActionsDelegateImpl$refreshActions$2> continuation) {
        super(2, continuation);
        this.this$0 = chatPanelActionsDelegateImpl;
        this.$chatId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatPanelActionsDelegateImpl$refreshActions$2(this.this$0, this.$chatId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatPanelActionsDelegateImpl$refreshActions$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChatPanelActionsInteractor chatPanelActionsInteractor;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            chatPanelActionsInteractor = this.this$0.chatPanelActionsInteractor;
            this.label = 1;
            if (chatPanelActionsInteractor.refreshActions(this.$chatId, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
