package androidx.compose.material;

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
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SliderKt$Track$1 extends Lambda implements Function1<DrawScope, Unit> {
    final /* synthetic */ State<Color> $activeTickColor;
    final /* synthetic */ State<Color> $activeTrackColor;
    final /* synthetic */ State<Color> $inactiveTickColor;
    final /* synthetic */ State<Color> $inactiveTrackColor;
    final /* synthetic */ float $positionFractionEnd;
    final /* synthetic */ float $positionFractionStart;
    final /* synthetic */ float $thumbPx;
    final /* synthetic */ List<Float> $tickFractions;
    final /* synthetic */ float $trackStrokeWidth;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$Track$1(float f, State<Color> state, float f2, float f3, float f4, State<Color> state2, List<Float> list, State<Color> state3, State<Color> state4) {
        super(1);
        this.$thumbPx = f;
        this.$inactiveTrackColor = state;
        this.$trackStrokeWidth = f2;
        this.$positionFractionEnd = f3;
        this.$positionFractionStart = f4;
        this.$activeTrackColor = state2;
        this.$tickFractions = list;
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
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        boolean z = Canvas.getLayoutDirection() == LayoutDirection.Rtl;
        long Offset = OffsetKt.Offset(this.$thumbPx, Offset.m3019getYimpl(Canvas.mo3761getCenterF1C5BW0()));
        long Offset2 = OffsetKt.Offset(Size.m3087getWidthimpl(Canvas.mo3762getSizeNHjbRc()) - this.$thumbPx, Offset.m3019getYimpl(Canvas.mo3761getCenterF1C5BW0()));
        long j = z ? Offset2 : Offset;
        long j2 = z ? Offset : Offset2;
        long j3 = j2;
        long j4 = j;
        DrawScope.CC.m3834drawLineNGM6Ib0$default(Canvas, this.$inactiveTrackColor.getValue().m3301unboximpl(), j, j2, this.$trackStrokeWidth, StrokeCap.Companion.m3645getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        DrawScope.CC.m3834drawLineNGM6Ib0$default(Canvas, this.$activeTrackColor.getValue().m3301unboximpl(), OffsetKt.Offset(Offset.m3018getXimpl(j4) + ((Offset.m3018getXimpl(j3) - Offset.m3018getXimpl(j4)) * this.$positionFractionStart), Offset.m3019getYimpl(Canvas.mo3761getCenterF1C5BW0())), OffsetKt.Offset(Offset.m3018getXimpl(j4) + ((Offset.m3018getXimpl(j3) - Offset.m3018getXimpl(j4)) * this.$positionFractionEnd), Offset.m3019getYimpl(Canvas.mo3761getCenterF1C5BW0())), this.$trackStrokeWidth, StrokeCap.Companion.m3645getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        float f = this.$positionFractionEnd;
        float f2 = this.$positionFractionStart;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : this.$tickFractions) {
            float floatValue = ((Number) obj).floatValue();
            Boolean valueOf = Boolean.valueOf(floatValue > f || floatValue < f2);
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = (List) new ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(obj);
        }
        State<Color> state = this.$inactiveTickColor;
        State<Color> state2 = this.$activeTickColor;
        float f3 = this.$trackStrokeWidth;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
            List<Number> list = (List) entry.getValue();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (Number number : list) {
                arrayList.add(Offset.m3007boximpl(OffsetKt.Offset(Offset.m3018getXimpl(OffsetKt.m3041lerpWko1d7g(j4, j3, number.floatValue())), Offset.m3019getYimpl(Canvas.mo3761getCenterF1C5BW0()))));
            }
            long j5 = j3;
            long j6 = j4;
            DrawScope.CC.m3839drawPointsF8ZwMP8$default(Canvas, arrayList, PointMode.Companion.m3597getPointsr_lszbg(), (booleanValue ? state : state2).getValue().m3301unboximpl(), f3, StrokeCap.Companion.m3645getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
            j4 = j6;
            f3 = f3;
            j3 = j5;
        }
    }
}
