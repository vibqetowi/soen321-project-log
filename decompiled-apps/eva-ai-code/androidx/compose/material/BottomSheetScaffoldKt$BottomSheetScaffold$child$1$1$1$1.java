package androidx.compose.material;

import androidx.compose.ui.unit.IntSize;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: BottomSheetScaffold.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "Landroidx/compose/material/BottomSheetValue;", "", "sheetSize", "Landroidx/compose/ui/unit/IntSize;", "invoke-ozmzZPI", "(J)Ljava/util/Map;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1 extends Lambda implements Function1<IntSize, Map<BottomSheetValue, ? extends Float>> {
    final /* synthetic */ int $layoutHeight;
    final /* synthetic */ float $peekHeightPx;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1(int i, float f) {
        super(1);
        this.$layoutHeight = i;
        this.$peekHeightPx = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Map<BottomSheetValue, ? extends Float> invoke(IntSize intSize) {
        return m1272invokeozmzZPI(intSize.m5771unboximpl());
    }

    /* renamed from: invoke-ozmzZPI  reason: not valid java name */
    public final Map<BottomSheetValue, Float> m1272invokeozmzZPI(long j) {
        float m5766getHeightimpl = IntSize.m5766getHeightimpl(j);
        float f = this.$peekHeightPx;
        float f2 = this.$layoutHeight - f;
        if (!(m5766getHeightimpl == 0.0f)) {
            if (!(m5766getHeightimpl == f)) {
                return MapsKt.mapOf(TuplesKt.to(BottomSheetValue.Collapsed, Float.valueOf(f2)), TuplesKt.to(BottomSheetValue.Expanded, Float.valueOf(this.$layoutHeight - m5766getHeightimpl)));
            }
        }
        return MapsKt.mapOf(TuplesKt.to(BottomSheetValue.Collapsed, Float.valueOf(f2)));
    }
}
