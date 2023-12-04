package com.ifriend.ui.components.bubble;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: AnimatedBubbles.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class AnimatedBubblesKt$AnimatedBubble$1$1 extends Lambda implements Function1<DrawScope, Unit> {
    final /* synthetic */ Brush $brush;
    final /* synthetic */ float $bubbleSize;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedBubblesKt$AnimatedBubble$1$1(Brush brush, float f) {
        super(1);
        this.$brush = brush;
        this.$bubbleSize = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        DrawScope.CC.m3828drawCircleV9BoPsw$default(Canvas, this.$brush, Canvas.mo588toPx0680j_4(this.$bubbleSize) / 2, 0L, 0.0f, null, null, 0, 124, null);
    }
}
