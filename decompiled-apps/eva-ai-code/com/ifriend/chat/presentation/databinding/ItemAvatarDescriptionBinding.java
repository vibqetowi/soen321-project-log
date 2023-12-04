package com.ifriend.chat.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.ifriend.chat.presentation.R;
/* loaded from: classes6.dex */
public final class ItemAvatarDescriptionBinding implements ViewBinding {
    private final TextView rootView;
    public final TextView title;

    private ItemAvatarDescriptionBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.title = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public TextView getRoot() {
        return this.rootView;
    }

    public static ItemAvatarDescriptionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemAvatarDescriptionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_avatar_description, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemAvatarDescriptionBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new ItemAvatarDescriptionBinding(textView, textView);
    }
}
