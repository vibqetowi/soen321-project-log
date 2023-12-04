package com.ifriend.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.ifriend.ui.R;
/* loaded from: classes4.dex */
public final class OlderMessagesItemBinding implements ViewBinding {
    private final TextView rootView;
    public final TextView viewOlderMessages;

    private OlderMessagesItemBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.viewOlderMessages = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public TextView getRoot() {
        return this.rootView;
    }

    public static OlderMessagesItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static OlderMessagesItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.older_messages_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static OlderMessagesItemBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new OlderMessagesItemBinding(textView, textView);
    }
}
