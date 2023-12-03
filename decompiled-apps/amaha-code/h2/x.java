package h2;

import android.os.Build;
import android.view.View;
/* compiled from: ViewUtilsApi23.java */
/* loaded from: classes.dex */
public class x extends w {
    public static boolean F = true;

    @Override // df.b
    public void z(int i6, View view) {
        if (Build.VERSION.SDK_INT == 28) {
            super.z(i6, view);
        } else if (F) {
            try {
                view.setTransitionVisibility(i6);
            } catch (NoSuchMethodError unused) {
                F = false;
            }
        }
    }
}
