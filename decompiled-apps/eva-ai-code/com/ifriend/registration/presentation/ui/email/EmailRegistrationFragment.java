package com.ifriend.registration.presentation.ui.email;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import by.kirich1409.viewbindingdelegate.FragmentViewBindings;
import by.kirich1409.viewbindingdelegate.ViewBindingProperty;
import by.kirich1409.viewbindingdelegate.internal.UtilsKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.base.navigation.impl.cicerone.ActivityScreen;
import com.ifriend.chat.api.AppActivityScreenFactory;
import com.ifriend.data.networking.OkHttpClientProviderKt;
import com.ifriend.registration.presentation.R;
import com.ifriend.registration.presentation.databinding.FragmentEmailRegistrationBinding;
import com.ifriend.registration.presentation.ui.RegistrationActivity;
import com.ifriend.registration.presentation.ui.email.resetPassword.ResetPasswordFragmentKt;
import com.ifriend.registration.presentation.ui.email.resetPassword.ResetPasswordScreen;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
/* compiled from: EmailRegistrationFragment.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u001dH\u0002J\b\u0010\"\u001a\u00020\u001dH\u0016J\b\u0010#\u001a\u00020\u001dH\u0016J\b\u0010$\u001a\u00020\u001dH\u0002J\b\u0010%\u001a\u00020\u001dH\u0002J\b\u0010&\u001a\u00020\u001dH\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR#\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006'"}, d2 = {"Lcom/ifriend/registration/presentation/ui/email/EmailRegistrationFragment;", "Lcom/ifriend/ui/base/BaseFragment;", "()V", "appActivityScreenFactory", "Lcom/ifriend/chat/api/AppActivityScreenFactory;", "getAppActivityScreenFactory", "()Lcom/ifriend/chat/api/AppActivityScreenFactory;", "setAppActivityScreenFactory", "(Lcom/ifriend/chat/api/AppActivityScreenFactory;)V", "binding", "Lcom/ifriend/registration/presentation/databinding/FragmentEmailRegistrationBinding;", "kotlin.jvm.PlatformType", "getBinding", "()Lcom/ifriend/registration/presentation/databinding/FragmentEmailRegistrationBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "viewModel", "Lcom/ifriend/registration/presentation/ui/email/EmailRegistrationViewModel;", "getViewModel", "()Lcom/ifriend/registration/presentation/ui/email/EmailRegistrationViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewModelFactory", "Lcom/ifriend/ui/base/di/ViewModelFactory;", "getViewModelFactory", "()Lcom/ifriend/ui/base/di/ViewModelFactory;", "setViewModelFactory", "(Lcom/ifriend/ui/base/di/ViewModelFactory;)V", "hideError", "", "init", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "navigateNext", "onResume", "onStop", "setEditTextListeners", "setOnClickListeners", "showError", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EmailRegistrationFragment extends BaseFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EmailRegistrationFragment.class, "binding", "getBinding()Lcom/ifriend/registration/presentation/databinding/FragmentEmailRegistrationBinding;", 0))};
    public static final int $stable = 8;
    @Inject
    public AppActivityScreenFactory appActivityScreenFactory;
    private final ViewBindingProperty binding$delegate;
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

    public final AppActivityScreenFactory getAppActivityScreenFactory() {
        AppActivityScreenFactory appActivityScreenFactory = this.appActivityScreenFactory;
        if (appActivityScreenFactory != null) {
            return appActivityScreenFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appActivityScreenFactory");
        return null;
    }

    public final void setAppActivityScreenFactory(AppActivityScreenFactory appActivityScreenFactory) {
        Intrinsics.checkNotNullParameter(appActivityScreenFactory, "<set-?>");
        this.appActivityScreenFactory = appActivityScreenFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentEmailRegistrationBinding getBinding() {
        return (FragmentEmailRegistrationBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EmailRegistrationViewModel getViewModel() {
        return (EmailRegistrationViewModel) this.viewModel$delegate.getValue();
    }

    @Override // com.ifriend.ui.base.BaseFragment
    public void init(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.ifriend.registration.presentation.ui.RegistrationActivity");
        ((RegistrationActivity) activity).getDaggerComponent().inject(this);
        getBinding().next.setEnabled(false);
        EmailRegistrationFragment emailRegistrationFragment = this;
        getViewModel().isValid().observe(emailRegistrationFragment, new EmailRegistrationFragment$sam$androidx_lifecycle_Observer$0(new EmailRegistrationFragment$init$1(this)));
        getBinding().next.setActive(false);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(emailRegistrationFragment), null, null, new EmailRegistrationFragment$init$2(this, null), 3, null);
        FragmentKt.setFragmentResultListener(this, ResetPasswordFragmentKt.RESET_RESULT_KEY, new EmailRegistrationFragment$init$3(this));
        setEditTextListeners();
        setOnClickListeners();
        if (requireContext().getSharedPreferences(OkHttpClientProviderKt.DEBUG_KEY, 0).getBoolean(OkHttpClientProviderKt.DEBUG_KEY, false)) {
            getBinding().debug.setVisibility(0);
            getBinding().debug.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.registration.presentation.ui.email.EmailRegistrationFragment$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    EmailRegistrationFragment.init$lambda$0(EmailRegistrationFragment.this, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$0(EmailRegistrationFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getRouter().navigateTo(new DebugScreen());
    }

    @Override // com.ifriend.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getBinding().email.setText(getViewModel().getEmail().getValue());
        getBinding().password.setText(getViewModel().getPassword().getValue());
    }

    private final void setEditTextListeners() {
        FragmentEmailRegistrationBinding binding = getBinding();
        binding.email.doAfterTextChanged(getViewModel().getEmailChangedWatcher());
        binding.password.doAfterTextChanged(getViewModel().getPasswordChangedWatcher());
    }

    private final void setOnClickListeners() {
        final FragmentEmailRegistrationBinding binding = getBinding();
        ImageView back = binding.back;
        Intrinsics.checkNotNullExpressionValue(back, "back");
        ViewKt.expandClickableArea$default(back, 0, 1, null);
        Modification modification = Modification.INSTANCE;
        ImageView back2 = binding.back;
        Intrinsics.checkNotNullExpressionValue(back2, "back");
        modification.onTouchOpacity(back2);
        binding.back.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.registration.presentation.ui.email.EmailRegistrationFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmailRegistrationFragment.setOnClickListeners$lambda$5$lambda$2(EmailRegistrationFragment.this, view);
            }
        });
        binding.next.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.registration.presentation.ui.email.EmailRegistrationFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmailRegistrationFragment.setOnClickListeners$lambda$5$lambda$3(FragmentEmailRegistrationBinding.this, this, view);
            }
        });
        Modification modification2 = Modification.INSTANCE;
        TextView resetPassword = binding.resetPassword;
        Intrinsics.checkNotNullExpressionValue(resetPassword, "resetPassword");
        modification2.onTouchOpacity(resetPassword);
        binding.resetPassword.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.registration.presentation.ui.email.EmailRegistrationFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmailRegistrationFragment.setOnClickListeners$lambda$5$lambda$4(EmailRegistrationFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnClickListeners$lambda$5$lambda$2(EmailRegistrationFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getRouter().exit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnClickListeners$lambda$5$lambda$3(FragmentEmailRegistrationBinding fragmentEmailRegistrationBinding, EmailRegistrationFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        fragmentEmailRegistrationBinding.next.setLoading(true);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new EmailRegistrationFragment$setOnClickListeners$1$2$1(this$0, fragmentEmailRegistrationBinding, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnClickListeners$lambda$5$lambda$4(EmailRegistrationFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getRouter().navigateTo(new ResetPasswordScreen(this$0.getViewModel().getEmail().getValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateNext() {
        ActivityScreen appActivityScreen$default = AppActivityScreenFactory.DefaultImpls.appActivityScreen$default(getAppActivityScreenFactory(), null, 1, null);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        startActivity(appActivityScreen$default.createIntent(requireContext));
        requireActivity().finish();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        getBinding().email.hideKeyboard();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError() {
        TextView errorText = getBinding().errorText;
        Intrinsics.checkNotNullExpressionValue(errorText, "errorText");
        errorText.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideError() {
        TextView errorText = getBinding().errorText;
        Intrinsics.checkNotNullExpressionValue(errorText, "errorText");
        errorText.setVisibility(8);
    }

    public EmailRegistrationFragment() {
        super(R.layout.fragment_email_registration);
        EmailRegistrationFragment emailRegistrationFragment = this;
        this.binding$delegate = FragmentViewBindings.viewBindingFragmentWithCallbacks(emailRegistrationFragment, new EmailRegistrationFragment$special$$inlined$viewBindingFragment$default$1(), UtilsKt.emptyVbCallback());
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new EmailRegistrationFragment$special$$inlined$viewModels$default$2(new EmailRegistrationFragment$special$$inlined$viewModels$default$1(emailRegistrationFragment)));
        this.viewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(emailRegistrationFragment, Reflection.getOrCreateKotlinClass(EmailRegistrationViewModel.class), new EmailRegistrationFragment$special$$inlined$viewModels$default$3(lazy), new EmailRegistrationFragment$special$$inlined$viewModels$default$4(null, lazy), new EmailRegistrationFragment$viewModel$2(this));
    }
}
