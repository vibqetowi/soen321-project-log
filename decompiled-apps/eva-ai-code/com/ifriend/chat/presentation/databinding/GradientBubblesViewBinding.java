package com.ifriend.chat.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ifriend.chat.presentation.R;
/* loaded from: classes6.dex */
public final class GradientBubblesViewBinding implements ViewBinding {
    public final ImageView bubble1;
    public final ImageView bubble2;
    public final ImageView bubble3;
    private final FrameLayout rootView;

    private GradientBubblesViewBinding(FrameLayout frameLayout, ImageView imageView, ImageView imageView2, ImageView imageView3) {
        this.rootView = frameLayout;
        this.bubble1 = imageView;
        this.bubble2 = imageView2;
        this.bubble3 = imageView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static GradientBubblesViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GradientBubblesViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.gradient_bubbles_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GradientBubblesViewBinding bind(View view) {
        int i = R.id.bubble_1;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.bubble_2;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.bubble_3;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView3 != null) {
                    return new GradientBubblesViewBinding((FrameLayout) view, imageView, imageView2, imageView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
