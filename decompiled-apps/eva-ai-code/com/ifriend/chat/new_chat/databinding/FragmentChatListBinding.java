package com.ifriend.chat.new_chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ifriend.chat.new_chat.R;
import com.ifriend.ui.recyclerView.audio.ChatRecyclerView;
/* loaded from: classes6.dex */
public final class FragmentChatListBinding implements ViewBinding {
    public final ChatRecyclerView chatList;
    private final FrameLayout rootView;

    private FragmentChatListBinding(FrameLayout frameLayout, ChatRecyclerView chatRecyclerView) {
        this.rootView = frameLayout;
        this.chatList = chatRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentChatListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentChatListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_chat_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentChatListBinding bind(View view) {
        int i = R.id.chatList;
        ChatRecyclerView chatRecyclerView = (ChatRecyclerView) ViewBindings.findChildViewById(view, i);
        if (chatRecyclerView != null) {
            return new FragmentChatListBinding((FrameLayout) view, chatRecyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
