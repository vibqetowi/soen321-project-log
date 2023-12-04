package com.ifriend.presentation.features.chat.message;

import androidx.lifecycle.ViewModel;
import com.ifriend.domain.logic.chat.messages.models.ChatMessageAccessReason;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatMessageAccessDelegate.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "throwable", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.message.ChatMessageAccessDelegateImpl$requestMessageAccess$2", f = "ChatMessageAccessDelegate.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatMessageAccessDelegateImpl$requestMessageAccess$2 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
    final /* synthetic */ ViewModel $$context_receiver_0;
    final /* synthetic */ ChatMessageAccessReason $accessActionType;
    final /* synthetic */ String $messageId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChatMessageAccessDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessageAccessDelegateImpl$requestMessageAccess$2(ChatMessageAccessDelegateImpl chatMessageAccessDelegateImpl, ViewModel viewModel, String str, ChatMessageAccessReason chatMessageAccessReason, Continuation<? super ChatMessageAccessDelegateImpl$requestMessageAccess$2> continuation) {
        super(2, continuation);
        this.this$0 = chatMessageAccessDelegateImpl;
        this.$$context_receiver_0 = viewModel;
        this.$messageId = str;
        this.$accessActionType = chatMessageAccessReason;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatMessageAccessDelegateImpl$requestMessageAccess$2 chatMessageAccessDelegateImpl$requestMessageAccess$2 = new ChatMessageAccessDelegateImpl$requestMessageAccess$2(this.this$0, this.$$context_receiver_0, this.$messageId, this.$accessActionType, continuation);
        chatMessageAccessDelegateImpl$requestMessageAccess$2.L$0 = obj;
        return chatMessageAccessDelegateImpl$requestMessageAccess$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Throwable th, Continuation<? super Unit> continuation) {
        return ((ChatMessageAccessDelegateImpl$requestMessageAccess$2) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object handleException;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ChatMessageAccessDelegateImpl chatMessageAccessDelegateImpl = this.this$0;
            ViewModel viewModel = this.$$context_receiver_0;
            String str = this.$messageId;
            ChatMessageAccessReason chatMessageAccessReason = this.$accessActionType;
            this.label = 1;
            handleException = chatMessageAccessDelegateImpl.handleException(viewModel, str, chatMessageAccessReason, (Throwable) this.L$0, this);
            if (handleException == coroutine_suspended) {
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
