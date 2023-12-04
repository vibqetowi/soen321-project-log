package androidx.compose.material3;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Slider.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SliderDefaults$Track$1$1 extends Lambda implements Function1<DrawScope, Unit> {
    final /* synthetic */ State<Color> $activeTickColor;
    final /* synthetic */ State<Color> $activeTrackColor;
    final /* synthetic */ State<Color> $inactiveTickColor;
    final /* synthetic */ State<Color> $inactiveTrackColor;
    final /* synthetic */ SliderPositions $sliderPositions;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderDefaults$Track$1$1(State<Color> state, SliderPositions sliderPositions, State<Color> state2, State<Color> state3, State<Color> state4) {
        super(1);
        this.$inactiveTrackColor = state;
        this.$sliderPositions = sliderPositions;
        this.$activeTrackColor = state2;
        this.$inactiveTickColor = state3;
        this.$activeTickColor = state4;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(DrawScope Canvas) {
        float f;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        boolean z = Canvas.getLayoutDirection() == LayoutDirection.Rtl;
        long Offset = OffsetKt.Offset(0.0f, Offset.m3019getYimpl(Canvas.mo3761getCenterF1C5BW0()));
        long Offset2 = OffsetKt.Offset(Size.m3087getWidthimpl(Canvas.mo3762getSizeNHjbRc()), Offset.m3019getYimpl(Canvas.mo3761getCenterF1C5BW0()));
        long j = z ? Offset2 : Offset;
        long j2 = z ? Offset : Offset2;
        f = SliderKt.TickSize;
        float f2 = Canvas.mo588toPx0680j_4(f);
        float f3 = Canvas.mo588toPx0680j_4(SliderKt.getTrackHeight());
        long j3 = j2;
        long j4 = j;
        DrawScope.CC.m3834drawLineNGM6Ib0$default(Canvas, this.$inactiveTrackColor.getValue().m3301unboximpl(), j, j2, f3, StrokeCap.Companion.m3645getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        DrawScope.CC.m3834drawLineNGM6Ib0$default(Canvas, this.$activeTrackColor.getValue().m3301unboximpl(), OffsetKt.Offset(Offset.m3018getXimpl(j4) + ((Offset.m3018getXimpl(j3) - Offset.m3018getXimpl(j4)) * this.$sliderPositions.getActiveRange().getStart().floatValue()), Offset.m3019getYimpl(Canvas.mo3761getCenterF1C5BW0())), OffsetKt.Offset(Offset.m3018getXimpl(j4) + ((Offset.m3018getXimpl(j3) - Offset.m3018getXimpl(j4)) * this.$sliderPositions.getActiveRange().getEndInclusive().floatValue()), Offset.m3019getYimpl(Canvas.mo3761getCenterF1C5BW0())), f3, StrokeCap.Companion.m3645getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        float[] tickFractions = this.$sliderPositions.getTickFractions();
        SliderPositions sliderPositions = this.$sliderPositions;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = tickFractions.length;
        for (int i = 0; i < length; i++) {
            float f4 = tickFractions[i];
            Boolean valueOf = Boolean.valueOf(f4 > sliderPositions.getActiveRange().getEndInclusive().floatValue() || f4 < sliderPositions.getActiveRange().getStart().floatValue());
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = (List) new ArrayList();
                linkedHashMap.put(valueOf, obj);
            }
            ((List) obj).add(Float.valueOf(f4));
        }
        State<Color> state = this.$inactiveTickColor;
        State<Color> state2 = this.$activeTickColor;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
            List<Number> list = (List) entry.getValue();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (Number number : list) {
                arrayList.add(Offset.m3007boximpl(OffsetKt.Offset(Offset.m3018getXimpl(OffsetKt.m3041lerpWko1d7g(j4, j3, number.floatValue())), Offset.m3019getYimpl(Canvas.mo3761getCenterF1C5BW0()))));
            }
            long j5 = j4;
            long j6 = j3;
            DrawScope.CC.m3839drawPointsF8ZwMP8$default(Canvas, arrayList, PointMode.Companion.m3597getPointsr_lszbg(), (booleanValue ? state : state2).getValue().m3301unboximpl(), f2, StrokeCap.Companion.m3645getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
            j4 = j5;
            j3 = j6;
        }
    }
}
