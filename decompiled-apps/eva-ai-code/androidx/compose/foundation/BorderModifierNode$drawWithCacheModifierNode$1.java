package androidx.compose.foundation;

import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Border.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/draw/CacheDrawScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BorderModifierNode$drawWithCacheModifierNode$1 extends Lambda implements Function1<CacheDrawScope, DrawResult> {
    final /* synthetic */ BorderModifierNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorderModifierNode$drawWithCacheModifierNode$1(BorderModifierNode borderModifierNode) {
        super(1);
        this.this$0 = borderModifierNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DrawResult invoke(CacheDrawScope CacheDrawModifierNode) {
        DrawResult m435drawRectBorderNsqcLGU;
        DrawResult m438drawRoundRectBorderJqoCqck;
        DrawResult drawGenericBorder;
        DrawResult drawContentWithoutBorder;
        Intrinsics.checkNotNullParameter(CacheDrawModifierNode, "$this$CacheDrawModifierNode");
        if (!(CacheDrawModifierNode.mo588toPx0680j_4(this.this$0.m439getWidthD9Ej5fM()) >= 0.0f && Size.m3086getMinDimensionimpl(CacheDrawModifierNode.m2924getSizeNHjbRc()) > 0.0f)) {
            drawContentWithoutBorder = BorderKt.drawContentWithoutBorder(CacheDrawModifierNode);
            return drawContentWithoutBorder;
        }
        float f = 2;
        float min = Math.min(Dp.m5612equalsimpl0(this.this$0.m439getWidthD9Ej5fM(), Dp.Companion.m5625getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil(CacheDrawModifierNode.mo588toPx0680j_4(this.this$0.m439getWidthD9Ej5fM())), (float) Math.ceil(Size.m3086getMinDimensionimpl(CacheDrawModifierNode.m2924getSizeNHjbRc()) / f));
        float f2 = min / f;
        long Offset = OffsetKt.Offset(f2, f2);
        long Size = SizeKt.Size(Size.m3087getWidthimpl(CacheDrawModifierNode.m2924getSizeNHjbRc()) - min, Size.m3084getHeightimpl(CacheDrawModifierNode.m2924getSizeNHjbRc()) - min);
        boolean z = f * min > Size.m3086getMinDimensionimpl(CacheDrawModifierNode.m2924getSizeNHjbRc());
        Outline mo470createOutlinePq9zytI = this.this$0.getShape().mo470createOutlinePq9zytI(CacheDrawModifierNode.m2924getSizeNHjbRc(), CacheDrawModifierNode.getLayoutDirection(), CacheDrawModifierNode);
        if (mo470createOutlinePq9zytI instanceof Outline.Generic) {
            BorderModifierNode borderModifierNode = this.this$0;
            drawGenericBorder = borderModifierNode.drawGenericBorder(CacheDrawModifierNode, borderModifierNode.getBrush(), (Outline.Generic) mo470createOutlinePq9zytI, z, min);
            return drawGenericBorder;
        } else if (mo470createOutlinePq9zytI instanceof Outline.Rounded) {
            BorderModifierNode borderModifierNode2 = this.this$0;
            m438drawRoundRectBorderJqoCqck = borderModifierNode2.m438drawRoundRectBorderJqoCqck(CacheDrawModifierNode, borderModifierNode2.getBrush(), (Outline.Rounded) mo470createOutlinePq9zytI, Offset, Size, z, min);
            return m438drawRoundRectBorderJqoCqck;
        } else if (mo470createOutlinePq9zytI instanceof Outline.Rectangle) {
            m435drawRectBorderNsqcLGU = BorderKt.m435drawRectBorderNsqcLGU(CacheDrawModifierNode, this.this$0.getBrush(), Offset, Size, z, min);
            return m435drawRectBorderNsqcLGU;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
