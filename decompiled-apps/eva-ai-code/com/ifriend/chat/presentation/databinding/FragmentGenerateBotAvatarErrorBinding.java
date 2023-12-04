package com.ifriend.chat.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.ifriend.chat.presentation.R;
import com.ifriend.ui.button.AppButton;
/* loaded from: classes6.dex */
public abstract class FragmentGenerateBotAvatarErrorBinding extends ViewDataBinding {
    public final ConstraintLayout container;
    public final TextView description;
    public final TextView title;
    public final AppButton tryAgain;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentGenerateBotAvatarErrorBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, TextView textView, TextView textView2, AppButton appButton) {
        super(obj, view, i);
        this.container = constraintLayout;
        this.description = textView;
        this.title = textView2;
        this.tryAgain = appButton;
    }

    public static FragmentGenerateBotAvatarErrorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentGenerateBotAvatarErrorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentGenerateBotAvatarErrorBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_generate_bot_avatar_error, viewGroup, z, obj);
    }

    public static FragmentGenerateBotAvatarErrorBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentGenerateBotAvatarErrorBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentGenerateBotAvatarErrorBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_generate_bot_avatar_error, null, false, obj);
    }

    public static FragmentGenerateBotAvatarErrorBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentGenerateBotAvatarErrorBinding bind(View view, Object obj) {
        return (FragmentGenerateBotAvatarErrorBinding) bind(obj, view, R.layout.fragment_generate_bot_avatar_error);
    }
}
