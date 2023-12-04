package com.ifriend.chat.presentation.ui;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.ifriend.chat.presentation.ui.purchase.neurons.BuyNeuronsBottomSheetDialogFragment;
import com.ifriend.infrastructure.UtilsKt;
import com.ifriend.presentation.common.observers.appevents.params.BuyNeuronsBillingUiParams;
import com.ifriend.presentation.common.observers.appevents.params.BuySubscriptionBillingUiParams;
import com.ifriend.presentation.features.app.viewmodel.AppViewModel;
import com.ifriend.presentation.navigation.AppFlowCoordinator;
import com.ifriend.ui.utils.extensions.ContextKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: AppActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", NotificationCompat.CATEGORY_EVENT, "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$Event;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AppActivity$onCreate$2$1 extends Lambda implements Function1<AppViewModel.Event, Unit> {
    final /* synthetic */ AppActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppActivity$onCreate$2$1(AppActivity appActivity) {
        super(1);
        this.this$0 = appActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AppViewModel.Event event) {
        invoke2(event);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(AppViewModel.Event event) {
        GoogleSignInClient googleSignInClient;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof AppViewModel.Event.GoToAddNeurons) {
            BuyNeuronsBillingUiParams params = ((AppViewModel.Event.GoToAddNeurons) event).getParams();
            BuyNeuronsBottomSheetDialogFragment.Companion.newInstance(params.getRequestId(), params.getPurchaseSource(), params.getPurchaseReason(), params.getGoToUpgradeAfterDismiss()).show(this.this$0.getSupportFragmentManager(), (String) null);
        } else if (event instanceof AppViewModel.Event.GoToBuySubscription) {
            BuySubscriptionBillingUiParams params2 = ((AppViewModel.Event.GoToBuySubscription) event).getParams();
            this.this$0.getAppFlowCoordinator().goToBuySubscription(params2.getRequestId(), params2.getGoToBuyNeuronsAfterUpgrade(), params2.getType(), params2.getPurchaseReason());
        } else if (event instanceof AppViewModel.Event.GoToBuyChatSubscription) {
            this.this$0.getAppFlowCoordinator().goToBuyChatSubscription(((AppViewModel.Event.GoToBuyChatSubscription) event).getParams());
        } else if (event instanceof AppViewModel.Event.StartChatFeature) {
            AppFlowCoordinator.DefaultImpls.startChatFeature$default(this.this$0.getAppFlowCoordinator(), false, ((AppViewModel.Event.StartChatFeature) event).getChatId(), 1, null);
        } else if (event instanceof AppViewModel.Event.StartHomeFeature) {
            this.this$0.getAppFlowCoordinator().goToHome();
        } else if (event instanceof AppViewModel.Event.BackToHomeFeature) {
            this.this$0.getAppFlowCoordinator().backTo(this.this$0.getChatScreenFactory().multiChatScreen());
        } else if (event instanceof AppViewModel.Event.ShowInternalNotification) {
            this.this$0.getAppFlowCoordinator().showInternalNotification(((AppViewModel.Event.ShowInternalNotification) event).getParams());
        } else if (event instanceof AppViewModel.Event.StartOnboardingFeature) {
            this.this$0.getAppFlowCoordinator().goToOnboarding();
        } else if (event instanceof AppViewModel.Event.GoToInfoOnboarding) {
            this.this$0.getAppFlowCoordinator().goToInfoOnboarding();
        } else if (event instanceof AppViewModel.Event.RestartApp) {
            UtilsKt.restartApp(this.this$0);
        } else if (event instanceof AppViewModel.Event.RestartAppFlow) {
            googleSignInClient = this.this$0.getGoogleSignInClient();
            googleSignInClient.signOut();
            this.this$0.getAppFlowCoordinator().startAppFlow(this.this$0);
        } else if (!(event instanceof AppViewModel.Event.OpenLink)) {
            throw new NoWhenBranchMatchedException();
        } else {
            ContextKt.openLink(this.this$0, ((AppViewModel.Event.OpenLink) event).getUrl());
        }
    }
}
