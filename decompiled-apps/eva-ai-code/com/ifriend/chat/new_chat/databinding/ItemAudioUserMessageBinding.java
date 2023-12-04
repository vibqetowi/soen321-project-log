package com.ifriend.chat.new_chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ifriend.chat.new_chat.R;
import com.ifriend.chat.new_chat.list.view.audio.AudioMessageView;
/* loaded from: classes6.dex */
public final class ItemAudioUserMessageBinding implements ViewBinding {
    public final AudioMessageView itemAudioMessageView;
    private final FrameLayout rootView;

    private ItemAudioUserMessageBinding(FrameLayout frameLayout, AudioMessageView audioMessageView) {
        this.rootView = frameLayout;
        this.itemAudioMessageView = audioMessageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ItemAudioUserMessageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemAudioUserMessageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_audio_user_message, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemAudioUserMessageBinding bind(View view) {
        int i = R.id.itemAudioMessageView;
        AudioMessageView audioMessageView = (AudioMessageView) ViewBindings.findChildViewById(view, i);
        if (audioMessageView != null) {
            return new ItemAudioUserMessageBinding((FrameLayout) view, audioMessageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
