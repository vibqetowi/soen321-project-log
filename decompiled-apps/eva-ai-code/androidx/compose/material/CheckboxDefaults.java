package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
/* compiled from: Checkbox.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JG\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Landroidx/compose/material/CheckboxDefaults;", "", "()V", "colors", "Landroidx/compose/material/CheckboxColors;", "checkedColor", "Landroidx/compose/ui/graphics/Color;", "uncheckedColor", "checkmarkColor", "disabledColor", "disabledIndeterminateColor", "colors-zjMxDiM", "(JJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/CheckboxColors;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CheckboxDefaults {
    public static final int $stable = 0;
    public static final CheckboxDefaults INSTANCE = new CheckboxDefaults();

    private CheckboxDefaults() {
    }

    /* renamed from: colors-zjMxDiM  reason: not valid java name */
    public final CheckboxColors m1287colorszjMxDiM(long j, long j2, long j3, long j4, long j5, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(469524104);
        ComposerKt.sourceInformation(composer, "C(colors)P(0:c#ui.graphics.Color,4:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color)227@9578L6,228@9642L6,229@9725L6,230@9786L6,230@9829L8,231@9923L8,233@9972L922:Checkbox.kt#jmzs0o");
        long m1311getSecondary0d7_KjU = (i2 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1311getSecondary0d7_KjU() : j;
        long m3290copywmQWz5c$default = (i2 & 2) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long m1313getSurface0d7_KjU = (i2 & 4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1313getSurface0d7_KjU() : j3;
        long m3290copywmQWz5c$default2 = (i2 & 8) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j4;
        long m3290copywmQWz5c$default3 = (i2 & 16) != 0 ? Color.m3290copywmQWz5c$default(m1311getSecondary0d7_KjU, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(469524104, i, -1, "androidx.compose.material.CheckboxDefaults.colors (Checkbox.kt:226)");
        }
        Object[] objArr = {Color.m3281boximpl(m1311getSecondary0d7_KjU), Color.m3281boximpl(m3290copywmQWz5c$default), Color.m3281boximpl(m1313getSurface0d7_KjU), Color.m3281boximpl(m3290copywmQWz5c$default2), Color.m3281boximpl(m3290copywmQWz5c$default3)};
        composer.startReplaceableGroup(-568225417);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean z = false;
        for (int i3 = 0; i3 < 5; i3++) {
            z |= composer.changed(objArr[i3]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DefaultCheckboxColors(m1313getSurface0d7_KjU, Color.m3290copywmQWz5c$default(m1313getSurface0d7_KjU, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), m1311getSecondary0d7_KjU, Color.m3290copywmQWz5c$default(m1311getSecondary0d7_KjU, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), m3290copywmQWz5c$default2, Color.m3290copywmQWz5c$default(m3290copywmQWz5c$default2, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), m3290copywmQWz5c$default3, m1311getSecondary0d7_KjU, m3290copywmQWz5c$default, m3290copywmQWz5c$default2, m3290copywmQWz5c$default3, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DefaultCheckboxColors defaultCheckboxColors = (DefaultCheckboxColors) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultCheckboxColors;
    }
}
