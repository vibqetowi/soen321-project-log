package com.ifriend.chat.new_chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ifriend.chat.new_chat.R;
import com.ifriend.ui.progress.TextFlashingDotsView;
/* loaded from: classes6.dex */
public final class ItemChatBotTypingBinding implements ViewBinding {
    public final TextFlashingDotsView botTypingDots;
    public final TextView botTypingText;
    private final LinearLayout rootView;

    private ItemChatBotTypingBinding(LinearLayout linearLayout, TextFlashingDotsView textFlashingDotsView, TextView textView) {
        this.rootView = linearLayout;
        this.botTypingDots = textFlashingDotsView;
        this.botTypingText = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemChatBotTypingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemChatBotTypingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_chat_bot_typing, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemChatBotTypingBinding bind(View view) {
        int i = R.id.botTypingDots;
        TextFlashingDotsView textFlashingDotsView = (TextFlashingDotsView) ViewBindings.findChildViewById(view, i);
        if (textFlashingDotsView != null) {
            i = R.id.botTypingText;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                return new ItemChatBotTypingBinding((LinearLayout) view, textFlashingDotsView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
