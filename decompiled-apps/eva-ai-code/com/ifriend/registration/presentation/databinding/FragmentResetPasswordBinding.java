package com.ifriend.registration.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.ifriend.registration.presentation.R;
import com.ifriend.ui.button.AppButton;
import com.ifriend.ui.editText.DarkEditText;
/* loaded from: classes6.dex */
public abstract class FragmentResetPasswordBinding extends ViewDataBinding {
    public final ImageView back;
    public final TextView description;
    public final DarkEditText email;
    public final TextView errorText;
    public final AppButton resetButton;
    public final TextView resetPassword;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentResetPasswordBinding(Object obj, View view, int i, ImageView imageView, TextView textView, DarkEditText darkEditText, TextView textView2, AppButton appButton, TextView textView3) {
        super(obj, view, i);
        this.back = imageView;
        this.description = textView;
        this.email = darkEditText;
        this.errorText = textView2;
        this.resetButton = appButton;
        this.resetPassword = textView3;
    }

    public static FragmentResetPasswordBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentResetPasswordBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentResetPasswordBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_reset_password, viewGroup, z, obj);
    }

    public static FragmentResetPasswordBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentResetPasswordBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentResetPasswordBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_reset_password, null, false, obj);
    }

    public static FragmentResetPasswordBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentResetPasswordBinding bind(View view, Object obj) {
        return (FragmentResetPasswordBinding) bind(obj, view, R.layout.fragment_reset_password);
    }
}
