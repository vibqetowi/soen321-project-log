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
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.data.networking.OkHttpClientProviderKt;
import java.util.EnumSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.apache.http.client.config.CookieSpecs;
/* compiled from: MotionLayout.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ay\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u001e\b\u0004\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0017\u001a\u0085\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u001e\b\u0004\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u001a\u001ae\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u001e\b\u0004\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u001d\u001a\u008b\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0!2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0010\b\n\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010#2\u001e\b\u0004\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010$\u001a\u0085\u0001\u0010%\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u001e\b\u0004\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0081\bø\u0001\u0000¢\u0006\u0002\u0010\u001a\u001ae\u0010%\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u001e\b\u0004\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0081\bø\u0001\u0000¢\u0006\u0002\u0010\u001d\u001a\u008b\u0001\u0010%\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0!2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0010\b\n\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010#2\u001e\b\u0004\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0081\bø\u0001\u0000¢\u0006\u0002\u0010$\u001a\u0017\u0010&\u001a\u00020\u001c2\b\b\u0001\u0010\u0012\u001a\u00020\u001fH\u0007¢\u0006\u0002\u0010'\u001a\u0019\u0010(\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u0012\u001a\u00020\u001fH\u0007¢\u0006\u0002\u0010)\u001a[\u0010*\u001a\u00020+2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n002\u0006\u00101\u001a\u000202H\u0001¢\u0006\u0002\u00103\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082D¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00064"}, d2 = {OkHttpClientProviderKt.DEBUG_KEY, "", "MotionLayout", "", TtmlNode.START, "Landroidx/constraintlayout/compose/ConstraintSet;", TtmlNode.END, "transition", "Landroidx/constraintlayout/compose/Transition;", "progress", "", "debug", "Ljava/util/EnumSet;", "Landroidx/constraintlayout/compose/MotionLayoutDebugFlags;", "modifier", "Landroidx/compose/ui/Modifier;", "optimizationLevel", "", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/MotionLayoutScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/Transition;FLjava/util/EnumSet;Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "informationReceiver", "Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "(Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/Transition;FLjava/util/EnumSet;Landroidx/constraintlayout/compose/LayoutInformationReceiver;Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "motionScene", "Landroidx/constraintlayout/compose/MotionScene;", "(Landroidx/constraintlayout/compose/MotionScene;FLjava/util/EnumSet;Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "constraintSetName", "", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "finishedAnimationListener", "Lkotlin/Function0;", "(Landroidx/constraintlayout/compose/MotionScene;Ljava/lang/String;Landroidx/compose/animation/core/AnimationSpec;Ljava/util/EnumSet;Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "MotionLayoutCore", TypedValues.MotionScene.NAME, "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/constraintlayout/compose/MotionScene;", "Transition", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/constraintlayout/compose/Transition;", "rememberMotionLayoutMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "needsUpdate", "", "constraintSetStart", "constraintSetEnd", "Landroidx/compose/runtime/MutableState;", "measurer", "Landroidx/constraintlayout/compose/MotionMeasurer;", "(ILjava/util/EnumSet;JLandroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/Transition;Landroidx/compose/runtime/MutableState;Landroidx/constraintlayout/compose/MotionMeasurer;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "compose_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class MotionLayoutKt {
    private static final boolean DEBUG = false;

    @ExperimentalMotionApi
    public static final void MotionLayout(ConstraintSet start, ConstraintSet end, Transition transition, float f, EnumSet<MotionLayoutDebugFlags> enumSet, Modifier modifier, int i, Function3<? super MotionLayoutScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i2, int i3) {
        EnumSet<MotionLayoutDebugFlags> enumSet2;
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-1330873847);
        ComposerKt.sourceInformation(composer, "C(MotionLayout)P(6,2,7,5,1,3,4)");
        Transition transition2 = (i3 & 4) != 0 ? null : transition;
        if ((i3 & 16) != 0) {
            EnumSet<MotionLayoutDebugFlags> of = EnumSet.of(MotionLayoutDebugFlags.NONE);
            Intrinsics.checkNotNullExpressionValue(of, "of(MotionLayoutDebugFlags.NONE)");
            enumSet2 = of;
        } else {
            enumSet2 = enumSet;
        }
        Modifier modifier2 = (i3 & 32) != 0 ? Modifier.Companion : modifier;
        int i4 = (i3 & 64) != 0 ? 257 : i;
        int i5 = i2 << 3;
        int i6 = (i5 & 234881024) | (i2 & 14) | 229376 | (i2 & 112) | (i2 & 896) | (i2 & 7168) | (i5 & 3670016) | (i5 & 29360128);
        composer.startReplaceableGroup(-1330870962);
        ComposerKt.sourceInformation(composer, "C(MotionLayout)P(7,2,8,6,1,3,4,5)");
        int i7 = (i6 & 14) | 32768 | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (i6 & 458752) | (3670016 & i6) | (i6 & 29360128) | (i6 & 234881024);
        composer.startReplaceableGroup(-1401224268);
        composer.startReplaceableGroup(-3687241);
        ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new MotionMeasurer();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MotionMeasurer motionMeasurer = (MotionMeasurer) rememberedValue;
        composer.startReplaceableGroup(-3687241);
        ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new MotionLayoutScope(motionMeasurer);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        MotionLayoutScope motionLayoutScope = (MotionLayoutScope) rememberedValue2;
        composer.startReplaceableGroup(-3687241);
        ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue3;
        mutableState.setValue(Float.valueOf(f));
        int i8 = i7 << 9;
        MeasurePolicy rememberMotionLayoutMeasurePolicy = rememberMotionLayoutMeasurePolicy(i4, enumSet2, 0L, start, end, transition2, mutableState, motionMeasurer, composer, ((i7 >> 21) & 14) | 18350528 | (i8 & 7168) | (57344 & i8) | (i8 & 458752));
        motionMeasurer.addLayoutInformationReceiver(null);
        float forcedScaleFactor = motionMeasurer.getForcedScaleFactor();
        if (!enumSet2.contains(MotionLayoutDebugFlags.NONE) || !Float.isNaN(forcedScaleFactor)) {
            composer.startReplaceableGroup(-1401223142);
            if (!Float.isNaN(forcedScaleFactor)) {
                modifier2 = ScaleKt.scale(modifier2, motionMeasurer.getForcedScaleFactor());
            }
            composer.startReplaceableGroup(-1990474327);
            ComposerKt.sourceInformation(composer, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(1376089335);
            ComposerKt.sourceInformation(composer, "C(Layout)P(!1,2)71@2788L7,72@2843L7,73@2855L389:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(composer, 103361330, "C:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(composer);
            Density density = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(composer, 103361330, "C:CompositionLocal.kt#9igjgp");
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
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, new MotionLayoutKt$MotionLayoutCore$3$1(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819900388, true, new MotionLayoutKt$MotionLayoutCore$3$2(content, motionLayoutScope, i7)), rememberMotionLayoutMeasurePolicy, composer, 48, 0);
            if (!Float.isNaN(forcedScaleFactor)) {
                composer.startReplaceableGroup(-922833881);
                motionMeasurer.drawDebugBounds(boxScopeInstance, forcedScaleFactor, composer, 518);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-922833807);
                composer.endReplaceableGroup();
            }
            if (!enumSet2.contains(MotionLayoutDebugFlags.NONE)) {
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
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, new MotionLayoutKt$MotionLayoutCore$4(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819896774, true, new MotionLayoutKt$MotionLayoutCore$5(content, motionLayoutScope, i7)), rememberMotionLayoutMeasurePolicy, composer, 48, 0);
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x01cc, code lost:
        if ((m5919MotionLayoutCore$lambda26(r4) == r22) != false) goto L48;
     */
    @ExperimentalMotionApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MotionLayout(MotionScene motionScene, float f, EnumSet<MotionLayoutDebugFlags> enumSet, Modifier modifier, int i, Function3<? super MotionLayoutScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i2, int i3) {
        EnumSet<MotionLayoutDebugFlags> enumSet2;
        Transition Transition;
        String constraintSet;
        Intrinsics.checkNotNullParameter(motionScene, "motionScene");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-1330872956);
        ComposerKt.sourceInformation(composer, "C(MotionLayout)P(3,5,1,2,4)");
        if ((i3 & 4) != 0) {
            enumSet2 = EnumSet.of(MotionLayoutDebugFlags.NONE);
            Intrinsics.checkNotNullExpressionValue(enumSet2, "of(MotionLayoutDebugFlags.NONE)");
        } else {
            enumSet2 = enumSet;
        }
        Modifier modifier2 = (i3 & 8) != 0 ? Modifier.Companion : modifier;
        int i4 = (i3 & 16) != 0 ? 257 : i;
        int i5 = (i2 & 458752) | (i2 & 14) | 512 | (i2 & 112) | (i2 & 7168) | (i2 & 57344);
        composer.startReplaceableGroup(-1401226512);
        composer.startReplaceableGroup(-3687241);
        ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState<Long> mutableState = (MutableState) rememberedValue;
        motionScene.setUpdateFlag(mutableState);
        if (motionScene.getForcedDrawDebug() != MotionLayoutDebugFlags.UNKNOWN) {
            enumSet2 = EnumSet.of(motionScene.getForcedDrawDebug());
            Intrinsics.checkNotNullExpressionValue(enumSet2, "of(motionScene.getForcedDrawDebug())");
        }
        EnumSet<MotionLayoutDebugFlags> enumSet3 = enumSet2;
        Long value = mutableState.getValue();
        composer.startReplaceableGroup(-3686552);
        ComposerKt.sourceInformation(composer, "C(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed = composer.changed(motionScene) | composer.changed(value);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = motionScene.getTransition(CookieSpecs.DEFAULT);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        String str = (String) rememberedValue2;
        if (str == null) {
            composer.startReplaceableGroup(-488322840);
            composer.endReplaceableGroup();
            Transition = null;
        } else {
            composer.startReplaceableGroup(-1401225671);
            Transition = Transition(str, composer, 0);
            composer.endReplaceableGroup();
        }
        String startConstraintSetId = Transition == null ? TtmlNode.START : Transition.getStartConstraintSetId();
        String endConstraintSetId = Transition == null ? TtmlNode.END : Transition.getEndConstraintSetId();
        Long value2 = mutableState.getValue();
        composer.startReplaceableGroup(-3686552);
        ComposerKt.sourceInformation(composer, "C(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed2 = composer.changed(motionScene) | composer.changed(value2);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
            constraintSet = motionScene.getConstraintSet(startConstraintSetId);
            if (constraintSet == null) {
                constraintSet = motionScene.getConstraintSet(0);
            }
            composer.updateRememberedValue(constraintSet);
        } else {
            constraintSet = rememberedValue3;
        }
        composer.endReplaceableGroup();
        String str2 = constraintSet;
        Long value3 = mutableState.getValue();
        composer.startReplaceableGroup(-3686552);
        ComposerKt.sourceInformation(composer, "C(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed3 = composer.changed(motionScene) | composer.changed(value3);
        Object rememberedValue4 = composer.rememberedValue();
        if (changed3 || rememberedValue4 == Composer.Companion.getEmpty()) {
            String constraintSet2 = motionScene.getConstraintSet(endConstraintSetId);
            if (constraintSet2 == null) {
                constraintSet2 = motionScene.getConstraintSet(1);
            }
            rememberedValue4 = constraintSet2;
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceableGroup();
        String str3 = (String) rememberedValue4;
        if (str2 == null || str3 == null) {
            composer.endReplaceableGroup();
        } else {
            ConstraintSet ConstraintSet = ConstraintLayoutKt.ConstraintSet(str2);
            ConstraintSet ConstraintSet2 = ConstraintLayoutKt.ConstraintSet(str3);
            composer.startReplaceableGroup(-3687241);
            ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue5 = composer.rememberedValue();
            if (rememberedValue5 == Composer.Companion.getEmpty()) {
                rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                composer.updateRememberedValue(rememberedValue5);
            }
            composer.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) rememberedValue5;
            float forcedProgress = motionScene.getForcedProgress();
            if (!Float.isNaN(forcedProgress)) {
            }
            motionScene.resetForcedProgress();
            forcedProgress = f;
            m5920MotionLayoutCore$lambda27(mutableState2, f);
            LayoutInformationReceiver layoutInformationReceiver = motionScene instanceof LayoutInformationReceiver ? (LayoutInformationReceiver) motionScene : null;
            int i6 = i5 << 9;
            int i7 = (i6 & 234881024) | (3670016 & i6) | 32768 | (29360128 & i6);
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
                rememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                composer.updateRememberedValue(rememberedValue8);
            }
            composer.endReplaceableGroup();
            MutableState mutableState3 = (MutableState) rememberedValue8;
            mutableState3.setValue(Float.valueOf(forcedProgress));
            int i8 = i7 << 9;
            MeasurePolicy rememberMotionLayoutMeasurePolicy = rememberMotionLayoutMeasurePolicy(i4, enumSet3, 0L, ConstraintSet, ConstraintSet2, Transition, mutableState3, motionMeasurer, composer, ((i7 >> 21) & 14) | 18350528 | (i8 & 7168) | (57344 & i8) | (i8 & 458752));
            motionMeasurer.addLayoutInformationReceiver(layoutInformationReceiver);
            float forcedScaleFactor = motionMeasurer.getForcedScaleFactor();
            if (enumSet3.contains(MotionLayoutDebugFlags.NONE) && Float.isNaN(forcedScaleFactor)) {
                composer.startReplaceableGroup(-1401222327);
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, new MotionLayoutKt$MotionLayoutCore$4(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819896774, true, new MotionLayoutKt$MotionLayoutCore$5(content, motionLayoutScope, i7)), rememberMotionLayoutMeasurePolicy, composer, 48, 0);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-1401223142);
                if (!Float.isNaN(forcedScaleFactor)) {
                    modifier2 = ScaleKt.scale(modifier2, motionMeasurer.getForcedScaleFactor());
                }
                composer.startReplaceableGroup(-1990474327);
                ComposerKt.sourceInformation(composer, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(1376089335);
                ComposerKt.sourceInformation(composer, "C(Layout)P(!1,2)71@2788L7,72@2843L7,73@2855L389:Layout.kt#80mrfh");
                ComposerKt.sourceInformationMarkerStart(composer, 103361330, "C:CompositionLocal.kt#9igjgp");
                Object consume = composer.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(composer);
                Density density = (Density) consume;
                ComposerKt.sourceInformationMarkerStart(composer, 103361330, "C:CompositionLocal.kt#9igjgp");
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
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, new MotionLayoutKt$MotionLayoutCore$3$1(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819900388, true, new MotionLayoutKt$MotionLayoutCore$3$2(content, motionLayoutScope, i7)), rememberMotionLayoutMeasurePolicy, composer, 48, 0);
                if (Float.isNaN(forcedScaleFactor)) {
                    composer.startReplaceableGroup(-922833807);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(-922833881);
                    motionMeasurer.drawDebugBounds(boxScopeInstance, forcedScaleFactor, composer, 518);
                    composer.endReplaceableGroup();
                }
                if (enumSet3.contains(MotionLayoutDebugFlags.NONE)) {
                    composer.startReplaceableGroup(-922833689);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(-922833740);
                    motionMeasurer.drawDebug(boxScopeInstance, composer, 70);
                    composer.endReplaceableGroup();
                }
                Unit unit = Unit.INSTANCE;
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            }
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
    }

    /* JADX WARN: Code restructure failed: missing block: B:278:0x0354, code lost:
        if ((((java.lang.Number) r3.getValue()).floatValue() == ((java.lang.Number) r14.getValue()).floatValue()) != false) goto L85;
     */
    @ExperimentalMotionApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MotionLayout(MotionScene motionScene, String str, AnimationSpec<Float> animationSpec, EnumSet<MotionLayoutDebugFlags> enumSet, Modifier modifier, int i, Function0<Unit> function0, Function3<? super MotionLayoutScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i2, int i3) {
        EnumSet<MotionLayoutDebugFlags> enumSet2;
        Transition transition;
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        EnumSet<MotionLayoutDebugFlags> enumSet3;
        String str2;
        float f;
        Modifier modifier2;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(motionScene, "motionScene");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-1330871806);
        ComposerKt.sourceInformation(composer, "C(MotionLayout)P(6,1!1,3,5,7,4)");
        String str3 = (i3 & 2) != 0 ? null : str;
        TweenSpec tween$default = (i3 & 4) != 0 ? AnimationSpecKt.tween$default(0, 0, null, 7, null) : animationSpec;
        if ((i3 & 8) != 0) {
            enumSet2 = EnumSet.of(MotionLayoutDebugFlags.NONE);
            Intrinsics.checkNotNullExpressionValue(enumSet2, "of(MotionLayoutDebugFlags.NONE)");
        } else {
            enumSet2 = enumSet;
        }
        Modifier.Companion companion = (i3 & 16) != 0 ? Modifier.Companion : modifier;
        int i6 = (i3 & 32) != 0 ? 257 : i;
        Function0<Unit> function02 = (i3 & 64) != 0 ? null : function0;
        int i7 = (i2 & 14) | 4608 | (i2 & 112) | (i2 & 57344) | (i2 & 458752) | (i2 & 3670016) | (i2 & 29360128);
        composer.startReplaceableGroup(-1401230387);
        composer.startReplaceableGroup(-3687241);
        ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState<Long> mutableState = (MutableState) rememberedValue;
        motionScene.setUpdateFlag(mutableState);
        if (motionScene.getForcedDrawDebug() != MotionLayoutDebugFlags.UNKNOWN) {
            enumSet2 = EnumSet.of(motionScene.getForcedDrawDebug());
            Intrinsics.checkNotNullExpressionValue(enumSet2, "of(motionScene.getForcedDrawDebug())");
        }
        EnumSet<MotionLayoutDebugFlags> enumSet4 = enumSet2;
        Long value = mutableState.getValue();
        int i8 = i7 & 14;
        composer.startReplaceableGroup(-3686552);
        ComposerKt.sourceInformation(composer, "C(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed = composer.changed(motionScene) | composer.changed(value);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = motionScene.getTransition(CookieSpecs.DEFAULT);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        String str4 = (String) rememberedValue2;
        if (str4 == null) {
            composer.startReplaceableGroup(-488438718);
            composer.endReplaceableGroup();
            transition = null;
        } else {
            composer.startReplaceableGroup(-1401229409);
            Transition Transition = Transition(str4, composer, 0);
            composer.endReplaceableGroup();
            transition = Transition;
        }
        String startConstraintSetId = transition == null ? TtmlNode.START : transition.getStartConstraintSetId();
        String endConstraintSetId = transition == null ? TtmlNode.END : transition.getEndConstraintSetId();
        Long value2 = mutableState.getValue();
        composer.startReplaceableGroup(-3686552);
        ComposerKt.sourceInformation(composer, "C(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed2 = composer.changed(motionScene) | composer.changed(value2);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
            String constraintSet = motionScene.getConstraintSet(startConstraintSetId);
            if (constraintSet == null) {
                constraintSet = motionScene.getConstraintSet(0);
            }
            rememberedValue3 = constraintSet;
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        String str5 = (String) rememberedValue3;
        Long value3 = mutableState.getValue();
        composer.startReplaceableGroup(-3686552);
        ComposerKt.sourceInformation(composer, "C(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed3 = composer.changed(value3) | composer.changed(motionScene);
        Object rememberedValue4 = composer.rememberedValue();
        if (changed3 || rememberedValue4 == Composer.Companion.getEmpty()) {
            String constraintSet2 = motionScene.getConstraintSet(endConstraintSetId);
            if (constraintSet2 == null) {
                constraintSet2 = motionScene.getConstraintSet(1);
            }
            rememberedValue4 = constraintSet2;
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceableGroup();
        String str6 = (String) rememberedValue4;
        composer.startReplaceableGroup(-3686552);
        ComposerKt.sourceInformation(composer, "C(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed4 = composer.changed(motionScene) | composer.changed(str3);
        Object rememberedValue5 = composer.rememberedValue();
        if (changed4 || rememberedValue5 == Composer.Companion.getEmpty()) {
            String constraintSet3 = str3 == null ? null : motionScene.getConstraintSet(str3);
            composer.updateRememberedValue(constraintSet3);
            rememberedValue5 = constraintSet3;
        }
        composer.endReplaceableGroup();
        String str7 = (String) rememberedValue5;
        if (str5 == null || str6 == null) {
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-3686930);
            ComposerKt.sourceInformation(composer, "C(remember)P(1):Composables.kt#9igjgp");
            boolean changed5 = composer.changed(motionScene);
            Object rememberedValue6 = composer.rememberedValue();
            if (changed5 || rememberedValue6 == Composer.Companion.getEmpty()) {
                mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ConstraintLayoutKt.ConstraintSet(str5), null, 2, null);
                composer.updateRememberedValue(mutableStateOf$default);
                rememberedValue6 = mutableStateOf$default;
            }
            composer.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) rememberedValue6;
            composer.startReplaceableGroup(-3686930);
            ComposerKt.sourceInformation(composer, "C(remember)P(1):Composables.kt#9igjgp");
            boolean changed6 = composer.changed(motionScene);
            Object rememberedValue7 = composer.rememberedValue();
            if (changed6 || rememberedValue7 == Composer.Companion.getEmpty()) {
                mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ConstraintLayoutKt.ConstraintSet(str6), null, 2, null);
                composer.updateRememberedValue(mutableStateOf$default2);
                rememberedValue7 = mutableStateOf$default2;
            }
            composer.endReplaceableGroup();
            MutableState mutableState3 = (MutableState) rememberedValue7;
            ConstraintSet ConstraintSet = str7 == null ? null : ConstraintLayoutKt.ConstraintSet(str7);
            composer.startReplaceableGroup(-3687241);
            ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue8 = composer.rememberedValue();
            if (rememberedValue8 == Composer.Companion.getEmpty()) {
                rememberedValue8 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                composer.updateRememberedValue(rememberedValue8);
            }
            composer.endReplaceableGroup();
            Animatable animatable = (Animatable) rememberedValue8;
            composer.startReplaceableGroup(-3686930);
            ComposerKt.sourceInformation(composer, "C(remember)P(1):Composables.kt#9igjgp");
            boolean changed7 = composer.changed(motionScene);
            Object rememberedValue9 = composer.rememberedValue();
            if (changed7 || rememberedValue9 == Composer.Companion.getEmpty()) {
                rememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
                composer.updateRememberedValue(rememberedValue9);
            }
            composer.endReplaceableGroup();
            MutableState mutableState4 = (MutableState) rememberedValue9;
            composer.startReplaceableGroup(-3687241);
            ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue10 = composer.rememberedValue();
            if (rememberedValue10 == Composer.Companion.getEmpty()) {
                rememberedValue10 = ChannelKt.Channel$default(-1, null, null, 6, null);
                composer.updateRememberedValue(rememberedValue10);
            }
            composer.endReplaceableGroup();
            Channel channel = (Channel) rememberedValue10;
            if (ConstraintSet != null) {
                composer.startReplaceableGroup(-1401228155);
                EffectsKt.SideEffect(new MotionLayoutKt$MotionLayoutCore$1(channel, ConstraintSet), composer, 0);
                enumSet3 = enumSet4;
                str2 = "C(remember):Composables.kt#9igjgp";
                f = 0.0f;
                i4 = -3687241;
                modifier2 = companion;
                EffectsKt.LaunchedEffect(motionScene, channel, new MotionLayoutKt$MotionLayoutCore$2(channel, animatable, tween$default, function02, mutableState4, mutableState2, mutableState3, null), composer, i8 | 64);
                composer.endReplaceableGroup();
            } else {
                enumSet3 = enumSet4;
                str2 = "C(remember):Composables.kt#9igjgp";
                f = 0.0f;
                modifier2 = companion;
                i4 = -3687241;
                composer.startReplaceableGroup(-1401227298);
                composer.endReplaceableGroup();
            }
            composer.startReplaceableGroup(i4);
            ComposerKt.sourceInformation(composer, str2);
            Object rememberedValue11 = composer.rememberedValue();
            if (rememberedValue11 == Composer.Companion.getEmpty()) {
                i5 = 2;
                rememberedValue11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(f), null, 2, null);
                composer.updateRememberedValue(rememberedValue11);
            } else {
                i5 = 2;
            }
            composer.endReplaceableGroup();
            MutableState mutableState5 = (MutableState) rememberedValue11;
            float forcedProgress = motionScene.getForcedProgress();
            if (!Float.isNaN(forcedProgress)) {
            }
            motionScene.resetForcedProgress();
            forcedProgress = ((Number) animatable.getValue()).floatValue();
            mutableState5.setValue(animatable.getValue());
            ConstraintSet m5921MotionLayoutCore$lambda8 = m5921MotionLayoutCore$lambda8(mutableState2);
            ConstraintSet m5915MotionLayoutCore$lambda11 = m5915MotionLayoutCore$lambda11(mutableState3);
            JSONMotionScene jSONMotionScene = motionScene instanceof JSONMotionScene ? (JSONMotionScene) motionScene : null;
            int i9 = i7 << 6;
            int i10 = (i9 & 29360128) | (i9 & 3670016) | 32768 | ((i7 << 3) & 234881024);
            composer.startReplaceableGroup(-1330870962);
            ComposerKt.sourceInformation(composer, "C(MotionLayout)P(7,2,8,6,1,3,4,5)");
            int i11 = (i10 & 14) | 32768 | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (i10 & 458752) | (i10 & 3670016) | (i10 & 29360128) | (i10 & 234881024);
            composer.startReplaceableGroup(-1401224268);
            composer.startReplaceableGroup(i4);
            ComposerKt.sourceInformation(composer, str2);
            Object rememberedValue12 = composer.rememberedValue();
            if (rememberedValue12 == Composer.Companion.getEmpty()) {
                rememberedValue12 = new MotionMeasurer();
                composer.updateRememberedValue(rememberedValue12);
            }
            composer.endReplaceableGroup();
            MotionMeasurer motionMeasurer = (MotionMeasurer) rememberedValue12;
            composer.startReplaceableGroup(i4);
            ComposerKt.sourceInformation(composer, str2);
            Object rememberedValue13 = composer.rememberedValue();
            if (rememberedValue13 == Composer.Companion.getEmpty()) {
                rememberedValue13 = new MotionLayoutScope(motionMeasurer);
                composer.updateRememberedValue(rememberedValue13);
            }
            composer.endReplaceableGroup();
            MotionLayoutScope motionLayoutScope = (MotionLayoutScope) rememberedValue13;
            composer.startReplaceableGroup(i4);
            ComposerKt.sourceInformation(composer, str2);
            Object rememberedValue14 = composer.rememberedValue();
            if (rememberedValue14 == Composer.Companion.getEmpty()) {
                rememberedValue14 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(f), null, i5, null);
                composer.updateRememberedValue(rememberedValue14);
            }
            composer.endReplaceableGroup();
            MutableState mutableState6 = (MutableState) rememberedValue14;
            mutableState6.setValue(Float.valueOf(forcedProgress));
            int i12 = i11 << 9;
            EnumSet<MotionLayoutDebugFlags> enumSet5 = enumSet3;
            MeasurePolicy rememberMotionLayoutMeasurePolicy = rememberMotionLayoutMeasurePolicy(i6, enumSet5, 0L, m5921MotionLayoutCore$lambda8, m5915MotionLayoutCore$lambda11, transition, mutableState6, motionMeasurer, composer, ((i11 >> 21) & 14) | 18350528 | (i12 & 7168) | (i12 & 57344) | (i12 & 458752));
            motionMeasurer.addLayoutInformationReceiver(jSONMotionScene);
            float forcedScaleFactor = motionMeasurer.getForcedScaleFactor();
            if (enumSet5.contains(MotionLayoutDebugFlags.NONE) && Float.isNaN(forcedScaleFactor)) {
                composer.startReplaceableGroup(-1401222327);
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, new MotionLayoutKt$MotionLayoutCore$4(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819896774, true, new MotionLayoutKt$MotionLayoutCore$5(content, motionLayoutScope, i11)), rememberMotionLayoutMeasurePolicy, composer, 48, 0);
                composer.endReplaceableGroup();
            } else {
                Modifier modifier3 = modifier2;
                composer.startReplaceableGroup(-1401223142);
                Modifier scale = !Float.isNaN(forcedScaleFactor) ? ScaleKt.scale(modifier3, motionMeasurer.getForcedScaleFactor()) : modifier3;
                composer.startReplaceableGroup(-1990474327);
                ComposerKt.sourceInformation(composer, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(1376089335);
                ComposerKt.sourceInformation(composer, "C(Layout)P(!1,2)71@2788L7,72@2843L7,73@2855L389:Layout.kt#80mrfh");
                ComposerKt.sourceInformationMarkerStart(composer, 103361330, "C:CompositionLocal.kt#9igjgp");
                Object consume = composer.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(composer);
                Density density = (Density) consume;
                ComposerKt.sourceInformationMarkerStart(composer, 103361330, "C:CompositionLocal.kt#9igjgp");
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
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(scale, false, new MotionLayoutKt$MotionLayoutCore$3$1(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819900388, true, new MotionLayoutKt$MotionLayoutCore$3$2(content, motionLayoutScope, i11)), rememberMotionLayoutMeasurePolicy, composer, 48, 0);
                if (Float.isNaN(forcedScaleFactor)) {
                    composer.startReplaceableGroup(-922833807);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(-922833881);
                    motionMeasurer.drawDebugBounds(boxScopeInstance, forcedScaleFactor, composer, 518);
                    composer.endReplaceableGroup();
                }
                if (enumSet5.contains(MotionLayoutDebugFlags.NONE)) {
                    composer.startReplaceableGroup(-922833689);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(-922833740);
                    motionMeasurer.drawDebug(boxScopeInstance, composer, 70);
                    composer.endReplaceableGroup();
                }
                Unit unit = Unit.INSTANCE;
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            }
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
    }

    @ExperimentalMotionApi
    public static final void MotionLayout(ConstraintSet start, ConstraintSet end, Transition transition, float f, EnumSet<MotionLayoutDebugFlags> enumSet, LayoutInformationReceiver layoutInformationReceiver, Modifier modifier, int i, Function3<? super MotionLayoutScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i2, int i3) {
        EnumSet<MotionLayoutDebugFlags> enumSet2;
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-1330870962);
        ComposerKt.sourceInformation(composer, "C(MotionLayout)P(7,2,8,6,1,3,4,5)");
        Transition transition2 = (i3 & 4) != 0 ? null : transition;
        if ((i3 & 16) != 0) {
            EnumSet<MotionLayoutDebugFlags> of = EnumSet.of(MotionLayoutDebugFlags.NONE);
            Intrinsics.checkNotNullExpressionValue(of, "of(MotionLayoutDebugFlags.NONE)");
            enumSet2 = of;
        } else {
            enumSet2 = enumSet;
        }
        LayoutInformationReceiver layoutInformationReceiver2 = (i3 & 32) != 0 ? null : layoutInformationReceiver;
        Modifier.Companion companion = (i3 & 64) != 0 ? Modifier.Companion : modifier;
        int i4 = (i3 & 128) != 0 ? 257 : i;
        int i5 = (i2 & 14) | 32768 | (i2 & 112) | (i2 & 896) | (i2 & 7168) | (i2 & 458752) | (3670016 & i2) | (29360128 & i2) | (i2 & 234881024);
        composer.startReplaceableGroup(-1401224268);
        composer.startReplaceableGroup(-3687241);
        ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new MotionMeasurer();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MotionMeasurer motionMeasurer = (MotionMeasurer) rememberedValue;
        composer.startReplaceableGroup(-3687241);
        ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new MotionLayoutScope(motionMeasurer);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        MotionLayoutScope motionLayoutScope = (MotionLayoutScope) rememberedValue2;
        composer.startReplaceableGroup(-3687241);
        ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue3;
        mutableState.setValue(Float.valueOf(f));
        int i6 = i5 << 9;
        Modifier modifier2 = companion;
        MeasurePolicy rememberMotionLayoutMeasurePolicy = rememberMotionLayoutMeasurePolicy(i4, enumSet2, 0L, start, end, transition2, mutableState, motionMeasurer, composer, ((i5 >> 21) & 14) | 18350528 | (i6 & 7168) | (57344 & i6) | (i6 & 458752));
        motionMeasurer.addLayoutInformationReceiver(layoutInformationReceiver2);
        float forcedScaleFactor = motionMeasurer.getForcedScaleFactor();
        if (!enumSet2.contains(MotionLayoutDebugFlags.NONE) || !Float.isNaN(forcedScaleFactor)) {
            composer.startReplaceableGroup(-1401223142);
            Modifier scale = !Float.isNaN(forcedScaleFactor) ? ScaleKt.scale(modifier2, motionMeasurer.getForcedScaleFactor()) : modifier2;
            composer.startReplaceableGroup(-1990474327);
            ComposerKt.sourceInformation(composer, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(1376089335);
            ComposerKt.sourceInformation(composer, "C(Layout)P(!1,2)71@2788L7,72@2843L7,73@2855L389:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(composer, 103361330, "C:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(composer);
            Density density = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(composer, 103361330, "C:CompositionLocal.kt#9igjgp");
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
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(scale, false, new MotionLayoutKt$MotionLayoutCore$3$1(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819900388, true, new MotionLayoutKt$MotionLayoutCore$3$2(content, motionLayoutScope, i5)), rememberMotionLayoutMeasurePolicy, composer, 48, 0);
            if (!Float.isNaN(forcedScaleFactor)) {
                composer.startReplaceableGroup(-922833881);
                motionMeasurer.drawDebugBounds(boxScopeInstance, forcedScaleFactor, composer, 518);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-922833807);
                composer.endReplaceableGroup();
            }
            if (!enumSet2.contains(MotionLayoutDebugFlags.NONE)) {
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
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, new MotionLayoutKt$MotionLayoutCore$4(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819896774, true, new MotionLayoutKt$MotionLayoutCore$5(content, motionLayoutScope, i5)), rememberMotionLayoutMeasurePolicy, composer, 48, 0);
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    /* JADX WARN: Code restructure failed: missing block: B:278:0x032c, code lost:
        if ((((java.lang.Number) r3.getValue()).floatValue() == ((java.lang.Number) r14.getValue()).floatValue()) != false) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MotionLayoutCore(MotionScene motionScene, String str, AnimationSpec<Float> animationSpec, EnumSet<MotionLayoutDebugFlags> enumSet, Modifier modifier, int i, Function0<Unit> function0, Function3<? super MotionLayoutScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i2, int i3) {
        EnumSet<MotionLayoutDebugFlags> enumSet2;
        Transition transition;
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        EnumSet<MotionLayoutDebugFlags> enumSet3;
        String str2;
        float f;
        Modifier modifier2;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(motionScene, "motionScene");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-1401230387);
        String str3 = (i3 & 2) != 0 ? null : str;
        TweenSpec tween$default = (i3 & 4) != 0 ? AnimationSpecKt.tween$default(0, 0, null, 7, null) : animationSpec;
        if ((i3 & 8) != 0) {
            enumSet2 = EnumSet.of(MotionLayoutDebugFlags.NONE);
            Intrinsics.checkNotNullExpressionValue(enumSet2, "of(MotionLayoutDebugFlags.NONE)");
        } else {
            enumSet2 = enumSet;
        }
        Modifier.Companion companion = (i3 & 16) != 0 ? Modifier.Companion : modifier;
        int i6 = (i3 & 32) != 0 ? 257 : i;
        Function0<Unit> function02 = (i3 & 64) != 0 ? null : function0;
        composer.startReplaceableGroup(-3687241);
        ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState<Long> mutableState = (MutableState) rememberedValue;
        motionScene.setUpdateFlag(mutableState);
        if (motionScene.getForcedDrawDebug() != MotionLayoutDebugFlags.UNKNOWN) {
            enumSet2 = EnumSet.of(motionScene.getForcedDrawDebug());
            Intrinsics.checkNotNullExpressionValue(enumSet2, "of(motionScene.getForcedDrawDebug())");
        }
        EnumSet<MotionLayoutDebugFlags> enumSet4 = enumSet2;
        Long value = mutableState.getValue();
        int i7 = i2 & 14;
        composer.startReplaceableGroup(-3686552);
        ComposerKt.sourceInformation(composer, "C(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed = composer.changed(motionScene) | composer.changed(value);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = motionScene.getTransition(CookieSpecs.DEFAULT);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        String str4 = (String) rememberedValue2;
        if (str4 == null) {
            composer.startReplaceableGroup(-488438718);
            composer.endReplaceableGroup();
            transition = null;
        } else {
            composer.startReplaceableGroup(-1401229409);
            Transition Transition = Transition(str4, composer, 0);
            composer.endReplaceableGroup();
            transition = Transition;
        }
        String startConstraintSetId = transition == null ? TtmlNode.START : transition.getStartConstraintSetId();
        String endConstraintSetId = transition == null ? TtmlNode.END : transition.getEndConstraintSetId();
        Long value2 = mutableState.getValue();
        composer.startReplaceableGroup(-3686552);
        ComposerKt.sourceInformation(composer, "C(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed2 = composer.changed(motionScene) | composer.changed(value2);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
            String constraintSet = motionScene.getConstraintSet(startConstraintSetId);
            if (constraintSet == null) {
                constraintSet = motionScene.getConstraintSet(0);
            }
            rememberedValue3 = constraintSet;
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        String str5 = (String) rememberedValue3;
        Long value3 = mutableState.getValue();
        composer.startReplaceableGroup(-3686552);
        ComposerKt.sourceInformation(composer, "C(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed3 = composer.changed(value3) | composer.changed(motionScene);
        Object rememberedValue4 = composer.rememberedValue();
        if (changed3 || rememberedValue4 == Composer.Companion.getEmpty()) {
            String constraintSet2 = motionScene.getConstraintSet(endConstraintSetId);
            if (constraintSet2 == null) {
                constraintSet2 = motionScene.getConstraintSet(1);
            }
            rememberedValue4 = constraintSet2;
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceableGroup();
        String str6 = (String) rememberedValue4;
        composer.startReplaceableGroup(-3686552);
        ComposerKt.sourceInformation(composer, "C(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed4 = composer.changed(motionScene) | composer.changed(str3);
        Object rememberedValue5 = composer.rememberedValue();
        if (changed4 || rememberedValue5 == Composer.Companion.getEmpty()) {
            String constraintSet3 = str3 == null ? null : motionScene.getConstraintSet(str3);
            composer.updateRememberedValue(constraintSet3);
            rememberedValue5 = constraintSet3;
        }
        composer.endReplaceableGroup();
        String str7 = (String) rememberedValue5;
        if (str5 == null || str6 == null) {
            composer.endReplaceableGroup();
            return;
        }
        composer.startReplaceableGroup(-3686930);
        ComposerKt.sourceInformation(composer, "C(remember)P(1):Composables.kt#9igjgp");
        boolean changed5 = composer.changed(motionScene);
        Object rememberedValue6 = composer.rememberedValue();
        if (changed5 || rememberedValue6 == Composer.Companion.getEmpty()) {
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ConstraintLayoutKt.ConstraintSet(str5), null, 2, null);
            composer.updateRememberedValue(mutableStateOf$default);
            rememberedValue6 = mutableStateOf$default;
        }
        composer.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) rememberedValue6;
        composer.startReplaceableGroup(-3686930);
        ComposerKt.sourceInformation(composer, "C(remember)P(1):Composables.kt#9igjgp");
        boolean changed6 = composer.changed(motionScene);
        Object rememberedValue7 = composer.rememberedValue();
        if (changed6 || rememberedValue7 == Composer.Companion.getEmpty()) {
            mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ConstraintLayoutKt.ConstraintSet(str6), null, 2, null);
            composer.updateRememberedValue(mutableStateOf$default2);
            rememberedValue7 = mutableStateOf$default2;
        }
        composer.endReplaceableGroup();
        MutableState mutableState3 = (MutableState) rememberedValue7;
        ConstraintSet ConstraintSet = str7 == null ? null : ConstraintLayoutKt.ConstraintSet(str7);
        composer.startReplaceableGroup(-3687241);
        ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        Object rememberedValue8 = composer.rememberedValue();
        if (rememberedValue8 == Composer.Companion.getEmpty()) {
            rememberedValue8 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
            composer.updateRememberedValue(rememberedValue8);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) rememberedValue8;
        composer.startReplaceableGroup(-3686930);
        ComposerKt.sourceInformation(composer, "C(remember)P(1):Composables.kt#9igjgp");
        boolean changed7 = composer.changed(motionScene);
        Object rememberedValue9 = composer.rememberedValue();
        if (changed7 || rememberedValue9 == Composer.Companion.getEmpty()) {
            rememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
            composer.updateRememberedValue(rememberedValue9);
        }
        composer.endReplaceableGroup();
        MutableState mutableState4 = (MutableState) rememberedValue9;
        composer.startReplaceableGroup(-3687241);
        ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        Object rememberedValue10 = composer.rememberedValue();
        if (rememberedValue10 == Composer.Companion.getEmpty()) {
            rememberedValue10 = ChannelKt.Channel$default(-1, null, null, 6, null);
            composer.updateRememberedValue(rememberedValue10);
        }
        composer.endReplaceableGroup();
        Channel channel = (Channel) rememberedValue10;
        if (ConstraintSet != null) {
            composer.startReplaceableGroup(-1401228155);
            EffectsKt.SideEffect(new MotionLayoutKt$MotionLayoutCore$1(channel, ConstraintSet), composer, 0);
            enumSet3 = enumSet4;
            str2 = "C(remember):Composables.kt#9igjgp";
            f = 0.0f;
            i4 = -3687241;
            modifier2 = companion;
            EffectsKt.LaunchedEffect(motionScene, channel, new MotionLayoutKt$MotionLayoutCore$2(channel, animatable, tween$default, function02, mutableState4, mutableState2, mutableState3, null), composer, i7 | 64);
            composer.endReplaceableGroup();
        } else {
            enumSet3 = enumSet4;
            str2 = "C(remember):Composables.kt#9igjgp";
            f = 0.0f;
            modifier2 = companion;
            i4 = -3687241;
            composer.startReplaceableGroup(-1401227298);
            composer.endReplaceableGroup();
        }
        composer.startReplaceableGroup(i4);
        ComposerKt.sourceInformation(composer, str2);
        Object rememberedValue11 = composer.rememberedValue();
        if (rememberedValue11 == Composer.Companion.getEmpty()) {
            i5 = 2;
            rememberedValue11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(f), null, 2, null);
            composer.updateRememberedValue(rememberedValue11);
        } else {
            i5 = 2;
        }
        composer.endReplaceableGroup();
        MutableState mutableState5 = (MutableState) rememberedValue11;
        float forcedProgress = motionScene.getForcedProgress();
        if (!Float.isNaN(forcedProgress)) {
        }
        motionScene.resetForcedProgress();
        forcedProgress = ((Number) animatable.getValue()).floatValue();
        mutableState5.setValue(animatable.getValue());
        ConstraintSet m5921MotionLayoutCore$lambda8 = m5921MotionLayoutCore$lambda8(mutableState2);
        ConstraintSet m5915MotionLayoutCore$lambda11 = m5915MotionLayoutCore$lambda11(mutableState3);
        JSONMotionScene jSONMotionScene = motionScene instanceof JSONMotionScene ? (JSONMotionScene) motionScene : null;
        int i8 = i2 << 6;
        int i9 = (i8 & 29360128) | (i8 & 3670016) | 32768 | ((i2 << 3) & 234881024);
        composer.startReplaceableGroup(-1330870962);
        ComposerKt.sourceInformation(composer, "C(MotionLayout)P(7,2,8,6,1,3,4,5)");
        int i10 = (3670016 & i9) | (i9 & 14) | 32768 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (i9 & 458752) | (i9 & 29360128) | (i9 & 234881024);
        composer.startReplaceableGroup(-1401224268);
        composer.startReplaceableGroup(i4);
        ComposerKt.sourceInformation(composer, str2);
        Object rememberedValue12 = composer.rememberedValue();
        if (rememberedValue12 == Composer.Companion.getEmpty()) {
            rememberedValue12 = new MotionMeasurer();
            composer.updateRememberedValue(rememberedValue12);
        }
        composer.endReplaceableGroup();
        MotionMeasurer motionMeasurer = (MotionMeasurer) rememberedValue12;
        composer.startReplaceableGroup(i4);
        ComposerKt.sourceInformation(composer, str2);
        Object rememberedValue13 = composer.rememberedValue();
        if (rememberedValue13 == Composer.Companion.getEmpty()) {
            rememberedValue13 = new MotionLayoutScope(motionMeasurer);
            composer.updateRememberedValue(rememberedValue13);
        }
        composer.endReplaceableGroup();
        MotionLayoutScope motionLayoutScope = (MotionLayoutScope) rememberedValue13;
        composer.startReplaceableGroup(i4);
        ComposerKt.sourceInformation(composer, str2);
        Object rememberedValue14 = composer.rememberedValue();
        if (rememberedValue14 == Composer.Companion.getEmpty()) {
            rememberedValue14 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(f), null, i5, null);
            composer.updateRememberedValue(rememberedValue14);
        }
        composer.endReplaceableGroup();
        MutableState mutableState6 = (MutableState) rememberedValue14;
        mutableState6.setValue(Float.valueOf(forcedProgress));
        int i11 = i10 << 9;
        EnumSet<MotionLayoutDebugFlags> enumSet5 = enumSet3;
        MeasurePolicy rememberMotionLayoutMeasurePolicy = rememberMotionLayoutMeasurePolicy(i6, enumSet5, 0L, m5921MotionLayoutCore$lambda8, m5915MotionLayoutCore$lambda11, transition, mutableState6, motionMeasurer, composer, ((i10 >> 21) & 14) | 18350528 | (i11 & 7168) | (57344 & i11) | (i11 & 458752));
        motionMeasurer.addLayoutInformationReceiver(jSONMotionScene);
        float forcedScaleFactor = motionMeasurer.getForcedScaleFactor();
        if (!enumSet5.contains(MotionLayoutDebugFlags.NONE) || !Float.isNaN(forcedScaleFactor)) {
            Modifier modifier3 = modifier2;
            composer.startReplaceableGroup(-1401223142);
            Modifier scale = !Float.isNaN(forcedScaleFactor) ? ScaleKt.scale(modifier3, motionMeasurer.getForcedScaleFactor()) : modifier3;
            composer.startReplaceableGroup(-1990474327);
            ComposerKt.sourceInformation(composer, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(1376089335);
            ComposerKt.sourceInformation(composer, "C(Layout)P(!1,2)71@2788L7,72@2843L7,73@2855L389:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(composer, 103361330, "C:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(composer);
            Density density = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(composer, 103361330, "C:CompositionLocal.kt#9igjgp");
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
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(scale, false, new MotionLayoutKt$MotionLayoutCore$3$1(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819900388, true, new MotionLayoutKt$MotionLayoutCore$3$2(content, motionLayoutScope, i10)), rememberMotionLayoutMeasurePolicy, composer, 48, 0);
            if (!Float.isNaN(forcedScaleFactor)) {
                composer.startReplaceableGroup(-922833881);
                motionMeasurer.drawDebugBounds(boxScopeInstance, forcedScaleFactor, composer, 518);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-922833807);
                composer.endReplaceableGroup();
            }
            if (!enumSet5.contains(MotionLayoutDebugFlags.NONE)) {
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
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, new MotionLayoutKt$MotionLayoutCore$4(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819896774, true, new MotionLayoutKt$MotionLayoutCore$5(content, motionLayoutScope, i10)), rememberMotionLayoutMeasurePolicy, composer, 48, 0);
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    /* renamed from: MotionLayoutCore$lambda-8 */
    public static final ConstraintSet m5921MotionLayoutCore$lambda8(MutableState<ConstraintSet> mutableState) {
        return mutableState.getValue();
    }

    /* renamed from: MotionLayoutCore$lambda-11 */
    public static final ConstraintSet m5915MotionLayoutCore$lambda11(MutableState<ConstraintSet> mutableState) {
        return mutableState.getValue();
    }

    /* renamed from: MotionLayoutCore$lambda-16 */
    public static final boolean m5917MotionLayoutCore$lambda16(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* renamed from: MotionLayoutCore$lambda-17 */
    public static final void m5918MotionLayoutCore$lambda17(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x01a5, code lost:
        if ((m5919MotionLayoutCore$lambda26(r5) == r21) != false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MotionLayoutCore(MotionScene motionScene, float f, EnumSet<MotionLayoutDebugFlags> enumSet, Modifier modifier, int i, Function3<? super MotionLayoutScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i2, int i3) {
        EnumSet<MotionLayoutDebugFlags> enumSet2;
        Transition Transition;
        Intrinsics.checkNotNullParameter(motionScene, "motionScene");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-1401226512);
        if ((i3 & 4) != 0) {
            enumSet2 = EnumSet.of(MotionLayoutDebugFlags.NONE);
            Intrinsics.checkNotNullExpressionValue(enumSet2, "of(MotionLayoutDebugFlags.NONE)");
        } else {
            enumSet2 = enumSet;
        }
        Modifier modifier2 = (i3 & 8) != 0 ? Modifier.Companion : modifier;
        int i4 = (i3 & 16) != 0 ? 257 : i;
        composer.startReplaceableGroup(-3687241);
        ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState<Long> mutableState = (MutableState) rememberedValue;
        motionScene.setUpdateFlag(mutableState);
        if (motionScene.getForcedDrawDebug() != MotionLayoutDebugFlags.UNKNOWN) {
            enumSet2 = EnumSet.of(motionScene.getForcedDrawDebug());
            Intrinsics.checkNotNullExpressionValue(enumSet2, "of(motionScene.getForcedDrawDebug())");
        }
        EnumSet<MotionLayoutDebugFlags> enumSet3 = enumSet2;
        Long value = mutableState.getValue();
        composer.startReplaceableGroup(-3686552);
        ComposerKt.sourceInformation(composer, "C(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed = composer.changed(value) | composer.changed(motionScene);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = motionScene.getTransition(CookieSpecs.DEFAULT);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        String str = (String) rememberedValue2;
        if (str == null) {
            composer.startReplaceableGroup(-488322840);
            composer.endReplaceableGroup();
            Transition = null;
        } else {
            composer.startReplaceableGroup(-1401225671);
            Transition = Transition(str, composer, 0);
            composer.endReplaceableGroup();
        }
        String startConstraintSetId = Transition == null ? TtmlNode.START : Transition.getStartConstraintSetId();
        String endConstraintSetId = Transition == null ? TtmlNode.END : Transition.getEndConstraintSetId();
        Long value2 = mutableState.getValue();
        composer.startReplaceableGroup(-3686552);
        ComposerKt.sourceInformation(composer, "C(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed2 = composer.changed(motionScene) | composer.changed(value2);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
            String constraintSet = motionScene.getConstraintSet(startConstraintSetId);
            if (constraintSet == null) {
                constraintSet = motionScene.getConstraintSet(0);
            }
            rememberedValue3 = constraintSet;
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        String str2 = (String) rememberedValue3;
        Long value3 = mutableState.getValue();
        composer.startReplaceableGroup(-3686552);
        ComposerKt.sourceInformation(composer, "C(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed3 = composer.changed(value3) | composer.changed(motionScene);
        Object rememberedValue4 = composer.rememberedValue();
        if (changed3 || rememberedValue4 == Composer.Companion.getEmpty()) {
            String constraintSet2 = motionScene.getConstraintSet(endConstraintSetId);
            if (constraintSet2 == null) {
                constraintSet2 = motionScene.getConstraintSet(1);
            }
            rememberedValue4 = constraintSet2;
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceableGroup();
        String str3 = (String) rememberedValue4;
        if (str2 == null || str3 == null) {
            composer.endReplaceableGroup();
            return;
        }
        ConstraintSet ConstraintSet = ConstraintLayoutKt.ConstraintSet(str2);
        ConstraintSet ConstraintSet2 = ConstraintLayoutKt.ConstraintSet(str3);
        composer.startReplaceableGroup(-3687241);
        ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        Object rememberedValue5 = composer.rememberedValue();
        if (rememberedValue5 == Composer.Companion.getEmpty()) {
            rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
            composer.updateRememberedValue(rememberedValue5);
        }
        composer.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) rememberedValue5;
        float forcedProgress = motionScene.getForcedProgress();
        if (!Float.isNaN(forcedProgress)) {
        }
        motionScene.resetForcedProgress();
        forcedProgress = f;
        m5920MotionLayoutCore$lambda27(mutableState2, f);
        LayoutInformationReceiver layoutInformationReceiver = motionScene instanceof LayoutInformationReceiver ? (LayoutInformationReceiver) motionScene : null;
        int i5 = i2 << 9;
        int i6 = (i5 & 234881024) | (3670016 & i5) | 32768 | (29360128 & i5);
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
            rememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
            composer.updateRememberedValue(rememberedValue8);
        }
        composer.endReplaceableGroup();
        MutableState mutableState3 = (MutableState) rememberedValue8;
        mutableState3.setValue(Float.valueOf(forcedProgress));
        int i7 = i6 << 9;
        MeasurePolicy rememberMotionLayoutMeasurePolicy = rememberMotionLayoutMeasurePolicy(i4, enumSet3, 0L, ConstraintSet, ConstraintSet2, Transition, mutableState3, motionMeasurer, composer, ((i6 >> 21) & 14) | 18350528 | (i7 & 7168) | (57344 & i7) | (i7 & 458752));
        motionMeasurer.addLayoutInformationReceiver(layoutInformationReceiver);
        float forcedScaleFactor = motionMeasurer.getForcedScaleFactor();
        if (!enumSet3.contains(MotionLayoutDebugFlags.NONE) || !Float.isNaN(forcedScaleFactor)) {
            composer.startReplaceableGroup(-1401223142);
            if (!Float.isNaN(forcedScaleFactor)) {
                modifier2 = ScaleKt.scale(modifier2, motionMeasurer.getForcedScaleFactor());
            }
            composer.startReplaceableGroup(-1990474327);
            ComposerKt.sourceInformation(composer, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(1376089335);
            ComposerKt.sourceInformation(composer, "C(Layout)P(!1,2)71@2788L7,72@2843L7,73@2855L389:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(composer, 103361330, "C:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(composer);
            Density density = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(composer, 103361330, "C:CompositionLocal.kt#9igjgp");
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
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, new MotionLayoutKt$MotionLayoutCore$3$1(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819900388, true, new MotionLayoutKt$MotionLayoutCore$3$2(content, motionLayoutScope, i6)), rememberMotionLayoutMeasurePolicy, composer, 48, 0);
            if (!Float.isNaN(forcedScaleFactor)) {
                composer.startReplaceableGroup(-922833881);
                motionMeasurer.drawDebugBounds(boxScopeInstance, forcedScaleFactor, composer, 518);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-922833807);
                composer.endReplaceableGroup();
            }
            if (!enumSet3.contains(MotionLayoutDebugFlags.NONE)) {
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
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, new MotionLayoutKt$MotionLayoutCore$4(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819896774, true, new MotionLayoutKt$MotionLayoutCore$5(content, motionLayoutScope, i6)), rememberMotionLayoutMeasurePolicy, composer, 48, 0);
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    /* renamed from: MotionLayoutCore$lambda-26 */
    public static final float m5919MotionLayoutCore$lambda26(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    /* renamed from: MotionLayoutCore$lambda-27 */
    public static final void m5920MotionLayoutCore$lambda27(MutableState<Float> mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }

    public static final void MotionLayoutCore(ConstraintSet start, ConstraintSet end, Transition transition, float f, EnumSet<MotionLayoutDebugFlags> enumSet, LayoutInformationReceiver layoutInformationReceiver, Modifier modifier, int i, Function3<? super MotionLayoutScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i2, int i3) {
        EnumSet<MotionLayoutDebugFlags> enumSet2;
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-1401224268);
        Transition transition2 = (i3 & 4) != 0 ? null : transition;
        if ((i3 & 16) != 0) {
            EnumSet<MotionLayoutDebugFlags> of = EnumSet.of(MotionLayoutDebugFlags.NONE);
            Intrinsics.checkNotNullExpressionValue(of, "of(MotionLayoutDebugFlags.NONE)");
            enumSet2 = of;
        } else {
            enumSet2 = enumSet;
        }
        LayoutInformationReceiver layoutInformationReceiver2 = (i3 & 32) != 0 ? null : layoutInformationReceiver;
        Modifier.Companion companion = (i3 & 64) != 0 ? Modifier.Companion : modifier;
        int i4 = (i3 & 128) != 0 ? 257 : i;
        composer.startReplaceableGroup(-3687241);
        ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new MotionMeasurer();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MotionMeasurer motionMeasurer = (MotionMeasurer) rememberedValue;
        composer.startReplaceableGroup(-3687241);
        ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new MotionLayoutScope(motionMeasurer);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        MotionLayoutScope motionLayoutScope = (MotionLayoutScope) rememberedValue2;
        composer.startReplaceableGroup(-3687241);
        ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue3;
        mutableState.setValue(Float.valueOf(f));
        int i5 = i2 << 9;
        Modifier modifier2 = companion;
        MeasurePolicy rememberMotionLayoutMeasurePolicy = rememberMotionLayoutMeasurePolicy(i4, enumSet2, 0L, start, end, transition2, mutableState, motionMeasurer, composer, ((i2 >> 21) & 14) | 18350528 | (i5 & 7168) | (57344 & i5) | (i5 & 458752));
        motionMeasurer.addLayoutInformationReceiver(layoutInformationReceiver2);
        float forcedScaleFactor = motionMeasurer.getForcedScaleFactor();
        if (!enumSet2.contains(MotionLayoutDebugFlags.NONE) || !Float.isNaN(forcedScaleFactor)) {
            composer.startReplaceableGroup(-1401223142);
            Modifier scale = !Float.isNaN(forcedScaleFactor) ? ScaleKt.scale(modifier2, motionMeasurer.getForcedScaleFactor()) : modifier2;
            composer.startReplaceableGroup(-1990474327);
            ComposerKt.sourceInformation(composer, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(1376089335);
            ComposerKt.sourceInformation(composer, "C(Layout)P(!1,2)71@2788L7,72@2843L7,73@2855L389:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(composer, 103361330, "C:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(composer);
            Density density = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(composer, 103361330, "C:CompositionLocal.kt#9igjgp");
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
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(scale, false, new MotionLayoutKt$MotionLayoutCore$3$1(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819900388, true, new MotionLayoutKt$MotionLayoutCore$3$2(content, motionLayoutScope, i2)), rememberMotionLayoutMeasurePolicy, composer, 48, 0);
            if (!Float.isNaN(forcedScaleFactor)) {
                composer.startReplaceableGroup(-922833881);
                motionMeasurer.drawDebugBounds(boxScopeInstance, forcedScaleFactor, composer, 518);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-922833807);
                composer.endReplaceableGroup();
            }
            if (!enumSet2.contains(MotionLayoutDebugFlags.NONE)) {
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
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, new MotionLayoutKt$MotionLayoutCore$4(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819896774, true, new MotionLayoutKt$MotionLayoutCore$5(content, motionLayoutScope, i2)), rememberMotionLayoutMeasurePolicy, composer, 48, 0);
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
    }

    public static final MotionScene MotionScene(String content, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(1405665503);
        ComposerKt.sourceInformation(composer, "C(MotionScene)");
        composer.startReplaceableGroup(-3686930);
        ComposerKt.sourceInformation(composer, "C(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(content);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new JSONMotionScene(content);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return (JSONMotionScene) rememberedValue;
    }

    public static final Transition Transition(String content, Composer composer, int i) {
        final CLObject cLObject;
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(811760201);
        ComposerKt.sourceInformation(composer, "C(Transition)");
        composer.startReplaceableGroup(-3686930);
        ComposerKt.sourceInformation(composer, "C(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(content);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            try {
                cLObject = CLParser.parse(content);
            } catch (CLParsingException e) {
                System.err.println(Intrinsics.stringPlus("Error parsing JSON ", e));
                cLObject = null;
            }
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(cLObject != null ? new Transition() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$Transition$transition$1$1
                @Override // androidx.constraintlayout.compose.Transition
                public void applyTo(androidx.constraintlayout.core.state.Transition transition, int i2) {
                    Intrinsics.checkNotNullParameter(transition, "transition");
                    try {
                        ConstraintSetParserKt.parseTransition(CLObject.this, transition);
                    } catch (CLParsingException e2) {
                        System.err.println(Intrinsics.stringPlus("Error parsing JSON ", e2));
                    }
                }

                @Override // androidx.constraintlayout.compose.Transition
                public String getStartConstraintSetId() {
                    String stringOrNull = CLObject.this.getStringOrNull("from");
                    return stringOrNull == null ? TtmlNode.START : stringOrNull;
                }

                @Override // androidx.constraintlayout.compose.Transition
                public String getEndConstraintSetId() {
                    String stringOrNull = CLObject.this.getStringOrNull("to");
                    return stringOrNull == null ? TtmlNode.END : stringOrNull;
                }
            } : null, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return (MotionLayoutKt$Transition$transition$1$1) ((MutableState) rememberedValue).getValue();
    }

    public static final MeasurePolicy rememberMotionLayoutMeasurePolicy(final int i, EnumSet<MotionLayoutDebugFlags> debug, long j, final ConstraintSet constraintSetStart, final ConstraintSet constraintSetEnd, final Transition transition, final MutableState<Float> progress, final MotionMeasurer measurer, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(debug, "debug");
        Intrinsics.checkNotNullParameter(constraintSetStart, "constraintSetStart");
        Intrinsics.checkNotNullParameter(constraintSetEnd, "constraintSetEnd");
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(measurer, "measurer");
        composer.startReplaceableGroup(-1875584384);
        int i3 = 0;
        Object[] objArr = {Integer.valueOf(i), debug, Long.valueOf(j), constraintSetStart, constraintSetEnd, transition};
        composer.startReplaceableGroup(-3685570);
        ComposerKt.sourceInformation(composer, "C(remember)P(1):Composables.kt#9igjgp");
        boolean z = false;
        while (i3 < 6) {
            Object obj = objArr[i3];
            i3++;
            z |= composer.changed(obj);
        }
        MeasurePolicy rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            measurer.initWith(constraintSetStart, constraintSetEnd, transition, progress.getValue().floatValue());
            rememberedValue = new MeasurePolicy() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$rememberMotionLayoutMeasurePolicy$1$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i4) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope, list, i4);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i4) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope, list, i4);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i4) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope, list, i4);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i4) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope, list, i4);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo272measure3p2s80s(MeasureScope MeasurePolicy, List<? extends Measurable> measurables, long j2) {
                    MeasureResult layout$default;
                    Intrinsics.checkNotNullParameter(MeasurePolicy, "$this$MeasurePolicy");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    long m5946performInterpolationMeasureOQbXsTc = MotionMeasurer.this.m5946performInterpolationMeasureOQbXsTc(j2, MeasurePolicy.getLayoutDirection(), constraintSetStart, constraintSetEnd, transition, measurables, i, progress.getValue().floatValue(), MeasurePolicy);
                    layout$default = MeasureScope.CC.layout$default(MeasurePolicy, IntSize.m5767getWidthimpl(m5946performInterpolationMeasureOQbXsTc), IntSize.m5766getHeightimpl(m5946performInterpolationMeasureOQbXsTc), null, new MotionLayoutKt$rememberMotionLayoutMeasurePolicy$1$1$measure$1(MotionMeasurer.this, measurables), 4, null);
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
}
