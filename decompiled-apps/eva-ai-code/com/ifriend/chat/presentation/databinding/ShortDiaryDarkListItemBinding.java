package com.ifriend.chat.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.ui.diary.views.dark.ShortDarkCardDiaryView;
/* loaded from: classes6.dex */
public final class ShortDiaryDarkListItemBinding implements ViewBinding {
    public final ShortDarkCardDiaryView diaryCard;
    private final ShortDarkCardDiaryView rootView;

    private ShortDiaryDarkListItemBinding(ShortDarkCardDiaryView shortDarkCardDiaryView, ShortDarkCardDiaryView shortDarkCardDiaryView2) {
        this.rootView = shortDarkCardDiaryView;
        this.diaryCard = shortDarkCardDiaryView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ShortDarkCardDiaryView getRoot() {
        return this.rootView;
    }

    public static ShortDiaryDarkListItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ShortDiaryDarkListItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.short_diary_dark_list_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ShortDiaryDarkListItemBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ShortDarkCardDiaryView shortDarkCardDiaryView = (ShortDarkCardDiaryView) view;
        return new ShortDiaryDarkListItemBinding(shortDarkCardDiaryView, shortDarkCardDiaryView);
    }
}
