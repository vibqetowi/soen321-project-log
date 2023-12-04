package com.ifriend.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.ifriend.ui.R;
/* loaded from: classes4.dex */
public final class HistogramRewindViewBinding implements ViewBinding {
    public final LottieAnimationView animationView;
    public final ImageView progress;
    private final FrameLayout rootView;

    private HistogramRewindViewBinding(FrameLayout frameLayout, LottieAnimationView lottieAnimationView, ImageView imageView) {
        this.rootView = frameLayout;
        this.animationView = lottieAnimationView;
        this.progress = imageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static HistogramRewindViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static HistogramRewindViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.histogram_rewind_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static HistogramRewindViewBinding bind(View view) {
        int i = R.id.animation_view;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
        if (lottieAnimationView != null) {
            i = R.id.progress;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                return new HistogramRewindViewBinding((FrameLayout) view, lottieAnimationView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
