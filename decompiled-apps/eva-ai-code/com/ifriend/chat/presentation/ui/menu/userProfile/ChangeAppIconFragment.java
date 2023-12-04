package com.ifriend.chat.presentation.ui.menu.userProfile;

import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.databinding.FragmentChangeAppIconBinding;
import com.ifriend.chat.presentation.ui.AppActivity;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
/* compiled from: ChangeAppIconFragment.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/userProfile/ChangeAppIconFragment;", "Lcom/ifriend/ui/base/BaseFragment;", "()V", "binding", "Lcom/ifriend/chat/presentation/databinding/FragmentChangeAppIconBinding;", "getBinding", "()Lcom/ifriend/chat/presentation/databinding/FragmentChangeAppIconBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "viewModel", "Lcom/ifriend/chat/presentation/ui/menu/userProfile/ChangeAppIconViewModel;", "getViewModel", "()Lcom/ifriend/chat/presentation/ui/menu/userProfile/ChangeAppIconViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewModelFactory", "Lcom/ifriend/ui/base/di/ViewModelFactory;", "getViewModelFactory", "()Lcom/ifriend/ui/base/di/ViewModelFactory;", "setViewModelFactory", "(Lcom/ifriend/ui/base/di/ViewModelFactory;)V", "init", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChangeAppIconFragment extends BaseFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ChangeAppIconFragment.class, "binding", "getBinding()Lcom/ifriend/chat/presentation/databinding/FragmentChangeAppIconBinding;", 0))};
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

    private final FragmentChangeAppIconBinding getBinding() {
        return (FragmentChangeAppIconBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    private final ChangeAppIconViewModel getViewModel() {
        return (ChangeAppIconViewModel) this.viewModel$delegate.getValue();
    }

    @Override // com.ifriend.ui.base.BaseFragment
    public void init(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.ifriend.chat.presentation.ui.AppActivity");
        ((AppActivity) activity).getDaggerComponent().inject(this);
        getViewModel().setFragment(this);
        getBinding().setVm(getViewModel());
        ImageView back = getBinding().back;
        Intrinsics.checkNotNullExpressionValue(back, "back");
        ViewKt.expandClickableArea$default(back, 0, 1, null);
    }

    public ChangeAppIconFragment() {
        super(R.layout.fragment_change_app_icon);
        ChangeAppIconFragment changeAppIconFragment = this;
        this.binding$delegate = new ViewBindingDelegate(changeAppIconFragment, Reflection.getOrCreateKotlinClass(FragmentChangeAppIconBinding.class));
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new ChangeAppIconFragment$special$$inlined$viewModels$default$2(new ChangeAppIconFragment$special$$inlined$viewModels$default$1(changeAppIconFragment)));
        this.viewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(changeAppIconFragment, Reflection.getOrCreateKotlinClass(ChangeAppIconViewModel.class), new ChangeAppIconFragment$special$$inlined$viewModels$default$3(lazy), new ChangeAppIconFragment$special$$inlined$viewModels$default$4(null, lazy), new ChangeAppIconFragment$viewModel$2(this));
    }
}
