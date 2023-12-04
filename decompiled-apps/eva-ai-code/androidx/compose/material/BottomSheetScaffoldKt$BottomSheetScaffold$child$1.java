package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BottomSheetScaffold.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt$BottomSheetScaffold$child$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ int $$dirty2;
    final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> $content;
    final /* synthetic */ Function2<Composer, Integer, Unit> $floatingActionButton;
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ float $peekHeightPx;
    final /* synthetic */ BottomSheetScaffoldState $scaffoldState;
    final /* synthetic */ long $sheetBackgroundColor;
    final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $sheetContent;
    final /* synthetic */ long $sheetContentColor;
    final /* synthetic */ float $sheetElevation;
    final /* synthetic */ boolean $sheetGesturesEnabled;
    final /* synthetic */ float $sheetPeekHeight;
    final /* synthetic */ Shape $sheetShape;
    final /* synthetic */ Function3<SnackbarHostState, Composer, Integer, Unit> $snackbarHost;
    final /* synthetic */ Function2<Composer, Integer, Unit> $topBar;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetScaffoldKt$BottomSheetScaffold$child$1(BottomSheetScaffoldState bottomSheetScaffoldState, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function22, float f, int i, int i2, int i3, int i4, boolean z, float f2, Shape shape, float f3, long j, long j2, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function33) {
        super(2);
        this.$scaffoldState = bottomSheetScaffoldState;
        this.$topBar = function2;
        this.$content = function3;
        this.$floatingActionButton = function22;
        this.$sheetPeekHeight = f;
        this.$floatingActionButtonPosition = i;
        this.$$dirty = i2;
        this.$$dirty2 = i3;
        this.$$dirty1 = i4;
        this.$sheetGesturesEnabled = z;
        this.$peekHeightPx = f2;
        this.$sheetShape = shape;
        this.$sheetElevation = f3;
        this.$sheetBackgroundColor = j;
        this.$sheetContentColor = j2;
        this.$sheetContent = function32;
        this.$snackbarHost = function33;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C493@20277L50,449@18129L2385:BottomSheetScaffold.kt#jmzs0o");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(893101063, i, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:448)");
            }
            BottomSheetState bottomSheetState = this.$scaffoldState.getBottomSheetState();
            Function2<Composer, Integer, Unit> function2 = this.$topBar;
            Function3<PaddingValues, Composer, Integer, Unit> function3 = this.$content;
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -1378534681, true, new AnonymousClass1(this.$sheetGesturesEnabled, this.$scaffoldState, this.$sheetPeekHeight, this.$peekHeightPx, this.$sheetShape, this.$sheetElevation, this.$sheetBackgroundColor, this.$sheetContentColor, this.$sheetContent, this.$$dirty, this.$$dirty1));
            Function2<Composer, Integer, Unit> function22 = this.$floatingActionButton;
            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer, -486138068, true, new AnonymousClass2(this.$snackbarHost, this.$scaffoldState, this.$$dirty));
            float f = this.$sheetPeekHeight;
            int i2 = this.$floatingActionButtonPosition;
            BottomSheetScaffoldState bottomSheetScaffoldState = this.$scaffoldState;
            composer.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = composer.changed(bottomSheetScaffoldState);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = (Function0) new BottomSheetScaffoldKt$BottomSheetScaffold$child$1$3$1(bottomSheetScaffoldState);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            int i3 = this.$$dirty;
            BottomSheetScaffoldKt.m1268BottomSheetScaffoldLayoutKCBPh4w(function2, function3, composableLambda, function22, composableLambda2, f, i2, (Function0) rememberedValue, bottomSheetState, composer, ((i3 >> 9) & 14) | 24960 | ((this.$$dirty2 >> 3) & 112) | ((i3 >> 6) & 7168) | ((this.$$dirty1 << 9) & 458752) | (i3 & 3670016));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BottomSheetScaffold.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "layoutHeight", "", "invoke", "(ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function3<Integer, Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ int $$dirty1;
        final /* synthetic */ float $peekHeightPx;
        final /* synthetic */ BottomSheetScaffoldState $scaffoldState;
        final /* synthetic */ long $sheetBackgroundColor;
        final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $sheetContent;
        final /* synthetic */ long $sheetContentColor;
        final /* synthetic */ float $sheetElevation;
        final /* synthetic */ boolean $sheetGesturesEnabled;
        final /* synthetic */ float $sheetPeekHeight;
        final /* synthetic */ Shape $sheetShape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(boolean z, BottomSheetScaffoldState bottomSheetScaffoldState, float f, float f2, Shape shape, float f3, long j, long j2, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i, int i2) {
            super(3);
            this.$sheetGesturesEnabled = z;
            this.$scaffoldState = bottomSheetScaffoldState;
            this.$sheetPeekHeight = f;
            this.$peekHeightPx = f2;
            this.$sheetShape = shape;
            this.$sheetElevation = f3;
            this.$sheetBackgroundColor = j;
            this.$sheetContentColor = j2;
            this.$sheetContent = function3;
            this.$$dirty = i;
            this.$$dirty1 = i2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Composer composer, Integer num2) {
            invoke(num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i, Composer composer, int i2) {
            int i3;
            Modifier.Companion companion;
            ComposerKt.sourceInformation(composer, "C469@19143L580,464@18881L1191:BottomSheetScaffold.kt#jmzs0o");
            if ((i2 & 14) == 0) {
                i3 = i2 | (composer.changed(i) ? 4 : 2);
            } else {
                i3 = i2;
            }
            if ((i3 & 91) != 18 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1378534681, i3, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:452)");
                }
                composer.startReplaceableGroup(-816851374);
                ComposerKt.sourceInformation(composer, "456@18416L390");
                if (this.$sheetGesturesEnabled) {
                    Modifier.Companion companion2 = Modifier.Companion;
                    AnchoredDraggableState<BottomSheetValue> anchoredDraggableState$material_release = this.$scaffoldState.getBottomSheetState().getAnchoredDraggableState$material_release();
                    BottomSheetScaffoldState bottomSheetScaffoldState = this.$scaffoldState;
                    composer.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
                    boolean changed = composer.changed(anchoredDraggableState$material_release);
                    Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = BottomSheetScaffoldKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(bottomSheetScaffoldState.getBottomSheetState().getAnchoredDraggableState$material_release(), Orientation.Vertical);
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceableGroup();
                    companion = NestedScrollModifierKt.nestedScroll$default(companion2, (NestedScrollConnection) rememberedValue, null, 2, null);
                } else {
                    companion = Modifier.Companion;
                }
                composer.endReplaceableGroup();
                BottomSheetState bottomSheetState = this.$scaffoldState.getBottomSheetState();
                Modifier m786requiredHeightInVpY3zN4$default = SizeKt.m786requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), this.$sheetPeekHeight, 0.0f, 2, null);
                boolean z = this.$sheetGesturesEnabled;
                Integer valueOf = Integer.valueOf(i);
                Float valueOf2 = Float.valueOf(this.$peekHeightPx);
                float f = this.$peekHeightPx;
                composer.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
                boolean changed2 = composer.changed(valueOf) | composer.changed(valueOf2);
                BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1 rememberedValue2 = composer.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1(i, f);
                    composer.updateRememberedValue(rememberedValue2);
                }
                composer.endReplaceableGroup();
                Shape shape = this.$sheetShape;
                float f2 = this.$sheetElevation;
                long j = this.$sheetBackgroundColor;
                long j2 = this.$sheetContentColor;
                Function3<ColumnScope, Composer, Integer, Unit> function3 = this.$sheetContent;
                int i4 = this.$$dirty;
                int i5 = this.$$dirty1;
                BottomSheetScaffoldKt.m1266BottomSheet0cLKjW4(bottomSheetState, z, (Function1) rememberedValue2, shape, f2, j, j2, m786requiredHeightInVpY3zN4$default, function3, composer, ((i4 >> 18) & 112) | ((i4 >> 15) & 7168) | ((i4 >> 15) & 57344) | ((i5 << 15) & 458752) | ((i5 << 15) & 3670016) | ((i4 << 24) & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BottomSheetScaffold.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ BottomSheetScaffoldState $scaffoldState;
        final /* synthetic */ Function3<SnackbarHostState, Composer, Integer, Unit> $snackbarHost;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3, BottomSheetScaffoldState bottomSheetScaffoldState, int i) {
            super(2);
            this.$snackbarHost = function3;
            this.$scaffoldState = bottomSheetScaffoldState;
            this.$$dirty = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C491@20190L45:BottomSheetScaffold.kt#jmzs0o");
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-486138068, i, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:490)");
            }
            this.$snackbarHost.invoke(this.$scaffoldState.getSnackbarHostState(), composer, Integer.valueOf((this.$$dirty >> 9) & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }
}
