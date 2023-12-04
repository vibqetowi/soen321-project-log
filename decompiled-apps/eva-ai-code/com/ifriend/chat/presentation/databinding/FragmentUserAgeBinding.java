package com.ifriend.chat.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.ui.menu.userProfile.UserAgeViewModel;
import com.ifriend.ui.button.AppButton;
import com.ifriend.ui.calendar.CalendarPicker;
/* loaded from: classes6.dex */
public abstract class FragmentUserAgeBinding extends ViewDataBinding {
    public final ImageView back;
    public final CalendarPicker datePicker;
    @Bindable
    protected UserAgeViewModel mVm;
    public final TextView name;
    public final AppButton save;

    public abstract void setVm(UserAgeViewModel userAgeViewModel);

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentUserAgeBinding(Object obj, View view, int i, ImageView imageView, CalendarPicker calendarPicker, TextView textView, AppButton appButton) {
        super(obj, view, i);
        this.back = imageView;
        this.datePicker = calendarPicker;
        this.name = textView;
        this.save = appButton;
    }

    public UserAgeViewModel getVm() {
        return this.mVm;
    }

    public static FragmentUserAgeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentUserAgeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentUserAgeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_user_age, viewGroup, z, obj);
    }

    public static FragmentUserAgeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentUserAgeBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentUserAgeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_user_age, null, false, obj);
    }

    public static FragmentUserAgeBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentUserAgeBinding bind(View view, Object obj) {
        return (FragmentUserAgeBinding) bind(obj, view, R.layout.fragment_user_age);
    }
}
