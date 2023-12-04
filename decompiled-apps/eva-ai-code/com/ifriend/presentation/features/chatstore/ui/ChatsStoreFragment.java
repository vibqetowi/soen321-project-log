package com.ifriend.presentation.features.chatstore.ui;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import by.kirich1409.viewbindingdelegate.FragmentViewBindings;
import by.kirich1409.viewbindingdelegate.ViewBindingProperty;
import by.kirich1409.viewbindingdelegate.internal.UtilsKt;
import coil.ImageLoader;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.base.di.AppImageLoader;
import com.ifriend.presentation.R;
import com.ifriend.presentation.databinding.ViewComposeBinding;
import com.ifriend.presentation.features.app.di.AppDiProvider;
import com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel;
import com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModelFactory;
import com.ifriend.presentation.navigation.AppFlowCoordinator;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
/* compiled from: ChatsStoreFragment.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006)"}, d2 = {"Lcom/ifriend/presentation/features/chatstore/ui/ChatsStoreFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/ifriend/presentation/databinding/ViewComposeBinding;", "getBinding", "()Lcom/ifriend/presentation/databinding/ViewComposeBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "flowCoordinator", "Lcom/ifriend/presentation/navigation/AppFlowCoordinator;", "getFlowCoordinator", "()Lcom/ifriend/presentation/navigation/AppFlowCoordinator;", "setFlowCoordinator", "(Lcom/ifriend/presentation/navigation/AppFlowCoordinator;)V", "imageLoader", "Lcoil/ImageLoader;", "getImageLoader$annotations", "getImageLoader", "()Lcoil/ImageLoader;", "setImageLoader", "(Lcoil/ImageLoader;)V", "viewModel", "Lcom/ifriend/presentation/features/chatstore/viewmodel/ChatsStoreViewModel;", "getViewModel", "()Lcom/ifriend/presentation/features/chatstore/viewmodel/ChatsStoreViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewModelFactory", "Lcom/ifriend/presentation/features/chatstore/viewmodel/ChatsStoreViewModelFactory$Factory;", "getViewModelFactory", "()Lcom/ifriend/presentation/features/chatstore/viewmodel/ChatsStoreViewModelFactory$Factory;", "setViewModelFactory", "(Lcom/ifriend/presentation/features/chatstore/viewmodel/ChatsStoreViewModelFactory$Factory;)V", "onViewCreated", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatsStoreFragment extends Fragment {
    private static final String PARAMS_KEY = "ChatsStoreFragment.chatId";
    private final ViewBindingProperty binding$delegate;
    @Inject
    public AppFlowCoordinator flowCoordinator;
    @Inject
    public ImageLoader imageLoader;
    private final Lazy viewModel$delegate;
    @Inject
    public ChatsStoreViewModelFactory.Factory viewModelFactory;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ChatsStoreFragment.class, "binding", "getBinding()Lcom/ifriend/presentation/databinding/ViewComposeBinding;", 0))};
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @AppImageLoader
    public static /* synthetic */ void getImageLoader$annotations() {
    }

    /* compiled from: ChatsStoreFragment.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ifriend/presentation/features/chatstore/ui/ChatsStoreFragment$Companion;", "", "()V", "PARAMS_KEY", "", "newInstance", "Lcom/ifriend/presentation/features/chatstore/ui/ChatsStoreFragment;", "orderId", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ChatsStoreFragment newInstance(String orderId) {
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            ChatsStoreFragment chatsStoreFragment = new ChatsStoreFragment();
            chatsStoreFragment.setArguments(BundleKt.bundleOf(TuplesKt.to(ChatsStoreFragment.PARAMS_KEY, orderId)));
            return chatsStoreFragment;
        }
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

    public final ChatsStoreViewModelFactory.Factory getViewModelFactory() {
        ChatsStoreViewModelFactory.Factory factory = this.viewModelFactory;
        if (factory != null) {
            return factory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
        return null;
    }

    public final void setViewModelFactory(ChatsStoreViewModelFactory.Factory factory) {
        Intrinsics.checkNotNullParameter(factory, "<set-?>");
        this.viewModelFactory = factory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChatsStoreViewModel getViewModel() {
        return (ChatsStoreViewModel) this.viewModel$delegate.getValue();
    }

    private final ViewComposeBinding getBinding() {
        return (ViewComposeBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.ifriend.presentation.features.app.di.AppDiProvider");
        ((AppDiProvider) activity).getAppPresentationProvider().inject(this);
        ComposeView composeView = getBinding().composeView;
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(107787946, true, new ChatsStoreFragment$onViewCreated$1$1(this)));
    }

    public ChatsStoreFragment() {
        super(R.layout.view_compose);
        ChatsStoreFragment chatsStoreFragment = this;
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new ChatsStoreFragment$special$$inlined$viewModels$default$2(new ChatsStoreFragment$special$$inlined$viewModels$default$1(chatsStoreFragment)));
        this.viewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(chatsStoreFragment, Reflection.getOrCreateKotlinClass(ChatsStoreViewModel.class), new ChatsStoreFragment$special$$inlined$viewModels$default$3(lazy), new ChatsStoreFragment$special$$inlined$viewModels$default$4(null, lazy), new ChatsStoreFragment$viewModel$2(this));
        this.binding$delegate = FragmentViewBindings.viewBindingFragmentWithCallbacks(chatsStoreFragment, new ChatsStoreFragment$special$$inlined$viewBindingFragment$default$1(), UtilsKt.emptyVbCallback());
    }
}
