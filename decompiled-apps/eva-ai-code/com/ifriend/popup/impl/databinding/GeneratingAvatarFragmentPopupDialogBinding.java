package com.ifriend.popup.impl.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ifriend.popup.impl.R;
import com.ifriend.ui.button.AppButton;
/* loaded from: classes6.dex */
public final class GeneratingAvatarFragmentPopupDialogBinding implements ViewBinding {
    public final AppButton popupActionButton;
    public final ImageView popupClose;
    public final ConstraintLayout popupRoot;
    public final TextView popupText;
    public final TextView popupTitle;
    private final ConstraintLayout rootView;

    private GeneratingAvatarFragmentPopupDialogBinding(ConstraintLayout constraintLayout, AppButton appButton, ImageView imageView, ConstraintLayout constraintLayout2, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.popupActionButton = appButton;
        this.popupClose = imageView;
        this.popupRoot = constraintLayout2;
        this.popupText = textView;
        this.popupTitle = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static GeneratingAvatarFragmentPopupDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GeneratingAvatarFragmentPopupDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.generating_avatar_fragment_popup_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GeneratingAvatarFragmentPopupDialogBinding bind(View view) {
        int i = R.id.popupActionButton;
        AppButton appButton = (AppButton) ViewBindings.findChildViewById(view, i);
        if (appButton != null) {
            i = R.id.popupClose;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.popupText;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.popupTitle;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        return new GeneratingAvatarFragmentPopupDialogBinding(constraintLayout, appButton, imageView, constraintLayout, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
