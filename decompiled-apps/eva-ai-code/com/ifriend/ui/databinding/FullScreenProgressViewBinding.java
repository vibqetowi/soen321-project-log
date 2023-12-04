package com.ifriend.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ifriend.ui.R;
/* loaded from: classes4.dex */
public final class FullScreenProgressViewBinding implements ViewBinding {
    public final ProgressBar progress;
    public final FrameLayout progressContainer;
    private final FrameLayout rootView;

    private FullScreenProgressViewBinding(FrameLayout frameLayout, ProgressBar progressBar, FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.progress = progressBar;
        this.progressContainer = frameLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FullScreenProgressViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FullScreenProgressViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.full_screen_progress_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FullScreenProgressViewBinding bind(View view) {
        int i = R.id.progress;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
        if (progressBar != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            return new FullScreenProgressViewBinding(frameLayout, progressBar, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
