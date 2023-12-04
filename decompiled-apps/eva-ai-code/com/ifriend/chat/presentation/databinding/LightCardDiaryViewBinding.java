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
public final class LightCardDiaryViewBinding implements ViewBinding {
    public final ConstraintLayout cardContainer;
    public final GradientColorTextView diaryDatetimeText;
    public final TextView diaryDescriptionText;
    public final ImageView diaryHeartIcon;
    public final ImageView diaryLockIcon;
    public final GradientColorTextView diaryTitleText;
    private final ConstraintLayout rootView;

    private LightCardDiaryViewBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, GradientColorTextView gradientColorTextView, TextView textView, ImageView imageView, ImageView imageView2, GradientColorTextView gradientColorTextView2) {
        this.rootView = constraintLayout;
        this.cardContainer = constraintLayout2;
        this.diaryDatetimeText = gradientColorTextView;
        this.diaryDescriptionText = textView;
        this.diaryHeartIcon = imageView;
        this.diaryLockIcon = imageView2;
        this.diaryTitleText = gradientColorTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static LightCardDiaryViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LightCardDiaryViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.light_card_diary_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LightCardDiaryViewBinding bind(View view) {
        int i = R.id.cardContainer;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.diaryDatetimeText;
            GradientColorTextView gradientColorTextView = (GradientColorTextView) ViewBindings.findChildViewById(view, i);
            if (gradientColorTextView != null) {
                i = R.id.diaryDescriptionText;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.diaryHeartIcon;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.diaryLockIcon;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = R.id.diaryTitleText;
                            GradientColorTextView gradientColorTextView2 = (GradientColorTextView) ViewBindings.findChildViewById(view, i);
                            if (gradientColorTextView2 != null) {
                                return new LightCardDiaryViewBinding((ConstraintLayout) view, constraintLayout, gradientColorTextView, textView, imageView, imageView2, gradientColorTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
