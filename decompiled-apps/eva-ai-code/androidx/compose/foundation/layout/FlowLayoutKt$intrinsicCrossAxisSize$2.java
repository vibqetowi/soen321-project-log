package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: FlowLayout.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", FirebaseAnalytics.Param.INDEX, "<anonymous parameter 1>", "invoke", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class FlowLayoutKt$intrinsicCrossAxisSize$2 extends Lambda implements Function3<IntrinsicMeasurable, Integer, Integer, Integer> {
    final /* synthetic */ int[] $crossAxisSizes;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLayoutKt$intrinsicCrossAxisSize$2(int[] iArr) {
        super(3);
        this.$crossAxisSizes = iArr;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
        return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
    }

    public final Integer invoke(IntrinsicMeasurable intrinsicCrossAxisSize, int i, int i2) {
        Intrinsics.checkNotNullParameter(intrinsicCrossAxisSize, "$this$intrinsicCrossAxisSize");
        return Integer.valueOf(this.$crossAxisSizes[i]);
    }
}
