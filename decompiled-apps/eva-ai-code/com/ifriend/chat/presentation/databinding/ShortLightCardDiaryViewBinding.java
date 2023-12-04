package com.ifriend.chat.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.ui.diary.views.GradientColorTextView;
/* loaded from: classes6.dex */
public final class ShortLightCardDiaryViewBinding implements ViewBinding {
    public final GradientColorTextView diaryDatetimeText;
    public final TextView diaryDescriptionText;
    public final ImageView diaryIcon;
    public final GradientColorTextView diaryTitleText;
    private final ConstraintLayout rootView;

    private ShortLightCardDiaryViewBinding(ConstraintLayout constraintLayout, GradientColorTextView gradientColorTextView, TextView textView, ImageView imageView, GradientColorTextView gradientColorTextView2) {
        this.rootView = constraintLayout;
        this.diaryDatetimeText = gradientColorTextView;
        this.diaryDescriptionText = textView;
        this.diaryIcon = imageView;
        this.diaryTitleText = gradientColorTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ShortLightCardDiaryViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ShortLightCardDiaryViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.short_light_card_diary_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ShortLightCardDiaryViewBinding bind(View view) {
        int i = R.id.diaryDatetimeText;
        GradientColorTextView gradientColorTextView = (GradientColorTextView) ViewBindings.findChildViewById(view, i);
        if (gradientColorTextView != null) {
            i = R.id.diaryDescriptionText;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.diaryIcon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.diaryTitleText;
                    GradientColorTextView gradientColorTextView2 = (GradientColorTextView) ViewBindings.findChildViewById(view, i);
                    if (gradientColorTextView2 != null) {
                        return new ShortLightCardDiaryViewBinding((ConstraintLayout) view, gradientColorTextView, textView, imageView, gradientColorTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
