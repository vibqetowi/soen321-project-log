package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: SmoothCalendarLayoutManager.java */
/* loaded from: classes.dex */
public class c0 extends LinearLayoutManager {

    /* compiled from: SmoothCalendarLayoutManager.java */
    /* loaded from: classes.dex */
    public class a extends androidx.recyclerview.widget.q {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.q
        public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    public c0(Context context, int i6) {
        super(context, i6, false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.y yVar, int i6) {
        a aVar = new a(recyclerView.getContext());
        aVar.setTargetPosition(i6);
        startSmoothScroll(aVar);
    }
}
