package com.ifriend.chat.presentation.ui.menu.botProfile;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.databinding.FragmentBotEthnicityBinding;
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
/* compiled from: BotEthnicityFragment.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotEthnicityFragment;", "Lcom/ifriend/ui/base/BaseFragment;", "()V", "binding", "Lcom/ifriend/chat/presentation/databinding/FragmentBotEthnicityBinding;", "getBinding", "()Lcom/ifriend/chat/presentation/databinding/FragmentBotEthnicityBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "viewModelFactory", "Lcom/ifriend/ui/base/di/ViewModelFactory;", "getViewModelFactory", "()Lcom/ifriend/ui/base/di/ViewModelFactory;", "setViewModelFactory", "(Lcom/ifriend/ui/base/di/ViewModelFactory;)V", "onViewCreated", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BotEthnicityFragment extends BaseFragment {
    private final ReadOnlyProperty binding$delegate;
    @Inject
    public ViewModelFactory viewModelFactory;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BotEthnicityFragment.class, "binding", "getBinding()Lcom/ifriend/chat/presentation/databinding/FragmentBotEthnicityBinding;", 0))};
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public BotEthnicityFragment() {
        super(R.layout.fragment_bot_ethnicity);
        this.binding$delegate = new ViewBindingDelegate(this, Reflection.getOrCreateKotlinClass(FragmentBotEthnicityBinding.class));
    }

    /* compiled from: BotEthnicityFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotEthnicityFragment$Companion;", "", "()V", "newInstance", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotEthnicityFragment;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BotEthnicityFragment newInstance() {
            return new BotEthnicityFragment();
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

    private final FragmentBotEthnicityBinding getBinding() {
        return (FragmentBotEthnicityBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.ifriend.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        getBinding().setLifecycleOwner(this);
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.ifriend.chat.presentation.ui.AppActivity");
        ((AppActivity) activity).getDaggerComponent().inject(this);
        BotEthnicityViewModel botEthnicityViewModel = (BotEthnicityViewModel) new ViewModelProvider(this, getViewModelFactory()).get(BotEthnicityViewModel.class);
        botEthnicityViewModel.setFragment(this);
        botEthnicityViewModel.init();
        getBinding().setVm(botEthnicityViewModel);
        FragmentBotEthnicityBinding binding = getBinding();
        ImageView back = binding.back;
        Intrinsics.checkNotNullExpressionValue(back, "back");
        ViewKt.expandClickableArea$default(back, 0, 1, null);
        Modification modification = Modification.INSTANCE;
        ConstraintLayout asian = binding.asian;
        Intrinsics.checkNotNullExpressionValue(asian, "asian");
        modification.onTouchOpacity(asian);
        Modification modification2 = Modification.INSTANCE;
        ConstraintLayout white = binding.white;
        Intrinsics.checkNotNullExpressionValue(white, "white");
        modification2.onTouchOpacity(white);
        Modification modification3 = Modification.INSTANCE;
        ConstraintLayout latino = binding.latino;
        Intrinsics.checkNotNullExpressionValue(latino, "latino");
        modification3.onTouchOpacity(latino);
        Modification modification4 = Modification.INSTANCE;
        ConstraintLayout black = binding.black;
        Intrinsics.checkNotNullExpressionValue(black, "black");
        modification4.onTouchOpacity(black);
        Modification modification5 = Modification.INSTANCE;
        ConstraintLayout other = binding.other;
        Intrinsics.checkNotNullExpressionValue(other, "other");
        modification5.onTouchOpacity(other);
        binding.save.setActive(false);
        binding.back.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.menu.botProfile.BotEthnicityFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BotEthnicityFragment.onViewCreated$lambda$1$lambda$0(BotEthnicityFragment.this, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1$lambda$0(BotEthnicityFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getRouter().exit();
    }
}
