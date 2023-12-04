package androidx.camera.core;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* loaded from: classes.dex */
public class AspectRatio {
    public static final int RATIO_16_9 = 1;
    public static final int RATIO_4_3 = 0;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Ratio {
    }

    private AspectRatio() {
    }
}
