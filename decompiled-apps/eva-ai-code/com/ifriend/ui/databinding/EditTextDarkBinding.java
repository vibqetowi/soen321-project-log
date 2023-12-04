package com.ifriend.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.viewbinding.ViewBinding;
import com.ifriend.ui.R;
/* loaded from: classes4.dex */
public final class EditTextDarkBinding implements ViewBinding {
    public final EditText edit;
    private final EditText rootView;

    private EditTextDarkBinding(EditText editText, EditText editText2) {
        this.rootView = editText;
        this.edit = editText2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public EditText getRoot() {
        return this.rootView;
    }

    public static EditTextDarkBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static EditTextDarkBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.edit_text_dark, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static EditTextDarkBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        EditText editText = (EditText) view;
        return new EditTextDarkBinding(editText, editText);
    }
}
