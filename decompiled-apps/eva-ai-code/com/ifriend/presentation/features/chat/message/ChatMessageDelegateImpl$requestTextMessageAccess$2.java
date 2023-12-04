package com.ifriend.presentation.features.chat.message;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModel;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.logic.chat.messages.models.ChatMessageAccessReason;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.newChat.chat.models.MessageInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ChatMessageDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.message.ChatMessageDelegateImpl$requestTextMessageAccess$2", f = "ChatMessageDelegate.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX, 57, 64, 70}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatMessageDelegateImpl$requestTextMessageAccess$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ViewModel $$context_receiver_0;
    final /* synthetic */ String $messageId;
    int label;
    final /* synthetic */ ChatMessageDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessageDelegateImpl$requestTextMessageAccess$2(ChatMessageDelegateImpl chatMessageDelegateImpl, String str, ViewModel viewModel, Continuation<? super ChatMessageDelegateImpl$requestTextMessageAccess$2> continuation) {
        super(2, continuation);
        this.this$0 = chatMessageDelegateImpl;
        this.$messageId = str;
        this.$$context_receiver_0 = viewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatMessageDelegateImpl$requestTextMessageAccess$2(this.this$0, this.$messageId, this.$$context_receiver_0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatMessageDelegateImpl$requestTextMessageAccess$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChatClientInteractor chatClientInteractor;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            chatClientInteractor = this.this$0.chatClientInteractor;
            str = this.this$0.chatId;
            this.label = 1;
            obj = chatClientInteractor.getChatMessage(str, this.$messageId, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2 || i == 3 || i == 4) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        if (obj == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        MessageInfo info = ((ChatMessage) obj).getInfo();
        if (info.isSexting()) {
            this.label = 2;
            if (this.this$0.requestMessageAccess(this.$$context_receiver_0, this.$messageId, ChatMessageAccessReason.TextMessage.BuySextingMessage.INSTANCE, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (!StringsKt.isBlank(info.getRegenerate().getOldMessageId())) {
            this.label = 3;
            if (this.this$0.requestMessageAccess(this.$$context_receiver_0, this.$messageId, ChatMessageAccessReason.TextMessage.BuyRegeneratingAnswer.INSTANCE, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            this.label = 4;
            if (this.this$0.requestMessageAccess(this.$$context_receiver_0, this.$messageId, ChatMessageAccessReason.TextMessage.BuyMessage.INSTANCE, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
