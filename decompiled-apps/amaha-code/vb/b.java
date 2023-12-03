package vb;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import com.theinnerhour.b2b.R;
import j0.d;
/* compiled from: RippleUtils.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f34969a = {16842919};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f34970b = {16842908};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f34971c = {16842913, 16842919};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f34972d = {16842913};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f34973e = {16842910, 16842919};
    public static final String f = b.class.getSimpleName();

    /* compiled from: RippleUtils.java */
    /* loaded from: classes.dex */
    public static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static Drawable b(Context context, int i6) {
            ColorStateList colorStateList;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1);
            gradientDrawable.setShape(1);
            InsetDrawable insetDrawable = new InsetDrawable((Drawable) gradientDrawable, i6, i6, i6, i6);
            ColorStateList valueOf = ColorStateList.valueOf(0);
            TypedValue a10 = ub.b.a(R.attr.colorControlHighlight, context);
            if (a10 != null) {
                int i10 = a10.resourceId;
                if (i10 != 0) {
                    colorStateList = g0.a.c(i10, context);
                } else {
                    colorStateList = ColorStateList.valueOf(a10.data);
                }
            } else {
                colorStateList = null;
            }
            if (colorStateList != null) {
                valueOf = colorStateList;
            }
            return new RippleDrawable(valueOf, null, insetDrawable);
        }
    }

    public static ColorStateList a(ColorStateList colorStateList) {
        int[] iArr = f34970b;
        return new ColorStateList(new int[][]{f34972d, iArr, StateSet.NOTHING}, new int[]{b(colorStateList, f34971c), b(colorStateList, iArr), b(colorStateList, f34969a)});
    }

    public static int b(ColorStateList colorStateList, int[] iArr) {
        int i6;
        if (colorStateList != null) {
            i6 = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            i6 = 0;
        }
        return d.h(i6, Math.min(Color.alpha(i6) * 2, 255));
    }

    public static ColorStateList c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 22 && i6 <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f34973e, 0)) != 0) {
                Log.w(f, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    public static boolean d(int[] iArr) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i6 : iArr) {
            if (i6 == 16842910) {
                z10 = true;
            } else if (i6 == 16842908 || i6 == 16842919 || i6 == 16843623) {
                z11 = true;
            }
        }
        if (!z10 || !z11) {
            return false;
        }
        return true;
    }
}
