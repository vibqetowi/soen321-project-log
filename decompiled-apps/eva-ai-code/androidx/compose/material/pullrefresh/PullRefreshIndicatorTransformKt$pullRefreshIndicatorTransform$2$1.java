package androidx.compose.material.pullrefresh;

import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: PullRefreshIndicatorTransform.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$1 extends Lambda implements Function1<ContentDrawScope, Unit> {
    public static final PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$1 INSTANCE = new PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$1();

    PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
        invoke2(contentDrawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ContentDrawScope drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        int m3280getIntersectrtfAjoo = ClipOp.Companion.m3280getIntersectrtfAjoo();
        DrawContext drawContext = drawWithContent.getDrawContext();
        long mo3768getSizeNHjbRc = drawContext.mo3768getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo3771clipRectN_I0leg(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, m3280getIntersectrtfAjoo);
        drawWithContent.drawContent();
        drawContext.getCanvas().restore();
        drawContext.mo3769setSizeuvyYCjk(mo3768getSizeNHjbRc);
    }
}
