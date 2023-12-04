package com.ifriend.presentation.features.onboarding.steps.view.common;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
/* compiled from: OnboardingWheelPickerComponent.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H'¢\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H'ø\u0001\u0000¢\u0006\u0002\u0010\u0005J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H'¢\u0006\u0002\u0010\u0005J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003H'¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/view/common/SelectorProperties;", "", OutlinedTextFieldKt.BorderId, "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/BorderStroke;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "color", "Landroidx/compose/ui/graphics/Color;", "enabled", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface SelectorProperties {
    State<BorderStroke> border(Composer composer, int i);

    State<Color> color(Composer composer, int i);

    State<Boolean> enabled(Composer composer, int i);

    State<Shape> shape(Composer composer, int i);
}
