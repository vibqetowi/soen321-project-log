package com.ifriend.chat.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.ifriend.chat.presentation.R;
/* loaded from: classes6.dex */
public final class ShortDarkCardPlaceholderDiaryViewBinding implements ViewBinding {
    private final ConstraintLayout rootView;

    private ShortDarkCardPlaceholderDiaryViewBinding(ConstraintLayout constraintLayout) {
        this.rootView = constraintLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ShortDarkCardPlaceholderDiaryViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ShortDarkCardPlaceholderDiaryViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.short_dark_card_placeholder_diary_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ShortDarkCardPlaceholderDiaryViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new ShortDarkCardPlaceholderDiaryViewBinding((ConstraintLayout) view);
    }
}
