package com.google.android.material.color.utilities;
/* loaded from: classes2.dex */
public class SchemeExpressive extends DynamicScheme {
    private static final double[] HUES = {0.0d, 21.0d, 51.0d, 121.0d, 151.0d, 191.0d, 271.0d, 321.0d, 360.0d};
    private static final double[] SECONDARY_ROTATIONS = {45.0d, 95.0d, 45.0d, 20.0d, 45.0d, 90.0d, 45.0d, 45.0d, 45.0d};
    private static final double[] TERTIARY_ROTATIONS = {120.0d, 120.0d, 20.0d, 45.0d, 20.0d, 15.0d, 20.0d, 120.0d, 120.0d};

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SchemeExpressive(Hct hct, boolean z, double d) {
        super(hct, r2, z, d, r6, TonalPalette.fromHueAndChroma(DynamicScheme.getRotatedHue(hct, r0, SECONDARY_ROTATIONS), 24.0d), TonalPalette.fromHueAndChroma(DynamicScheme.getRotatedHue(hct, r0, TERTIARY_ROTATIONS), 32.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 8.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 12.0d));
        Variant variant = Variant.EXPRESSIVE;
        TonalPalette fromHueAndChroma = TonalPalette.fromHueAndChroma(MathUtils.sanitizeDegreesDouble(hct.getHue() + 120.0d), 40.0d);
        double[] dArr = HUES;
    }
}
