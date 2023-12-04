package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
/* compiled from: FloatingActionButton.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ=\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Landroidx/compose/material/FloatingActionButtonDefaults;", "", "()V", "elevation", "Landroidx/compose/material/FloatingActionButtonElevation;", "defaultElevation", "Landroidx/compose/ui/unit/Dp;", "pressedElevation", "elevation-ixp7dh8", "(FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/FloatingActionButtonElevation;", "hoveredElevation", "focusedElevation", "elevation-xZ9-QkE", "(FFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/FloatingActionButtonElevation;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FloatingActionButtonDefaults {
    public static final int $stable = 0;
    public static final FloatingActionButtonDefaults INSTANCE = new FloatingActionButtonDefaults();

    private FloatingActionButtonDefaults() {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use another overload of elevation")
    /* renamed from: elevation-ixp7dh8  reason: not valid java name */
    public final /* synthetic */ FloatingActionButtonElevation m1384elevationixp7dh8(float f, float f2, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-654132828);
        ComposerKt.sourceInformation(composer, "C(elevation)P(0:c#ui.unit.Dp,1:c#ui.unit.Dp)222@9757L134:FloatingActionButton.kt#jmzs0o");
        float m5607constructorimpl = (i2 & 1) != 0 ? Dp.m5607constructorimpl(6) : f;
        float m5607constructorimpl2 = (i2 & 2) != 0 ? Dp.m5607constructorimpl(12) : f2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-654132828, i, -1, "androidx.compose.material.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:219)");
        }
        float f3 = 8;
        FloatingActionButtonElevation m1385elevationxZ9QkE = m1385elevationxZ9QkE(m5607constructorimpl, m5607constructorimpl2, Dp.m5607constructorimpl(f3), Dp.m5607constructorimpl(f3), composer, (i & 14) | 3456 | (i & 112) | ((i << 6) & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1385elevationxZ9QkE;
    }

    /* renamed from: elevation-xZ9-QkE  reason: not valid java name */
    public final FloatingActionButtonElevation m1385elevationxZ9QkE(float f, float f2, float f3, float f4, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(380403812);
        ComposerKt.sourceInformation(composer, "C(elevation)P(0:c#ui.unit.Dp,3:c#ui.unit.Dp,2:c#ui.unit.Dp,1:c#ui.unit.Dp)250@10753L367:FloatingActionButton.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            f = Dp.m5607constructorimpl(6);
        }
        float f5 = f;
        if ((i2 & 2) != 0) {
            f2 = Dp.m5607constructorimpl(12);
        }
        float f6 = f2;
        if ((i2 & 4) != 0) {
            f3 = Dp.m5607constructorimpl(8);
        }
        float f7 = f3;
        if ((i2 & 8) != 0) {
            f4 = Dp.m5607constructorimpl(8);
        }
        float f8 = f4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(380403812, i, -1, "androidx.compose.material.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:244)");
        }
        Object[] objArr = {Dp.m5605boximpl(f5), Dp.m5605boximpl(f6), Dp.m5605boximpl(f7), Dp.m5605boximpl(f8)};
        composer.startReplaceableGroup(-568225417);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean z = false;
        for (int i3 = 0; i3 < 4; i3++) {
            z |= composer.changed(objArr[i3]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DefaultFloatingActionButtonElevation(f5, f6, f7, f8, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DefaultFloatingActionButtonElevation defaultFloatingActionButtonElevation = (DefaultFloatingActionButtonElevation) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultFloatingActionButtonElevation;
    }
}
