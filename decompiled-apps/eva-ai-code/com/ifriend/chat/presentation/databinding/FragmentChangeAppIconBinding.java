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
import com.ifriend.chat.presentation.ui.menu.userProfile.ChangeAppIconViewModel;
import com.ifriend.ui.button.GradientButton;
/* loaded from: classes6.dex */
public abstract class FragmentChangeAppIconBinding extends ViewDataBinding {
    public final ImageView appIcon;
    public final ImageView appIconCheck;
    public final ConstraintLayout appIconPanel;
    public final TextView appNameText;
    public final ImageView back;
    @Bindable
    protected ChangeAppIconViewModel mVm;
    public final TextView name;
    public final ImageView premiumAppIcon;
    public final ImageView premiumAppIconCheck;
    public final ConstraintLayout premiumAppIconPanel;
    public final TextView premiumAppIconText;
    public final GradientButton save;

    public abstract void setVm(ChangeAppIconViewModel changeAppIconViewModel);

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentChangeAppIconBinding(Object obj, View view, int i, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout, TextView textView, ImageView imageView3, TextView textView2, ImageView imageView4, ImageView imageView5, ConstraintLayout constraintLayout2, TextView textView3, GradientButton gradientButton) {
        super(obj, view, i);
        this.appIcon = imageView;
        this.appIconCheck = imageView2;
        this.appIconPanel = constraintLayout;
        this.appNameText = textView;
        this.back = imageView3;
        this.name = textView2;
        this.premiumAppIcon = imageView4;
        this.premiumAppIconCheck = imageView5;
        this.premiumAppIconPanel = constraintLayout2;
        this.premiumAppIconText = textView3;
        this.save = gradientButton;
    }

    public ChangeAppIconViewModel getVm() {
        return this.mVm;
    }

    public static FragmentChangeAppIconBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentChangeAppIconBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentChangeAppIconBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_change_app_icon, viewGroup, z, obj);
    }

    public static FragmentChangeAppIconBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentChangeAppIconBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentChangeAppIconBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_change_app_icon, null, false, obj);
    }

    public static FragmentChangeAppIconBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentChangeAppIconBinding bind(View view, Object obj) {
        return (FragmentChangeAppIconBinding) bind(obj, view, R.layout.fragment_change_app_icon);
    }
}
