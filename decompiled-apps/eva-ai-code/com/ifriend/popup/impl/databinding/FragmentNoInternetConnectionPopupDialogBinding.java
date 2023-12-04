package com.ifriend.popup.impl.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ifriend.popup.impl.R;
import com.ifriend.ui.button.AppButton;
/* loaded from: classes6.dex */
public final class FragmentNoInternetConnectionPopupDialogBinding implements ViewBinding {
    public final TextView labelAction;
    public final AppButton popupActionButton;
    public final ImageView popupIcon;
    public final FrameLayout popupRoot;
    public final TextView popupText;
    public final TextView popupTitle;
    private final FrameLayout rootView;

    private FragmentNoInternetConnectionPopupDialogBinding(FrameLayout frameLayout, TextView textView, AppButton appButton, ImageView imageView, FrameLayout frameLayout2, TextView textView2, TextView textView3) {
        this.rootView = frameLayout;
        this.labelAction = textView;
        this.popupActionButton = appButton;
        this.popupIcon = imageView;
        this.popupRoot = frameLayout2;
        this.popupText = textView2;
        this.popupTitle = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentNoInternetConnectionPopupDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentNoInternetConnectionPopupDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_no_internet_connection_popup_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentNoInternetConnectionPopupDialogBinding bind(View view) {
        int i = R.id.labelAction;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.popupActionButton;
            AppButton appButton = (AppButton) ViewBindings.findChildViewById(view, i);
            if (appButton != null) {
                i = R.id.popupIcon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    FrameLayout frameLayout = (FrameLayout) view;
                    i = R.id.popupText;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.popupTitle;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            return new FragmentNoInternetConnectionPopupDialogBinding(frameLayout, textView, appButton, imageView, frameLayout, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
