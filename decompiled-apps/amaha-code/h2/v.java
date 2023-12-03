package h2;

import android.graphics.Matrix;
import android.view.View;
/* compiled from: ViewUtilsApi21.java */
/* loaded from: classes.dex */
public class v extends u {
    public static boolean C = true;
    public static boolean D = true;

    public void G(View view, Matrix matrix) {
        if (C) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                C = false;
            }
        }
    }

    public void H(View view, Matrix matrix) {
        if (D) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                D = false;
            }
        }
    }
}
