package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ModalBottomSheet.android.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ModalBottomSheet_androidKt$rememberModalBottomSheetState$1 extends Lambda implements Function1<SheetValue, Boolean> {
    public static final ModalBottomSheet_androidKt$rememberModalBottomSheetState$1 INSTANCE = new ModalBottomSheet_androidKt$rememberModalBottomSheetState$1();

    ModalBottomSheet_androidKt$rememberModalBottomSheetState$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(SheetValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }
}
