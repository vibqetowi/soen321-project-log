package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CoreTextField.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CoreTextFieldKt$CoreTextField$5 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ BringIntoViewRequester $bringIntoViewRequester;
    final /* synthetic */ Modifier $cursorModifier;
    final /* synthetic */ Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> $decorationBox;
    final /* synthetic */ Density $density;
    final /* synthetic */ Modifier $drawModifier;
    final /* synthetic */ Modifier $magnifierModifier;
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ int $minLines;
    final /* synthetic */ OffsetMapping $offsetMapping;
    final /* synthetic */ Modifier $onPositionedModifier;
    final /* synthetic */ Function1<TextLayoutResult, Unit> $onTextLayout;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ TextFieldScrollerPosition $scrollerPosition;
    final /* synthetic */ boolean $showHandleAndMagnifier;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ TextStyle $textStyle;
    final /* synthetic */ TextFieldValue $value;
    final /* synthetic */ VisualTransformation $visualTransformation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoreTextFieldKt$CoreTextField$5(Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, int i, TextFieldState textFieldState, TextStyle textStyle, int i2, int i3, TextFieldScrollerPosition textFieldScrollerPosition, TextFieldValue textFieldValue, VisualTransformation visualTransformation, Modifier modifier, Modifier modifier2, Modifier modifier3, Modifier modifier4, BringIntoViewRequester bringIntoViewRequester, TextFieldSelectionManager textFieldSelectionManager, boolean z, boolean z2, Function1<? super TextLayoutResult, Unit> function1, OffsetMapping offsetMapping, Density density) {
        super(2);
        this.$decorationBox = function3;
        this.$$dirty1 = i;
        this.$state = textFieldState;
        this.$textStyle = textStyle;
        this.$minLines = i2;
        this.$maxLines = i3;
        this.$scrollerPosition = textFieldScrollerPosition;
        this.$value = textFieldValue;
        this.$visualTransformation = visualTransformation;
        this.$cursorModifier = modifier;
        this.$drawModifier = modifier2;
        this.$onPositionedModifier = modifier3;
        this.$magnifierModifier = modifier4;
        this.$bringIntoViewRequester = bringIntoViewRequester;
        this.$manager = textFieldSelectionManager;
        this.$showHandleAndMagnifier = z;
        this.$readOnly = z2;
        this.$onTextLayout = function1;
        this.$offsetMapping = offsetMapping;
        this.$density = density;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreTextField.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ BringIntoViewRequester $bringIntoViewRequester;
        final /* synthetic */ Modifier $cursorModifier;
        final /* synthetic */ Density $density;
        final /* synthetic */ Modifier $drawModifier;
        final /* synthetic */ Modifier $magnifierModifier;
        final /* synthetic */ TextFieldSelectionManager $manager;
        final /* synthetic */ int $maxLines;
        final /* synthetic */ int $minLines;
        final /* synthetic */ OffsetMapping $offsetMapping;
        final /* synthetic */ Modifier $onPositionedModifier;
        final /* synthetic */ Function1<TextLayoutResult, Unit> $onTextLayout;
        final /* synthetic */ boolean $readOnly;
        final /* synthetic */ TextFieldScrollerPosition $scrollerPosition;
        final /* synthetic */ boolean $showHandleAndMagnifier;
        final /* synthetic */ TextFieldState $state;
        final /* synthetic */ TextStyle $textStyle;
        final /* synthetic */ TextFieldValue $value;
        final /* synthetic */ VisualTransformation $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(TextFieldState textFieldState, TextStyle textStyle, int i, int i2, TextFieldScrollerPosition textFieldScrollerPosition, TextFieldValue textFieldValue, VisualTransformation visualTransformation, Modifier modifier, Modifier modifier2, Modifier modifier3, Modifier modifier4, BringIntoViewRequester bringIntoViewRequester, TextFieldSelectionManager textFieldSelectionManager, boolean z, boolean z2, Function1<? super TextLayoutResult, Unit> function1, OffsetMapping offsetMapping, Density density) {
            super(2);
            this.$state = textFieldState;
            this.$textStyle = textStyle;
            this.$minLines = i;
            this.$maxLines = i2;
            this.$scrollerPosition = textFieldScrollerPosition;
            this.$value = textFieldValue;
            this.$visualTransformation = visualTransformation;
            this.$cursorModifier = modifier;
            this.$drawModifier = modifier2;
            this.$onPositionedModifier = modifier3;
            this.$magnifierModifier = modifier4;
            this.$bringIntoViewRequester = bringIntoViewRequester;
            this.$manager = textFieldSelectionManager;
            this.$showHandleAndMagnifier = z;
            this.$readOnly = z2;
            this.$onTextLayout = function1;
            this.$offsetMapping = offsetMapping;
            this.$density = density;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C623@27932L3371:CoreTextField.kt#423gt5");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2032502107, i, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:598)");
                }
                SimpleLayoutKt.SimpleLayout(BringIntoViewRequesterKt.bringIntoViewRequester(TextFieldSizeKt.textFieldMinSize(TextFieldScrollKt.textFieldScroll(HeightInLinesModifierKt.heightInLines(SizeKt.m783heightInVpY3zN4$default(Modifier.Companion, this.$state.m1103getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), this.$textStyle, this.$minLines, this.$maxLines), this.$scrollerPosition, this.$value, this.$visualTransformation, new CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1(this.$state)).then(this.$cursorModifier).then(this.$drawModifier), this.$textStyle).then(this.$onPositionedModifier).then(this.$magnifierModifier), this.$bringIntoViewRequester), ComposableLambdaKt.composableLambda(composer, -363167407, true, new C00221(this.$manager, this.$state, this.$showHandleAndMagnifier, this.$readOnly, this.$onTextLayout, this.$value, this.$offsetMapping, this.$density, this.$maxLines)), composer, 48, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CoreTextField.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00221 extends Lambda implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ Density $density;
            final /* synthetic */ TextFieldSelectionManager $manager;
            final /* synthetic */ int $maxLines;
            final /* synthetic */ OffsetMapping $offsetMapping;
            final /* synthetic */ Function1<TextLayoutResult, Unit> $onTextLayout;
            final /* synthetic */ boolean $readOnly;
            final /* synthetic */ boolean $showHandleAndMagnifier;
            final /* synthetic */ TextFieldState $state;
            final /* synthetic */ TextFieldValue $value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00221(TextFieldSelectionManager textFieldSelectionManager, TextFieldState textFieldState, boolean z, boolean z2, Function1<? super TextLayoutResult, Unit> function1, TextFieldValue textFieldValue, OffsetMapping offsetMapping, Density density, int i) {
                super(2);
                this.$manager = textFieldSelectionManager;
                this.$state = textFieldState;
                this.$showHandleAndMagnifier = z;
                this.$readOnly = z2;
                this.$onTextLayout = function1;
                this.$value = textFieldValue;
                this.$offsetMapping = offsetMapping;
                this.$density = density;
                this.$maxLines = i;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                ComposerKt.sourceInformation(composer, "C624@27986L2699,677@30703L327,689@31231L40:CoreTextField.kt#423gt5");
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-363167407, i, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:623)");
                    }
                    final TextFieldState textFieldState = this.$state;
                    final Function1<TextLayoutResult, Unit> function1 = this.$onTextLayout;
                    final TextFieldValue textFieldValue = this.$value;
                    final OffsetMapping offsetMapping = this.$offsetMapping;
                    final Density density = this.$density;
                    final int i2 = this.$maxLines;
                    MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i3) {
                            return MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i3);
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i3) {
                            return MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i3);
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i3) {
                            return MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i3);
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        /* renamed from: measure-3p2s80s */
                        public MeasureResult mo272measure3p2s80s(MeasureScope measure, List<? extends Measurable> measurables, long j) {
                            Intrinsics.checkNotNullParameter(measure, "$this$measure");
                            Intrinsics.checkNotNullParameter(measurables, "measurables");
                            Snapshot.Companion companion = Snapshot.Companion;
                            TextFieldState textFieldState2 = TextFieldState.this;
                            Snapshot createNonObservableSnapshot = companion.createNonObservableSnapshot();
                            try {
                                Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                                TextLayoutResultProxy layoutResult = textFieldState2.getLayoutResult();
                                TextLayoutResult value = layoutResult != null ? layoutResult.getValue() : null;
                                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                                createNonObservableSnapshot.dispose();
                                Triple<Integer, Integer, TextLayoutResult> m1084layout_EkL_Y$foundation_release = TextFieldDelegate.Companion.m1084layout_EkL_Y$foundation_release(TextFieldState.this.getTextDelegate(), j, measure.getLayoutDirection(), value);
                                int intValue = m1084layout_EkL_Y$foundation_release.component1().intValue();
                                int intValue2 = m1084layout_EkL_Y$foundation_release.component2().intValue();
                                TextLayoutResult component3 = m1084layout_EkL_Y$foundation_release.component3();
                                if (!Intrinsics.areEqual(value, component3)) {
                                    TextFieldState.this.setLayoutResult(new TextLayoutResultProxy(component3));
                                    function1.invoke(component3);
                                    CoreTextFieldKt.notifyFocusedRect(TextFieldState.this, textFieldValue, offsetMapping);
                                }
                                TextFieldState.this.m1104setMinHeightForSingleLineField0680j_4(density.mo585toDpu2uoSUM(i2 == 1 ? TextDelegateKt.ceilToIntPx(component3.getLineBottom(0)) : 0));
                                return measure.layout(intValue, intValue2, MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(MathKt.roundToInt(component3.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(MathKt.roundToInt(component3.getLastBaseline())))), CoreTextFieldKt$CoreTextField$5$1$1$2$measure$2.INSTANCE);
                            } catch (Throwable th) {
                                createNonObservableSnapshot.dispose();
                                throw th;
                            }
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i3) {
                            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                            Intrinsics.checkNotNullParameter(measurables, "measurables");
                            TextFieldState.this.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                            return TextFieldState.this.getTextDelegate().getMaxIntrinsicWidth();
                        }
                    };
                    composer.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                    boolean z = false;
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(Modifier.Companion);
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
                    Updater.m2900setimpl(m2893constructorimpl, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
                    composer.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer, 1017244823, "C:CoreTextField.kt#423gt5");
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer.endReplaceableGroup();
                    composer.endNode();
                    composer.endReplaceableGroup();
                    TextFieldSelectionManager textFieldSelectionManager = this.$manager;
                    if (this.$state.getHandleState() == HandleState.Selection && this.$state.getLayoutCoordinates() != null) {
                        LayoutCoordinates layoutCoordinates = this.$state.getLayoutCoordinates();
                        Intrinsics.checkNotNull(layoutCoordinates);
                        if (layoutCoordinates.isAttached() && this.$showHandleAndMagnifier) {
                            z = true;
                        }
                    }
                    CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager, z, composer, 8);
                    if (this.$state.getHandleState() == HandleState.Cursor && !this.$readOnly && this.$showHandleAndMagnifier) {
                        CoreTextFieldKt.TextFieldCursorHandle(this.$manager, composer, 8);
                    }
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
        ComposerKt.sourceInformation(composer, "C598@26828L4485:CoreTextField.kt#423gt5");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-374338080, i, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:597)");
            }
            this.$decorationBox.invoke(ComposableLambdaKt.composableLambda(composer, 2032502107, true, new AnonymousClass1(this.$state, this.$textStyle, this.$minLines, this.$maxLines, this.$scrollerPosition, this.$value, this.$visualTransformation, this.$cursorModifier, this.$drawModifier, this.$onPositionedModifier, this.$magnifierModifier, this.$bringIntoViewRequester, this.$manager, this.$showHandleAndMagnifier, this.$readOnly, this.$onTextLayout, this.$offsetMapping, this.$density)), composer, Integer.valueOf(((this.$$dirty1 >> 12) & 112) | 6));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
