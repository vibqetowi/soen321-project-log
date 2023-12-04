package com.ifriend.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ifriend.ui.R;
import com.ifriend.ui.recyclerView.audio.audioView.rewindView.HistogramAudioRewindView;
/* loaded from: classes4.dex */
public final class HistogramAudioViewChatBinding implements ViewBinding {
    public final ConstraintLayout container;
    public final ImageView playBackground;
    public final ImageView playButton;
    public final ProgressBar playbackLoadProgress;
    public final HistogramAudioRewindView rewind;
    private final ConstraintLayout rootView;

    private HistogramAudioViewChatBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, ImageView imageView2, ProgressBar progressBar, HistogramAudioRewindView histogramAudioRewindView) {
        this.rootView = constraintLayout;
        this.container = constraintLayout2;
        this.playBackground = imageView;
        this.playButton = imageView2;
        this.playbackLoadProgress = progressBar;
        this.rewind = histogramAudioRewindView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static HistogramAudioViewChatBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static HistogramAudioViewChatBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.histogram_audio_view_chat, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static HistogramAudioViewChatBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.play_background;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.play_button;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.playback_load_progress;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                if (progressBar != null) {
                    i = R.id.rewind;
                    HistogramAudioRewindView histogramAudioRewindView = (HistogramAudioRewindView) ViewBindings.findChildViewById(view, i);
                    if (histogramAudioRewindView != null) {
                        return new HistogramAudioViewChatBinding(constraintLayout, constraintLayout, imageView, imageView2, progressBar, histogramAudioRewindView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
