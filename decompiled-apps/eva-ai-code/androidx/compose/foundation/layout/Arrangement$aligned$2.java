package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Arrangement.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "size", "<anonymous parameter 1>", "Landroidx/compose/ui/unit/LayoutDirection;", "invoke", "(ILandroidx/compose/ui/unit/LayoutDirection;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class Arrangement$aligned$2 extends Lambda implements Function2<Integer, LayoutDirection, Integer> {
    final /* synthetic */ Alignment.Vertical $alignment;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Arrangement$aligned$2(Alignment.Vertical vertical) {
        super(2);
        this.$alignment = vertical;
    }

    public final Integer invoke(int i, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "<anonymous parameter 1>");
        return Integer.valueOf(this.$alignment.align(0, i));
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
        return invoke(num.intValue(), layoutDirection);
    }
}
