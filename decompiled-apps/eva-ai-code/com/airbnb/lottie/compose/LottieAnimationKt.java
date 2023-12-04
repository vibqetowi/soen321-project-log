package com.airbnb.lottie.compose;

import android.graphics.Matrix;
import android.graphics.Typeface;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ScaleFactor;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSizeKt;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.RenderMode;
import com.airbnb.lottie.utils.Utils;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LottieAnimation.kt */
@Metadata(d1 = {"\u0000z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u00ad\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\n2\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u0010\u001d\u001aÝ\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\n2\b\b\u0002\u0010\u001f\u001a\u00020\n2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010%\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\n2\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u0010&\u001a\u0091\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u0010'\u001a\"\u0010(\u001a\u00020)*\u00020*2\u0006\u0010+\u001a\u00020,H\u0082\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006/"}, d2 = {"LottieAnimation", "", "composition", "Lcom/airbnb/lottie/LottieComposition;", "progress", "Lkotlin/Function0;", "", "modifier", "Landroidx/compose/ui/Modifier;", "outlineMasksAndMattes", "", "applyOpacityToLayers", "enableMergePaths", "renderMode", "Lcom/airbnb/lottie/RenderMode;", "maintainOriginalImageBounds", "dynamicProperties", "Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "clipToCompositionBounds", "fontMap", "", "", "Landroid/graphics/Typeface;", "asyncUpdates", "Lcom/airbnb/lottie/AsyncUpdates;", "(Lcom/airbnb/lottie/LottieComposition;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZZLcom/airbnb/lottie/RenderMode;ZLcom/airbnb/lottie/compose/LottieDynamicProperties;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;ZLjava/util/Map;Lcom/airbnb/lottie/AsyncUpdates;Landroidx/compose/runtime/Composer;III)V", "isPlaying", "restartOnPlay", "clipSpec", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "speed", "iterations", "", "reverseOnRepeat", "(Lcom/airbnb/lottie/LottieComposition;Landroidx/compose/ui/Modifier;ZZLcom/airbnb/lottie/compose/LottieClipSpec;FIZZZLcom/airbnb/lottie/RenderMode;ZZLcom/airbnb/lottie/compose/LottieDynamicProperties;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;ZLjava/util/Map;Lcom/airbnb/lottie/AsyncUpdates;Landroidx/compose/runtime/Composer;III)V", "(Lcom/airbnb/lottie/LottieComposition;FLandroidx/compose/ui/Modifier;ZZZLcom/airbnb/lottie/RenderMode;ZLcom/airbnb/lottie/compose/LottieDynamicProperties;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;ZLcom/airbnb/lottie/AsyncUpdates;Landroidx/compose/runtime/Composer;III)V", "times", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/geometry/Size;", "scale", "Landroidx/compose/ui/layout/ScaleFactor;", "times-UQTWf7w", "(JJ)J", "lottie-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LottieAnimationKt {
    public static final void LottieAnimation(LottieComposition lottieComposition, Function0<Float> progress, Modifier modifier, boolean z, boolean z2, boolean z3, RenderMode renderMode, boolean z4, LottieDynamicProperties lottieDynamicProperties, Alignment alignment, ContentScale contentScale, boolean z5, Map<String, ? extends Typeface> map, AsyncUpdates asyncUpdates, Composer composer, int i, int i2, int i3) {
        Composer composer2;
        Intrinsics.checkNotNullParameter(progress, "progress");
        Composer startRestartGroup = composer.startRestartGroup(-1070242582);
        ComposerKt.sourceInformation(startRestartGroup, "C(LottieAnimation)P(4,12,10,11,1,7,13,9,6!1,5,3,8)");
        Modifier.Companion companion = (i3 & 4) != 0 ? Modifier.Companion : modifier;
        boolean z6 = (i3 & 8) != 0 ? false : z;
        boolean z7 = (i3 & 16) != 0 ? false : z2;
        boolean z8 = (i3 & 32) != 0 ? false : z3;
        RenderMode renderMode2 = (i3 & 64) != 0 ? RenderMode.AUTOMATIC : renderMode;
        boolean z9 = (i3 & 128) != 0 ? false : z4;
        LottieDynamicProperties lottieDynamicProperties2 = (i3 & 256) != 0 ? null : lottieDynamicProperties;
        Alignment center = (i3 & 512) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i3 & 1024) != 0 ? ContentScale.Companion.getFit() : contentScale;
        boolean z10 = (i3 & 2048) != 0 ? true : z5;
        Map<String, ? extends Typeface> map2 = (i3 & 4096) != 0 ? null : map;
        AsyncUpdates asyncUpdates2 = (i3 & 8192) != 0 ? AsyncUpdates.AUTOMATIC : asyncUpdates;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1070242582, i, i2, "com.airbnb.lottie.compose.LottieAnimation (LottieAnimation.kt:75)");
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LottieDrawable();
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        LottieDrawable lottieDrawable = (LottieDrawable) rememberedValue;
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new Matrix();
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        Matrix matrix = (Matrix) rememberedValue2;
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = startRestartGroup.changed(lottieComposition);
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (changed || rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue3;
        startRestartGroup.startReplaceableGroup(185151773);
        if (lottieComposition != null) {
            if (!(lottieComposition.getDuration() == 0.0f)) {
                startRestartGroup.endReplaceableGroup();
                float dpScale = Utils.dpScale();
                Modifier modifier2 = companion;
                CanvasKt.Canvas(SizeKt.m797sizeVpY3zN4(companion, Dp.m5607constructorimpl(lottieComposition.getBounds().width() / dpScale), Dp.m5607constructorimpl(lottieComposition.getBounds().height() / dpScale)), new LottieAnimationKt$LottieAnimation$2(lottieComposition, fit, center, matrix, lottieDrawable, z8, renderMode2, asyncUpdates2, map2, lottieDynamicProperties2, z6, z7, z9, z10, progress, mutableState), startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new LottieAnimationKt$LottieAnimation$3(lottieComposition, progress, modifier2, z6, z7, z8, renderMode2, z9, lottieDynamicProperties2, center, fit, z10, map2, asyncUpdates2, i, i2, i3));
                return;
            }
        }
        Modifier modifier3 = companion;
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 == null) {
            composer2 = startRestartGroup;
        } else {
            composer2 = startRestartGroup;
            endRestartGroup2.updateScope(new LottieAnimationKt$LottieAnimation$1(lottieComposition, progress, modifier3, z6, z7, z8, renderMode2, z9, lottieDynamicProperties2, center, fit, z10, map2, asyncUpdates2, i, i2, i3));
        }
        BoxKt.Box(modifier3, composer2, (i >> 6) & 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LottieDynamicProperties LottieAnimation$lambda$3(MutableState<LottieDynamicProperties> mutableState) {
        return mutableState.getValue();
    }

    @Deprecated(message = "Pass progress as a lambda instead of a float. This overload will be removed in the next release.")
    public static final void LottieAnimation(LottieComposition lottieComposition, float f, Modifier modifier, boolean z, boolean z2, boolean z3, RenderMode renderMode, boolean z4, LottieDynamicProperties lottieDynamicProperties, Alignment alignment, ContentScale contentScale, boolean z5, AsyncUpdates asyncUpdates, Composer composer, int i, int i2, int i3) {
        LottieAnimationKt$LottieAnimation$4$1 lottieAnimationKt$LottieAnimation$4$1;
        Composer startRestartGroup = composer.startRestartGroup(627485782);
        ComposerKt.sourceInformation(startRestartGroup, "C(LottieAnimation)P(4,11,9,10,1,7,12,8,6!1,5,3)");
        Modifier.Companion companion = (i3 & 4) != 0 ? Modifier.Companion : modifier;
        boolean z6 = (i3 & 8) != 0 ? false : z;
        boolean z7 = (i3 & 16) != 0 ? false : z2;
        boolean z8 = (i3 & 32) != 0 ? false : z3;
        RenderMode renderMode2 = (i3 & 64) != 0 ? RenderMode.AUTOMATIC : renderMode;
        boolean z9 = (i3 & 128) != 0 ? false : z4;
        LottieDynamicProperties lottieDynamicProperties2 = (i3 & 256) != 0 ? null : lottieDynamicProperties;
        Alignment center = (i3 & 512) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i3 & 1024) != 0 ? ContentScale.Companion.getFit() : contentScale;
        boolean z10 = (i3 & 2048) != 0 ? true : z5;
        AsyncUpdates asyncUpdates2 = (i3 & 4096) != 0 ? AsyncUpdates.AUTOMATIC : asyncUpdates;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(627485782, i, i2, "com.airbnb.lottie.compose.LottieAnimation (LottieAnimation.kt:140)");
        }
        Float valueOf = Float.valueOf(f);
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = startRestartGroup.changed(valueOf);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            lottieAnimationKt$LottieAnimation$4$1 = new LottieAnimationKt$LottieAnimation$4$1(f);
            startRestartGroup.updateRememberedValue(lottieAnimationKt$LottieAnimation$4$1);
        } else {
            lottieAnimationKt$LottieAnimation$4$1 = rememberedValue;
        }
        startRestartGroup.endReplaceableGroup();
        LottieAnimation(lottieComposition, lottieAnimationKt$LottieAnimation$4$1, companion, z6, z7, z8, renderMode2, z9, lottieDynamicProperties2, center, fit, z10, null, asyncUpdates2, startRestartGroup, (i & 896) | 134217736 | (i & 7168) | (57344 & i) | (458752 & i) | (3670016 & i) | (29360128 & i) | (1879048192 & i), (i2 & 14) | (i2 & 112) | ((i2 << 3) & 7168), 4096);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new LottieAnimationKt$LottieAnimation$5(lottieComposition, f, companion, z6, z7, z8, renderMode2, z9, lottieDynamicProperties2, center, fit, z10, asyncUpdates2, i, i2, i3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    public static final void LottieAnimation(LottieComposition lottieComposition, Modifier modifier, boolean z, boolean z2, LottieClipSpec lottieClipSpec, float f, int i, boolean z3, boolean z4, boolean z5, RenderMode renderMode, boolean z6, boolean z7, LottieDynamicProperties lottieDynamicProperties, Alignment alignment, ContentScale contentScale, boolean z8, Map<String, ? extends Typeface> map, AsyncUpdates asyncUpdates, Composer composer, int i2, int i3, int i4) {
        Composer startRestartGroup = composer.startRestartGroup(1541656025);
        ComposerKt.sourceInformation(startRestartGroup, "C(LottieAnimation)P(5,13,10,16,3,18,11,14,1,8,15,17,12,7!1,6,4,9)");
        Modifier.Companion companion = (i4 & 2) != 0 ? Modifier.Companion : modifier;
        boolean z9 = (i4 & 4) != 0 ? true : z;
        boolean z10 = (i4 & 8) != 0 ? true : z2;
        LottieClipSpec lottieClipSpec2 = (i4 & 16) != 0 ? null : lottieClipSpec;
        float f2 = (i4 & 32) != 0 ? 1.0f : f;
        int i5 = (i4 & 64) != 0 ? 1 : i;
        boolean z11 = (i4 & 128) != 0 ? false : z3;
        boolean z12 = (i4 & 256) != 0 ? false : z4;
        boolean z13 = (i4 & 512) != 0 ? false : z5;
        RenderMode renderMode2 = (i4 & 1024) != 0 ? RenderMode.AUTOMATIC : renderMode;
        boolean z14 = (i4 & 2048) != 0 ? false : z6;
        boolean z15 = (i4 & 4096) != 0 ? false : z7;
        LottieDynamicProperties lottieDynamicProperties2 = (i4 & 8192) != 0 ? null : lottieDynamicProperties;
        Alignment center = (i4 & 16384) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (32768 & i4) != 0 ? ContentScale.Companion.getFit() : contentScale;
        boolean z16 = (65536 & i4) != 0 ? true : z8;
        Map<String, ? extends Typeface> map2 = (131072 & i4) != 0 ? null : map;
        AsyncUpdates asyncUpdates2 = (262144 & i4) != 0 ? AsyncUpdates.AUTOMATIC : asyncUpdates;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1541656025, i2, i3, "com.airbnb.lottie.compose.LottieAnimation (LottieAnimation.kt:181)");
        }
        int i6 = i2 >> 3;
        LottieAnimationState animateLottieCompositionAsState = AnimateLottieCompositionAsStateKt.animateLottieCompositionAsState(lottieComposition, z9, z10, z14, lottieClipSpec2, f2, i5, null, false, false, startRestartGroup, ((i3 << 6) & 7168) | (i6 & 112) | 8 | (i6 & 896) | (i2 & 57344) | (i2 & 458752) | (i2 & 3670016), 896);
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = startRestartGroup.changed(animateLottieCompositionAsState);
        LottieAnimationKt$LottieAnimation$6$1 rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LottieAnimationKt$LottieAnimation$6$1(animateLottieCompositionAsState);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        int i7 = i2 >> 12;
        int i8 = ((i2 << 3) & 896) | 134217736 | (i7 & 7168) | (i7 & 57344) | (i7 & 458752) | ((i3 << 18) & 3670016);
        int i9 = i3 << 15;
        int i10 = i8 | (29360128 & i9) | (i9 & 1879048192);
        int i11 = i3 >> 15;
        LottieAnimation(lottieComposition, rememberedValue, companion, z11, z12, z13, renderMode2, z15, lottieDynamicProperties2, center, fit, z16, map2, asyncUpdates2, startRestartGroup, i10, (i11 & 7168) | (i11 & 14) | 512 | (i11 & 112), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new LottieAnimationKt$LottieAnimation$7(lottieComposition, companion, z9, z10, lottieClipSpec2, f2, i5, z11, z12, z13, renderMode2, z14, z15, lottieDynamicProperties2, center, fit, z16, map2, asyncUpdates2, i2, i3, i4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LottieAnimation$lambda$6(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: times-UQTWf7w  reason: not valid java name */
    public static final long m6211timesUQTWf7w(long j, long j2) {
        return IntSizeKt.IntSize((int) (Size.m3087getWidthimpl(j) * ScaleFactor.m4623getScaleXimpl(j2)), (int) (Size.m3084getHeightimpl(j) * ScaleFactor.m4624getScaleYimpl(j2)));
    }
}
