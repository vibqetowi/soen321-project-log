package com.ifriend.domain.logic.chat.regenerate;

import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.newChat.chat.systems.events.regeneration.MessageRegeneratingEvent;
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
/* compiled from: RegenerateChatMessageUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.domain.logic.chat.regenerate.RegenerateChatMessageUseCase$execute$result$2$1", f = "RegenerateChatMessageUseCase.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class RegenerateChatMessageUseCase$execute$result$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chatId;
    final /* synthetic */ String $messageId;
    int label;
    final /* synthetic */ RegenerateChatMessageUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegenerateChatMessageUseCase$execute$result$2$1(RegenerateChatMessageUseCase regenerateChatMessageUseCase, String str, String str2, Continuation<? super RegenerateChatMessageUseCase$execute$result$2$1> continuation) {
        super(2, continuation);
        this.this$0 = regenerateChatMessageUseCase;
        this.$chatId = str;
        this.$messageId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RegenerateChatMessageUseCase$execute$result$2$1(this.this$0, this.$chatId, this.$messageId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RegenerateChatMessageUseCase$execute$result$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChatClientInteractor chatClientInteractor;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            chatClientInteractor = this.this$0.chatClientInteractor;
            this.label = 1;
            if (chatClientInteractor.handleEvent(this.$chatId, new MessageRegeneratingEvent(this.$messageId, false), this) == coroutine_suspended) {
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
