package com.google.android.material.datepicker;

import android.view.View;
import com.theinnerhour.b2b.R;
/* compiled from: MaterialCalendar.java */
/* loaded from: classes.dex */
public final class m extends t0.a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ j f8976d;

    public m(j jVar) {
        this.f8976d = jVar;
    }

    @Override // t0.a
    public final void d(View view, u0.h hVar) {
        String string;
        this.f32269a.onInitializeAccessibilityNodeInfo(view, hVar.f33731a);
        j jVar = this.f8976d;
        if (jVar.H.getVisibility() == 0) {
            string = jVar.getString(R.string.mtrl_picker_toggle_to_year_selection);
        } else {
            string = jVar.getString(R.string.mtrl_picker_toggle_to_day_selection);
        }
        hVar.j(string);
    }
}
