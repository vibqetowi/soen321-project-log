package com.ifriend.chat.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.ui.menu.botProfile.BotNameViewModel;
import com.ifriend.ui.button.AppButton;
/* loaded from: classes6.dex */
public abstract class FragmentBotNameBinding extends ViewDataBinding {
    public final ImageView back;
    public final ConstraintLayout container;
    public final EditText editText;
    @Bindable
    protected BotNameViewModel mVm;
    public final TextView name;
    public final AppButton save;

    public abstract void setVm(BotNameViewModel botNameViewModel);

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentBotNameBinding(Object obj, View view, int i, ImageView imageView, ConstraintLayout constraintLayout, EditText editText, TextView textView, AppButton appButton) {
        super(obj, view, i);
        this.back = imageView;
        this.container = constraintLayout;
        this.editText = editText;
        this.name = textView;
        this.save = appButton;
    }

    public BotNameViewModel getVm() {
        return this.mVm;
    }

    public static FragmentBotNameBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentBotNameBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentBotNameBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_bot_name, viewGroup, z, obj);
    }

    public static FragmentBotNameBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentBotNameBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentBotNameBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_bot_name, null, false, obj);
    }

    public static FragmentBotNameBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentBotNameBinding bind(View view, Object obj) {
        return (FragmentBotNameBinding) bind(obj, view, R.layout.fragment_bot_name);
    }
}
