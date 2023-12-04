package com.ifriend.chat.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.ui.menu.userProfile.UserGenderViewModel;
import com.ifriend.ui.button.AppButton;
/* loaded from: classes6.dex */
public abstract class FragmentUserGenderBinding extends ViewDataBinding {
    public final ImageView back;
    public final ImageView check1;
    public final ImageView check2;
    public final ImageView check3;
    public final ConstraintLayout female;
    public final TextView femaleText;
    @Bindable
    protected UserGenderViewModel mVm;
    public final ConstraintLayout male;
    public final TextView maleText;
    public final TextView name;
    public final ConstraintLayout nonBinary;
    public final TextView nonBinaryText;
    public final AppButton save;

    public abstract void setVm(UserGenderViewModel userGenderViewModel);

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentUserGenderBinding(Object obj, View view, int i, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ConstraintLayout constraintLayout, TextView textView, ConstraintLayout constraintLayout2, TextView textView2, TextView textView3, ConstraintLayout constraintLayout3, TextView textView4, AppButton appButton) {
        super(obj, view, i);
        this.back = imageView;
        this.check1 = imageView2;
        this.check2 = imageView3;
        this.check3 = imageView4;
        this.female = constraintLayout;
        this.femaleText = textView;
        this.male = constraintLayout2;
        this.maleText = textView2;
        this.name = textView3;
        this.nonBinary = constraintLayout3;
        this.nonBinaryText = textView4;
        this.save = appButton;
    }

    public UserGenderViewModel getVm() {
        return this.mVm;
    }

    public static FragmentUserGenderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentUserGenderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentUserGenderBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_user_gender, viewGroup, z, obj);
    }

    public static FragmentUserGenderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentUserGenderBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentUserGenderBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_user_gender, null, false, obj);
    }

    public static FragmentUserGenderBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentUserGenderBinding bind(View view, Object obj) {
        return (FragmentUserGenderBinding) bind(obj, view, R.layout.fragment_user_gender);
    }
}
