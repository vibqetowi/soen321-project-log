package androidx.compose.ui.layout;

import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SubcomposeLayout.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubcomposeLayoutKt$SubcomposeLayout$8 extends Lambda implements Function2<SubcomposeIntermediateMeasureScope, Constraints, MeasureResult> {
    public static final SubcomposeLayoutKt$SubcomposeLayout$8 INSTANCE = new SubcomposeLayoutKt$SubcomposeLayout$8();

    SubcomposeLayoutKt$SubcomposeLayout$8() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeIntermediateMeasureScope subcomposeIntermediateMeasureScope, Constraints constraints) {
        return m4642invoke0kLqBqw(subcomposeIntermediateMeasureScope, constraints.m5557unboximpl());
    }

    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final MeasureResult m4642invoke0kLqBqw(SubcomposeIntermediateMeasureScope subcomposeIntermediateMeasureScope, long j) {
        Intrinsics.checkNotNullParameter(subcomposeIntermediateMeasureScope, "$this$null");
        return subcomposeIntermediateMeasureScope.getLookaheadMeasurePolicy().invoke(subcomposeIntermediateMeasureScope, Constraints.m5539boximpl(j));
    }
}
