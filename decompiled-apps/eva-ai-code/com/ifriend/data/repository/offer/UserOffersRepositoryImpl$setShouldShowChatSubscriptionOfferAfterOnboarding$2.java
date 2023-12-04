package com.ifriend.data.repository.offer;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.ifriend.data.storages.common.DataStorePreferenceDelegateImpl;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: UserOffersRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.offer.UserOffersRepositoryImpl$setShouldShowChatSubscriptionOfferAfterOnboarding$2", f = "UserOffersRepositoryImpl.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class UserOffersRepositoryImpl$setShouldShowChatSubscriptionOfferAfterOnboarding$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $shouldShow;
    int label;
    final /* synthetic */ UserOffersRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserOffersRepositoryImpl$setShouldShowChatSubscriptionOfferAfterOnboarding$2(UserOffersRepositoryImpl userOffersRepositoryImpl, boolean z, Continuation<? super UserOffersRepositoryImpl$setShouldShowChatSubscriptionOfferAfterOnboarding$2> continuation) {
        super(2, continuation);
        this.this$0 = userOffersRepositoryImpl;
        this.$shouldShow = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserOffersRepositoryImpl$setShouldShowChatSubscriptionOfferAfterOnboarding$2(this.this$0, this.$shouldShow, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UserOffersRepositoryImpl$setShouldShowChatSubscriptionOfferAfterOnboarding$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DataStorePreferenceDelegateImpl shouldShowChatSubscriptionOfferAfterOnboardingDelegate;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            shouldShowChatSubscriptionOfferAfterOnboardingDelegate = this.this$0.getShouldShowChatSubscriptionOfferAfterOnboardingDelegate();
            this.label = 1;
            if (shouldShowChatSubscriptionOfferAfterOnboardingDelegate.set(Boxing.boxBoolean(this.$shouldShow), this) == coroutine_suspended) {
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
