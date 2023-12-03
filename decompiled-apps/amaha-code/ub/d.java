package ub;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.l1;
/* compiled from: MaterialResources.java */
/* loaded from: classes.dex */
public final class d {
    public static ColorStateList a(Context context, TypedArray typedArray, int i6) {
        int resourceId;
        ColorStateList c10;
        if (typedArray.hasValue(i6) && (resourceId = typedArray.getResourceId(i6, 0)) != 0 && (c10 = g0.a.c(resourceId, context)) != null) {
            return c10;
        }
        return typedArray.getColorStateList(i6);
    }

    public static ColorStateList b(Context context, l1 l1Var, int i6) {
        int i10;
        ColorStateList c10;
        if (l1Var.l(i6) && (i10 = l1Var.i(i6, 0)) != 0 && (c10 = g0.a.c(i10, context)) != null) {
            return c10;
        }
        return l1Var.b(i6);
    }

    public static Drawable c(Context context, TypedArray typedArray, int i6) {
        int resourceId;
        Drawable H;
        if (typedArray.hasValue(i6) && (resourceId = typedArray.getResourceId(i6, 0)) != 0 && (H = hc.d.H(context, resourceId)) != null) {
            return H;
        }
        return typedArray.getDrawable(i6);
    }

    public static boolean d(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }
}
