package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SwipeToDismiss.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwipeToDismissKt$SwipeToDismiss$1 extends Lambda implements Function1<DismissDirection, FixedThreshold> {
    public static final SwipeToDismissKt$SwipeToDismiss$1 INSTANCE = new SwipeToDismissKt$SwipeToDismiss$1();

    SwipeToDismissKt$SwipeToDismiss$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FixedThreshold invoke(DismissDirection it) {
        float f;
        Intrinsics.checkNotNullParameter(it, "it");
        f = SwipeToDismissKt.DISMISS_THRESHOLD;
        return new FixedThreshold(f, null);
    }
}
