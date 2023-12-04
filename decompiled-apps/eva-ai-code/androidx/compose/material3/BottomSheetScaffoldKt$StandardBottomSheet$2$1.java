package androidx.compose.material3;

import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
/* compiled from: BottomSheetScaffold.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BottomSheetScaffoldKt$StandardBottomSheet$2$1 extends Lambda implements Function2<SheetValue, IntSize, Float> {
    final /* synthetic */ float $layoutHeight;
    final /* synthetic */ float $peekHeightPx;
    final /* synthetic */ SheetState $state;

    /* compiled from: BottomSheetScaffold.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SheetValue.values().length];
            try {
                iArr[SheetValue.PartiallyExpanded.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SheetValue.Expanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SheetValue.Hidden.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$StandardBottomSheet$2$1(SheetState sheetState, float f, float f2) {
        super(2);
        this.$state = sheetState;
        this.$layoutHeight = f;
        this.$peekHeightPx = f2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Float invoke(SheetValue sheetValue, IntSize intSize) {
        return m1594invokeO0kMr_c(sheetValue, intSize.m5771unboximpl());
    }

    /* renamed from: invoke-O0kMr_c  reason: not valid java name */
    public final Float m1594invokeO0kMr_c(SheetValue value, long j) {
        Intrinsics.checkNotNullParameter(value, "value");
        int i = WhenMappings.$EnumSwitchMapping$0[value.ordinal()];
        if (i == 1) {
            if (this.$state.getSkipPartiallyExpanded$material3_release()) {
                return null;
            }
            return Float.valueOf(this.$layoutHeight - this.$peekHeightPx);
        } else if (i == 2) {
            if (IntSize.m5766getHeightimpl(j) == MathKt.roundToInt(this.$peekHeightPx)) {
                return null;
            }
            return Float.valueOf(Math.max(0.0f, this.$layoutHeight - IntSize.m5766getHeightimpl(j)));
        } else if (i == 3) {
            if (this.$state.getSkipHiddenState$material3_release()) {
                return null;
            }
            return Float.valueOf(this.$layoutHeight);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
