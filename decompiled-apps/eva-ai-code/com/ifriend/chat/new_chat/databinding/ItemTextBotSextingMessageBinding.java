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
public final class ItemTextBotSextingMessageBinding implements ViewBinding {
    public final Guideline itemSextingMessageBotGuideline;
    public final TyperTextView itemSextingMessageBotText;
    private final ConstraintLayout rootView;

    private ItemTextBotSextingMessageBinding(ConstraintLayout constraintLayout, Guideline guideline, TyperTextView typerTextView) {
        this.rootView = constraintLayout;
        this.itemSextingMessageBotGuideline = guideline;
        this.itemSextingMessageBotText = typerTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemTextBotSextingMessageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemTextBotSextingMessageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_text_bot_sexting_message, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemTextBotSextingMessageBinding bind(View view) {
        int i = R.id.itemSextingMessageBotGuideline;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
        if (guideline != null) {
            i = R.id.itemSextingMessageBotText;
            TyperTextView typerTextView = (TyperTextView) ViewBindings.findChildViewById(view, i);
            if (typerTextView != null) {
                return new ItemTextBotSextingMessageBinding((ConstraintLayout) view, guideline, typerTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
