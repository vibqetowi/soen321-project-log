package com.ifriend.presentation.features.chat.regeneration;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModel;
import com.ifriend.domain.exceptions.features.common.InsufficientBalanceException;
import com.ifriend.domain.logic.chat.regenerate.RegenerateChatMessageUseCase;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
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
/* compiled from: MessageRegenerationDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.regeneration.MessageRegenerationDelegateImpl$regenerateMessage$1", f = "MessageRegenerationDelegate.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF, 59}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class MessageRegenerationDelegateImpl$regenerateMessage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ViewModel $$context_receiver_0;
    final /* synthetic */ String $chatId;
    final /* synthetic */ String $messageId;
    int label;
    final /* synthetic */ MessageRegenerationDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageRegenerationDelegateImpl$regenerateMessage$1(MessageRegenerationDelegateImpl messageRegenerationDelegateImpl, String str, String str2, ViewModel viewModel, Continuation<? super MessageRegenerationDelegateImpl$regenerateMessage$1> continuation) {
        super(2, continuation);
        this.this$0 = messageRegenerationDelegateImpl;
        this.$chatId = str;
        this.$messageId = str2;
        this.$$context_receiver_0 = viewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessageRegenerationDelegateImpl$regenerateMessage$1(this.this$0, this.$chatId, this.$messageId, this.$$context_receiver_0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageRegenerationDelegateImpl$regenerateMessage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowObserverEmitter flowObserverEmitter;
        RegenerateChatMessageUseCase regenerateChatMessageUseCase;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (InsufficientBalanceException unused) {
            this.this$0.handleRegenerationInsufficientBalance(this.$$context_receiver_0, this.$chatId, this.$messageId);
        } catch (Throwable th) {
            flowObserverEmitter = this.this$0.exceptionsEmitter;
            this.label = 2;
            if (flowObserverEmitter.emit(th, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            regenerateChatMessageUseCase = this.this$0.regenerateChatMessageUseCase;
            this.label = 1;
            if (regenerateChatMessageUseCase.execute(this.$chatId, this.$messageId, this) == coroutine_suspended) {
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
        return Unit.INSTANCE;
    }
}
