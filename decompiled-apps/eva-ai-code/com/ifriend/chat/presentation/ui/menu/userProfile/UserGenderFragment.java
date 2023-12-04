package com.ifriend.chat.presentation.ui.menu.userProfile;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.databinding.FragmentUserGenderBinding;
import com.ifriend.chat.presentation.ui.AppActivity;
import com.ifriend.ui.base.BaseFragment;
import com.ifriend.ui.base.di.ViewModelFactory;
import com.ifriend.ui.utils.Modification;
import com.ifriend.ui.utils.extensions.ViewKt;
import com.redmadrobot.extensions.viewbinding.ViewBindingDelegate;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
/* compiled from: UserGenderFragment.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0002J\b\u0010\u001a\u001a\u00020\u0016H\u0002J\b\u0010\u001b\u001a\u00020\u0016H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001c"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserGenderFragment;", "Lcom/ifriend/ui/base/BaseFragment;", "()V", "binding", "Lcom/ifriend/chat/presentation/databinding/FragmentUserGenderBinding;", "getBinding", "()Lcom/ifriend/chat/presentation/databinding/FragmentUserGenderBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "viewModel", "Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserGenderViewModel;", "getViewModel", "()Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserGenderViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewModelFactory", "Lcom/ifriend/ui/base/di/ViewModelFactory;", "getViewModelFactory", "()Lcom/ifriend/ui/base/di/ViewModelFactory;", "setViewModelFactory", "(Lcom/ifriend/ui/base/di/ViewModelFactory;)V", "init", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "showFemaleCheck", "showMaleCheck", "showNonBinaryCheck", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserGenderFragment extends BaseFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(UserGenderFragment.class, "binding", "getBinding()Lcom/ifriend/chat/presentation/databinding/FragmentUserGenderBinding;", 0))};
    public static final int $stable = 8;
    private final ReadOnlyProperty binding$delegate;
    private final Lazy viewModel$delegate;
    @Inject
    public ViewModelFactory viewModelFactory;

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
    public final FragmentUserGenderBinding getBinding() {
        return (FragmentUserGenderBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UserGenderViewModel getViewModel() {
        return (UserGenderViewModel) this.viewModel$delegate.getValue();
    }

    @Override // com.ifriend.ui.base.BaseFragment
    public void init(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.ifriend.chat.presentation.ui.AppActivity");
        ((AppActivity) activity).getDaggerComponent().inject(this);
        getViewModel().setFragment(this);
        getViewModel().init();
        FragmentUserGenderBinding binding = getBinding();
        binding.setVm(getViewModel());
        ImageView back = binding.back;
        Intrinsics.checkNotNullExpressionValue(back, "back");
        ViewKt.expandClickableArea$default(back, 0, 1, null);
        Modification modification = Modification.INSTANCE;
        ImageView back2 = binding.back;
        Intrinsics.checkNotNullExpressionValue(back2, "back");
        modification.onTouchOpacity(back2);
        Modification modification2 = Modification.INSTANCE;
        ConstraintLayout female = binding.female;
        Intrinsics.checkNotNullExpressionValue(female, "female");
        modification2.onTouchOpacity(female);
        binding.female.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.menu.userProfile.UserGenderFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UserGenderFragment.init$lambda$3$lambda$0(UserGenderFragment.this, view2);
            }
        });
        Modification modification3 = Modification.INSTANCE;
        ConstraintLayout male = binding.male;
        Intrinsics.checkNotNullExpressionValue(male, "male");
        modification3.onTouchOpacity(male);
        binding.male.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.menu.userProfile.UserGenderFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UserGenderFragment.init$lambda$3$lambda$1(UserGenderFragment.this, view2);
            }
        });
        Modification modification4 = Modification.INSTANCE;
        ConstraintLayout nonBinary = binding.nonBinary;
        Intrinsics.checkNotNullExpressionValue(nonBinary, "nonBinary");
        modification4.onTouchOpacity(nonBinary);
        binding.nonBinary.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.menu.userProfile.UserGenderFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UserGenderFragment.init$lambda$3$lambda$2(UserGenderFragment.this, view2);
            }
        });
        UserGenderFragment userGenderFragment = this;
        LifecycleOwnerKt.getLifecycleScope(userGenderFragment).launchWhenResumed(new UserGenderFragment$init$2(this, null));
        LifecycleOwnerKt.getLifecycleScope(userGenderFragment).launchWhenResumed(new UserGenderFragment$init$3(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$3$lambda$0(UserGenderFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().femaleClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$3$lambda$1(UserGenderFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().maleClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$3$lambda$2(UserGenderFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().nonBinaryClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showMaleCheck() {
        ImageView check1 = getBinding().check1;
        Intrinsics.checkNotNullExpressionValue(check1, "check1");
        check1.setVisibility(4);
        ImageView check2 = getBinding().check2;
        Intrinsics.checkNotNullExpressionValue(check2, "check2");
        check2.setVisibility(0);
        ImageView check3 = getBinding().check3;
        Intrinsics.checkNotNullExpressionValue(check3, "check3");
        check3.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showFemaleCheck() {
        ImageView check1 = getBinding().check1;
        Intrinsics.checkNotNullExpressionValue(check1, "check1");
        check1.setVisibility(0);
        ImageView check2 = getBinding().check2;
        Intrinsics.checkNotNullExpressionValue(check2, "check2");
        check2.setVisibility(4);
        ImageView check3 = getBinding().check3;
        Intrinsics.checkNotNullExpressionValue(check3, "check3");
        check3.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNonBinaryCheck() {
        ImageView check1 = getBinding().check1;
        Intrinsics.checkNotNullExpressionValue(check1, "check1");
        check1.setVisibility(4);
        ImageView check2 = getBinding().check2;
        Intrinsics.checkNotNullExpressionValue(check2, "check2");
        check2.setVisibility(4);
        ImageView check3 = getBinding().check3;
        Intrinsics.checkNotNullExpressionValue(check3, "check3");
        check3.setVisibility(0);
    }

    public UserGenderFragment() {
        super(R.layout.fragment_user_gender);
        UserGenderFragment userGenderFragment = this;
        this.binding$delegate = new ViewBindingDelegate(userGenderFragment, Reflection.getOrCreateKotlinClass(FragmentUserGenderBinding.class));
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new UserGenderFragment$special$$inlined$viewModels$default$2(new UserGenderFragment$special$$inlined$viewModels$default$1(userGenderFragment)));
        this.viewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(userGenderFragment, Reflection.getOrCreateKotlinClass(UserGenderViewModel.class), new UserGenderFragment$special$$inlined$viewModels$default$3(lazy), new UserGenderFragment$special$$inlined$viewModels$default$4(null, lazy), new UserGenderFragment$viewModel$2(this));
    }
}
