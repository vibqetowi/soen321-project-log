package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
/* compiled from: Switch.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jy\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroidx/compose/material/SwitchDefaults;", "", "()V", "colors", "Landroidx/compose/material/SwitchColors;", "checkedThumbColor", "Landroidx/compose/ui/graphics/Color;", "checkedTrackColor", "checkedTrackAlpha", "", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedTrackAlpha", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "colors-SQMK_m0", "(JJFJJFJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material/SwitchColors;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwitchDefaults {
    public static final int $stable = 0;
    public static final SwitchDefaults INSTANCE = new SwitchDefaults();

    private SwitchDefaults() {
    }

    /* renamed from: colors-SQMK_m0  reason: not valid java name */
    public final SwitchColors m1483colorsSQMK_m0(long j, long j2, float f, long j3, long j4, float f2, long j5, long j6, long j7, long j8, Composer composer, int i, int i2, int i3) {
        float f3;
        long j9;
        long j10;
        long j11;
        long j12;
        int i4;
        long j13;
        composer.startReplaceableGroup(-1032127534);
        ComposerKt.sourceInformation(composer, "C(colors)P(0:c#ui.graphics.Color,2:c#ui.graphics.Color!1,7:c#ui.graphics.Color,9:c#ui.graphics.Color,8,3:c#ui.graphics.Color,4:c#ui.graphics.Color,5:c#ui.graphics.Color,6:c#ui.graphics.Color)321@13073L6,324@13245L6,325@13312L6,328@13474L8,329@13525L6,331@13642L8,332@13693L6,334@13814L8,335@13865L6,337@13986L8,338@14037L6:Switch.kt#jmzs0o");
        long m1312getSecondaryVariant0d7_KjU = (i3 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1312getSecondaryVariant0d7_KjU() : j;
        long j14 = (i3 & 2) != 0 ? m1312getSecondaryVariant0d7_KjU : j2;
        float f4 = (i3 & 4) != 0 ? 0.54f : f;
        long m1313getSurface0d7_KjU = (i3 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1313getSurface0d7_KjU() : j3;
        long m1308getOnSurface0d7_KjU = (i3 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU() : j4;
        float f5 = (i3 & 32) != 0 ? 0.38f : f2;
        if ((i3 & 64) != 0) {
            f3 = f4;
            j9 = ColorKt.m3336compositeOverOWjLjI(Color.m3290copywmQWz5c$default(m1312getSecondaryVariant0d7_KjU, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m1313getSurface0d7_KjU());
        } else {
            f3 = f4;
            j9 = j5;
        }
        if ((i3 & 128) != 0) {
            j10 = m1312getSecondaryVariant0d7_KjU;
            j11 = ColorKt.m3336compositeOverOWjLjI(Color.m3290copywmQWz5c$default(j14, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m1313getSurface0d7_KjU());
        } else {
            j10 = m1312getSecondaryVariant0d7_KjU;
            j11 = j6;
        }
        if ((i3 & 256) != 0) {
            i4 = 6;
            j12 = j9;
            j13 = ColorKt.m3336compositeOverOWjLjI(Color.m3290copywmQWz5c$default(m1313getSurface0d7_KjU, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m1313getSurface0d7_KjU());
        } else {
            j12 = j9;
            i4 = 6;
            j13 = j7;
        }
        long m3336compositeOverOWjLjI = (i3 & 512) != 0 ? ColorKt.m3336compositeOverOWjLjI(Color.m3290copywmQWz5c$default(m1308getOnSurface0d7_KjU, ContentAlpha.INSTANCE.getDisabled(composer, i4), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m1313getSurface0d7_KjU()) : j8;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1032127534, i, i2, "androidx.compose.material.SwitchDefaults.colors (Switch.kt:320)");
        }
        DefaultSwitchColors defaultSwitchColors = new DefaultSwitchColors(j10, Color.m3290copywmQWz5c$default(j14, f3, 0.0f, 0.0f, 0.0f, 14, null), m1313getSurface0d7_KjU, Color.m3290copywmQWz5c$default(m1308getOnSurface0d7_KjU, f5, 0.0f, 0.0f, 0.0f, 14, null), j12, Color.m3290copywmQWz5c$default(j11, f3, 0.0f, 0.0f, 0.0f, 14, null), j13, Color.m3290copywmQWz5c$default(m3336compositeOverOWjLjI, f5, 0.0f, 0.0f, 0.0f, 14, null), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultSwitchColors;
    }
}
