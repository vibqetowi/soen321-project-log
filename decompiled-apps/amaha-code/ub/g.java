package ub;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
/* compiled from: TypefaceUtils.java */
/* loaded from: classes.dex */
public final class g {
    public static Typeface a(Configuration configuration, Typeface typeface) {
        int i6;
        int i10;
        int weight;
        int i11;
        Typeface create;
        if (Build.VERSION.SDK_INT >= 31) {
            i6 = configuration.fontWeightAdjustment;
            if (i6 != Integer.MAX_VALUE) {
                i10 = configuration.fontWeightAdjustment;
                if (i10 != 0 && typeface != null) {
                    weight = typeface.getWeight();
                    i11 = configuration.fontWeightAdjustment;
                    create = Typeface.create(typeface, hc.d.j(i11 + weight, 1, 1000), typeface.isItalic());
                    return create;
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
