package com.ifriend.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ifriend.ui.R;
/* loaded from: classes4.dex */
public final class InternalNotificationCongratulationSnackbarBinding implements ViewBinding {
    public final TextView body;
    public final FrameLayout congratulationSnackbarRoot;
    private final FrameLayout rootView;
    public final TextView title;

    private InternalNotificationCongratulationSnackbarBinding(FrameLayout frameLayout, TextView textView, FrameLayout frameLayout2, TextView textView2) {
        this.rootView = frameLayout;
        this.body = textView;
        this.congratulationSnackbarRoot = frameLayout2;
        this.title = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static InternalNotificationCongratulationSnackbarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static InternalNotificationCongratulationSnackbarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.internal_notification_congratulation_snackbar, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static InternalNotificationCongratulationSnackbarBinding bind(View view) {
        int i = R.id.body;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            int i2 = R.id.title;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i2);
            if (textView2 != null) {
                return new InternalNotificationCongratulationSnackbarBinding(frameLayout, textView, frameLayout, textView2);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
