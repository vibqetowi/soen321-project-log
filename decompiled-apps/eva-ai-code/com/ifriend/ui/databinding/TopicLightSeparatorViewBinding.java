package com.ifriend.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ifriend.ui.R;
/* loaded from: classes4.dex */
public final class TopicLightSeparatorViewBinding implements ViewBinding {
    private final View rootView;
    public final TextView topicName;

    private TopicLightSeparatorViewBinding(View view, TextView textView) {
        this.rootView = view;
        this.topicName = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static TopicLightSeparatorViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.topic_light_separator_view, viewGroup);
        return bind(viewGroup);
    }

    public static TopicLightSeparatorViewBinding bind(View view) {
        int i = R.id.topicName;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            return new TopicLightSeparatorViewBinding(view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
