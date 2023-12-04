package com.ifriend.chat.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.ifriend.chat.presentation.R;
/* loaded from: classes6.dex */
public abstract class FragmentResetBinding extends ViewDataBinding {
    public final ImageView back;
    public final TextView description;
    public final ConstraintLayout eraseAll;
    public final TextView eraseAllText;
    public final ConstraintLayout eraseLast24Hours;
    public final TextView eraseLast24HoursText;
    public final ConstraintLayout eraseLastHour;
    public final TextView eraseLastHourText;
    public final TextView note;
    public final TextView title;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentResetBinding(Object obj, View view, int i, ImageView imageView, TextView textView, ConstraintLayout constraintLayout, TextView textView2, ConstraintLayout constraintLayout2, TextView textView3, ConstraintLayout constraintLayout3, TextView textView4, TextView textView5, TextView textView6) {
        super(obj, view, i);
        this.back = imageView;
        this.description = textView;
        this.eraseAll = constraintLayout;
        this.eraseAllText = textView2;
        this.eraseLast24Hours = constraintLayout2;
        this.eraseLast24HoursText = textView3;
        this.eraseLastHour = constraintLayout3;
        this.eraseLastHourText = textView4;
        this.note = textView5;
        this.title = textView6;
    }

    public static FragmentResetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentResetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentResetBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_reset, viewGroup, z, obj);
    }

    public static FragmentResetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentResetBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentResetBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_reset, null, false, obj);
    }

    public static FragmentResetBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentResetBinding bind(View view, Object obj) {
        return (FragmentResetBinding) bind(obj, view, R.layout.fragment_reset);
    }
}
