package com.ifriend.chat.presentation.ui.onboarding;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import by.kirich1409.viewbindingdelegate.FragmentViewBindings;
import by.kirich1409.viewbindingdelegate.ViewBindingProperty;
import by.kirich1409.viewbindingdelegate.internal.UtilsKt;
import coil.ImageLoader;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.base.di.AppImageLoader;
import com.ifriend.chat.presentation.ui.AppActivity;
import com.ifriend.presentation.R;
import com.ifriend.presentation.databinding.ViewComposeBinding;
import com.ifriend.presentation.features.onboarding.flow.navigation.OnboardingNavigationEntry;
import com.ifriend.presentation.features.onboarding.flow.viewmodel.OnboardingFlowViewModel;
import com.ifriend.presentation.features.onboarding.flow.viewmodel.OnboardingFlowViewModelFactory;
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
/* compiled from: OnboardingFragment.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019¨\u0006#"}, d2 = {"Lcom/ifriend/chat/presentation/ui/onboarding/OnboardingFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/ifriend/presentation/databinding/ViewComposeBinding;", "getBinding", "()Lcom/ifriend/presentation/databinding/ViewComposeBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "factory", "Lcom/ifriend/presentation/features/onboarding/flow/viewmodel/OnboardingFlowViewModelFactory;", "getFactory", "()Lcom/ifriend/presentation/features/onboarding/flow/viewmodel/OnboardingFlowViewModelFactory;", "setFactory", "(Lcom/ifriend/presentation/features/onboarding/flow/viewmodel/OnboardingFlowViewModelFactory;)V", "imageLoader", "Lcoil/ImageLoader;", "getImageLoader$annotations", "getImageLoader", "()Lcoil/ImageLoader;", "setImageLoader", "(Lcoil/ImageLoader;)V", "viewModel", "Lcom/ifriend/presentation/features/onboarding/flow/viewmodel/OnboardingFlowViewModel;", "getViewModel", "()Lcom/ifriend/presentation/features/onboarding/flow/viewmodel/OnboardingFlowViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingFragment extends Fragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OnboardingFragment.class, "binding", "getBinding()Lcom/ifriend/presentation/databinding/ViewComposeBinding;", 0))};
    public static final int $stable = 8;
    private final ViewBindingProperty binding$delegate;
    @Inject
    public OnboardingFlowViewModelFactory factory;
    @Inject
    public ImageLoader imageLoader;
    private final Lazy viewModel$delegate;

    @AppImageLoader
    public static /* synthetic */ void getImageLoader$annotations() {
    }

    public final OnboardingFlowViewModelFactory getFactory() {
        OnboardingFlowViewModelFactory onboardingFlowViewModelFactory = this.factory;
        if (onboardingFlowViewModelFactory != null) {
            return onboardingFlowViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("factory");
        return null;
    }

    public final void setFactory(OnboardingFlowViewModelFactory onboardingFlowViewModelFactory) {
        Intrinsics.checkNotNullParameter(onboardingFlowViewModelFactory, "<set-?>");
        this.factory = onboardingFlowViewModelFactory;
    }

    public final ImageLoader getImageLoader() {
        ImageLoader imageLoader = this.imageLoader;
        if (imageLoader != null) {
            return imageLoader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        return null;
    }

    public final void setImageLoader(ImageLoader imageLoader) {
        Intrinsics.checkNotNullParameter(imageLoader, "<set-?>");
        this.imageLoader = imageLoader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OnboardingFlowViewModel getViewModel() {
        return (OnboardingFlowViewModel) this.viewModel$delegate.getValue();
    }

    private final ViewComposeBinding getBinding() {
        return (ViewComposeBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.ifriend.chat.presentation.ui.AppActivity");
        ((AppActivity) activity).getDaggerComponent().inject(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        OnboardingNavigationEntry onboardingNavigationEntry = new OnboardingNavigationEntry();
        ComposeView composeView = getBinding().composeView;
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1963571229, true, new OnboardingFragment$onViewCreated$1$1(this, onboardingNavigationEntry)));
    }

    public OnboardingFragment() {
        super(R.layout.view_compose);
        OnboardingFragment onboardingFragment = this;
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new OnboardingFragment$special$$inlined$viewModels$default$2(new OnboardingFragment$special$$inlined$viewModels$default$1(onboardingFragment)));
        this.viewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(onboardingFragment, Reflection.getOrCreateKotlinClass(OnboardingFlowViewModel.class), new OnboardingFragment$special$$inlined$viewModels$default$3(lazy), new OnboardingFragment$special$$inlined$viewModels$default$4(null, lazy), new OnboardingFragment$viewModel$2(this));
        this.binding$delegate = FragmentViewBindings.viewBindingFragmentWithCallbacks(onboardingFragment, new OnboardingFragment$special$$inlined$viewBindingFragment$default$1(), UtilsKt.emptyVbCallback());
    }
}
