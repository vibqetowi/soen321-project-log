package androidx.constraintlayout.compose;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.data.networking.OkHttpClientProviderKt;
import java.util.EnumSet;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
/* compiled from: ConstraintLayout.kt */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aE\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001e\b\u0004\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f0\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0019\u001an\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u001c\u001a\u00020\u00012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0010\b\n\u0010 \u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010!2\u0013\b\b\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u000f0!¢\u0006\u0002\b\u0017H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\"\u001a'\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001b2\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u000f0\u0015¢\u0006\u0002\b\u0018\u001a\u0018\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001b2\b\b\u0001\u0010'\u001a\u00020(\u001a\u001f\u0010#\u001a\u00020\u001b2\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u000f0\u0015¢\u0006\u0002\b\u0018\u001a\u0010\u0010#\u001a\u00020\u001b2\b\b\u0001\u0010'\u001a\u00020(\u001a#\u0010#\u001a\u00020\u001b2\b\b\u0001\u0010\u0014\u001a\u00020(2\n\b\u0003\u0010)\u001a\u0004\u0018\u00010(H\u0007¢\u0006\u0002\u0010*\u001a\u001e\u0010+\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020-2\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/H\u0000\u001a\b\u00101\u001a\u000202H\u0000\u001a3\u00103\u001a\u0002042\u0006\u0010\u0012\u001a\u00020\u00132\f\u00105\u001a\b\u0012\u0004\u0012\u000207062\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u00108\u001a\u000209H\u0001¢\u0006\u0002\u0010:\u001aE\u00103\u001a\u0014\u0012\u0004\u0012\u000204\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0!0;2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010<\u001a\u00020\u00162\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u0001062\u0006\u00108\u001a\u000209H\u0001¢\u0006\u0002\u0010>\u001a\u001f\u0010?\u001a\u00020\u0003*\u00020\u00042\u0006\u0010@\u001a\u00020Aø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bB\u0010C\u001a\u001f\u0010?\u001a\u00020\u0007*\u00020\b2\u0006\u0010@\u001a\u00020Aø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bB\u0010D\u001a!\u0010\u0002\u001a\u00020\u0007*\u00020\b2\u0006\u0010@\u001a\u00020AH\u0007ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bE\u0010D\u001a\u001f\u0010F\u001a\u00020\b*\u00020\u00042\u0006\u0010@\u001a\u00020Aø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bG\u0010H\u001a\u001f\u0010F\u001a\u00020\u0007*\u00020\u00032\u0006\u0010@\u001a\u00020Aø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bG\u0010I\u001a\f\u0010J\u001a\u00020(*\u00020KH\u0002\u001a\f\u0010J\u001a\u00020(*\u00020LH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082D¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0003*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0015\u0010\u0002\u001a\u00020\u0007*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\t\"\u0015\u0010\n\u001a\u00020\b*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0015\u0010\n\u001a\u00020\u0007*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\r*\f\b\u0000\u0010M\"\u00020N2\u00020N*\f\b\u0000\u0010O\"\u00020P2\u00020P*\f\b\u0000\u0010Q\"\u00020R2\u00020R*\f\b\u0000\u0010S\"\u00020T2\u00020T\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006U"}, d2 = {OkHttpClientProviderKt.DEBUG_KEY, "", "atLeastWrapContent", "Landroidx/constraintlayout/compose/Dimension$MaxCoercible;", "Landroidx/constraintlayout/compose/Dimension$Coercible;", "getAtLeastWrapContent", "(Landroidx/constraintlayout/compose/Dimension$Coercible;)Landroidx/constraintlayout/compose/Dimension$MaxCoercible;", "Landroidx/constraintlayout/compose/Dimension;", "Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "(Landroidx/constraintlayout/compose/Dimension$MinCoercible;)Landroidx/constraintlayout/compose/Dimension;", "atMostWrapContent", "getAtMostWrapContent", "(Landroidx/constraintlayout/compose/Dimension$Coercible;)Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "(Landroidx/constraintlayout/compose/Dimension$MaxCoercible;)Landroidx/constraintlayout/compose/Dimension;", "ConstraintLayout", "", "modifier", "Landroidx/compose/ui/Modifier;", "optimizationLevel", "", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/ConstraintLayoutScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "constraintSet", "Landroidx/constraintlayout/compose/ConstraintSet;", "animateChanges", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "finishedAnimationListener", "Lkotlin/Function0;", "(Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/compose/ui/Modifier;IZLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ConstraintSet", "extendConstraintSet", "description", "Landroidx/constraintlayout/compose/ConstraintSetScope;", "jsonContent", "", "overrideVariables", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/constraintlayout/compose/ConstraintSet;", "buildMapping", "state", "Landroidx/constraintlayout/compose/State;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "createId", "", "rememberConstraintLayoutMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "needsUpdate", "Landroidx/compose/runtime/MutableState;", "", "measurer", "Landroidx/constraintlayout/compose/Measurer;", "(ILandroidx/compose/runtime/MutableState;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/Measurer;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "Lkotlin/Pair;", "scope", "remeasureRequesterState", "(ILandroidx/constraintlayout/compose/ConstraintLayoutScope;Landroidx/compose/runtime/MutableState;Landroidx/constraintlayout/compose/Measurer;Landroidx/compose/runtime/Composer;I)Lkotlin/Pair;", "atLeast", "dp", "Landroidx/compose/ui/unit/Dp;", "atLeast-3ABfNKs", "(Landroidx/constraintlayout/compose/Dimension$Coercible;F)Landroidx/constraintlayout/compose/Dimension$MaxCoercible;", "(Landroidx/constraintlayout/compose/Dimension$MinCoercible;F)Landroidx/constraintlayout/compose/Dimension;", "atLeastWrapContent-3ABfNKs", "atMost", "atMost-3ABfNKs", "(Landroidx/constraintlayout/compose/Dimension$Coercible;F)Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "(Landroidx/constraintlayout/compose/Dimension$MaxCoercible;F)Landroidx/constraintlayout/compose/Dimension;", "toDebugString", "Landroidx/constraintlayout/core/widgets/ConstraintWidget;", "Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;", "SolverChain", "Landroidx/constraintlayout/core/state/State$Chain;", "SolverDimension", "Landroidx/constraintlayout/core/state/Dimension;", "SolverDirection", "Landroidx/constraintlayout/core/state/State$Direction;", "SolverState", "Landroidx/constraintlayout/core/state/State;", "compose_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ConstraintLayoutKt {
    private static final boolean DEBUG = false;

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toDebugString(BasicMeasure.Measure measure) {
        return "measure strategy is ";
    }

    public static final void ConstraintLayout(Modifier modifier, int i, Function3<? super ConstraintLayoutScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-270267587);
        ComposerKt.sourceInformation(composer, "C(ConstraintLayout)P(1,2)");
        Modifier.Companion companion = (i3 & 1) != 0 ? Modifier.Companion : modifier;
        int i4 = (i3 & 2) != 0 ? 257 : i;
        composer.startReplaceableGroup(-3687241);
        ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new Measurer();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Measurer measurer = (Measurer) rememberedValue;
        composer.startReplaceableGroup(-3687241);
        ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new ConstraintLayoutScope();
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) rememberedValue2;
        composer.startReplaceableGroup(-3687241);
        ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        Pair<MeasurePolicy, Function0<Unit>> rememberConstraintLayoutMeasurePolicy = rememberConstraintLayoutMeasurePolicy(i4, constraintLayoutScope, (MutableState) rememberedValue3, measurer, composer, ((i2 >> 3) & 14) | 4544);
        LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(companion, false, new ConstraintLayoutKt$ConstraintLayout$1(measurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new ConstraintLayoutKt$ConstraintLayout$2(constraintLayoutScope, content, i2, rememberConstraintLayoutMeasurePolicy.component2())), rememberConstraintLayoutMeasurePolicy.component1(), composer, 48, 0);
        composer.endReplaceableGroup();
    }

    public static final Pair<MeasurePolicy, Function0<Unit>> rememberConstraintLayoutMeasurePolicy(final int i, ConstraintLayoutScope scope, final MutableState<Boolean> remeasureRequesterState, final Measurer measurer, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(remeasureRequesterState, "remeasureRequesterState");
        Intrinsics.checkNotNullParameter(measurer, "measurer");
        composer.startReplaceableGroup(-441911751);
        composer.startReplaceableGroup(-3687241);
        ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new ConstraintSetForInlineDsl(scope);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final ConstraintSetForInlineDsl constraintSetForInlineDsl = (ConstraintSetForInlineDsl) rememberedValue;
        Integer valueOf = Integer.valueOf(i);
        composer.startReplaceableGroup(-3686930);
        ComposerKt.sourceInformation(composer, "C(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(valueOf);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = TuplesKt.to(new MeasurePolicy() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$measurePolicy$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo272measure3p2s80s(MeasureScope MeasurePolicy, List<? extends Measurable> measurables, long j) {
                    MeasureResult layout$default;
                    Intrinsics.checkNotNullParameter(MeasurePolicy, "$this$MeasurePolicy");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    long m5914performMeasureDjhGOtQ = Measurer.this.m5914performMeasureDjhGOtQ(j, MeasurePolicy.getLayoutDirection(), constraintSetForInlineDsl, measurables, i, MeasurePolicy);
                    remeasureRequesterState.getValue();
                    layout$default = MeasureScope.CC.layout$default(MeasurePolicy, IntSize.m5767getWidthimpl(m5914performMeasureDjhGOtQ), IntSize.m5766getHeightimpl(m5914performMeasureDjhGOtQ), null, new ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$measurePolicy$1$measure$1(Measurer.this, measurables), 4, null);
                    return layout$default;
                }
            }, new ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$onHelpersChanged$1(remeasureRequesterState, constraintSetForInlineDsl));
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        Pair<MeasurePolicy, Function0<Unit>> pair = (Pair) rememberedValue2;
        composer.endReplaceableGroup();
        return pair;
    }

    public static final void ConstraintLayout(ConstraintSet constraintSet, Modifier modifier, int i, boolean z, AnimationSpec<Float> animationSpec, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i2, int i3) {
        Object obj;
        String str;
        Intrinsics.checkNotNullParameter(constraintSet, "constraintSet");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-270262697);
        ComposerKt.sourceInformation(composer, "C(ConstraintLayout)P(2,5,6!2,4)");
        Modifier modifier2 = (i3 & 2) != 0 ? Modifier.Companion : modifier;
        int i4 = (i3 & 4) != 0 ? 257 : i;
        boolean z2 = (i3 & 8) != 0 ? false : z;
        TweenSpec tween$default = (i3 & 16) != 0 ? AnimationSpecKt.tween$default(0, 0, null, 7, null) : animationSpec;
        Function0<Unit> function02 = (i3 & 32) != 0 ? null : function0;
        if (z2) {
            composer.startReplaceableGroup(-270262314);
            composer.startReplaceableGroup(-3687241);
            ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(constraintSet, null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            MutableState mutableState = (MutableState) rememberedValue;
            composer.startReplaceableGroup(-3687241);
            ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(constraintSet, null, 2, null);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) rememberedValue2;
            composer.startReplaceableGroup(-3687241);
            ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceableGroup();
            Animatable animatable = (Animatable) rememberedValue3;
            composer.startReplaceableGroup(-3687241);
            ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue4 = composer.rememberedValue();
            if (rememberedValue4 == Composer.Companion.getEmpty()) {
                rememberedValue4 = ChannelKt.Channel$default(-1, null, null, 6, null);
                composer.updateRememberedValue(rememberedValue4);
            }
            composer.endReplaceableGroup();
            Channel channel = (Channel) rememberedValue4;
            composer.startReplaceableGroup(-3687241);
            ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue5 = composer.rememberedValue();
            if (rememberedValue5 == Composer.Companion.getEmpty()) {
                rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(1, null, 2, null);
                composer.updateRememberedValue(rememberedValue5);
            }
            composer.endReplaceableGroup();
            EffectsKt.SideEffect(new ConstraintLayoutKt$ConstraintLayout$3(channel, constraintSet), composer, 0);
            EffectsKt.LaunchedEffect(channel, new ConstraintLayoutKt$ConstraintLayout$4(channel, (MutableState) rememberedValue5, animatable, tween$default, function02, mutableState, mutableState2, null), composer, 8);
            ConstraintSet m5891ConstraintLayout$lambda6 = m5891ConstraintLayout$lambda6(mutableState);
            ConstraintSet m5893ConstraintLayout$lambda9 = m5893ConstraintLayout$lambda9(mutableState2);
            float floatValue = ((Number) animatable.getValue()).floatValue();
            int i5 = (i2 << 12) & 458752;
            composer.startReplaceableGroup(-1330873847);
            ComposerKt.sourceInformation(composer, "C(MotionLayout)P(6,2,7,5,1,3,4)");
            EnumSet of = EnumSet.of(MotionLayoutDebugFlags.NONE);
            Intrinsics.checkNotNullExpressionValue(of, "of(MotionLayoutDebugFlags.NONE)");
            int i6 = i5 << 3;
            int i7 = (i6 & 234881024) | (i5 & 14) | 229376 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i6 & 3670016) | (i6 & 29360128);
            composer.startReplaceableGroup(-1330870962);
            ComposerKt.sourceInformation(composer, "C(MotionLayout)P(7,2,8,6,1,3,4,5)");
            int i8 = (i7 & 234881024) | (i7 & 14) | 32768 | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (i7 & 458752) | (3670016 & i7) | (i7 & 29360128);
            composer.startReplaceableGroup(-1401224268);
            composer.startReplaceableGroup(-3687241);
            ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue6 = composer.rememberedValue();
            if (rememberedValue6 == Composer.Companion.getEmpty()) {
                rememberedValue6 = new MotionMeasurer();
                composer.updateRememberedValue(rememberedValue6);
            }
            composer.endReplaceableGroup();
            MotionMeasurer motionMeasurer = (MotionMeasurer) rememberedValue6;
            composer.startReplaceableGroup(-3687241);
            ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue7 = composer.rememberedValue();
            if (rememberedValue7 == Composer.Companion.getEmpty()) {
                rememberedValue7 = new MotionLayoutScope(motionMeasurer);
                composer.updateRememberedValue(rememberedValue7);
            }
            composer.endReplaceableGroup();
            MotionLayoutScope motionLayoutScope = (MotionLayoutScope) rememberedValue7;
            composer.startReplaceableGroup(-3687241);
            ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue8 = composer.rememberedValue();
            if (rememberedValue8 == Composer.Companion.getEmpty()) {
                str = "C:CompositionLocal.kt#9igjgp";
                rememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                composer.updateRememberedValue(rememberedValue8);
            } else {
                str = "C:CompositionLocal.kt#9igjgp";
            }
            composer.endReplaceableGroup();
            MutableState mutableState3 = (MutableState) rememberedValue8;
            mutableState3.setValue(Float.valueOf(floatValue));
            int i9 = i8 << 9;
            String str2 = str;
            MeasurePolicy rememberMotionLayoutMeasurePolicy = MotionLayoutKt.rememberMotionLayoutMeasurePolicy(257, of, 0L, m5891ConstraintLayout$lambda6, m5893ConstraintLayout$lambda9, null, mutableState3, motionMeasurer, composer, ((i8 >> 21) & 14) | 18350528 | (i9 & 7168) | (57344 & i9) | (i9 & 458752));
            motionMeasurer.addLayoutInformationReceiver(null);
            float forcedScaleFactor = motionMeasurer.getForcedScaleFactor();
            if (!of.contains(MotionLayoutDebugFlags.NONE) || !Float.isNaN(forcedScaleFactor)) {
                composer.startReplaceableGroup(-1401223142);
                if (!Float.isNaN(forcedScaleFactor)) {
                    modifier2 = ScaleKt.scale(modifier2, motionMeasurer.getForcedScaleFactor());
                }
                composer.startReplaceableGroup(-1990474327);
                ComposerKt.sourceInformation(composer, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(1376089335);
                ComposerKt.sourceInformation(composer, "C(Layout)P(!1,2)71@2788L7,72@2843L7,73@2855L389:Layout.kt#80mrfh");
                ComposerKt.sourceInformationMarkerStart(composer, 103361330, str2);
                Object consume = composer.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(composer);
                Density density = (Density) consume;
                ComposerKt.sourceInformationMarkerStart(composer, 103361330, str2);
                Object consume2 = composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(composer);
                LayoutDirection layoutDirection = (LayoutDirection) consume2;
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
                Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
                Updater.m2900setimpl(m2893constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
                composer.enableReusing();
                materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                composer.startReplaceableGroup(-1253629305);
                ComposerKt.sourceInformation(composer, "C72@3384L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, new MotionLayoutKt$MotionLayoutCore$3$1(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819900388, true, new ConstraintLayoutKt$ConstraintLayout$$inlined$MotionLayout$1(motionLayoutScope, i8, content, i2)), rememberMotionLayoutMeasurePolicy, composer, 48, 0);
                if (!Float.isNaN(forcedScaleFactor)) {
                    composer.startReplaceableGroup(-922833881);
                    motionMeasurer.drawDebugBounds(boxScopeInstance, forcedScaleFactor, composer, 518);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(-922833807);
                    composer.endReplaceableGroup();
                }
                if (!of.contains(MotionLayoutDebugFlags.NONE)) {
                    composer.startReplaceableGroup(-922833740);
                    motionMeasurer.drawDebug(boxScopeInstance, composer, 70);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(-922833689);
                    composer.endReplaceableGroup();
                }
                Unit unit = Unit.INSTANCE;
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-1401222327);
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, new MotionLayoutKt$MotionLayoutCore$4(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819896774, true, new ConstraintLayoutKt$ConstraintLayout$$inlined$MotionLayout$2(motionLayoutScope, i8, content, i2)), rememberMotionLayoutMeasurePolicy, composer, 48, 0);
                composer.endReplaceableGroup();
            }
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
        } else {
            int i10 = i4;
            composer.startReplaceableGroup(-270260906);
            composer.startReplaceableGroup(-3687241);
            ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue9 = composer.rememberedValue();
            if (rememberedValue9 == Composer.Companion.getEmpty()) {
                obj = null;
                rememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
                composer.updateRememberedValue(rememberedValue9);
            } else {
                obj = null;
            }
            composer.endReplaceableGroup();
            MutableState<Long> mutableState4 = (MutableState) rememberedValue9;
            composer.startReplaceableGroup(-3687241);
            ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue10 = composer.rememberedValue();
            if (rememberedValue10 == Composer.Companion.getEmpty()) {
                rememberedValue10 = new Measurer();
                composer.updateRememberedValue(rememberedValue10);
            }
            composer.endReplaceableGroup();
            Measurer measurer = (Measurer) rememberedValue10;
            Modifier modifier3 = modifier2;
            MeasurePolicy rememberConstraintLayoutMeasurePolicy = rememberConstraintLayoutMeasurePolicy(i10, mutableState4, constraintSet, measurer, composer, ((i2 >> 6) & 14) | 4144 | ((i2 << 6) & 896));
            if (constraintSet instanceof EditableJSONLayout) {
                ((EditableJSONLayout) constraintSet).setUpdateFlag(mutableState4);
            }
            measurer.addLayoutInformationReceiver(constraintSet instanceof LayoutInformationReceiver ? (LayoutInformationReceiver) constraintSet : null);
            float forcedScaleFactor2 = measurer.getForcedScaleFactor();
            if (!Float.isNaN(forcedScaleFactor2)) {
                composer.startReplaceableGroup(-270260292);
                Modifier scale = ScaleKt.scale(modifier3, measurer.getForcedScaleFactor());
                composer.startReplaceableGroup(-1990474327);
                ComposerKt.sourceInformation(composer, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(1376089335);
                ComposerKt.sourceInformation(composer, "C(Layout)P(!1,2)71@2788L7,72@2843L7,73@2855L389:Layout.kt#80mrfh");
                ComposerKt.sourceInformationMarkerStart(composer, 103361330, "C:CompositionLocal.kt#9igjgp");
                Object consume3 = composer.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(composer);
                Density density2 = (Density) consume3;
                ComposerKt.sourceInformationMarkerStart(composer, 103361330, "C:CompositionLocal.kt#9igjgp");
                Object consume4 = composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(composer);
                LayoutDirection layoutDirection2 = (LayoutDirection) consume4;
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(Modifier.Companion);
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
                Updater.m2900setimpl(m2893constructorimpl2, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl2, density2, ComposeUiNode.Companion.getSetDensity());
                Updater.m2900setimpl(m2893constructorimpl2, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
                composer.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                composer.startReplaceableGroup(-1253629305);
                ComposerKt.sourceInformation(composer, "C72@3384L9:Box.kt#2w3rfo");
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(scale, false, new ConstraintLayoutKt$ConstraintLayout$6$1(measurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819900598, true, new ConstraintLayoutKt$ConstraintLayout$6$2(measurer, content, i2)), rememberConstraintLayoutMeasurePolicy, composer, 48, 0);
                measurer.drawDebugBounds(BoxScopeInstance.INSTANCE, forcedScaleFactor2, composer, 518);
                Unit unit2 = Unit.INSTANCE;
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-270259702);
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier3, false, new ConstraintLayoutKt$ConstraintLayout$7(measurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819901122, true, new ConstraintLayoutKt$ConstraintLayout$8(measurer, content, i2)), rememberConstraintLayoutMeasurePolicy, composer, 48, 0);
                composer.endReplaceableGroup();
            }
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ConstraintLayout$lambda-6  reason: not valid java name */
    public static final ConstraintSet m5891ConstraintLayout$lambda6(MutableState<ConstraintSet> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ConstraintLayout$lambda-9  reason: not valid java name */
    public static final ConstraintSet m5893ConstraintLayout$lambda9(MutableState<ConstraintSet> mutableState) {
        return mutableState.getValue();
    }

    public static final MeasurePolicy rememberConstraintLayoutMeasurePolicy(final int i, MutableState<Long> needsUpdate, final ConstraintSet constraintSet, final Measurer measurer, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(needsUpdate, "needsUpdate");
        Intrinsics.checkNotNullParameter(constraintSet, "constraintSet");
        Intrinsics.checkNotNullParameter(measurer, "measurer");
        composer.startReplaceableGroup(-441904452);
        Integer valueOf = Integer.valueOf(i);
        Long value = needsUpdate.getValue();
        composer.startReplaceableGroup(-3686095);
        ComposerKt.sourceInformation(composer, "C(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean changed = composer.changed(value) | composer.changed(valueOf) | composer.changed(constraintSet);
        MeasurePolicy rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            measurer.parseDesignElements(constraintSet);
            rememberedValue = new MeasurePolicy() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$2$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo272measure3p2s80s(MeasureScope MeasurePolicy, List<? extends Measurable> measurables, long j) {
                    MeasureResult layout$default;
                    Intrinsics.checkNotNullParameter(MeasurePolicy, "$this$MeasurePolicy");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    long m5914performMeasureDjhGOtQ = Measurer.this.m5914performMeasureDjhGOtQ(j, MeasurePolicy.getLayoutDirection(), constraintSet, measurables, i, MeasurePolicy);
                    layout$default = MeasureScope.CC.layout$default(MeasurePolicy, IntSize.m5767getWidthimpl(m5914performMeasureDjhGOtQ), IntSize.m5766getHeightimpl(m5914performMeasureDjhGOtQ), null, new ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$2$1$measure$1(Measurer.this, measurables), 4, null);
                    return layout$default;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
        composer.endReplaceableGroup();
        return measurePolicy;
    }

    public static final Object createId() {
        return new Object() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$createId$1
        };
    }

    public static final Dimension.MaxCoercible getAtLeastWrapContent(Dimension.Coercible coercible) {
        Intrinsics.checkNotNullParameter(coercible, "<this>");
        DimensionDescription dimensionDescription = (DimensionDescription) coercible;
        dimensionDescription.setMinSymbol(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
        return dimensionDescription;
    }

    /* renamed from: atLeast-3ABfNKs  reason: not valid java name */
    public static final Dimension.MaxCoercible m5898atLeast3ABfNKs(Dimension.Coercible atLeast, float f) {
        Intrinsics.checkNotNullParameter(atLeast, "$this$atLeast");
        DimensionDescription dimensionDescription = (DimensionDescription) atLeast;
        dimensionDescription.m5909setMinYLDhkOg(Dp.m5605boximpl(f));
        return dimensionDescription;
    }

    /* renamed from: atMost-3ABfNKs  reason: not valid java name */
    public static final Dimension.MinCoercible m5901atMost3ABfNKs(Dimension.Coercible atMost, float f) {
        Intrinsics.checkNotNullParameter(atMost, "$this$atMost");
        DimensionDescription dimensionDescription = (DimensionDescription) atMost;
        dimensionDescription.m5908setMaxYLDhkOg(Dp.m5605boximpl(f));
        return dimensionDescription;
    }

    public static final Dimension.MinCoercible getAtMostWrapContent(Dimension.Coercible coercible) {
        Intrinsics.checkNotNullParameter(coercible, "<this>");
        DimensionDescription dimensionDescription = (DimensionDescription) coercible;
        dimensionDescription.setMaxSymbol(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
        return dimensionDescription;
    }

    @Deprecated(message = "Unintended method name, use atLeast(dp) instead", replaceWith = @ReplaceWith(expression = "this.atLeast(dp)", imports = {"androidx.constraintlayout.compose.atLeast"}))
    /* renamed from: atLeastWrapContent-3ABfNKs  reason: not valid java name */
    public static final Dimension m5900atLeastWrapContent3ABfNKs(Dimension.MinCoercible atLeastWrapContent, float f) {
        Intrinsics.checkNotNullParameter(atLeastWrapContent, "$this$atLeastWrapContent");
        DimensionDescription dimensionDescription = (DimensionDescription) atLeastWrapContent;
        dimensionDescription.m5909setMinYLDhkOg(Dp.m5605boximpl(f));
        return dimensionDescription;
    }

    /* renamed from: atLeast-3ABfNKs  reason: not valid java name */
    public static final Dimension m5899atLeast3ABfNKs(Dimension.MinCoercible atLeast, float f) {
        Intrinsics.checkNotNullParameter(atLeast, "$this$atLeast");
        DimensionDescription dimensionDescription = (DimensionDescription) atLeast;
        dimensionDescription.m5909setMinYLDhkOg(Dp.m5605boximpl(f));
        return dimensionDescription;
    }

    public static final Dimension getAtLeastWrapContent(Dimension.MinCoercible minCoercible) {
        Intrinsics.checkNotNullParameter(minCoercible, "<this>");
        DimensionDescription dimensionDescription = (DimensionDescription) minCoercible;
        dimensionDescription.setMinSymbol(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
        return dimensionDescription;
    }

    /* renamed from: atMost-3ABfNKs  reason: not valid java name */
    public static final Dimension m5902atMost3ABfNKs(Dimension.MaxCoercible atMost, float f) {
        Intrinsics.checkNotNullParameter(atMost, "$this$atMost");
        DimensionDescription dimensionDescription = (DimensionDescription) atMost;
        dimensionDescription.m5908setMaxYLDhkOg(Dp.m5605boximpl(f));
        return dimensionDescription;
    }

    public static final Dimension getAtMostWrapContent(Dimension.MaxCoercible maxCoercible) {
        Intrinsics.checkNotNullParameter(maxCoercible, "<this>");
        DimensionDescription dimensionDescription = (DimensionDescription) maxCoercible;
        dimensionDescription.setMaxSymbol(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
        return dimensionDescription;
    }

    public static final ConstraintSet ConstraintSet(String content, String str, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(1704604894);
        ComposerKt.sourceInformation(composer, "C(ConstraintSet)");
        if ((i2 & 2) != 0) {
            str = null;
        }
        String str2 = str;
        composer.startReplaceableGroup(-3686552);
        ComposerKt.sourceInformation(composer, "C(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed = composer.changed(content) | composer.changed(str2);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new JSONConstraintSet(content, str2, null, 4, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return (JSONConstraintSet) rememberedValue;
    }

    public static final ConstraintSet ConstraintSet(String jsonContent) {
        Intrinsics.checkNotNullParameter(jsonContent, "jsonContent");
        return new JSONConstraintSet(jsonContent, null, null, 6, null);
    }

    public static final ConstraintSet ConstraintSet(ConstraintSet extendConstraintSet, String jsonContent) {
        Intrinsics.checkNotNullParameter(extendConstraintSet, "extendConstraintSet");
        Intrinsics.checkNotNullParameter(jsonContent, "jsonContent");
        return new JSONConstraintSet(jsonContent, null, extendConstraintSet, 2, null);
    }

    public static final ConstraintSet ConstraintSet(Function1<? super ConstraintSetScope, Unit> description) {
        Intrinsics.checkNotNullParameter(description, "description");
        return new DslConstraintSet(description, null, 2, null);
    }

    public static final ConstraintSet ConstraintSet(ConstraintSet extendConstraintSet, Function1<? super ConstraintSetScope, Unit> description) {
        Intrinsics.checkNotNullParameter(extendConstraintSet, "extendConstraintSet");
        Intrinsics.checkNotNullParameter(description, "description");
        return new DslConstraintSet(description, extendConstraintSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toDebugString(ConstraintWidget constraintWidget) {
        return ((Object) constraintWidget.getDebugName()) + " width " + constraintWidget.getWidth() + " minWidth " + constraintWidget.getMinWidth() + " maxWidth " + constraintWidget.getMaxWidth() + " height " + constraintWidget.getHeight() + " minHeight " + constraintWidget.getMinHeight() + " maxHeight " + constraintWidget.getMaxHeight() + " HDB " + constraintWidget.getHorizontalDimensionBehaviour() + " VDB " + constraintWidget.getVerticalDimensionBehaviour() + " MCW " + constraintWidget.mMatchConstraintDefaultWidth + " MCH " + constraintWidget.mMatchConstraintDefaultHeight + " percentW " + constraintWidget.mMatchConstraintPercentWidth + " percentH " + constraintWidget.mMatchConstraintPercentHeight;
    }

    public static final void buildMapping(State state, List<? extends Measurable> measurables) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        int size = measurables.size() - 1;
        if (size < 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            Measurable measurable = measurables.get(i);
            Object layoutId = LayoutIdKt.getLayoutId(measurable);
            if (layoutId == null && (layoutId = ConstraintLayoutTagKt.getConstraintLayoutId(measurable)) == null) {
                layoutId = createId();
            }
            state.map(layoutId, measurable);
            Object constraintLayoutTag = ConstraintLayoutTagKt.getConstraintLayoutTag(measurable);
            if (constraintLayoutTag != null && (constraintLayoutTag instanceof String) && (layoutId instanceof String)) {
                state.setTag((String) layoutId, (String) constraintLayoutTag);
            }
            if (i2 > size) {
                return;
            }
            i = i2;
        }
    }
}
