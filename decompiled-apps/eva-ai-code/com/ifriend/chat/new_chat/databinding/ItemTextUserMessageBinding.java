package com.ifriend.chat.new_chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ifriend.chat.new_chat.R;
import com.ifriend.ui.textView.typer.ExperienceChangeTextView;
/* loaded from: classes6.dex */
public final class ItemTextUserMessageBinding implements ViewBinding {
    public final ExperienceChangeTextView experienceChange;
    public final Guideline itemMessageUserGuideline;
    public final TextView itemMessageUserText;
    private final ConstraintLayout rootView;

    private ItemTextUserMessageBinding(ConstraintLayout constraintLayout, ExperienceChangeTextView experienceChangeTextView, Guideline guideline, TextView textView) {
        this.rootView = constraintLayout;
        this.experienceChange = experienceChangeTextView;
        this.itemMessageUserGuideline = guideline;
        this.itemMessageUserText = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemTextUserMessageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemTextUserMessageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_text_user_message, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemTextUserMessageBinding bind(View view) {
        int i = R.id.experience_change;
        ExperienceChangeTextView experienceChangeTextView = (ExperienceChangeTextView) ViewBindings.findChildViewById(view, i);
        if (experienceChangeTextView != null) {
            i = R.id.itemMessageUserGuideline;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
            if (guideline != null) {
                i = R.id.itemMessageUserText;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new ItemTextUserMessageBinding((ConstraintLayout) view, experienceChangeTextView, guideline, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
