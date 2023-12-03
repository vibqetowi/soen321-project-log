package androidx.appcompat.widget;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
/* compiled from: TooltipCompat.java */
/* loaded from: classes.dex */
public final class p1 {

    /* compiled from: TooltipCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.a(view, charSequence);
            return;
        }
        r1 r1Var = r1.E;
        if (r1Var != null && r1Var.f1533u == view) {
            r1.b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            r1 r1Var2 = r1.F;
            if (r1Var2 != null && r1Var2.f1533u == view) {
                r1Var2.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new r1(view, charSequence);
    }
}
