package com.ifriend.chat.presentation.ui.purchase.premium;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import com.android.billingclient.api.BillingFlowParams;
import com.facebook.internal.NativeProtocol;
import com.ifriend.billing.api.logic.AppLaunchBillingFlow;
import com.ifriend.presentation.features.purchases.premium.navigation.BuyPremiumNavigationRootKt;
import com.ifriend.presentation.features.purchases.premium.viewmodel.BuyPremiumViewModel;
import com.ifriend.presentation.navigation.AppFlowCoordinator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: BuyPremiumFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BuyPremiumFragment$onViewCreated$1$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ BuyPremiumFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyPremiumFragment$onViewCreated$1$1(BuyPremiumFragment buyPremiumFragment) {
        super(2);
        this.this$0 = buyPremiumFragment;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BuyPremiumFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/android/billingclient/api/BillingFlowParams;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.chat.presentation.ui.purchase.premium.BuyPremiumFragment$onViewCreated$1$1$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<BillingFlowParams, Unit> {
        final /* synthetic */ BuyPremiumFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(BuyPremiumFragment buyPremiumFragment) {
            super(1);
            this.this$0 = buyPremiumFragment;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BillingFlowParams billingFlowParams) {
            invoke2(billingFlowParams);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BuyPremiumFragment.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.ifriend.chat.presentation.ui.purchase.premium.BuyPremiumFragment$onViewCreated$1$1$2$1", f = "BuyPremiumFragment.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.ifriend.chat.presentation.ui.purchase.premium.BuyPremiumFragment$onViewCreated$1$1$2$1  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ BillingFlowParams $params;
            int label;
            final /* synthetic */ BuyPremiumFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(BuyPremiumFragment buyPremiumFragment, BillingFlowParams billingFlowParams, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = buyPremiumFragment;
                this.$params = billingFlowParams;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$params, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object mo6781launchBillingFlow0E7RQCE;
                BuyPremiumViewModel viewModel;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AppLaunchBillingFlow appLaunchBillingFlow = this.this$0.getAppLaunchBillingFlow();
                    FragmentActivity requireActivity = this.this$0.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                    this.label = 1;
                    mo6781launchBillingFlow0E7RQCE = appLaunchBillingFlow.mo6781launchBillingFlow0E7RQCE(requireActivity, this.$params, this);
                    if (mo6781launchBillingFlow0E7RQCE == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                    mo6781launchBillingFlow0E7RQCE = ((Result) obj).m7280unboximpl();
                }
                viewModel = this.this$0.getViewModel();
                viewModel.onLaunchBillingFlow(mo6781launchBillingFlow0E7RQCE);
                return Unit.INSTANCE;
            }
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(BillingFlowParams params) {
            Intrinsics.checkNotNullParameter(params, "params");
            Lifecycle lifecycle = this.this$0.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            BuildersKt__Builders_commonKt.launch$default(LifecycleKt.getCoroutineScope(lifecycle), null, null, new AnonymousClass1(this.this$0, params, null), 3, null);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        BuyPremiumViewModel viewModel;
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(294073666, i, -1, "com.ifriend.chat.presentation.ui.purchase.premium.BuyPremiumFragment.onViewCreated.<anonymous>.<anonymous> (BuyPremiumFragment.kt:122)");
            }
            viewModel = this.this$0.getViewModel();
            BuyPremiumNavigationRootKt.BuyPremiumNavigationRoot(viewModel, new AnonymousClass1(this.this$0.getFlowCoordinator()), new AnonymousClass2(this.this$0), composer, BuyPremiumViewModel.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BuyPremiumFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.chat.presentation.ui.purchase.premium.BuyPremiumFragment$onViewCreated$1$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0<Unit> {
        AnonymousClass1(Object obj) {
            super(0, obj, AppFlowCoordinator.class, "back", "back()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((AppFlowCoordinator) this.receiver).back();
        }
    }
}
