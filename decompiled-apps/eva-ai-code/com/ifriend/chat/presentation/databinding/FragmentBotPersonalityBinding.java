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
import com.ifriend.chat.presentation.ui.menu.botProfile.BotPersonalityViewModel;
import com.ifriend.ui.button.AppButton;
/* loaded from: classes6.dex */
public abstract class FragmentBotPersonalityBinding extends ViewDataBinding {
    public final ImageView back;
    public final ImageView check1;
    public final ImageView check2;
    public final ConstraintLayout container;
    public final ConstraintLayout flirty;
    public final TextView flirtyText;
    public final ConstraintLayout friendly;
    @Bindable
    protected BotPersonalityViewModel mVm;
    public final TextView maleText;
    public final TextView name;
    public final AppButton save;

    public abstract void setVm(BotPersonalityViewModel botPersonalityViewModel);

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentBotPersonalityBinding(Object obj, View view, int i, ImageView imageView, ImageView imageView2, ImageView imageView3, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView, ConstraintLayout constraintLayout3, TextView textView2, TextView textView3, AppButton appButton) {
        super(obj, view, i);
        this.back = imageView;
        this.check1 = imageView2;
        this.check2 = imageView3;
        this.container = constraintLayout;
        this.flirty = constraintLayout2;
        this.flirtyText = textView;
        this.friendly = constraintLayout3;
        this.maleText = textView2;
        this.name = textView3;
        this.save = appButton;
    }

    public BotPersonalityViewModel getVm() {
        return this.mVm;
    }

    public static FragmentBotPersonalityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentBotPersonalityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentBotPersonalityBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_bot_personality, viewGroup, z, obj);
    }

    public static FragmentBotPersonalityBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentBotPersonalityBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentBotPersonalityBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_bot_personality, null, false, obj);
    }

    public static FragmentBotPersonalityBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentBotPersonalityBinding bind(View view, Object obj) {
        return (FragmentBotPersonalityBinding) bind(obj, view, R.layout.fragment_bot_personality);
    }
}
