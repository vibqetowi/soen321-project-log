package com.ifriend.chat.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ifriend.chat.presentation.R;
import com.ifriend.ui.imageView.animatedAvatarView.AnimatedAvatarView;
import com.ifriend.ui.progress.LevelProgressBar;
import com.ifriend.ui.recyclerView.audio.audioView.VoiceSampleView;
/* loaded from: classes6.dex */
public final class FragmentBotProfileBinding implements ViewBinding {
    public final TextView age;
    public final AnimatedAvatarView avatar;
    public final ImageView avatarButton;
    public final ConstraintLayout avatarContainer;
    public final TextView changeVoice;
    public final ImageView changeVoiceArrow;
    public final ImageView close;
    public final TextView ethnicity;
    public final Flow flow1;
    public final TextView gender;
    public final TextView level;
    public final LinearLayout levelContainer;
    public final LevelProgressBar levelProgressBar;
    public final TextView name;
    public final TextView nameInLevelContainer;
    public final TextView personality;
    public final TextView reset;
    public final ConstraintLayout resetButton;
    public final TextView resetText;
    private final ScrollView rootView;
    public final ScrollView scrollView;
    public final TextView title;
    public final ConstraintLayout voiceContainer;
    public final VoiceSampleView voiceSample;

    private FragmentBotProfileBinding(ScrollView scrollView, TextView textView, AnimatedAvatarView animatedAvatarView, ImageView imageView, ConstraintLayout constraintLayout, TextView textView2, ImageView imageView2, ImageView imageView3, TextView textView3, Flow flow, TextView textView4, TextView textView5, LinearLayout linearLayout, LevelProgressBar levelProgressBar, TextView textView6, TextView textView7, TextView textView8, TextView textView9, ConstraintLayout constraintLayout2, TextView textView10, ScrollView scrollView2, TextView textView11, ConstraintLayout constraintLayout3, VoiceSampleView voiceSampleView) {
        this.rootView = scrollView;
        this.age = textView;
        this.avatar = animatedAvatarView;
        this.avatarButton = imageView;
        this.avatarContainer = constraintLayout;
        this.changeVoice = textView2;
        this.changeVoiceArrow = imageView2;
        this.close = imageView3;
        this.ethnicity = textView3;
        this.flow1 = flow;
        this.gender = textView4;
        this.level = textView5;
        this.levelContainer = linearLayout;
        this.levelProgressBar = levelProgressBar;
        this.name = textView6;
        this.nameInLevelContainer = textView7;
        this.personality = textView8;
        this.reset = textView9;
        this.resetButton = constraintLayout2;
        this.resetText = textView10;
        this.scrollView = scrollView2;
        this.title = textView11;
        this.voiceContainer = constraintLayout3;
        this.voiceSample = voiceSampleView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentBotProfileBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentBotProfileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_bot_profile, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentBotProfileBinding bind(View view) {
        int i = R.id.age;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.avatar;
            AnimatedAvatarView animatedAvatarView = (AnimatedAvatarView) ViewBindings.findChildViewById(view, i);
            if (animatedAvatarView != null) {
                i = R.id.avatar_button;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.avatar_container;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = R.id.change_voice;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = R.id.change_voice_arrow;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView2 != null) {
                                i = R.id.close;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView3 != null) {
                                    i = R.id.ethnicity;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        i = R.id.flow1;
                                        Flow flow = (Flow) ViewBindings.findChildViewById(view, i);
                                        if (flow != null) {
                                            i = R.id.gender;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView4 != null) {
                                                i = R.id.level;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView5 != null) {
                                                    i = R.id.level_container;
                                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                    if (linearLayout != null) {
                                                        i = R.id.levelProgressBar;
                                                        LevelProgressBar levelProgressBar = (LevelProgressBar) ViewBindings.findChildViewById(view, i);
                                                        if (levelProgressBar != null) {
                                                            i = R.id.name;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView6 != null) {
                                                                i = R.id.nameInLevelContainer;
                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView7 != null) {
                                                                    i = R.id.personality;
                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView8 != null) {
                                                                        i = R.id.reset;
                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                        if (textView9 != null) {
                                                                            i = R.id.reset_button;
                                                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                            if (constraintLayout2 != null) {
                                                                                i = R.id.reset_text;
                                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                if (textView10 != null) {
                                                                                    ScrollView scrollView = (ScrollView) view;
                                                                                    i = R.id.title;
                                                                                    TextView textView11 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (textView11 != null) {
                                                                                        i = R.id.voice_container;
                                                                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                                        if (constraintLayout3 != null) {
                                                                                            i = R.id.voice_sample;
                                                                                            VoiceSampleView voiceSampleView = (VoiceSampleView) ViewBindings.findChildViewById(view, i);
                                                                                            if (voiceSampleView != null) {
                                                                                                return new FragmentBotProfileBinding(scrollView, textView, animatedAvatarView, imageView, constraintLayout, textView2, imageView2, imageView3, textView3, flow, textView4, textView5, linearLayout, levelProgressBar, textView6, textView7, textView8, textView9, constraintLayout2, textView10, scrollView, textView11, constraintLayout3, voiceSampleView);
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
