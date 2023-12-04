package com.ifriend.chat.presentation.ui.purchase.premium;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ifriend.analytics.usecase.purchase.PurchaseSource;
import com.ifriend.billing.api.logic.AppLaunchBillingFlow;
import com.ifriend.chat.presentation.ui.AppActivity;
import com.ifriend.presentation.R;
import com.ifriend.presentation.features.purchases.billing.models.PurchaseReason;
import com.ifriend.presentation.features.purchases.premium.viewmodel.BuyPremiumViewModel;
import com.ifriend.presentation.features.purchases.premium.viewmodel.BuyPremiumViewModelFactory;
import com.ifriend.presentation.navigation.AppFlowCoordinator;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
/* compiled from: BuyPremiumFragment.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0016J$\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u0001082\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u001a\u00109\u001a\u0002002\u0006\u0010:\u001a\u0002042\b\u00101\u001a\u0004\u0018\u000102H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b\"\u0010#R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001a\u001a\u0004\b'\u0010(R\u001b\u0010*\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001a\u001a\u0004\b,\u0010-¨\u0006<"}, d2 = {"Lcom/ifriend/chat/presentation/ui/purchase/premium/BuyPremiumFragment;", "Landroidx/fragment/app/Fragment;", "()V", "appLaunchBillingFlow", "Lcom/ifriend/billing/api/logic/AppLaunchBillingFlow;", "getAppLaunchBillingFlow", "()Lcom/ifriend/billing/api/logic/AppLaunchBillingFlow;", "setAppLaunchBillingFlow", "(Lcom/ifriend/billing/api/logic/AppLaunchBillingFlow;)V", "factory", "Lcom/ifriend/presentation/features/purchases/premium/viewmodel/BuyPremiumViewModelFactory$Factory;", "getFactory", "()Lcom/ifriend/presentation/features/purchases/premium/viewmodel/BuyPremiumViewModelFactory$Factory;", "setFactory", "(Lcom/ifriend/presentation/features/purchases/premium/viewmodel/BuyPremiumViewModelFactory$Factory;)V", "flowCoordinator", "Lcom/ifriend/presentation/navigation/AppFlowCoordinator;", "getFlowCoordinator", "()Lcom/ifriend/presentation/navigation/AppFlowCoordinator;", "setFlowCoordinator", "(Lcom/ifriend/presentation/navigation/AppFlowCoordinator;)V", "goToNeurons", "", "getGoToNeurons", "()Z", "goToNeurons$delegate", "Lkotlin/Lazy;", "purchaseReason", "Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;", "getPurchaseReason", "()Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;", "purchaseReason$delegate", "requestId", "Ljava/util/UUID;", "getRequestId", "()Ljava/util/UUID;", "requestId$delegate", "source", "Lcom/ifriend/analytics/usecase/purchase/PurchaseSource;", "getSource", "()Lcom/ifriend/analytics/usecase/purchase/PurchaseSource;", "source$delegate", "viewModel", "Lcom/ifriend/presentation/features/purchases/premium/viewmodel/BuyPremiumViewModel;", "getViewModel", "()Lcom/ifriend/presentation/features/purchases/premium/viewmodel/BuyPremiumViewModel;", "viewModel$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyPremiumFragment extends Fragment {
    private static final String KEY_AVATAR_DESCRIPTION = "key_avatar_description";
    private static final String KEY_GO_TO_NEURONS = "go_to_neurons";
    private static final String KEY_MESSAGES_ID = "key_messages_id";
    private static final String KEY_REQUEST_ID = "key_request_id";
    private static final String KEY_SOURCE = "key_source";
    @Inject
    public AppLaunchBillingFlow appLaunchBillingFlow;
    @Inject
    public BuyPremiumViewModelFactory.Factory factory;
    @Inject
    public AppFlowCoordinator flowCoordinator;
    private final Lazy viewModel$delegate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final Lazy requestId$delegate = LazyKt.lazy(new BuyPremiumFragment$requestId$2(this));
    private final Lazy source$delegate = LazyKt.lazy(new BuyPremiumFragment$source$2(this));
    private final Lazy purchaseReason$delegate = LazyKt.lazy(new BuyPremiumFragment$purchaseReason$2(this));
    private final Lazy goToNeurons$delegate = LazyKt.lazy(new BuyPremiumFragment$goToNeurons$2(this));

    /* compiled from: BuyPremiumFragment.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ifriend/chat/presentation/ui/purchase/premium/BuyPremiumFragment$Companion;", "", "()V", "KEY_AVATAR_DESCRIPTION", "", "KEY_GO_TO_NEURONS", "KEY_MESSAGES_ID", "KEY_REQUEST_ID", "KEY_SOURCE", "newInstance", "Lcom/ifriend/chat/presentation/ui/purchase/premium/BuyPremiumFragment;", "requestId", "Ljava/util/UUID;", "source", "Lcom/ifriend/analytics/usecase/purchase/PurchaseSource;", "purchaseReason", "Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;", "goToNeurons", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BuyPremiumFragment newInstance(UUID requestId, PurchaseSource source, PurchaseReason purchaseReason, boolean z) {
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            Intrinsics.checkNotNullParameter(source, "source");
            BuyPremiumFragment buyPremiumFragment = new BuyPremiumFragment();
            Bundle bundleOf = BundleKt.bundleOf(TuplesKt.to(BuyPremiumFragment.KEY_REQUEST_ID, requestId.toString()), TuplesKt.to(BuyPremiumFragment.KEY_SOURCE, Integer.valueOf(source.ordinal())), TuplesKt.to(BuyPremiumFragment.KEY_GO_TO_NEURONS, Boolean.valueOf(z)));
            if (purchaseReason instanceof PurchaseReason.GenerateAvatar) {
                bundleOf.putString(BuyPremiumFragment.KEY_AVATAR_DESCRIPTION, ((PurchaseReason.GenerateAvatar) purchaseReason).getDescription());
            } else if (purchaseReason instanceof PurchaseReason.BuyMessage) {
                bundleOf.putSerializable(BuyPremiumFragment.KEY_MESSAGES_ID, ((PurchaseReason.BuyMessage) purchaseReason).getMessageIds());
            }
            buyPremiumFragment.setArguments(bundleOf);
            return buyPremiumFragment;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UUID getRequestId() {
        return (UUID) this.requestId$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PurchaseSource getSource() {
        return (PurchaseSource) this.source$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PurchaseReason getPurchaseReason() {
        return (PurchaseReason) this.purchaseReason$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getGoToNeurons() {
        return ((Boolean) this.goToNeurons$delegate.getValue()).booleanValue();
    }

    public final BuyPremiumViewModelFactory.Factory getFactory() {
        BuyPremiumViewModelFactory.Factory factory = this.factory;
        if (factory != null) {
            return factory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("factory");
        return null;
    }

    public final void setFactory(BuyPremiumViewModelFactory.Factory factory) {
        Intrinsics.checkNotNullParameter(factory, "<set-?>");
        this.factory = factory;
    }

    public final AppFlowCoordinator getFlowCoordinator() {
        AppFlowCoordinator appFlowCoordinator = this.flowCoordinator;
        if (appFlowCoordinator != null) {
            return appFlowCoordinator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("flowCoordinator");
        return null;
    }

    public final void setFlowCoordinator(AppFlowCoordinator appFlowCoordinator) {
        Intrinsics.checkNotNullParameter(appFlowCoordinator, "<set-?>");
        this.flowCoordinator = appFlowCoordinator;
    }

    public final AppLaunchBillingFlow getAppLaunchBillingFlow() {
        AppLaunchBillingFlow appLaunchBillingFlow = this.appLaunchBillingFlow;
        if (appLaunchBillingFlow != null) {
            return appLaunchBillingFlow;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appLaunchBillingFlow");
        return null;
    }

    public final void setAppLaunchBillingFlow(AppLaunchBillingFlow appLaunchBillingFlow) {
        Intrinsics.checkNotNullParameter(appLaunchBillingFlow, "<set-?>");
        this.appLaunchBillingFlow = appLaunchBillingFlow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BuyPremiumViewModel getViewModel() {
        return (BuyPremiumViewModel) this.viewModel$delegate.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.ifriend.chat.presentation.ui.AppActivity");
        ((AppActivity) activity).getDaggerComponent().inject(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.view_compose, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        ComposeView composeView = (ComposeView) view.findViewById(R.id.composeView);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(294073666, true, new BuyPremiumFragment$onViewCreated$1$1(this)));
    }

    public BuyPremiumFragment() {
        BuyPremiumFragment buyPremiumFragment = this;
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new BuyPremiumFragment$special$$inlined$viewModels$default$2(new BuyPremiumFragment$special$$inlined$viewModels$default$1(buyPremiumFragment)));
        this.viewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(buyPremiumFragment, Reflection.getOrCreateKotlinClass(BuyPremiumViewModel.class), new BuyPremiumFragment$special$$inlined$viewModels$default$3(lazy), new BuyPremiumFragment$special$$inlined$viewModels$default$4(null, lazy), new BuyPremiumFragment$viewModel$2(this));
    }
}
