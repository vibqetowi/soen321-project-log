package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: BottomSheetScaffold.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BottomSheetScaffoldKt$rememberBottomSheetState$1 extends Lambda implements Function1<BottomSheetValue, Boolean> {
    public static final BottomSheetScaffoldKt$rememberBottomSheetState$1 INSTANCE = new BottomSheetScaffoldKt$rememberBottomSheetState$1();

    BottomSheetScaffoldKt$rememberBottomSheetState$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(BottomSheetValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }
}
