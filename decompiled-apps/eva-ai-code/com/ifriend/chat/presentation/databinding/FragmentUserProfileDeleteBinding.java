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
import com.ifriend.chat.presentation.ui.menu.userProfile.UserProfileDeleteViewModel;
import com.ifriend.ui.button.AppButton;
/* loaded from: classes6.dex */
public abstract class FragmentUserProfileDeleteBinding extends ViewDataBinding {
    public final ImageView back;
    public final TextView deleteAccount;
    @Bindable
    protected UserProfileDeleteViewModel mVm;
    public final AppButton resetBot;
    public final TextView title;

    public abstract void setVm(UserProfileDeleteViewModel userProfileDeleteViewModel);

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentUserProfileDeleteBinding(Object obj, View view, int i, ImageView imageView, TextView textView, AppButton appButton, TextView textView2) {
        super(obj, view, i);
        this.back = imageView;
        this.deleteAccount = textView;
        this.resetBot = appButton;
        this.title = textView2;
    }

    public UserProfileDeleteViewModel getVm() {
        return this.mVm;
    }

    public static FragmentUserProfileDeleteBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentUserProfileDeleteBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentUserProfileDeleteBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_user_profile_delete, viewGroup, z, obj);
    }

    public static FragmentUserProfileDeleteBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentUserProfileDeleteBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentUserProfileDeleteBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_user_profile_delete, null, false, obj);
    }

    public static FragmentUserProfileDeleteBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentUserProfileDeleteBinding bind(View view, Object obj) {
        return (FragmentUserProfileDeleteBinding) bind(obj, view, R.layout.fragment_user_profile_delete);
    }
}
