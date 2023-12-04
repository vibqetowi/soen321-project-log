package com.ifriend.presentation.features.chat.background.delegate;

import com.facebook.share.internal.ShareConstants;
import com.ifriend.domain.logic.chat.ChatBackgroundTrigger;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.newChat.chat.models.ChatMessageKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
/* compiled from: ChatBackgroundDelegate.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/domain/newChat/chat/models/ChatMessage;", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "Lcom/ifriend/presentation/features/chat/background/delegate/ChatBackground;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.background.delegate.ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$1$2$1", f = "ChatBackgroundDelegate.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$1$2$1 extends SuspendLambda implements Function2<ChatMessage, Continuation<? super ChatBackground>, Object> {
    final /* synthetic */ String $chatId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChatBackgroundDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$1$2$1(ChatBackgroundDelegateImpl chatBackgroundDelegateImpl, String str, Continuation<? super ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$1$2$1> continuation) {
        super(2, continuation);
        this.this$0 = chatBackgroundDelegateImpl;
        this.$chatId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$1$2$1 chatBackgroundDelegateImpl$subscribeOnVideoTrigger$1$2$1 = new ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$1$2$1(this.this$0, this.$chatId, continuation);
        chatBackgroundDelegateImpl$subscribeOnVideoTrigger$1$2$1.L$0 = obj;
        return chatBackgroundDelegateImpl$subscribeOnVideoTrigger$1$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ChatMessage chatMessage, Continuation<? super ChatBackground> continuation) {
        return ((ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$1$2$1) create(chatMessage, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ChatMessage chatMessage = (ChatMessage) this.L$0;
            if (!chatMessage.getInfo().isSexting() || !ChatMessageKt.isFromUser(chatMessage)) {
                return null;
            }
            this.label = 1;
            obj = this.this$0.getTriggerVideoBackground(this.$chatId, ChatBackgroundTrigger.SEXTING, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return (ChatBackground) obj;
    }
}
