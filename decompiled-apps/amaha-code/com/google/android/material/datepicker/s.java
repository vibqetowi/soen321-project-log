package com.google.android.material.datepicker;

import android.view.View;
import t0.s0;
/* compiled from: MaterialDatePicker.java */
/* loaded from: classes.dex */
public final class s implements t0.t {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f8993u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ View f8994v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f8995w;

    public s(int i6, View view, int i10) {
        this.f8993u = i6;
        this.f8994v = view;
        this.f8995w = i10;
    }

    @Override // t0.t
    public final s0 i(View view, s0 s0Var) {
        int i6 = s0Var.f32351a.f(7).f21624b;
        View view2 = this.f8994v;
        int i10 = this.f8993u;
        if (i10 >= 0) {
            view2.getLayoutParams().height = i10 + i6;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f8995w + i6, view2.getPaddingRight(), view2.getPaddingBottom());
        return s0Var;
    }
}
