package com.ifriend.presentation.features.onboarding.steps.view.common;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: OnboardingWheelPickerComponent.kt */
@Metadata(d1 = {"\u0000¢\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a§\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2%\b\u0002\u0010\f\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00050\r21\u0010\u0011\u001a-\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u008e\u0001\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010\n\u001a\u00020\u000b2%\b\u0002\u0010\f\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00050\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"\u001a-\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010)\u001a-\u0010*\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010)\u001a\u0017\u0010+\u001a\u0004\u0018\u00010\u00052\u0006\u0010'\u001a\u00020(H\u0002¢\u0006\u0002\u0010,\u001aO\u0010-\u001a\u00020.2\u0006\u0010%\u001a\u00020&28\b\u0002\u0010/\u001a2\u0012\u0013\u0012\u00110(¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(0\u0012\u0013\u0012\u001101¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020\u00050\u0012H\u0007¢\u0006\u0002\u00103\u001aa\u0010-\u001a\u00020.2\u0006\u0010%\u001a\u00020&28\b\u0002\u0010/\u001a2\u0012\u0013\u0012\u00110(¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(0\u0012\u0013\u0012\u001101¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020\u00050\u00122\b\b\u0002\u00104\u001a\u000205H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u00107\u001a¯\u0001\u00108\u001a\u0002092\u0006\u0010%\u001a\u00020&28\b\u0002\u0010/\u001a2\u0012\u0013\u0012\u00110(¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(0\u0012\u0013\u0012\u001101¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020\u00050\u00122\u000e\b\u0002\u0010:\u001a\b\u0012\u0004\u0012\u00020$0;2\u000e\b\u0002\u0010<\u001a\b\u0012\u0004\u0012\u00020$0=2>\b\u0002\u0010>\u001a8\u0012\u0004\u0012\u00020(\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(@\u0012\u0004\u0012\u00020\u00050?H\u0007¢\u0006\u0002\u0010A\u001a\u0095\u0001\u00108\u001a\u0002092\u0006\u0010%\u001a\u00020&28\b\u0002\u0010/\u001a2\u0012\u0013\u0012\u00110(¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(0\u0012\u0013\u0012\u001101¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020\u00050\u00122\b\b\u0002\u00104\u001a\u0002052\u000e\b\u0002\u0010:\u001a\b\u0012\u0004\u0012\u00020$0;2\u000e\b\u0002\u0010<\u001a\b\u0012\u0004\u0012\u00020$0=2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020$0\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bC\u0010D\u001aÁ\u0001\u00108\u001a\u0002092\u0006\u0010%\u001a\u00020&28\b\u0002\u0010/\u001a2\u0012\u0013\u0012\u00110(¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(0\u0012\u0013\u0012\u001101¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020\u00050\u00122\b\b\u0002\u00104\u001a\u0002052\u000e\b\u0002\u0010:\u001a\b\u0012\u0004\u0012\u00020$0;2\u000e\b\u0002\u0010<\u001a\b\u0012\u0004\u0012\u00020$0=2>\b\u0002\u0010>\u001a8\u0012\u0004\u0012\u00020(\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(@\u0012\u0004\u0012\u00020\u00050?H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bC\u0010E\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006F"}, d2 = {"WheelPicker", "", "modifier", "Landroidx/compose/ui/Modifier;", "startIndex", "", "count", "rowCount", "size", "Landroidx/compose/ui/unit/DpSize;", "selectorProperties", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SelectorProperties;", "onScrollFinished", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "snappedIndex", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/LazyItemScope;", FirebaseAnalytics.Param.INDEX, "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "WheelPicker-F4kRBEE", "(Landroidx/compose/ui/Modifier;IIIJLcom/ifriend/presentation/features/onboarding/steps/view/common/SelectorProperties;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "WheelTextPicker", "texts", "", "", "style", "Landroidx/compose/ui/text/TextStyle;", "color", "Landroidx/compose/ui/graphics/Color;", "WheelTextPicker-FVCn--w", "(Landroidx/compose/ui/Modifier;IJLjava/util/List;ILandroidx/compose/ui/text/TextStyle;JLcom/ifriend/presentation/features/onboarding/steps/view/common/SelectorProperties;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "calculateAnimatedAlpha", "", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "snapperLayoutInfo", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperLayoutInfo;", "(Landroidx/compose/foundation/lazy/LazyListState;Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperLayoutInfo;IILandroidx/compose/runtime/Composer;I)F", "calculateAnimatedRotationX", "calculateSnappedItemIndex", "(Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperLayoutInfo;)Ljava/lang/Integer;", "rememberLazyListSnapperLayoutInfo", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/LazyListSnapperLayoutInfo;", "snapOffsetForItem", "layoutInfo", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperLayoutItemInfo;", "item", "(Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)Lcom/ifriend/presentation/features/onboarding/steps/view/common/LazyListSnapperLayoutInfo;", "endContentPadding", "Landroidx/compose/ui/unit/Dp;", "rememberLazyListSnapperLayoutInfo-6a0pyJM", "(Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function2;FLandroidx/compose/runtime/Composer;II)Lcom/ifriend/presentation/features/onboarding/steps/view/common/LazyListSnapperLayoutInfo;", "rememberSnapperFlingBehavior", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperFlingBehavior;", "decayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "springAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "snapIndex", "Lkotlin/Function3;", "targetIndex", "(Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function2;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperFlingBehavior;", "maximumFlingDistance", "rememberSnapperFlingBehavior-osbwsH8", "(Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function2;FLandroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperFlingBehavior;", "(Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function2;FLandroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperFlingBehavior;", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingWheelPickerComponentKt {
    /* renamed from: WheelTextPicker-FVCn--w  reason: not valid java name */
    public static final void m6939WheelTextPickerFVCnw(Modifier modifier, int i, long j, List<String> texts, int i2, TextStyle textStyle, long j2, SelectorProperties selectorProperties, Function1<? super Integer, Integer> function1, Composer composer, int i3, int i4) {
        long j3;
        TextStyle textStyle2;
        int i5;
        long j4;
        SelectorProperties selectorProperties2;
        Intrinsics.checkNotNullParameter(texts, "texts");
        Composer startRestartGroup = composer.startRestartGroup(2079825162);
        ComposerKt.sourceInformation(startRestartGroup, "C(WheelTextPicker)P(1,6,5:c#ui.unit.DpSize,8,3,7,0:c#ui.graphics.Color,4)");
        Modifier.Companion companion = (i4 & 1) != 0 ? Modifier.Companion : modifier;
        int i6 = (i4 & 2) != 0 ? 0 : i;
        if ((i4 & 4) != 0) {
            float f = 128;
            j3 = DpKt.m5629DpSizeYgX7TsA(Dp.m5607constructorimpl(f), Dp.m5607constructorimpl(f));
        } else {
            j3 = j;
        }
        if ((i4 & 32) != 0) {
            textStyle2 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getTitleMedium();
            i5 = i3 & (-458753);
        } else {
            textStyle2 = textStyle;
            i5 = i3;
        }
        if ((i4 & 64) != 0) {
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(ContentColorKt.getLocalContentColor());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            j4 = ((Color) consume).m3301unboximpl();
            i5 &= -3670017;
        } else {
            j4 = j2;
        }
        if ((i4 & 128) != 0) {
            selectorProperties2 = WheelPickerDefaults.INSTANCE.m6943selectorPropertiescf5BqRc(false, null, 0L, null, startRestartGroup, 24576, 15);
            i5 &= -29360129;
        } else {
            selectorProperties2 = selectorProperties;
        }
        OnboardingWheelPickerComponentKt$WheelTextPicker$1 onboardingWheelPickerComponentKt$WheelTextPicker$1 = (i4 & 256) != 0 ? OnboardingWheelPickerComponentKt$WheelTextPicker$1.INSTANCE : function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2079825162, i5, -1, "com.ifriend.presentation.features.onboarding.steps.view.common.WheelTextPicker (OnboardingWheelPickerComponent.kt:60)");
        }
        int i7 = i5 >> 6;
        m6938WheelPickerF4kRBEE(companion, i6, texts.size(), i2, j3, selectorProperties2, onboardingWheelPickerComponentKt$WheelTextPicker$1, ComposableLambdaKt.composableLambda(startRestartGroup, 1322901723, true, new OnboardingWheelPickerComponentKt$WheelTextPicker$2(texts, j4, textStyle2, i5)), startRestartGroup, (i5 & 14) | 12582912 | (i5 & 112) | ((i5 >> 3) & 7168) | ((i5 << 6) & 57344) | (458752 & i7) | (i7 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new OnboardingWheelPickerComponentKt$WheelTextPicker$3(companion, i6, j3, texts, i2, textStyle2, j4, selectorProperties2, onboardingWheelPickerComponentKt$WheelTextPicker$1, i3, i4));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ec A[LOOP:0: B:121:0x01ea->B:122:0x01ec, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03ed A[LOOP:1: B:146:0x03eb->B:147:0x03ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0123  */
    /* renamed from: WheelPicker-F4kRBEE  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m6938WheelPickerF4kRBEE(Modifier modifier, int i, int i2, int i3, long j, SelectorProperties selectorProperties, Function1<? super Integer, Integer> function1, Function4<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> content, Composer composer, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        long j2;
        SelectorProperties selectorProperties2;
        int i10;
        int i11;
        SelectorProperties selectorProperties3;
        OnboardingWheelPickerComponentKt$WheelPicker$1 onboardingWheelPickerComponentKt$WheelPicker$1;
        Modifier modifier2;
        int i12;
        int i13;
        long j3;
        SelectorProperties selectorProperties4;
        Boolean valueOf;
        int i14;
        int i15;
        boolean z;
        OnboardingWheelPickerComponentKt$WheelPicker$2$1 rememberedValue;
        Boolean bool;
        Object obj;
        int currentCompositeKeyHash;
        Composer m2893constructorimpl;
        int i16;
        boolean z2;
        int i17;
        OnboardingWheelPickerComponentKt$WheelPicker$3$1$1 rememberedValue2;
        int i18;
        Composer composer2;
        int i19;
        Modifier modifier3;
        long j4;
        Function1<? super Integer, Integer> function12;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1088985237);
        int i20 = i5 & 1;
        if (i20 != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i6 = (startRestartGroup.changed(modifier) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i21 = i5 & 2;
        if (i21 != 0) {
            i6 |= 48;
        } else if ((i4 & 112) == 0) {
            i7 = i;
            i6 |= startRestartGroup.changed(i7) ? 32 : 16;
            if ((i5 & 4) == 0) {
                i6 |= 384;
            } else if ((i4 & 896) == 0) {
                i6 |= startRestartGroup.changed(i2) ? 256 : 128;
                if ((i5 & 8) != 0) {
                    i6 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i4 & 7168) == 0) {
                    i6 |= startRestartGroup.changed(i3) ? 2048 : 1024;
                }
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= 24576;
                } else if ((57344 & i4) == 0) {
                    i9 = i8;
                    j2 = j;
                    i6 |= startRestartGroup.changed(j2) ? 16384 : 8192;
                    if ((i4 & 458752) != 0) {
                        selectorProperties2 = selectorProperties;
                        i6 |= ((i5 & 32) == 0 && startRestartGroup.changed(selectorProperties2)) ? 131072 : 65536;
                    } else {
                        selectorProperties2 = selectorProperties;
                    }
                    i10 = i5 & 64;
                    if (i10 == 0) {
                        i6 |= 1572864;
                    } else if ((i4 & 3670016) == 0) {
                        i6 |= startRestartGroup.changedInstance(function1) ? 1048576 : 524288;
                    }
                    if ((i5 & 128) != 0) {
                        if ((29360128 & i4) == 0) {
                            i11 = startRestartGroup.changedInstance(content) ? 8388608 : 4194304;
                        }
                        if ((23967451 & i6) == 4793490 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i4 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i20 != 0 ? Modifier.Companion : modifier;
                                if (i21 != 0) {
                                    i7 = 0;
                                }
                                if (i9 != 0) {
                                    float f = 128;
                                    j2 = DpKt.m5629DpSizeYgX7TsA(Dp.m5607constructorimpl(f), Dp.m5607constructorimpl(f));
                                }
                                long j5 = j2;
                                if ((i5 & 32) != 0) {
                                    selectorProperties3 = WheelPickerDefaults.INSTANCE.m6943selectorPropertiescf5BqRc(false, null, 0L, null, startRestartGroup, 24576, 15);
                                    i6 &= -458753;
                                } else {
                                    selectorProperties3 = selectorProperties;
                                }
                                if (i10 != 0) {
                                    modifier2 = companion;
                                    onboardingWheelPickerComponentKt$WheelPicker$1 = OnboardingWheelPickerComponentKt$WheelPicker$1.INSTANCE;
                                } else {
                                    onboardingWheelPickerComponentKt$WheelPicker$1 = function1;
                                    modifier2 = companion;
                                }
                                i12 = i6;
                                i13 = i7;
                                j3 = j5;
                                selectorProperties4 = selectorProperties3;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i5 & 32) != 0) {
                                    modifier2 = modifier;
                                    onboardingWheelPickerComponentKt$WheelPicker$1 = function1;
                                    i12 = i6 & (-458753);
                                } else {
                                    modifier2 = modifier;
                                    onboardingWheelPickerComponentKt$WheelPicker$1 = function1;
                                    i12 = i6;
                                }
                                i13 = i7;
                                j3 = j2;
                                selectorProperties4 = selectorProperties;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1088985237, i12, -1, "com.ifriend.presentation.features.onboarding.steps.view.common.WheelPicker (OnboardingWheelPickerComponent.kt:90)");
                            }
                            int i22 = i12 >> 3;
                            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(i13, 0, startRestartGroup, i22 & 14, 2);
                            LazyListSnapperLayoutInfo rememberLazyListSnapperLayoutInfo = rememberLazyListSnapperLayoutInfo(rememberLazyListState, null, startRestartGroup, 0, 2);
                            boolean isScrollInProgress = rememberLazyListState.isScrollInProgress();
                            valueOf = Boolean.valueOf(isScrollInProgress);
                            Integer valueOf2 = Integer.valueOf(i2);
                            Object[] objArr = {Boolean.valueOf(isScrollInProgress), onboardingWheelPickerComponentKt$WheelPicker$1, rememberLazyListSnapperLayoutInfo, Integer.valueOf(i13), rememberLazyListState};
                            startRestartGroup.startReplaceableGroup(-568225417);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            i14 = 0;
                            z = false;
                            for (i15 = 5; i14 < i15; i15 = 5) {
                                z |= startRestartGroup.changed(objArr[i14]);
                                i14++;
                            }
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z || rememberedValue == Composer.Companion.getEmpty()) {
                                bool = valueOf;
                                obj = null;
                                rememberedValue = new OnboardingWheelPickerComponentKt$WheelPicker$2$1(isScrollInProgress, onboardingWheelPickerComponentKt$WheelPicker$1, rememberLazyListSnapperLayoutInfo, i13, rememberLazyListState, null);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            } else {
                                bool = valueOf;
                                obj = null;
                            }
                            startRestartGroup.endReplaceableGroup();
                            EffectsKt.LaunchedEffect(bool, valueOf2, (Function2) rememberedValue, startRestartGroup, (i22 & 112) | 512);
                            Alignment center = Alignment.Companion.getCenter();
                            int i23 = (i12 & 14) | 48;
                            startRestartGroup.startReplaceableGroup(733328855);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                            int i24 = i23 >> 3;
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, (i24 & 112) | (i24 & 14));
                            startRestartGroup.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier2);
                            int i25 = ((((i23 << 3) & 112) << 9) & 7168) | 6;
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor);
                            } else {
                                startRestartGroup.useNode();
                            }
                            m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
                            Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                            if (!m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i25 >> 3) & 112));
                            startRestartGroup.startReplaceableGroup(2058660585);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            startRestartGroup.startReplaceableGroup(-778154196);
                            i16 = (i12 >> 15) & 14;
                            if (selectorProperties4.enabled(startRestartGroup, i16).getValue().booleanValue()) {
                                SurfaceKt.m2067SurfaceT9BRK9s(SizeKt.m797sizeVpY3zN4(Modifier.Companion, DpSize.m5705getWidthD9Ej5fM(j3), Dp.m5607constructorimpl(DpSize.m5703getHeightD9Ej5fM(j3) / i3)), selectorProperties4.shape(startRestartGroup, i16).getValue(), selectorProperties4.color(startRestartGroup, i16).getValue().m3301unboximpl(), 0L, 0.0f, 0.0f, selectorProperties4.border(startRestartGroup, i16).getValue(), ComposableSingletons$OnboardingWheelPickerComponentKt.INSTANCE.m6934getLambda1$presentation_release(), startRestartGroup, 12582912, 56);
                            }
                            startRestartGroup.endReplaceableGroup();
                            Modifier m800width3ABfNKs = SizeKt.m800width3ABfNKs(SizeKt.m781height3ABfNKs(Modifier.Companion, DpSize.m5703getHeightD9Ej5fM(j3)), DpSize.m5705getWidthD9Ej5fM(j3));
                            PaddingValues m743PaddingValuesYgX7TsA$default = PaddingKt.m743PaddingValuesYgX7TsA$default(0.0f, Dp.m5607constructorimpl(Dp.m5607constructorimpl(DpSize.m5703getHeightD9Ej5fM(j3) / i3) * ((i3 - 1) / 2)), 1, obj);
                            int i26 = i12;
                            SelectorProperties selectorProperties5 = selectorProperties4;
                            SnapperFlingBehavior rememberSnapperFlingBehavior = rememberSnapperFlingBehavior(rememberLazyListState, null, null, null, null, startRestartGroup, 0, 30);
                            z2 = false;
                            Object[] objArr2 = {Integer.valueOf(i2), DpSize.m5693boximpl(j3), Integer.valueOf(i3), rememberLazyListState, rememberLazyListSnapperLayoutInfo, content};
                            startRestartGroup.startReplaceableGroup(-568225417);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            for (i17 = 0; i17 < 6; i17++) {
                                z2 |= startRestartGroup.changed(objArr2[i17]);
                            }
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!z2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                                i18 = i13;
                                composer2 = startRestartGroup;
                                rememberedValue2 = new OnboardingWheelPickerComponentKt$WheelPicker$3$1$1(i2, j3, i3, rememberLazyListState, rememberLazyListSnapperLayoutInfo, i26, content);
                                composer2.updateRememberedValue(rememberedValue2);
                            } else {
                                i18 = i13;
                                composer2 = startRestartGroup;
                            }
                            composer2.endReplaceableGroup();
                            LazyDslKt.LazyColumn(m800width3ABfNKs, rememberLazyListState, m743PaddingValuesYgX7TsA$default, false, null, null, rememberSnapperFlingBehavior, false, (Function1) rememberedValue2, composer2, 0, 184);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            selectorProperties2 = selectorProperties5;
                            i19 = i18;
                            modifier3 = modifier2;
                            j4 = j3;
                            function12 = onboardingWheelPickerComponentKt$WheelPicker$1;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            i19 = i7;
                            composer2 = startRestartGroup;
                            j4 = j2;
                            function12 = function1;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new OnboardingWheelPickerComponentKt$WheelPicker$4(modifier3, i19, i2, i3, j4, selectorProperties2, function12, content, i4, i5));
                        return;
                    }
                    i11 = 12582912;
                    i6 |= i11;
                    if ((23967451 & i6) == 4793490) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i4 & 1) != 0) {
                    }
                    if (i20 != 0) {
                    }
                    if (i21 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    long j52 = j2;
                    if ((i5 & 32) != 0) {
                    }
                    if (i10 != 0) {
                    }
                    i12 = i6;
                    i13 = i7;
                    j3 = j52;
                    selectorProperties4 = selectorProperties3;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i222 = i12 >> 3;
                    LazyListState rememberLazyListState2 = LazyListStateKt.rememberLazyListState(i13, 0, startRestartGroup, i222 & 14, 2);
                    LazyListSnapperLayoutInfo rememberLazyListSnapperLayoutInfo2 = rememberLazyListSnapperLayoutInfo(rememberLazyListState2, null, startRestartGroup, 0, 2);
                    boolean isScrollInProgress2 = rememberLazyListState2.isScrollInProgress();
                    valueOf = Boolean.valueOf(isScrollInProgress2);
                    Integer valueOf22 = Integer.valueOf(i2);
                    Object[] objArr3 = {Boolean.valueOf(isScrollInProgress2), onboardingWheelPickerComponentKt$WheelPicker$1, rememberLazyListSnapperLayoutInfo2, Integer.valueOf(i13), rememberLazyListState2};
                    startRestartGroup.startReplaceableGroup(-568225417);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    i14 = 0;
                    z = false;
                    while (i14 < i15) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (z) {
                    }
                    bool = valueOf;
                    obj = null;
                    rememberedValue = new OnboardingWheelPickerComponentKt$WheelPicker$2$1(isScrollInProgress2, onboardingWheelPickerComponentKt$WheelPicker$1, rememberLazyListSnapperLayoutInfo2, i13, rememberLazyListState2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(bool, valueOf22, (Function2) rememberedValue, startRestartGroup, (i222 & 112) | 512);
                    Alignment center2 = Alignment.Companion.getCenter();
                    int i232 = (i12 & 14) | 48;
                    startRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                    int i242 = i232 >> 3;
                    MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, startRestartGroup, (i242 & 112) | (i242 & 14));
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifier2);
                    int i252 = ((((i232 << 3) & 112) << 9) & 7168) | 6;
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
                    Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (!m2893constructorimpl.getInserting()) {
                    }
                    m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                    modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i252 >> 3) & 112));
                    startRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceableGroup(-778154196);
                    i16 = (i12 >> 15) & 14;
                    if (selectorProperties4.enabled(startRestartGroup, i16).getValue().booleanValue()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    Modifier m800width3ABfNKs2 = SizeKt.m800width3ABfNKs(SizeKt.m781height3ABfNKs(Modifier.Companion, DpSize.m5703getHeightD9Ej5fM(j3)), DpSize.m5705getWidthD9Ej5fM(j3));
                    PaddingValues m743PaddingValuesYgX7TsA$default2 = PaddingKt.m743PaddingValuesYgX7TsA$default(0.0f, Dp.m5607constructorimpl(Dp.m5607constructorimpl(DpSize.m5703getHeightD9Ej5fM(j3) / i3) * ((i3 - 1) / 2)), 1, obj);
                    int i262 = i12;
                    SelectorProperties selectorProperties52 = selectorProperties4;
                    SnapperFlingBehavior rememberSnapperFlingBehavior2 = rememberSnapperFlingBehavior(rememberLazyListState2, null, null, null, null, startRestartGroup, 0, 30);
                    z2 = false;
                    Object[] objArr22 = {Integer.valueOf(i2), DpSize.m5693boximpl(j3), Integer.valueOf(i3), rememberLazyListState2, rememberLazyListSnapperLayoutInfo2, content};
                    startRestartGroup.startReplaceableGroup(-568225417);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    while (i17 < 6) {
                    }
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (z2) {
                    }
                    i18 = i13;
                    composer2 = startRestartGroup;
                    rememberedValue2 = new OnboardingWheelPickerComponentKt$WheelPicker$3$1$1(i2, j3, i3, rememberLazyListState2, rememberLazyListSnapperLayoutInfo2, i262, content);
                    composer2.updateRememberedValue(rememberedValue2);
                    composer2.endReplaceableGroup();
                    LazyDslKt.LazyColumn(m800width3ABfNKs2, rememberLazyListState2, m743PaddingValuesYgX7TsA$default2, false, null, null, rememberSnapperFlingBehavior2, false, (Function1) rememberedValue2, composer2, 0, 184);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    selectorProperties2 = selectorProperties52;
                    i19 = i18;
                    modifier3 = modifier2;
                    j4 = j3;
                    function12 = onboardingWheelPickerComponentKt$WheelPicker$1;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i9 = i8;
                j2 = j;
                if ((i4 & 458752) != 0) {
                }
                i10 = i5 & 64;
                if (i10 == 0) {
                }
                if ((i5 & 128) != 0) {
                }
                i6 |= i11;
                if ((23967451 & i6) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i4 & 1) != 0) {
                }
                if (i20 != 0) {
                }
                if (i21 != 0) {
                }
                if (i9 != 0) {
                }
                long j522 = j2;
                if ((i5 & 32) != 0) {
                }
                if (i10 != 0) {
                }
                i12 = i6;
                i13 = i7;
                j3 = j522;
                selectorProperties4 = selectorProperties3;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i2222 = i12 >> 3;
                LazyListState rememberLazyListState22 = LazyListStateKt.rememberLazyListState(i13, 0, startRestartGroup, i2222 & 14, 2);
                LazyListSnapperLayoutInfo rememberLazyListSnapperLayoutInfo22 = rememberLazyListSnapperLayoutInfo(rememberLazyListState22, null, startRestartGroup, 0, 2);
                boolean isScrollInProgress22 = rememberLazyListState22.isScrollInProgress();
                valueOf = Boolean.valueOf(isScrollInProgress22);
                Integer valueOf222 = Integer.valueOf(i2);
                Object[] objArr32 = {Boolean.valueOf(isScrollInProgress22), onboardingWheelPickerComponentKt$WheelPicker$1, rememberLazyListSnapperLayoutInfo22, Integer.valueOf(i13), rememberLazyListState22};
                startRestartGroup.startReplaceableGroup(-568225417);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                i14 = 0;
                z = false;
                while (i14 < i15) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (z) {
                }
                bool = valueOf;
                obj = null;
                rememberedValue = new OnboardingWheelPickerComponentKt$WheelPicker$2$1(isScrollInProgress22, onboardingWheelPickerComponentKt$WheelPicker$1, rememberLazyListSnapperLayoutInfo22, i13, rememberLazyListState22, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(bool, valueOf222, (Function2) rememberedValue, startRestartGroup, (i2222 & 112) | 512);
                Alignment center22 = Alignment.Companion.getCenter();
                int i2322 = (i12 & 14) | 48;
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                int i2422 = i2322 >> 3;
                MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(center22, false, startRestartGroup, (i2422 & 112) | (i2422 & 14));
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor22 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(modifier2);
                int i2522 = ((((i2322 << 3) & 112) << 9) & 7168) | 6;
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
                Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy22, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap22, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (!m2893constructorimpl.getInserting()) {
                }
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
                modifierMaterializerOf22.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i2522 >> 3) & 112));
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(-778154196);
                i16 = (i12 >> 15) & 14;
                if (selectorProperties4.enabled(startRestartGroup, i16).getValue().booleanValue()) {
                }
                startRestartGroup.endReplaceableGroup();
                Modifier m800width3ABfNKs22 = SizeKt.m800width3ABfNKs(SizeKt.m781height3ABfNKs(Modifier.Companion, DpSize.m5703getHeightD9Ej5fM(j3)), DpSize.m5705getWidthD9Ej5fM(j3));
                PaddingValues m743PaddingValuesYgX7TsA$default22 = PaddingKt.m743PaddingValuesYgX7TsA$default(0.0f, Dp.m5607constructorimpl(Dp.m5607constructorimpl(DpSize.m5703getHeightD9Ej5fM(j3) / i3) * ((i3 - 1) / 2)), 1, obj);
                int i2622 = i12;
                SelectorProperties selectorProperties522 = selectorProperties4;
                SnapperFlingBehavior rememberSnapperFlingBehavior22 = rememberSnapperFlingBehavior(rememberLazyListState22, null, null, null, null, startRestartGroup, 0, 30);
                z2 = false;
                Object[] objArr222 = {Integer.valueOf(i2), DpSize.m5693boximpl(j3), Integer.valueOf(i3), rememberLazyListState22, rememberLazyListSnapperLayoutInfo22, content};
                startRestartGroup.startReplaceableGroup(-568225417);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                while (i17 < 6) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (z2) {
                }
                i18 = i13;
                composer2 = startRestartGroup;
                rememberedValue2 = new OnboardingWheelPickerComponentKt$WheelPicker$3$1$1(i2, j3, i3, rememberLazyListState22, rememberLazyListSnapperLayoutInfo22, i2622, content);
                composer2.updateRememberedValue(rememberedValue2);
                composer2.endReplaceableGroup();
                LazyDslKt.LazyColumn(m800width3ABfNKs22, rememberLazyListState22, m743PaddingValuesYgX7TsA$default22, false, null, null, rememberSnapperFlingBehavior22, false, (Function1) rememberedValue2, composer2, 0, 184);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                selectorProperties2 = selectorProperties522;
                i19 = i18;
                modifier3 = modifier2;
                j4 = j3;
                function12 = onboardingWheelPickerComponentKt$WheelPicker$1;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            if ((i5 & 8) != 0) {
            }
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            i9 = i8;
            j2 = j;
            if ((i4 & 458752) != 0) {
            }
            i10 = i5 & 64;
            if (i10 == 0) {
            }
            if ((i5 & 128) != 0) {
            }
            i6 |= i11;
            if ((23967451 & i6) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i4 & 1) != 0) {
            }
            if (i20 != 0) {
            }
            if (i21 != 0) {
            }
            if (i9 != 0) {
            }
            long j5222 = j2;
            if ((i5 & 32) != 0) {
            }
            if (i10 != 0) {
            }
            i12 = i6;
            i13 = i7;
            j3 = j5222;
            selectorProperties4 = selectorProperties3;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i22222 = i12 >> 3;
            LazyListState rememberLazyListState222 = LazyListStateKt.rememberLazyListState(i13, 0, startRestartGroup, i22222 & 14, 2);
            LazyListSnapperLayoutInfo rememberLazyListSnapperLayoutInfo222 = rememberLazyListSnapperLayoutInfo(rememberLazyListState222, null, startRestartGroup, 0, 2);
            boolean isScrollInProgress222 = rememberLazyListState222.isScrollInProgress();
            valueOf = Boolean.valueOf(isScrollInProgress222);
            Integer valueOf2222 = Integer.valueOf(i2);
            Object[] objArr322 = {Boolean.valueOf(isScrollInProgress222), onboardingWheelPickerComponentKt$WheelPicker$1, rememberLazyListSnapperLayoutInfo222, Integer.valueOf(i13), rememberLazyListState222};
            startRestartGroup.startReplaceableGroup(-568225417);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            i14 = 0;
            z = false;
            while (i14 < i15) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (z) {
            }
            bool = valueOf;
            obj = null;
            rememberedValue = new OnboardingWheelPickerComponentKt$WheelPicker$2$1(isScrollInProgress222, onboardingWheelPickerComponentKt$WheelPicker$1, rememberLazyListSnapperLayoutInfo222, i13, rememberLazyListState222, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(bool, valueOf2222, (Function2) rememberedValue, startRestartGroup, (i22222 & 112) | 512);
            Alignment center222 = Alignment.Companion.getCenter();
            int i23222 = (i12 & 14) | 48;
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            int i24222 = i23222 >> 3;
            MeasurePolicy rememberBoxMeasurePolicy222 = BoxKt.rememberBoxMeasurePolicy(center222, false, startRestartGroup, (i24222 & 112) | (i24222 & 14));
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor222 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf222 = LayoutKt.modifierMaterializerOf(modifier2);
            int i25222 = ((((i23222 << 3) & 112) << 9) & 7168) | 6;
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy222, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap222, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (!m2893constructorimpl.getInserting()) {
            }
            m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
            modifierMaterializerOf222.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i25222 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-778154196);
            i16 = (i12 >> 15) & 14;
            if (selectorProperties4.enabled(startRestartGroup, i16).getValue().booleanValue()) {
            }
            startRestartGroup.endReplaceableGroup();
            Modifier m800width3ABfNKs222 = SizeKt.m800width3ABfNKs(SizeKt.m781height3ABfNKs(Modifier.Companion, DpSize.m5703getHeightD9Ej5fM(j3)), DpSize.m5705getWidthD9Ej5fM(j3));
            PaddingValues m743PaddingValuesYgX7TsA$default222 = PaddingKt.m743PaddingValuesYgX7TsA$default(0.0f, Dp.m5607constructorimpl(Dp.m5607constructorimpl(DpSize.m5703getHeightD9Ej5fM(j3) / i3) * ((i3 - 1) / 2)), 1, obj);
            int i26222 = i12;
            SelectorProperties selectorProperties5222 = selectorProperties4;
            SnapperFlingBehavior rememberSnapperFlingBehavior222 = rememberSnapperFlingBehavior(rememberLazyListState222, null, null, null, null, startRestartGroup, 0, 30);
            z2 = false;
            Object[] objArr2222 = {Integer.valueOf(i2), DpSize.m5693boximpl(j3), Integer.valueOf(i3), rememberLazyListState222, rememberLazyListSnapperLayoutInfo222, content};
            startRestartGroup.startReplaceableGroup(-568225417);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            while (i17 < 6) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (z2) {
            }
            i18 = i13;
            composer2 = startRestartGroup;
            rememberedValue2 = new OnboardingWheelPickerComponentKt$WheelPicker$3$1$1(i2, j3, i3, rememberLazyListState222, rememberLazyListSnapperLayoutInfo222, i26222, content);
            composer2.updateRememberedValue(rememberedValue2);
            composer2.endReplaceableGroup();
            LazyDslKt.LazyColumn(m800width3ABfNKs222, rememberLazyListState222, m743PaddingValuesYgX7TsA$default222, false, null, null, rememberSnapperFlingBehavior222, false, (Function1) rememberedValue2, composer2, 0, 184);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            selectorProperties2 = selectorProperties5222;
            i19 = i18;
            modifier3 = modifier2;
            j4 = j3;
            function12 = onboardingWheelPickerComponentKt$WheelPicker$1;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i7 = i;
        if ((i5 & 4) == 0) {
        }
        if ((i5 & 8) != 0) {
        }
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        i9 = i8;
        j2 = j;
        if ((i4 & 458752) != 0) {
        }
        i10 = i5 & 64;
        if (i10 == 0) {
        }
        if ((i5 & 128) != 0) {
        }
        i6 |= i11;
        if ((23967451 & i6) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i4 & 1) != 0) {
        }
        if (i20 != 0) {
        }
        if (i21 != 0) {
        }
        if (i9 != 0) {
        }
        long j52222 = j2;
        if ((i5 & 32) != 0) {
        }
        if (i10 != 0) {
        }
        i12 = i6;
        i13 = i7;
        j3 = j52222;
        selectorProperties4 = selectorProperties3;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i222222 = i12 >> 3;
        LazyListState rememberLazyListState2222 = LazyListStateKt.rememberLazyListState(i13, 0, startRestartGroup, i222222 & 14, 2);
        LazyListSnapperLayoutInfo rememberLazyListSnapperLayoutInfo2222 = rememberLazyListSnapperLayoutInfo(rememberLazyListState2222, null, startRestartGroup, 0, 2);
        boolean isScrollInProgress2222 = rememberLazyListState2222.isScrollInProgress();
        valueOf = Boolean.valueOf(isScrollInProgress2222);
        Integer valueOf22222 = Integer.valueOf(i2);
        Object[] objArr3222 = {Boolean.valueOf(isScrollInProgress2222), onboardingWheelPickerComponentKt$WheelPicker$1, rememberLazyListSnapperLayoutInfo2222, Integer.valueOf(i13), rememberLazyListState2222};
        startRestartGroup.startReplaceableGroup(-568225417);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        i14 = 0;
        z = false;
        while (i14 < i15) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (z) {
        }
        bool = valueOf;
        obj = null;
        rememberedValue = new OnboardingWheelPickerComponentKt$WheelPicker$2$1(isScrollInProgress2222, onboardingWheelPickerComponentKt$WheelPicker$1, rememberLazyListSnapperLayoutInfo2222, i13, rememberLazyListState2222, null);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(bool, valueOf22222, (Function2) rememberedValue, startRestartGroup, (i222222 & 112) | 512);
        Alignment center2222 = Alignment.Companion.getCenter();
        int i232222 = (i12 & 14) | 48;
        startRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
        int i242222 = i232222 >> 3;
        MeasurePolicy rememberBoxMeasurePolicy2222 = BoxKt.rememberBoxMeasurePolicy(center2222, false, startRestartGroup, (i242222 & 112) | (i242222 & 14));
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2222 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2222 = LayoutKt.modifierMaterializerOf(modifier2);
        int i252222 = ((((i232222 << 3) & 112) << 9) & 7168) | 6;
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
        Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy2222, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap2222, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (!m2893constructorimpl.getInserting()) {
        }
        m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
        modifierMaterializerOf2222.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i252222 >> 3) & 112));
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(-778154196);
        i16 = (i12 >> 15) & 14;
        if (selectorProperties4.enabled(startRestartGroup, i16).getValue().booleanValue()) {
        }
        startRestartGroup.endReplaceableGroup();
        Modifier m800width3ABfNKs2222 = SizeKt.m800width3ABfNKs(SizeKt.m781height3ABfNKs(Modifier.Companion, DpSize.m5703getHeightD9Ej5fM(j3)), DpSize.m5705getWidthD9Ej5fM(j3));
        PaddingValues m743PaddingValuesYgX7TsA$default2222 = PaddingKt.m743PaddingValuesYgX7TsA$default(0.0f, Dp.m5607constructorimpl(Dp.m5607constructorimpl(DpSize.m5703getHeightD9Ej5fM(j3) / i3) * ((i3 - 1) / 2)), 1, obj);
        int i262222 = i12;
        SelectorProperties selectorProperties52222 = selectorProperties4;
        SnapperFlingBehavior rememberSnapperFlingBehavior2222 = rememberSnapperFlingBehavior(rememberLazyListState2222, null, null, null, null, startRestartGroup, 0, 30);
        z2 = false;
        Object[] objArr22222 = {Integer.valueOf(i2), DpSize.m5693boximpl(j3), Integer.valueOf(i3), rememberLazyListState2222, rememberLazyListSnapperLayoutInfo2222, content};
        startRestartGroup.startReplaceableGroup(-568225417);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        while (i17 < 6) {
        }
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (z2) {
        }
        i18 = i13;
        composer2 = startRestartGroup;
        rememberedValue2 = new OnboardingWheelPickerComponentKt$WheelPicker$3$1$1(i2, j3, i3, rememberLazyListState2222, rememberLazyListSnapperLayoutInfo2222, i262222, content);
        composer2.updateRememberedValue(rememberedValue2);
        composer2.endReplaceableGroup();
        LazyDslKt.LazyColumn(m800width3ABfNKs2222, rememberLazyListState2222, m743PaddingValuesYgX7TsA$default2222, false, null, null, rememberSnapperFlingBehavior2222, false, (Function1) rememberedValue2, composer2, 0, 184);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        selectorProperties2 = selectorProperties52222;
        i19 = i18;
        modifier3 = modifier2;
        j4 = j3;
        function12 = onboardingWheelPickerComponentKt$WheelPicker$1;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer calculateSnappedItemIndex(SnapperLayoutInfo snapperLayoutInfo) {
        SnapperLayoutItemInfo currentItem = snapperLayoutInfo.getCurrentItem();
        Integer valueOf = currentItem != null ? Integer.valueOf(currentItem.getIndex()) : null;
        SnapperLayoutItemInfo currentItem2 = snapperLayoutInfo.getCurrentItem();
        boolean z = false;
        if (currentItem2 != null && currentItem2.getOffset() == 0) {
            z = true;
        }
        return (z || valueOf == null) ? valueOf : Integer.valueOf(valueOf.intValue() + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculateAnimatedAlpha(LazyListState lazyListState, SnapperLayoutInfo snapperLayoutInfo, int i, int i2, Composer composer, int i3) {
        composer.startReplaceableGroup(-962309283);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-962309283, i3, -1, "com.ifriend.presentation.features.onboarding.steps.view.common.calculateAnimatedAlpha (OnboardingWheelPickerComponent.kt:165)");
        }
        int abs = Math.abs(snapperLayoutInfo.distanceToIndexSnap(i));
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.derivedStateOf(new OnboardingWheelPickerComponentKt$calculateAnimatedAlpha$layoutInfo$1$1(lazyListState));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        float m5766getHeightimpl = IntSize.m5766getHeightimpl(((LazyListLayoutInfo) ((State) rememberedValue).getValue()).mo850getViewportSizeYbymL2g()) / i2;
        boolean z = false;
        if (abs >= 0 && abs <= ((int) m5766getHeightimpl)) {
            z = true;
        }
        float f = z ? 1.4f - (abs / m5766getHeightimpl) : 0.1f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return f;
    }

    private static final float calculateAnimatedRotationX(LazyListState lazyListState, SnapperLayoutInfo snapperLayoutInfo, int i, int i2, Composer composer, int i3) {
        composer.startReplaceableGroup(-1401252839);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1401252839, i3, -1, "com.ifriend.presentation.features.onboarding.steps.view.common.calculateAnimatedRotationX (OnboardingWheelPickerComponent.kt:185)");
        }
        int distanceToIndexSnap = snapperLayoutInfo.distanceToIndexSnap(i);
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.derivedStateOf(new OnboardingWheelPickerComponentKt$calculateAnimatedRotationX$layoutInfo$1$1(lazyListState));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        float m5766getHeightimpl = (distanceToIndexSnap / (IntSize.m5766getHeightimpl(((LazyListLayoutInfo) ((State) rememberedValue).getValue()).mo850getViewportSizeYbymL2g()) / i2)) * (-20.0f);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m5766getHeightimpl;
    }

    public static final SnapperFlingBehavior rememberSnapperFlingBehavior(LazyListState lazyListState, Function2<? super SnapperLayoutInfo, ? super SnapperLayoutItemInfo, Integer> function2, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec, Function3<? super SnapperLayoutInfo, ? super Integer, ? super Integer, Integer> function3, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        composer.startReplaceableGroup(1206362039);
        ComposerKt.sourceInformation(composer, "C(rememberSnapperFlingBehavior)P(1,3!1,4)");
        Function2<SnapperLayoutInfo, SnapperLayoutItemInfo, Integer> center = (i2 & 2) != 0 ? SnapOffsets.INSTANCE.getCenter() : function2;
        DecayAnimationSpec<Float> rememberSplineBasedDecay = (i2 & 4) != 0 ? SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0) : decayAnimationSpec;
        AnimationSpec<Float> springAnimationSpec = (i2 & 8) != 0 ? SnapperFlingBehaviorDefaults.INSTANCE.getSpringAnimationSpec() : animationSpec;
        Function3<SnapperLayoutInfo, Integer, Integer, Integer> snapIndex = (i2 & 16) != 0 ? SnapperFlingBehaviorDefaults.INSTANCE.getSnapIndex() : function3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1206362039, i, -1, "com.ifriend.presentation.features.onboarding.steps.view.common.rememberSnapperFlingBehavior (OnboardingWheelPickerComponent.kt:279)");
        }
        SnapperFlingBehavior rememberSnapperFlingBehavior = SnapperFlingBehaviorKt.rememberSnapperFlingBehavior(rememberLazyListSnapperLayoutInfo(lazyListState, center, composer, (i & 14) | (i & 112), 0), rememberSplineBasedDecay, springAnimationSpec, snapIndex, composer, ((i >> 3) & 7168) | 576, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberSnapperFlingBehavior;
    }

    @Deprecated(message = "endContentPadding is no longer necessary to be passed in", replaceWith = @ReplaceWith(expression = "rememberSnapperFlingBehavior(lazyListState, snapOffsetForItem, decayAnimationSpec, springAnimationSpec, snapIndex)", imports = {}))
    /* renamed from: rememberSnapperFlingBehavior-osbwsH8  reason: not valid java name */
    public static final SnapperFlingBehavior m6942rememberSnapperFlingBehaviorosbwsH8(LazyListState lazyListState, Function2<? super SnapperLayoutInfo, ? super SnapperLayoutItemInfo, Integer> function2, float f, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec, Function3<? super SnapperLayoutInfo, ? super Integer, ? super Integer, Integer> function3, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        composer.startReplaceableGroup(256629433);
        ComposerKt.sourceInformation(composer, "C(rememberSnapperFlingBehavior)P(2,4,1:c#ui.unit.Dp!1,5)");
        Function2<SnapperLayoutInfo, SnapperLayoutItemInfo, Integer> center = (i2 & 2) != 0 ? SnapOffsets.INSTANCE.getCenter() : function2;
        if ((i2 & 4) != 0) {
            Dp.m5607constructorimpl(0);
        }
        DecayAnimationSpec<Float> rememberSplineBasedDecay = (i2 & 8) != 0 ? SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0) : decayAnimationSpec;
        AnimationSpec<Float> springAnimationSpec = (i2 & 16) != 0 ? SnapperFlingBehaviorDefaults.INSTANCE.getSpringAnimationSpec() : animationSpec;
        Function3<SnapperLayoutInfo, Integer, Integer, Integer> snapIndex = (i2 & 32) != 0 ? SnapperFlingBehaviorDefaults.INSTANCE.getSnapIndex() : function3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(256629433, i, -1, "com.ifriend.presentation.features.onboarding.steps.view.common.rememberSnapperFlingBehavior (OnboardingWheelPickerComponent.kt:299)");
        }
        SnapperFlingBehavior rememberSnapperFlingBehavior = SnapperFlingBehaviorKt.rememberSnapperFlingBehavior(rememberLazyListSnapperLayoutInfo(lazyListState, center, composer, (i & 14) | (i & 112), 0), rememberSplineBasedDecay, springAnimationSpec, snapIndex, composer, ((i >> 6) & 7168) | 576, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberSnapperFlingBehavior;
    }

    @Deprecated(message = "The maximumFlingDistance parameter has been replaced with snapIndex")
    /* renamed from: rememberSnapperFlingBehavior-osbwsH8  reason: not valid java name */
    public static final SnapperFlingBehavior m6941rememberSnapperFlingBehaviorosbwsH8(LazyListState lazyListState, Function2<? super SnapperLayoutInfo, ? super SnapperLayoutItemInfo, Integer> function2, float f, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec, Function1<? super SnapperLayoutInfo, Float> maximumFlingDistance, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        Intrinsics.checkNotNullParameter(maximumFlingDistance, "maximumFlingDistance");
        composer.startReplaceableGroup(841401083);
        ComposerKt.sourceInformation(composer, "C(rememberSnapperFlingBehavior)P(2,4,1:c#ui.unit.Dp!1,5)");
        Function2<SnapperLayoutInfo, SnapperLayoutItemInfo, Integer> center = (i2 & 2) != 0 ? SnapOffsets.INSTANCE.getCenter() : function2;
        float m5607constructorimpl = (i2 & 4) != 0 ? Dp.m5607constructorimpl(0) : f;
        DecayAnimationSpec<Float> rememberSplineBasedDecay = (i2 & 8) != 0 ? SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0) : decayAnimationSpec;
        AnimationSpec<Float> springAnimationSpec = (i2 & 16) != 0 ? SnapperFlingBehaviorDefaults.INSTANCE.getSpringAnimationSpec() : animationSpec;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(841401083, i, -1, "com.ifriend.presentation.features.onboarding.steps.view.common.rememberSnapperFlingBehavior (OnboardingWheelPickerComponent.kt:317)");
        }
        int i3 = ((i >> 6) & 7168) | 576;
        SnapperFlingBehavior rememberSnapperFlingBehavior = SnapperFlingBehaviorKt.rememberSnapperFlingBehavior(m6940rememberLazyListSnapperLayoutInfo6a0pyJM(lazyListState, center, m5607constructorimpl, composer, (i & 896) | (i & 14) | (i & 112), 0), rememberSplineBasedDecay, springAnimationSpec, maximumFlingDistance, composer, i3, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberSnapperFlingBehavior;
    }

    @Deprecated(message = "endContentPadding is no longer necessary to be passed in", replaceWith = @ReplaceWith(expression = "rememberLazyListSnapperLayoutInfo(lazyListState, snapOffsetForItem)", imports = {}))
    /* renamed from: rememberLazyListSnapperLayoutInfo-6a0pyJM  reason: not valid java name */
    public static final LazyListSnapperLayoutInfo m6940rememberLazyListSnapperLayoutInfo6a0pyJM(LazyListState lazyListState, Function2<? super SnapperLayoutInfo, ? super SnapperLayoutItemInfo, Integer> function2, float f, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        composer.startReplaceableGroup(-1828250896);
        ComposerKt.sourceInformation(composer, "C(rememberLazyListSnapperLayoutInfo)P(1,2,0:c#ui.unit.Dp)");
        if ((i2 & 2) != 0) {
            function2 = SnapOffsets.INSTANCE.getCenter();
        }
        if ((i2 & 4) != 0) {
            Dp.m5607constructorimpl(0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1828250896, i, -1, "com.ifriend.presentation.features.onboarding.steps.view.common.rememberLazyListSnapperLayoutInfo (OnboardingWheelPickerComponent.kt:345)");
        }
        LazyListSnapperLayoutInfo rememberLazyListSnapperLayoutInfo = rememberLazyListSnapperLayoutInfo(lazyListState, function2, composer, (i & 14) | (i & 112), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberLazyListSnapperLayoutInfo;
    }

    public static final LazyListSnapperLayoutInfo rememberLazyListSnapperLayoutInfo(LazyListState lazyListState, Function2<? super SnapperLayoutInfo, ? super SnapperLayoutItemInfo, Integer> function2, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        composer.startReplaceableGroup(-70478850);
        ComposerKt.sourceInformation(composer, "C(rememberLazyListSnapperLayoutInfo)");
        if ((i2 & 2) != 0) {
            function2 = SnapOffsets.INSTANCE.getCenter();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-70478850, i, -1, "com.ifriend.presentation.features.onboarding.steps.view.common.rememberLazyListSnapperLayoutInfo (OnboardingWheelPickerComponent.kt:361)");
        }
        composer.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed = composer.changed(lazyListState) | composer.changed(function2);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyListSnapperLayoutInfo(lazyListState, function2);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        LazyListSnapperLayoutInfo lazyListSnapperLayoutInfo = (LazyListSnapperLayoutInfo) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lazyListSnapperLayoutInfo;
    }
}
