package com.ifriend.chat.new_chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ifriend.chat.new_chat.R;
import com.ifriend.chat.new_chat.list.view.audio.AudioMessageView;
/* loaded from: classes6.dex */
public final class ItemAudioMessageBotBinding implements ViewBinding {
    public final Barrier itemAudioMessageBotBarrier;
    public final AppCompatImageView itemAudioMessageBotChangeVoice;
    public final ProgressBar itemAudioMessageBotLoadProgress;
    public final AppCompatImageView itemAudioMessageBotLoadText;
    public final AudioMessageView itemAudioMessageBotView;
    private final ConstraintLayout rootView;

    private ItemAudioMessageBotBinding(ConstraintLayout constraintLayout, Barrier barrier, AppCompatImageView appCompatImageView, ProgressBar progressBar, AppCompatImageView appCompatImageView2, AudioMessageView audioMessageView) {
        this.rootView = constraintLayout;
        this.itemAudioMessageBotBarrier = barrier;
        this.itemAudioMessageBotChangeVoice = appCompatImageView;
        this.itemAudioMessageBotLoadProgress = progressBar;
        this.itemAudioMessageBotLoadText = appCompatImageView2;
        this.itemAudioMessageBotView = audioMessageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemAudioMessageBotBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemAudioMessageBotBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_audio_message_bot, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemAudioMessageBotBinding bind(View view) {
        int i = R.id.itemAudioMessageBotBarrier;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = R.id.itemAudioMessageBotChangeVoice;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = R.id.itemAudioMessageBotLoadProgress;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                if (progressBar != null) {
                    i = R.id.itemAudioMessageBotLoadText;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView2 != null) {
                        i = R.id.itemAudioMessageBotView;
                        AudioMessageView audioMessageView = (AudioMessageView) ViewBindings.findChildViewById(view, i);
                        if (audioMessageView != null) {
                            return new ItemAudioMessageBotBinding((ConstraintLayout) view, barrier, appCompatImageView, progressBar, appCompatImageView2, audioMessageView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
