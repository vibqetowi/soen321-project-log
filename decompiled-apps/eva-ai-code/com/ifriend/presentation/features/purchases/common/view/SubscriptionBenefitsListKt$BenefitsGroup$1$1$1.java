package com.ifriend.presentation.features.purchases.common.view;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.ifriend.ui.components.canvas.DrawscopeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SubscriptionBenefitsList.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SubscriptionBenefitsListKt$BenefitsGroup$1$1$1 extends Lambda implements Function1<DrawScope, Unit> {
    final /* synthetic */ MutableIntState $textWidth$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionBenefitsListKt$BenefitsGroup$1$1$1(MutableIntState mutableIntState) {
        super(1);
        this.$textWidth$delegate = mutableIntState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(DrawScope drawBehind) {
        float f;
        float f2;
        int BenefitsGroup$lambda$9$lambda$3;
        float f3;
        int BenefitsGroup$lambda$9$lambda$32;
        int BenefitsGroup$lambda$9$lambda$33;
        float f4;
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        f = SubscriptionBenefitsListKt.borderRadius;
        float f5 = drawBehind.mo588toPx0680j_4(f);
        long m3328getWhite0d7_KjU = Color.Companion.m3328getWhite0d7_KjU();
        f2 = SubscriptionBenefitsListKt.borderWidth;
        DrawscopeKt.m7033drawRoundRectStrokeInsider8hcZFg$default(drawBehind, m3328getWhite0d7_KjU, f2, 0L, 0L, CornerRadiusKt.CornerRadius(f5, f5), 0.0f, null, 0, 236, null);
        BenefitsGroup$lambda$9$lambda$3 = SubscriptionBenefitsListKt.BenefitsGroup$lambda$9$lambda$3(this.$textWidth$delegate);
        if (BenefitsGroup$lambda$9$lambda$3 > 0) {
            f3 = SubscriptionBenefitsListKt.labelPadding;
            float f6 = drawBehind.mo588toPx0680j_4(f3);
            long m3326getTransparent0d7_KjU = Color.Companion.m3326getTransparent0d7_KjU();
            float m3087getWidthimpl = Size.m3087getWidthimpl(drawBehind.mo3762getSizeNHjbRc());
            BenefitsGroup$lambda$9$lambda$32 = SubscriptionBenefitsListKt.BenefitsGroup$lambda$9$lambda$3(this.$textWidth$delegate);
            float f7 = m3087getWidthimpl - BenefitsGroup$lambda$9$lambda$32;
            float f8 = 2;
            long Offset = OffsetKt.Offset((f7 / f8) - f6, 0.0f);
            BenefitsGroup$lambda$9$lambda$33 = SubscriptionBenefitsListKt.BenefitsGroup$lambda$9$lambda$3(this.$textWidth$delegate);
            float f9 = BenefitsGroup$lambda$9$lambda$33 + (f6 * f8);
            f4 = SubscriptionBenefitsListKt.borderWidth;
            DrawScope.CC.m3842drawRectnJ9OG0$default(drawBehind, m3326getTransparent0d7_KjU, Offset, SizeKt.Size(f9, drawBehind.mo588toPx0680j_4(f4) * f8), 0.0f, null, null, BlendMode.Companion.m3208getClear0nO6VwU(), 56, null);
        }
    }
}
