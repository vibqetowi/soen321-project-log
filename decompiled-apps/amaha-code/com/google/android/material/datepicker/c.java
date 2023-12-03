package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: CalendarStyle.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Object f8941a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f8942b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f8943c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f8944d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f8945e;
    public final Object f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f8946g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f8947h;

    public /* synthetic */ c(ViewGroup viewGroup, View view, View view2, View view3, ViewGroup viewGroup2, View view4, ViewGroup viewGroup3, RobertoTextView robertoTextView) {
        this.f8941a = viewGroup;
        this.f8942b = view;
        this.f8943c = view2;
        this.f8944d = view3;
        this.f8945e = viewGroup2;
        this.f = view4;
        this.f8946g = viewGroup3;
        this.f8947h = robertoTextView;
    }

    public static c a(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.activity_multi_tracker, (ViewGroup) null, false);
        int i6 = R.id.btnDone;
        RobertoButton robertoButton = (RobertoButton) hc.d.w(R.id.btnDone, inflate);
        if (robertoButton != null) {
            i6 = R.id.guidelineMultiTracker;
            Guideline guideline = (Guideline) hc.d.w(R.id.guidelineMultiTracker, inflate);
            if (guideline != null) {
                i6 = R.id.multiTrackerBottomSheetFragmentContainer;
                FragmentContainerView fragmentContainerView = (FragmentContainerView) hc.d.w(R.id.multiTrackerBottomSheetFragmentContainer, inflate);
                if (fragmentContainerView != null) {
                    i6 = R.id.multiTrackerButtonContainer;
                    ConstraintLayout constraintLayout = (ConstraintLayout) hc.d.w(R.id.multiTrackerButtonContainer, inflate);
                    if (constraintLayout != null) {
                        i6 = R.id.multiTrackerMoodImg;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) hc.d.w(R.id.multiTrackerMoodImg, inflate);
                        if (appCompatImageView != null) {
                            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
                            i6 = R.id.multiTrackerTitle;
                            RobertoTextView robertoTextView = (RobertoTextView) hc.d.w(R.id.multiTrackerTitle, inflate);
                            if (robertoTextView != null) {
                                return new c(coordinatorLayout, robertoButton, guideline, fragmentContainerView, constraintLayout, appCompatImageView, coordinatorLayout, robertoTextView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
    }

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(ub.b.c(context, j.class.getCanonicalName(), R.attr.materialCalendarStyle).data, ug.l.f34137u);
        this.f8941a = b.a(obtainStyledAttributes.getResourceId(3, 0), context);
        this.f8946g = b.a(obtainStyledAttributes.getResourceId(1, 0), context);
        this.f8942b = b.a(obtainStyledAttributes.getResourceId(2, 0), context);
        this.f8943c = b.a(obtainStyledAttributes.getResourceId(4, 0), context);
        ColorStateList a10 = ub.d.a(context, obtainStyledAttributes, 6);
        this.f8944d = b.a(obtainStyledAttributes.getResourceId(8, 0), context);
        this.f8945e = b.a(obtainStyledAttributes.getResourceId(7, 0), context);
        this.f = b.a(obtainStyledAttributes.getResourceId(9, 0), context);
        Paint paint = new Paint();
        this.f8947h = paint;
        paint.setColor(a10.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
