package com.ifriend.chat.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.ifriend.chat.presentation.R;
import com.ifriend.ui.button.AppButton;
/* loaded from: classes6.dex */
public abstract class FragmentChangeEmailBinding extends ViewDataBinding {
    public final ImageView back;
    public final AppButton changeEmail;
    public final ConstraintLayout container;
    public final EditText editText;
    public final TextView errorText;
    public final TextView name;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentChangeEmailBinding(Object obj, View view, int i, ImageView imageView, AppButton appButton, ConstraintLayout constraintLayout, EditText editText, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.back = imageView;
        this.changeEmail = appButton;
        this.container = constraintLayout;
        this.editText = editText;
        this.errorText = textView;
        this.name = textView2;
    }

    public static FragmentChangeEmailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentChangeEmailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentChangeEmailBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_change_email, viewGroup, z, obj);
    }

    public static FragmentChangeEmailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentChangeEmailBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentChangeEmailBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_change_email, null, false, obj);
    }

    public static FragmentChangeEmailBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentChangeEmailBinding bind(View view, Object obj) {
        return (FragmentChangeEmailBinding) bind(obj, view, R.layout.fragment_change_email);
    }
}
