package com.ifriend.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ifriend.ui.R;
/* loaded from: classes4.dex */
public final class ButtonBlackBinding implements ViewBinding {
    public final FrameLayout container;
    public final ProgressBar progress;
    private final FrameLayout rootView;
    public final TextView text;

    private ButtonBlackBinding(FrameLayout frameLayout, FrameLayout frameLayout2, ProgressBar progressBar, TextView textView) {
        this.rootView = frameLayout;
        this.container = frameLayout2;
        this.progress = progressBar;
        this.text = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ButtonBlackBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ButtonBlackBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.button_black, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ButtonBlackBinding bind(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i = R.id.progress;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
        if (progressBar != null) {
            i = R.id.text;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                return new ButtonBlackBinding(frameLayout, frameLayout, progressBar, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
