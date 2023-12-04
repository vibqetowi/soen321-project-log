package com.ifriend.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.ui.SubtitleView;
import com.ifriend.ui.R;
/* loaded from: classes4.dex */
public final class ViewExoPlayerBinding implements ViewBinding {
    public final FrameLayout exoAdOverlay;
    public final ImageView exoArtwork;
    public final ProgressBar exoBuffering;
    public final AspectRatioFrameLayout exoContentFrame;
    public final TextView exoErrorMessage;
    public final FrameLayout exoOverlay;
    public final View exoShutter;
    public final SubtitleView exoSubtitles;
    private final View rootView;

    private ViewExoPlayerBinding(View view, FrameLayout frameLayout, ImageView imageView, ProgressBar progressBar, AspectRatioFrameLayout aspectRatioFrameLayout, TextView textView, FrameLayout frameLayout2, View view2, SubtitleView subtitleView) {
        this.rootView = view;
        this.exoAdOverlay = frameLayout;
        this.exoArtwork = imageView;
        this.exoBuffering = progressBar;
        this.exoContentFrame = aspectRatioFrameLayout;
        this.exoErrorMessage = textView;
        this.exoOverlay = frameLayout2;
        this.exoShutter = view2;
        this.exoSubtitles = subtitleView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static ViewExoPlayerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.view_exo_player, viewGroup);
        return bind(viewGroup);
    }

    public static ViewExoPlayerBinding bind(View view) {
        View findChildViewById;
        int i = com.google.android.exoplayer2.R.id.exo_ad_overlay;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = com.google.android.exoplayer2.R.id.exo_artwork;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = com.google.android.exoplayer2.R.id.exo_buffering;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                if (progressBar != null) {
                    i = com.google.android.exoplayer2.R.id.exo_content_frame;
                    AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) ViewBindings.findChildViewById(view, i);
                    if (aspectRatioFrameLayout != null) {
                        i = com.google.android.exoplayer2.R.id.exo_error_message;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = com.google.android.exoplayer2.R.id.exo_overlay;
                            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                            if (frameLayout2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = com.google.android.exoplayer2.R.id.exo_shutter))) != null) {
                                i = com.google.android.exoplayer2.R.id.exo_subtitles;
                                SubtitleView subtitleView = (SubtitleView) ViewBindings.findChildViewById(view, i);
                                if (subtitleView != null) {
                                    return new ViewExoPlayerBinding(view, frameLayout, imageView, progressBar, aspectRatioFrameLayout, textView, frameLayout2, findChildViewById, subtitleView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
