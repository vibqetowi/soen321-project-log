package com.ifriend.chat.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ifriend.chat.presentation.R;
import com.ifriend.ui.button.AppButton;
/* loaded from: classes6.dex */
public final class LevelPopupDialogBinding implements ViewBinding {
    public final ImageView avatar;
    public final ImageView bookImage;
    public final ConstraintLayout levelPopupContainer;
    public final ImageView levelUpImage;
    public final TextView levelUpText;
    public final AppButton popupActionButton;
    public final ConstraintLayout popupRoot;
    public final TextView popupText;
    public final TextView popupTitle;
    private final ConstraintLayout rootView;

    private LevelPopupDialogBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout2, ImageView imageView3, TextView textView, AppButton appButton, ConstraintLayout constraintLayout3, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.avatar = imageView;
        this.bookImage = imageView2;
        this.levelPopupContainer = constraintLayout2;
        this.levelUpImage = imageView3;
        this.levelUpText = textView;
        this.popupActionButton = appButton;
        this.popupRoot = constraintLayout3;
        this.popupText = textView2;
        this.popupTitle = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static LevelPopupDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LevelPopupDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.level_popup_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LevelPopupDialogBinding bind(View view) {
        int i = R.id.avatar;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.bookImage;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.levelPopupContainer;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = R.id.levelUpImage;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView3 != null) {
                        i = R.id.levelUpText;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = R.id.popupActionButton;
                            AppButton appButton = (AppButton) ViewBindings.findChildViewById(view, i);
                            if (appButton != null) {
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                                i = R.id.popupText;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = R.id.popupTitle;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        return new LevelPopupDialogBinding(constraintLayout2, imageView, imageView2, constraintLayout, imageView3, textView, appButton, constraintLayout2, textView2, textView3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
