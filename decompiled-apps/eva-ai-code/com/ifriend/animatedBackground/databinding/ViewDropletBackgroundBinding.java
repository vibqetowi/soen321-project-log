package com.ifriend.animatedBackground.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.ifriend.animatedBackground.R;
/* loaded from: classes6.dex */
public final class ViewDropletBackgroundBinding implements ViewBinding {
    private final View rootView;

    private ViewDropletBackgroundBinding(View view) {
        this.rootView = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static ViewDropletBackgroundBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.view_droplet_background, viewGroup);
        return bind(viewGroup);
    }

    public static ViewDropletBackgroundBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new ViewDropletBackgroundBinding(view);
    }
}
