package com.ifriend.registration.presentation.ui.email.resetPassword;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import by.kirich1409.viewbindingdelegate.FragmentViewBindings;
import by.kirich1409.viewbindingdelegate.ViewBindingProperty;
import by.kirich1409.viewbindingdelegate.internal.UtilsKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.registration.presentation.R;
import com.ifriend.registration.presentation.databinding.FragmentResetPasswordBinding;
import com.ifriend.registration.presentation.ui.RegistrationActivity;
import com.ifriend.ui.base.di.ViewModelFactory;
import com.ifriend.ui.base.mvvm.BaseEvent;
import com.ifriend.ui.base.mvvm.FragmentBaseView;
import com.ifriend.ui.utils.Modification;
import com.ifriend.ui.utils.extensions.ViewKt;
import java.util.List;
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
/* compiled from: ResetPasswordFragment.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001(B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u001a\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0016\u0010\u001f\u001a\u00020\u00182\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H\u0016J\u0010\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020%H\u0014J\u0010\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u0003H\u0016R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\u00028TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006)"}, d2 = {"Lcom/ifriend/registration/presentation/ui/email/resetPassword/ResetPasswordFragment;", "Lcom/ifriend/ui/base/mvvm/FragmentBaseView;", "Lcom/ifriend/registration/presentation/ui/email/resetPassword/ResetPasswordViewModel;", "Lcom/ifriend/registration/presentation/ui/email/resetPassword/ResetPasswordState;", "()V", "binding", "Lcom/ifriend/registration/presentation/databinding/FragmentResetPasswordBinding;", "kotlin.jvm.PlatformType", "getBinding", "()Lcom/ifriend/registration/presentation/databinding/FragmentResetPasswordBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "viewModel", "getViewModel", "()Lcom/ifriend/registration/presentation/ui/email/resetPassword/ResetPasswordViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewModelFactory", "Lcom/ifriend/ui/base/di/ViewModelFactory;", "getViewModelFactory", "()Lcom/ifriend/ui/base/di/ViewModelFactory;", "setViewModelFactory", "(Lcom/ifriend/ui/base/di/ViewModelFactory;)V", "onPasswordReset", "", "onStop", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showErrors", "errors", "", "", "showEvent", NotificationCompat.CATEGORY_EVENT, "Lcom/ifriend/ui/base/mvvm/BaseEvent;", "showState", "state", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ResetPasswordFragment extends FragmentBaseView<ResetPasswordViewModel, ResetPasswordState> {
    private final ViewBindingProperty binding$delegate;
    private final Lazy viewModel$delegate;
    @Inject
    public ViewModelFactory viewModelFactory;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ResetPasswordFragment.class, "binding", "getBinding()Lcom/ifriend/registration/presentation/databinding/FragmentResetPasswordBinding;", 0))};
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView
    public void showErrors(List<? extends Throwable> errors) {
        Intrinsics.checkNotNullParameter(errors, "errors");
    }

    /* compiled from: ResetPasswordFragment.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/registration/presentation/ui/email/resetPassword/ResetPasswordFragment$Companion;", "", "()V", "newInstance", "Lcom/ifriend/registration/presentation/ui/email/resetPassword/ResetPasswordFragment;", "email", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ResetPasswordFragment newInstance(String email) {
            Intrinsics.checkNotNullParameter(email, "email");
            ResetPasswordFragment resetPasswordFragment = new ResetPasswordFragment();
            resetPasswordFragment.setArguments(BundleKt.bundleOf(TuplesKt.to("email", email)));
            return resetPasswordFragment;
        }
    }

    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView
    public void showState(ResetPasswordState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        getBinding().email.setEnabled(!state.isLoading());
        getBinding().resetButton.setLoading(state.isLoading());
        if (state.isLoading()) {
            return;
        }
        if (!getBinding().email.hasFocus()) {
            getBinding().email.setText(state.getEmail());
        }
        getBinding().resetButton.setActive(state.isEmailValid());
        TextView errorText = getBinding().errorText;
        Intrinsics.checkNotNullExpressionValue(errorText, "errorText");
        errorText.setVisibility(4);
    }

    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView
    protected void showEvent(BaseEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof PasswordResetEvent) {
            onPasswordReset();
        } else if (event instanceof EmailNotFoundEvent) {
            TextView errorText = getBinding().errorText;
            Intrinsics.checkNotNullExpressionValue(errorText, "errorText");
            errorText.setVisibility(0);
        }
    }

    private final void onPasswordReset() {
        FragmentKt.setFragmentResult(this, ResetPasswordFragmentKt.RESET_RESULT_KEY, BundleKt.bundleOf(TuplesKt.to(ResetPasswordFragmentKt.RESET_EMAIL_KEY, getViewModel().currentState().getEmail())));
        getRouter().exit();
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

    private final FragmentResetPasswordBinding getBinding() {
        return (FragmentResetPasswordBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView
    public ResetPasswordViewModel getViewModel() {
        return (ResetPasswordViewModel) this.viewModel$delegate.getValue();
    }

    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView, com.ifriend.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String string;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.ifriend.registration.presentation.ui.RegistrationActivity");
        ((RegistrationActivity) activity).getDaggerComponent().inject(this);
        FragmentResetPasswordBinding binding = getBinding();
        binding.email.doAfterTextChanged(new ResetPasswordFragment$onViewCreated$1$1(this));
        ImageView back = binding.back;
        Intrinsics.checkNotNullExpressionValue(back, "back");
        ViewKt.expandClickableArea$default(back, 0, 1, null);
        Modification modification = Modification.INSTANCE;
        ImageView back2 = binding.back;
        Intrinsics.checkNotNullExpressionValue(back2, "back");
        modification.onTouchOpacity(back2);
        binding.back.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.registration.presentation.ui.email.resetPassword.ResetPasswordFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ResetPasswordFragment.onViewCreated$lambda$3$lambda$1(ResetPasswordFragment.this, view2);
            }
        });
        binding.resetButton.setActive(false);
        binding.resetButton.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.registration.presentation.ui.email.resetPassword.ResetPasswordFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ResetPasswordFragment.onViewCreated$lambda$3$lambda$2(ResetPasswordFragment.this, view2);
            }
        });
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("email")) == null) {
            return;
        }
        getViewModel().changeEmail(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3$lambda$1(ResetPasswordFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getRouter().exit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3$lambda$2(ResetPasswordFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().resetEmail();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        getBinding().email.hideKeyboard();
    }

    public ResetPasswordFragment() {
        super(R.layout.fragment_reset_password);
        ResetPasswordFragment resetPasswordFragment = this;
        this.binding$delegate = FragmentViewBindings.viewBindingFragmentWithCallbacks(resetPasswordFragment, new ResetPasswordFragment$special$$inlined$viewBindingFragment$default$1(), UtilsKt.emptyVbCallback());
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new ResetPasswordFragment$special$$inlined$viewModels$default$2(new ResetPasswordFragment$special$$inlined$viewModels$default$1(resetPasswordFragment)));
        this.viewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(resetPasswordFragment, Reflection.getOrCreateKotlinClass(ResetPasswordViewModel.class), new ResetPasswordFragment$special$$inlined$viewModels$default$3(lazy), new ResetPasswordFragment$special$$inlined$viewModels$default$4(null, lazy), new ResetPasswordFragment$viewModel$2(this));
    }
}
