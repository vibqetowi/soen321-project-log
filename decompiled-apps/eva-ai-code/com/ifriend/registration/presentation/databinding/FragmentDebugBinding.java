package com.ifriend.registration.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ifriend.registration.presentation.R;
import com.ifriend.ui.editText.DarkEditText;
/* loaded from: classes6.dex */
public final class FragmentDebugBinding implements ViewBinding {
    public final ConstraintLayout api;
    public final DarkEditText apiEdit;
    public final TextView apiTitle;
    public final TextView close;
    public final TextView reset;
    private final ConstraintLayout rootView;
    public final TextView save;
    public final TextView title;

    private FragmentDebugBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, DarkEditText darkEditText, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = constraintLayout;
        this.api = constraintLayout2;
        this.apiEdit = darkEditText;
        this.apiTitle = textView;
        this.close = textView2;
        this.reset = textView3;
        this.save = textView4;
        this.title = textView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDebugBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDebugBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_debug, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentDebugBinding bind(View view) {
        int i = R.id.api;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.api_edit;
            DarkEditText darkEditText = (DarkEditText) ViewBindings.findChildViewById(view, i);
            if (darkEditText != null) {
                i = R.id.api_title;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.close;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.reset;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            i = R.id.save;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView4 != null) {
                                i = R.id.title;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView5 != null) {
                                    return new FragmentDebugBinding((ConstraintLayout) view, constraintLayout, darkEditText, textView, textView2, textView3, textView4, textView5);
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
