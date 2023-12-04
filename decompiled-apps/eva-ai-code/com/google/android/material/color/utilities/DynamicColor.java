package com.google.android.material.color.utilities;

import java.util.HashMap;
import java.util.function.BiFunction;
import java.util.function.Function;
/* loaded from: classes2.dex */
public final class DynamicColor {
    public final Function<DynamicScheme, DynamicColor> background;
    public final Function<DynamicScheme, Double> chroma;
    private final HashMap<DynamicScheme, Hct> hctCache = new HashMap<>();
    public final Function<DynamicScheme, Double> hue;
    public final Function<DynamicScheme, Double> opacity;
    public final Function<DynamicScheme, Double> tone;
    public final Function<DynamicScheme, ToneDeltaConstraint> toneDeltaConstraint;
    public final Function<DynamicScheme, Double> toneMaxContrast;
    public final Function<DynamicScheme, Double> toneMinContrast;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ TonalPalette lambda$fromArgb$0(TonalPalette tonalPalette, DynamicScheme dynamicScheme) {
        return tonalPalette;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ DynamicColor lambda$getTone$11(DynamicColor dynamicColor, DynamicScheme dynamicScheme) {
        return dynamicColor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Double lambda$toneMinContrastDefault$16(Double d) {
        return d;
    }

    public DynamicColor(Function<DynamicScheme, Double> function, Function<DynamicScheme, Double> function2, Function<DynamicScheme, Double> function3, Function<DynamicScheme, Double> function4, Function<DynamicScheme, DynamicColor> function5, Function<DynamicScheme, Double> function6, Function<DynamicScheme, Double> function7, Function<DynamicScheme, ToneDeltaConstraint> function8) {
        this.hue = function;
        this.chroma = function2;
        this.tone = function3;
        this.opacity = function4;
        this.background = function5;
        this.toneMinContrast = function6;
        this.toneMaxContrast = function7;
        this.toneDeltaConstraint = function8;
    }

    public static DynamicColor fromArgb(int i) {
        final Hct fromInt = Hct.fromInt(i);
        final TonalPalette fromInt2 = TonalPalette.fromInt(i);
        return fromPalette(new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DynamicColor.lambda$fromArgb$0(TonalPalette.this, (DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda10
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                DynamicScheme dynamicScheme = (DynamicScheme) obj;
                valueOf = Double.valueOf(Hct.this.getTone());
                return valueOf;
            }
        });
    }

    public static DynamicColor fromArgb(final int i, Function<DynamicScheme, Double> function) {
        return fromPalette(new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette fromInt;
                DynamicScheme dynamicScheme = (DynamicScheme) obj;
                fromInt = TonalPalette.fromInt(i);
                return fromInt;
            }
        }, function);
    }

    public static DynamicColor fromArgb(final int i, Function<DynamicScheme, Double> function, Function<DynamicScheme, DynamicColor> function2) {
        return fromPalette(new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda20
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette fromInt;
                DynamicScheme dynamicScheme = (DynamicScheme) obj;
                fromInt = TonalPalette.fromInt(i);
                return fromInt;
            }
        }, function, function2);
    }

    public static DynamicColor fromArgb(final int i, Function<DynamicScheme, Double> function, Function<DynamicScheme, DynamicColor> function2, Function<DynamicScheme, ToneDeltaConstraint> function3) {
        return fromPalette(new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda8
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette fromInt;
                DynamicScheme dynamicScheme = (DynamicScheme) obj;
                fromInt = TonalPalette.fromInt(i);
                return fromInt;
            }
        }, function, function2, function3);
    }

    public static DynamicColor fromPalette(Function<DynamicScheme, TonalPalette> function, Function<DynamicScheme, Double> function2) {
        return fromPalette(function, function2, null, null);
    }

    public static DynamicColor fromPalette(Function<DynamicScheme, TonalPalette> function, Function<DynamicScheme, Double> function2, Function<DynamicScheme, DynamicColor> function3) {
        return fromPalette(function, function2, function3, null);
    }

    public static DynamicColor fromPalette(final Function<DynamicScheme, TonalPalette> function, final Function<DynamicScheme, Double> function2, final Function<DynamicScheme, DynamicColor> function3, final Function<DynamicScheme, ToneDeltaConstraint> function4) {
        return new DynamicColor(new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda13
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double apply;
                apply = function.apply((DynamicScheme) obj);
                return apply;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda14
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double apply;
                apply = function.apply((DynamicScheme) obj);
                return apply;
            }
        }, function2, null, function3, new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda15
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(DynamicColor.toneMinContrastDefault(function2, function3, (DynamicScheme) obj, function4));
                return valueOf;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda16
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(DynamicColor.toneMaxContrastDefault(function2, function3, (DynamicScheme) obj, function4));
                return valueOf;
            }
        }, function4);
    }

    public int getArgb(DynamicScheme dynamicScheme) {
        Object apply;
        int i = getHct(dynamicScheme).toInt();
        Function<DynamicScheme, Double> function = this.opacity;
        if (function == null) {
            return i;
        }
        apply = function.apply(dynamicScheme);
        return (MathUtils.clampInt(0, 255, (int) Math.round(((Double) apply).doubleValue() * 255.0d)) << 24) | (i & 16777215);
    }

    public Hct getHct(DynamicScheme dynamicScheme) {
        Object apply;
        Object apply2;
        Hct hct = this.hctCache.get(dynamicScheme);
        if (hct != null) {
            return hct;
        }
        apply = this.hue.apply(dynamicScheme);
        double doubleValue = ((Double) apply).doubleValue();
        apply2 = this.chroma.apply(dynamicScheme);
        Hct from = Hct.from(doubleValue, ((Double) apply2).doubleValue(), getTone(dynamicScheme));
        if (this.hctCache.size() > 4) {
            this.hctCache.clear();
        }
        this.hctCache.put(dynamicScheme, from);
        return from;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
        if (r7 != null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public double getTone(final DynamicScheme dynamicScheme) {
        Object apply;
        Object apply2;
        final DynamicColor dynamicColor;
        final double d;
        Object apply3;
        Object apply4;
        Object apply5;
        Object apply6;
        Object apply7;
        Object apply8;
        Object apply9;
        Object apply10;
        apply = this.tone.apply(dynamicScheme);
        final double doubleValue = ((Double) apply).doubleValue();
        boolean z = true;
        boolean z2 = dynamicScheme.contrastLevel < 0.0d;
        if (dynamicScheme.contrastLevel != 0.0d) {
            apply10 = this.tone.apply(dynamicScheme);
            double doubleValue2 = ((Double) apply10).doubleValue();
            doubleValue = doubleValue2 + ((((Double) (z2 ? this.toneMinContrast.apply(dynamicScheme) : this.toneMaxContrast.apply(dynamicScheme))).doubleValue() - doubleValue2) * Math.abs(dynamicScheme.contrastLevel));
        }
        Function<DynamicScheme, DynamicColor> function = this.background;
        if (function == null) {
            dynamicColor = null;
        } else {
            apply2 = function.apply(dynamicScheme);
            dynamicColor = (DynamicColor) apply2;
        }
        if (dynamicColor != null) {
            Function<DynamicScheme, DynamicColor> function2 = dynamicColor.background;
            if (function2 != null) {
                apply9 = function2.apply(dynamicScheme);
            }
            z = false;
            apply3 = this.tone.apply(dynamicScheme);
            double doubleValue3 = ((Double) apply3).doubleValue();
            apply4 = dynamicColor.tone.apply(dynamicScheme);
            double ratioOfTones = Contrast.ratioOfTones(doubleValue3, ((Double) apply4).doubleValue());
            if (z2) {
                apply7 = this.toneMinContrast.apply(dynamicScheme);
                double doubleValue4 = ((Double) apply7).doubleValue();
                apply8 = dynamicColor.toneMinContrast.apply(dynamicScheme);
                r11 = z ? Contrast.ratioOfTones(doubleValue4, ((Double) apply8).doubleValue()) : 1.0d;
                d = ratioOfTones;
            } else {
                apply5 = this.toneMaxContrast.apply(dynamicScheme);
                double doubleValue5 = ((Double) apply5).doubleValue();
                apply6 = dynamicColor.toneMaxContrast.apply(dynamicScheme);
                double ratioOfTones2 = Contrast.ratioOfTones(doubleValue5, ((Double) apply6).doubleValue());
                r11 = z ? Math.min(ratioOfTones2, ratioOfTones) : 1.0d;
                if (z) {
                    d = Math.max(ratioOfTones2, ratioOfTones);
                }
            }
            return calculateDynamicTone(dynamicScheme, this.tone, new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda3
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Double valueOf;
                    valueOf = Double.valueOf(((DynamicColor) obj).getTone(DynamicScheme.this));
                    return valueOf;
                }
            }, new BiFunction() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda4
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    Double valueOf;
                    Double d2 = (Double) obj;
                    Double d3 = (Double) obj2;
                    valueOf = Double.valueOf(doubleValue);
                    return valueOf;
                }
            }, new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda5
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return DynamicColor.lambda$getTone$11(DynamicColor.this, (DynamicScheme) obj);
                }
            }, this.toneDeltaConstraint, new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda6
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Double valueOf;
                    Double d2 = (Double) obj;
                    valueOf = Double.valueOf(r1);
                    return valueOf;
                }
            }, new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda7
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Double valueOf;
                    Double d2 = (Double) obj;
                    valueOf = Double.valueOf(d);
                    return valueOf;
                }
            });
        }
        d = 21.0d;
        return calculateDynamicTone(dynamicScheme, this.tone, new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(((DynamicColor) obj).getTone(DynamicScheme.this));
                return valueOf;
            }
        }, new BiFunction() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda4
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Double valueOf;
                Double d2 = (Double) obj;
                Double d3 = (Double) obj2;
                valueOf = Double.valueOf(doubleValue);
                return valueOf;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DynamicColor.lambda$getTone$11(DynamicColor.this, (DynamicScheme) obj);
            }
        }, this.toneDeltaConstraint, new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                Double d2 = (Double) obj;
                valueOf = Double.valueOf(r1);
                return valueOf;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda7
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                Double d2 = (Double) obj;
                valueOf = Double.valueOf(d);
                return valueOf;
            }
        });
    }

    public static double toneMinContrastDefault(final Function<DynamicScheme, Double> function, final Function<DynamicScheme, DynamicColor> function2, final DynamicScheme dynamicScheme, Function<DynamicScheme, ToneDeltaConstraint> function3) {
        return calculateDynamicTone(dynamicScheme, function, new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda17
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double apply;
                apply = ((DynamicColor) obj).toneMinContrast.apply(DynamicScheme.this);
                return apply;
            }
        }, new BiFunction() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda18
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return DynamicColor.lambda$toneMinContrastDefault$15(function, dynamicScheme, function2, (Double) obj, (Double) obj2);
            }
        }, function2, function3, null, new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda19
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DynamicColor.lambda$toneMinContrastDefault$16((Double) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Double lambda$toneMinContrastDefault$15(Function function, DynamicScheme dynamicScheme, Function function2, Double d, Double d2) {
        Object apply;
        boolean z;
        Object apply2;
        Object apply3;
        Object apply4;
        Object apply5;
        apply = function.apply(dynamicScheme);
        double doubleValue = ((Double) apply).doubleValue();
        if (d.doubleValue() >= 7.0d) {
            doubleValue = contrastingTone(d2.doubleValue(), 4.5d);
        } else if (d.doubleValue() >= 3.0d) {
            doubleValue = contrastingTone(d2.doubleValue(), 3.0d);
        } else {
            if (function2 != null) {
                apply2 = function2.apply(dynamicScheme);
                if (apply2 != null) {
                    apply3 = function2.apply(dynamicScheme);
                    if (((DynamicColor) apply3).background != null) {
                        apply4 = function2.apply(dynamicScheme);
                        apply5 = ((DynamicColor) apply4).background.apply(dynamicScheme);
                        if (apply5 != null) {
                            z = true;
                            if (z) {
                                doubleValue = contrastingTone(d2.doubleValue(), d.doubleValue());
                            }
                        }
                    }
                }
            }
            z = false;
            if (z) {
            }
        }
        return Double.valueOf(doubleValue);
    }

    public static double toneMaxContrastDefault(Function<DynamicScheme, Double> function, final Function<DynamicScheme, DynamicColor> function2, final DynamicScheme dynamicScheme, Function<DynamicScheme, ToneDeltaConstraint> function3) {
        return calculateDynamicTone(dynamicScheme, function, new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda11
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double apply;
                apply = ((DynamicColor) obj).toneMaxContrast.apply(DynamicScheme.this);
                return apply;
            }
        }, new BiFunction() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda12
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return DynamicColor.lambda$toneMaxContrastDefault$18(function2, dynamicScheme, (Double) obj, (Double) obj2);
            }
        }, function2, function3, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Double lambda$toneMaxContrastDefault$18(Function function, DynamicScheme dynamicScheme, Double d, Double d2) {
        boolean z;
        Object apply;
        Object apply2;
        Object apply3;
        Object apply4;
        if (function != null) {
            apply = function.apply(dynamicScheme);
            if (apply != null) {
                apply2 = function.apply(dynamicScheme);
                if (((DynamicColor) apply2).background != null) {
                    apply3 = function.apply(dynamicScheme);
                    apply4 = ((DynamicColor) apply3).background.apply(dynamicScheme);
                    if (apply4 != null) {
                        z = true;
                        if (!z) {
                            return Double.valueOf(contrastingTone(d2.doubleValue(), 7.0d));
                        }
                        return Double.valueOf(contrastingTone(d2.doubleValue(), Math.max(7.0d, d.doubleValue())));
                    }
                }
            }
        }
        z = false;
        if (!z) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static double calculateDynamicTone(DynamicScheme dynamicScheme, Function<DynamicScheme, Double> function, Function<DynamicColor, Double> function2, BiFunction<Double, Double, Double> biFunction, Function<DynamicScheme, DynamicColor> function3, Function<DynamicScheme, ToneDeltaConstraint> function4, Function<Double, Double> function5, Function<Double, Double> function6) {
        Object apply;
        Object apply2;
        DynamicColor dynamicColor;
        Object apply3;
        Object apply4;
        Object apply5;
        Object apply6;
        Object apply7;
        double doubleValue;
        double clampDouble;
        Function<DynamicScheme, DynamicColor> function7;
        double enableLightForeground;
        Object apply8;
        Object apply9;
        Object apply10;
        apply = function.apply(dynamicScheme);
        double doubleValue2 = ((Double) apply).doubleValue();
        if (function3 == null) {
            dynamicColor = null;
        } else {
            apply2 = function3.apply(dynamicScheme);
            dynamicColor = (DynamicColor) apply2;
        }
        if (dynamicColor == null) {
            return doubleValue2;
        }
        apply3 = dynamicColor.tone.apply(dynamicScheme);
        double ratioOfTones = Contrast.ratioOfTones(doubleValue2, ((Double) apply3).doubleValue());
        apply4 = function2.apply(dynamicColor);
        double doubleValue3 = ((Double) apply4).doubleValue();
        apply5 = biFunction.apply(Double.valueOf(ratioOfTones), Double.valueOf(doubleValue3));
        double doubleValue4 = ((Double) apply5).doubleValue();
        double ratioOfTones2 = Contrast.ratioOfTones(doubleValue3, doubleValue4);
        double d = 1.0d;
        if (function5 != null) {
            apply9 = function5.apply(Double.valueOf(ratioOfTones));
            if (apply9 != null) {
                apply10 = function5.apply(Double.valueOf(ratioOfTones));
                d = ((Double) apply10).doubleValue();
            }
        }
        if (function6 != null) {
            apply6 = function6.apply(Double.valueOf(ratioOfTones));
            if (apply6 != null) {
                apply7 = function6.apply(Double.valueOf(ratioOfTones));
                doubleValue = ((Double) apply7).doubleValue();
                clampDouble = MathUtils.clampDouble(d, doubleValue, ratioOfTones2);
                if (clampDouble != ratioOfTones2) {
                    doubleValue4 = contrastingTone(doubleValue3, clampDouble);
                }
                function7 = dynamicColor.background;
                if (function7 != null) {
                    apply8 = function7.apply(dynamicScheme);
                    if (apply8 != null) {
                        enableLightForeground = doubleValue4;
                        return ensureToneDelta(enableLightForeground, doubleValue2, dynamicScheme, function4, function2);
                    }
                }
                enableLightForeground = enableLightForeground(doubleValue4);
                return ensureToneDelta(enableLightForeground, doubleValue2, dynamicScheme, function4, function2);
            }
        }
        doubleValue = 21.0d;
        clampDouble = MathUtils.clampDouble(d, doubleValue, ratioOfTones2);
        if (clampDouble != ratioOfTones2) {
        }
        function7 = dynamicColor.background;
        if (function7 != null) {
        }
        enableLightForeground = enableLightForeground(doubleValue4);
        return ensureToneDelta(enableLightForeground, doubleValue2, dynamicScheme, function4, function2);
    }

    static double ensureToneDelta(double d, double d2, DynamicScheme dynamicScheme, Function<DynamicScheme, ToneDeltaConstraint> function, Function<DynamicColor, Double> function2) {
        Object apply;
        ToneDeltaConstraint toneDeltaConstraint;
        Object apply2;
        Object apply3;
        if (function == null) {
            toneDeltaConstraint = null;
        } else {
            apply = function.apply(dynamicScheme);
            toneDeltaConstraint = (ToneDeltaConstraint) apply;
        }
        if (toneDeltaConstraint == null) {
            return d;
        }
        double d3 = toneDeltaConstraint.delta;
        apply2 = function2.apply(toneDeltaConstraint.keepAway);
        double doubleValue = ((Double) apply2).doubleValue();
        double abs = Math.abs(d - doubleValue);
        if (abs >= d3) {
            return d;
        }
        int i = AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$TonePolarity[toneDeltaConstraint.keepAwayPolarity.ordinal()];
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return d;
                }
                apply3 = toneDeltaConstraint.keepAway.tone.apply(dynamicScheme);
                boolean z2 = d2 > ((Double) apply3).doubleValue();
                double abs2 = Math.abs(abs - d3);
                if (!z2 ? d >= abs2 : d + abs2 > 100.0d) {
                    z = false;
                }
                return z ? d + abs2 : d - abs2;
            }
            return MathUtils.clampDouble(0.0d, 100.0d, doubleValue - d3);
        }
        return MathUtils.clampDouble(0.0d, 100.0d, doubleValue + d3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.color.utilities.DynamicColor$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$material$color$utilities$TonePolarity;

        static {
            int[] iArr = new int[TonePolarity.values().length];
            $SwitchMap$com$google$android$material$color$utilities$TonePolarity = iArr;
            try {
                iArr[TonePolarity.DARKER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$material$color$utilities$TonePolarity[TonePolarity.LIGHTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$android$material$color$utilities$TonePolarity[TonePolarity.NO_PREFERENCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static double contrastingTone(double d, double d2) {
        double lighterUnsafe = Contrast.lighterUnsafe(d, d2);
        double darkerUnsafe = Contrast.darkerUnsafe(d, d2);
        double ratioOfTones = Contrast.ratioOfTones(lighterUnsafe, d);
        double ratioOfTones2 = Contrast.ratioOfTones(darkerUnsafe, d);
        if (tonePrefersLightForeground(d)) {
            return (ratioOfTones >= d2 || ratioOfTones >= ratioOfTones2 || ((Math.abs(ratioOfTones - ratioOfTones2) > 0.1d ? 1 : (Math.abs(ratioOfTones - ratioOfTones2) == 0.1d ? 0 : -1)) < 0 && (ratioOfTones > d2 ? 1 : (ratioOfTones == d2 ? 0 : -1)) < 0 && (ratioOfTones2 > d2 ? 1 : (ratioOfTones2 == d2 ? 0 : -1)) < 0)) ? lighterUnsafe : darkerUnsafe;
        }
        return (ratioOfTones2 >= d2 || ratioOfTones2 >= ratioOfTones) ? darkerUnsafe : lighterUnsafe;
    }

    public static double enableLightForeground(double d) {
        if (!tonePrefersLightForeground(d) || toneAllowsLightForeground(d)) {
            return d;
        }
        return 49.0d;
    }

    public static boolean tonePrefersLightForeground(double d) {
        return Math.round(d) <= 60;
    }

    public static boolean toneAllowsLightForeground(double d) {
        return Math.round(d) <= 49;
    }
}
