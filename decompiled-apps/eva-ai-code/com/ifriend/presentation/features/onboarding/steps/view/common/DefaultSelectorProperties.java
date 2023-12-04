package com.ifriend.presentation.features.onboarding.steps.view.common;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: OnboardingWheelPickerComponent.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B*\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0015\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\fH\u0017¢\u0006\u0002\u0010\rJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0017ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0013\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0017¢\u0006\u0002\u0010\rJ\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u0017¢\u0006\u0002\u0010\rR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\u00020\u0007X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/view/common/DefaultSelectorProperties;", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SelectorProperties;", "enabled", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "color", "Landroidx/compose/ui/graphics/Color;", OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "(ZLandroidx/compose/ui/graphics/Shape;JLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "Landroidx/compose/runtime/State;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultSelectorProperties implements SelectorProperties {
    private final BorderStroke border;
    private final long color;
    private final boolean enabled;
    private final Shape shape;

    public /* synthetic */ DefaultSelectorProperties(boolean z, Shape shape, long j, BorderStroke borderStroke, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, shape, j, borderStroke);
    }

    private DefaultSelectorProperties(boolean z, Shape shape, long j, BorderStroke borderStroke) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.enabled = z;
        this.shape = shape;
        this.color = j;
        this.border = borderStroke;
    }

    @Override // com.ifriend.presentation.features.onboarding.steps.view.common.SelectorProperties
    public State<Boolean> enabled(Composer composer, int i) {
        composer.startReplaceableGroup(467190999);
        ComposerKt.sourceInformation(composer, "C(enabled)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(467190999, i, -1, "com.ifriend.presentation.features.onboarding.steps.view.common.DefaultSelectorProperties.enabled (OnboardingWheelPickerComponent.kt:230)");
        }
        State<Boolean> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(this.enabled), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // com.ifriend.presentation.features.onboarding.steps.view.common.SelectorProperties
    public State<Shape> shape(Composer composer, int i) {
        composer.startReplaceableGroup(1650399223);
        ComposerKt.sourceInformation(composer, "C(shape)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1650399223, i, -1, "com.ifriend.presentation.features.onboarding.steps.view.common.DefaultSelectorProperties.shape (OnboardingWheelPickerComponent.kt:235)");
        }
        State<Shape> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(this.shape, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // com.ifriend.presentation.features.onboarding.steps.view.common.SelectorProperties
    public State<Color> color(Composer composer, int i) {
        composer.startReplaceableGroup(-635530123);
        ComposerKt.sourceInformation(composer, "C(color)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-635530123, i, -1, "com.ifriend.presentation.features.onboarding.steps.view.common.DefaultSelectorProperties.color (OnboardingWheelPickerComponent.kt:240)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3281boximpl(this.color), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // com.ifriend.presentation.features.onboarding.steps.view.common.SelectorProperties
    public State<BorderStroke> border(Composer composer, int i) {
        composer.startReplaceableGroup(1515381872);
        ComposerKt.sourceInformation(composer, "C(border)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1515381872, i, -1, "com.ifriend.presentation.features.onboarding.steps.view.common.DefaultSelectorProperties.border (OnboardingWheelPickerComponent.kt:245)");
        }
        State<BorderStroke> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(this.border, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }
}
