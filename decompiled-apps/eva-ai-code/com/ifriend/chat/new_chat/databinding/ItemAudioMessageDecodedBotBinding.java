package com.ifriend.chat.new_chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ifriend.chat.new_chat.R;
/* loaded from: classes6.dex */
public final class ItemAudioMessageDecodedBotBinding implements ViewBinding {
    public final Guideline itemAudioMessageDecodedGuideline;
    public final TextView itemAudioMessageDecodedText;
    private final ConstraintLayout rootView;

    private ItemAudioMessageDecodedBotBinding(ConstraintLayout constraintLayout, Guideline guideline, TextView textView) {
        this.rootView = constraintLayout;
        this.itemAudioMessageDecodedGuideline = guideline;
        this.itemAudioMessageDecodedText = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemAudioMessageDecodedBotBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemAudioMessageDecodedBotBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_audio_message_decoded_bot, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemAudioMessageDecodedBotBinding bind(View view) {
        int i = R.id.itemAudioMessageDecodedGuideline;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
        if (guideline != null) {
            i = R.id.itemAudioMessageDecodedText;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                return new ItemAudioMessageDecodedBotBinding((ConstraintLayout) view, guideline, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
