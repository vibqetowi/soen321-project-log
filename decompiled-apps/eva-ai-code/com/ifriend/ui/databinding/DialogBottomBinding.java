package com.ifriend.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.ifriend.ui.R;
/* loaded from: classes4.dex */
public abstract class DialogBottomBinding extends ViewDataBinding {
    public final LinearLayout container;
    public final TextView negativeButton;
    public final ConstraintLayout root;
    public final TextView title;

    /* JADX INFO: Access modifiers changed from: protected */
    public DialogBottomBinding(Object obj, View view, int i, LinearLayout linearLayout, TextView textView, ConstraintLayout constraintLayout, TextView textView2) {
        super(obj, view, i);
        this.container = linearLayout;
        this.negativeButton = textView;
        this.root = constraintLayout;
        this.title = textView2;
    }

    public static DialogBottomBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogBottomBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (DialogBottomBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_bottom, viewGroup, z, obj);
    }

    public static DialogBottomBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogBottomBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (DialogBottomBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_bottom, null, false, obj);
    }

    public static DialogBottomBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogBottomBinding bind(View view, Object obj) {
        return (DialogBottomBinding) bind(obj, view, R.layout.dialog_bottom);
    }
}
