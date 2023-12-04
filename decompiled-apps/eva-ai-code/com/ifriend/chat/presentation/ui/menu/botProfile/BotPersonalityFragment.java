package com.ifriend.chat.presentation.ui.menu.botProfile;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.databinding.FragmentBotPersonalityBinding;
import com.ifriend.chat.presentation.ui.AppActivity;
import com.ifriend.ui.base.BaseFragment;
import com.ifriend.ui.base.di.ViewModelFactory;
import com.ifriend.ui.utils.Modification;
import com.ifriend.ui.utils.extensions.ViewKt;
import com.redmadrobot.extensions.viewbinding.ViewBindingDelegate;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
/* compiled from: BotPersonalityFragment.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotPersonalityFragment;", "Lcom/ifriend/ui/base/BaseFragment;", "()V", "binding", "Lcom/ifriend/chat/presentation/databinding/FragmentBotPersonalityBinding;", "getBinding", "()Lcom/ifriend/chat/presentation/databinding/FragmentBotPersonalityBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "viewModelFactory", "Lcom/ifriend/ui/base/di/ViewModelFactory;", "getViewModelFactory", "()Lcom/ifriend/ui/base/di/ViewModelFactory;", "setViewModelFactory", "(Lcom/ifriend/ui/base/di/ViewModelFactory;)V", "onViewCreated", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BotPersonalityFragment extends BaseFragment {
    private final ReadOnlyProperty binding$delegate;
    @Inject
    public ViewModelFactory viewModelFactory;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BotPersonalityFragment.class, "binding", "getBinding()Lcom/ifriend/chat/presentation/databinding/FragmentBotPersonalityBinding;", 0))};
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public BotPersonalityFragment() {
        super(R.layout.fragment_bot_personality);
        this.binding$delegate = new ViewBindingDelegate(this, Reflection.getOrCreateKotlinClass(FragmentBotPersonalityBinding.class));
    }

    /* compiled from: BotPersonalityFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotPersonalityFragment$Companion;", "", "()V", "newInstance", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotPersonalityFragment;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BotPersonalityFragment newInstance() {
            return new BotPersonalityFragment();
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

    private final FragmentBotPersonalityBinding getBinding() {
        return (FragmentBotPersonalityBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.ifriend.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        getBinding().setLifecycleOwner(this);
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.ifriend.chat.presentation.ui.AppActivity");
        ((AppActivity) activity).getDaggerComponent().inject(this);
        BotPersonalityViewModel botPersonalityViewModel = (BotPersonalityViewModel) new ViewModelProvider(this, getViewModelFactory()).get(BotPersonalityViewModel.class);
        botPersonalityViewModel.setFragment(this);
        botPersonalityViewModel.init();
        getBinding().setVm(botPersonalityViewModel);
        FragmentBotPersonalityBinding binding = getBinding();
        ImageView back = binding.back;
        Intrinsics.checkNotNullExpressionValue(back, "back");
        ViewKt.expandClickableArea$default(back, 0, 1, null);
        Modification modification = Modification.INSTANCE;
        ConstraintLayout flirty = binding.flirty;
        Intrinsics.checkNotNullExpressionValue(flirty, "flirty");
        modification.onTouchOpacity(flirty);
        Modification modification2 = Modification.INSTANCE;
        ConstraintLayout friendly = binding.friendly;
        Intrinsics.checkNotNullExpressionValue(friendly, "friendly");
        modification2.onTouchOpacity(friendly);
        binding.save.setActive(false);
        getBinding().back.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.menu.botProfile.BotPersonalityFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BotPersonalityFragment.onViewCreated$lambda$1$lambda$0(BotPersonalityFragment.this, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1$lambda$0(BotPersonalityFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getRouter().exit();
    }
}
