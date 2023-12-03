package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.theinnerhour.b2b.R;
/* compiled from: MediaRouteDialogHelper.java */
/* loaded from: classes.dex */
public final class m {
    public static int a(Context context) {
        boolean z10;
        int i6;
        float fraction;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
            z10 = true;
        } else {
            z10 = false;
        }
        TypedValue typedValue = new TypedValue();
        Resources resources = context.getResources();
        if (z10) {
            i6 = R.dimen.mr_dialog_fixed_width_minor;
        } else {
            i6 = R.dimen.mr_dialog_fixed_width_major;
        }
        resources.getValue(i6, typedValue, true);
        int i10 = typedValue.type;
        if (i10 == 5) {
            fraction = typedValue.getDimension(displayMetrics);
        } else if (i10 == 6) {
            int i11 = displayMetrics.widthPixels;
            fraction = typedValue.getFraction(i11, i11);
        } else {
            return -2;
        }
        return (int) fraction;
    }
}
