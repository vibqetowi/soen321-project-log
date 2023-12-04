package com.ifriend.chat.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ifriend.chat.presentation.R;
/* loaded from: classes6.dex */
public final class LightDiaryButtonBinding implements ViewBinding {
    public final ImageView background;
    public final ConstraintLayout container;
    public final ImageView icon;
    public final ProgressBar progress;
    private final ConstraintLayout rootView;
    public final TextView text;

    private LightDiaryButtonBinding(ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2, ImageView imageView2, ProgressBar progressBar, TextView textView) {
        this.rootView = constraintLayout;
        this.background = imageView;
        this.container = constraintLayout2;
        this.icon = imageView2;
        this.progress = progressBar;
        this.text = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static LightDiaryButtonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LightDiaryButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.light_diary_button, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LightDiaryButtonBinding bind(View view) {
        int i = R.id.background;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.icon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.progress;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                if (progressBar != null) {
                    i = R.id.text;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        return new LightDiaryButtonBinding(constraintLayout, imageView, constraintLayout, imageView2, progressBar, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
