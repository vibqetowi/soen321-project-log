package com.ifriend.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.ifriend.ui.R;
/* loaded from: classes4.dex */
public final class AnimatedAvatarViewBinding implements ViewBinding {
    public final ConstraintLayout avatarBigPlaceholder;
    public final ImageView avatarBigPlaceholderBackground;
    public final FrameLayout avatarBigPlaceholderButton;
    public final ImageView avatarBigPlaceholderEye;
    public final TextView avatarBigPlaceholderText;
    public final ImageView avatarImage;
    public final ProgressBar avatarProgress;
    public final FrameLayout avatarSmallPlaceholder;
    public final StyledPlayerView avatarVideo;
    public final ConstraintLayout background;
    public final ConstraintLayout changeAnimationStateButton;
    public final ConstraintLayout generatingAnimation;
    public final ProgressBar generationProgressBar;
    public final ImageView pauseAvatarAnimation;
    public final ImageView playAvatarAnimation;
    private final ConstraintLayout rootView;

    private AnimatedAvatarViewBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, FrameLayout frameLayout, ImageView imageView2, TextView textView, ImageView imageView3, ProgressBar progressBar, FrameLayout frameLayout2, StyledPlayerView styledPlayerView, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, ConstraintLayout constraintLayout5, ProgressBar progressBar2, ImageView imageView4, ImageView imageView5) {
        this.rootView = constraintLayout;
        this.avatarBigPlaceholder = constraintLayout2;
        this.avatarBigPlaceholderBackground = imageView;
        this.avatarBigPlaceholderButton = frameLayout;
        this.avatarBigPlaceholderEye = imageView2;
        this.avatarBigPlaceholderText = textView;
        this.avatarImage = imageView3;
        this.avatarProgress = progressBar;
        this.avatarSmallPlaceholder = frameLayout2;
        this.avatarVideo = styledPlayerView;
        this.background = constraintLayout3;
        this.changeAnimationStateButton = constraintLayout4;
        this.generatingAnimation = constraintLayout5;
        this.generationProgressBar = progressBar2;
        this.pauseAvatarAnimation = imageView4;
        this.playAvatarAnimation = imageView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static AnimatedAvatarViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AnimatedAvatarViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.animated_avatar_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AnimatedAvatarViewBinding bind(View view) {
        int i = R.id.avatar_big_placeholder;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.avatar_big_placeholder_background;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.avatar_big_placeholder_button;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = R.id.avatar_big_placeholder_eye;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = R.id.avatar_big_placeholder_text;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = R.id.avatar_image;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView3 != null) {
                                i = R.id.avatar_progress;
                                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                                if (progressBar != null) {
                                    i = R.id.avatar_small_placeholder;
                                    FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                    if (frameLayout2 != null) {
                                        i = R.id.avatar_video;
                                        StyledPlayerView styledPlayerView = (StyledPlayerView) ViewBindings.findChildViewById(view, i);
                                        if (styledPlayerView != null) {
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                                            i = R.id.change_animation_state_button;
                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                            if (constraintLayout3 != null) {
                                                i = R.id.generating_animation;
                                                ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                if (constraintLayout4 != null) {
                                                    i = R.id.generation_progress_bar;
                                                    ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, i);
                                                    if (progressBar2 != null) {
                                                        i = R.id.pause_avatar_animation;
                                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                        if (imageView4 != null) {
                                                            i = R.id.play_avatar_animation;
                                                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                            if (imageView5 != null) {
                                                                return new AnimatedAvatarViewBinding(constraintLayout2, constraintLayout, imageView, frameLayout, imageView2, textView, imageView3, progressBar, frameLayout2, styledPlayerView, constraintLayout2, constraintLayout3, constraintLayout4, progressBar2, imageView4, imageView5);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
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
