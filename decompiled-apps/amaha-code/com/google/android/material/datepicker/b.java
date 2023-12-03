package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.TextView;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
import yb.f;
/* compiled from: CalendarItemStyle.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f8935a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f8936b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorStateList f8937c;

    /* renamed from: d  reason: collision with root package name */
    public final ColorStateList f8938d;

    /* renamed from: e  reason: collision with root package name */
    public final int f8939e;
    public final yb.i f;

    public b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i6, yb.i iVar, Rect rect) {
        kc.f.o(rect.left);
        kc.f.o(rect.top);
        kc.f.o(rect.right);
        kc.f.o(rect.bottom);
        this.f8935a = rect;
        this.f8936b = colorStateList2;
        this.f8937c = colorStateList;
        this.f8938d = colorStateList3;
        this.f8939e = i6;
        this.f = iVar;
    }

    public static b a(int i6, Context context) {
        boolean z10;
        if (i6 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        kc.f.m("Cannot create a CalendarItemStyle with a styleResId of 0", z10);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i6, ug.l.f34138v);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList a10 = ub.d.a(context, obtainStyledAttributes, 4);
        ColorStateList a11 = ub.d.a(context, obtainStyledAttributes, 9);
        ColorStateList a12 = ub.d.a(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        yb.i iVar = new yb.i(yb.i.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new yb.a(0)));
        obtainStyledAttributes.recycle();
        return new b(a10, a11, a12, dimensionPixelSize, iVar, rect);
    }

    public final void b(TextView textView) {
        yb.f fVar = new yb.f();
        yb.f fVar2 = new yb.f();
        yb.i iVar = this.f;
        fVar.setShapeAppearanceModel(iVar);
        fVar2.setShapeAppearanceModel(iVar);
        fVar.k(this.f8937c);
        fVar.f38424u.f38440k = this.f8939e;
        fVar.invalidateSelf();
        f.b bVar = fVar.f38424u;
        ColorStateList colorStateList = bVar.f38434d;
        ColorStateList colorStateList2 = this.f8938d;
        if (colorStateList != colorStateList2) {
            bVar.f38434d = colorStateList2;
            fVar.onStateChange(fVar.getState());
        }
        ColorStateList colorStateList3 = this.f8936b;
        textView.setTextColor(colorStateList3);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList3.withAlpha(30), fVar, fVar2);
        Rect rect = this.f8935a;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
        d0.d.q(textView, insetDrawable);
    }
}
