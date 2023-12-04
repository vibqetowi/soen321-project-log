package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OutlinedTextField.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OutlinedTextFieldKt$outlineCutout$1 extends Lambda implements Function1<ContentDrawScope, Unit> {
    final /* synthetic */ long $labelSize;
    final /* synthetic */ PaddingValues $paddingValues;

    /* compiled from: OutlinedTextField.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutlinedTextFieldKt$outlineCutout$1(long j, PaddingValues paddingValues) {
        super(1);
        this.$labelSize = j;
        this.$paddingValues = paddingValues;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
        invoke2(contentDrawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ContentDrawScope drawWithContent) {
        float f;
        float coerceAtLeast;
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        float m3087getWidthimpl = Size.m3087getWidthimpl(this.$labelSize);
        if (m3087getWidthimpl > 0.0f) {
            f = OutlinedTextFieldKt.OutlinedTextFieldInnerPadding;
            float f2 = drawWithContent.mo588toPx0680j_4(f);
            float f3 = drawWithContent.mo588toPx0680j_4(this.$paddingValues.mo698calculateLeftPaddingu2uoSUM(drawWithContent.getLayoutDirection())) - f2;
            float f4 = 2;
            float f5 = m3087getWidthimpl + f3 + (f2 * f4);
            if (WhenMappings.$EnumSwitchMapping$0[drawWithContent.getLayoutDirection().ordinal()] == 1) {
                coerceAtLeast = Size.m3087getWidthimpl(drawWithContent.mo3762getSizeNHjbRc()) - f5;
            } else {
                coerceAtLeast = RangesKt.coerceAtLeast(f3, 0.0f);
            }
            float f6 = coerceAtLeast;
            if (WhenMappings.$EnumSwitchMapping$0[drawWithContent.getLayoutDirection().ordinal()] == 1) {
                f5 = Size.m3087getWidthimpl(drawWithContent.mo3762getSizeNHjbRc()) - RangesKt.coerceAtLeast(f3, 0.0f);
            }
            float f7 = f5;
            float m3084getHeightimpl = Size.m3084getHeightimpl(this.$labelSize);
            float f8 = m3084getHeightimpl / f4;
            int m3279getDifferencertfAjoo = ClipOp.Companion.m3279getDifferencertfAjoo();
            DrawContext drawContext = drawWithContent.getDrawContext();
            long mo3768getSizeNHjbRc = drawContext.mo3768getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().mo3771clipRectN_I0leg(f6, (-m3084getHeightimpl) / f4, f7, f8, m3279getDifferencertfAjoo);
            drawWithContent.drawContent();
            drawContext.getCanvas().restore();
            drawContext.mo3769setSizeuvyYCjk(mo3768getSizeNHjbRc);
            return;
        }
        drawWithContent.drawContent();
    }
}
