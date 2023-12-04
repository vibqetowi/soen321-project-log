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
import com.ifriend.chat.presentation.ui.menu.userProfile.UserProfileViewModel;
/* loaded from: classes6.dex */
public abstract class FragmentUserProfileBinding extends ViewDataBinding {
    public final ConstraintLayout age;
    public final TextView ageText;
    public final TextView ageValue;
    public final ImageView arrow1;
    public final ImageView arrow2;
    public final ImageView arrow3;
    public final ImageView arrow4;
    public final ImageView arrow5;
    public final ImageView arrowPrem;
    public final ConstraintLayout changeIcon;
    public final TextView changeIconText;
    public final ImageView close;
    public final ConstraintLayout delete;
    public final TextView deleteText;
    public final ConstraintLayout gender;
    public final TextView genderText;
    public final TextView genderValue;
    public final ConstraintLayout logout;
    public final TextView logoutText;
    @Bindable
    protected UserProfileViewModel mVm;
    public final ConstraintLayout name;
    public final TextView nameText;
    public final TextView nameValue;
    public final ConstraintLayout premium;
    public final TextView premiumText;
    public final TextView premiumValue;
    public final ConstraintLayout restorePurchases;
    public final TextView restorePurchasesText;
    public final TextView title;
    public final TextView title2;
    public final TextView title3;

    public abstract void setVm(UserProfileViewModel userProfileViewModel);

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentUserProfileBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, TextView textView, TextView textView2, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ConstraintLayout constraintLayout2, TextView textView3, ImageView imageView7, ConstraintLayout constraintLayout3, TextView textView4, ConstraintLayout constraintLayout4, TextView textView5, TextView textView6, ConstraintLayout constraintLayout5, TextView textView7, ConstraintLayout constraintLayout6, TextView textView8, TextView textView9, ConstraintLayout constraintLayout7, TextView textView10, TextView textView11, ConstraintLayout constraintLayout8, TextView textView12, TextView textView13, TextView textView14, TextView textView15) {
        super(obj, view, i);
        this.age = constraintLayout;
        this.ageText = textView;
        this.ageValue = textView2;
        this.arrow1 = imageView;
        this.arrow2 = imageView2;
        this.arrow3 = imageView3;
        this.arrow4 = imageView4;
        this.arrow5 = imageView5;
        this.arrowPrem = imageView6;
        this.changeIcon = constraintLayout2;
        this.changeIconText = textView3;
        this.close = imageView7;
        this.delete = constraintLayout3;
        this.deleteText = textView4;
        this.gender = constraintLayout4;
        this.genderText = textView5;
        this.genderValue = textView6;
        this.logout = constraintLayout5;
        this.logoutText = textView7;
        this.name = constraintLayout6;
        this.nameText = textView8;
        this.nameValue = textView9;
        this.premium = constraintLayout7;
        this.premiumText = textView10;
        this.premiumValue = textView11;
        this.restorePurchases = constraintLayout8;
        this.restorePurchasesText = textView12;
        this.title = textView13;
        this.title2 = textView14;
        this.title3 = textView15;
    }

    public UserProfileViewModel getVm() {
        return this.mVm;
    }

    public static FragmentUserProfileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentUserProfileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentUserProfileBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_user_profile, viewGroup, z, obj);
    }

    public static FragmentUserProfileBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentUserProfileBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentUserProfileBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_user_profile, null, false, obj);
    }

    public static FragmentUserProfileBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentUserProfileBinding bind(View view, Object obj) {
        return (FragmentUserProfileBinding) bind(obj, view, R.layout.fragment_user_profile);
    }
}
