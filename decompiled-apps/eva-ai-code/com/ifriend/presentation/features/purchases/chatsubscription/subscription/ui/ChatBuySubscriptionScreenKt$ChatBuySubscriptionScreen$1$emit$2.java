package com.ifriend.presentation.features.purchases.chatsubscription.subscription.ui;

import android.app.Activity;
import com.ifriend.billing.api.logic.AppLaunchBillingFlow;
import com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel.ChatBuySubscriptionViewModel;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ChatBuySubscriptionScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.purchases.chatsubscription.subscription.ui.ChatBuySubscriptionScreenKt$ChatBuySubscriptionScreen$1$emit$2", f = "ChatBuySubscriptionScreen.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatBuySubscriptionScreenKt$ChatBuySubscriptionScreen$1$emit$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ AppLaunchBillingFlow $appLaunchBillingFlow;
    final /* synthetic */ ChatBuySubscriptionViewModel.Event $event;
    final /* synthetic */ ChatBuySubscriptionViewModel $viewModel;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatBuySubscriptionScreenKt$ChatBuySubscriptionScreen$1$emit$2(AppLaunchBillingFlow appLaunchBillingFlow, Activity activity, ChatBuySubscriptionViewModel.Event event, ChatBuySubscriptionViewModel chatBuySubscriptionViewModel, Continuation<? super ChatBuySubscriptionScreenKt$ChatBuySubscriptionScreen$1$emit$2> continuation) {
        super(2, continuation);
        this.$appLaunchBillingFlow = appLaunchBillingFlow;
        this.$activity = activity;
        this.$event = event;
        this.$viewModel = chatBuySubscriptionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatBuySubscriptionScreenKt$ChatBuySubscriptionScreen$1$emit$2(this.$appLaunchBillingFlow, this.$activity, this.$event, this.$viewModel, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatBuySubscriptionScreenKt$ChatBuySubscriptionScreen$1$emit$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object mo6781launchBillingFlow0E7RQCE;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            mo6781launchBillingFlow0E7RQCE = this.$appLaunchBillingFlow.mo6781launchBillingFlow0E7RQCE(this.$activity, ((ChatBuySubscriptionViewModel.Event.LaunchBillingFlow) this.$event).getParams(), this);
            if (mo6781launchBillingFlow0E7RQCE == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
            mo6781launchBillingFlow0E7RQCE = ((Result) obj).m7280unboximpl();
        }
        this.$viewModel.onLaunchBillingFlow(mo6781launchBillingFlow0E7RQCE);
        return Unit.INSTANCE;
    }
}
