package com.ifriend.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.ifriend.ui.R;
import com.ifriend.ui.recyclerView.audio.dateView.ChatDateView;
/* loaded from: classes4.dex */
public final class ChatDateItemBinding implements ViewBinding {
    public final ChatDateView chatDate;
    private final ChatDateView rootView;

    private ChatDateItemBinding(ChatDateView chatDateView, ChatDateView chatDateView2) {
        this.rootView = chatDateView;
        this.chatDate = chatDateView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ChatDateView getRoot() {
        return this.rootView;
    }

    public static ChatDateItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ChatDateItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.chat_date_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ChatDateItemBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ChatDateView chatDateView = (ChatDateView) view;
        return new ChatDateItemBinding(chatDateView, chatDateView);
    }
}
