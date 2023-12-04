package com.ifriend.presentation.features.onboarding.steps.view.common;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: OnboardingTextComponents.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OnboardingTextComponentsKt$OnboardingTextField$2$4 extends Lambda implements Function3<MeasureScope, Measurable, Constraints, MeasureResult> {
    public static final OnboardingTextComponentsKt$OnboardingTextField$2$4 INSTANCE = new OnboardingTextComponentsKt$OnboardingTextField$2$4();

    OnboardingTextComponentsKt$OnboardingTextField$2$4() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        return m6937invoke3p2s80s(measureScope, measurable, constraints.m5557unboximpl());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingTextComponents.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.onboarding.steps.view.common.OnboardingTextComponentsKt$OnboardingTextField$2$4$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
        final /* synthetic */ Placeable $placeable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Placeable placeable) {
            super(1);
            this.$placeable = placeable;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Placeable.PlacementScope layout) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Placeable.PlacementScope.placeRelative$default(layout, this.$placeable, 0, 0, 0.0f, 4, null);
        }
    }

    /* renamed from: invoke-3p2s80s  reason: not valid java name */
    public final MeasureResult m6937invoke3p2s80s(MeasureScope layout, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Placeable mo4545measureBRTryo0 = measurable.mo4545measureBRTryo0(j);
        return MeasureScope.CC.layout$default(layout, mo4545measureBRTryo0.getWidth() + 8, mo4545measureBRTryo0.getHeight(), null, new AnonymousClass1(mo4545measureBRTryo0), 4, null);
    }
}
