package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutIdKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NavigationBar.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavigationBarKt$NavigationBarItem$3$indicator$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ State<Float> $animationProgress$delegate;
    final /* synthetic */ NavigationBarItemColors $colors;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationBarKt$NavigationBarItem$3$indicator$1(NavigationBarItemColors navigationBarItemColors, State<Float> state) {
        super(2);
        this.$colors = navigationBarItemColors;
        this.$animationProgress$delegate = state;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        float NavigationBarItem$lambda$9$lambda$6;
        ComposerKt.sourceInformation(composer, "C243@10941L9,238@10666L321:NavigationBar.kt#uh7d8r");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-474426875, i, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:237)");
            }
            Modifier layoutId = LayoutIdKt.layoutId(Modifier.Companion, "indicator");
            long m1881getIndicatorColor0d7_KjU$material3_release = this.$colors.m1881getIndicatorColor0d7_KjU$material3_release();
            NavigationBarItem$lambda$9$lambda$6 = NavigationBarKt.NavigationBarItem$lambda$9$lambda$6(this.$animationProgress$delegate);
            BoxKt.Box(BackgroundKt.m420backgroundbw27NRU(layoutId, Color.m3290copywmQWz5c$default(m1881getIndicatorColor0d7_KjU$material3_release, NavigationBarItem$lambda$9$lambda$6, 0.0f, 0.0f, 0.0f, 14, null), ShapesKt.toShape(NavigationBarTokens.INSTANCE.getActiveIndicatorShape(), composer, 6)), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
