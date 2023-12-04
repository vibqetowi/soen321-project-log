package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppBar.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppBarKt$TwoRowsTopAppBar$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2<Composer, Integer, Unit> $actionsRow;
    final /* synthetic */ float $bottomTitleAlpha;
    final /* synthetic */ TopAppBarColors $colors;
    final /* synthetic */ boolean $hideBottomRowSemantics;
    final /* synthetic */ boolean $hideTopRowSemantics;
    final /* synthetic */ Ref.FloatRef $maxHeightPx;
    final /* synthetic */ Function2<Composer, Integer, Unit> $navigationIcon;
    final /* synthetic */ Ref.FloatRef $pinnedHeightPx;
    final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
    final /* synthetic */ Function2<Composer, Integer, Unit> $smallTitle;
    final /* synthetic */ TextStyle $smallTitleTextStyle;
    final /* synthetic */ Function2<Composer, Integer, Unit> $title;
    final /* synthetic */ Ref.IntRef $titleBottomPaddingPx;
    final /* synthetic */ TextStyle $titleTextStyle;
    final /* synthetic */ float $topTitleAlpha;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppBarKt$TwoRowsTopAppBar$3(WindowInsets windowInsets, Ref.FloatRef floatRef, TopAppBarColors topAppBarColors, Function2<? super Composer, ? super Integer, Unit> function2, TextStyle textStyle, float f, boolean z, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, int i, Ref.FloatRef floatRef2, TopAppBarScrollBehavior topAppBarScrollBehavior, Function2<? super Composer, ? super Integer, Unit> function24, TextStyle textStyle2, float f2, Ref.IntRef intRef, boolean z2) {
        super(2);
        this.$windowInsets = windowInsets;
        this.$pinnedHeightPx = floatRef;
        this.$colors = topAppBarColors;
        this.$smallTitle = function2;
        this.$smallTitleTextStyle = textStyle;
        this.$topTitleAlpha = f;
        this.$hideTopRowSemantics = z;
        this.$navigationIcon = function22;
        this.$actionsRow = function23;
        this.$$dirty = i;
        this.$maxHeightPx = floatRef2;
        this.$scrollBehavior = topAppBarScrollBehavior;
        this.$title = function24;
        this.$titleTextStyle = textStyle2;
        this.$bottomTitleAlpha = f2;
        this.$titleBottomPaddingPx = intRef;
        this.$hideBottomRowSemantics = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        TopAppBarState state;
        ComposerKt.sourceInformation(composer, "C1204@54309L2201:AppBar.kt#uh7d8r");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1985938853, i, -1, "androidx.compose.material3.TwoRowsTopAppBar.<anonymous> (AppBar.kt:1203)");
            }
            WindowInsets windowInsets = this.$windowInsets;
            Ref.FloatRef floatRef = this.$pinnedHeightPx;
            TopAppBarColors topAppBarColors = this.$colors;
            Function2<Composer, Integer, Unit> function2 = this.$smallTitle;
            TextStyle textStyle = this.$smallTitleTextStyle;
            float f = this.$topTitleAlpha;
            boolean z = this.$hideTopRowSemantics;
            Function2<Composer, Integer, Unit> function22 = this.$navigationIcon;
            Function2<Composer, Integer, Unit> function23 = this.$actionsRow;
            int i2 = this.$$dirty;
            Ref.FloatRef floatRef2 = this.$maxHeightPx;
            TopAppBarScrollBehavior topAppBarScrollBehavior = this.$scrollBehavior;
            Function2<Composer, Integer, Unit> function24 = this.$title;
            TextStyle textStyle2 = this.$titleTextStyle;
            float f2 = this.$bottomTitleAlpha;
            Ref.IntRef intRef = this.$titleBottomPaddingPx;
            boolean z2 = this.$hideBottomRowSemantics;
            composer.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(composer, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            composer.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(composer);
            Density density = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(composer);
            LayoutDirection layoutDirection = (LayoutDirection) consume2;
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(composer);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(Modifier.Companion);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            composer.disableReusing();
            Composer m2893constructorimpl = Updater.m2893constructorimpl(composer);
            Updater.m2900setimpl(m2893constructorimpl, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            composer.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer, 276693704, "C79@4027L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1863905175, "C1205@54330L982,1226@55325L1175:AppBar.kt#uh7d8r");
            int i3 = i2 << 3;
            AppBarKt.m1572TopAppBarLayoutkXwM9vE(ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(Modifier.Companion, windowInsets)), floatRef.element, topAppBarColors.m2263getNavigationIconContentColor0d7_KjU$material3_release(), topAppBarColors.m2264getTitleContentColor0d7_KjU$material3_release(), topAppBarColors.m2262getActionIconContentColor0d7_KjU$material3_release(), function2, textStyle, f, Arrangement.INSTANCE.getCenter(), Arrangement.INSTANCE.getStart(), 0, z, function22, function23, composer, (i3 & 458752) | 905969664 | (i3 & 3670016), ((i2 >> 12) & 896) | 3078);
            Modifier clipToBounds = ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(Modifier.Companion, WindowInsetsKt.m821onlybOOhFvg(windowInsets, WindowInsetsSides.Companion.m841getHorizontalJoeWqyM())));
            float f3 = floatRef2.element - floatRef.element;
            float heightOffset = (topAppBarScrollBehavior == null || (state = topAppBarScrollBehavior.getState()) == null) ? 0.0f : state.getHeightOffset();
            int i4 = i2 << 12;
            AppBarKt.m1572TopAppBarLayoutkXwM9vE(clipToBounds, f3 + heightOffset, topAppBarColors.m2263getNavigationIconContentColor0d7_KjU$material3_release(), topAppBarColors.m2264getTitleContentColor0d7_KjU$material3_release(), topAppBarColors.m2262getActionIconContentColor0d7_KjU$material3_release(), function24, textStyle2, f2, Arrangement.INSTANCE.getBottom(), Arrangement.INSTANCE.getStart(), intRef.element, z2, ComposableSingletons$AppBarKt.INSTANCE.m1695getLambda11$material3_release(), ComposableSingletons$AppBarKt.INSTANCE.m1696getLambda12$material3_release(), composer, (i4 & 458752) | 905969664 | (i4 & 3670016), 3456);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
