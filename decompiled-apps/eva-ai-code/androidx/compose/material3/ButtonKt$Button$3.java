package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Button.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ButtonKt$Button$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ PaddingValues $contentPadding;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ButtonKt$Button$3(long j, PaddingValues paddingValues, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, int i) {
        super(2);
        this.$contentColor = j;
        this.$contentPadding = paddingValues;
        this.$content = function3;
        this.$$dirty = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Button.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.ButtonKt$Button$3$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
        final /* synthetic */ PaddingValues $contentPadding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(PaddingValues paddingValues, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, int i) {
            super(2);
            this.$contentPadding = paddingValues;
            this.$content = function3;
            this.$$dirty = i;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Button.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.material3.ButtonKt$Button$3$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00471 extends Lambda implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
            final /* synthetic */ PaddingValues $contentPadding;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00471(PaddingValues paddingValues, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, int i) {
                super(2);
                this.$contentPadding = paddingValues;
                this.$content = function3;
                this.$$dirty = i;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                ComposerKt.sourceInformation(composer, "C134@6743L467:Button.kt#uh7d8r");
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2136309793, i, -1, "androidx.compose.material3.Button.<anonymous>.<anonymous>.<anonymous> (Button.kt:133)");
                    }
                    Modifier padding = PaddingKt.padding(SizeKt.m779defaultMinSizeVpY3zN4(Modifier.Companion, ButtonDefaults.INSTANCE.m1604getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m1603getMinHeightD9Ej5fM()), this.$contentPadding);
                    Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                    Function3<RowScope, Composer, Integer, Unit> function3 = this.$content;
                    int i2 = ((this.$$dirty >> 18) & 7168) | 432;
                    composer.startReplaceableGroup(693286680);
                    ComposerKt.sourceInformation(composer, "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo");
                    int i3 = i2 >> 3;
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), centerVertically, composer, (i3 & 112) | (i3 & 14));
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
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(padding);
                    int i4 = ((((i2 << 3) & 112) << 9) & 7168) | 6;
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
                    Updater.m2900setimpl(m2893constructorimpl, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m2900setimpl(m2893constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
                    Updater.m2900setimpl(m2893constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
                    Updater.m2900setimpl(m2893constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
                    composer.enableReusing();
                    materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, Integer.valueOf((i4 >> 3) & 112));
                    composer.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer, -326682283, "C80@4021L9:Row.kt#2w3rfo");
                    function3.invoke(RowScopeInstance.INSTANCE, composer, Integer.valueOf(((i2 >> 6) & 112) | 6));
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

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C133@6702L10,133@6663L561:Button.kt#uh7d8r");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1582292974, i, -1, "androidx.compose.material3.Button.<anonymous>.<anonymous> (Button.kt:132)");
                }
                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer, 6).getLabelLarge(), ComposableLambdaKt.composableLambda(composer, -2136309793, true, new C00471(this.$contentPadding, this.$content, this.$$dirty)), composer, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C132@6583L651:Button.kt#uh7d8r");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(956488494, i, -1, "androidx.compose.material3.Button.<anonymous> (Button.kt:131)");
            }
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(this.$contentColor))}, ComposableLambdaKt.composableLambda(composer, 1582292974, true, new AnonymousClass1(this.$contentPadding, this.$content, this.$$dirty)), composer, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
