package com.ifriend.chat.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ifriend.chat.presentation.R;
import com.ifriend.ui.view.rate.RateAppView;
/* loaded from: classes6.dex */
public final class FragmentRateAppBinding implements ViewBinding {
    public final ConstraintLayout mainContainerRate;
    public final ConstraintLayout messageContainerRate;
    public final TextView notNowRate;
    public final ImageView popupClose;
    public final ConstraintLayout popupRoot;
    public final RateAppView rateAppView;
    public final TextView rateSymbolCount;
    public final EditText reviewInput;
    private final ConstraintLayout rootView;
    public final AppCompatButton sendReview;
    public final AppCompatButton sendReviewMessage;
    public final TextView writeAReview;

    private FragmentRateAppBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, TextView textView, ImageView imageView, ConstraintLayout constraintLayout4, RateAppView rateAppView, TextView textView2, EditText editText, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, TextView textView3) {
        this.rootView = constraintLayout;
        this.mainContainerRate = constraintLayout2;
        this.messageContainerRate = constraintLayout3;
        this.notNowRate = textView;
        this.popupClose = imageView;
        this.popupRoot = constraintLayout4;
        this.rateAppView = rateAppView;
        this.rateSymbolCount = textView2;
        this.reviewInput = editText;
        this.sendReview = appCompatButton;
        this.sendReviewMessage = appCompatButton2;
        this.writeAReview = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRateAppBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRateAppBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_rate_app, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentRateAppBinding bind(View view) {
        int i = R.id.main_container_rate;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.message_container_rate;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout2 != null) {
                i = R.id.not_now_rate;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.popup_close;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        ConstraintLayout constraintLayout3 = (ConstraintLayout) view;
                        i = R.id.rate_app_view;
                        RateAppView rateAppView = (RateAppView) ViewBindings.findChildViewById(view, i);
                        if (rateAppView != null) {
                            i = R.id.rate_symbol_count;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = R.id.review_input;
                                EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
                                if (editText != null) {
                                    i = R.id.send_review;
                                    AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(view, i);
                                    if (appCompatButton != null) {
                                        i = R.id.send_review_message;
                                        AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(view, i);
                                        if (appCompatButton2 != null) {
                                            i = R.id.write_a_review;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView3 != null) {
                                                return new FragmentRateAppBinding(constraintLayout3, constraintLayout, constraintLayout2, textView, imageView, constraintLayout3, rateAppView, textView2, editText, appCompatButton, appCompatButton2, textView3);
                                            }
                                        }
                                    }
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
