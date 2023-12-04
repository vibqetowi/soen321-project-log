package com.ifriend.presentation.features.chat.message;

import androidx.lifecycle.ViewModel;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.ifriend.domain.logic.chat.messages.ChatMessageAccessInteractor;
import com.ifriend.domain.logic.chat.messages.models.ChatMessageAccessReason;
import com.ifriend.domain.logic.chat.messages.models.ChatMessageAccessState;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
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
/* compiled from: ChatMessageAccessDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.message.ChatMessageAccessDelegateImpl$requestMessageAccess$3", f = "ChatMessageAccessDelegate.kt", i = {}, l = {TsExtractor.TS_STREAM_TYPE_DVBSUBS, 91, 96, 102}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatMessageAccessDelegateImpl$requestMessageAccess$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ViewModel $$context_receiver_0;
    final /* synthetic */ ChatMessageAccessReason $accessActionType;
    final /* synthetic */ String $messageId;
    int label;
    final /* synthetic */ ChatMessageAccessDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessageAccessDelegateImpl$requestMessageAccess$3(ChatMessageAccessDelegateImpl chatMessageAccessDelegateImpl, ViewModel viewModel, String str, ChatMessageAccessReason chatMessageAccessReason, Continuation<? super ChatMessageAccessDelegateImpl$requestMessageAccess$3> continuation) {
        super(2, continuation);
        this.this$0 = chatMessageAccessDelegateImpl;
        this.$$context_receiver_0 = viewModel;
        this.$messageId = str;
        this.$accessActionType = chatMessageAccessReason;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatMessageAccessDelegateImpl$requestMessageAccess$3(this.this$0, this.$$context_receiver_0, this.$messageId, this.$accessActionType, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatMessageAccessDelegateImpl$requestMessageAccess$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object showLoading;
        String str;
        ChatMessageAccessInteractor chatMessageAccessInteractor;
        String str2;
        Object handleAccessState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            showLoading = this.this$0.showLoading(this.$$context_receiver_0, this);
            if (showLoading == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ChatMessageAccessDelegateImpl chatMessageAccessDelegateImpl = this.this$0;
                this.label = 4;
                handleAccessState = chatMessageAccessDelegateImpl.handleAccessState((ChatMessageAccessState) obj, this);
                if (handleAccessState == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            chatMessageAccessInteractor = this.this$0.chatMessageAccessInteractor;
            str2 = this.this$0.chatId;
            this.label = 3;
            obj = chatMessageAccessInteractor.requestMessageAccess(str2, (ChatMessage) obj, (r16 & 4) != 0 ? false : false, (r16 & 8) != 0 ? false : false, this.$accessActionType, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ChatMessageAccessDelegateImpl chatMessageAccessDelegateImpl2 = this.this$0;
            this.label = 4;
            handleAccessState = chatMessageAccessDelegateImpl2.handleAccessState((ChatMessageAccessState) obj, this);
            if (handleAccessState == coroutine_suspended) {
            }
            return Unit.INSTANCE;
        } else {
            ResultKt.throwOnFailure(obj);
        }
        str = this.this$0.chatId;
        this.label = 2;
        obj = this.this$0.getChatMessage(this.$messageId, str, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        chatMessageAccessInteractor = this.this$0.chatMessageAccessInteractor;
        str2 = this.this$0.chatId;
        this.label = 3;
        obj = chatMessageAccessInteractor.requestMessageAccess(str2, (ChatMessage) obj, (r16 & 4) != 0 ? false : false, (r16 & 8) != 0 ? false : false, this.$accessActionType, this);
        if (obj == coroutine_suspended) {
        }
        ChatMessageAccessDelegateImpl chatMessageAccessDelegateImpl22 = this.this$0;
        this.label = 4;
        handleAccessState = chatMessageAccessDelegateImpl22.handleAccessState((ChatMessageAccessState) obj, this);
        if (handleAccessState == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }
}
