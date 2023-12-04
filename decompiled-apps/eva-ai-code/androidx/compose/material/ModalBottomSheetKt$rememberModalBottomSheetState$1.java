package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ModalBottomSheet.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ModalBottomSheetKt$rememberModalBottomSheetState$1 extends Lambda implements Function1<ModalBottomSheetValue, Boolean> {
    public static final ModalBottomSheetKt$rememberModalBottomSheetState$1 INSTANCE = new ModalBottomSheetKt$rememberModalBottomSheetState$1();

    ModalBottomSheetKt$rememberModalBottomSheetState$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(ModalBottomSheetValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }
}
