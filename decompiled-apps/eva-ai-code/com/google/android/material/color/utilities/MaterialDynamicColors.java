package com.google.android.material.color.utilities;

import java.util.function.Function;
/* loaded from: classes2.dex */
public final class MaterialDynamicColors {
    private static final double CONTAINER_ACCENT_TONE_DELTA = 15.0d;
    public static final DynamicColor background = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda75
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda113
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(r2.isDark ? 6.0d : 98.0d);
            return valueOf;
        }
    });
    public static final DynamicColor onBackground = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda125
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda137
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(r2.isDark ? 90.0d : 10.0d);
            return valueOf;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda149
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor dynamicColor;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            dynamicColor = MaterialDynamicColors.background;
            return dynamicColor;
        }
    });
    public static final DynamicColor surface = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda9
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda21
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(r2.isDark ? 6.0d : 98.0d);
            return valueOf;
        }
    });
    public static final DynamicColor surfaceInverse = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda34
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda46
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(r2.isDark ? 90.0d : 20.0d);
            return valueOf;
        }
    });
    public static final DynamicColor surfaceBright = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda58
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda44
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(r2.isDark ? 24.0d : 98.0d);
            return valueOf;
        }
    });
    public static final DynamicColor surfaceDim = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda69
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda81
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(r2.isDark ? 6.0d : 87.0d);
            return valueOf;
        }
    });
    public static final DynamicColor surfaceSub2 = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda93
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda105
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(r2.isDark ? 4.0d : 100.0d);
            return valueOf;
        }
    });
    public static final DynamicColor surfaceSub1 = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda107
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda109
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(r2.isDark ? 10.0d : 96.0d);
            return valueOf;
        }
    });
    public static final DynamicColor surfaceContainer = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda110
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda111
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(r2.isDark ? 12.0d : 94.0d);
            return valueOf;
        }
    });
    public static final DynamicColor surfaceAdd1 = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda112
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda114
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(r2.isDark ? 17.0d : 92.0d);
            return valueOf;
        }
    });
    public static final DynamicColor surfaceAdd2 = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda115
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda116
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(r2.isDark ? 22.0d : 90.0d);
            return valueOf;
        }
    });
    public static final DynamicColor onSurface = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda117
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda118
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(r2.isDark ? 90.0d : 10.0d);
            return valueOf;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda120
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor highestSurface;
            highestSurface = MaterialDynamicColors.highestSurface((DynamicScheme) obj);
            return highestSurface;
        }
    });
    public static final DynamicColor onSurfaceInverse = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda121
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda122
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(r2.isDark ? 20.0d : 95.0d);
            return valueOf;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda123
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor dynamicColor;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            dynamicColor = MaterialDynamicColors.surfaceInverse;
            return dynamicColor;
        }
    });
    public static final DynamicColor surfaceVariant = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda124
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralVariantPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda126
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(r2.isDark ? 30.0d : 90.0d);
            return valueOf;
        }
    });
    public static final DynamicColor onSurfaceVariant = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda127
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralVariantPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda128
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(r2.isDark ? 80.0d : 30.0d);
            return valueOf;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda129
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor dynamicColor;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            dynamicColor = MaterialDynamicColors.surfaceVariant;
            return dynamicColor;
        }
    });
    public static final DynamicColor outline = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda131
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralVariantPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda132
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(50.0d);
            return valueOf;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda133
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor highestSurface;
            highestSurface = MaterialDynamicColors.highestSurface((DynamicScheme) obj);
            return highestSurface;
        }
    });
    public static final DynamicColor outlineVariant = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda134
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralVariantPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda135
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(80.0d);
            return valueOf;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda136
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor highestSurface;
            highestSurface = MaterialDynamicColors.highestSurface((DynamicScheme) obj);
            return highestSurface;
        }
    });
    public static final DynamicColor primaryContainer = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda138
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).primaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda139
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.lambda$static$41((DynamicScheme) obj);
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda140
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor highestSurface;
            highestSurface = MaterialDynamicColors.highestSurface((DynamicScheme) obj);
            return highestSurface;
        }
    });
    public static final DynamicColor onPrimaryContainer = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda142
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).primaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda143
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.lambda$static$44((DynamicScheme) obj);
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda144
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor dynamicColor;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            dynamicColor = MaterialDynamicColors.primaryContainer;
            return dynamicColor;
        }
    }, null);
    public static final DynamicColor primary = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda145
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).primaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda146
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(r2.isDark ? 80.0d : 40.0d);
            return valueOf;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda147
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor highestSurface;
            highestSurface = MaterialDynamicColors.highestSurface((DynamicScheme) obj);
            return highestSurface;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda148
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.lambda$static$49((DynamicScheme) obj);
        }
    });
    public static final DynamicColor primaryInverse = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda150
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).primaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda151
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(r2.isDark ? 40.0d : 80.0d);
            return valueOf;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda1
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor dynamicColor;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            dynamicColor = MaterialDynamicColors.surfaceInverse;
            return dynamicColor;
        }
    });
    public static final DynamicColor onPrimary = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda2
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).primaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda3
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(r2.isDark ? 20.0d : 100.0d);
            return valueOf;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda4
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor dynamicColor;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            dynamicColor = MaterialDynamicColors.primary;
            return dynamicColor;
        }
    });
    public static final DynamicColor secondaryContainer = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda5
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).secondaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda6
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.lambda$static$57((DynamicScheme) obj);
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda7
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor highestSurface;
            highestSurface = MaterialDynamicColors.highestSurface((DynamicScheme) obj);
            return highestSurface;
        }
    });
    public static final DynamicColor onSecondaryContainer = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda8
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).secondaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda10
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.lambda$static$60((DynamicScheme) obj);
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda12
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor dynamicColor;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            dynamicColor = MaterialDynamicColors.secondaryContainer;
            return dynamicColor;
        }
    });
    public static final DynamicColor secondary = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda13
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).secondaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda14
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(r2.isDark ? 80.0d : 40.0d);
            return valueOf;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda15
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor highestSurface;
            highestSurface = MaterialDynamicColors.highestSurface((DynamicScheme) obj);
            return highestSurface;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda16
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.lambda$static$65((DynamicScheme) obj);
        }
    });
    public static final DynamicColor onSecondary = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda17
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).secondaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda18
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(r2.isDark ? 20.0d : 100.0d);
            return valueOf;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda19
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor dynamicColor;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            dynamicColor = MaterialDynamicColors.secondary;
            return dynamicColor;
        }
    });
    public static final DynamicColor tertiaryContainer = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda20
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).tertiaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda23
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.lambda$static$70((DynamicScheme) obj);
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda24
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor highestSurface;
            highestSurface = MaterialDynamicColors.highestSurface((DynamicScheme) obj);
            return highestSurface;
        }
    });
    public static final DynamicColor onTertiaryContainer = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda25
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).tertiaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda26
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.lambda$static$73((DynamicScheme) obj);
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda27
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor dynamicColor;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            dynamicColor = MaterialDynamicColors.tertiaryContainer;
            return dynamicColor;
        }
    });
    public static final DynamicColor tertiary = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda28
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).tertiaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda29
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(r2.isDark ? 80.0d : 40.0d);
            return valueOf;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda30
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor highestSurface;
            highestSurface = MaterialDynamicColors.highestSurface((DynamicScheme) obj);
            return highestSurface;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda31
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.lambda$static$78((DynamicScheme) obj);
        }
    });
    public static final DynamicColor onTertiary = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda32
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).tertiaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda35
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(r2.isDark ? 20.0d : 100.0d);
            return valueOf;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda36
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor dynamicColor;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            dynamicColor = MaterialDynamicColors.tertiary;
            return dynamicColor;
        }
    });
    public static final DynamicColor errorContainer = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda37
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).errorPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda38
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(r2.isDark ? 30.0d : 90.0d);
            return valueOf;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda39
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor highestSurface;
            highestSurface = MaterialDynamicColors.highestSurface((DynamicScheme) obj);
            return highestSurface;
        }
    });
    public static final DynamicColor onErrorContainer = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda40
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).errorPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda41
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(r2.isDark ? 90.0d : 10.0d);
            return valueOf;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda42
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor dynamicColor;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            dynamicColor = MaterialDynamicColors.errorContainer;
            return dynamicColor;
        }
    });
    public static final DynamicColor error = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda43
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).errorPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda45
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(r2.isDark ? 80.0d : 40.0d);
            return valueOf;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda47
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor highestSurface;
            highestSurface = MaterialDynamicColors.highestSurface((DynamicScheme) obj);
            return highestSurface;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda48
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.lambda$static$91((DynamicScheme) obj);
        }
    });
    public static final DynamicColor onError = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda49
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).errorPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda50
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(r2.isDark ? 20.0d : 100.0d);
            return valueOf;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda51
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor dynamicColor;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            dynamicColor = MaterialDynamicColors.error;
            return dynamicColor;
        }
    });
    public static final DynamicColor primaryFixed = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda52
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).primaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda53
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(90.0d);
            return valueOf;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda54
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor highestSurface;
            highestSurface = MaterialDynamicColors.highestSurface((DynamicScheme) obj);
            return highestSurface;
        }
    });
    public static final DynamicColor primaryFixedDarker = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda56
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).primaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda57
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(80.0d);
            return valueOf;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda86
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor highestSurface;
            highestSurface = MaterialDynamicColors.highestSurface((DynamicScheme) obj);
            return highestSurface;
        }
    });
    public static final DynamicColor onPrimaryFixed = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda97
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).primaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda108
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(10.0d);
            return valueOf;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda119
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor dynamicColor;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            dynamicColor = MaterialDynamicColors.primaryFixedDarker;
            return dynamicColor;
        }
    });
    public static final DynamicColor onPrimaryFixedVariant = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda130
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).primaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda141
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(30.0d);
            return valueOf;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda152
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor dynamicColor;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            dynamicColor = MaterialDynamicColors.primaryFixedDarker;
            return dynamicColor;
        }
    });
    public static final DynamicColor secondaryFixed = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda11
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).secondaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda22
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(90.0d);
            return valueOf;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda33
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor highestSurface;
            highestSurface = MaterialDynamicColors.highestSurface((DynamicScheme) obj);
            return highestSurface;
        }
    });
    public static final DynamicColor secondaryFixedDarker = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda55
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).secondaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda59
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(80.0d);
            return valueOf;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda60
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor highestSurface;
            highestSurface = MaterialDynamicColors.highestSurface((DynamicScheme) obj);
            return highestSurface;
        }
    });
    public static final DynamicColor onSecondaryFixed = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda61
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).secondaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda62
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(10.0d);
            return valueOf;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda63
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor dynamicColor;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            dynamicColor = MaterialDynamicColors.secondaryFixedDarker;
            return dynamicColor;
        }
    });
    public static final DynamicColor onSecondaryFixedVariant = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda65
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).secondaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda66
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(30.0d);
            return valueOf;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda67
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor dynamicColor;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            dynamicColor = MaterialDynamicColors.secondaryFixedDarker;
            return dynamicColor;
        }
    });
    public static final DynamicColor tertiaryFixed = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda68
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).tertiaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda70
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(90.0d);
            return valueOf;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda71
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor highestSurface;
            highestSurface = MaterialDynamicColors.highestSurface((DynamicScheme) obj);
            return highestSurface;
        }
    });
    public static final DynamicColor tertiaryFixedDarker = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda72
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).tertiaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda73
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(80.0d);
            return valueOf;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda74
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor highestSurface;
            highestSurface = MaterialDynamicColors.highestSurface((DynamicScheme) obj);
            return highestSurface;
        }
    });
    public static final DynamicColor onTertiaryFixed = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda76
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).tertiaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda77
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(10.0d);
            return valueOf;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda78
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor dynamicColor;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            dynamicColor = MaterialDynamicColors.tertiaryFixedDarker;
            return dynamicColor;
        }
    });
    public static final DynamicColor onTertiaryFixedVariant = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda79
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).tertiaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda80
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(30.0d);
            return valueOf;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda82
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor dynamicColor;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            dynamicColor = MaterialDynamicColors.tertiaryFixedDarker;
            return dynamicColor;
        }
    });
    public static final DynamicColor controlActivated = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda83
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).primaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda84
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(r2.isDark ? 30.0d : 90.0d);
            return valueOf;
        }
    }, null);
    public static final DynamicColor controlNormal = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda85
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralVariantPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda87
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(r2.isDark ? 80.0d : 30.0d);
            return valueOf;
        }
    });
    public static final DynamicColor controlHighlight = new DynamicColor(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda88
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(0.0d);
            return valueOf;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda89
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(0.0d);
            return valueOf;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda90
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(r2.isDark ? 100.0d : 0.0d);
            return valueOf;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda91
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(r2.isDark ? 0.2d : 0.12d);
            return valueOf;
        }
    }, null, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda92
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            valueOf = Double.valueOf(DynamicColor.toneMinContrastDefault(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda64
                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    Double valueOf2;
                    DynamicScheme dynamicScheme = (DynamicScheme) obj2;
                    valueOf2 = Double.valueOf(r2.isDark ? 100.0d : 0.0d);
                    return valueOf2;
                }
            }, null, (DynamicScheme) obj, null));
            return valueOf;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda94
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            valueOf = Double.valueOf(DynamicColor.toneMaxContrastDefault(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda0
                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    Double valueOf2;
                    DynamicScheme dynamicScheme = (DynamicScheme) obj2;
                    valueOf2 = Double.valueOf(r2.isDark ? 100.0d : 0.0d);
                    return valueOf2;
                }
            }, null, (DynamicScheme) obj, null));
            return valueOf;
        }
    }, null);
    public static final DynamicColor textPrimaryInverse = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda95
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda96
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(r2.isDark ? 10.0d : 90.0d);
            return valueOf;
        }
    });
    public static final DynamicColor textSecondaryAndTertiaryInverse = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda98
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralVariantPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda99
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(r2.isDark ? 30.0d : 80.0d);
            return valueOf;
        }
    });
    public static final DynamicColor textPrimaryInverseDisableOnly = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda100
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda101
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(r2.isDark ? 10.0d : 90.0d);
            return valueOf;
        }
    });
    public static final DynamicColor textSecondaryAndTertiaryInverseDisabled = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda102
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda103
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(r2.isDark ? 10.0d : 90.0d);
            return valueOf;
        }
    });
    public static final DynamicColor textHintInverse = DynamicColor.fromPalette(new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda104
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda106
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(r2.isDark ? 10.0d : 90.0d);
            return valueOf;
        }
    });

    private MaterialDynamicColors() {
    }

    public static DynamicColor highestSurface(DynamicScheme dynamicScheme) {
        return dynamicScheme.isDark ? surfaceBright : surfaceDim;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Double lambda$static$41(DynamicScheme dynamicScheme) {
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(performAlbers(dynamicScheme.sourceColorHct, dynamicScheme));
        }
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Double lambda$static$44(DynamicScheme dynamicScheme) {
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(DynamicColor.contrastingTone(primaryContainer.getTone(dynamicScheme), 4.5d));
        }
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ ToneDeltaConstraint lambda$static$49(DynamicScheme dynamicScheme) {
        return new ToneDeltaConstraint(CONTAINER_ACCENT_TONE_DELTA, primaryContainer, dynamicScheme.isDark ? TonePolarity.DARKER : TonePolarity.LIGHTER);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Double lambda$static$57(DynamicScheme dynamicScheme) {
        double d = dynamicScheme.isDark ? 30.0d : 90.0d;
        if (!isFidelity(dynamicScheme)) {
            return Double.valueOf(d);
        }
        return Double.valueOf(performAlbers(dynamicScheme.secondaryPalette.getHct(findDesiredChromaByTone(dynamicScheme.secondaryPalette.getHue(), dynamicScheme.secondaryPalette.getChroma(), d, !dynamicScheme.isDark)), dynamicScheme));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Double lambda$static$60(DynamicScheme dynamicScheme) {
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(DynamicColor.contrastingTone(secondaryContainer.getTone(dynamicScheme), 4.5d));
        }
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ ToneDeltaConstraint lambda$static$65(DynamicScheme dynamicScheme) {
        return new ToneDeltaConstraint(CONTAINER_ACCENT_TONE_DELTA, secondaryContainer, dynamicScheme.isDark ? TonePolarity.DARKER : TonePolarity.LIGHTER);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Double lambda$static$70(DynamicScheme dynamicScheme) {
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(DislikeAnalyzer.fixIfDisliked(dynamicScheme.tertiaryPalette.getHct(performAlbers(dynamicScheme.tertiaryPalette.getHct(dynamicScheme.sourceColorHct.getTone()), dynamicScheme))).getTone());
        }
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Double lambda$static$73(DynamicScheme dynamicScheme) {
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(DynamicColor.contrastingTone(tertiaryContainer.getTone(dynamicScheme), 4.5d));
        }
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ ToneDeltaConstraint lambda$static$78(DynamicScheme dynamicScheme) {
        return new ToneDeltaConstraint(CONTAINER_ACCENT_TONE_DELTA, tertiaryContainer, dynamicScheme.isDark ? TonePolarity.DARKER : TonePolarity.LIGHTER);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ ToneDeltaConstraint lambda$static$91(DynamicScheme dynamicScheme) {
        return new ToneDeltaConstraint(CONTAINER_ACCENT_TONE_DELTA, errorContainer, dynamicScheme.isDark ? TonePolarity.DARKER : TonePolarity.LIGHTER);
    }

    private static ViewingConditions viewingConditionsForAlbers(DynamicScheme dynamicScheme) {
        return ViewingConditions.defaultWithBackgroundLstar(dynamicScheme.isDark ? 30.0d : 80.0d);
    }

    private static boolean isFidelity(DynamicScheme dynamicScheme) {
        return dynamicScheme.variant == Variant.FIDELITY || dynamicScheme.variant == Variant.CONTENT;
    }

    static double findDesiredChromaByTone(double d, double d2, double d3, boolean z) {
        Hct from = Hct.from(d, d2, d3);
        if (from.getChroma() < d2) {
            Hct hct = from;
            double chroma = from.getChroma();
            double d4 = d3;
            while (hct.getChroma() < d2) {
                double d5 = d4 + (z ? -1.0d : 1.0d);
                Hct from2 = Hct.from(d, d2, d5);
                if (chroma > from2.getChroma() || Math.abs(from2.getChroma() - d2) < 0.4d) {
                    return d5;
                }
                if (Math.abs(from2.getChroma() - d2) < Math.abs(hct.getChroma() - d2)) {
                    hct = from2;
                }
                chroma = Math.max(chroma, from2.getChroma());
                d4 = d5;
            }
            return d4;
        }
        return d3;
    }

    static double performAlbers(Hct hct, DynamicScheme dynamicScheme) {
        Hct inViewingConditions = hct.inViewingConditions(viewingConditionsForAlbers(dynamicScheme));
        if (DynamicColor.tonePrefersLightForeground(hct.getTone()) && !DynamicColor.toneAllowsLightForeground(inViewingConditions.getTone())) {
            return DynamicColor.enableLightForeground(hct.getTone());
        }
        return DynamicColor.enableLightForeground(inViewingConditions.getTone());
    }
}
