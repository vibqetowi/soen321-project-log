package com.ifriend.chat.new_chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ifriend.chat.new_chat.R;
import com.ifriend.ui.textView.typer.TyperTextView;
/* loaded from: classes6.dex */
public final class ItemTextBotMessageBinding implements ViewBinding {
    public final Guideline itemMessageBotGuideline;
    public final TyperTextView itemMessageBotText;
    private final ConstraintLayout rootView;

    private ItemTextBotMessageBinding(ConstraintLayout constraintLayout, Guideline guideline, TyperTextView typerTextView) {
        this.rootView = constraintLayout;
        this.itemMessageBotGuideline = guideline;
        this.itemMessageBotText = typerTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemTextBotMessageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemTextBotMessageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_text_bot_message, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemTextBotMessageBinding bind(View view) {
        int i = R.id.itemMessageBotGuideline;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
        if (guideline != null) {
            i = R.id.itemMessageBotText;
            TyperTextView typerTextView = (TyperTextView) ViewBindings.findChildViewById(view, i);
            if (typerTextView != null) {
                return new ItemTextBotMessageBinding((ConstraintLayout) view, guideline, typerTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
