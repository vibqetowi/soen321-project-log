package com.ifriend.chat.presentation.ui.menu.confirmEmail;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.analytics.usecase.confirmEmail.AnalyticsCheckMyInboxClickedUseCase;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.ui.AppActivity;
import com.ifriend.presentation.databinding.ViewComposeBinding;
import com.ifriend.presentation.extensions.ComposeKt;
import com.ifriend.presentation.features.profile.confirmemail.ConfirmEmailViewModel;
import com.ifriend.presentation.navigation.AppFlowCoordinator;
import com.ifriend.ui.base.di.ViewModelFactory;
import com.ifriend.ui.base.dialog.bottomDialog.BottomDialog;
import com.ifriend.ui.base.dialog.bottomDialog.BottomDialogButton;
import com.ifriend.ui.base.dialog.bottomDialog.BottomDialogButtonType;
import com.redmadrobot.extensions.viewbinding.ViewBindingDelegate;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
/* compiled from: ConfirmEmailFragment.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010!\u001a\u00020\"H\u0002J\u001a\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010(\u001a\u00020\"H\u0002J\u0012\u0010)\u001a\b\u0012\u0004\u0012\u00020+0**\u00020,H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006.²\u0006\n\u0010/\u001a\u000200X\u008a\u0084\u0002"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/confirmEmail/ConfirmEmailFragment;", "Landroidx/fragment/app/Fragment;", "()V", "analyticsCheckMyInboxClickedUseCase", "Lcom/ifriend/analytics/usecase/confirmEmail/AnalyticsCheckMyInboxClickedUseCase;", "getAnalyticsCheckMyInboxClickedUseCase", "()Lcom/ifriend/analytics/usecase/confirmEmail/AnalyticsCheckMyInboxClickedUseCase;", "setAnalyticsCheckMyInboxClickedUseCase", "(Lcom/ifriend/analytics/usecase/confirmEmail/AnalyticsCheckMyInboxClickedUseCase;)V", "appFlowCoordinator", "Lcom/ifriend/presentation/navigation/AppFlowCoordinator;", "getAppFlowCoordinator", "()Lcom/ifriend/presentation/navigation/AppFlowCoordinator;", "setAppFlowCoordinator", "(Lcom/ifriend/presentation/navigation/AppFlowCoordinator;)V", "binding", "Lcom/ifriend/presentation/databinding/ViewComposeBinding;", "getBinding", "()Lcom/ifriend/presentation/databinding/ViewComposeBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "viewModel", "Lcom/ifriend/presentation/features/profile/confirmemail/ConfirmEmailViewModel;", "getViewModel", "()Lcom/ifriend/presentation/features/profile/confirmemail/ConfirmEmailViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewModelFactory", "Lcom/ifriend/ui/base/di/ViewModelFactory;", "getViewModelFactory", "()Lcom/ifriend/ui/base/di/ViewModelFactory;", "setViewModelFactory", "(Lcom/ifriend/ui/base/di/ViewModelFactory;)V", "changeEmail", "", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showGetConfirmationPopup", "getBottomDialogButtons", "", "Lcom/ifriend/ui/base/dialog/bottomDialog/BottomDialogButton;", "Lcom/ifriend/ui/base/dialog/bottomDialog/BottomDialog;", "Companion", "presentation_release", "state", "Lcom/ifriend/presentation/features/profile/confirmemail/ConfirmEmailViewModel$UiState;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConfirmEmailFragment extends Fragment {
    @Inject
    public AnalyticsCheckMyInboxClickedUseCase analyticsCheckMyInboxClickedUseCase;
    @Inject
    public AppFlowCoordinator appFlowCoordinator;
    private final ReadOnlyProperty binding$delegate;
    private final Lazy viewModel$delegate;
    @Inject
    public ViewModelFactory viewModelFactory;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ConfirmEmailFragment.class, "binding", "getBinding()Lcom/ifriend/presentation/databinding/ViewComposeBinding;", 0))};
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ConfirmEmailFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/confirmEmail/ConfirmEmailFragment$Companion;", "", "()V", "newInstance", "Lcom/ifriend/chat/presentation/ui/menu/confirmEmail/ConfirmEmailFragment;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ConfirmEmailFragment newInstance() {
            return new ConfirmEmailFragment();
        }
    }

    private final ViewComposeBinding getBinding() {
        return (ViewComposeBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final AnalyticsCheckMyInboxClickedUseCase getAnalyticsCheckMyInboxClickedUseCase() {
        AnalyticsCheckMyInboxClickedUseCase analyticsCheckMyInboxClickedUseCase = this.analyticsCheckMyInboxClickedUseCase;
        if (analyticsCheckMyInboxClickedUseCase != null) {
            return analyticsCheckMyInboxClickedUseCase;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analyticsCheckMyInboxClickedUseCase");
        return null;
    }

    public final void setAnalyticsCheckMyInboxClickedUseCase(AnalyticsCheckMyInboxClickedUseCase analyticsCheckMyInboxClickedUseCase) {
        Intrinsics.checkNotNullParameter(analyticsCheckMyInboxClickedUseCase, "<set-?>");
        this.analyticsCheckMyInboxClickedUseCase = analyticsCheckMyInboxClickedUseCase;
    }

    public final ViewModelFactory getViewModelFactory() {
        ViewModelFactory viewModelFactory = this.viewModelFactory;
        if (viewModelFactory != null) {
            return viewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
        return null;
    }

    public final void setViewModelFactory(ViewModelFactory viewModelFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "<set-?>");
        this.viewModelFactory = viewModelFactory;
    }

    public final AppFlowCoordinator getAppFlowCoordinator() {
        AppFlowCoordinator appFlowCoordinator = this.appFlowCoordinator;
        if (appFlowCoordinator != null) {
            return appFlowCoordinator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appFlowCoordinator");
        return null;
    }

    public final void setAppFlowCoordinator(AppFlowCoordinator appFlowCoordinator) {
        Intrinsics.checkNotNullParameter(appFlowCoordinator, "<set-?>");
        this.appFlowCoordinator = appFlowCoordinator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConfirmEmailViewModel getViewModel() {
        return (ConfirmEmailViewModel) this.viewModel$delegate.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.ifriend.chat.presentation.ui.AppActivity");
        ((AppActivity) activity).getDaggerComponent().inject(this);
        ComposeView composeView = getBinding().composeView;
        Intrinsics.checkNotNullExpressionValue(composeView, "composeView");
        ComposeKt.applyContent(composeView, ComposableLambdaKt.composableLambdaInstance(1426468808, true, new ConfirmEmailFragment$onViewCreated$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeEmail() {
        getAppFlowCoordinator().goToChangeEmail();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showGetConfirmationPopup() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        BottomDialog bottomDialog = new BottomDialog(requireContext);
        String string = getString(R.string.dont_see_it_check_your_spam_folder);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        bottomDialog.init(string, getBottomDialogButtons(bottomDialog));
        bottomDialog.setCanceledOnTouchOutside(true);
        bottomDialog.setCancelable(true);
        bottomDialog.show();
    }

    private final List<BottomDialogButton> getBottomDialogButtons(BottomDialog bottomDialog) {
        String string = getString(R.string.resend_confirmation);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(R.string.change_email);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return CollectionsKt.listOf((Object[]) new BottomDialogButton[]{new BottomDialogButton(string, getViewModel().getEmailConfirmationTimer(), new ConfirmEmailFragment$getBottomDialogButtons$1(getViewModel())), new BottomDialogButton(string2, BottomDialogButtonType.Default.INSTANCE, new ConfirmEmailFragment$getBottomDialogButtons$2(this, bottomDialog))});
    }

    public ConfirmEmailFragment() {
        super(com.ifriend.presentation.R.layout.view_compose);
        ConfirmEmailFragment confirmEmailFragment = this;
        this.binding$delegate = new ViewBindingDelegate(confirmEmailFragment, Reflection.getOrCreateKotlinClass(ViewComposeBinding.class));
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new ConfirmEmailFragment$special$$inlined$viewModels$default$2(new ConfirmEmailFragment$special$$inlined$viewModels$default$1(confirmEmailFragment)));
        this.viewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(confirmEmailFragment, Reflection.getOrCreateKotlinClass(ConfirmEmailViewModel.class), new ConfirmEmailFragment$special$$inlined$viewModels$default$3(lazy), new ConfirmEmailFragment$special$$inlined$viewModels$default$4(null, lazy), new ConfirmEmailFragment$viewModel$2(this));
    }
}
