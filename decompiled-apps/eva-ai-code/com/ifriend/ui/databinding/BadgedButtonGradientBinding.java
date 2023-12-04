package com.ifriend.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ifriend.ui.R;
import com.ifriend.ui.badge.AttentionBadgeView;
/* loaded from: classes4.dex */
public final class BadgedButtonGradientBinding implements ViewBinding {
    public final FrameLayout background;
    public final AttentionBadgeView badge;
    public final ConstraintLayout container;
    private final ConstraintLayout rootView;
    public final TextView text;

    private BadgedButtonGradientBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, AttentionBadgeView attentionBadgeView, ConstraintLayout constraintLayout2, TextView textView) {
        this.rootView = constraintLayout;
        this.background = frameLayout;
        this.badge = attentionBadgeView;
        this.container = constraintLayout2;
        this.text = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static BadgedButtonGradientBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static BadgedButtonGradientBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.badged_button_gradient, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static BadgedButtonGradientBinding bind(View view) {
        int i = R.id.background;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.badge;
            AttentionBadgeView attentionBadgeView = (AttentionBadgeView) ViewBindings.findChildViewById(view, i);
            if (attentionBadgeView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.text;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new BadgedButtonGradientBinding(constraintLayout, frameLayout, attentionBadgeView, constraintLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
