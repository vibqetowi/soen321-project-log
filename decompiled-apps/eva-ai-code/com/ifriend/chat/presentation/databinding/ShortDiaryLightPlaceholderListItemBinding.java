package com.ifriend.chat.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.ui.diary.views.light.ShortLightCardPlaceholderDiaryView;
/* loaded from: classes6.dex */
public final class ShortDiaryLightPlaceholderListItemBinding implements ViewBinding {
    public final ShortLightCardPlaceholderDiaryView placeholder;
    private final ShortLightCardPlaceholderDiaryView rootView;

    private ShortDiaryLightPlaceholderListItemBinding(ShortLightCardPlaceholderDiaryView shortLightCardPlaceholderDiaryView, ShortLightCardPlaceholderDiaryView shortLightCardPlaceholderDiaryView2) {
        this.rootView = shortLightCardPlaceholderDiaryView;
        this.placeholder = shortLightCardPlaceholderDiaryView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ShortLightCardPlaceholderDiaryView getRoot() {
        return this.rootView;
    }

    public static ShortDiaryLightPlaceholderListItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ShortDiaryLightPlaceholderListItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.short_diary_light_placeholder_list_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ShortDiaryLightPlaceholderListItemBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ShortLightCardPlaceholderDiaryView shortLightCardPlaceholderDiaryView = (ShortLightCardPlaceholderDiaryView) view;
        return new ShortDiaryLightPlaceholderListItemBinding(shortLightCardPlaceholderDiaryView, shortLightCardPlaceholderDiaryView);
    }
}
