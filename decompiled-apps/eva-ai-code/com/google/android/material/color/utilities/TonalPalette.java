package com.google.android.material.color.utilities;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public final class TonalPalette {
    Map<Integer, Integer> cache = new HashMap();
    double chroma;
    double hue;

    public static final TonalPalette fromInt(int i) {
        return fromHct(Hct.fromInt(i));
    }

    public static final TonalPalette fromHct(Hct hct) {
        return fromHueAndChroma(hct.getHue(), hct.getChroma());
    }

    public static final TonalPalette fromHueAndChroma(double d, double d2) {
        return new TonalPalette(d, d2);
    }

    private TonalPalette(double d, double d2) {
        this.hue = d;
        this.chroma = d2;
    }

    public int tone(int i) {
        Integer num = this.cache.get(Integer.valueOf(i));
        if (num == null) {
            num = Integer.valueOf(Hct.from(this.hue, this.chroma, i).toInt());
            this.cache.put(Integer.valueOf(i), num);
        }
        return num.intValue();
    }

    public Hct getHct(double d) {
        return Hct.from(this.hue, this.chroma, d);
    }

    public double getChroma() {
        return this.chroma;
    }

    public double getHue() {
        return this.hue;
    }
}
