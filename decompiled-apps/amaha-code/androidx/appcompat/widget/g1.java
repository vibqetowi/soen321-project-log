package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import com.appsflyer.R;
/* compiled from: ThemeUtils.java */
/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f1414a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f1415b = {-16842910};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f1416c = {16842908};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f1417d = {16842919};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f1418e = {16842912};
    public static final int[] f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f1419g = new int[1];

    public static void a(Context context, View view) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(kc.f.I);
        try {
            if (!obtainStyledAttributes.hasValue(R.styleable.AppCompatTheme_windowActionBar)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(int i6, Context context) {
        ColorStateList d10 = d(i6, context);
        if (d10 != null && d10.isStateful()) {
            return d10.getColorForState(f1415b, d10.getDefaultColor());
        }
        ThreadLocal<TypedValue> threadLocal = f1414a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f2 = typedValue.getFloat();
        int c10 = c(i6, context);
        return j0.d.h(c10, Math.round(Color.alpha(c10) * f2));
    }

    public static int c(int i6, Context context) {
        int[] iArr = f1419g;
        iArr[0] = i6;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(int i6, Context context) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f1419g;
        iArr[0] = i6;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = g0.a.c(resourceId, context)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
