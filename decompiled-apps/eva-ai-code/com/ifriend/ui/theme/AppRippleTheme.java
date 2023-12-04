package com.ifriend.ui.theme;

import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.material.ripple.RippleTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
/* compiled from: AppRippleTheme.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u0004H\u0017ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\bH\u0017¢\u0006\u0002\u0010\t\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/ifriend/ui/theme/AppRippleTheme;", "Landroidx/compose/material/ripple/RippleTheme;", "()V", "defaultColor", "Landroidx/compose/ui/graphics/Color;", "defaultColor-WaAFU9c", "(Landroidx/compose/runtime/Composer;I)J", "rippleAlpha", "Landroidx/compose/material/ripple/RippleAlpha;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/ripple/RippleAlpha;", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppRippleTheme implements RippleTheme {
    public static final int $stable = 0;
    public static final AppRippleTheme INSTANCE = new AppRippleTheme();

    private AppRippleTheme() {
    }

    @Override // androidx.compose.material.ripple.RippleTheme
    /* renamed from: defaultColor-WaAFU9c */
    public long mo1394defaultColorWaAFU9c(Composer composer, int i) {
        composer.startReplaceableGroup(-268893516);
        ComposerKt.sourceInformation(composer, "C(defaultColor)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-268893516, i, -1, "com.ifriend.ui.theme.AppRippleTheme.defaultColor (AppRippleTheme.kt:10)");
        }
        long m1561defaultRippleColor5vOe2sY = RippleTheme.Companion.m1561defaultRippleColor5vOe2sY(Color.Companion.m3317getBlack0d7_KjU(), AppTheme.INSTANCE.getColors(composer, 6).isLight());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1561defaultRippleColor5vOe2sY;
    }

    @Override // androidx.compose.material.ripple.RippleTheme
    public RippleAlpha rippleAlpha(Composer composer, int i) {
        composer.startReplaceableGroup(1443789241);
        ComposerKt.sourceInformation(composer, "C(rippleAlpha)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1443789241, i, -1, "com.ifriend.ui.theme.AppRippleTheme.rippleAlpha (AppRippleTheme.kt:22)");
        }
        RippleAlpha rippleAlpha = new RippleAlpha(0.05f, 0.05f, 0.05f, 0.05f);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rippleAlpha;
    }
}
