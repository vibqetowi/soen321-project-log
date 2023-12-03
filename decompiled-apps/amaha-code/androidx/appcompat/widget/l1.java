package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.c0;
/* compiled from: TintTypedArray.java */
/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1473a;

    /* renamed from: b  reason: collision with root package name */
    public final TypedArray f1474b;

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f1475c;

    public l1(Context context, TypedArray typedArray) {
        this.f1473a = context;
        this.f1474b = typedArray;
    }

    public static l1 m(Context context, AttributeSet attributeSet, int[] iArr, int i6) {
        return new l1(context, context.obtainStyledAttributes(attributeSet, iArr, i6, 0));
    }

    public final boolean a(int i6, boolean z10) {
        return this.f1474b.getBoolean(i6, z10);
    }

    public final ColorStateList b(int i6) {
        int resourceId;
        ColorStateList c10;
        TypedArray typedArray = this.f1474b;
        if (typedArray.hasValue(i6) && (resourceId = typedArray.getResourceId(i6, 0)) != 0 && (c10 = g0.a.c(resourceId, this.f1473a)) != null) {
            return c10;
        }
        return typedArray.getColorStateList(i6);
    }

    public final int c(int i6, int i10) {
        return this.f1474b.getDimensionPixelOffset(i6, i10);
    }

    public final int d(int i6, int i10) {
        return this.f1474b.getDimensionPixelSize(i6, i10);
    }

    public final Drawable e(int i6) {
        int resourceId;
        TypedArray typedArray = this.f1474b;
        if (typedArray.hasValue(i6) && (resourceId = typedArray.getResourceId(i6, 0)) != 0) {
            return hc.d.H(this.f1473a, resourceId);
        }
        return typedArray.getDrawable(i6);
    }

    public final Drawable f(int i6) {
        int resourceId;
        Drawable g5;
        if (this.f1474b.hasValue(i6) && (resourceId = this.f1474b.getResourceId(i6, 0)) != 0) {
            j a10 = j.a();
            Context context = this.f1473a;
            synchronized (a10) {
                g5 = a10.f1441a.g(context, resourceId, true);
            }
            return g5;
        }
        return null;
    }

    public final Typeface g(int i6, int i10, c0.a aVar) {
        int resourceId = this.f1474b.getResourceId(i6, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1475c == null) {
            this.f1475c = new TypedValue();
        }
        TypedValue typedValue = this.f1475c;
        ThreadLocal<TypedValue> threadLocal = i0.f.f19628a;
        Context context = this.f1473a;
        if (context.isRestricted()) {
            return null;
        }
        return i0.f.c(context, resourceId, typedValue, i10, aVar, true, false);
    }

    public final int h(int i6, int i10) {
        return this.f1474b.getInt(i6, i10);
    }

    public final int i(int i6, int i10) {
        return this.f1474b.getResourceId(i6, i10);
    }

    public final String j(int i6) {
        return this.f1474b.getString(i6);
    }

    public final CharSequence k(int i6) {
        return this.f1474b.getText(i6);
    }

    public final boolean l(int i6) {
        return this.f1474b.hasValue(i6);
    }

    public final void n() {
        this.f1474b.recycle();
    }
}
