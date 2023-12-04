package androidx.compose.foundation;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Border.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BorderModifierNode$drawRoundRectBorder$1 extends Lambda implements Function1<ContentDrawScope, Unit> {
    final /* synthetic */ long $borderSize;
    final /* synthetic */ Stroke $borderStroke;
    final /* synthetic */ Brush $brush;
    final /* synthetic */ long $cornerRadius;
    final /* synthetic */ boolean $fillArea;
    final /* synthetic */ float $halfStroke;
    final /* synthetic */ float $strokeWidth;
    final /* synthetic */ long $topLeft;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorderModifierNode$drawRoundRectBorder$1(boolean z, Brush brush, long j, float f, float f2, long j2, long j3, Stroke stroke) {
        super(1);
        this.$fillArea = z;
        this.$brush = brush;
        this.$cornerRadius = j;
        this.$halfStroke = f;
        this.$strokeWidth = f2;
        this.$topLeft = j2;
        this.$borderSize = j3;
        this.$borderStroke = stroke;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
        invoke2(contentDrawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ContentDrawScope onDrawWithContent) {
        long m436shrinkKibmq7A;
        Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.drawContent();
        if (this.$fillArea) {
            DrawScope.CC.m3843drawRoundRectZuiqVtQ$default(onDrawWithContent, this.$brush, 0L, 0L, this.$cornerRadius, 0.0f, null, null, 0, 246, null);
            return;
        }
        float m2993getXimpl = CornerRadius.m2993getXimpl(this.$cornerRadius);
        float f = this.$halfStroke;
        if (m2993getXimpl < f) {
            ContentDrawScope contentDrawScope = onDrawWithContent;
            float f2 = this.$strokeWidth;
            float m3087getWidthimpl = Size.m3087getWidthimpl(onDrawWithContent.mo3762getSizeNHjbRc()) - this.$strokeWidth;
            float m3084getHeightimpl = Size.m3084getHeightimpl(onDrawWithContent.mo3762getSizeNHjbRc()) - this.$strokeWidth;
            int m3279getDifferencertfAjoo = ClipOp.Companion.m3279getDifferencertfAjoo();
            Brush brush = this.$brush;
            long j = this.$cornerRadius;
            DrawContext drawContext = contentDrawScope.getDrawContext();
            long mo3768getSizeNHjbRc = drawContext.mo3768getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().mo3771clipRectN_I0leg(f2, f2, m3087getWidthimpl, m3084getHeightimpl, m3279getDifferencertfAjoo);
            DrawScope.CC.m3843drawRoundRectZuiqVtQ$default(contentDrawScope, brush, 0L, 0L, j, 0.0f, null, null, 0, 246, null);
            drawContext.getCanvas().restore();
            drawContext.mo3769setSizeuvyYCjk(mo3768getSizeNHjbRc);
            return;
        }
        Brush brush2 = this.$brush;
        long j2 = this.$topLeft;
        long j3 = this.$borderSize;
        m436shrinkKibmq7A = BorderKt.m436shrinkKibmq7A(this.$cornerRadius, f);
        DrawScope.CC.m3843drawRoundRectZuiqVtQ$default(onDrawWithContent, brush2, j2, j3, m436shrinkKibmq7A, 0.0f, this.$borderStroke, null, 0, 208, null);
    }
}
