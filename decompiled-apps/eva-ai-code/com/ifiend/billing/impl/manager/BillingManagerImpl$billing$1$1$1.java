package com.ifiend.billing.impl.manager;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.billingclient.api.BillingResult;
import com.ifiend.billing.impl.events.BillingClientEvents;
import com.ifiend.billing.impl.manager.PurchasesUpdatedState;
import com.ifriend.logger.api.events.LoggerLevel;
import com.ifriend.logger.api.events.PurchaseEvent;
import com.ifriend.logger.api.logic.AppLoggerInteractor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BillingManagerImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "throwable", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifiend.billing.impl.manager.BillingManagerImpl$billing$1$1$1", f = "BillingManagerImpl.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class BillingManagerImpl$billing$1$1$1 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
    final /* synthetic */ BillingResult $billingResult;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BillingManagerImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingManagerImpl$billing$1$1$1(BillingManagerImpl billingManagerImpl, BillingResult billingResult, Continuation<? super BillingManagerImpl$billing$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = billingManagerImpl;
        this.$billingResult = billingResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BillingManagerImpl$billing$1$1$1 billingManagerImpl$billing$1$1$1 = new BillingManagerImpl$billing$1$1$1(this.this$0, this.$billingResult, continuation);
        billingManagerImpl$billing$1$1$1.L$0 = obj;
        return billingManagerImpl$billing$1$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Throwable th, Continuation<? super Unit> continuation) {
        return ((BillingManagerImpl$billing$1$1$1) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (AppLoggerInteractor.DefaultImpls.logEvent$default(this.this$0, new PurchaseEvent(BillingClientEvents.BillingError.INSTANCE.getEventName(), LoggerLevel.ERROR, MapsKt.mapOf(TuplesKt.to(BillingManagerImpl.ERROR_MESSAGE_KEY, ((Throwable) this.L$0).toString())), "BillingClient"), false, this, 2, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        BuildersKt__Builders_commonKt.launch$default(this.this$0, null, null, new AnonymousClass1(this.this$0, this.$billingResult, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BillingManagerImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifiend.billing.impl.manager.BillingManagerImpl$billing$1$1$1$1", f = "BillingManagerImpl.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifiend.billing.impl.manager.BillingManagerImpl$billing$1$1$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ BillingResult $billingResult;
        int label;
        final /* synthetic */ BillingManagerImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BillingManagerImpl billingManagerImpl, BillingResult billingResult, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = billingManagerImpl;
            this.$billingResult = billingResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$billingResult, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableSharedFlow mutableSharedFlow;
            BillingResponseCodeMapper billingResponseCodeMapper;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                mutableSharedFlow = this.this$0.purchaseUpdatesFlow;
                int responseCode = this.$billingResult.getResponseCode();
                billingResponseCodeMapper = this.this$0.billingResponseCodeMapper;
                this.label = 1;
                if (mutableSharedFlow.emit(new PurchasesUpdatedState.Failure(responseCode, billingResponseCodeMapper.map(this.$billingResult.getResponseCode())), this) == coroutine_suspended) {
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
}
