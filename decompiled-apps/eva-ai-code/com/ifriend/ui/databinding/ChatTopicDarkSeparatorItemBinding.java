package com.ifriend.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.ifriend.ui.R;
import com.ifriend.ui.recyclerView.ChatTopicDarkSeparatorView;
/* loaded from: classes4.dex */
public final class ChatTopicDarkSeparatorItemBinding implements ViewBinding {
    private final ChatTopicDarkSeparatorView rootView;
    public final ChatTopicDarkSeparatorView topicView;

    private ChatTopicDarkSeparatorItemBinding(ChatTopicDarkSeparatorView chatTopicDarkSeparatorView, ChatTopicDarkSeparatorView chatTopicDarkSeparatorView2) {
        this.rootView = chatTopicDarkSeparatorView;
        this.topicView = chatTopicDarkSeparatorView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ChatTopicDarkSeparatorView getRoot() {
        return this.rootView;
    }

    public static ChatTopicDarkSeparatorItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ChatTopicDarkSeparatorItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.chat_topic_dark_separator_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ChatTopicDarkSeparatorItemBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ChatTopicDarkSeparatorView chatTopicDarkSeparatorView = (ChatTopicDarkSeparatorView) view;
        return new ChatTopicDarkSeparatorItemBinding(chatTopicDarkSeparatorView, chatTopicDarkSeparatorView);
    }
}
