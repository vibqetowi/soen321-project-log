package com.ifriend.chat.presentation.ui.avatarGeneration;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import by.kirich1409.viewbindingdelegate.FragmentViewBindings;
import by.kirich1409.viewbindingdelegate.ViewBindingProperty;
import by.kirich1409.viewbindingdelegate.internal.UtilsKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.databinding.FragmentGenerateBotAvatarErrorBinding;
import com.ifriend.chat.presentation.ui.AppActivity;
import com.ifriend.ui.base.di.ViewModelFactory;
import com.ifriend.ui.base.mvvm.FragmentBaseView;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
/* compiled from: GenerateBotAvatarErrorFragment.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001%B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0012\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0016\u0010\u001f\u001a\u00020\u00182\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H\u0016J\u0010\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u0003H\u0016R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\u00028TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006&"}, d2 = {"Lcom/ifriend/chat/presentation/ui/avatarGeneration/GenerateBotAvatarErrorFragment;", "Lcom/ifriend/ui/base/mvvm/FragmentBaseView;", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/GenerateBotAvatarErrorViewModel;", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/GenerateBotAvatarErrorState;", "()V", "binding", "Lcom/ifriend/chat/presentation/databinding/FragmentGenerateBotAvatarErrorBinding;", "kotlin.jvm.PlatformType", "getBinding", "()Lcom/ifriend/chat/presentation/databinding/FragmentGenerateBotAvatarErrorBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "viewModel", "getViewModel", "()Lcom/ifriend/chat/presentation/ui/avatarGeneration/GenerateBotAvatarErrorViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewModelFactory", "Lcom/ifriend/ui/base/di/ViewModelFactory;", "getViewModelFactory", "()Lcom/ifriend/ui/base/di/ViewModelFactory;", "setViewModelFactory", "(Lcom/ifriend/ui/base/di/ViewModelFactory;)V", "initOnClickListeners", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "showErrors", "errors", "", "", "showState", "state", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GenerateBotAvatarErrorFragment extends FragmentBaseView<GenerateBotAvatarErrorViewModel, GenerateBotAvatarErrorState> {
    private final ViewBindingProperty binding$delegate;
    private final Lazy viewModel$delegate;
    @Inject
    public ViewModelFactory viewModelFactory;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(GenerateBotAvatarErrorFragment.class, "binding", "getBinding()Lcom/ifriend/chat/presentation/databinding/FragmentGenerateBotAvatarErrorBinding;", 0))};
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView
    public void showErrors(List<? extends Throwable> errors) {
        Intrinsics.checkNotNullParameter(errors, "errors");
    }

    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView
    public void showState(GenerateBotAvatarErrorState state) {
        Intrinsics.checkNotNullParameter(state, "state");
    }

    public GenerateBotAvatarErrorFragment() {
        super(R.layout.fragment_generate_bot_avatar_error);
        GenerateBotAvatarErrorFragment generateBotAvatarErrorFragment = this;
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new GenerateBotAvatarErrorFragment$special$$inlined$viewModels$default$2(new GenerateBotAvatarErrorFragment$special$$inlined$viewModels$default$1(generateBotAvatarErrorFragment)));
        this.viewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(generateBotAvatarErrorFragment, Reflection.getOrCreateKotlinClass(GenerateBotAvatarErrorViewModel.class), new GenerateBotAvatarErrorFragment$special$$inlined$viewModels$default$3(lazy), new GenerateBotAvatarErrorFragment$special$$inlined$viewModels$default$4(null, lazy), new GenerateBotAvatarErrorFragment$viewModel$2(this));
        this.binding$delegate = FragmentViewBindings.viewBindingFragmentWithCallbacks(generateBotAvatarErrorFragment, new GenerateBotAvatarErrorFragment$special$$inlined$viewBindingFragment$default$1(), UtilsKt.emptyVbCallback());
    }

    /* compiled from: GenerateBotAvatarErrorFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/chat/presentation/ui/avatarGeneration/GenerateBotAvatarErrorFragment$Companion;", "", "()V", "newInstance", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/GenerateBotAvatarErrorFragment;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final GenerateBotAvatarErrorFragment newInstance() {
            return new GenerateBotAvatarErrorFragment();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView
    public GenerateBotAvatarErrorViewModel getViewModel() {
        return (GenerateBotAvatarErrorViewModel) this.viewModel$delegate.getValue();
    }

    private final FragmentGenerateBotAvatarErrorBinding getBinding() {
        return (FragmentGenerateBotAvatarErrorBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
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

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.ifriend.chat.presentation.ui.AppActivity");
        ((AppActivity) activity).getDaggerComponent().inject(this);
        super.onCreate(bundle);
    }

    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView, com.ifriend.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        getViewModel().init();
        initOnClickListeners();
    }

    private final void initOnClickListeners() {
        getBinding().tryAgain.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.avatarGeneration.GenerateBotAvatarErrorFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GenerateBotAvatarErrorFragment.initOnClickListeners$lambda$0(GenerateBotAvatarErrorFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOnClickListeners$lambda$0(GenerateBotAvatarErrorFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().tryAgain();
    }
}
