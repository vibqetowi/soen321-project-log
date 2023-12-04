package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Drawer.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class DrawerKt$rememberBottomDrawerState$1 extends Lambda implements Function1<BottomDrawerValue, Boolean> {
    public static final DrawerKt$rememberBottomDrawerState$1 INSTANCE = new DrawerKt$rememberBottomDrawerState$1();

    DrawerKt$rememberBottomDrawerState$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(BottomDrawerValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }
}
