package com.ifriend.chat.presentation.ui.menu.userProfile;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import by.kirich1409.viewbindingdelegate.FragmentViewBindings;
import by.kirich1409.viewbindingdelegate.ViewBindingProperty;
import by.kirich1409.viewbindingdelegate.internal.UtilsKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.databinding.FragmentUserProfileBinding;
import com.ifriend.chat.presentation.ui.AppActivity;
import com.ifriend.ui.base.BaseFragment;
import com.ifriend.ui.base.di.ViewModelFactory;
import com.ifriend.ui.utils.Modification;
import com.ifriend.ui.utils.extensions.ViewKt;
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
/* compiled from: UserProfileFragment.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001bH\u0016J\u0006\u0010\u001f\u001a\u00020\u001bR#\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006 "}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserProfileFragment;", "Lcom/ifriend/ui/base/BaseFragment;", "()V", "binding", "Lcom/ifriend/chat/presentation/databinding/FragmentUserProfileBinding;", "kotlin.jvm.PlatformType", "getBinding", "()Lcom/ifriend/chat/presentation/databinding/FragmentUserProfileBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "shouldReloadOnReconnect", "", "getShouldReloadOnReconnect", "()Z", "viewModel", "Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserProfileViewModel;", "getViewModel", "()Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserProfileViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewModelFactory", "Lcom/ifriend/ui/base/di/ViewModelFactory;", "getViewModelFactory", "()Lcom/ifriend/ui/base/di/ViewModelFactory;", "setViewModelFactory", "(Lcom/ifriend/ui/base/di/ViewModelFactory;)V", "init", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "onResume", "showLogoutDialog", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserProfileFragment extends BaseFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(UserProfileFragment.class, "binding", "getBinding()Lcom/ifriend/chat/presentation/databinding/FragmentUserProfileBinding;", 0))};
    public static final int $stable = 8;
    private final ViewBindingProperty binding$delegate;
    private final Lazy viewModel$delegate;
    @Inject
    public ViewModelFactory viewModelFactory;

    @Override // com.ifriend.ui.base.BaseFragment
    public boolean getShouldReloadOnReconnect() {
        return true;
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

    private final UserProfileViewModel getViewModel() {
        return (UserProfileViewModel) this.viewModel$delegate.getValue();
    }

    private final FragmentUserProfileBinding getBinding() {
        return (FragmentUserProfileBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.ifriend.ui.base.BaseFragment
    public void init(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.ifriend.chat.presentation.ui.AppActivity");
        ((AppActivity) activity).getDaggerComponent().inject(this);
        getViewModel().setFragment(this);
        getBinding().setVm(getViewModel());
        FragmentUserProfileBinding binding = getBinding();
        ImageView close = binding.close;
        Intrinsics.checkNotNullExpressionValue(close, "close");
        ViewKt.expandClickableArea$default(close, 0, 1, null);
        Modification modification = Modification.INSTANCE;
        ConstraintLayout name = binding.name;
        Intrinsics.checkNotNullExpressionValue(name, "name");
        modification.onTouchOpacity(name);
        Modification modification2 = Modification.INSTANCE;
        ConstraintLayout gender = binding.gender;
        Intrinsics.checkNotNullExpressionValue(gender, "gender");
        modification2.onTouchOpacity(gender);
        Modification modification3 = Modification.INSTANCE;
        ConstraintLayout age = binding.age;
        Intrinsics.checkNotNullExpressionValue(age, "age");
        modification3.onTouchOpacity(age);
        Modification modification4 = Modification.INSTANCE;
        ConstraintLayout premium = binding.premium;
        Intrinsics.checkNotNullExpressionValue(premium, "premium");
        modification4.onTouchOpacity(premium);
        Modification modification5 = Modification.INSTANCE;
        ConstraintLayout restorePurchases = binding.restorePurchases;
        Intrinsics.checkNotNullExpressionValue(restorePurchases, "restorePurchases");
        modification5.onTouchOpacity(restorePurchases);
        Modification modification6 = Modification.INSTANCE;
        ConstraintLayout logout = binding.logout;
        Intrinsics.checkNotNullExpressionValue(logout, "logout");
        modification6.onTouchOpacity(logout);
        Modification modification7 = Modification.INSTANCE;
        ConstraintLayout delete = binding.delete;
        Intrinsics.checkNotNullExpressionValue(delete, "delete");
        modification7.onTouchOpacity(delete);
    }

    public final void showLogoutDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle(getString(R.string.are_you_sure_you_want_to_log_out)).setCancelable(true).setPositiveButton(getString(R.string.log_out), new DialogInterface.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.menu.userProfile.UserProfileFragment$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                UserProfileFragment.showLogoutDialog$lambda$1(UserProfileFragment.this, dialogInterface, i);
            }
        }).setNegativeButton(getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.menu.userProfile.UserProfileFragment$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        builder.create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showLogoutDialog$lambda$1(UserProfileFragment this$0, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().startLogout();
    }

    @Override // com.ifriend.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getViewModel().init();
    }

    public UserProfileFragment() {
        super(R.layout.fragment_user_profile);
        UserProfileFragment userProfileFragment = this;
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new UserProfileFragment$special$$inlined$viewModels$default$2(new UserProfileFragment$special$$inlined$viewModels$default$1(userProfileFragment)));
        this.viewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(userProfileFragment, Reflection.getOrCreateKotlinClass(UserProfileViewModel.class), new UserProfileFragment$special$$inlined$viewModels$default$3(lazy), new UserProfileFragment$special$$inlined$viewModels$default$4(null, lazy), new UserProfileFragment$viewModel$2(this));
        this.binding$delegate = FragmentViewBindings.viewBindingFragmentWithCallbacks(userProfileFragment, new UserProfileFragment$special$$inlined$viewBindingFragment$default$1(), UtilsKt.emptyVbCallback());
    }
}
