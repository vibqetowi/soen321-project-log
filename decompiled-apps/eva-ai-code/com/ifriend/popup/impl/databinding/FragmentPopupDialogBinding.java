package com.ifriend.popup.impl.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ifriend.popup.impl.R;
import com.ifriend.ui.button.AppButton;
/* loaded from: classes6.dex */
public final class FragmentPopupDialogBinding implements ViewBinding {
    public final AppButton popupActionButton;
    public final ImageView popupClose;
    public final ImageView popupIcon;
    public final ConstraintLayout popupRoot;
    public final TextView popupText;
    public final TextView popupTitle;
    private final ConstraintLayout rootView;
    public final TextView upgradeButton;
    public final ImageView upgradeButtonEndIcon;
    public final FrameLayout upgradeButtonGradient;
    public final Group upgradeGroup;
    public final TextView upgradeLinkText;

    private FragmentPopupDialogBinding(ConstraintLayout constraintLayout, AppButton appButton, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, TextView textView3, ImageView imageView3, FrameLayout frameLayout, Group group, TextView textView4) {
        this.rootView = constraintLayout;
        this.popupActionButton = appButton;
        this.popupClose = imageView;
        this.popupIcon = imageView2;
        this.popupRoot = constraintLayout2;
        this.popupText = textView;
        this.popupTitle = textView2;
        this.upgradeButton = textView3;
        this.upgradeButtonEndIcon = imageView3;
        this.upgradeButtonGradient = frameLayout;
        this.upgradeGroup = group;
        this.upgradeLinkText = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentPopupDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPopupDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_popup_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentPopupDialogBinding bind(View view) {
        int i = R.id.popupActionButton;
        AppButton appButton = (AppButton) ViewBindings.findChildViewById(view, i);
        if (appButton != null) {
            i = R.id.popupClose;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.popupIcon;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i = R.id.popupText;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R.id.popupTitle;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = R.id.upgradeButton;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                i = R.id.upgradeButtonEndIcon;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView3 != null) {
                                    i = R.id.upgradeButtonGradient;
                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                    if (frameLayout != null) {
                                        i = R.id.upgradeGroup;
                                        Group group = (Group) ViewBindings.findChildViewById(view, i);
                                        if (group != null) {
                                            i = R.id.upgradeLinkText;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView4 != null) {
                                                return new FragmentPopupDialogBinding(constraintLayout, appButton, imageView, imageView2, constraintLayout, textView, textView2, textView3, imageView3, frameLayout, group, textView4);
                                            }
                                        }
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
