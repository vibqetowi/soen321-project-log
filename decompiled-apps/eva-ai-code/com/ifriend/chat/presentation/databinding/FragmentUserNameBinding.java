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
import com.ifriend.chat.presentation.ui.menu.userProfile.UserNameViewModel;
import com.ifriend.ui.button.AppButton;
import com.ifriend.ui.editText.WhiteEditText;
/* loaded from: classes6.dex */
public abstract class FragmentUserNameBinding extends ViewDataBinding {
    public final ImageView back;
    public final WhiteEditText editText;
    @Bindable
    protected UserNameViewModel mVm;
    public final TextView name;
    public final AppButton save;

    public abstract void setVm(UserNameViewModel userNameViewModel);

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentUserNameBinding(Object obj, View view, int i, ImageView imageView, WhiteEditText whiteEditText, TextView textView, AppButton appButton) {
        super(obj, view, i);
        this.back = imageView;
        this.editText = whiteEditText;
        this.name = textView;
        this.save = appButton;
    }

    public UserNameViewModel getVm() {
        return this.mVm;
    }

    public static FragmentUserNameBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentUserNameBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentUserNameBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_user_name, viewGroup, z, obj);
    }

    public static FragmentUserNameBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentUserNameBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentUserNameBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_user_name, null, false, obj);
    }

    public static FragmentUserNameBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentUserNameBinding bind(View view, Object obj) {
        return (FragmentUserNameBinding) bind(obj, view, R.layout.fragment_user_name);
    }
}
