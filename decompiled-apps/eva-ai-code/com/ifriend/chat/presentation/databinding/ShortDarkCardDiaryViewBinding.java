package com.ifriend.chat.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ifriend.chat.presentation.R;
/* loaded from: classes6.dex */
public final class ShortDarkCardDiaryViewBinding implements ViewBinding {
    public final AppCompatImageView bubbleBackground;
    public final TextView diaryDatetimeText;
    public final TextView diaryDescriptionText;
    public final ImageView diaryIcon;
    public final TextView diaryTitleText;
    private final ConstraintLayout rootView;

    private ShortDarkCardDiaryViewBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, TextView textView, TextView textView2, ImageView imageView, TextView textView3) {
        this.rootView = constraintLayout;
        this.bubbleBackground = appCompatImageView;
        this.diaryDatetimeText = textView;
        this.diaryDescriptionText = textView2;
        this.diaryIcon = imageView;
        this.diaryTitleText = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ShortDarkCardDiaryViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ShortDarkCardDiaryViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.short_dark_card_diary_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ShortDarkCardDiaryViewBinding bind(View view) {
        int i = R.id.bubbleBackground;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.diaryDatetimeText;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.diaryDescriptionText;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.diaryIcon;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.diaryTitleText;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            return new ShortDarkCardDiaryViewBinding((ConstraintLayout) view, appCompatImageView, textView, textView2, imageView, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
