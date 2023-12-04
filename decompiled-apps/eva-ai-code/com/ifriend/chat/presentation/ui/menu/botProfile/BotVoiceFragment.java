package com.ifriend.chat.presentation.ui.menu.botProfile;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.databinding.FragmentBotVoiceBinding;
import com.ifriend.chat.presentation.ui.AppActivity;
import com.ifriend.ui.adapter.CheckArrayAdapter;
import com.ifriend.ui.base.BaseFragment;
import com.ifriend.ui.base.di.ViewModelFactory;
import com.ifriend.ui.utils.extensions.ViewKt;
import com.redmadrobot.extensions.viewbinding.ViewBindingDelegate;
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
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
/* compiled from: BotVoiceFragment.kt */
@Metadata(d1 = {"\u0000M\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\f\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\u001bH\u0016J\u001a\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006%"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotVoiceFragment;", "Lcom/ifriend/ui/base/BaseFragment;", "()V", "arrayAdapter", "Lcom/ifriend/ui/adapter/CheckArrayAdapter;", "binding", "Lcom/ifriend/chat/presentation/databinding/FragmentBotVoiceBinding;", "getBinding", "()Lcom/ifriend/chat/presentation/databinding/FragmentBotVoiceBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "interruptSoundOnBackgroundObserver", "com/ifriend/chat/presentation/ui/menu/botProfile/BotVoiceFragment$interruptSoundOnBackgroundObserver$1", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotVoiceFragment$interruptSoundOnBackgroundObserver$1;", "viewModel", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotVoiceViewModel;", "getViewModel", "()Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotVoiceViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewModelFactory", "Lcom/ifriend/ui/base/di/ViewModelFactory;", "getViewModelFactory", "()Lcom/ifriend/ui/base/di/ViewModelFactory;", "setViewModelFactory", "(Lcom/ifriend/ui/base/di/ViewModelFactory;)V", "chooseVoice", "", "id", "", "onDestroy", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BotVoiceFragment extends BaseFragment {
    private CheckArrayAdapter arrayAdapter;
    private final ReadOnlyProperty binding$delegate;
    private final BotVoiceFragment$interruptSoundOnBackgroundObserver$1 interruptSoundOnBackgroundObserver;
    private final Lazy viewModel$delegate;
    @Inject
    public ViewModelFactory viewModelFactory;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BotVoiceFragment.class, "binding", "getBinding()Lcom/ifriend/chat/presentation/databinding/FragmentBotVoiceBinding;", 0))};
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: BotVoiceFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotVoiceFragment$Companion;", "", "()V", "newInstance", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotVoiceFragment;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BotVoiceFragment newInstance() {
            return new BotVoiceFragment();
        }
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
    public final FragmentBotVoiceBinding getBinding() {
        return (FragmentBotVoiceBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BotVoiceViewModel getViewModel() {
        return (BotVoiceViewModel) this.viewModel$delegate.getValue();
    }

    @Override // com.ifriend.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        getBinding().setLifecycleOwner(this);
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.ifriend.chat.presentation.ui.AppActivity");
        ((AppActivity) activity).getDaggerComponent().inject(this);
        getViewModel().setFragment(this);
        getViewModel().getAvailableVoices().observe(getViewLifecycleOwner(), new BotVoiceFragment$sam$androidx_lifecycle_Observer$0(new BotVoiceFragment$onViewCreated$1(this)));
        getViewModel().getCurrentVoiceId().observe(getViewLifecycleOwner(), new BotVoiceFragment$sam$androidx_lifecycle_Observer$0(new BotVoiceFragment$onViewCreated$2(this)));
        getViewModel().init();
        getBinding().setVm(getViewModel());
        FragmentBotVoiceBinding binding = getBinding();
        ImageView back = binding.back;
        Intrinsics.checkNotNullExpressionValue(back, "back");
        ViewKt.expandClickableArea$default(back, 0, 1, null);
        binding.save.setActive(false);
        binding.back.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.menu.botProfile.BotVoiceFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BotVoiceFragment.onViewCreated$lambda$1$lambda$0(BotVoiceFragment.this, view2);
            }
        });
        requireActivity().getLifecycle().addObserver(this.interruptSoundOnBackgroundObserver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1$lambda$0(BotVoiceFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getRouter().exit();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        requireActivity().getLifecycle().removeObserver(this.interruptSoundOnBackgroundObserver);
    }

    public final void chooseVoice(int i) {
        CheckArrayAdapter checkArrayAdapter = this.arrayAdapter;
        if (checkArrayAdapter != null) {
            checkArrayAdapter.check(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.ifriend.chat.presentation.ui.menu.botProfile.BotVoiceFragment$interruptSoundOnBackgroundObserver$1] */
    public BotVoiceFragment() {
        super(R.layout.fragment_bot_voice);
        BotVoiceFragment botVoiceFragment = this;
        this.binding$delegate = new ViewBindingDelegate(botVoiceFragment, Reflection.getOrCreateKotlinClass(FragmentBotVoiceBinding.class));
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new BotVoiceFragment$special$$inlined$viewModels$default$2(new BotVoiceFragment$special$$inlined$viewModels$default$1(botVoiceFragment)));
        this.viewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(botVoiceFragment, Reflection.getOrCreateKotlinClass(BotVoiceViewModel.class), new BotVoiceFragment$special$$inlined$viewModels$default$3(lazy), new BotVoiceFragment$special$$inlined$viewModels$default$4(null, lazy), new BotVoiceFragment$viewModel$2(this));
        this.interruptSoundOnBackgroundObserver = new DefaultLifecycleObserver() { // from class: com.ifriend.chat.presentation.ui.menu.botProfile.BotVoiceFragment$interruptSoundOnBackgroundObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(LifecycleOwner owner) {
                BotVoiceViewModel viewModel;
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(owner, "owner");
                viewModel = BotVoiceFragment.this.getViewModel();
                viewModel.cancelSounds();
            }
        };
    }
}
