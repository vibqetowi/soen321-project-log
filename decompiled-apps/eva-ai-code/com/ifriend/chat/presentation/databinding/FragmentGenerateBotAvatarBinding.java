package com.ifriend.chat.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.ifriend.chat.presentation.R;
import com.ifriend.ui.button.AppButton;
/* loaded from: classes6.dex */
public abstract class FragmentGenerateBotAvatarBinding extends ViewDataBinding {
    public final TextView avatarGenerationPrice;
    public final ImageView close;
    public final AppButton createAvatarButton;
    public final EditText description;
    public final RecyclerView descriptionOptions;
    public final TextView title;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentGenerateBotAvatarBinding(Object obj, View view, int i, TextView textView, ImageView imageView, AppButton appButton, EditText editText, RecyclerView recyclerView, TextView textView2) {
        super(obj, view, i);
        this.avatarGenerationPrice = textView;
        this.close = imageView;
        this.createAvatarButton = appButton;
        this.description = editText;
        this.descriptionOptions = recyclerView;
        this.title = textView2;
    }

    public static FragmentGenerateBotAvatarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentGenerateBotAvatarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentGenerateBotAvatarBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_generate_bot_avatar, viewGroup, z, obj);
    }

    public static FragmentGenerateBotAvatarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentGenerateBotAvatarBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentGenerateBotAvatarBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_generate_bot_avatar, null, false, obj);
    }

    public static FragmentGenerateBotAvatarBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentGenerateBotAvatarBinding bind(View view, Object obj) {
        return (FragmentGenerateBotAvatarBinding) bind(obj, view, R.layout.fragment_generate_bot_avatar);
    }
}
