package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NavigationDrawer.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavigationDrawerKt$ModalNavigationDrawer$2$3$1 extends Lambda implements Function0<Float> {
    final /* synthetic */ DrawerState $drawerState;
    final /* synthetic */ float $maxValue;
    final /* synthetic */ float $minValue;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$ModalNavigationDrawer$2$3$1(float f, float f2, DrawerState drawerState) {
        super(0);
        this.$minValue = f;
        this.$maxValue = f2;
        this.$drawerState = drawerState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        float calculateFraction;
        calculateFraction = NavigationDrawerKt.calculateFraction(this.$minValue, this.$maxValue, this.$drawerState.getOffset().getValue().floatValue());
        return Float.valueOf(calculateFraction);
    }
}
