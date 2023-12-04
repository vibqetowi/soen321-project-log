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
/* loaded from: classes6.dex */
public final class DarkCardDiaryViewBinding implements ViewBinding {
    public final ImageView bubbleBackground;
    public final TextView diaryDatetimeText;
    public final TextView diaryDescriptionText;
    public final ImageView diaryLockIcon;
    public final TextView diaryTitleText;
    private final ConstraintLayout rootView;

    private DarkCardDiaryViewBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, ImageView imageView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.bubbleBackground = imageView;
        this.diaryDatetimeText = textView;
        this.diaryDescriptionText = textView2;
        this.diaryLockIcon = imageView2;
        this.diaryTitleText = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DarkCardDiaryViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DarkCardDiaryViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dark_card_diary_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DarkCardDiaryViewBinding bind(View view) {
        int i = R.id.bubbleBackground;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.diaryDatetimeText;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.diaryDescriptionText;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.diaryLockIcon;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = R.id.diaryTitleText;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            return new DarkCardDiaryViewBinding((ConstraintLayout) view, imageView, textView, textView2, imageView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
