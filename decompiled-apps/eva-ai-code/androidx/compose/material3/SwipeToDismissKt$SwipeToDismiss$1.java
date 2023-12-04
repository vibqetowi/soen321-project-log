package androidx.compose.material3;

import androidx.compose.ui.unit.IntSize;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: SwipeToDismiss.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SwipeToDismissKt$SwipeToDismiss$1 extends Lambda implements Function2<DismissValue, IntSize, Float> {
    final /* synthetic */ Set<DismissDirection> $directions;

    /* compiled from: SwipeToDismiss.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DismissValue.values().length];
            try {
                iArr[DismissValue.DismissedToEnd.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DismissValue.DismissedToStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DismissValue.Default.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwipeToDismissKt$SwipeToDismiss$1(Set<? extends DismissDirection> set) {
        super(2);
        this.$directions = set;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Float invoke(DismissValue dismissValue, IntSize intSize) {
        return m2076invokeO0kMr_c(dismissValue, intSize.m5771unboximpl());
    }

    /* renamed from: invoke-O0kMr_c  reason: not valid java name */
    public final Float m2076invokeO0kMr_c(DismissValue value, long j) {
        Intrinsics.checkNotNullParameter(value, "value");
        float m5767getWidthimpl = IntSize.m5767getWidthimpl(j);
        int i = WhenMappings.$EnumSwitchMapping$0[value.ordinal()];
        if (i == 1) {
            if (this.$directions.contains(DismissDirection.StartToEnd)) {
                return Float.valueOf(m5767getWidthimpl);
            }
            return null;
        } else if (i != 2) {
            if (i == 3) {
                return Float.valueOf(0.0f);
            }
            throw new NoWhenBranchMatchedException();
        } else if (this.$directions.contains(DismissDirection.EndToStart)) {
            return Float.valueOf(-m5767getWidthimpl);
        } else {
            return null;
        }
    }
}
