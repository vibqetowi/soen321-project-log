package com.ifriend.animatedBackground.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.ifriend.animatedBackground.R;
/* loaded from: classes6.dex */
public final class ViewAnimatedBackgroundBinding implements ViewBinding {
    private final View rootView;

    private ViewAnimatedBackgroundBinding(View view) {
        this.rootView = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static ViewAnimatedBackgroundBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.view_animated_background, viewGroup);
        return bind(viewGroup);
    }

    public static ViewAnimatedBackgroundBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new ViewAnimatedBackgroundBinding(view);
    }
}
