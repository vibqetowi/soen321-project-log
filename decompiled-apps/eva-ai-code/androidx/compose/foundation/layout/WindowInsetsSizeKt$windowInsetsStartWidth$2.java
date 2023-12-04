package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: WindowInsetsSize.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/WindowInsets;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "invoke", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class WindowInsetsSizeKt$windowInsetsStartWidth$2 extends Lambda implements Function3<WindowInsets, LayoutDirection, Density, Integer> {
    public static final WindowInsetsSizeKt$windowInsetsStartWidth$2 INSTANCE = new WindowInsetsSizeKt$windowInsetsStartWidth$2();

    WindowInsetsSizeKt$windowInsetsStartWidth$2() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Integer invoke(WindowInsets $receiver, LayoutDirection layoutDirection, Density density) {
        int right;
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        if (layoutDirection == LayoutDirection.Ltr) {
            right = $receiver.getLeft(density, layoutDirection);
        } else {
            right = $receiver.getRight(density, layoutDirection);
        }
        return Integer.valueOf(right);
    }
}
