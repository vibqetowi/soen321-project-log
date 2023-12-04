package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: AnchoredDraggable.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AnchoredDraggableKt$rememberAnchoredDraggableState$1 extends Lambda implements Function1<T, Boolean> {
    public static final AnchoredDraggableKt$rememberAnchoredDraggableState$1 INSTANCE = new AnchoredDraggableKt$rememberAnchoredDraggableState$1();

    AnchoredDraggableKt$rememberAnchoredDraggableState$1() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(T it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
        return invoke((AnchoredDraggableKt$rememberAnchoredDraggableState$1) obj);
    }
}
