package com.ifriend.chat.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ifriend.chat.presentation.R;
/* loaded from: classes6.dex */
public final class ActivityAppBinding implements ViewBinding {
    public final ComposeView composeView;
    public final FragmentContainerView rootContainer;
    private final FrameLayout rootView;

    private ActivityAppBinding(FrameLayout frameLayout, ComposeView composeView, FragmentContainerView fragmentContainerView) {
        this.rootView = frameLayout;
        this.composeView = composeView;
        this.rootContainer = fragmentContainerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ActivityAppBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityAppBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_app, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityAppBinding bind(View view) {
        int i = R.id.compose_view;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            i = R.id.rootContainer;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
            if (fragmentContainerView != null) {
                return new ActivityAppBinding((FrameLayout) view, composeView, fragmentContainerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
