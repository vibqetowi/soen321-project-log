package com.ifriend.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ifriend.ui.R;
/* loaded from: classes4.dex */
public final class AdvantageViewBinding implements ViewBinding {
    public final TextView advantageText;
    public final ImageView check;
    public final LinearLayout container;
    private final LinearLayout rootView;

    private AdvantageViewBinding(LinearLayout linearLayout, TextView textView, ImageView imageView, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.advantageText = textView;
        this.check = imageView;
        this.container = linearLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static AdvantageViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AdvantageViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.advantage_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AdvantageViewBinding bind(View view) {
        int i = R.id.advantage_text;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.check;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new AdvantageViewBinding(linearLayout, textView, imageView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
