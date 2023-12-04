package com.ifriend.chat.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ifriend.chat.presentation.R;
/* loaded from: classes6.dex */
public final class InfoOnboardingFragmentBinding implements ViewBinding {
    public final ComposeView composeView;
    private final FrameLayout rootView;

    private InfoOnboardingFragmentBinding(FrameLayout frameLayout, ComposeView composeView) {
        this.rootView = frameLayout;
        this.composeView = composeView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static InfoOnboardingFragmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static InfoOnboardingFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.info_onboarding_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static InfoOnboardingFragmentBinding bind(View view) {
        int i = R.id.composeView;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            return new InfoOnboardingFragmentBinding((FrameLayout) view, composeView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
