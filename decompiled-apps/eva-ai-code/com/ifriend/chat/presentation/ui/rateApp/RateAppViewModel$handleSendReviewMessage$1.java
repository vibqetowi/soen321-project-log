package com.ifriend.chat.presentation.ui.rateApp;

import com.ifriend.chat.presentation.ui.rateApp.RateAppState;
import com.ifriend.domain.data.RateUsRepository;
import com.ifriend.domain.socket.notifications.ReviewSentNotification;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
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
/* compiled from: RateAppViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.rateApp.RateAppViewModel$handleSendReviewMessage$1", f = "RateAppViewModel.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class RateAppViewModel$handleSendReviewMessage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ RateAppState $currentState;
    int label;
    final /* synthetic */ RateAppViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RateAppViewModel$handleSendReviewMessage$1(RateAppViewModel rateAppViewModel, RateAppState rateAppState, Continuation<? super RateAppViewModel$handleSendReviewMessage$1> continuation) {
        super(2, continuation);
        this.this$0 = rateAppViewModel;
        this.$currentState = rateAppState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RateAppViewModel$handleSendReviewMessage$1(this.this$0, this.$currentState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RateAppViewModel$handleSendReviewMessage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RateUsRepository rateUsRepository;
        InternalNotificationHandler internalNotificationHandler;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            rateUsRepository = this.this$0.rateUsRepository;
            this.label = 1;
            obj = rateUsRepository.review(((RateAppState.ReviewState) this.$currentState).getReview(), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            internalNotificationHandler = this.this$0.internalNotificationHandler;
            internalNotificationHandler.handle(ReviewSentNotification.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}
