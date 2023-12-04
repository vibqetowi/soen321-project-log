package com.ifriend.chat.presentation.ui.purchase.neurons;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import com.ifriend.billing.api.logic.AppLaunchBillingFlow;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModel;
import com.ifriend.ui.utils.extensions.ContextKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: BuyNeuronsBottomSheetDialogFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", NotificationCompat.CATEGORY_EVENT, "Lcom/ifriend/presentation/features/purchases/neurons/viewmodel/BuyNeuronsViewModel$Event;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BuyNeuronsBottomSheetDialogFragment$onViewCreated$1 extends Lambda implements Function1<BuyNeuronsViewModel.Event, Unit> {
    final /* synthetic */ BuyNeuronsBottomSheetDialogFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyNeuronsBottomSheetDialogFragment$onViewCreated$1(BuyNeuronsBottomSheetDialogFragment buyNeuronsBottomSheetDialogFragment) {
        super(1);
        this.this$0 = buyNeuronsBottomSheetDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BuyNeuronsViewModel.Event event) {
        invoke2(event);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(BuyNeuronsViewModel.Event event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof BuyNeuronsViewModel.Event.Close) {
            this.this$0.dismiss();
        } else if (event instanceof BuyNeuronsViewModel.Event.OpenLink) {
            Context requireContext = this.this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            ContextKt.openLink(requireContext, ((BuyNeuronsViewModel.Event.OpenLink) event).getLink());
        } else if (event instanceof BuyNeuronsViewModel.Event.LaunchBillingFlow) {
            Lifecycle lifecycle = this.this$0.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            CoroutinesKt.safeLaunch$default(LifecycleKt.getCoroutineScope(lifecycle), null, null, new AnonymousClass1(this.this$0, event, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BuyNeuronsBottomSheetDialogFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.chat.presentation.ui.purchase.neurons.BuyNeuronsBottomSheetDialogFragment$onViewCreated$1$1", f = "BuyNeuronsBottomSheetDialogFragment.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.chat.presentation.ui.purchase.neurons.BuyNeuronsBottomSheetDialogFragment$onViewCreated$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ BuyNeuronsViewModel.Event $event;
        int label;
        final /* synthetic */ BuyNeuronsBottomSheetDialogFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BuyNeuronsBottomSheetDialogFragment buyNeuronsBottomSheetDialogFragment, BuyNeuronsViewModel.Event event, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = buyNeuronsBottomSheetDialogFragment;
            this.$event = event;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$event, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object mo6781launchBillingFlow0E7RQCE;
            BuyNeuronsViewModel viewModel;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AppLaunchBillingFlow appLaunchBillingFlow = this.this$0.getAppLaunchBillingFlow();
                FragmentActivity requireActivity = this.this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                this.label = 1;
                mo6781launchBillingFlow0E7RQCE = appLaunchBillingFlow.mo6781launchBillingFlow0E7RQCE(requireActivity, ((BuyNeuronsViewModel.Event.LaunchBillingFlow) this.$event).getParams(), this);
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
}
