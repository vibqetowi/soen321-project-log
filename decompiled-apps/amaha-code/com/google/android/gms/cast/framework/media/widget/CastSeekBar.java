package com.google.android.gms.cast.framework.media.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.theinnerhour.b2b.R;
import java.util.ArrayList;
import java.util.Iterator;
import kc.f;
import o9.a;
import o9.b;
import o9.c;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public class CastSeekBar extends View {
    public static final /* synthetic */ int E = 0;
    public final Paint A;
    public final int B;
    public final int C;
    public final int D;

    /* renamed from: u  reason: collision with root package name */
    public final b f7285u;
    @RecentlyNullable

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList f7286v;

    /* renamed from: w  reason: collision with root package name */
    public final float f7287w;

    /* renamed from: x  reason: collision with root package name */
    public final float f7288x;

    /* renamed from: y  reason: collision with root package name */
    public final float f7289y;

    /* renamed from: z  reason: collision with root package name */
    public final float f7290z;

    public CastSeekBar(@RecentlyNonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f7286v = new ArrayList();
        setAccessibilityDelegate(new c(this));
        Paint paint = new Paint(1);
        this.A = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f7287w = context.getResources().getDimension(R.dimen.cast_seek_bar_minimum_width);
        this.f7288x = context.getResources().getDimension(R.dimen.cast_seek_bar_minimum_height);
        this.f7289y = context.getResources().getDimension(R.dimen.cast_seek_bar_progress_height) / 2.0f;
        context.getResources().getDimension(R.dimen.cast_seek_bar_thumb_size);
        this.f7290z = context.getResources().getDimension(R.dimen.cast_seek_bar_ad_break_minimum_width);
        b bVar = new b();
        this.f7285u = bVar;
        bVar.f27309a = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.f23218h0, R.attr.castExpandedControllerStyle, R.style.CastExpandedController);
        int resourceId = obtainStyledAttributes.getResourceId(18, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(20, 0);
        int resourceId3 = obtainStyledAttributes.getResourceId(23, 0);
        int resourceId4 = obtainStyledAttributes.getResourceId(0, 0);
        this.B = context.getResources().getColor(resourceId);
        context.getResources().getColor(resourceId2);
        this.C = context.getResources().getColor(resourceId3);
        this.D = context.getResources().getColor(resourceId4);
        obtainStyledAttributes.recycle();
    }

    public final void a(Canvas canvas, int i6, int i10, int i11, int i12, int i13) {
        Paint paint = this.A;
        paint.setColor(i13);
        float f = i11;
        float f2 = i12;
        float f10 = this.f7289y;
        canvas.drawRect((i6 / f) * f2, -f10, (i10 / f) * f2, f10, paint);
    }

    public int getMaxProgress() {
        return this.f7285u.f27309a;
    }

    public int getProgress() {
        this.f7285u.getClass();
        return 0;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(@RecentlyNonNull Canvas canvas) {
        int i6;
        float f;
        float f2;
        int save = canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int progress = getProgress();
        int save2 = canvas.save();
        canvas.translate(0.0f, ((measuredHeight - paddingTop) - paddingBottom) / 2);
        b bVar = this.f7285u;
        bVar.getClass();
        int max = Math.max(0, 0);
        if (max > 0) {
            i6 = max;
            a(canvas, 0, max, bVar.f27309a, measuredWidth, this.C);
        } else {
            i6 = max;
        }
        if (progress > i6) {
            a(canvas, i6, progress, bVar.f27309a, measuredWidth, this.B);
        }
        int i10 = bVar.f27309a;
        if (i10 > progress) {
            a(canvas, progress, i10, i10, measuredWidth, this.C);
        }
        canvas.restoreToCount(save2);
        ArrayList arrayList = this.f7286v;
        if (arrayList != null && !arrayList.isEmpty()) {
            Paint paint = this.A;
            paint.setColor(this.D);
            int measuredWidth2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            int measuredHeight2 = getMeasuredHeight();
            int paddingTop2 = getPaddingTop();
            int paddingBottom2 = getPaddingBottom();
            int save3 = canvas.save();
            canvas.translate(0.0f, ((measuredHeight2 - paddingTop2) - paddingBottom2) / 2);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((a) it.next()) != null) {
                    int min = Math.min(0, bVar.f27309a);
                    float f10 = measuredWidth2;
                    float f11 = bVar.f27309a;
                    float f12 = (min * f10) / f11;
                    float f13 = ((min + 1) * f10) / f11;
                    float f14 = this.f7290z;
                    if (f13 - f12 < f14) {
                        f13 = f12 + f14;
                    }
                    if (f13 > f10) {
                        f = f10;
                    } else {
                        f = f13;
                    }
                    if (f - f12 < f14) {
                        f2 = f - f14;
                    } else {
                        f2 = f12;
                    }
                    float f15 = this.f7289y;
                    canvas.drawRect(f2, -f15, f, f15, paint);
                }
            }
            canvas.restoreToCount(save3);
        }
        isEnabled();
        canvas.restoreToCount(save);
    }

    @Override // android.view.View
    public final synchronized void onMeasure(int i6, int i10) {
        setMeasuredDimension(View.resolveSizeAndState((int) (this.f7287w + getPaddingLeft() + getPaddingRight()), i6, 0), View.resolveSizeAndState((int) (this.f7288x + getPaddingTop() + getPaddingBottom()), i10, 0));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@RecentlyNonNull MotionEvent motionEvent) {
        if (isEnabled()) {
            this.f7285u.getClass();
            return false;
        }
        return false;
    }
}
