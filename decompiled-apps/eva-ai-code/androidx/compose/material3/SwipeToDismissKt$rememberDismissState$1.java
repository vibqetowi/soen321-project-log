package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: SwipeToDismiss.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SwipeToDismissKt$rememberDismissState$1 extends Lambda implements Function1<DismissValue, Boolean> {
    public static final SwipeToDismissKt$rememberDismissState$1 INSTANCE = new SwipeToDismissKt$rememberDismissState$1();

    SwipeToDismissKt$rememberDismissState$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(DismissValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }
}
