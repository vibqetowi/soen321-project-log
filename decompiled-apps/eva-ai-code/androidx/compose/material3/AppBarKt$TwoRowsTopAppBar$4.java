package androidx.compose.material3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppBar.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppBarKt$TwoRowsTopAppBar$4 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $actions;
    final /* synthetic */ TopAppBarColors $colors;
    final /* synthetic */ float $maxHeight;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function2<Composer, Integer, Unit> $navigationIcon;
    final /* synthetic */ float $pinnedHeight;
    final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
    final /* synthetic */ Function2<Composer, Integer, Unit> $smallTitle;
    final /* synthetic */ TextStyle $smallTitleTextStyle;
    final /* synthetic */ Function2<Composer, Integer, Unit> $title;
    final /* synthetic */ float $titleBottomPadding;
    final /* synthetic */ TextStyle $titleTextStyle;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppBarKt$TwoRowsTopAppBar$4(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, TextStyle textStyle, float f, Function2<? super Composer, ? super Integer, Unit> function22, TextStyle textStyle2, Function2<? super Composer, ? super Integer, Unit> function23, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, float f2, float f3, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2, int i3) {
        super(2);
        this.$modifier = modifier;
        this.$title = function2;
        this.$titleTextStyle = textStyle;
        this.$titleBottomPadding = f;
        this.$smallTitle = function22;
        this.$smallTitleTextStyle = textStyle2;
        this.$navigationIcon = function23;
        this.$actions = function3;
        this.$windowInsets = windowInsets;
        this.$colors = topAppBarColors;
        this.$maxHeight = f2;
        this.$pinnedHeight = f3;
        this.$scrollBehavior = topAppBarScrollBehavior;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        AppBarKt.m1573TwoRowsTopAppBartjU4iQQ(this.$modifier, this.$title, this.$titleTextStyle, this.$titleBottomPadding, this.$smallTitle, this.$smallTitleTextStyle, this.$navigationIcon, this.$actions, this.$windowInsets, this.$colors, this.$maxHeight, this.$pinnedHeight, this.$scrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
