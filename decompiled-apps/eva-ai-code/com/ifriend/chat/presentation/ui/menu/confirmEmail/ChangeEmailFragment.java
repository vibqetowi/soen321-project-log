package com.ifriend.chat.presentation.ui.menu.confirmEmail;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.databinding.FragmentChangeEmailBinding;
import com.ifriend.chat.presentation.ui.AppActivity;
import com.ifriend.ui.base.di.ViewModelFactory;
import com.ifriend.ui.base.mvvm.FragmentBaseView;
import com.ifriend.ui.utils.extensions.ViewKt;
import com.redmadrobot.extensions.viewbinding.ViewBindingDelegate;
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
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
/* compiled from: ChangeEmailFragment.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u001a\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0016\u0010\u001d\u001a\u00020\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0016J\u0010\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u0003H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00028TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006$"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/confirmEmail/ChangeEmailFragment;", "Lcom/ifriend/ui/base/mvvm/FragmentBaseView;", "Lcom/ifriend/chat/presentation/ui/menu/confirmEmail/ChangeEmailViewModel;", "Lcom/ifriend/chat/presentation/ui/menu/confirmEmail/ChangeEmailState;", "()V", "binding", "Lcom/ifriend/chat/presentation/databinding/FragmentChangeEmailBinding;", "getBinding", "()Lcom/ifriend/chat/presentation/databinding/FragmentChangeEmailBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "viewModel", "getViewModel", "()Lcom/ifriend/chat/presentation/ui/menu/confirmEmail/ChangeEmailViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewModelFactory", "Lcom/ifriend/ui/base/di/ViewModelFactory;", "getViewModelFactory", "()Lcom/ifriend/ui/base/di/ViewModelFactory;", "setViewModelFactory", "(Lcom/ifriend/ui/base/di/ViewModelFactory;)V", "initOnClickListeners", "", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showErrors", "errors", "", "", "showState", "state", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChangeEmailFragment extends FragmentBaseView<ChangeEmailViewModel, ChangeEmailState> {
    private final ReadOnlyProperty binding$delegate;
    private final Lazy viewModel$delegate;
    @Inject
    public ViewModelFactory viewModelFactory;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ChangeEmailFragment.class, "binding", "getBinding()Lcom/ifriend/chat/presentation/databinding/FragmentChangeEmailBinding;", 0))};
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView
    public void showErrors(List<? extends Throwable> errors) {
        Intrinsics.checkNotNullParameter(errors, "errors");
    }

    /* compiled from: ChangeEmailFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/confirmEmail/ChangeEmailFragment$Companion;", "", "()V", "newInstance", "Lcom/ifriend/chat/presentation/ui/menu/confirmEmail/ChangeEmailFragment;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ChangeEmailFragment newInstance() {
            return new ChangeEmailFragment();
        }
    }

    private final FragmentChangeEmailBinding getBinding() {
        return (FragmentChangeEmailBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
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

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView
    public ChangeEmailViewModel getViewModel() {
        return (ChangeEmailViewModel) this.viewModel$delegate.getValue();
    }

    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView
    public void showState(ChangeEmailState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        FragmentChangeEmailBinding binding = getBinding();
        TextView errorText = binding.errorText;
        Intrinsics.checkNotNullExpressionValue(errorText, "errorText");
        errorText.setVisibility(Intrinsics.areEqual((Object) state.isValid(), (Object) false) ? 0 : 8);
        binding.changeEmail.setActive(Intrinsics.areEqual((Object) state.isValid(), (Object) true));
    }

    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView, com.ifriend.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.ifriend.chat.presentation.ui.AppActivity");
        ((AppActivity) activity).getDaggerComponent().inject(this);
        FragmentChangeEmailBinding binding = getBinding();
        ImageView back = binding.back;
        Intrinsics.checkNotNullExpressionValue(back, "back");
        ViewKt.expandClickableArea$default(back, 0, 1, null);
        binding.back.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.menu.confirmEmail.ChangeEmailFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ChangeEmailFragment.onViewCreated$lambda$3$lambda$1(ChangeEmailFragment.this, view2);
            }
        });
        EditText editText = binding.editText;
        Intrinsics.checkNotNullExpressionValue(editText, "editText");
        editText.addTextChangedListener(new TextWatcher() { // from class: com.ifriend.chat.presentation.ui.menu.confirmEmail.ChangeEmailFragment$onViewCreated$lambda$3$$inlined$doOnTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                ChangeEmailFragment.this.getViewModel().setEmail(String.valueOf(charSequence));
            }
        });
        initOnClickListeners();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3$lambda$1(ChangeEmailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getRouter().exit();
    }

    private final void initOnClickListeners() {
        getBinding().changeEmail.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.menu.confirmEmail.ChangeEmailFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeEmailFragment.initOnClickListeners$lambda$5$lambda$4(ChangeEmailFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOnClickListeners$lambda$5$lambda$4(ChangeEmailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().changeEmail();
        this$0.getRouter().exit();
    }

    public ChangeEmailFragment() {
        super(R.layout.fragment_change_email);
        ChangeEmailFragment changeEmailFragment = this;
        this.binding$delegate = new ViewBindingDelegate(changeEmailFragment, Reflection.getOrCreateKotlinClass(FragmentChangeEmailBinding.class));
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new ChangeEmailFragment$special$$inlined$viewModels$default$2(new ChangeEmailFragment$special$$inlined$viewModels$default$1(changeEmailFragment)));
        this.viewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(changeEmailFragment, Reflection.getOrCreateKotlinClass(ChangeEmailViewModel.class), new ChangeEmailFragment$special$$inlined$viewModels$default$3(lazy), new ChangeEmailFragment$special$$inlined$viewModels$default$4(null, lazy), new ChangeEmailFragment$viewModel$2(this));
    }
}
