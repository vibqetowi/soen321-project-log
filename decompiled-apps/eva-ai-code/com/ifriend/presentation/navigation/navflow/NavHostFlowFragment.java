package com.ifriend.presentation.navigation.navflow;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.NavGraphBuilder;
import by.kirich1409.viewbindingdelegate.CreateMethod;
import by.kirich1409.viewbindingdelegate.ReflectionFragmentViewBindings;
import by.kirich1409.viewbindingdelegate.ViewBindingProperty;
import by.kirich1409.viewbindingdelegate.internal.UtilsKt;
import coil.ImageLoader;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.base.di.AppImageLoader;
import com.ifriend.presentation.R;
import com.ifriend.presentation.databinding.ViewComposeBinding;
import com.ifriend.presentation.features.app.di.AppDiProvider;
import com.ifriend.presentation.features.app.di.AppPresentationProvider;
import com.ifriend.presentation.features.app.di.AppViewModelProvider;
import com.ifriend.presentation.navigation.AppFlowCoordinator;
import com.ifriend.presentation.navigation.destination.BenefitsPremiumActiveDestination;
import com.ifriend.presentation.navigation.destination.ChatCallDestination;
import com.ifriend.presentation.navigation.destination.ChatSubscriptionDestination;
import com.ifriend.presentation.navigation.destination.OnboardingDestination;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
/* compiled from: NavHostFlowFragment.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u001a\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001bH\u0016J\u001c\u0010!\u001a\u00020\u001d*\u00020\"2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006$"}, d2 = {"Lcom/ifriend/presentation/navigation/navflow/NavHostFlowFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/ifriend/presentation/databinding/ViewComposeBinding;", "getBinding", "()Lcom/ifriend/presentation/databinding/ViewComposeBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "flowCoordinator", "Lcom/ifriend/presentation/navigation/AppFlowCoordinator;", "getFlowCoordinator", "()Lcom/ifriend/presentation/navigation/AppFlowCoordinator;", "setFlowCoordinator", "(Lcom/ifriend/presentation/navigation/AppFlowCoordinator;)V", "imageLoader", "Lcoil/ImageLoader;", "getImageLoader$annotations", "getImageLoader", "()Lcoil/ImageLoader;", "setImageLoader", "(Lcoil/ImageLoader;)V", "getStartDestination", "", "navigationType", "Lcom/ifriend/presentation/navigation/navflow/NavHostNavigationType;", "args", "Landroid/os/Bundle;", "onViewCreated", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "addArgs", "Landroidx/navigation/NavGraphBuilder;", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NavHostFlowFragment extends Fragment {
    public static final String CHAT_CALL_ARG_KEY = "NavHostFlowFragment.chat_call_arg_key";
    public static final String CHAT_SUBSCRIPTION_ARG_KEY = "NavHostFlowFragment.chat_subscription_arg_key";
    private static final String NAVIGATION_ARG_KEY = "NavHostFlowFragment.navigation_arg_key";
    private static final String NAVIGATION_KEY = "NavHostFlowFragment.navigation_key";
    private final ViewBindingProperty binding$delegate;
    @Inject
    public AppFlowCoordinator flowCoordinator;
    @Inject
    public ImageLoader imageLoader;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(NavHostFlowFragment.class, "binding", "getBinding()Lcom/ifriend/presentation/databinding/ViewComposeBinding;", 0))};
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: NavHostFlowFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NavHostNavigationType.values().length];
            try {
                iArr[NavHostNavigationType.ONBOARDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NavHostNavigationType.CHAT_CALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NavHostNavigationType.BENEFITS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NavHostNavigationType.CHAT_SUBSCRIPTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @AppImageLoader
    public static /* synthetic */ void getImageLoader$annotations() {
    }

    public NavHostFlowFragment() {
        super(R.layout.view_compose);
        this.binding$delegate = ReflectionFragmentViewBindings.viewBindingFragment(this, ViewComposeBinding.class, CreateMethod.BIND, UtilsKt.emptyVbCallback());
    }

    /* compiled from: NavHostFlowFragment.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ifriend/presentation/navigation/navflow/NavHostFlowFragment$Companion;", "", "()V", "CHAT_CALL_ARG_KEY", "", "CHAT_SUBSCRIPTION_ARG_KEY", "NAVIGATION_ARG_KEY", "NAVIGATION_KEY", "newInstance", "Lcom/ifriend/presentation/navigation/navflow/NavHostFlowFragment;", "navigationType", "Lcom/ifriend/presentation/navigation/navflow/NavHostNavigationType;", "arg", "Landroid/os/Bundle;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ NavHostFlowFragment newInstance$default(Companion companion, NavHostNavigationType navHostNavigationType, Bundle bundle, int i, Object obj) {
            if ((i & 2) != 0) {
                bundle = null;
            }
            return companion.newInstance(navHostNavigationType, bundle);
        }

        public final NavHostFlowFragment newInstance(NavHostNavigationType navigationType, Bundle bundle) {
            Intrinsics.checkNotNullParameter(navigationType, "navigationType");
            NavHostFlowFragment navHostFlowFragment = new NavHostFlowFragment();
            Pair[] pairArr = new Pair[2];
            pairArr[0] = TuplesKt.to(NavHostFlowFragment.NAVIGATION_KEY, navigationType.name());
            if (bundle == null) {
                bundle = new Bundle();
            }
            pairArr[1] = TuplesKt.to(NavHostFlowFragment.NAVIGATION_ARG_KEY, bundle);
            navHostFlowFragment.setArguments(BundleKt.bundleOf(pairArr));
            return navHostFlowFragment;
        }
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

    private final ViewComposeBinding getBinding() {
        return (ViewComposeBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Parcelable parcelable;
        Object parcelable2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.ifriend.presentation.features.app.di.AppDiProvider");
        ((AppDiProvider) activity).getAppPresentationProvider().inject(this);
        FragmentActivity activity2 = getActivity();
        Intrinsics.checkNotNull(activity2, "null cannot be cast to non-null type com.ifriend.presentation.features.app.di.AppDiProvider");
        AppViewModelProvider appViewModelProvider = ((AppDiProvider) activity2).getAppViewModelProvider();
        FragmentActivity activity3 = getActivity();
        Intrinsics.checkNotNull(activity3, "null cannot be cast to non-null type com.ifriend.presentation.features.app.di.AppDiProvider");
        AppPresentationProvider appPresentationProvider = ((AppDiProvider) activity3).getAppPresentationProvider();
        String string = requireArguments().getString(NAVIGATION_KEY, "");
        if (string != null) {
            NavHostNavigationType valueOf = NavHostNavigationType.valueOf(string);
            Bundle requireArguments = requireArguments();
            Intrinsics.checkNotNullExpressionValue(requireArguments, "requireArguments(...)");
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = requireArguments.getParcelable(NAVIGATION_ARG_KEY, Bundle.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                parcelable = requireArguments.getParcelable(NAVIGATION_ARG_KEY);
            }
            if (parcelable != null) {
                ComposeView composeView = getBinding().composeView;
                composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
                composeView.setContent(ComposableLambdaKt.composableLambdaInstance(732697201, true, new NavHostFlowFragment$onViewCreated$1$1(this, appViewModelProvider, appPresentationProvider, valueOf, (Bundle) parcelable)));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getStartDestination(NavHostNavigationType navHostNavigationType, Bundle bundle) {
        int i = WhenMappings.$EnumSwitchMapping$0[navHostNavigationType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return ChatSubscriptionDestination.RouteFlow.INSTANCE.getRoute();
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return BenefitsPremiumActiveDestination.INSTANCE.getDestination();
            }
            return ChatCallDestination.RouteFlow.INSTANCE.getRoute();
        }
        return OnboardingDestination.Route.INSTANCE.getDestination();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addArgs(NavGraphBuilder navGraphBuilder, NavHostNavigationType navHostNavigationType, Bundle bundle) {
        int i = WhenMappings.$EnumSwitchMapping$0[navHostNavigationType.ordinal()];
        if (i == 2) {
            navGraphBuilder.argument(ChatCallDestination.RouteFlow.ChatId, new NavHostFlowFragment$addArgs$1(bundle));
        } else if (i != 4) {
        } else {
            navGraphBuilder.argument(ChatSubscriptionDestination.RouteFlow.ChatArgs, new NavHostFlowFragment$addArgs$2(bundle));
        }
    }
}
