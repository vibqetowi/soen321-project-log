package com.ifriend.chat.new_chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import com.ifriend.chat.new_chat.R;
/* loaded from: classes6.dex */
public final class ItemImageUserMessageBinding implements ViewBinding {
    public final ShapeableImageView itemImageUserView;
    private final FrameLayout rootView;

    private ItemImageUserMessageBinding(FrameLayout frameLayout, ShapeableImageView shapeableImageView) {
        this.rootView = frameLayout;
        this.itemImageUserView = shapeableImageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ItemImageUserMessageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemImageUserMessageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_image_user_message, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemImageUserMessageBinding bind(View view) {
        int i = R.id.itemImageUserView;
        ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
        if (shapeableImageView != null) {
            return new ItemImageUserMessageBinding((FrameLayout) view, shapeableImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
