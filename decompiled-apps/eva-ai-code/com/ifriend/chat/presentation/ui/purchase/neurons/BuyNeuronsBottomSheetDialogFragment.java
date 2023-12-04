package com.ifriend.chat.presentation.ui.purchase.neurons;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ifriend.analytics.usecase.purchase.PurchaseSource;
import com.ifriend.billing.api.logic.AppLaunchBillingFlow;
import com.ifriend.chat.presentation.ui.AppActivity;
import com.ifriend.presentation.R;
import com.ifriend.presentation.common.uistate.UiStateExtKt;
import com.ifriend.presentation.features.purchases.billing.models.PurchaseReason;
import com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModel;
import com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModelFactory;
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
/* compiled from: BuyNeuronsBottomSheetDialogFragment.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 72\u00020\u0001:\u00017B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0012\u0010-\u001a\u00020.2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J$\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u0001042\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u001a\u00105\u001a\u00020*2\u0006\u00106\u001a\u0002002\b\u0010+\u001a\u0004\u0018\u00010,H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u000e\u001a\u0004\b \u0010!R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u00068²\u0006\n\u00109\u001a\u00020:X\u008a\u0084\u0002"}, d2 = {"Lcom/ifriend/chat/presentation/ui/purchase/neurons/BuyNeuronsBottomSheetDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "appLaunchBillingFlow", "Lcom/ifriend/billing/api/logic/AppLaunchBillingFlow;", "getAppLaunchBillingFlow", "()Lcom/ifriend/billing/api/logic/AppLaunchBillingFlow;", "setAppLaunchBillingFlow", "(Lcom/ifriend/billing/api/logic/AppLaunchBillingFlow;)V", "goToUpgrade", "", "getGoToUpgrade", "()Z", "goToUpgrade$delegate", "Lkotlin/Lazy;", "purchaseReason", "Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;", "getPurchaseReason", "()Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;", "purchaseReason$delegate", "requestId", "Ljava/util/UUID;", "getRequestId", "()Ljava/util/UUID;", "requestId$delegate", "source", "Lcom/ifriend/analytics/usecase/purchase/PurchaseSource;", "getSource", "()Lcom/ifriend/analytics/usecase/purchase/PurchaseSource;", "source$delegate", "viewModel", "Lcom/ifriend/presentation/features/purchases/neurons/viewmodel/BuyNeuronsViewModel;", "getViewModel", "()Lcom/ifriend/presentation/features/purchases/neurons/viewmodel/BuyNeuronsViewModel;", "viewModel$delegate", "viewModelFactory", "Lcom/ifriend/presentation/features/purchases/neurons/viewmodel/BuyNeuronsViewModelFactory$Factory;", "getViewModelFactory", "()Lcom/ifriend/presentation/features/purchases/neurons/viewmodel/BuyNeuronsViewModelFactory$Factory;", "setViewModelFactory", "(Lcom/ifriend/presentation/features/purchases/neurons/viewmodel/BuyNeuronsViewModelFactory$Factory;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "Companion", "presentation_release", "state", "Lcom/ifriend/presentation/features/purchases/neurons/viewmodel/BuyNeuronsViewModel$UiState;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyNeuronsBottomSheetDialogFragment extends BottomSheetDialogFragment {
    private static final String KEY_AVATAR_DESCRIPTION = "key_avatar_description";
    private static final String KEY_GO_TO_UPGRADE = "key_go_to_upgrade";
    private static final String KEY_MESSAGES_ID = "key_messages_id";
    private static final String KEY_REQUEST_ID = "key_request_id";
    private static final String KEY_SOURCE = "key_source";
    @Inject
    public AppLaunchBillingFlow appLaunchBillingFlow;
    private final Lazy viewModel$delegate;
    @Inject
    public BuyNeuronsViewModelFactory.Factory viewModelFactory;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final Lazy requestId$delegate = LazyKt.lazy(new BuyNeuronsBottomSheetDialogFragment$requestId$2(this));
    private final Lazy source$delegate = LazyKt.lazy(new BuyNeuronsBottomSheetDialogFragment$source$2(this));
    private final Lazy purchaseReason$delegate = LazyKt.lazy(new BuyNeuronsBottomSheetDialogFragment$purchaseReason$2(this));
    private final Lazy goToUpgrade$delegate = LazyKt.lazy(new BuyNeuronsBottomSheetDialogFragment$goToUpgrade$2(this));

    /* compiled from: BuyNeuronsBottomSheetDialogFragment.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ifriend/chat/presentation/ui/purchase/neurons/BuyNeuronsBottomSheetDialogFragment$Companion;", "", "()V", "KEY_AVATAR_DESCRIPTION", "", "KEY_GO_TO_UPGRADE", "KEY_MESSAGES_ID", "KEY_REQUEST_ID", "KEY_SOURCE", "newInstance", "Lcom/ifriend/chat/presentation/ui/purchase/neurons/BuyNeuronsBottomSheetDialogFragment;", "requestId", "Ljava/util/UUID;", "source", "Lcom/ifriend/analytics/usecase/purchase/PurchaseSource;", "purchaseReason", "Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;", "goToUpgrade", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BuyNeuronsBottomSheetDialogFragment newInstance(UUID requestId, PurchaseSource source, PurchaseReason purchaseReason, boolean z) {
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            Intrinsics.checkNotNullParameter(source, "source");
            BuyNeuronsBottomSheetDialogFragment buyNeuronsBottomSheetDialogFragment = new BuyNeuronsBottomSheetDialogFragment();
            Bundle bundleOf = BundleKt.bundleOf(TuplesKt.to(BuyNeuronsBottomSheetDialogFragment.KEY_REQUEST_ID, requestId.toString()), TuplesKt.to(BuyNeuronsBottomSheetDialogFragment.KEY_SOURCE, Integer.valueOf(source.ordinal())), TuplesKt.to(BuyNeuronsBottomSheetDialogFragment.KEY_GO_TO_UPGRADE, Boolean.valueOf(z)));
            if (purchaseReason instanceof PurchaseReason.GenerateAvatar) {
                bundleOf.putString(BuyNeuronsBottomSheetDialogFragment.KEY_AVATAR_DESCRIPTION, ((PurchaseReason.GenerateAvatar) purchaseReason).getDescription());
            } else if (purchaseReason instanceof PurchaseReason.BuyMessage) {
                bundleOf.putSerializable(BuyNeuronsBottomSheetDialogFragment.KEY_MESSAGES_ID, ((PurchaseReason.BuyMessage) purchaseReason).getMessageIds());
            }
            buyNeuronsBottomSheetDialogFragment.setArguments(bundleOf);
            return buyNeuronsBottomSheetDialogFragment;
        }
    }

    public final BuyNeuronsViewModelFactory.Factory getViewModelFactory() {
        BuyNeuronsViewModelFactory.Factory factory = this.viewModelFactory;
        if (factory != null) {
            return factory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
        return null;
    }

    public final void setViewModelFactory(BuyNeuronsViewModelFactory.Factory factory) {
        Intrinsics.checkNotNullParameter(factory, "<set-?>");
        this.viewModelFactory = factory;
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
    public final boolean getGoToUpgrade() {
        return ((Boolean) this.goToUpgrade$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BuyNeuronsViewModel getViewModel() {
        return (BuyNeuronsViewModel) this.viewModel$delegate.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.ifriend.chat.presentation.ui.AppActivity");
        ((AppActivity) activity).getDaggerComponent().inject(this);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        final BuyNeuronsBottomSheetDialogFragment$onCreateDialog$1 buyNeuronsBottomSheetDialogFragment$onCreateDialog$1 = new BuyNeuronsBottomSheetDialogFragment$onCreateDialog$1(requireContext(), getTheme());
        buyNeuronsBottomSheetDialogFragment$onCreateDialog$1.getBehavior().setSkipCollapsed(true);
        buyNeuronsBottomSheetDialogFragment$onCreateDialog$1.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.ifriend.chat.presentation.ui.purchase.neurons.BuyNeuronsBottomSheetDialogFragment$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                BuyNeuronsBottomSheetDialogFragment.onCreateDialog$lambda$1$lambda$0(BuyNeuronsBottomSheetDialogFragment$onCreateDialog$1.this, dialogInterface);
            }
        });
        return buyNeuronsBottomSheetDialogFragment$onCreateDialog$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateDialog$lambda$1$lambda$0(BuyNeuronsBottomSheetDialogFragment$onCreateDialog$1 this_apply, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        this_apply.getBehavior().setState(3);
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
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        UiStateExtKt.collectEvent$default(getViewModel(), lifecycle, (Lifecycle.State) null, new BuyNeuronsBottomSheetDialogFragment$onViewCreated$1(this), 2, (Object) null);
        ComposeView composeView = (ComposeView) view.findViewById(R.id.composeView);
        composeView.setBackgroundColor(0);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1456432469, true, new BuyNeuronsBottomSheetDialogFragment$onViewCreated$2$1(this)));
    }

    public BuyNeuronsBottomSheetDialogFragment() {
        BuyNeuronsBottomSheetDialogFragment buyNeuronsBottomSheetDialogFragment = this;
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new BuyNeuronsBottomSheetDialogFragment$special$$inlined$viewModels$default$2(new BuyNeuronsBottomSheetDialogFragment$special$$inlined$viewModels$default$1(buyNeuronsBottomSheetDialogFragment)));
        this.viewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(buyNeuronsBottomSheetDialogFragment, Reflection.getOrCreateKotlinClass(BuyNeuronsViewModel.class), new BuyNeuronsBottomSheetDialogFragment$special$$inlined$viewModels$default$3(lazy), new BuyNeuronsBottomSheetDialogFragment$special$$inlined$viewModels$default$4(null, lazy), new BuyNeuronsBottomSheetDialogFragment$viewModel$2(this));
    }
}
