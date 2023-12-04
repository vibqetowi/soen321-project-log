package androidx.camera.video;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public class Quality {
    public static final Quality FHD;
    public static final Quality HD;
    public static final Quality HIGHEST;
    public static final Quality LOWEST;
    static final Quality NONE;
    private static final Set<Quality> QUALITIES;
    private static final List<Quality> QUALITIES_ORDER_BY_SIZE;
    public static final Quality SD;
    public static final Quality UHD;

    private Quality() {
    }

    static {
        ConstantQuality of = ConstantQuality.of(4, "SD");
        SD = of;
        ConstantQuality of2 = ConstantQuality.of(5, "HD");
        HD = of2;
        ConstantQuality of3 = ConstantQuality.of(6, "FHD");
        FHD = of3;
        ConstantQuality of4 = ConstantQuality.of(8, "UHD");
        UHD = of4;
        ConstantQuality of5 = ConstantQuality.of(0, "LOWEST");
        LOWEST = of5;
        ConstantQuality of6 = ConstantQuality.of(1, "HIGHEST");
        HIGHEST = of6;
        NONE = ConstantQuality.of(-1, "NONE");
        QUALITIES = new HashSet(Arrays.asList(of5, of6, of, of2, of3, of4));
        QUALITIES_ORDER_BY_SIZE = Arrays.asList(of4, of3, of2, of);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean containsQuality(Quality quality) {
        return QUALITIES.contains(quality);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<Quality> getSortedQualities() {
        return new ArrayList(QUALITIES_ORDER_BY_SIZE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class ConstantQuality extends Quality {
        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract String getName();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract int getValue();

        /* JADX INFO: Access modifiers changed from: package-private */
        public ConstantQuality() {
            super();
        }

        static ConstantQuality of(int i, String str) {
            return new AutoValue_Quality_ConstantQuality(i, str);
        }
    }
}
