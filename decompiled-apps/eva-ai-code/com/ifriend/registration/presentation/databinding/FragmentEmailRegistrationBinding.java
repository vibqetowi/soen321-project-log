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
public abstract class FragmentEmailRegistrationBinding extends ViewDataBinding {
    public final ImageView back;
    public final ImageView debug;
    public final DarkEditText email;
    public final TextView errorText;
    public final AppButton next;
    public final DarkEditText password;
    public final TextView resetPassword;
    public final TextView signUp;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentEmailRegistrationBinding(Object obj, View view, int i, ImageView imageView, ImageView imageView2, DarkEditText darkEditText, TextView textView, AppButton appButton, DarkEditText darkEditText2, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.back = imageView;
        this.debug = imageView2;
        this.email = darkEditText;
        this.errorText = textView;
        this.next = appButton;
        this.password = darkEditText2;
        this.resetPassword = textView2;
        this.signUp = textView3;
    }

    public static FragmentEmailRegistrationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentEmailRegistrationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentEmailRegistrationBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_email_registration, viewGroup, z, obj);
    }

    public static FragmentEmailRegistrationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentEmailRegistrationBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentEmailRegistrationBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_email_registration, null, false, obj);
    }

    public static FragmentEmailRegistrationBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentEmailRegistrationBinding bind(View view, Object obj) {
        return (FragmentEmailRegistrationBinding) bind(obj, view, R.layout.fragment_email_registration);
    }
}
