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
import com.ifriend.chat.presentation.ui.menu.botProfile.BotEthnicityViewModel;
import com.ifriend.ui.button.AppButton;
/* loaded from: classes6.dex */
public abstract class FragmentBotEthnicityBinding extends ViewDataBinding {
    public final ConstraintLayout asian;
    public final TextView asianText;
    public final ImageView back;
    public final ConstraintLayout black;
    public final TextView blackText;
    public final ImageView check1;
    public final ImageView check2;
    public final ImageView check3;
    public final ImageView check4;
    public final ImageView check5;
    public final ConstraintLayout container;
    public final ConstraintLayout latino;
    public final TextView latinoText;
    @Bindable
    protected BotEthnicityViewModel mVm;
    public final TextView name;
    public final ConstraintLayout other;
    public final TextView otherText;
    public final AppButton save;
    public final ConstraintLayout white;
    public final TextView whiteText;

    public abstract void setVm(BotEthnicityViewModel botEthnicityViewModel);

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentBotEthnicityBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, TextView textView, ImageView imageView, ConstraintLayout constraintLayout2, TextView textView2, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, TextView textView3, TextView textView4, ConstraintLayout constraintLayout5, TextView textView5, AppButton appButton, ConstraintLayout constraintLayout6, TextView textView6) {
        super(obj, view, i);
        this.asian = constraintLayout;
        this.asianText = textView;
        this.back = imageView;
        this.black = constraintLayout2;
        this.blackText = textView2;
        this.check1 = imageView2;
        this.check2 = imageView3;
        this.check3 = imageView4;
        this.check4 = imageView5;
        this.check5 = imageView6;
        this.container = constraintLayout3;
        this.latino = constraintLayout4;
        this.latinoText = textView3;
        this.name = textView4;
        this.other = constraintLayout5;
        this.otherText = textView5;
        this.save = appButton;
        this.white = constraintLayout6;
        this.whiteText = textView6;
    }

    public BotEthnicityViewModel getVm() {
        return this.mVm;
    }

    public static FragmentBotEthnicityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentBotEthnicityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentBotEthnicityBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_bot_ethnicity, viewGroup, z, obj);
    }

    public static FragmentBotEthnicityBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentBotEthnicityBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentBotEthnicityBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_bot_ethnicity, null, false, obj);
    }

    public static FragmentBotEthnicityBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentBotEthnicityBinding bind(View view, Object obj) {
        return (FragmentBotEthnicityBinding) bind(obj, view, R.layout.fragment_bot_ethnicity);
    }
}
