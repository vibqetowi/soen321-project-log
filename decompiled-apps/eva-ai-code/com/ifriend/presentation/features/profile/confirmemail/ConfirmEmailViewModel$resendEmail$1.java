package com.ifriend.presentation.features.profile.confirmemail;

import com.ifriend.domain.data.authorization.confirmEmail.SendConfirmationEmailUseCase;
import com.ifriend.domain.storage.DelayedEvent;
import com.ifriend.domain.storage.DelayedEventType;
import com.ifriend.domain.storage.EventDelayStorage;
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
/* compiled from: ConfirmEmailViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.profile.confirmemail.ConfirmEmailViewModel$resendEmail$1", f = "ConfirmEmailViewModel.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ConfirmEmailViewModel$resendEmail$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ConfirmEmailViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmEmailViewModel$resendEmail$1(ConfirmEmailViewModel confirmEmailViewModel, Continuation<? super ConfirmEmailViewModel$resendEmail$1> continuation) {
        super(2, continuation);
        this.this$0 = confirmEmailViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConfirmEmailViewModel$resendEmail$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConfirmEmailViewModel$resendEmail$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        EventDelayStorage eventDelayStorage;
        long calculateDelayUntil;
        SendConfirmationEmailUseCase sendConfirmationEmailUseCase;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            eventDelayStorage = this.this$0.eventDelayStorage;
            DelayedEventType delayedEventType = DelayedEventType.RE_SEND_EMAIL_CONFIRMATION;
            calculateDelayUntil = this.this$0.calculateDelayUntil();
            eventDelayStorage.addEventDelay(new DelayedEvent(delayedEventType, calculateDelayUntil));
            sendConfirmationEmailUseCase = this.this$0.sendConfirmationEmailUseCase;
            this.label = 1;
            if (SendConfirmationEmailUseCase.invoke$default(sendConfirmationEmailUseCase, null, this, 1, null) == coroutine_suspended) {
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
