package com.ifriend.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import com.ifriend.presentation.R;
/* loaded from: classes6.dex */
public final class ViewComposeBinding implements ViewBinding {
    public final ComposeView composeView;
    private final ComposeView rootView;

    private ViewComposeBinding(ComposeView composeView, ComposeView composeView2) {
        this.rootView = composeView;
        this.composeView = composeView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ComposeView getRoot() {
        return this.rootView;
    }

    public static ViewComposeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewComposeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_compose, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ViewComposeBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ComposeView composeView = (ComposeView) view;
        return new ViewComposeBinding(composeView, composeView);
    }
}
