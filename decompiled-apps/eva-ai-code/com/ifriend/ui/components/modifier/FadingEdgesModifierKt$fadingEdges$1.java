package com.ifriend.ui.components.modifier;

import androidx.compose.foundation.ScrollState;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: FadingEdgesModifier.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class FadingEdgesModifierKt$fadingEdges$1 extends Lambda implements Function1<ContentDrawScope, Unit> {
    final /* synthetic */ float $bottomEdgeHeight;
    final /* synthetic */ ScrollState $scrollState;
    final /* synthetic */ float $topEdgeHeight;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FadingEdgesModifierKt$fadingEdges$1(ScrollState scrollState, float f, float f2) {
        super(1);
        this.$scrollState = scrollState;
        this.$topEdgeHeight = f;
        this.$bottomEdgeHeight = f2;
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
        List listOf = CollectionsKt.listOf((Object[]) new Color[]{Color.m3281boximpl(Color.Companion.m3326getTransparent0d7_KjU()), Color.m3281boximpl(Color.Companion.m3317getBlack0d7_KjU())});
        float value = this.$scrollState.getValue();
        ContentDrawScope contentDrawScope = drawWithContent;
        DrawScope.CC.m3841drawRectAsUm42w$default(contentDrawScope, Brush.Companion.m3248verticalGradient8A3gB4$default(Brush.Companion, listOf, value, value + Math.min(drawWithContent.mo588toPx0680j_4(this.$topEdgeHeight), value), 0, 8, (Object) null), 0L, 0L, 0.0f, null, null, BlendMode.Companion.m3216getDstIn0nO6VwU(), 62, null);
        List listOf2 = CollectionsKt.listOf((Object[]) new Color[]{Color.m3281boximpl(Color.Companion.m3317getBlack0d7_KjU()), Color.m3281boximpl(Color.Companion.m3326getTransparent0d7_KjU())});
        float m3084getHeightimpl = (Size.m3084getHeightimpl(drawWithContent.mo3762getSizeNHjbRc()) - this.$scrollState.getMaxValue()) + this.$scrollState.getValue();
        float min = Math.min(drawWithContent.mo588toPx0680j_4(this.$bottomEdgeHeight), this.$scrollState.getMaxValue() - this.$scrollState.getValue());
        if (min == 0.0f) {
            return;
        }
        DrawScope.CC.m3841drawRectAsUm42w$default(contentDrawScope, Brush.Companion.m3248verticalGradient8A3gB4$default(Brush.Companion, listOf2, m3084getHeightimpl - min, m3084getHeightimpl, 0, 8, (Object) null), 0L, 0L, 0.0f, null, null, BlendMode.Companion.m3216getDstIn0nO6VwU(), 62, null);
    }
}
