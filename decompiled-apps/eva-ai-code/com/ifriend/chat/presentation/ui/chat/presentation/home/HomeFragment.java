package com.ifriend.chat.presentation.ui.chat.presentation.home;

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
import coil.ImageLoader;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.base.di.AppImageLoader;
import com.ifriend.chat.presentation.ui.AppActivity;
import com.ifriend.presentation.R;
import com.ifriend.presentation.databinding.ViewComposeBinding;
import com.ifriend.presentation.features.home.viewmodel.HomeViewModel;
import com.ifriend.presentation.navigation.AppFlowCoordinator;
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
/* compiled from: HomeFragment.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0014J\u001a\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006*²\u0006\n\u0010+\u001a\u00020,X\u008a\u0084\u0002"}, d2 = {"Lcom/ifriend/chat/presentation/ui/chat/presentation/home/HomeFragment;", "Lcom/ifriend/ui/base/BaseFragment;", "()V", "binding", "Lcom/ifriend/presentation/databinding/ViewComposeBinding;", "getBinding", "()Lcom/ifriend/presentation/databinding/ViewComposeBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "flowCoordinator", "Lcom/ifriend/presentation/navigation/AppFlowCoordinator;", "getFlowCoordinator", "()Lcom/ifriend/presentation/navigation/AppFlowCoordinator;", "setFlowCoordinator", "(Lcom/ifriend/presentation/navigation/AppFlowCoordinator;)V", "imageLoader", "Lcoil/ImageLoader;", "getImageLoader$annotations", "getImageLoader", "()Lcoil/ImageLoader;", "setImageLoader", "(Lcoil/ImageLoader;)V", "viewModel", "Lcom/ifriend/presentation/features/home/viewmodel/HomeViewModel;", "getViewModel", "()Lcom/ifriend/presentation/features/home/viewmodel/HomeViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewModelFactory", "Lcom/ifriend/ui/base/di/ViewModelFactory;", "getViewModelFactory", "()Lcom/ifriend/ui/base/di/ViewModelFactory;", "setViewModelFactory", "(Lcom/ifriend/ui/base/di/ViewModelFactory;)V", "applyWindowInsets", "", "rootView", "Landroid/view/View;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "savedInstanceState", "Landroid/os/Bundle;", "presentation_release", "profileMenuState", "Lcom/ifriend/presentation/features/profile/menu/model/ProfileMenuUiState;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HomeFragment extends BaseFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(HomeFragment.class, "binding", "getBinding()Lcom/ifriend/presentation/databinding/ViewComposeBinding;", 0))};
    public static final int $stable = 8;
    private final ViewBindingProperty binding$delegate;
    @Inject
    public AppFlowCoordinator flowCoordinator;
    @Inject
    public ImageLoader imageLoader;
    private final Lazy viewModel$delegate;
    @Inject
    public ViewModelFactory viewModelFactory;

    @AppImageLoader
    public static /* synthetic */ void getImageLoader$annotations() {
    }

    @Override // com.ifriend.ui.base.BaseFragment
    protected void applyWindowInsets(View rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
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
    public final HomeViewModel getViewModel() {
        return (HomeViewModel) this.viewModel$delegate.getValue();
    }

    private final ViewComposeBinding getBinding() {
        return (ViewComposeBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.ifriend.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.ifriend.chat.presentation.ui.AppActivity");
        ((AppActivity) activity).getDaggerComponent().inject(this);
        ComposeView composeView = getBinding().composeView;
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-570757549, true, new HomeFragment$onViewCreated$1$1(this)));
    }

    public HomeFragment() {
        super(R.layout.view_compose);
        HomeFragment homeFragment = this;
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new HomeFragment$special$$inlined$viewModels$default$2(new HomeFragment$special$$inlined$viewModels$default$1(homeFragment)));
        this.viewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(homeFragment, Reflection.getOrCreateKotlinClass(HomeViewModel.class), new HomeFragment$special$$inlined$viewModels$default$3(lazy), new HomeFragment$special$$inlined$viewModels$default$4(null, lazy), new HomeFragment$viewModel$2(this));
        this.binding$delegate = FragmentViewBindings.viewBindingFragmentWithCallbacks(homeFragment, new HomeFragment$special$$inlined$viewBindingFragment$default$1(), UtilsKt.emptyVbCallback());
    }
}
