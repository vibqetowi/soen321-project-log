package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NavigationRail.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavigationRailKt$NavigationRailItem$2$indicator$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ State<Float> $animationProgress$delegate;
    final /* synthetic */ NavigationRailItemColors $colors;
    final /* synthetic */ Shape $indicatorShape;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$NavigationRailItem$2$indicator$1(NavigationRailItemColors navigationRailItemColors, int i, Shape shape, State<Float> state) {
        super(2);
        this.$colors = navigationRailItemColors;
        this.$$dirty = i;
        this.$indicatorShape = shape;
        this.$animationProgress$delegate = state;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        float NavigationRailItem$lambda$5$lambda$2;
        ComposerKt.sourceInformation(composer, "C243@10775L14,239@10621L284:NavigationRail.kt#uh7d8r");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1862011490, i, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:238)");
            }
            Modifier layoutId = LayoutIdKt.layoutId(Modifier.Companion, "indicator");
            long indicatorColor = this.$colors.getIndicatorColor(composer, (this.$$dirty >> 21) & 14);
            NavigationRailItem$lambda$5$lambda$2 = NavigationRailKt.NavigationRailItem$lambda$5$lambda$2(this.$animationProgress$delegate);
            BoxKt.Box(BackgroundKt.m420backgroundbw27NRU(layoutId, Color.m3290copywmQWz5c$default(indicatorColor, NavigationRailItem$lambda$5$lambda$2, 0.0f, 0.0f, 0.0f, 14, null), this.$indicatorShape), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
