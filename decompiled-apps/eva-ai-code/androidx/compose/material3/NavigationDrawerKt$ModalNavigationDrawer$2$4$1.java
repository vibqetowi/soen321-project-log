package androidx.compose.material3;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NavigationDrawer.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavigationDrawerKt$ModalNavigationDrawer$2$4$1 extends Lambda implements Function1<Density, IntOffset> {
    final /* synthetic */ DrawerState $drawerState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$ModalNavigationDrawer$2$4$1(DrawerState drawerState) {
        super(1);
        this.$drawerState = drawerState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
        return IntOffset.m5716boximpl(m1899invokeBjo55l4(density));
    }

    /* renamed from: invoke-Bjo55l4  reason: not valid java name */
    public final long m1899invokeBjo55l4(Density offset) {
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        return IntOffsetKt.IntOffset(MathKt.roundToInt(this.$drawerState.getOffset().getValue().floatValue()), 0);
    }
}
