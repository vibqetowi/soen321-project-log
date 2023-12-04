package com.ifriend.chat.presentation.ui.menu.botProfile;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.databinding.FragmentBotNameBinding;
import com.ifriend.chat.presentation.ui.AppActivity;
import com.ifriend.domain.CoreAppRule;
import com.ifriend.ui.base.BaseFragment;
import com.ifriend.ui.base.di.ViewModelFactory;
import com.ifriend.ui.utils.UIHelper;
import com.ifriend.ui.utils.UIUtils;
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
/* compiled from: BotNameFragment.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotNameFragment;", "Lcom/ifriend/ui/base/BaseFragment;", "()V", "binding", "Lcom/ifriend/chat/presentation/databinding/FragmentBotNameBinding;", "getBinding", "()Lcom/ifriend/chat/presentation/databinding/FragmentBotNameBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "viewModelFactory", "Lcom/ifriend/ui/base/di/ViewModelFactory;", "getViewModelFactory", "()Lcom/ifriend/ui/base/di/ViewModelFactory;", "setViewModelFactory", "(Lcom/ifriend/ui/base/di/ViewModelFactory;)V", "onViewCreated", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BotNameFragment extends BaseFragment {
    private final ReadOnlyProperty binding$delegate;
    @Inject
    public ViewModelFactory viewModelFactory;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BotNameFragment.class, "binding", "getBinding()Lcom/ifriend/chat/presentation/databinding/FragmentBotNameBinding;", 0))};
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public BotNameFragment() {
        super(R.layout.fragment_bot_name);
        this.binding$delegate = new ViewBindingDelegate(this, Reflection.getOrCreateKotlinClass(FragmentBotNameBinding.class));
    }

    /* compiled from: BotNameFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotNameFragment$Companion;", "", "()V", "newInstance", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotNameFragment;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BotNameFragment newInstance() {
            Bundle bundle = new Bundle();
            BotNameFragment botNameFragment = new BotNameFragment();
            botNameFragment.setArguments(bundle);
            return botNameFragment;
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

    private final FragmentBotNameBinding getBinding() {
        return (FragmentBotNameBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.ifriend.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        getBinding().setLifecycleOwner(this);
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.ifriend.chat.presentation.ui.AppActivity");
        ((AppActivity) activity).getDaggerComponent().inject(this);
        BotNameViewModel botNameViewModel = (BotNameViewModel) new ViewModelProvider(this, getViewModelFactory()).get(BotNameViewModel.class);
        botNameViewModel.setFragment(this);
        botNameViewModel.init();
        getBinding().setVm(botNameViewModel);
        final FragmentBotNameBinding binding = getBinding();
        ImageView back = binding.back;
        Intrinsics.checkNotNullExpressionValue(back, "back");
        ViewKt.expandClickableArea$default(back, 0, 1, null);
        UIUtils uIUtils = UIUtils.INSTANCE;
        EditText editText = binding.editText;
        Intrinsics.checkNotNullExpressionValue(editText, "editText");
        uIUtils.setMaxLength(editText, CoreAppRule.INSTANCE.getNAME_LENGTH_LIMIT());
        binding.editText.setText(String.valueOf(botNameViewModel.getName().getValue()));
        UIUtils uIUtils2 = UIUtils.INSTANCE;
        EditText editText2 = binding.editText;
        Intrinsics.checkNotNullExpressionValue(editText2, "editText");
        uIUtils2.placeCursorToEnd(editText2);
        view.postDelayed(new Runnable() { // from class: com.ifriend.chat.presentation.ui.menu.botProfile.BotNameFragment$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                BotNameFragment.onViewCreated$lambda$2$lambda$0(FragmentBotNameBinding.this);
            }
        }, 100L);
        binding.back.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.menu.botProfile.BotNameFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BotNameFragment.onViewCreated$lambda$2$lambda$1(BotNameFragment.this, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2$lambda$0(FragmentBotNameBinding this_with) {
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        UIHelper uIHelper = UIHelper.INSTANCE;
        EditText editText = this_with.editText;
        Intrinsics.checkNotNullExpressionValue(editText, "editText");
        uIHelper.showKeyboard(editText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2$lambda$1(BotNameFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getRouter().exit();
    }
}
