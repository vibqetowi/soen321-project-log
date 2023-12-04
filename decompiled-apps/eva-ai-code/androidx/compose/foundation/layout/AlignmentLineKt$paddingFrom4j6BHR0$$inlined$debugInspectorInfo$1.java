package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: InspectableValue.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-4j6BHR0$$inlined$debugInspectorInfo$1  reason: invalid class name */
/* loaded from: classes.dex */
public final class AlignmentLineKt$paddingFrom4j6BHR0$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ float $after$inlined;
    final /* synthetic */ AlignmentLine $alignmentLine$inlined;
    final /* synthetic */ float $before$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlignmentLineKt$paddingFrom4j6BHR0$$inlined$debugInspectorInfo$1(AlignmentLine alignmentLine, float f, float f2) {
        super(1);
        this.$alignmentLine$inlined = alignmentLine;
        this.$before$inlined = f;
        this.$after$inlined = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
        inspectorInfo.setName("paddingFrom");
        inspectorInfo.getProperties().set("alignmentLine", this.$alignmentLine$inlined);
        inspectorInfo.getProperties().set(TtmlNode.ANNOTATION_POSITION_BEFORE, Dp.m5605boximpl(this.$before$inlined));
        inspectorInfo.getProperties().set(TtmlNode.ANNOTATION_POSITION_AFTER, Dp.m5605boximpl(this.$after$inlined));
    }
}