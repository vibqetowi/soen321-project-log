package com.ifriend.chat.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotVoiceViewModel;
import com.ifriend.ui.button.AppButton;
/* loaded from: classes6.dex */
public abstract class FragmentBotVoiceBinding extends ViewDataBinding {
    public final ImageView back;
    public final ConstraintLayout container;
    public final ListView items;
    @Bindable
    protected BotVoiceViewModel mVm;
    public final TextView name;
    public final AppButton save;

    public abstract void setVm(BotVoiceViewModel botVoiceViewModel);

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentBotVoiceBinding(Object obj, View view, int i, ImageView imageView, ConstraintLayout constraintLayout, ListView listView, TextView textView, AppButton appButton) {
        super(obj, view, i);
        this.back = imageView;
        this.container = constraintLayout;
        this.items = listView;
        this.name = textView;
        this.save = appButton;
    }

    public BotVoiceViewModel getVm() {
        return this.mVm;
    }

    public static FragmentBotVoiceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentBotVoiceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentBotVoiceBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_bot_voice, viewGroup, z, obj);
    }

    public static FragmentBotVoiceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentBotVoiceBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentBotVoiceBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_bot_voice, null, false, obj);
    }

    public static FragmentBotVoiceBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentBotVoiceBinding bind(View view, Object obj) {
        return (FragmentBotVoiceBinding) bind(obj, view, R.layout.fragment_bot_voice);
    }
}
