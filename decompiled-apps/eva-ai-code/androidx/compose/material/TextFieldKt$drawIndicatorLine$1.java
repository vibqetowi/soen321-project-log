package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TextField.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldKt$drawIndicatorLine$1 extends Lambda implements Function1<ContentDrawScope, Unit> {
    final /* synthetic */ BorderStroke $indicatorBorder;
    final /* synthetic */ float $strokeWidthDp;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldKt$drawIndicatorLine$1(float f, BorderStroke borderStroke) {
        super(1);
        this.$strokeWidthDp = f;
        this.$indicatorBorder = borderStroke;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
        invoke2(contentDrawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ContentDrawScope drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        drawWithContent.drawContent();
        if (Dp.m5612equalsimpl0(this.$strokeWidthDp, Dp.Companion.m5625getHairlineD9Ej5fM())) {
            return;
        }
        float density = this.$strokeWidthDp * drawWithContent.getDensity();
        float m3084getHeightimpl = Size.m3084getHeightimpl(drawWithContent.mo3762getSizeNHjbRc()) - (density / 2);
        DrawScope.CC.m3833drawLine1RTmtNc$default(drawWithContent, this.$indicatorBorder.getBrush(), OffsetKt.Offset(0.0f, m3084getHeightimpl), OffsetKt.Offset(Size.m3087getWidthimpl(drawWithContent.mo3762getSizeNHjbRc()), m3084getHeightimpl), density, 0, null, 0.0f, null, 0, 496, null);
    }
}
