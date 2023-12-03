package m6;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
/* compiled from: UiUtil.java */
/* loaded from: classes.dex */
public final class h {
    public static int a(int i6, Context context) {
        return (int) TypedValue.applyDimension(1, i6, context.getResources().getDisplayMetrics());
    }

    public static int b(Context context, String str) {
        Resources.Theme theme = context.getTheme();
        if (theme == null) {
            return -1;
        }
        TypedValue typedValue = new TypedValue();
        int identifier = context.getResources().getIdentifier(str, "attr", context.getPackageName());
        if (identifier == 0) {
            return -1;
        }
        theme.resolveAttribute(identifier, typedValue, true);
        return typedValue.data;
    }
}
