package h2;

import android.view.View;
/* compiled from: ViewUtilsApi22.java */
/* loaded from: classes.dex */
public class w extends v {
    public static boolean E = true;

    @Override // df.b
    public void y(View view, int i6, int i10, int i11, int i12) {
        if (E) {
            try {
                view.setLeftTopRightBottom(i6, i10, i11, i12);
            } catch (NoSuchMethodError unused) {
                E = false;
            }
        }
    }
}
