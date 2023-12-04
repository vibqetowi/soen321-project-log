package com.ifriend.chat.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.ui.diary.views.dark.ShortDarkCardPlaceholderDiaryView;
/* loaded from: classes6.dex */
public final class ShortDiaryDarkPlaceholderListItemBinding implements ViewBinding {
    public final ShortDarkCardPlaceholderDiaryView placeholder;
    private final ShortDarkCardPlaceholderDiaryView rootView;

    private ShortDiaryDarkPlaceholderListItemBinding(ShortDarkCardPlaceholderDiaryView shortDarkCardPlaceholderDiaryView, ShortDarkCardPlaceholderDiaryView shortDarkCardPlaceholderDiaryView2) {
        this.rootView = shortDarkCardPlaceholderDiaryView;
        this.placeholder = shortDarkCardPlaceholderDiaryView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ShortDarkCardPlaceholderDiaryView getRoot() {
        return this.rootView;
    }

    public static ShortDiaryDarkPlaceholderListItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ShortDiaryDarkPlaceholderListItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.short_diary_dark_placeholder_list_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ShortDiaryDarkPlaceholderListItemBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ShortDarkCardPlaceholderDiaryView shortDarkCardPlaceholderDiaryView = (ShortDarkCardPlaceholderDiaryView) view;
        return new ShortDiaryDarkPlaceholderListItemBinding(shortDarkCardPlaceholderDiaryView, shortDarkCardPlaceholderDiaryView);
    }
}
