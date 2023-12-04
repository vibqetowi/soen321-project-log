package com.ifriend.chat.presentation.ui.infoOnboarding;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import by.kirich1409.viewbindingdelegate.FragmentViewBindings;
import by.kirich1409.viewbindingdelegate.ViewBindingProperty;
import by.kirich1409.viewbindingdelegate.internal.UtilsKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.databinding.InfoOnboardingFragmentBinding;
import com.ifriend.chat.presentation.ui.AppActivity;
import com.ifriend.ui.base.BaseFragment;
import com.ifriend.ui.base.di.ViewModelFactory;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
/* compiled from: InfoOnboardingFragment.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0014J\u0012\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001d²\u0006\n\u0010\u001e\u001a\u00020\u001fX\u008a\u0084\u0002"}, d2 = {"Lcom/ifriend/chat/presentation/ui/infoOnboarding/InfoOnboardingFragment;", "Lcom/ifriend/ui/base/BaseFragment;", "()V", "binding", "Lcom/ifriend/chat/presentation/databinding/InfoOnboardingFragmentBinding;", "getBinding", "()Lcom/ifriend/chat/presentation/databinding/InfoOnboardingFragmentBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "viewModel", "Lcom/ifriend/chat/presentation/ui/infoOnboarding/InfoOnboardingViewModel;", "getViewModel", "()Lcom/ifriend/chat/presentation/ui/infoOnboarding/InfoOnboardingViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewModelFactory", "Lcom/ifriend/ui/base/di/ViewModelFactory;", "getViewModelFactory", "()Lcom/ifriend/ui/base/di/ViewModelFactory;", "setViewModelFactory", "(Lcom/ifriend/ui/base/di/ViewModelFactory;)V", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "presentation_release", "state", "Lcom/ifriend/chat/presentation/ui/infoOnboarding/models/InfoOnboardingState;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InfoOnboardingFragment extends BaseFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(InfoOnboardingFragment.class, "binding", "getBinding()Lcom/ifriend/chat/presentation/databinding/InfoOnboardingFragmentBinding;", 0))};
    public static final int $stable = 8;
    private final ViewBindingProperty binding$delegate;
    private final Lazy viewModel$delegate;
    @Inject
    public ViewModelFactory viewModelFactory;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ifriend.ui.base.BaseFragment
    public void onBackPressed() {
    }

    private final InfoOnboardingFragmentBinding getBinding() {
        return (InfoOnboardingFragmentBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final InfoOnboardingViewModel getViewModel() {
        return (InfoOnboardingViewModel) this.viewModel$delegate.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.ifriend.chat.presentation.ui.AppActivity");
        ((AppActivity) activity).getDaggerComponent().inject(this);
    }

    @Override // com.ifriend.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        getViewModel().init();
        ComposeView composeView = getBinding().composeView;
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-193808098, true, new InfoOnboardingFragment$onViewCreated$1$1(this)));
    }

    public InfoOnboardingFragment() {
        super(R.layout.info_onboarding_fragment);
        InfoOnboardingFragment infoOnboardingFragment = this;
        this.binding$delegate = FragmentViewBindings.viewBindingFragmentWithCallbacks(infoOnboardingFragment, new InfoOnboardingFragment$special$$inlined$viewBindingFragment$default$1(), UtilsKt.emptyVbCallback());
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new InfoOnboardingFragment$special$$inlined$viewModels$default$2(new InfoOnboardingFragment$special$$inlined$viewModels$default$1(infoOnboardingFragment)));
        this.viewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(infoOnboardingFragment, Reflection.getOrCreateKotlinClass(InfoOnboardingViewModel.class), new InfoOnboardingFragment$special$$inlined$viewModels$default$3(lazy), new InfoOnboardingFragment$special$$inlined$viewModels$default$4(null, lazy), new InfoOnboardingFragment$viewModel$2(this));
    }
}
