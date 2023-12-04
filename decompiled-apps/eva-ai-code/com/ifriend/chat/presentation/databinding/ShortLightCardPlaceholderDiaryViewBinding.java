package com.ifriend.chat.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ifriend.chat.presentation.R;
/* loaded from: classes6.dex */
public final class ShortLightCardPlaceholderDiaryViewBinding implements ViewBinding {
    public final CardView placeholderCard;
    private final ConstraintLayout rootView;

    private ShortLightCardPlaceholderDiaryViewBinding(ConstraintLayout constraintLayout, CardView cardView) {
        this.rootView = constraintLayout;
        this.placeholderCard = cardView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ShortLightCardPlaceholderDiaryViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ShortLightCardPlaceholderDiaryViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.short_light_card_placeholder_diary_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ShortLightCardPlaceholderDiaryViewBinding bind(View view) {
        int i = R.id.placeholderCard;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            return new ShortLightCardPlaceholderDiaryViewBinding((ConstraintLayout) view, cardView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
