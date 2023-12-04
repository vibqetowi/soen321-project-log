package com.ifriend.presentation.features.app.delegates;

import com.ifriend.chat.domain.billing.ShowRateAppAfterPurchaseUseCase;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.data.purchases.BillingPurchasesHistory;
import com.ifriend.domain.logic.purchase.PurchaseType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BillingEventDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.app.delegates.BillingEventDelegateImpl$purchaseCompleted$1", f = "BillingEventDelegate.kt", i = {}, l = {175, 179}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class BillingEventDelegateImpl$purchaseCompleted$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PurchaseType $type;
    int label;
    final /* synthetic */ BillingEventDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingEventDelegateImpl$purchaseCompleted$1(BillingEventDelegateImpl billingEventDelegateImpl, PurchaseType purchaseType, Continuation<? super BillingEventDelegateImpl$purchaseCompleted$1> continuation) {
        super(2, continuation);
        this.this$0 = billingEventDelegateImpl;
        this.$type = purchaseType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BillingEventDelegateImpl$purchaseCompleted$1(this.this$0, this.$type, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BillingEventDelegateImpl$purchaseCompleted$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BillingEventDelegate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.app.delegates.BillingEventDelegateImpl$purchaseCompleted$1$1", f = "BillingEventDelegate.kt", i = {}, l = {176, 177}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.app.delegates.BillingEventDelegateImpl$purchaseCompleted$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PurchaseType $type;
        int label;
        final /* synthetic */ BillingEventDelegateImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BillingEventDelegateImpl billingEventDelegateImpl, PurchaseType purchaseType, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = billingEventDelegateImpl;
            this.$type = purchaseType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$type, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            BillingPurchasesHistory billingPurchasesHistory;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                billingPurchasesHistory = this.this$0.userProfileRepository;
                this.label = 1;
                if (billingPurchasesHistory.savePurchase(this.$type, this) == coroutine_suspended) {
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
            this.label = 2;
            if (DelayKt.delay(2000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DispatcherProvider dispatcherProvider;
        ShowRateAppAfterPurchaseUseCase showRateAppAfterPurchaseUseCase;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            dispatcherProvider = this.this$0.dispatcherProvider;
            this.label = 1;
            if (BuildersKt.withContext(dispatcherProvider.background(), new AnonymousClass1(this.this$0, this.$type, null), this) == coroutine_suspended) {
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
        showRateAppAfterPurchaseUseCase = this.this$0.showRateAppAfterPurchaseUseCase;
        this.label = 2;
        if (showRateAppAfterPurchaseUseCase.showIfNeed(this.$type, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
