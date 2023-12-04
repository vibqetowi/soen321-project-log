package com.ifriend.presentation.features.chat.input.view;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatInputContent.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatInputContentKt$AudioRecordButton$4$1 extends Lambda implements Function1<ContentDrawScope, Unit> {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $alpha;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatInputContentKt$AudioRecordButton$4$1(Animatable<Float, AnimationVector1D> animatable) {
        super(1);
        this.$alpha = animatable;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
        invoke2(contentDrawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ContentDrawScope drawWithContent) {
        float f;
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        drawWithContent.drawContent();
        long m3290copywmQWz5c$default = Color.m3290copywmQWz5c$default(Color.Companion.m3328getWhite0d7_KjU(), this.$alpha.getValue().floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
        f = ChatInputContentKt.recordButtonSize;
        DrawScope.CC.m3829drawCircleVaOC9Bg$default(drawWithContent, m3290copywmQWz5c$default, drawWithContent.mo588toPx0680j_4(f) / 2, 0L, 0.0f, null, null, 0, 124, null);
    }
}
