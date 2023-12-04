package com.ifriend.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ifriend.ui.R;
/* loaded from: classes4.dex */
public final class AttentionBadgeBinding implements ViewBinding {
    public final TextView badgeText;
    public final FrameLayout container;
    private final FrameLayout rootView;

    private AttentionBadgeBinding(FrameLayout frameLayout, TextView textView, FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.badgeText = textView;
        this.container = frameLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static AttentionBadgeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AttentionBadgeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.attention_badge, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AttentionBadgeBinding bind(View view) {
        int i = R.id.badge_text;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            return new AttentionBadgeBinding(frameLayout, textView, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
