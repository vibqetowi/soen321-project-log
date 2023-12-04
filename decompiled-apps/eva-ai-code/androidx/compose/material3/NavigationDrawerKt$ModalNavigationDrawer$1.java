package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: NavigationDrawer.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class NavigationDrawerKt$ModalNavigationDrawer$1 extends Lambda implements Function2<DrawerValue, DrawerValue, ThresholdConfig> {
    public static final NavigationDrawerKt$ModalNavigationDrawer$1 INSTANCE = new NavigationDrawerKt$ModalNavigationDrawer$1();

    NavigationDrawerKt$ModalNavigationDrawer$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final ThresholdConfig invoke(DrawerValue drawerValue, DrawerValue drawerValue2) {
        Intrinsics.checkNotNullParameter(drawerValue, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(drawerValue2, "<anonymous parameter 1>");
        return new FractionalThreshold(0.5f);
    }
}
