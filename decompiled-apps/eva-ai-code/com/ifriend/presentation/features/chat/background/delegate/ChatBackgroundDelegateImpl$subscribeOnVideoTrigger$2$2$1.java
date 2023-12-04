package com.ifriend.presentation.features.chat.background.delegate;

import com.ifriend.domain.logic.chat.ChatBackgroundTrigger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
/* compiled from: ChatBackgroundDelegate.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "Lcom/ifriend/presentation/features/chat/background/delegate/ChatBackground;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.background.delegate.ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$2$2$1", f = "ChatBackgroundDelegate.kt", i = {}, l = {140}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$2$2$1 extends SuspendLambda implements Function2<String, Continuation<? super ChatBackground>, Object> {
    final /* synthetic */ String $chatId;
    int label;
    final /* synthetic */ ChatBackgroundDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$2$2$1(ChatBackgroundDelegateImpl chatBackgroundDelegateImpl, String str, Continuation<? super ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$2$2$1> continuation) {
        super(2, continuation);
        this.this$0 = chatBackgroundDelegateImpl;
        this.$chatId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$2$2$1(this.this$0, this.$chatId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super ChatBackground> continuation) {
        return ((ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$2$2$1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.this$0.getTriggerVideoBackground(this.$chatId, ChatBackgroundTrigger.DIARY, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
