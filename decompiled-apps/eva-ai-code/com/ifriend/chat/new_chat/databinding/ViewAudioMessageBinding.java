package com.ifriend.chat.new_chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.ifriend.chat.new_chat.R;
/* loaded from: classes6.dex */
public final class ViewAudioMessageBinding implements ViewBinding {
    public final AppCompatImageView audioMessageHistogramView;
    public final AppCompatImageView audioMessagePlayIcon;
    public final LottieAnimationView audioMessagePlaybackAnimationView;
    public final ProgressBar audioMessageProgress;
    public final LottieAnimationView premiumAnimation;
    public final CardView premiumAnimationCard;
    private final View rootView;

    private ViewAudioMessageBinding(View view, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, LottieAnimationView lottieAnimationView, ProgressBar progressBar, LottieAnimationView lottieAnimationView2, CardView cardView) {
        this.rootView = view;
        this.audioMessageHistogramView = appCompatImageView;
        this.audioMessagePlayIcon = appCompatImageView2;
        this.audioMessagePlaybackAnimationView = lottieAnimationView;
        this.audioMessageProgress = progressBar;
        this.premiumAnimation = lottieAnimationView2;
        this.premiumAnimationCard = cardView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static ViewAudioMessageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.view_audio_message, viewGroup);
        return bind(viewGroup);
    }

    public static ViewAudioMessageBinding bind(View view) {
        int i = R.id.audioMessageHistogramView;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.audioMessagePlayIcon;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView2 != null) {
                i = R.id.audioMessagePlaybackAnimationView;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                if (lottieAnimationView != null) {
                    i = R.id.audioMessageProgress;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                    if (progressBar != null) {
                        i = R.id.premiumAnimation;
                        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                        if (lottieAnimationView2 != null) {
                            i = R.id.premiumAnimationCard;
                            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                            if (cardView != null) {
                                return new ViewAudioMessageBinding(view, appCompatImageView, appCompatImageView2, lottieAnimationView, progressBar, lottieAnimationView2, cardView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
