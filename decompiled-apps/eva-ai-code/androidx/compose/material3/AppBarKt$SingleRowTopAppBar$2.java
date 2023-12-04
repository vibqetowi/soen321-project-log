package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material3.tokens.TopAppBarSmallTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppBar.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppBarKt$SingleRowTopAppBar$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2<Composer, Integer, Unit> $actionsRow;
    final /* synthetic */ boolean $centeredTitle;
    final /* synthetic */ TopAppBarColors $colors;
    final /* synthetic */ Function2<Composer, Integer, Unit> $navigationIcon;
    final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
    final /* synthetic */ Function2<Composer, Integer, Unit> $title;
    final /* synthetic */ TextStyle $titleTextStyle;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppBarKt$SingleRowTopAppBar$2(WindowInsets windowInsets, TopAppBarColors topAppBarColors, Function2<? super Composer, ? super Integer, Unit> function2, TextStyle textStyle, boolean z, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, int i, TopAppBarScrollBehavior topAppBarScrollBehavior) {
        super(2);
        this.$windowInsets = windowInsets;
        this.$colors = topAppBarColors;
        this.$title = function2;
        this.$titleTextStyle = textStyle;
        this.$centeredTitle = z;
        this.$navigationIcon = function22;
        this.$actionsRow = function23;
        this.$$dirty = i;
        this.$scrollBehavior = topAppBarScrollBehavior;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        TopAppBarState state;
        ComposerKt.sourceInformation(composer, "C*1087@49625L7,1091@49775L890:AppBar.kt#uh7d8r");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(376925230, i, -1, "androidx.compose.material3.SingleRowTopAppBar.<anonymous> (AppBar.kt:1086)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(composer);
            TopAppBarScrollBehavior topAppBarScrollBehavior = this.$scrollBehavior;
            float heightOffset = ((topAppBarScrollBehavior == null || (state = topAppBarScrollBehavior.getState()) == null) ? 0.0f : state.getHeightOffset()) + ((Density) consume).mo588toPx0680j_4(TopAppBarSmallTokens.INSTANCE.m2781getContainerHeightD9Ej5fM());
            Modifier clipToBounds = ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(Modifier.Companion, this.$windowInsets));
            long m2263getNavigationIconContentColor0d7_KjU$material3_release = this.$colors.m2263getNavigationIconContentColor0d7_KjU$material3_release();
            long m2264getTitleContentColor0d7_KjU$material3_release = this.$colors.m2264getTitleContentColor0d7_KjU$material3_release();
            long m2262getActionIconContentColor0d7_KjU$material3_release = this.$colors.m2262getActionIconContentColor0d7_KjU$material3_release();
            Function2<Composer, Integer, Unit> function2 = this.$title;
            TextStyle textStyle = this.$titleTextStyle;
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Arrangement.Horizontal center2 = this.$centeredTitle ? Arrangement.INSTANCE.getCenter() : Arrangement.INSTANCE.getStart();
            Function2<Composer, Integer, Unit> function22 = this.$navigationIcon;
            Function2<Composer, Integer, Unit> function23 = this.$actionsRow;
            int i2 = this.$$dirty;
            AppBarKt.m1572TopAppBarLayoutkXwM9vE(clipToBounds, heightOffset, m2263getNavigationIconContentColor0d7_KjU$material3_release, m2264getTitleContentColor0d7_KjU$material3_release, m2262getActionIconContentColor0d7_KjU$material3_release, function2, textStyle, 1.0f, center, center2, 0, false, function22, function23, composer, ((i2 << 12) & 458752) | 113246208 | ((i2 << 12) & 3670016), ((i2 >> 6) & 896) | 3126);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
