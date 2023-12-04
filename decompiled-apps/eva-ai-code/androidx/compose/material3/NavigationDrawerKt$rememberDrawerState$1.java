package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: NavigationDrawer.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class NavigationDrawerKt$rememberDrawerState$1 extends Lambda implements Function1<DrawerValue, Boolean> {
    public static final NavigationDrawerKt$rememberDrawerState$1 INSTANCE = new NavigationDrawerKt$rememberDrawerState$1();

    NavigationDrawerKt$rememberDrawerState$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(DrawerValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }
}
