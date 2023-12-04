package androidx.compose.material3;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ModalBottomSheet.android.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ModalBottomSheet_androidKt$ModalBottomSheet$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ AnchorChangeHandler<SheetValue> $anchorChangeHandler;
    final /* synthetic */ Function0<Unit> $animateToDismiss;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ Function2<Composer, Integer, Unit> $dragHandle;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ long $scrimColor;
    final /* synthetic */ Function1<Float, Unit> $settleToDismiss;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ SheetState $sheetState;
    final /* synthetic */ float $tonalElevation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModalBottomSheet_androidKt$ModalBottomSheet$2(long j, Function0<Unit> function0, SheetState sheetState, int i, Modifier modifier, AnchorChangeHandler<SheetValue> anchorChangeHandler, Function1<? super Float, Unit> function1, Shape shape, long j2, long j3, float f, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i2, CoroutineScope coroutineScope) {
        super(2);
        this.$scrimColor = j;
        this.$animateToDismiss = function0;
        this.$sheetState = sheetState;
        this.$$dirty = i;
        this.$modifier = modifier;
        this.$anchorChangeHandler = anchorChangeHandler;
        this.$settleToDismiss = function1;
        this.$shape = shape;
        this.$containerColor = j2;
        this.$contentColor = j3;
        this.$tonalElevation = f;
        this.$dragHandle = function2;
        this.$content = function3;
        this.$$dirty1 = i2;
        this.$scope = coroutineScope;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ModalBottomSheet.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ int $$dirty1;
        final /* synthetic */ AnchorChangeHandler<SheetValue> $anchorChangeHandler;
        final /* synthetic */ Function0<Unit> $animateToDismiss;
        final /* synthetic */ long $containerColor;
        final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $content;
        final /* synthetic */ long $contentColor;
        final /* synthetic */ Function2<Composer, Integer, Unit> $dragHandle;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ CoroutineScope $scope;
        final /* synthetic */ long $scrimColor;
        final /* synthetic */ Function1<Float, Unit> $settleToDismiss;
        final /* synthetic */ Shape $shape;
        final /* synthetic */ SheetState $sheetState;
        final /* synthetic */ float $tonalElevation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(long j, Function0<Unit> function0, SheetState sheetState, int i, Modifier modifier, AnchorChangeHandler<SheetValue> anchorChangeHandler, Function1<? super Float, Unit> function1, Shape shape, long j2, long j3, float f, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i2, CoroutineScope coroutineScope) {
            super(3);
            this.$scrimColor = j;
            this.$animateToDismiss = function0;
            this.$sheetState = sheetState;
            this.$$dirty = i;
            this.$modifier = modifier;
            this.$anchorChangeHandler = anchorChangeHandler;
            this.$settleToDismiss = function1;
            this.$shape = shape;
            this.$containerColor = j2;
            this.$contentColor = j3;
            this.$tonalElevation = f;
            this.$dragHandle = function2;
            this.$content = function3;
            this.$$dirty1 = i2;
            this.$scope = coroutineScope;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
            invoke(boxWithConstraintsScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i) {
            int i2;
            Modifier modalBottomSheetSwipeable;
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            ComposerKt.sourceInformation(composer, "C179@8226L168,184@8434L48,190@8711L36,191@8776L244,200@9080L348,212@9716L75,185@8495L4059:ModalBottomSheet.android.kt#uh7d8r");
            if ((i & 14) == 0) {
                i2 = (composer.changed(BoxWithConstraints) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i2 & 91) != 18 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(574030426, i, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous>.<anonymous> (ModalBottomSheet.android.kt:177)");
                }
                int m5550getMaxHeightimpl = Constraints.m5550getMaxHeightimpl(BoxWithConstraints.mo685getConstraintsmsEJaDk());
                ModalBottomSheet_androidKt.m1875Scrim3JVO9M(this.$scrimColor, this.$animateToDismiss, this.$sheetState.getTargetValue() != SheetValue.Hidden, composer, (this.$$dirty >> 21) & 14);
                String m2058getStringNWtq28 = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m1998getBottomSheetPaneTitleadMyvUU(), composer, 6);
                Modifier align = BoxWithConstraints.align(SizeKt.fillMaxWidth$default(SizeKt.m802widthInVpY3zN4$default(this.$modifier, 0.0f, SheetDefaultsKt.getBottomSheetMaxWidth(), 1, null), 0.0f, 1, null), Alignment.Companion.getTopCenter());
                composer.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
                boolean changed = composer.changed(m2058getStringNWtq28);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = (Function1) new ModalBottomSheet_androidKt$ModalBottomSheet$2$1$1$1(m2058getStringNWtq28);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                Modifier semantics$default = SemanticsModifierKt.semantics$default(align, false, (Function1) rememberedValue, 1, null);
                SheetState sheetState = this.$sheetState;
                composer.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
                boolean changed2 = composer.changed(sheetState);
                Object rememberedValue2 = composer.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = (Function1) new ModalBottomSheet_androidKt$ModalBottomSheet$2$1$2$1(sheetState);
                    composer.updateRememberedValue(rememberedValue2);
                }
                composer.endReplaceableGroup();
                Modifier offset = OffsetKt.offset(semantics$default, (Function1) rememberedValue2);
                SheetState sheetState2 = this.$sheetState;
                Function1<Float, Unit> function1 = this.$settleToDismiss;
                composer.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
                boolean changed3 = composer.changed(sheetState2);
                Object rememberedValue3 = composer.rememberedValue();
                if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(sheetState2, Orientation.Vertical, function1);
                    composer.updateRememberedValue(rememberedValue3);
                }
                composer.endReplaceableGroup();
                Modifier nestedScroll$default = NestedScrollModifierKt.nestedScroll$default(offset, (NestedScrollConnection) rememberedValue3, null, 2, null);
                SheetState sheetState3 = this.$sheetState;
                AnchorChangeHandler<SheetValue> anchorChangeHandler = this.$anchorChangeHandler;
                float f = m5550getMaxHeightimpl;
                Function1<Float, Unit> function12 = this.$settleToDismiss;
                composer.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
                boolean changed4 = composer.changed(function12);
                Object rememberedValue4 = composer.rememberedValue();
                if (changed4 || rememberedValue4 == Composer.Companion.getEmpty()) {
                    rememberedValue4 = (Function2) new ModalBottomSheet_androidKt$ModalBottomSheet$2$1$4$1(function12);
                    composer.updateRememberedValue(rememberedValue4);
                }
                composer.endReplaceableGroup();
                modalBottomSheetSwipeable = ModalBottomSheet_androidKt.modalBottomSheetSwipeable(nestedScroll$default, sheetState3, anchorChangeHandler, f, (Function2) rememberedValue4);
                Shape shape = this.$shape;
                long j = this.$containerColor;
                long j2 = this.$contentColor;
                float f2 = this.$tonalElevation;
                ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, 1371274015, true, new AnonymousClass5(this.$dragHandle, this.$content, this.$$dirty1, this.$sheetState, this.$animateToDismiss, this.$scope, this.$$dirty));
                int i3 = this.$$dirty;
                SurfaceKt.m2067SurfaceT9BRK9s(modalBottomSheetSwipeable, shape, j, j2, f2, 0.0f, null, composableLambda, composer, ((i3 >> 6) & 112) | 12582912 | ((i3 >> 6) & 896) | ((i3 >> 6) & 7168) | ((i3 >> 6) & 57344), 96);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ModalBottomSheet.android.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2$1$5  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass5 extends Lambda implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ int $$dirty1;
            final /* synthetic */ Function0<Unit> $animateToDismiss;
            final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $content;
            final /* synthetic */ Function2<Composer, Integer, Unit> $dragHandle;
            final /* synthetic */ CoroutineScope $scope;
            final /* synthetic */ SheetState $sheetState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass5(Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i, SheetState sheetState, Function0<Unit> function0, CoroutineScope coroutineScope, int i2) {
                super(2);
                this.$dragHandle = function2;
                this.$content = function3;
                this.$$dirty1 = i;
                this.$sheetState = sheetState;
                this.$animateToDismiss = function0;
                this.$scope = coroutineScope;
                this.$$dirty = i2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                ColumnScopeInstance columnScopeInstance;
                ComposerKt.sourceInformation(composer, "C221@10013L2527:ModalBottomSheet.android.kt#uh7d8r");
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1371274015, i, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous>.<anonymous>.<anonymous> (ModalBottomSheet.android.kt:220)");
                    }
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                    Function2<Composer, Integer, Unit> function2 = this.$dragHandle;
                    Function3<ColumnScope, Composer, Integer, Unit> function3 = this.$content;
                    int i2 = this.$$dirty1;
                    SheetState sheetState = this.$sheetState;
                    Function0<Unit> function0 = this.$animateToDismiss;
                    CoroutineScope coroutineScope = this.$scope;
                    int i3 = this.$$dirty;
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
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(fillMaxWidth$default);
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
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer, -11289811, "C263@12513L9:ModalBottomSheet.android.kt#uh7d8r");
                    composer.startReplaceableGroup(-11289811);
                    ComposerKt.sourceInformation(composer, "224@10171L54,225@10275L48,226@10372L47,227@10444L2026");
                    if (function2 != null) {
                        String m2058getStringNWtq28 = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m1999getBottomSheetPartialExpandDescriptionadMyvUU(), composer, 6);
                        columnScopeInstance = columnScopeInstance2;
                        Modifier semantics = SemanticsModifierKt.semantics(columnScopeInstance2.align(Modifier.Companion, Alignment.Companion.getCenterHorizontally()), true, new ModalBottomSheet_androidKt$ModalBottomSheet$2$1$5$1$1(sheetState, Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m1995getBottomSheetDismissDescriptionadMyvUU(), composer, 6), Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m1997getBottomSheetExpandDescriptionadMyvUU(), composer, 6), m2058getStringNWtq28, function0, coroutineScope));
                        composer.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composer, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
                        composer.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume4 = composer.consume(CompositionLocalsKt.getLocalDensity());
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        Density density2 = (Density) consume4;
                        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume5 = composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
                        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume6 = composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(semantics);
                        if (!(composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor2);
                        } else {
                            composer.useNode();
                        }
                        composer.disableReusing();
                        Composer m2893constructorimpl2 = Updater.m2893constructorimpl(composer);
                        Updater.m2900setimpl(m2893constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m2900setimpl(m2893constructorimpl2, density2, ComposeUiNode.Companion.getSetDensity());
                        Updater.m2900setimpl(m2893constructorimpl2, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
                        Updater.m2900setimpl(m2893constructorimpl2, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
                        composer.enableReusing();
                        materializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
                        composer.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composer, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer, -1407594613, "C260@12432L12:ModalBottomSheet.android.kt#uh7d8r");
                        function2.invoke(composer, Integer.valueOf((i3 >> 24) & 14));
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        composer.endReplaceableGroup();
                        composer.endNode();
                        composer.endReplaceableGroup();
                        composer.endReplaceableGroup();
                    } else {
                        columnScopeInstance = columnScopeInstance2;
                    }
                    composer.endReplaceableGroup();
                    function3.invoke(columnScopeInstance, composer, Integer.valueOf(((i2 << 3) & 112) | 6));
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

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C177@8118L4446:ModalBottomSheet.android.kt#uh7d8r");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1424497392, i, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.android.kt:176)");
            }
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer, 574030426, true, new AnonymousClass1(this.$scrimColor, this.$animateToDismiss, this.$sheetState, this.$$dirty, this.$modifier, this.$anchorChangeHandler, this.$settleToDismiss, this.$shape, this.$containerColor, this.$contentColor, this.$tonalElevation, this.$dragHandle, this.$content, this.$$dirty1, this.$scope)), composer, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
