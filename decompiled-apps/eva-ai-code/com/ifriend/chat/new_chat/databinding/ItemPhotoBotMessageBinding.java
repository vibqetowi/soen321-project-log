package com.ifriend.chat.new_chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import com.ifriend.chat.new_chat.R;
/* loaded from: classes6.dex */
public final class ItemPhotoBotMessageBinding implements ViewBinding {
    public final LinearLayout amountContainer;
    public final TextView amountLabel;
    public final ImageView image;
    public final ShapeableImageView itemImageBotView;
    private final FrameLayout rootView;

    private ItemPhotoBotMessageBinding(FrameLayout frameLayout, LinearLayout linearLayout, TextView textView, ImageView imageView, ShapeableImageView shapeableImageView) {
        this.rootView = frameLayout;
        this.amountContainer = linearLayout;
        this.amountLabel = textView;
        this.image = imageView;
        this.itemImageBotView = shapeableImageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ItemPhotoBotMessageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemPhotoBotMessageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_photo_bot_message, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemPhotoBotMessageBinding bind(View view) {
        int i = R.id.amountContainer;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.amountLabel;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.image;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.itemImageBotView;
                    ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
                    if (shapeableImageView != null) {
                        return new ItemPhotoBotMessageBinding((FrameLayout) view, linearLayout, textView, imageView, shapeableImageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
