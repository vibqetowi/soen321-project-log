package androidx.compose.material3;

import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.DpOffset;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TimePicker.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TimePickerKt$drawSelector$1 extends Lambda implements Function1<ContentDrawScope, Unit> {
    final /* synthetic */ TimePickerColors $colors;
    final /* synthetic */ TimePickerState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$drawSelector$1(TimePickerState timePickerState, TimePickerColors timePickerColors) {
        super(1);
        this.$state = timePickerState;
        this.$colors = timePickerColors;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
        invoke2(contentDrawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ContentDrawScope drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        long Offset = OffsetKt.Offset(drawWithContent.mo588toPx0680j_4(DpOffset.m5668getXD9Ej5fM(this.$state.m2186getSelectorPosRKDOV3M$material3_release())), drawWithContent.mo588toPx0680j_4(DpOffset.m5670getYD9Ej5fM(this.$state.m2186getSelectorPosRKDOV3M$material3_release())));
        float f = 2;
        float f2 = drawWithContent.mo588toPx0680j_4(TimePickerTokens.INSTANCE.m2755getClockDialSelectorHandleContainerSizeD9Ej5fM()) / f;
        long m2152getSelectorColor0d7_KjU$material3_release = this.$colors.m2152getSelectorColor0d7_KjU$material3_release();
        ContentDrawScope contentDrawScope = drawWithContent;
        DrawScope.CC.m3829drawCircleVaOC9Bg$default(contentDrawScope, Color.Companion.m3317getBlack0d7_KjU(), f2, Offset, 0.0f, null, null, BlendMode.Companion.m3208getClear0nO6VwU(), 56, null);
        drawWithContent.drawContent();
        DrawScope.CC.m3829drawCircleVaOC9Bg$default(contentDrawScope, m2152getSelectorColor0d7_KjU$material3_release, f2, Offset, 0.0f, null, null, BlendMode.Companion.m3236getXor0nO6VwU(), 56, null);
        DrawScope.CC.m3834drawLineNGM6Ib0$default(contentDrawScope, m2152getSelectorColor0d7_KjU$material3_release, SizeKt.m3097getCenteruvyYCjk(drawWithContent.mo3762getSizeNHjbRc()), Offset.m3022minusMKHz9U(Offset, OffsetKt.Offset(((float) Math.cos(this.$state.getCurrentAngle$material3_release().getValue().floatValue())) * f2, ((float) Math.sin(this.$state.getCurrentAngle$material3_release().getValue().floatValue())) * f2)), drawWithContent.mo588toPx0680j_4(TimePickerTokens.INSTANCE.m2756getClockDialSelectorTrackContainerWidthD9Ej5fM()), 0, null, 0.0f, null, BlendMode.Companion.m3235getSrcOver0nO6VwU(), PsExtractor.VIDEO_STREAM_MASK, null);
        DrawScope.CC.m3829drawCircleVaOC9Bg$default(contentDrawScope, m2152getSelectorColor0d7_KjU$material3_release, drawWithContent.mo588toPx0680j_4(TimePickerTokens.INSTANCE.m2754getClockDialSelectorCenterContainerSizeD9Ej5fM()) / f, SizeKt.m3097getCenteruvyYCjk(drawWithContent.mo3762getSizeNHjbRc()), 0.0f, null, null, 0, 120, null);
        DrawScope.CC.m3829drawCircleVaOC9Bg$default(contentDrawScope, this.$colors.m2148clockDialContentColorvNxB06k$material3_release(true), f2, Offset, 0.0f, null, null, BlendMode.Companion.m3218getDstOver0nO6VwU(), 56, null);
    }
}
