package com.ifriend.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ifriend.ui.R;
/* loaded from: classes4.dex */
public final class CalendarPickerBinding implements ViewBinding {
    public final NumberPicker day;
    public final NumberPicker month;
    private final ConstraintLayout rootView;
    public final NumberPicker year;

    private CalendarPickerBinding(ConstraintLayout constraintLayout, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3) {
        this.rootView = constraintLayout;
        this.day = numberPicker;
        this.month = numberPicker2;
        this.year = numberPicker3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static CalendarPickerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CalendarPickerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.calendar_picker, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static CalendarPickerBinding bind(View view) {
        int i = R.id.day;
        NumberPicker numberPicker = (NumberPicker) ViewBindings.findChildViewById(view, i);
        if (numberPicker != null) {
            i = R.id.month;
            NumberPicker numberPicker2 = (NumberPicker) ViewBindings.findChildViewById(view, i);
            if (numberPicker2 != null) {
                i = R.id.year;
                NumberPicker numberPicker3 = (NumberPicker) ViewBindings.findChildViewById(view, i);
                if (numberPicker3 != null) {
                    return new CalendarPickerBinding((ConstraintLayout) view, numberPicker, numberPicker2, numberPicker3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
