package com.ifriend.chat.presentation.ui.menu.userProfile;

import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.databinding.FragmentUserAgeBinding;
import com.ifriend.chat.presentation.ui.AppActivity;
import com.ifriend.ui.base.BaseFragment;
import com.ifriend.ui.base.di.ViewModelFactory;
import com.ifriend.ui.calendar.CalendarPicker;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
/* compiled from: UserAgeFragment.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserAgeFragment;", "Lcom/ifriend/ui/base/BaseFragment;", "()V", "binding", "Lcom/ifriend/chat/presentation/databinding/FragmentUserAgeBinding;", "getBinding", "()Lcom/ifriend/chat/presentation/databinding/FragmentUserAgeBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "datePicker", "Lcom/ifriend/ui/calendar/CalendarPicker;", "getDatePicker", "()Lcom/ifriend/ui/calendar/CalendarPicker;", "setDatePicker", "(Lcom/ifriend/ui/calendar/CalendarPicker;)V", "viewModel", "Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserAgeViewModel;", "getViewModel", "()Lcom/ifriend/chat/presentation/ui/menu/userProfile/UserAgeViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewModelFactory", "Lcom/ifriend/ui/base/di/ViewModelFactory;", "getViewModelFactory", "()Lcom/ifriend/ui/base/di/ViewModelFactory;", "setViewModelFactory", "(Lcom/ifriend/ui/base/di/ViewModelFactory;)V", "init", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserAgeFragment extends BaseFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(UserAgeFragment.class, "binding", "getBinding()Lcom/ifriend/chat/presentation/databinding/FragmentUserAgeBinding;", 0))};
    public static final int $stable = 8;
    private final ReadOnlyProperty binding$delegate;
    public CalendarPicker datePicker;
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

    public final CalendarPicker getDatePicker() {
        CalendarPicker calendarPicker = this.datePicker;
        if (calendarPicker != null) {
            return calendarPicker;
        }
        Intrinsics.throwUninitializedPropertyAccessException("datePicker");
        return null;
    }

    public final void setDatePicker(CalendarPicker calendarPicker) {
        Intrinsics.checkNotNullParameter(calendarPicker, "<set-?>");
        this.datePicker = calendarPicker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentUserAgeBinding getBinding() {
        return (FragmentUserAgeBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UserAgeViewModel getViewModel() {
        return (UserAgeViewModel) this.viewModel$delegate.getValue();
    }

    @Override // com.ifriend.ui.base.BaseFragment
    public void init(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.ifriend.chat.presentation.ui.AppActivity");
        ((AppActivity) activity).getDaggerComponent().inject(this);
        getViewModel().setFragment(this);
        View findViewById = view.findViewById(R.id.date_picker);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        setDatePicker((CalendarPicker) findViewById);
        UserAgeFragment userAgeFragment = this;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(userAgeFragment), null, null, new UserAgeFragment$init$1(this, null), 3, null);
        LifecycleOwnerKt.getLifecycleScope(userAgeFragment).launchWhenResumed(new UserAgeFragment$init$2(this, null));
        getViewModel().init();
        FragmentUserAgeBinding binding = getBinding();
        binding.setVm(getViewModel());
        ImageView back = binding.back;
        Intrinsics.checkNotNullExpressionValue(back, "back");
        ViewKt.expandClickableArea$default(back, 0, 1, null);
        Modification modification = Modification.INSTANCE;
        ImageView back2 = binding.back;
        Intrinsics.checkNotNullExpressionValue(back2, "back");
        modification.onTouchOpacity(back2);
    }

    public UserAgeFragment() {
        super(R.layout.fragment_user_age);
        UserAgeFragment userAgeFragment = this;
        this.binding$delegate = new ViewBindingDelegate(userAgeFragment, Reflection.getOrCreateKotlinClass(FragmentUserAgeBinding.class));
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new UserAgeFragment$special$$inlined$viewModels$default$2(new UserAgeFragment$special$$inlined$viewModels$default$1(userAgeFragment)));
        this.viewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(userAgeFragment, Reflection.getOrCreateKotlinClass(UserAgeViewModel.class), new UserAgeFragment$special$$inlined$viewModels$default$3(lazy), new UserAgeFragment$special$$inlined$viewModels$default$4(null, lazy), new UserAgeFragment$viewModel$2(this));
    }
}
