package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.theinnerhour.b2b.R;
import k0.a;
/* compiled from: MediaRouterThemeHelper.java */
/* loaded from: classes.dex */
public final class u {
    public static ContextThemeWrapper a(Context context, boolean z10) {
        int i6;
        if (!z10) {
            i6 = R.attr.dialogTheme;
        } else {
            i6 = R.attr.alertDialogTheme;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, h(i6, context));
        if (h(R.attr.mediaRouteTheme, contextThemeWrapper) != 0) {
            return new ContextThemeWrapper(contextThemeWrapper, f(contextThemeWrapper));
        }
        return contextThemeWrapper;
    }

    public static int b(ContextThemeWrapper contextThemeWrapper) {
        int h10 = h(R.attr.mediaRouteTheme, contextThemeWrapper);
        if (h10 == 0) {
            return f(contextThemeWrapper);
        }
        return h10;
    }

    public static int c(Context context) {
        if (j0.d.c(-1, g(context, R.attr.colorPrimary)) >= 3.0d) {
            return -1;
        }
        return -570425344;
    }

    public static float d(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842803, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    public static Drawable e(int i6, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i6});
        Drawable g5 = k0.a.g(obtainStyledAttributes.getDrawable(0));
        if (i(context)) {
            a.b.g(g5, g0.a.b(context, R.color.mr_dynamic_dialog_icon_light));
        }
        obtainStyledAttributes.recycle();
        return g5;
    }

    public static int f(Context context) {
        if (i(context)) {
            if (c(context) == -570425344) {
                return 2132083414;
            }
            return 2132083415;
        } else if (c(context) == -570425344) {
            return 2132083416;
        } else {
            return 2132083413;
        }
    }

    public static int g(Context context, int i6) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i6, typedValue, true);
        if (typedValue.resourceId != 0) {
            return context.getResources().getColor(typedValue.resourceId);
        }
        return typedValue.data;
    }

    public static int h(int i6, Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i6, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    public static boolean i(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true) && typedValue.data != 0) {
            return true;
        }
        return false;
    }

    public static void j(Context context, Dialog dialog) {
        int i6;
        View decorView = dialog.getWindow().getDecorView();
        if (i(context)) {
            i6 = R.color.mr_dynamic_dialog_background_light;
        } else {
            i6 = R.color.mr_dynamic_dialog_background_dark;
        }
        decorView.setBackgroundColor(g0.a.b(context, i6));
    }

    public static void k(Context context, ProgressBar progressBar) {
        int i6;
        if (!progressBar.isIndeterminate()) {
            return;
        }
        if (i(context)) {
            i6 = R.color.mr_cast_progressbar_progress_and_thumb_light;
        } else {
            i6 = R.color.mr_cast_progressbar_progress_and_thumb_dark;
        }
        progressBar.getIndeterminateDrawable().setColorFilter(g0.a.b(context, i6), PorterDuff.Mode.SRC_IN);
    }

    public static void l(Context context, MediaRouteVolumeSlider mediaRouteVolumeSlider, ViewGroup viewGroup) {
        int c10 = c(context);
        if (Color.alpha(c10) != 255) {
            c10 = j0.d.f(c10, ((Integer) viewGroup.getTag()).intValue());
        }
        mediaRouteVolumeSlider.a(c10, c10);
    }
}
