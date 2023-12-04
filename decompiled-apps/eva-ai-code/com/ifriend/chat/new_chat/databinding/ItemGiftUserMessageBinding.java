package com.ifriend.chat.new_chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import com.ifriend.chat.new_chat.R;
import com.ifriend.ui.textView.typer.ExperienceChangeTextView;
/* loaded from: classes6.dex */
public final class ItemGiftUserMessageBinding implements ViewBinding {
    public final ExperienceChangeTextView experienceChange;
    public final ShapeableImageView itemGiftUserView;
    private final FrameLayout rootView;

    private ItemGiftUserMessageBinding(FrameLayout frameLayout, ExperienceChangeTextView experienceChangeTextView, ShapeableImageView shapeableImageView) {
        this.rootView = frameLayout;
        this.experienceChange = experienceChangeTextView;
        this.itemGiftUserView = shapeableImageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ItemGiftUserMessageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemGiftUserMessageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_gift_user_message, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemGiftUserMessageBinding bind(View view) {
        int i = R.id.experience_change;
        ExperienceChangeTextView experienceChangeTextView = (ExperienceChangeTextView) ViewBindings.findChildViewById(view, i);
        if (experienceChangeTextView != null) {
            i = R.id.itemGiftUserView;
            ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
            if (shapeableImageView != null) {
                return new ItemGiftUserMessageBinding((FrameLayout) view, experienceChangeTextView, shapeableImageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
