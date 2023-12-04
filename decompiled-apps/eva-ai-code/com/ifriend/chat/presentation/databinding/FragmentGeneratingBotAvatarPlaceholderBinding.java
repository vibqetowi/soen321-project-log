package com.ifriend.chat.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.ifriend.chat.presentation.R;
import com.ifriend.ui.button.AppButton;
/* loaded from: classes6.dex */
public abstract class FragmentGeneratingBotAvatarPlaceholderBinding extends ViewDataBinding {
    public final ConstraintLayout container;
    public final TextView description;
    public final AppButton goToChat;
    public final ProgressBar progress;
    public final TextView title;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentGeneratingBotAvatarPlaceholderBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, TextView textView, AppButton appButton, ProgressBar progressBar, TextView textView2) {
        super(obj, view, i);
        this.container = constraintLayout;
        this.description = textView;
        this.goToChat = appButton;
        this.progress = progressBar;
        this.title = textView2;
    }

    public static FragmentGeneratingBotAvatarPlaceholderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentGeneratingBotAvatarPlaceholderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentGeneratingBotAvatarPlaceholderBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_generating_bot_avatar_placeholder, viewGroup, z, obj);
    }

    public static FragmentGeneratingBotAvatarPlaceholderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentGeneratingBotAvatarPlaceholderBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentGeneratingBotAvatarPlaceholderBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_generating_bot_avatar_placeholder, null, false, obj);
    }

    public static FragmentGeneratingBotAvatarPlaceholderBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentGeneratingBotAvatarPlaceholderBinding bind(View view, Object obj) {
        return (FragmentGeneratingBotAvatarPlaceholderBinding) bind(obj, view, R.layout.fragment_generating_bot_avatar_placeholder);
    }
}
