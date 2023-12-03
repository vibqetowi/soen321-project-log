package com.theinnerhour.b2b.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
/* loaded from: classes2.dex */
public class CustomViewPager extends ViewPager {

    /* renamed from: w0  reason: collision with root package name */
    public boolean f11838w0;

    public CustomViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11838w0 = true;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f11838w0 && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f11838w0 && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setPagingEnabled(boolean z10) {
        this.f11838w0 = z10;
    }
}
