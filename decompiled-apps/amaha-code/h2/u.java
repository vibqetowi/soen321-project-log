package h2;

import android.view.View;
/* compiled from: ViewUtilsApi19.java */
/* loaded from: classes.dex */
public class u extends df.b {
    public static boolean B = true;

    public u() {
        super(1);
    }

    public float E(View view) {
        float transitionAlpha;
        if (B) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                B = false;
            }
        }
        return view.getAlpha();
    }

    public void F(View view, float f) {
        if (B) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                B = false;
            }
        }
        view.setAlpha(f);
    }
}
