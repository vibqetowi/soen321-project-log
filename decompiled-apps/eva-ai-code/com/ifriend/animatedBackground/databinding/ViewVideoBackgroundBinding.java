package com.ifriend.animatedBackground.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.ifriend.animatedBackground.R;
/* loaded from: classes6.dex */
public final class ViewVideoBackgroundBinding implements ViewBinding {
    public final StyledPlayerView playerView;
    private final View rootView;

    private ViewVideoBackgroundBinding(View view, StyledPlayerView styledPlayerView) {
        this.rootView = view;
        this.playerView = styledPlayerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static ViewVideoBackgroundBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.view_video_background, viewGroup);
        return bind(viewGroup);
    }

    public static ViewVideoBackgroundBinding bind(View view) {
        int i = R.id.playerView;
        StyledPlayerView styledPlayerView = (StyledPlayerView) ViewBindings.findChildViewById(view, i);
        if (styledPlayerView != null) {
            return new ViewVideoBackgroundBinding(view, styledPlayerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
