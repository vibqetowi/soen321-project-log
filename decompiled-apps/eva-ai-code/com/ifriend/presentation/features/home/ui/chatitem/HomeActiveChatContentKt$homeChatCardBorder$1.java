package com.ifriend.presentation.features.home.ui.chatitem;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.unit.Dp;
import com.ifriend.ui.theme.AppColors;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: HomeActiveChatContent.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class HomeActiveChatContentKt$homeChatCardBorder$1 extends Lambda implements Function1<ContentDrawScope, Unit> {
    public static final HomeActiveChatContentKt$homeChatCardBorder$1 INSTANCE = new HomeActiveChatContentKt$homeChatCardBorder$1();

    HomeActiveChatContentKt$homeChatCardBorder$1() {
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
        drawWithContent.drawContent();
        ContentDrawScope contentDrawScope = drawWithContent;
        contentDrawScope.getDrawContext().getCanvas();
        float m3087getWidthimpl = Size.m3087getWidthimpl(drawWithContent.mo3762getSizeNHjbRc());
        float m3084getHeightimpl = Size.m3084getHeightimpl(drawWithContent.mo3762getSizeNHjbRc());
        float f = drawWithContent.mo588toPx0680j_4(Dp.m5607constructorimpl(20));
        float f2 = drawWithContent.mo588toPx0680j_4(Dp.m5607constructorimpl(1));
        float f3 = m3087getWidthimpl / 2.0f;
        DrawScope.CC.m3833drawLine1RTmtNc$default(contentDrawScope, Brush.Companion.m3240horizontalGradient8A3gB4$default(Brush.Companion, CollectionsKt.listOf((Object[]) new Color[]{Color.m3281boximpl(AppColors.Companion.m7142getViolet0d7_KjU()), Color.m3281boximpl(Color.Companion.m3326getTransparent0d7_KjU())}), f, f3, 0, 8, (Object) null), OffsetKt.Offset(f, 0.0f), OffsetKt.Offset(f3, 0.0f), f2, 0, null, 0.0f, null, 0, 496, null);
        float f4 = 2 * f;
        DrawScope.CC.m3827drawArcyD3GUKo$default(contentDrawScope, AppColors.Companion.m7142getViolet0d7_KjU(), 180.0f, 90.0f, false, Offset.Companion.m3034getZeroF1C5BW0(), SizeKt.Size(f4, f4), 0.0f, new Stroke(f2, 0.0f, 0, 0, null, 30, null), null, 0, 832, null);
        DrawScope.CC.m3833drawLine1RTmtNc$default(contentDrawScope, Brush.Companion.m3249verticalGradient8A3gB4$default(Brush.Companion, new Pair[]{TuplesKt.to(Float.valueOf(0.0f), Color.m3281boximpl(AppColors.Companion.m7142getViolet0d7_KjU())), TuplesKt.to(Float.valueOf(0.5f), Color.m3281boximpl(AppColors.Companion.m7142getViolet0d7_KjU())), TuplesKt.to(Float.valueOf(1.0f), Color.m3281boximpl(Color.Companion.m3326getTransparent0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null), OffsetKt.Offset(0.0f, f), OffsetKt.Offset(0.0f, m3084getHeightimpl), f2, 0, null, 0.0f, null, 0, 496, null);
    }
}
