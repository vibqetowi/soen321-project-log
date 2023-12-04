package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BackdropScaffold.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BackdropScaffoldKt$BackdropScaffold$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ Function2<Composer, Integer, Unit> $backLayer;
    final /* synthetic */ Function1<Constraints, Constraints> $calculateBackLayerConstraints;
    final /* synthetic */ long $frontLayerBackgroundColor;
    final /* synthetic */ Function2<Composer, Integer, Unit> $frontLayerContent;
    final /* synthetic */ long $frontLayerContentColor;
    final /* synthetic */ float $frontLayerElevation;
    final /* synthetic */ long $frontLayerScrimColor;
    final /* synthetic */ Shape $frontLayerShape;
    final /* synthetic */ boolean $gesturesEnabled;
    final /* synthetic */ float $headerHeight;
    final /* synthetic */ float $headerHeightPx;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ float $peekHeight;
    final /* synthetic */ float $peekHeightPx;
    final /* synthetic */ BackdropScaffoldState $scaffoldState;
    final /* synthetic */ Function3<SnackbarHostState, Composer, Integer, Unit> $snackbarHost;
    final /* synthetic */ boolean $stickyFrontLayer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BackdropScaffoldKt$BackdropScaffold$1(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function1<? super Constraints, Constraints> function1, float f, boolean z, boolean z2, BackdropScaffoldState backdropScaffoldState, float f2, int i, Shape shape, long j, long j2, float f3, int i2, float f4, float f5, Function2<? super Composer, ? super Integer, Unit> function22, long j3, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3) {
        super(2);
        this.$modifier = modifier;
        this.$backLayer = function2;
        this.$calculateBackLayerConstraints = function1;
        this.$headerHeightPx = f;
        this.$stickyFrontLayer = z;
        this.$gesturesEnabled = z2;
        this.$scaffoldState = backdropScaffoldState;
        this.$peekHeightPx = f2;
        this.$$dirty = i;
        this.$frontLayerShape = shape;
        this.$frontLayerBackgroundColor = j;
        this.$frontLayerContentColor = j2;
        this.$frontLayerElevation = f3;
        this.$$dirty1 = i2;
        this.$headerHeight = f4;
        this.$peekHeight = f5;
        this.$frontLayerContent = function22;
        this.$frontLayerScrimColor = j3;
        this.$snackbarHost = function3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C297@13395L24,298@13428L3119:BackdropScaffold.kt#jmzs0o");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1049909631, i, -1, "androidx.compose.material.BackdropScaffold.<anonymous> (BackdropScaffold.kt:296)");
            }
            composer.startReplaceableGroup(773894976);
            ComposerKt.sourceInformation(composer, "CC(rememberCoroutineScope)488@20446L144:Effects.kt#9igjgp");
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            composer.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            composer.endReplaceableGroup();
            BackdropScaffoldKt.BackdropStack(SizeKt.fillMaxSize$default(this.$modifier, 0.0f, 1, null), this.$backLayer, this.$calculateBackLayerConstraints, ComposableLambdaKt.composableLambda(composer, 1800047509, true, new AnonymousClass1(this.$headerHeightPx, this.$stickyFrontLayer, this.$gesturesEnabled, this.$scaffoldState, this.$peekHeightPx, this.$$dirty, this.$frontLayerShape, this.$frontLayerBackgroundColor, this.$frontLayerContentColor, this.$frontLayerElevation, this.$$dirty1, this.$headerHeight, coroutineScope, this.$peekHeight, this.$frontLayerContent, this.$frontLayerScrimColor, this.$snackbarHost)), composer, 3120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BackdropScaffold.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "constraints", "Landroidx/compose/ui/unit/Constraints;", "backLayerHeight", "", "invoke-jYbf7pk", "(JFLandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function4<Constraints, Float, Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ int $$dirty1;
        final /* synthetic */ long $frontLayerBackgroundColor;
        final /* synthetic */ Function2<Composer, Integer, Unit> $frontLayerContent;
        final /* synthetic */ long $frontLayerContentColor;
        final /* synthetic */ float $frontLayerElevation;
        final /* synthetic */ long $frontLayerScrimColor;
        final /* synthetic */ Shape $frontLayerShape;
        final /* synthetic */ boolean $gesturesEnabled;
        final /* synthetic */ float $headerHeight;
        final /* synthetic */ float $headerHeightPx;
        final /* synthetic */ float $peekHeight;
        final /* synthetic */ float $peekHeightPx;
        final /* synthetic */ BackdropScaffoldState $scaffoldState;
        final /* synthetic */ CoroutineScope $scope;
        final /* synthetic */ Function3<SnackbarHostState, Composer, Integer, Unit> $snackbarHost;
        final /* synthetic */ boolean $stickyFrontLayer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(float f, boolean z, boolean z2, BackdropScaffoldState backdropScaffoldState, float f2, int i, Shape shape, long j, long j2, float f3, int i2, float f4, CoroutineScope coroutineScope, float f5, Function2<? super Composer, ? super Integer, Unit> function2, long j3, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3) {
            super(4);
            this.$headerHeightPx = f;
            this.$stickyFrontLayer = z;
            this.$gesturesEnabled = z2;
            this.$scaffoldState = backdropScaffoldState;
            this.$peekHeightPx = f2;
            this.$$dirty = i;
            this.$frontLayerShape = shape;
            this.$frontLayerBackgroundColor = j;
            this.$frontLayerContentColor = j2;
            this.$frontLayerElevation = f3;
            this.$$dirty1 = i2;
            this.$headerHeight = f4;
            this.$scope = coroutineScope;
            this.$peekHeight = f5;
            this.$frontLayerContent = function2;
            this.$frontLayerScrimColor = j3;
            this.$snackbarHost = function3;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(Constraints constraints, Float f, Composer composer, Integer num) {
            m1249invokejYbf7pk(constraints.m5557unboximpl(), f.floatValue(), composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:49:0x01e7  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x01f3  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x01f7  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0288  */
        /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
        /* renamed from: invoke-jYbf7pk  reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m1249invokejYbf7pk(long j, float f, Composer composer, int i) {
            int i2;
            Modifier.Companion companion;
            Modifier m1481swipeablepPrIpRY;
            float m5607constructorimpl;
            int currentCompositeKeyHash;
            Composer m2893constructorimpl;
            ComposerKt.sourceInformation(composer, "CP(1:c#ui.unit.Constraints)344@15194L57,342@15132L942,366@16117L420:BackdropScaffold.kt#jmzs0o");
            if ((i & 14) == 0) {
                i2 = (composer.changed(j) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 112) == 0) {
                i2 |= composer.changed(f) ? 32 : 16;
            }
            if ((i2 & 731) != 146 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1800047509, i, -1, "androidx.compose.material.BackdropScaffold.<anonymous>.<anonymous> (BackdropScaffold.kt:302)");
                }
                float m5550getMaxHeightimpl = Constraints.m5550getMaxHeightimpl(j);
                float f2 = m5550getMaxHeightimpl - this.$headerHeightPx;
                if (this.$stickyFrontLayer) {
                    f2 = Math.min(f2, f);
                }
                float f3 = f2;
                if (this.$gesturesEnabled) {
                    companion = NestedScrollModifierKt.nestedScroll$default(Modifier.Companion, this.$scaffoldState.getNestedScrollConnection$material_release(), null, 2, null);
                } else {
                    companion = Modifier.Companion;
                }
                m1481swipeablepPrIpRY = SwipeableKt.m1481swipeablepPrIpRY(Modifier.Companion.then(companion), this.$scaffoldState, r18, Orientation.Vertical, (r26 & 8) != 0 ? true : this.$gesturesEnabled, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? SwipeableKt$swipeable$1.INSTANCE : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, MapsKt.mapOf(TuplesKt.to(Float.valueOf(this.$peekHeightPx), BackdropValue.Concealed), TuplesKt.to(Float.valueOf(f3), BackdropValue.Revealed)).keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1480getVelocityThresholdD9Ej5fM() : 0.0f);
                Modifier semantics$default = SemanticsModifierKt.semantics$default(m1481swipeablepPrIpRY, false, new BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1(this.$scaffoldState, this.$scope), 1, null);
                Modifier.Companion companion2 = Modifier.Companion;
                BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
                composer.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
                boolean changed = composer.changed(backdropScaffoldState);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = (Function1) new BackdropScaffoldKt$BackdropScaffold$1$1$1$1(backdropScaffoldState);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                Modifier then = OffsetKt.offset(companion2, (Function1) rememberedValue).then(semantics$default);
                Shape shape = this.$frontLayerShape;
                long j2 = this.$frontLayerBackgroundColor;
                long j3 = this.$frontLayerContentColor;
                float f4 = this.$frontLayerElevation;
                ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -1065299503, true, new AnonymousClass2(this.$peekHeight, this.$frontLayerContent, this.$$dirty, this.$frontLayerScrimColor, this.$scaffoldState, this.$$dirty1, this.$gesturesEnabled, this.$scope));
                int i3 = this.$$dirty1;
                SurfaceKt.m1471SurfaceFjzlyU(then, shape, j2, j3, null, f4, composableLambda, composer, ((i3 >> 3) & 112) | 1572864 | ((i3 >> 6) & 896) | ((i3 >> 6) & 7168) | ((i3 << 6) & 458752), 16);
                Modifier.Companion companion3 = Modifier.Companion;
                if (this.$scaffoldState.isRevealed()) {
                    if (f3 == m5550getMaxHeightimpl - this.$headerHeightPx) {
                        m5607constructorimpl = this.$headerHeight;
                        Modifier m752paddingqDBjuR0$default = PaddingKt.m752paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, m5607constructorimpl, 7, null);
                        Alignment bottomCenter = Alignment.Companion.getBottomCenter();
                        Function3<SnackbarHostState, Composer, Integer, Unit> function3 = this.$snackbarHost;
                        BackdropScaffoldState backdropScaffoldState2 = this.$scaffoldState;
                        int i4 = this.$$dirty1;
                        composer.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composer, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer, 6);
                        composer.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m752paddingqDBjuR0$default);
                        if (!(composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (!composer.getInserting()) {
                            composer.createNode(constructor);
                        } else {
                            composer.useNode();
                        }
                        m2893constructorimpl = Updater.m2893constructorimpl(composer);
                        Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (!m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
                        composer.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composer, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer, 1395535663, "C375@16478L45:BackdropScaffold.kt#jmzs0o");
                        function3.invoke(backdropScaffoldState2.getSnackbarHostState(), composer, Integer.valueOf((i4 >> 18) & 112));
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        composer.endReplaceableGroup();
                        composer.endNode();
                        composer.endReplaceableGroup();
                        composer.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            return;
                        }
                        ComposerKt.traceEventEnd();
                        return;
                    }
                }
                m5607constructorimpl = Dp.m5607constructorimpl(0);
                Modifier m752paddingqDBjuR0$default2 = PaddingKt.m752paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, m5607constructorimpl, 7, null);
                Alignment bottomCenter2 = Alignment.Companion.getBottomCenter();
                Function3<SnackbarHostState, Composer, Integer, Unit> function32 = this.$snackbarHost;
                BackdropScaffoldState backdropScaffoldState22 = this.$scaffoldState;
                int i42 = this.$$dirty1;
                composer.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(composer, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(bottomCenter2, false, composer, 6);
                composer.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m752paddingqDBjuR0$default2);
                if (!(composer.getApplier() instanceof Applier)) {
                }
                composer.startReusableNode();
                if (!composer.getInserting()) {
                }
                m2893constructorimpl = Updater.m2893constructorimpl(composer);
                Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (!m2893constructorimpl.getInserting()) {
                }
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composer, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, 1395535663, "C375@16478L45:BackdropScaffold.kt#jmzs0o");
                function32.invoke(backdropScaffoldState22.getSnackbarHostState(), composer, Integer.valueOf((i42 >> 18) & 112));
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
            } else {
                composer.skipToGroupEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BackdropScaffold.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ int $$dirty1;
            final /* synthetic */ Function2<Composer, Integer, Unit> $frontLayerContent;
            final /* synthetic */ long $frontLayerScrimColor;
            final /* synthetic */ boolean $gesturesEnabled;
            final /* synthetic */ float $peekHeight;
            final /* synthetic */ BackdropScaffoldState $scaffoldState;
            final /* synthetic */ CoroutineScope $scope;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(float f, Function2<? super Composer, ? super Integer, Unit> function2, int i, long j, BackdropScaffoldState backdropScaffoldState, int i2, boolean z, CoroutineScope coroutineScope) {
                super(2);
                this.$peekHeight = f;
                this.$frontLayerContent = function2;
                this.$$dirty = i;
                this.$frontLayerScrimColor = j;
                this.$scaffoldState = backdropScaffoldState;
                this.$$dirty1 = i2;
                this.$gesturesEnabled = z;
                this.$scope = coroutineScope;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                ComposerKt.sourceInformation(composer, "C351@15517L543:BackdropScaffold.kt#jmzs0o");
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1065299503, i, -1, "androidx.compose.material.BackdropScaffold.<anonymous>.<anonymous>.<anonymous> (BackdropScaffold.kt:350)");
                    }
                    Modifier m752paddingqDBjuR0$default = PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, this.$peekHeight, 7, null);
                    Function2<Composer, Integer, Unit> function2 = this.$frontLayerContent;
                    int i2 = this.$$dirty;
                    long j = this.$frontLayerScrimColor;
                    BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
                    int i3 = this.$$dirty1;
                    boolean z = this.$gesturesEnabled;
                    CoroutineScope coroutineScope = this.$scope;
                    composer.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composer, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
                    composer.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m752paddingqDBjuR0$default);
                    if (!(composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    Composer m2893constructorimpl = Updater.m2893constructorimpl(composer);
                    Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
                    composer.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer, 967343184, "C352@15582L19,353@15622L420:BackdropScaffold.kt#jmzs0o");
                    function2.invoke(composer, Integer.valueOf((i2 >> 6) & 14));
                    BackdropScaffoldKt.m1247Scrim3JVO9M(j, new BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1(z, backdropScaffoldState, coroutineScope), backdropScaffoldState.getTargetValue() == BackdropValue.Revealed, composer, (i3 >> 18) & 14);
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
    }
}
