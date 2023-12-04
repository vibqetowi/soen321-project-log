package com.ifriend.presentation.features.onboarding.steps.view.common;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
/* compiled from: OnboardingWheelPickerComponent.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J?\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/view/common/WheelPickerDefaults;", "", "()V", "selectorProperties", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SelectorProperties;", "enabled", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "color", "Landroidx/compose/ui/graphics/Color;", OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "selectorProperties-cf5BqRc", "(ZLandroidx/compose/ui/graphics/Shape;JLandroidx/compose/foundation/BorderStroke;Landroidx/compose/runtime/Composer;II)Lcom/ifriend/presentation/features/onboarding/steps/view/common/SelectorProperties;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WheelPickerDefaults {
    public static final int $stable = 0;
    public static final WheelPickerDefaults INSTANCE = new WheelPickerDefaults();

    private WheelPickerDefaults() {
    }

    /* renamed from: selectorProperties-cf5BqRc  reason: not valid java name */
    public final SelectorProperties m6943selectorPropertiescf5BqRc(boolean z, Shape shape, long j, BorderStroke borderStroke, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1026344391);
        ComposerKt.sourceInformation(composer, "C(selectorProperties)P(2,3,1:c#ui.graphics.Color)");
        boolean z2 = (i2 & 1) != 0 ? true : z;
        RoundedCornerShape m1009RoundedCornerShape0680j_4 = (i2 & 2) != 0 ? RoundedCornerShapeKt.m1009RoundedCornerShape0680j_4(Dp.m5607constructorimpl(16)) : shape;
        long m3290copywmQWz5c$default = (i2 & 4) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).m1646getPrimary0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null) : j;
        BorderStroke m448BorderStrokecXLIe8U = (i2 & 8) != 0 ? BorderStrokeKt.m448BorderStrokecXLIe8U(Dp.m5607constructorimpl(1), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).m1646getPrimary0d7_KjU()) : borderStroke;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1026344391, i, -1, "com.ifriend.presentation.features.onboarding.steps.view.common.WheelPickerDefaults.selectorProperties (OnboardingWheelPickerComponent.kt:202)");
        }
        DefaultSelectorProperties defaultSelectorProperties = new DefaultSelectorProperties(z2, m1009RoundedCornerShape0680j_4, m3290copywmQWz5c$default, m448BorderStrokecXLIe8U, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultSelectorProperties;
    }
}
