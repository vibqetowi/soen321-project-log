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
public final class FragmentPopupSextingRequestBinding implements ViewBinding {
    public final ImageView popupIcon;
    public final TextView popupNegativeButton;
    public final AppButton popupPositiveButton;
    public final ConstraintLayout popupRoot;
    public final TextView popupText;
    public final TextView popupTitle;
    private final ConstraintLayout rootView;

    private FragmentPopupSextingRequestBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, AppButton appButton, ConstraintLayout constraintLayout2, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.popupIcon = imageView;
        this.popupNegativeButton = textView;
        this.popupPositiveButton = appButton;
        this.popupRoot = constraintLayout2;
        this.popupText = textView2;
        this.popupTitle = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentPopupSextingRequestBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPopupSextingRequestBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_popup_sexting_request, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentPopupSextingRequestBinding bind(View view) {
        int i = R.id.popupIcon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.popupNegativeButton;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.popupPositiveButton;
                AppButton appButton = (AppButton) ViewBindings.findChildViewById(view, i);
                if (appButton != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i = R.id.popupText;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.popupTitle;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            return new FragmentPopupSextingRequestBinding(constraintLayout, imageView, textView, appButton, constraintLayout, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
