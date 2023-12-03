package mb;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import k0.a;
/* compiled from: DrawableUtils.java */
/* loaded from: classes.dex */
public final class a {
    public static Drawable a(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        boolean z10;
        if (Build.VERSION.SDK_INT < 23) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            Drawable mutate = k0.a.g(drawable).mutate();
            if (mode != null) {
                a.b.i(mutate, mode);
                return mutate;
            }
            return mutate;
        } else if (z10) {
            drawable.mutate();
            return drawable;
        } else {
            return drawable;
        }
    }

    public static void b(Drawable drawable, int i6) {
        boolean z10;
        if (i6 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (Build.VERSION.SDK_INT == 21) {
            if (z10) {
                drawable.setColorFilter(i6, PorterDuff.Mode.SRC_IN);
            } else {
                drawable.setColorFilter(null);
            }
        } else if (z10) {
            a.b.g(drawable, i6);
        } else {
            a.b.h(drawable, null);
        }
    }
}
