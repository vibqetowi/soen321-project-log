package com.ifriend.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ifriend.ui.R;
import eightbitlab.com.blurview.BlurView;
/* loaded from: classes4.dex */
public final class InternalNotificationSnackbarBinding implements ViewBinding {
    public final BlurView blur;
    public final TextView body;
    private final FrameLayout rootView;
    public final TextView title;

    private InternalNotificationSnackbarBinding(FrameLayout frameLayout, BlurView blurView, TextView textView, TextView textView2) {
        this.rootView = frameLayout;
        this.blur = blurView;
        this.body = textView;
        this.title = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static InternalNotificationSnackbarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static InternalNotificationSnackbarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.internal_notification_snackbar, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static InternalNotificationSnackbarBinding bind(View view) {
        int i = R.id.blur;
        BlurView blurView = (BlurView) ViewBindings.findChildViewById(view, i);
        if (blurView != null) {
            i = R.id.body;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    return new InternalNotificationSnackbarBinding((FrameLayout) view, blurView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
