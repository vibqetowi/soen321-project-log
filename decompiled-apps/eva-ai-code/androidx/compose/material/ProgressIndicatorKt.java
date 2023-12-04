package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
/* compiled from: ProgressIndicator.kt */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\u001a3\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u0005H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001aG\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010'\u001a\u00020#2\b\b\u0002\u0010(\u001a\u00020)H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a;\u0010\u001e\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u0005H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001aO\u0010\u001e\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010'\u001a\u00020#2\b\b\u0002\u0010(\u001a\u00020)H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a3\u00101\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010'\u001a\u00020#H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a=\u00101\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010'\u001a\u00020#2\b\b\u0002\u0010(\u001a\u00020)H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a;\u00101\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010'\u001a\u00020#H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b6\u00107\u001aE\u00101\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010'\u001a\u00020#2\b\b\u0002\u0010(\u001a\u00020)H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a9\u0010:\u001a\u00020\u001f*\u00020;2\u0006\u0010<\u001a\u00020\u00012\u0006\u0010=\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u0010>\u001a\u00020?H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a)\u0010B\u001a\u00020\u001f*\u00020;2\u0006\u0010\"\u001a\u00020#2\u0006\u0010>\u001a\u00020?H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bC\u0010D\u001a9\u0010E\u001a\u00020\u001f*\u00020;2\u0006\u0010<\u001a\u00020\u00012\u0006\u0010=\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u0010>\u001a\u00020?H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bF\u0010A\u001aA\u0010G\u001a\u00020\u001f*\u00020;2\u0006\u0010<\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u0010>\u001a\u00020?H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bH\u0010I\u001aA\u0010J\u001a\u00020\u001f*\u00020;2\u0006\u0010K\u001a\u00020\u00012\u0006\u0010L\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010(\u001a\u00020)H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bM\u0010N\u001a1\u0010O\u001a\u00020\u001f*\u00020;2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010(\u001a\u00020)H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bP\u0010Q\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\u0012\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\u0013\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006R²\u0006\n\u0010S\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010T\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010U\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010V\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010W\u001a\u00020\bX\u008a\u0084\u0002²\u0006\n\u0010X\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010Y\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010<\u001a\u00020\u0001X\u008a\u0084\u0002"}, d2 = {"BaseRotationAngle", "", "CircularEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "CircularIndicatorDiameter", "Landroidx/compose/ui/unit/Dp;", "F", "FirstLineHeadDelay", "", "FirstLineHeadDuration", "FirstLineHeadEasing", "FirstLineTailDelay", "FirstLineTailDuration", "FirstLineTailEasing", "HeadAndTailAnimationDuration", "HeadAndTailDelayDuration", "JumpRotationAngle", "LinearAnimationDuration", "LinearIndicatorHeight", "LinearIndicatorWidth", "RotationAngleOffset", "RotationDuration", "RotationsPerCycle", "SecondLineHeadDelay", "SecondLineHeadDuration", "SecondLineHeadEasing", "SecondLineTailDelay", "SecondLineTailDuration", "SecondLineTailEasing", "StartAngleOffset", "CircularProgressIndicator", "", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "strokeWidth", "CircularProgressIndicator-aM-cp0Q", "(Landroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "strokeCap", "Landroidx/compose/ui/graphics/StrokeCap;", "CircularProgressIndicator-LxG7B9w", "(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "progress", "CircularProgressIndicator-MBs18nI", "(FLandroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-DUhRLBM", "(FLandroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator", "LinearProgressIndicator-RIQooxk", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-2cYBFYY", "(Landroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-eaDK9VM", "(FLandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-_5eSR-E", "(FLandroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "drawCircularIndicator", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "startAngle", "sweep", "stroke", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "drawCircularIndicator-42QJj7c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawCircularIndicatorBackground", "drawCircularIndicatorBackground-bw27NRU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawDeterminateCircularIndicator", "drawDeterminateCircularIndicator-42QJj7c", "drawIndeterminateCircularIndicator", "drawIndeterminateCircularIndicator-hrjfTZI", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawLinearIndicator", "startFraction", "endFraction", "drawLinearIndicator-qYKTg0g", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJFI)V", "drawLinearIndicatorBackground", "drawLinearIndicatorBackground-AZGd3zU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFI)V", "material_release", "firstLineHead", "firstLineTail", "secondLineHead", "secondLineTail", "currentRotation", "baseRotation", "endAngle"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProgressIndicatorKt {
    private static final float BaseRotationAngle = 286.0f;
    private static final int FirstLineHeadDelay = 0;
    private static final int FirstLineHeadDuration = 750;
    private static final int FirstLineTailDelay = 333;
    private static final int FirstLineTailDuration = 850;
    private static final int HeadAndTailAnimationDuration = 666;
    private static final int HeadAndTailDelayDuration = 666;
    private static final float JumpRotationAngle = 290.0f;
    private static final int LinearAnimationDuration = 1800;
    private static final float RotationAngleOffset = 216.0f;
    private static final int RotationDuration = 1332;
    private static final int RotationsPerCycle = 5;
    private static final int SecondLineHeadDelay = 1000;
    private static final int SecondLineHeadDuration = 567;
    private static final int SecondLineTailDelay = 1267;
    private static final int SecondLineTailDuration = 533;
    private static final float StartAngleOffset = -90.0f;
    private static final float LinearIndicatorHeight = ProgressIndicatorDefaults.INSTANCE.m1421getStrokeWidthD9Ej5fM();
    private static final float LinearIndicatorWidth = Dp.m5607constructorimpl((float) PsExtractor.VIDEO_STREAM_MASK);
    private static final float CircularIndicatorDiameter = Dp.m5607constructorimpl(40);
    private static final CubicBezierEasing FirstLineHeadEasing = new CubicBezierEasing(0.2f, 0.0f, 0.8f, 1.0f);
    private static final CubicBezierEasing FirstLineTailEasing = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
    private static final CubicBezierEasing SecondLineHeadEasing = new CubicBezierEasing(0.0f, 0.0f, 0.65f, 1.0f);
    private static final CubicBezierEasing SecondLineTailEasing = new CubicBezierEasing(0.1f, 0.0f, 0.45f, 1.0f);
    private static final CubicBezierEasing CircularEasing = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0159 A[LOOP:0: B:85:0x0157->B:86:0x0159, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a0  */
    /* renamed from: LinearProgressIndicator-_5eSR-E  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1428LinearProgressIndicator_5eSRE(float f, Modifier modifier, long j, long j2, int i, Composer composer, int i2, int i3) {
        int i4;
        Modifier.Companion companion;
        long j3;
        long j4;
        int i5;
        int i6;
        boolean z;
        ProgressIndicatorKt$LinearProgressIndicator$1$1 rememberedValue;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-531984864);
        ComposerKt.sourceInformation(startRestartGroup, "C(LinearProgressIndicator)P(3,2,1:c#ui.graphics.Color,0:c#ui.graphics.Color,4:c#ui.graphics.StrokeCap)76@3573L6,85@3911L204,81@3769L346:ProgressIndicator.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            companion = modifier;
            i4 |= startRestartGroup.changed(companion) ? 32 : 16;
            if ((i2 & 896) != 0) {
                if ((i3 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i9 = 256;
                        i4 |= i9;
                    }
                } else {
                    j3 = j;
                }
                i9 = 128;
                i4 |= i9;
            } else {
                j3 = j;
            }
            if ((i2 & 7168) != 0) {
                if ((i3 & 8) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i8 = 2048;
                        i4 |= i8;
                    }
                } else {
                    j4 = j2;
                }
                i8 = 1024;
                i4 |= i8;
            } else {
                j4 = j2;
            }
            if ((57344 & i2) != 0) {
                if ((i3 & 16) == 0) {
                    i5 = i;
                    if (startRestartGroup.changed(i5)) {
                        i7 = 16384;
                        i4 |= i7;
                    }
                } else {
                    i5 = i;
                }
                i7 = 8192;
                i4 |= i7;
            } else {
                i5 = i;
            }
            if ((i4 & 46811) == 9362 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    if (i10 != 0) {
                        companion = Modifier.Companion;
                    }
                    if ((i3 & 4) != 0) {
                        j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1309getPrimary0d7_KjU();
                    }
                    if ((i3 & 8) != 0) {
                        j4 = Color.m3290copywmQWz5c$default(j3, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    if ((i3 & 16) != 0) {
                        i5 = StrokeCap.Companion.m3644getButtKaPHkGw();
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-531984864, i2, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:72)");
                }
                float coerceIn = RangesKt.coerceIn(f, 0.0f, 1.0f);
                Modifier m797sizeVpY3zN4 = SizeKt.m797sizeVpY3zN4(ProgressSemanticsKt.progressSemantics$default(companion, coerceIn, null, 0, 6, null), LinearIndicatorWidth, LinearIndicatorHeight);
                Object[] objArr = {Color.m3281boximpl(j4), StrokeCap.m3637boximpl(i5), Float.valueOf(coerceIn), Color.m3281boximpl(j3)};
                startRestartGroup.startReplaceableGroup(-568225417);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                i6 = 0;
                z = false;
                for (int i11 = 4; i6 < i11; i11 = 4) {
                    z |= startRestartGroup.changed(objArr[i6]);
                    i6++;
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new ProgressIndicatorKt$LinearProgressIndicator$1$1(j4, i5, coerceIn, j3);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(m797sizeVpY3zN4, (Function1) rememberedValue, startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            long j5 = j3;
            long j6 = j4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new ProgressIndicatorKt$LinearProgressIndicator$2(f, companion, j5, j6, i5, i2, i3));
            return;
        }
        companion = modifier;
        if ((i2 & 896) != 0) {
        }
        if ((i2 & 7168) != 0) {
        }
        if ((57344 & i2) != 0) {
        }
        if ((i4 & 46811) == 9362) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if ((i3 & 4) != 0) {
        }
        if ((i3 & 8) != 0) {
        }
        if ((i3 & 16) != 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        float coerceIn2 = RangesKt.coerceIn(f, 0.0f, 1.0f);
        Modifier m797sizeVpY3zN42 = SizeKt.m797sizeVpY3zN4(ProgressSemanticsKt.progressSemantics$default(companion, coerceIn2, null, 0, 6, null), LinearIndicatorWidth, LinearIndicatorHeight);
        Object[] objArr2 = {Color.m3281boximpl(j4), StrokeCap.m3637boximpl(i5), Float.valueOf(coerceIn2), Color.m3281boximpl(j3)};
        startRestartGroup.startReplaceableGroup(-568225417);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        i6 = 0;
        z = false;
        while (i6 < i11) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = new ProgressIndicatorKt$LinearProgressIndicator$1$1(j4, i5, coerceIn2, j3);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        CanvasKt.Canvas(m797sizeVpY3zN42, (Function1) rememberedValue, startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        long j52 = j3;
        long j62 = j4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x020c A[LOOP:0: B:75:0x020a->B:76:0x020c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0245  */
    /* renamed from: LinearProgressIndicator-2cYBFYY  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1426LinearProgressIndicator2cYBFYY(Modifier modifier, long j, long j2, int i, Composer composer, int i2, int i3) {
        Object obj;
        int i4;
        long j3;
        long j4;
        int i5;
        Modifier.Companion companion;
        int m3644getButtKaPHkGw;
        long j5;
        long j6;
        boolean z;
        int i6;
        ProgressIndicatorKt$LinearProgressIndicator$3$1 rememberedValue;
        long j7;
        int i7;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(1501635280);
        ComposerKt.sourceInformation(startRestartGroup, "C(LinearProgressIndicator)P(2,1:c#ui.graphics.Color,0:c#ui.graphics.Color,3:c#ui.graphics.StrokeCap)108@5031L6,112@5200L28,116@5482L319,127@5846L319,138@6211L323,149@6580L323,164@7035L624,160@6908L751:ProgressIndicator.kt#jmzs0o");
        int i11 = i3 & 1;
        if (i11 != 0) {
            i4 = i2 | 6;
            obj = modifier;
        } else if ((i2 & 14) == 0) {
            obj = modifier;
            i4 = (startRestartGroup.changed(obj) ? 4 : 2) | i2;
        } else {
            obj = modifier;
            i4 = i2;
        }
        if ((i2 & 112) == 0) {
            if ((i3 & 2) == 0) {
                j3 = j;
                if (startRestartGroup.changed(j3)) {
                    i10 = 32;
                    i4 |= i10;
                }
            } else {
                j3 = j;
            }
            i10 = 16;
            i4 |= i10;
        } else {
            j3 = j;
        }
        if ((i2 & 896) == 0) {
            if ((i3 & 4) == 0) {
                j4 = j2;
                if (startRestartGroup.changed(j4)) {
                    i9 = 256;
                    i4 |= i9;
                }
            } else {
                j4 = j2;
            }
            i9 = 128;
            i4 |= i9;
        } else {
            j4 = j2;
        }
        if ((i2 & 7168) == 0) {
            if ((i3 & 8) == 0) {
                i5 = i;
                if (startRestartGroup.changed(i5)) {
                    i8 = 2048;
                    i4 |= i8;
                }
            } else {
                i5 = i;
            }
            i8 = 1024;
            i4 |= i8;
        } else {
            i5 = i;
        }
        if ((i4 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                companion = i11 != 0 ? Modifier.Companion : obj;
                if ((i3 & 2) != 0) {
                    j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1309getPrimary0d7_KjU();
                }
                if ((i3 & 4) != 0) {
                    j4 = Color.m3290copywmQWz5c$default(j3, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                if ((i3 & 8) != 0) {
                    m3644getButtKaPHkGw = StrokeCap.Companion.m3644getButtKaPHkGw();
                    j5 = j3;
                    j6 = j4;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1501635280, i2, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:106)");
                    }
                    InfiniteTransition rememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(null, startRestartGroup, 0, 1);
                    State<Float> animateFloat = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m352infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$2.INSTANCE), null, 0L, 6, null), null, startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                    State<Float> animateFloat2 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m352infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$2.INSTANCE), null, 0L, 6, null), null, startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                    State<Float> animateFloat3 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m352infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$2.INSTANCE), null, 0L, 6, null), null, startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                    State<Float> animateFloat4 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m352infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$2.INSTANCE), null, 0L, 6, null), null, startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                    Modifier m797sizeVpY3zN4 = SizeKt.m797sizeVpY3zN4(ProgressSemanticsKt.progressSemantics(companion), LinearIndicatorWidth, LinearIndicatorHeight);
                    Object[] objArr = {Color.m3281boximpl(j6), StrokeCap.m3637boximpl(m3644getButtKaPHkGw), animateFloat, animateFloat2, Color.m3281boximpl(j5), animateFloat3, animateFloat4};
                    startRestartGroup.startReplaceableGroup(-568225417);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    z = false;
                    for (i6 = 0; i6 < 7; i6++) {
                        z |= startRestartGroup.changed(objArr[i6]);
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new ProgressIndicatorKt$LinearProgressIndicator$3$1(j6, m3644getButtKaPHkGw, j5, animateFloat, animateFloat2, animateFloat3, animateFloat4);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(m797sizeVpY3zN4, (Function1) rememberedValue, startRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j3 = j5;
                    j7 = j6;
                    i7 = m3644getButtKaPHkGw;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                companion = obj;
            }
            j5 = j3;
            j6 = j4;
            m3644getButtKaPHkGw = i5;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            InfiniteTransition rememberInfiniteTransition2 = InfiniteTransitionKt.rememberInfiniteTransition(null, startRestartGroup, 0, 1);
            State<Float> animateFloat5 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition2, 0.0f, 1.0f, AnimationSpecKt.m352infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$2.INSTANCE), null, 0L, 6, null), null, startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
            State<Float> animateFloat22 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition2, 0.0f, 1.0f, AnimationSpecKt.m352infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$2.INSTANCE), null, 0L, 6, null), null, startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
            State<Float> animateFloat32 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition2, 0.0f, 1.0f, AnimationSpecKt.m352infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$2.INSTANCE), null, 0L, 6, null), null, startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
            State<Float> animateFloat42 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition2, 0.0f, 1.0f, AnimationSpecKt.m352infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$2.INSTANCE), null, 0L, 6, null), null, startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
            Modifier m797sizeVpY3zN42 = SizeKt.m797sizeVpY3zN4(ProgressSemanticsKt.progressSemantics(companion), LinearIndicatorWidth, LinearIndicatorHeight);
            Object[] objArr2 = {Color.m3281boximpl(j6), StrokeCap.m3637boximpl(m3644getButtKaPHkGw), animateFloat5, animateFloat22, Color.m3281boximpl(j5), animateFloat32, animateFloat42};
            startRestartGroup.startReplaceableGroup(-568225417);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            z = false;
            while (i6 < 7) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue = new ProgressIndicatorKt$LinearProgressIndicator$3$1(j6, m3644getButtKaPHkGw, j5, animateFloat5, animateFloat22, animateFloat32, animateFloat42);
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(m797sizeVpY3zN42, (Function1) rememberedValue, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            j3 = j5;
            j7 = j6;
            i7 = m3644getButtKaPHkGw;
        } else {
            startRestartGroup.skipToGroupEnd();
            companion = obj;
            j7 = j4;
            i7 = i5;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new ProgressIndicatorKt$LinearProgressIndicator$4(companion, j3, j7, i7, i2, i3));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: LinearProgressIndicator-eaDK9VM  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m1429LinearProgressIndicatoreaDK9VM(float f, Modifier modifier, long j, long j2, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        long j3;
        long j4;
        Modifier.Companion companion;
        long j5;
        long m3290copywmQWz5c$default;
        long j6;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-850309746);
        ComposerKt.sourceInformation(startRestartGroup, "C(LinearProgressIndicator)P(3,2,1:c#ui.graphics.Color,0:c#ui.graphics.Color)193@7877L6,195@7973L118:ProgressIndicator.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 32 : 16;
            if ((i & 896) != 0) {
                j3 = j;
                i3 |= ((i2 & 4) == 0 && startRestartGroup.changed(j3)) ? 256 : 128;
            } else {
                j3 = j;
            }
            if ((i & 7168) != 0) {
                j4 = j2;
                i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j4)) ? 2048 : 1024;
            } else {
                j4 = j2;
            }
            if ((i3 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    companion = i4 == 0 ? Modifier.Companion : obj;
                    if ((i2 & 4) == 0) {
                        j5 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1309getPrimary0d7_KjU();
                        i3 &= -897;
                    } else {
                        j5 = j3;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        m3290copywmQWz5c$default = Color.m3290copywmQWz5c$default(j5, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-850309746, i3, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:190)");
                        }
                        m1428LinearProgressIndicator_5eSRE(f, companion, j5, m3290copywmQWz5c$default, StrokeCap.Companion.m3644getButtKaPHkGw(), startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j3 = j5;
                        j6 = m3290copywmQWz5c$default;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    companion = obj;
                    j5 = j3;
                }
                m3290copywmQWz5c$default = j4;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                m1428LinearProgressIndicator_5eSRE(f, companion, j5, m3290copywmQWz5c$default, StrokeCap.Companion.m3644getButtKaPHkGw(), startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                j3 = j5;
                j6 = m3290copywmQWz5c$default;
            } else {
                startRestartGroup.skipToGroupEnd();
                companion = obj;
                j6 = j4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new ProgressIndicatorKt$LinearProgressIndicator$5(f, companion, j3, j6, i, i2));
            return;
        }
        obj = modifier;
        if ((i & 896) != 0) {
        }
        if ((i & 7168) != 0) {
        }
        if ((i3 & 5851) == 1170) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i4 == 0) {
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) != 0) {
        }
        m3290copywmQWz5c$default = j4;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        m1428LinearProgressIndicator_5eSRE(f, companion, j5, m3290copywmQWz5c$default, StrokeCap.Companion.m3644getButtKaPHkGw(), startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        j3 = j5;
        j6 = m3290copywmQWz5c$default;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: LinearProgressIndicator-RIQooxk  reason: not valid java name */
    public static final /* synthetic */ void m1427LinearProgressIndicatorRIQooxk(Modifier modifier, long j, long j2, Composer composer, int i, int i2) {
        Object obj;
        int i3;
        long j3;
        long j4;
        Modifier.Companion companion;
        long j5;
        Composer startRestartGroup = composer.startRestartGroup(-819397058);
        ComposerKt.sourceInformation(startRestartGroup, "C(LinearProgressIndicator)P(2,1:c#ui.graphics.Color,0:c#ui.graphics.Color)207@8286L6,209@8382L104:ProgressIndicator.kt#jmzs0o");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            obj = modifier;
        } else if ((i & 14) == 0) {
            obj = modifier;
            i3 = (startRestartGroup.changed(obj) ? 4 : 2) | i;
        } else {
            obj = modifier;
            i3 = i;
        }
        if ((i & 112) == 0) {
            j3 = j;
            i3 |= ((i2 & 2) == 0 && startRestartGroup.changed(j3)) ? 32 : 16;
        } else {
            j3 = j;
        }
        if ((i & 896) == 0) {
            j4 = j2;
            i3 |= ((i2 & 4) == 0 && startRestartGroup.changed(j4)) ? 256 : 128;
        } else {
            j4 = j2;
        }
        if ((i3 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            companion = obj;
            j5 = j3;
        } else {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                companion = i4 != 0 ? Modifier.Companion : obj;
                if ((i2 & 2) != 0) {
                    j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1309getPrimary0d7_KjU();
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    j4 = Color.m3290copywmQWz5c$default(j3, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                    i3 &= -897;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                companion = obj;
            }
            int i5 = i3;
            j5 = j3;
            long j6 = j4;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-819397058, i5, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:205)");
            }
            m1426LinearProgressIndicator2cYBFYY(companion, j5, j6, StrokeCap.Companion.m3644getButtKaPHkGw(), startRestartGroup, (i5 & 14) | (i5 & 112) | (i5 & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j4 = j6;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new ProgressIndicatorKt$LinearProgressIndicator$6(companion, j5, j4, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawLinearIndicator-qYKTg0g  reason: not valid java name */
    public static final void m1439drawLinearIndicatorqYKTg0g(DrawScope drawScope, float f, float f2, long j, float f3, int i) {
        float m3087getWidthimpl = Size.m3087getWidthimpl(drawScope.mo3762getSizeNHjbRc());
        float m3084getHeightimpl = Size.m3084getHeightimpl(drawScope.mo3762getSizeNHjbRc());
        float f4 = 2;
        float f5 = m3084getHeightimpl / f4;
        boolean z = drawScope.getLayoutDirection() == LayoutDirection.Ltr;
        float f6 = (z ? f : 1.0f - f2) * m3087getWidthimpl;
        float f7 = (z ? f2 : 1.0f - f) * m3087getWidthimpl;
        if (StrokeCap.m3640equalsimpl0(i, StrokeCap.Companion.m3644getButtKaPHkGw()) || m3084getHeightimpl > m3087getWidthimpl) {
            DrawScope.CC.m3834drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset(f6, f5), OffsetKt.Offset(f7, f5), f3, 0, null, 0.0f, null, 0, 496, null);
            return;
        }
        float f8 = f3 / f4;
        ClosedFloatingPointRange<Float> rangeTo = RangesKt.rangeTo(f8, m3087getWidthimpl - f8);
        float floatValue = ((Number) RangesKt.coerceIn(Float.valueOf(f6), rangeTo)).floatValue();
        float floatValue2 = ((Number) RangesKt.coerceIn(Float.valueOf(f7), rangeTo)).floatValue();
        if (Math.abs(f2 - f) > 0.0f) {
            DrawScope.CC.m3834drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset(floatValue, f5), OffsetKt.Offset(floatValue2, f5), f3, i, null, 0.0f, null, 0, 480, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawLinearIndicatorBackground-AZGd3zU  reason: not valid java name */
    public static final void m1440drawLinearIndicatorBackgroundAZGd3zU(DrawScope drawScope, long j, float f, int i) {
        m1439drawLinearIndicatorqYKTg0g(drawScope, 0.0f, 1.0f, j, f, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0192  */
    /* renamed from: CircularProgressIndicator-DUhRLBM  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1422CircularProgressIndicatorDUhRLBM(float f, Modifier modifier, long j, float f2, long j2, int i, Composer composer, int i2, int i3) {
        int i4;
        Modifier.Companion companion;
        long j3;
        int i5;
        float f3;
        int i6;
        long j4;
        int i7;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(1746618448);
        ComposerKt.sourceInformation(startRestartGroup, "C(CircularProgressIndicator)P(3,2,1:c#ui.graphics.Color,5:c#ui.unit.Dp,0:c#ui.graphics.Color,4:c#ui.graphics.StrokeCap)289@11632L6,*295@11891L7,298@11972L375:ProgressIndicator.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            companion = modifier;
            i4 |= startRestartGroup.changed(companion) ? 32 : 16;
            if ((i2 & 896) != 0) {
                if ((i3 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i9 = 256;
                        i4 |= i9;
                    }
                } else {
                    j3 = j;
                }
                i9 = 128;
                i4 |= i9;
            } else {
                j3 = j;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i2 & 7168) == 0) {
                f3 = f2;
                i4 |= startRestartGroup.changed(f3) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((57344 & i2) == 0) {
                    j4 = j2;
                    i4 |= startRestartGroup.changed(j4) ? 16384 : 8192;
                    if ((458752 & i2) != 0) {
                        if ((i3 & 32) == 0) {
                            i7 = i;
                            if (startRestartGroup.changed(i7)) {
                                i8 = 131072;
                                i4 |= i8;
                            }
                        } else {
                            i7 = i;
                        }
                        i8 = 65536;
                        i4 |= i8;
                    } else {
                        i7 = i;
                    }
                    if ((i4 & 374491) == 74898 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i10 != 0) {
                                companion = Modifier.Companion;
                            }
                            if ((i3 & 4) != 0) {
                                j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1309getPrimary0d7_KjU();
                            }
                            if (i5 != 0) {
                                f3 = ProgressIndicatorDefaults.INSTANCE.m1421getStrokeWidthD9Ej5fM();
                            }
                            if (i6 != 0) {
                                j4 = Color.Companion.m3326getTransparent0d7_KjU();
                            }
                            if ((i3 & 32) != 0) {
                                i7 = StrokeCap.Companion.m3644getButtKaPHkGw();
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1746618448, i2, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:285)");
                        }
                        float coerceIn = RangesKt.coerceIn(f, 0.0f, 1.0f);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        CanvasKt.Canvas(SizeKt.m795size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(companion, coerceIn, null, 0, 6, null), CircularIndicatorDiameter), new ProgressIndicatorKt$CircularProgressIndicator$1(coerceIn, j4, new Stroke(((Density) consume).mo588toPx0680j_4(f3), 0.0f, i7, 0, null, 26, null), j3), startRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                    }
                    long j5 = j3;
                    long j6 = j4;
                    int i11 = i7;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new ProgressIndicatorKt$CircularProgressIndicator$2(f, companion, j5, f3, j6, i11, i2, i3));
                    return;
                }
                j4 = j2;
                if ((458752 & i2) != 0) {
                }
                if ((i4 & 374491) == 74898) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i10 != 0) {
                }
                if ((i3 & 4) != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if ((i3 & 32) != 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                float coerceIn2 = RangesKt.coerceIn(f, 0.0f, 1.0f);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                CanvasKt.Canvas(SizeKt.m795size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(companion, coerceIn2, null, 0, 6, null), CircularIndicatorDiameter), new ProgressIndicatorKt$CircularProgressIndicator$1(coerceIn2, j4, new Stroke(((Density) consume2).mo588toPx0680j_4(f3), 0.0f, i7, 0, null, 26, null), j3), startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                long j52 = j3;
                long j62 = j4;
                int i112 = i7;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            f3 = f2;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            j4 = j2;
            if ((458752 & i2) != 0) {
            }
            if ((i4 & 374491) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i10 != 0) {
            }
            if ((i3 & 4) != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            float coerceIn22 = RangesKt.coerceIn(f, 0.0f, 1.0f);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume22 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CanvasKt.Canvas(SizeKt.m795size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(companion, coerceIn22, null, 0, 6, null), CircularIndicatorDiameter), new ProgressIndicatorKt$CircularProgressIndicator$1(coerceIn22, j4, new Stroke(((Density) consume22).mo588toPx0680j_4(f3), 0.0f, i7, 0, null, 26, null), j3), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            long j522 = j3;
            long j622 = j4;
            int i1122 = i7;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        companion = modifier;
        if ((i2 & 896) != 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        f3 = f2;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        j4 = j2;
        if ((458752 & i2) != 0) {
        }
        if ((i4 & 374491) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if ((i3 & 4) != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        float coerceIn222 = RangesKt.coerceIn(f, 0.0f, 1.0f);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume222 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        CanvasKt.Canvas(SizeKt.m795size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(companion, coerceIn222, null, 0, 6, null), CircularIndicatorDiameter), new ProgressIndicatorKt$CircularProgressIndicator$1(coerceIn222, j4, new Stroke(((Density) consume222).mo588toPx0680j_4(f3), 0.0f, i7, 0, null, 26, null), j3), startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        long j5222 = j3;
        long j6222 = j4;
        int i11222 = i7;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* renamed from: CircularProgressIndicator-LxG7B9w  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1423CircularProgressIndicatorLxG7B9w(Modifier modifier, long j, float f, long j2, int i, Composer composer, int i2, int i3) {
        Object obj;
        int i4;
        long j3;
        float f2;
        int i5;
        long j4;
        int i6;
        Modifier.Companion companion;
        int m3646getSquareKaPHkGw;
        float f3;
        long j5;
        float f4;
        long j6;
        int i7;
        long j7;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-1119119072);
        ComposerKt.sourceInformation(startRestartGroup, "C(CircularProgressIndicator)P(2,1:c#ui.graphics.Color,4:c#ui.unit.Dp,0:c#ui.graphics.Color,3:c#ui.graphics.StrokeCap)328@13340L6,*333@13549L7,337@13648L28,339@13806L278,351@14199L230,362@14547L345,374@14927L354,385@15286L647:ProgressIndicator.kt#jmzs0o");
        int i10 = i3 & 1;
        if (i10 != 0) {
            i4 = i2 | 6;
            obj = modifier;
        } else if ((i2 & 14) == 0) {
            obj = modifier;
            i4 = (startRestartGroup.changed(obj) ? 4 : 2) | i2;
        } else {
            obj = modifier;
            i4 = i2;
        }
        if ((i2 & 112) == 0) {
            if ((i3 & 2) == 0) {
                j3 = j;
                if (startRestartGroup.changed(j3)) {
                    i9 = 32;
                    i4 |= i9;
                }
            } else {
                j3 = j;
            }
            i9 = 16;
            i4 |= i9;
        } else {
            j3 = j;
        }
        int i11 = i3 & 4;
        if (i11 != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            f2 = f;
            i4 |= startRestartGroup.changed(f2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i2 & 7168) == 0) {
                j4 = j2;
                i4 |= startRestartGroup.changed(j4) ? 2048 : 1024;
                if ((57344 & i2) == 0) {
                    if ((i3 & 16) == 0) {
                        i6 = i;
                        if (startRestartGroup.changed(i6)) {
                            i8 = 16384;
                            i4 |= i8;
                        }
                    } else {
                        i6 = i;
                    }
                    i8 = 8192;
                    i4 |= i8;
                } else {
                    i6 = i;
                }
                if ((i4 & 46811) == 9362 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        companion = i10 != 0 ? Modifier.Companion : obj;
                        if ((i3 & 2) != 0) {
                            j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1309getPrimary0d7_KjU();
                        }
                        if (i11 != 0) {
                            f2 = ProgressIndicatorDefaults.INSTANCE.m1421getStrokeWidthD9Ej5fM();
                        }
                        if (i5 != 0) {
                            j4 = Color.Companion.m3326getTransparent0d7_KjU();
                        }
                        if ((i3 & 16) != 0) {
                            m3646getSquareKaPHkGw = StrokeCap.Companion.m3646getSquareKaPHkGw();
                            f3 = f2;
                            j5 = j4;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1119119072, i2, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:326)");
                            }
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Stroke stroke = new Stroke(((Density) consume).mo588toPx0680j_4(f3), 0.0f, m3646getSquareKaPHkGw, 0, null, 26, null);
                            InfiniteTransition rememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(null, startRestartGroup, 0, 1);
                            Modifier modifier2 = companion;
                            f4 = f3;
                            CanvasKt.Canvas(SizeKt.m795size3ABfNKs(ProgressSemanticsKt.progressSemantics(companion), CircularIndicatorDiameter), new ProgressIndicatorKt$CircularProgressIndicator$3(j5, stroke, f3, j3, InfiniteTransitionKt.animateValue(rememberInfiniteTransition, 0, 5, VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), AnimationSpecKt.m352infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, startRestartGroup, InfiniteTransition.$stable | 4528 | (InfiniteRepeatableSpec.$stable << 12), 16), InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, JumpRotationAngle, AnimationSpecKt.m352infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(ProgressIndicatorKt$CircularProgressIndicator$endAngle$2.INSTANCE), null, 0L, 6, null), null, startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8), InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, JumpRotationAngle, AnimationSpecKt.m352infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(ProgressIndicatorKt$CircularProgressIndicator$startAngle$2.INSTANCE), null, 0L, 6, null), null, startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8), InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, BaseRotationAngle, AnimationSpecKt.m352infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(RotationDuration, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8)), startRestartGroup, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            obj = modifier2;
                            j6 = j3;
                            i7 = m3646getSquareKaPHkGw;
                            j7 = j5;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        companion = obj;
                    }
                    f3 = f2;
                    j5 = j4;
                    m3646getSquareKaPHkGw = i6;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Stroke stroke2 = new Stroke(((Density) consume2).mo588toPx0680j_4(f3), 0.0f, m3646getSquareKaPHkGw, 0, null, 26, null);
                    InfiniteTransition rememberInfiniteTransition2 = InfiniteTransitionKt.rememberInfiniteTransition(null, startRestartGroup, 0, 1);
                    Modifier modifier22 = companion;
                    f4 = f3;
                    CanvasKt.Canvas(SizeKt.m795size3ABfNKs(ProgressSemanticsKt.progressSemantics(companion), CircularIndicatorDiameter), new ProgressIndicatorKt$CircularProgressIndicator$3(j5, stroke2, f3, j3, InfiniteTransitionKt.animateValue(rememberInfiniteTransition2, 0, 5, VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), AnimationSpecKt.m352infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, startRestartGroup, InfiniteTransition.$stable | 4528 | (InfiniteRepeatableSpec.$stable << 12), 16), InfiniteTransitionKt.animateFloat(rememberInfiniteTransition2, 0.0f, JumpRotationAngle, AnimationSpecKt.m352infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(ProgressIndicatorKt$CircularProgressIndicator$endAngle$2.INSTANCE), null, 0L, 6, null), null, startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8), InfiniteTransitionKt.animateFloat(rememberInfiniteTransition2, 0.0f, JumpRotationAngle, AnimationSpecKt.m352infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(ProgressIndicatorKt$CircularProgressIndicator$startAngle$2.INSTANCE), null, 0L, 6, null), null, startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8), InfiniteTransitionKt.animateFloat(rememberInfiniteTransition2, 0.0f, BaseRotationAngle, AnimationSpecKt.m352infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(RotationDuration, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8)), startRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    obj = modifier22;
                    j6 = j3;
                    i7 = m3646getSquareKaPHkGw;
                    j7 = j5;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    j6 = j3;
                    f4 = f2;
                    j7 = j4;
                    i7 = i6;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new ProgressIndicatorKt$CircularProgressIndicator$4(obj, j6, f4, j7, i7, i2, i3));
                return;
            }
            j4 = j2;
            if ((57344 & i2) == 0) {
            }
            if ((i4 & 46811) == 9362) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i10 != 0) {
            }
            if ((i3 & 2) != 0) {
            }
            if (i11 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i3 & 16) != 0) {
            }
            f3 = f2;
            j5 = j4;
            m3646getSquareKaPHkGw = i6;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume22 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Stroke stroke22 = new Stroke(((Density) consume22).mo588toPx0680j_4(f3), 0.0f, m3646getSquareKaPHkGw, 0, null, 26, null);
            InfiniteTransition rememberInfiniteTransition22 = InfiniteTransitionKt.rememberInfiniteTransition(null, startRestartGroup, 0, 1);
            Modifier modifier222 = companion;
            f4 = f3;
            CanvasKt.Canvas(SizeKt.m795size3ABfNKs(ProgressSemanticsKt.progressSemantics(companion), CircularIndicatorDiameter), new ProgressIndicatorKt$CircularProgressIndicator$3(j5, stroke22, f3, j3, InfiniteTransitionKt.animateValue(rememberInfiniteTransition22, 0, 5, VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), AnimationSpecKt.m352infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, startRestartGroup, InfiniteTransition.$stable | 4528 | (InfiniteRepeatableSpec.$stable << 12), 16), InfiniteTransitionKt.animateFloat(rememberInfiniteTransition22, 0.0f, JumpRotationAngle, AnimationSpecKt.m352infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(ProgressIndicatorKt$CircularProgressIndicator$endAngle$2.INSTANCE), null, 0L, 6, null), null, startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8), InfiniteTransitionKt.animateFloat(rememberInfiniteTransition22, 0.0f, JumpRotationAngle, AnimationSpecKt.m352infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(ProgressIndicatorKt$CircularProgressIndicator$startAngle$2.INSTANCE), null, 0L, 6, null), null, startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8), InfiniteTransitionKt.animateFloat(rememberInfiniteTransition22, 0.0f, BaseRotationAngle, AnimationSpecKt.m352infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(RotationDuration, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8)), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            obj = modifier222;
            j6 = j3;
            i7 = m3646getSquareKaPHkGw;
            j7 = j5;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        f2 = f;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        j4 = j2;
        if ((57344 & i2) == 0) {
        }
        if ((i4 & 46811) == 9362) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if ((i3 & 2) != 0) {
        }
        if (i11 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i3 & 16) != 0) {
        }
        f3 = f2;
        j5 = j4;
        m3646getSquareKaPHkGw = i6;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume222 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Stroke stroke222 = new Stroke(((Density) consume222).mo588toPx0680j_4(f3), 0.0f, m3646getSquareKaPHkGw, 0, null, 26, null);
        InfiniteTransition rememberInfiniteTransition222 = InfiniteTransitionKt.rememberInfiniteTransition(null, startRestartGroup, 0, 1);
        Modifier modifier2222 = companion;
        f4 = f3;
        CanvasKt.Canvas(SizeKt.m795size3ABfNKs(ProgressSemanticsKt.progressSemantics(companion), CircularIndicatorDiameter), new ProgressIndicatorKt$CircularProgressIndicator$3(j5, stroke222, f3, j3, InfiniteTransitionKt.animateValue(rememberInfiniteTransition222, 0, 5, VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), AnimationSpecKt.m352infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, startRestartGroup, InfiniteTransition.$stable | 4528 | (InfiniteRepeatableSpec.$stable << 12), 16), InfiniteTransitionKt.animateFloat(rememberInfiniteTransition222, 0.0f, JumpRotationAngle, AnimationSpecKt.m352infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(ProgressIndicatorKt$CircularProgressIndicator$endAngle$2.INSTANCE), null, 0L, 6, null), null, startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8), InfiniteTransitionKt.animateFloat(rememberInfiniteTransition222, 0.0f, JumpRotationAngle, AnimationSpecKt.m352infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(ProgressIndicatorKt$CircularProgressIndicator$startAngle$2.INSTANCE), null, 0L, 6, null), null, startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8), InfiniteTransitionKt.animateFloat(rememberInfiniteTransition222, 0.0f, BaseRotationAngle, AnimationSpecKt.m352infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(RotationDuration, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8)), startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        obj = modifier2222;
        j6 = j3;
        i7 = m3646getSquareKaPHkGw;
        j7 = j5;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: CircularProgressIndicator-MBs18nI  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m1424CircularProgressIndicatorMBs18nI(float f, Modifier modifier, long j, float f2, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        long j2;
        int i4;
        float f3;
        Modifier.Companion companion;
        float m1421getStrokeWidthD9Ej5fM;
        long j3;
        ScopeUpdateScope endRestartGroup;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(-409649739);
        ComposerKt.sourceInformation(startRestartGroup, "C(CircularProgressIndicator)P(2,1,0:c#ui.graphics.Color,3:c#ui.unit.Dp)408@16153L6,410@16233L157:ProgressIndicator.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 32 : 16;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    j2 = j;
                    if (startRestartGroup.changed(j2)) {
                        i5 = 256;
                        i3 |= i5;
                    }
                } else {
                    j2 = j;
                }
                i5 = 128;
                i3 |= i5;
            } else {
                j2 = j;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                f3 = f2;
                i3 |= startRestartGroup.changed(f3) ? 2048 : 1024;
                if ((i3 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        companion = i6 != 0 ? Modifier.Companion : obj;
                        if ((i2 & 4) != 0) {
                            j2 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1309getPrimary0d7_KjU();
                            i3 &= -897;
                        }
                        if (i4 != 0) {
                            m1421getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1421getStrokeWidthD9Ej5fM();
                            j3 = j2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-409649739, i3, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:405)");
                            }
                            m1422CircularProgressIndicatorDUhRLBM(f, companion, j3, m1421getStrokeWidthD9Ej5fM, Color.Companion.m3326getTransparent0d7_KjU(), StrokeCap.Companion.m3644getButtKaPHkGw(), startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        companion = obj;
                    }
                    j3 = j2;
                    m1421getStrokeWidthD9Ej5fM = f3;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    m1422CircularProgressIndicatorDUhRLBM(f, companion, j3, m1421getStrokeWidthD9Ej5fM, Color.Companion.m3326getTransparent0d7_KjU(), StrokeCap.Companion.m3644getButtKaPHkGw(), startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    companion = obj;
                    j3 = j2;
                    m1421getStrokeWidthD9Ej5fM = f3;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new ProgressIndicatorKt$CircularProgressIndicator$5(f, companion, j3, m1421getStrokeWidthD9Ej5fM, i, i2));
                return;
            }
            f3 = f2;
            if ((i3 & 5851) == 1170) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i4 != 0) {
            }
            j3 = j2;
            m1421getStrokeWidthD9Ej5fM = f3;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            m1422CircularProgressIndicatorDUhRLBM(f, companion, j3, m1421getStrokeWidthD9Ej5fM, Color.Companion.m3326getTransparent0d7_KjU(), StrokeCap.Companion.m3644getButtKaPHkGw(), startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj = modifier;
        if ((i & 896) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f3 = f2;
        if ((i3 & 5851) == 1170) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 != 0) {
        }
        j3 = j2;
        m1421getStrokeWidthD9Ej5fM = f3;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        m1422CircularProgressIndicatorDUhRLBM(f, companion, j3, m1421getStrokeWidthD9Ej5fM, Color.Companion.m3326getTransparent0d7_KjU(), StrokeCap.Companion.m3644getButtKaPHkGw(), startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: CircularProgressIndicator-aM-cp0Q  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m1425CircularProgressIndicatoraMcp0Q(Modifier modifier, long j, float f, Composer composer, int i, int i2) {
        Object obj;
        int i3;
        long j2;
        float f2;
        Modifier.Companion companion;
        float m1421getStrokeWidthD9Ej5fM;
        long j3;
        ScopeUpdateScope endRestartGroup;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(-392089979);
        ComposerKt.sourceInformation(startRestartGroup, "C(CircularProgressIndicator)P(1,0:c#ui.graphics.Color,2:c#ui.unit.Dp)423@16587L6,425@16667L145:ProgressIndicator.kt#jmzs0o");
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            obj = modifier;
        } else if ((i & 14) == 0) {
            obj = modifier;
            i3 = (startRestartGroup.changed(obj) ? 4 : 2) | i;
        } else {
            obj = modifier;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                j2 = j;
                if (startRestartGroup.changed(j2)) {
                    i4 = 32;
                    i3 |= i4;
                }
            } else {
                j2 = j;
            }
            i4 = 16;
            i3 |= i4;
        } else {
            j2 = j;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? 256 : 128;
            if ((i3 & 731) == 146 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    companion = i5 == 0 ? Modifier.Companion : obj;
                    if ((i2 & 2) != 0) {
                        j2 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1309getPrimary0d7_KjU();
                        i3 &= -113;
                    }
                    if (i6 != 0) {
                        m1421getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1421getStrokeWidthD9Ej5fM();
                        long j4 = j2;
                        int i7 = i3;
                        j3 = j4;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-392089979, i7, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:421)");
                        }
                        m1423CircularProgressIndicatorLxG7B9w(companion, j3, m1421getStrokeWidthD9Ej5fM, Color.Companion.m3326getTransparent0d7_KjU(), StrokeCap.Companion.m3646getSquareKaPHkGw(), startRestartGroup, (i7 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | (i7 & 112) | (i7 & 896), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f2 = m1421getStrokeWidthD9Ej5fM;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    companion = obj;
                }
                m1421getStrokeWidthD9Ej5fM = f2;
                long j42 = j2;
                int i72 = i3;
                j3 = j42;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                m1423CircularProgressIndicatorLxG7B9w(companion, j3, m1421getStrokeWidthD9Ej5fM, Color.Companion.m3326getTransparent0d7_KjU(), StrokeCap.Companion.m3646getSquareKaPHkGw(), startRestartGroup, (i72 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | (i72 & 112) | (i72 & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                f2 = m1421getStrokeWidthD9Ej5fM;
            } else {
                startRestartGroup.skipToGroupEnd();
                companion = obj;
                j3 = j2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new ProgressIndicatorKt$CircularProgressIndicator$6(companion, j3, f2, i, i2));
            return;
        }
        f2 = f;
        if ((i3 & 731) == 146) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if (i6 != 0) {
        }
        m1421getStrokeWidthD9Ej5fM = f2;
        long j422 = j2;
        int i722 = i3;
        j3 = j422;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        m1423CircularProgressIndicatorLxG7B9w(companion, j3, m1421getStrokeWidthD9Ej5fM, Color.Companion.m3326getTransparent0d7_KjU(), StrokeCap.Companion.m3646getSquareKaPHkGw(), startRestartGroup, (i722 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | (i722 & 112) | (i722 & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        f2 = m1421getStrokeWidthD9Ej5fM;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: drawCircularIndicator-42QJj7c  reason: not valid java name */
    private static final void m1435drawCircularIndicator42QJj7c(DrawScope drawScope, float f, float f2, long j, Stroke stroke) {
        float f3 = 2;
        float width = stroke.getWidth() / f3;
        float m3087getWidthimpl = Size.m3087getWidthimpl(drawScope.mo3762getSizeNHjbRc()) - (f3 * width);
        DrawScope.CC.m3827drawArcyD3GUKo$default(drawScope, j, f, f2, false, OffsetKt.Offset(width, width), androidx.compose.ui.geometry.SizeKt.Size(m3087getWidthimpl, m3087getWidthimpl), 0.0f, stroke, null, 0, 832, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawCircularIndicatorBackground-bw27NRU  reason: not valid java name */
    public static final void m1436drawCircularIndicatorBackgroundbw27NRU(DrawScope drawScope, long j, Stroke stroke) {
        m1435drawCircularIndicator42QJj7c(drawScope, 0.0f, 360.0f, j, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawDeterminateCircularIndicator-42QJj7c  reason: not valid java name */
    public static final void m1437drawDeterminateCircularIndicator42QJj7c(DrawScope drawScope, float f, float f2, long j, Stroke stroke) {
        m1435drawCircularIndicator42QJj7c(drawScope, f, f2, j, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawIndeterminateCircularIndicator-hrjfTZI  reason: not valid java name */
    public static final void m1438drawIndeterminateCircularIndicatorhrjfTZI(DrawScope drawScope, float f, float f2, float f3, long j, Stroke stroke) {
        m1435drawCircularIndicator42QJj7c(drawScope, f + (StrokeCap.m3640equalsimpl0(stroke.m3908getCapKaPHkGw(), StrokeCap.Companion.m3644getButtKaPHkGw()) ? 0.0f : ((f2 / Dp.m5607constructorimpl(CircularIndicatorDiameter / 2)) * 57.29578f) / 2.0f), Math.max(f3, 0.1f), j, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearProgressIndicator_2cYBFYY$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearProgressIndicator_2cYBFYY$lambda$2(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearProgressIndicator_2cYBFYY$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearProgressIndicator_2cYBFYY$lambda$4(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int CircularProgressIndicator_LxG7B9w$lambda$8(State<Integer> state) {
        return state.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CircularProgressIndicator_LxG7B9w$lambda$9(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CircularProgressIndicator_LxG7B9w$lambda$10(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CircularProgressIndicator_LxG7B9w$lambda$11(State<Float> state) {
        return state.getValue().floatValue();
    }
}
