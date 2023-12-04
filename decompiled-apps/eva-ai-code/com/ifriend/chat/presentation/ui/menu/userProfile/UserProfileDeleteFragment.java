package com.ifriend.chat.presentation.ui.menu.userProfile;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import by.kirich1409.viewbindingdelegate.FragmentViewBindings;
import by.kirich1409.viewbindingdelegate.ViewBindingProperty;
import by.kirich1409.viewbindingdelegate.internal.UtilsKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.databinding.FragmentUserProfileDeleteBinding;
import com.ifriend.chat.presentation.ui.AppActivity;
import com.ifriend.ui.base.BaseFragment;
import com.ifriend.ui.base.di.ViewModelFactory;
import com.ifriend.ui.button.AppButton;
import com.ifriend.ui.utils.DebouncedClickListenerKt;
import com.ifriend.ui.utils.Modification;
import com.ifriend.ui.utils.extensions.ViewKt;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: UserProfileDeleteFragment.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R#\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserProfileDeleteFragment;", "Lcom/ifriend/ui/base/BaseFragment;", "()V", "binding", "Lcom/ifriend/chat/presentation/databinding/FragmentUserProfileDeleteBinding;", "kotlin.jvm.PlatformType", "getBinding", "()Lcom/ifriend/chat/presentation/databinding/FragmentUserProfileDeleteBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "viewModelFactory", "Lcom/ifriend/ui/base/di/ViewModelFactory;", "getViewModelFactory", "()Lcom/ifriend/ui/base/di/ViewModelFactory;", "setViewModelFactory", "(Lcom/ifriend/ui/base/di/ViewModelFactory;)V", "vm", "Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserProfileDeleteViewModel;", "getVm", "()Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserProfileDeleteViewModel;", "vm$delegate", "Lkotlin/Lazy;", "deleteAccount", "", "init", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "showState", "state", "Lcom/ifriend/chat/presentation/ui/menu/userProfile/DeleteProfileState;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserProfileDeleteFragment extends BaseFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(UserProfileDeleteFragment.class, "binding", "getBinding()Lcom/ifriend/chat/presentation/databinding/FragmentUserProfileDeleteBinding;", 0))};
    public static final int $stable = 8;
    private final ViewBindingProperty binding$delegate;
    @Inject
    public ViewModelFactory viewModelFactory;
    private final Lazy vm$delegate;

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

    private final FragmentUserProfileDeleteBinding getBinding() {
        return (FragmentUserProfileDeleteBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UserProfileDeleteViewModel getVm() {
        return (UserProfileDeleteViewModel) this.vm$delegate.getValue();
    }

    @Override // com.ifriend.ui.base.BaseFragment
    public void init(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.ifriend.chat.presentation.ui.AppActivity");
        ((AppActivity) activity).getDaggerComponent().inject(this);
        getVm().setFragment(this);
        StateFlow<DeleteProfileState> state = getVm().getState();
        UserProfileDeleteFragment$init$1 userProfileDeleteFragment$init$1 = new UserProfileDeleteFragment$init$1(this);
        Lifecycle.State state2 = Lifecycle.State.STARTED;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new UserProfileDeleteFragment$init$$inlined$launchWithLifecycle$default$1(state, viewLifecycleOwner, state2, userProfileDeleteFragment$init$1, null), 3, null);
        getBinding().setVm(getVm());
        TextView deleteAccount = getBinding().deleteAccount;
        Intrinsics.checkNotNullExpressionValue(deleteAccount, "deleteAccount");
        DebouncedClickListenerKt.setDebouncedOnClickListener(deleteAccount, new UserProfileDeleteFragment$init$2(this));
        AppButton resetBot = getBinding().resetBot;
        Intrinsics.checkNotNullExpressionValue(resetBot, "resetBot");
        DebouncedClickListenerKt.setDebouncedOnClickListener(resetBot, new UserProfileDeleteFragment$init$3(this));
        ImageView imageView = getBinding().back;
        Intrinsics.checkNotNull(imageView);
        ImageView imageView2 = imageView;
        ViewKt.expandClickableArea$default(imageView2, 0, 1, null);
        Modification.INSTANCE.onTouchOpacity(imageView2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object init$showState(UserProfileDeleteFragment userProfileDeleteFragment, DeleteProfileState deleteProfileState, Continuation continuation) {
        userProfileDeleteFragment.showState(deleteProfileState);
        return Unit.INSTANCE;
    }

    private final void showState(DeleteProfileState deleteProfileState) {
        AppButton appButton = getBinding().resetBot;
        String string = getString(R.string.reset_bot, deleteProfileState.getBotName());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        appButton.setText(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteAccount() {
        AlertDialog create = new AlertDialog.Builder(getActivity()).create();
        create.setTitle(getString(R.string.confirm_delete_account_title));
        create.setButton(-1, getString(R.string.confirm_delete_account_confirm), new DialogInterface.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.menu.userProfile.UserProfileDeleteFragment$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                UserProfileDeleteFragment.deleteAccount$lambda$3$lambda$1(UserProfileDeleteFragment.this, dialogInterface, i);
            }
        });
        create.setButton(-2, getString(R.string.confirm_delete_account_cancel), new DialogInterface.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.menu.userProfile.UserProfileDeleteFragment$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        create.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void deleteAccount$lambda$3$lambda$1(UserProfileDeleteFragment this$0, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        dialogInterface.dismiss();
        this$0.getVm().deleteAccount();
    }

    public UserProfileDeleteFragment() {
        super(R.layout.fragment_user_profile_delete);
        UserProfileDeleteFragment userProfileDeleteFragment = this;
        this.binding$delegate = FragmentViewBindings.viewBindingFragmentWithCallbacks(userProfileDeleteFragment, new UserProfileDeleteFragment$special$$inlined$viewBindingFragment$default$1(), UtilsKt.emptyVbCallback());
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new UserProfileDeleteFragment$special$$inlined$viewModels$default$2(new UserProfileDeleteFragment$special$$inlined$viewModels$default$1(userProfileDeleteFragment)));
        this.vm$delegate = FragmentViewModelLazyKt.createViewModelLazy(userProfileDeleteFragment, Reflection.getOrCreateKotlinClass(UserProfileDeleteViewModel.class), new UserProfileDeleteFragment$special$$inlined$viewModels$default$3(lazy), new UserProfileDeleteFragment$special$$inlined$viewModels$default$4(null, lazy), new UserProfileDeleteFragment$vm$2(this));
    }
}
