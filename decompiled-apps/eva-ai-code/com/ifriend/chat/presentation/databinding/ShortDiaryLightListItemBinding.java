package com.ifriend.chat.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.ui.diary.views.light.ShortLightCardDiaryView;
/* loaded from: classes6.dex */
public final class ShortDiaryLightListItemBinding implements ViewBinding {
    public final ShortLightCardDiaryView diaryCard;
    private final ShortLightCardDiaryView rootView;

    private ShortDiaryLightListItemBinding(ShortLightCardDiaryView shortLightCardDiaryView, ShortLightCardDiaryView shortLightCardDiaryView2) {
        this.rootView = shortLightCardDiaryView;
        this.diaryCard = shortLightCardDiaryView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ShortLightCardDiaryView getRoot() {
        return this.rootView;
    }

    public static ShortDiaryLightListItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ShortDiaryLightListItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.short_diary_light_list_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ShortDiaryLightListItemBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ShortLightCardDiaryView shortLightCardDiaryView = (ShortLightCardDiaryView) view;
        return new ShortDiaryLightListItemBinding(shortLightCardDiaryView, shortLightCardDiaryView);
    }
}
