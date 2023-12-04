package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.AnchoredDraggableState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ModalBottomSheet.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ModalBottomSheetKt$ModalBottomSheetLayout$2 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ AnchoredDraggableState.AnchorChangedCallback<ModalBottomSheetValue> $anchorChangeCallback;
    final /* synthetic */ Function2<Composer, Integer, Unit> $content;
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ long $scrimColor;
    final /* synthetic */ long $sheetBackgroundColor;
    final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $sheetContent;
    final /* synthetic */ long $sheetContentColor;
    final /* synthetic */ float $sheetElevation;
    final /* synthetic */ boolean $sheetGesturesEnabled;
    final /* synthetic */ Shape $sheetShape;
    final /* synthetic */ ModalBottomSheetState $sheetState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModalBottomSheetKt$ModalBottomSheetLayout$2(boolean z, ModalBottomSheetState modalBottomSheetState, Orientation orientation, Shape shape, long j, long j2, float f, int i, Function2<? super Composer, ? super Integer, Unit> function2, long j3, CoroutineScope coroutineScope, AnchoredDraggableState.AnchorChangedCallback<ModalBottomSheetValue> anchorChangedCallback, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3) {
        super(3);
        this.$sheetGesturesEnabled = z;
        this.$sheetState = modalBottomSheetState;
        this.$orientation = orientation;
        this.$sheetShape = shape;
        this.$sheetBackgroundColor = j;
        this.$sheetContentColor = j2;
        this.$sheetElevation = f;
        this.$$dirty = i;
        this.$content = function2;
        this.$scrimColor = j3;
        this.$scope = coroutineScope;
        this.$anchorChangeCallback = anchorChangedCallback;
        this.$sheetContent = function3;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i) {
        int i2;
        float f;
        Modifier.Companion companion;
        Modifier.Companion companion2;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        ComposerKt.sourceInformation(composer, "C588@24304L430,600@24743L4244:ModalBottomSheet.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (composer.changed(BoxWithConstraints) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1731958854, i, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous> (ModalBottomSheet.kt:586)");
            }
            float m5550getMaxHeightimpl = Constraints.m5550getMaxHeightimpl(BoxWithConstraints.mo685getConstraintsmsEJaDk());
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
            Function2<Composer, Integer, Unit> function2 = this.$content;
            int i3 = this.$$dirty;
            long j = this.$scrimColor;
            ModalBottomSheetState modalBottomSheetState = this.$sheetState;
            CoroutineScope coroutineScope = this.$scope;
            composer.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composer, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxSize$default);
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
            ComposerKt.sourceInformationMarkerStart(composer, -1295116475, "C589@24346L9,590@24368L356:ModalBottomSheet.kt#jmzs0o");
            function2.invoke(composer, Integer.valueOf((i3 >> 27) & 14));
            ModalBottomSheetKt.m1402Scrim3JVO9M(j, new ModalBottomSheetKt$ModalBottomSheetLayout$2$1$1(modalBottomSheetState, coroutineScope), modalBottomSheetState.getAnchoredDraggableState$material_release().getTargetValue() != ModalBottomSheetValue.Hidden, composer, (i3 >> 24) & 14);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            Modifier align = BoxWithConstraints.align(Modifier.Companion, Alignment.Companion.getTopCenter());
            f = ModalBottomSheetKt.MaxModalBottomSheetWidth;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m802widthInVpY3zN4$default(align, 0.0f, f, 1, null), 0.0f, 1, null);
            composer.startReplaceableGroup(1241536180);
            ComposerKt.sourceInformation(composer, "608@25105L354");
            if (this.$sheetGesturesEnabled) {
                Modifier.Companion companion3 = Modifier.Companion;
                Object anchoredDraggableState$material_release = this.$sheetState.getAnchoredDraggableState$material_release();
                Orientation orientation = this.$orientation;
                ModalBottomSheetState modalBottomSheetState2 = this.$sheetState;
                composer.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
                boolean changed = composer.changed(anchoredDraggableState$material_release) | composer.changed(orientation);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = ModalBottomSheetKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(modalBottomSheetState2.getAnchoredDraggableState$material_release(), orientation);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                companion = NestedScrollModifierKt.nestedScroll$default(companion3, (NestedScrollConnection) rememberedValue, null, 2, null);
            } else {
                companion = Modifier.Companion;
            }
            composer.endReplaceableGroup();
            Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(AnchoredDraggableKt.anchoredDraggable$default(OffsetKt.offset(fillMaxWidth$default.then(companion), new AnonymousClass3(this.$sheetState)), this.$sheetState.getAnchoredDraggableState$material_release(), this.$orientation, this.$sheetGesturesEnabled && this.$sheetState.getAnchoredDraggableState$material_release().getCurrentValue() != ModalBottomSheetValue.Hidden, false, null, 24, null), new AnonymousClass4(this.$sheetState, this.$anchorChangeCallback, m5550getMaxHeightimpl));
            if (this.$sheetGesturesEnabled) {
                companion2 = SemanticsModifierKt.semantics$default(Modifier.Companion, false, new AnonymousClass5(this.$sheetState, this.$scope), 1, null);
            } else {
                companion2 = Modifier.Companion;
            }
            int i4 = this.$$dirty;
            SurfaceKt.m1471SurfaceFjzlyU(onSizeChanged.then(companion2), this.$sheetShape, this.$sheetBackgroundColor, this.$sheetContentColor, null, this.$sheetElevation, ComposableLambdaKt.composableLambda(composer, 1552994302, true, new AnonymousClass6(this.$sheetContent, this.$$dirty)), composer, (i4 & 458752) | ((i4 >> 9) & 112) | 1572864 | ((i4 >> 12) & 896) | ((i4 >> 12) & 7168), 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ModalBottomSheet.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntOffset;", "Landroidx/compose/ui/unit/Density;", "invoke-Bjo55l4", "(Landroidx/compose/ui/unit/Density;)J"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends Lambda implements Function1<Density, IntOffset> {
        final /* synthetic */ ModalBottomSheetState $sheetState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(ModalBottomSheetState modalBottomSheetState) {
            super(1);
            this.$sheetState = modalBottomSheetState;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
            return IntOffset.m5716boximpl(m1404invokeBjo55l4(density));
        }

        /* renamed from: invoke-Bjo55l4  reason: not valid java name */
        public final long m1404invokeBjo55l4(Density offset) {
            Intrinsics.checkNotNullParameter(offset, "$this$offset");
            return IntOffsetKt.IntOffset(0, MathKt.roundToInt(this.$sheetState.getAnchoredDraggableState$material_release().requireOffset()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ModalBottomSheet.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "sheetSize", "Landroidx/compose/ui/unit/IntSize;", "invoke-ozmzZPI", "(J)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends Lambda implements Function1<IntSize, Unit> {
        final /* synthetic */ AnchoredDraggableState.AnchorChangedCallback<ModalBottomSheetValue> $anchorChangeCallback;
        final /* synthetic */ float $fullHeight;
        final /* synthetic */ ModalBottomSheetState $sheetState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(ModalBottomSheetState modalBottomSheetState, AnchoredDraggableState.AnchorChangedCallback<ModalBottomSheetValue> anchorChangedCallback, float f) {
            super(1);
            this.$sheetState = modalBottomSheetState;
            this.$anchorChangeCallback = anchorChangedCallback;
            this.$fullHeight = f;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
            m1405invokeozmzZPI(intSize.m5771unboximpl());
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-ozmzZPI  reason: not valid java name */
        public final void m1405invokeozmzZPI(long j) {
            float f = this.$fullHeight;
            ModalBottomSheetState modalBottomSheetState = this.$sheetState;
            Map createMapBuilder = MapsKt.createMapBuilder();
            createMapBuilder.put(ModalBottomSheetValue.Hidden, Float.valueOf(f));
            float f2 = f / 2.0f;
            if (!modalBottomSheetState.isSkipHalfExpanded$material_release() && IntSize.m5766getHeightimpl(j) > f2) {
                createMapBuilder.put(ModalBottomSheetValue.HalfExpanded, Float.valueOf(f2));
            }
            if (IntSize.m5766getHeightimpl(j) != 0) {
                createMapBuilder.put(ModalBottomSheetValue.Expanded, Float.valueOf(Math.max(0.0f, f - IntSize.m5766getHeightimpl(j))));
            }
            this.$sheetState.getAnchoredDraggableState$material_release().updateAnchors$material_release(MapsKt.build(createMapBuilder), this.$anchorChangeCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ModalBottomSheet.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        final /* synthetic */ CoroutineScope $scope;
        final /* synthetic */ ModalBottomSheetState $sheetState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(ModalBottomSheetState modalBottomSheetState, CoroutineScope coroutineScope) {
            super(1);
            this.$sheetState = modalBottomSheetState;
            this.$scope = coroutineScope;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(SemanticsPropertyReceiver semantics) {
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            if (this.$sheetState.isVisible()) {
                SemanticsPropertiesKt.dismiss$default(semantics, null, new AnonymousClass1(this.$sheetState, this.$scope), 1, null);
                if (this.$sheetState.getAnchoredDraggableState$material_release().getCurrentValue() == ModalBottomSheetValue.HalfExpanded) {
                    SemanticsPropertiesKt.expand$default(semantics, null, new AnonymousClass2(this.$sheetState, this.$scope), 1, null);
                } else if (this.$sheetState.getHasHalfExpandedState$material_release()) {
                    SemanticsPropertiesKt.collapse$default(semantics, null, new AnonymousClass3(this.$sheetState, this.$scope), 1, null);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ModalBottomSheet.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$1  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends Lambda implements Function0<Boolean> {
            final /* synthetic */ CoroutineScope $scope;
            final /* synthetic */ ModalBottomSheetState $sheetState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ModalBottomSheetState modalBottomSheetState, CoroutineScope coroutineScope) {
                super(0);
                this.$sheetState = modalBottomSheetState;
                this.$scope = coroutineScope;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                if (this.$sheetState.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
                    BuildersKt__Builders_commonKt.launch$default(this.$scope, null, null, new C00361(this.$sheetState, null), 3, null);
                }
                return true;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: ModalBottomSheet.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$1$1", f = "ModalBottomSheet.kt", i = {}, l = {653}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C00361 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ ModalBottomSheetState $sheetState;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00361(ModalBottomSheetState modalBottomSheetState, Continuation<? super C00361> continuation) {
                    super(2, continuation);
                    this.$sheetState = modalBottomSheetState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C00361(this.$sheetState, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C00361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        if (this.$sheetState.hide(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ModalBottomSheet.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$2  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends Lambda implements Function0<Boolean> {
            final /* synthetic */ CoroutineScope $scope;
            final /* synthetic */ ModalBottomSheetState $sheetState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ModalBottomSheetState modalBottomSheetState, CoroutineScope coroutineScope) {
                super(0);
                this.$sheetState = modalBottomSheetState;
                this.$scope = coroutineScope;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                if (this.$sheetState.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Expanded).booleanValue()) {
                    BuildersKt__Builders_commonKt.launch$default(this.$scope, null, null, new AnonymousClass1(this.$sheetState, null), 3, null);
                }
                return true;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: ModalBottomSheet.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$2$1", f = "ModalBottomSheet.kt", i = {}, l = {665}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$2$1  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ ModalBottomSheetState $sheetState;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$sheetState = modalBottomSheetState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$sheetState, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        if (this.$sheetState.expand$material_release(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ModalBottomSheet.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$3  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass3 extends Lambda implements Function0<Boolean> {
            final /* synthetic */ CoroutineScope $scope;
            final /* synthetic */ ModalBottomSheetState $sheetState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(ModalBottomSheetState modalBottomSheetState, CoroutineScope coroutineScope) {
                super(0);
                this.$sheetState = modalBottomSheetState;
                this.$scope = coroutineScope;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                if (this.$sheetState.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.HalfExpanded).booleanValue()) {
                    BuildersKt__Builders_commonKt.launch$default(this.$scope, null, null, new AnonymousClass1(this.$sheetState, null), 3, null);
                }
                return true;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: ModalBottomSheet.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$3$1", f = "ModalBottomSheet.kt", i = {}, l = {675}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$3$1  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ ModalBottomSheetState $sheetState;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$sheetState = modalBottomSheetState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$sheetState, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        if (this.$sheetState.halfExpand$material_release(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ModalBottomSheet.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$6  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $sheetContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass6(Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i) {
            super(2);
            this.$sheetContent = function3;
            this.$$dirty = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C688@28947L30:ModalBottomSheet.kt#jmzs0o");
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1552994302, i, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous>.<anonymous> (ModalBottomSheet.kt:687)");
            }
            Function3<ColumnScope, Composer, Integer, Unit> function3 = this.$sheetContent;
            int i2 = (this.$$dirty << 9) & 7168;
            composer.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(composer, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
            int i3 = i2 >> 3;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, (i3 & 112) | (i3 & 14));
            composer.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(Modifier.Companion);
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
            Composer m2893constructorimpl = Updater.m2893constructorimpl(composer);
            Updater.m2900setimpl(m2893constructorimpl, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, Integer.valueOf((i4 >> 3) & 112));
            composer.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer, 276693570, "C77@3893L9:Column.kt#2w3rfo");
            function3.invoke(ColumnScopeInstance.INSTANCE, composer, Integer.valueOf(((i2 >> 6) & 112) | 6));
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }
}
