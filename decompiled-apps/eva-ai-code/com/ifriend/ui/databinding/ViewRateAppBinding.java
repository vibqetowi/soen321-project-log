package com.ifriend.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ifriend.ui.R;
import com.ifriend.ui.view.rate.RateStarView;
/* loaded from: classes4.dex */
public final class ViewRateAppBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final RateStarView star1;
    public final RateStarView star2;
    public final RateStarView star3;
    public final RateStarView star4;
    public final RateStarView star5;
    public final TextView titleRate;

    private ViewRateAppBinding(ConstraintLayout constraintLayout, RateStarView rateStarView, RateStarView rateStarView2, RateStarView rateStarView3, RateStarView rateStarView4, RateStarView rateStarView5, TextView textView) {
        this.rootView = constraintLayout;
        this.star1 = rateStarView;
        this.star2 = rateStarView2;
        this.star3 = rateStarView3;
        this.star4 = rateStarView4;
        this.star5 = rateStarView5;
        this.titleRate = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ViewRateAppBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewRateAppBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_rate_app, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ViewRateAppBinding bind(View view) {
        int i = R.id.star_1;
        RateStarView rateStarView = (RateStarView) ViewBindings.findChildViewById(view, i);
        if (rateStarView != null) {
            i = R.id.star_2;
            RateStarView rateStarView2 = (RateStarView) ViewBindings.findChildViewById(view, i);
            if (rateStarView2 != null) {
                i = R.id.star_3;
                RateStarView rateStarView3 = (RateStarView) ViewBindings.findChildViewById(view, i);
                if (rateStarView3 != null) {
                    i = R.id.star_4;
                    RateStarView rateStarView4 = (RateStarView) ViewBindings.findChildViewById(view, i);
                    if (rateStarView4 != null) {
                        i = R.id.star_5;
                        RateStarView rateStarView5 = (RateStarView) ViewBindings.findChildViewById(view, i);
                        if (rateStarView5 != null) {
                            i = R.id.title_rate;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                return new ViewRateAppBinding((ConstraintLayout) view, rateStarView, rateStarView2, rateStarView3, rateStarView4, rateStarView5, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
