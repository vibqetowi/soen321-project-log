package androidx.compose.material3;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.PlainTooltipTokens;
import androidx.compose.material3.tokens.RichTooltipTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.facebook.internal.NativeProtocol;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: Tooltip.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001ax\u0010\u001a\u001a\u00020\u001b2\u0011\u0010\u001c\u001a\r\u0012\u0004\u0012\u00020\u001b0\u001d¢\u0006\u0002\b\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020&2\u001c\u0010(\u001a\u0018\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u001b0)¢\u0006\u0002\b\u001e¢\u0006\u0002\b+H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a0\u0010.\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020&2\u0011\u0010(\u001a\r\u0012\u0004\u0012\u00020\u001b0\u001d¢\u0006\u0002\b\u001eH\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a\u0094\u0001\u00102\u001a\u00020\u001b2\u0011\u00103\u001a\r\u0012\u0004\u0012\u00020\u001b0\u001d¢\u0006\u0002\b\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u0002042\u0015\b\u0002\u00105\u001a\u000f\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001d¢\u0006\u0002\b\u001e2\u0015\b\u0002\u00106\u001a\u000f\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001d¢\u0006\u0002\b\u001e2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u00107\u001a\u0002082\u001c\u0010(\u001a\u0018\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u001b0)¢\u0006\u0002\b\u001e¢\u0006\u0002\b+H\u0007¢\u0006\u0002\u00109\u001aR\u0010:\u001a\u00020\u001b2\u0006\u00107\u001a\u0002082\u0011\u00103\u001a\r\u0012\u0004\u0012\u00020\u001b0\u001d¢\u0006\u0002\b\u001e2\u0013\u00105\u001a\u000f\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001d¢\u0006\u0002\b\u001e2\u0013\u00106\u001a\u000f\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001d¢\u0006\u0002\b\u001eH\u0003¢\u0006\u0002\u0010;\u001a~\u0010<\u001a\u00020\u001b2\u0011\u0010=\u001a\r\u0012\u0004\u0012\u00020\u001b0\u001d¢\u0006\u0002\b\u001e2\u0006\u0010>\u001a\u00020?2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010#\u001a\u00020$2\u0006\u0010!\u001a\u00020@2\u0006\u0010%\u001a\u00020&2\u0006\u0010A\u001a\u00020\u00012\u0006\u0010B\u001a\u00020\u00012\u001c\u0010(\u001a\u0018\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u001b0)¢\u0006\u0002\b\u001e¢\u0006\u0002\b+H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bC\u0010D\u001a\u001a\u0010E\u001a\u00020 *\u00020 2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020H0GH\u0002\u001a\u001c\u0010I\u001a\u00020 *\u00020 2\u0006\u0010J\u001a\u00020H2\u0006\u0010K\u001a\u00020HH\u0002\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0005\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\b\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\t\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\n\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0019\u0010\u000b\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0002\u001a\u0004\b\f\u0010\r\"\u0013\u0010\u000e\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u000f\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0010\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0011\u001a\u00020\u0012X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0014X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000\"\u0019\u0010\u0016\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0002\u001a\u0004\b\u0017\u0010\r\"\u0019\u0010\u0018\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0002\u001a\u0004\b\u0019\u0010\r\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006L"}, d2 = {"ActionLabelBottomPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ActionLabelMinHeight", "HeightFromSubheadToTextFirstLine", "HeightToSubheadFirstLine", "PlainTooltipContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "PlainTooltipHorizontalPadding", "PlainTooltipMaxWidth", "PlainTooltipVerticalPadding", "RichTooltipHorizontalPadding", "getRichTooltipHorizontalPadding", "()F", "RichTooltipMaxWidth", "TextBottomPadding", "TooltipAnchorPadding", "TooltipDuration", "", "TooltipFadeInDuration", "", "TooltipFadeOutDuration", "TooltipMinHeight", "getTooltipMinHeight", "TooltipMinWidth", "getTooltipMinWidth", "PlainTooltipBox", "", "tooltip", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "tooltipState", "Landroidx/compose/material3/PlainTooltipState;", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/material3/TooltipBoxScope;", "Lkotlin/ExtensionFunctionType;", "PlainTooltipBox-nBX6wN0", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/PlainTooltipState;Landroidx/compose/ui/graphics/Shape;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "PlainTooltipImpl", "textColor", "PlainTooltipImpl-Iv8Zu3U", "(JLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "RichTooltipBox", "text", "Landroidx/compose/material3/RichTooltipState;", "title", NativeProtocol.WEB_DIALOG_ACTION, "colors", "Landroidx/compose/material3/RichTooltipColors;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/RichTooltipState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/RichTooltipColors;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "RichTooltipImpl", "(Landroidx/compose/material3/RichTooltipColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "TooltipBox", "tooltipContent", "tooltipPositionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "Landroidx/compose/material3/TooltipState;", "elevation", "maxWidth", "TooltipBox-XDn_Kpo", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/window/PopupPositionProvider;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TooltipState;JFFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "animateTooltip", "transition", "Landroidx/compose/animation/core/Transition;", "", "textVerticalPadding", "subheadExists", "actionExists", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TooltipKt {
    private static final float ActionLabelBottomPadding;
    private static final float ActionLabelMinHeight;
    private static final float HeightFromSubheadToTextFirstLine;
    private static final float HeightToSubheadFirstLine;
    private static final PaddingValues PlainTooltipContentPadding;
    private static final float PlainTooltipHorizontalPadding;
    private static final float PlainTooltipVerticalPadding;
    private static final float RichTooltipHorizontalPadding;
    private static final float RichTooltipMaxWidth;
    private static final float TextBottomPadding;
    private static final float TooltipAnchorPadding;
    public static final long TooltipDuration = 1500;
    public static final int TooltipFadeInDuration = 150;
    private static final int TooltipFadeOutDuration = 75;
    private static final float TooltipMinHeight;
    private static final float TooltipMinWidth = Dp.m5607constructorimpl(40);
    private static final float PlainTooltipMaxWidth = Dp.m5607constructorimpl(200);

    /* JADX WARN: Removed duplicated region for block: B:101:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010b  */
    /* renamed from: PlainTooltipBox-nBX6wN0  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2256PlainTooltipBoxnBX6wN0(Function2<? super Composer, ? super Integer, Unit> tooltip, Modifier modifier, PlainTooltipState plainTooltipState, Shape shape, long j, long j2, Function3<? super TooltipBoxScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        Object obj2;
        Object obj3;
        long j3;
        long j4;
        int i5;
        Modifier.Companion companion;
        Object rememberedValue;
        Composer composer2;
        Modifier modifier2;
        long j5;
        PlainTooltipState plainTooltipState2;
        Shape shape2;
        long j6;
        ScopeUpdateScope endRestartGroup;
        int i6;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(tooltip, "tooltip");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-531325137);
        ComposerKt.sourceInformation(startRestartGroup, "C(PlainTooltipBox)P(5,3,6,4,0:c#ui.graphics.Color,2:c#ui.graphics.Color)97@4379L32,98@4448L26,99@4520L26,100@4590L24,*103@4721L7,104@4794L63,106@4863L450:Tooltip.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(tooltip) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                obj2 = plainTooltipState;
                i3 |= startRestartGroup.changed(obj2) ? 256 : 128;
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0) {
                        obj3 = shape;
                        if (startRestartGroup.changed(obj3)) {
                            i8 = 2048;
                            i3 |= i8;
                        }
                    } else {
                        obj3 = shape;
                    }
                    i8 = 1024;
                    i3 |= i8;
                } else {
                    obj3 = shape;
                }
                if ((i & 57344) == 0) {
                    if ((i2 & 16) == 0) {
                        j3 = j;
                        if (startRestartGroup.changed(j3)) {
                            i7 = 16384;
                            i3 |= i7;
                        }
                    } else {
                        j3 = j;
                    }
                    i7 = 8192;
                    i3 |= i7;
                } else {
                    j3 = j;
                }
                if ((i & 458752) == 0) {
                    if ((i2 & 32) == 0) {
                        j4 = j2;
                        if (startRestartGroup.changed(j4)) {
                            i6 = 131072;
                            i3 |= i6;
                        }
                    } else {
                        j4 = j2;
                    }
                    i6 = 65536;
                    i3 |= i6;
                } else {
                    j4 = j2;
                }
                if ((i2 & 64) == 0) {
                    if ((i & 3670016) == 0) {
                        i5 = startRestartGroup.changedInstance(content) ? 1048576 : 524288;
                    }
                    if ((i3 & 2995931) == 599186 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            companion = i9 == 0 ? Modifier.Companion : modifier;
                            if (i4 != 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == Composer.Companion.getEmpty()) {
                                    rememberedValue2 = new PlainTooltipState();
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                startRestartGroup.endReplaceableGroup();
                                obj2 = (PlainTooltipState) rememberedValue2;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                obj3 = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(startRestartGroup, 6);
                            }
                            if ((i2 & 16) != 0) {
                                j3 = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(startRestartGroup, 6);
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                j4 = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(startRestartGroup, 6);
                                i3 &= -458753;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            companion = modifier;
                        }
                        TooltipState tooltipState = obj2;
                        Shape shape3 = obj3;
                        long j7 = j3;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-531325137, i3, -1, "androidx.compose.material3.PlainTooltipBox (Tooltip.kt:94)");
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        int mo582roundToPx0680j_4 = ((Density) consume).mo582roundToPx0680j_4(TooltipAnchorPadding);
                        startRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.Companion.getEmpty()) {
                            rememberedValue = new PlainTooltipPositionProvider(mo582roundToPx0680j_4);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        startRestartGroup.endReplaceableGroup();
                        int i10 = i3 << 3;
                        int i11 = i3 & 7168;
                        int i12 = i3 << 6;
                        long j8 = j4;
                        composer2 = startRestartGroup;
                        m2258TooltipBoxXDn_Kpo(ComposableLambdaKt.composableLambda(startRestartGroup, -785135750, true, new TooltipKt$PlainTooltipBox$2(j4, tooltip, i3)), (PlainTooltipPositionProvider) rememberedValue, companion, shape3, tooltipState, j7, Dp.m5607constructorimpl(0), PlainTooltipMaxWidth, content, startRestartGroup, i11 | (i10 & 896) | 14155830 | (57344 & i12) | (458752 & i10) | (i12 & 234881024));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = companion;
                        j5 = j8;
                        plainTooltipState2 = tooltipState;
                        shape2 = shape3;
                        j6 = j7;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = obj;
                        plainTooltipState2 = obj2;
                        shape2 = obj3;
                        j6 = j3;
                        j5 = j4;
                        composer2 = startRestartGroup;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new TooltipKt$PlainTooltipBox$3(tooltip, modifier2, plainTooltipState2, shape2, j6, j5, content, i, i2));
                    return;
                }
                i5 = 1572864;
                i3 |= i5;
                if ((i3 & 2995931) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 == 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 8) != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                TooltipState tooltipState2 = obj2;
                Shape shape32 = obj3;
                long j72 = j3;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                int mo582roundToPx0680j_42 = ((Density) consume2).mo582roundToPx0680j_4(TooltipAnchorPadding);
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                int i102 = i3 << 3;
                int i112 = i3 & 7168;
                int i122 = i3 << 6;
                long j82 = j4;
                composer2 = startRestartGroup;
                m2258TooltipBoxXDn_Kpo(ComposableLambdaKt.composableLambda(startRestartGroup, -785135750, true, new TooltipKt$PlainTooltipBox$2(j4, tooltip, i3)), (PlainTooltipPositionProvider) rememberedValue, companion, shape32, tooltipState2, j72, Dp.m5607constructorimpl(0), PlainTooltipMaxWidth, content, startRestartGroup, i112 | (i102 & 896) | 14155830 | (57344 & i122) | (458752 & i102) | (i122 & 234881024));
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = companion;
                j5 = j82;
                plainTooltipState2 = tooltipState2;
                shape2 = shape32;
                j6 = j72;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            obj2 = plainTooltipState;
            if ((i & 7168) == 0) {
            }
            if ((i & 57344) == 0) {
            }
            if ((i & 458752) == 0) {
            }
            if ((i2 & 64) == 0) {
            }
            i3 |= i5;
            if ((i3 & 2995931) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 == 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            TooltipState tooltipState22 = obj2;
            Shape shape322 = obj3;
            long j722 = j3;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume22 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int mo582roundToPx0680j_422 = ((Density) consume22).mo582roundToPx0680j_4(TooltipAnchorPadding);
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            int i1022 = i3 << 3;
            int i1122 = i3 & 7168;
            int i1222 = i3 << 6;
            long j822 = j4;
            composer2 = startRestartGroup;
            m2258TooltipBoxXDn_Kpo(ComposableLambdaKt.composableLambda(startRestartGroup, -785135750, true, new TooltipKt$PlainTooltipBox$2(j4, tooltip, i3)), (PlainTooltipPositionProvider) rememberedValue, companion, shape322, tooltipState22, j722, Dp.m5607constructorimpl(0), PlainTooltipMaxWidth, content, startRestartGroup, i1122 | (i1022 & 896) | 14155830 | (57344 & i1222) | (458752 & i1022) | (i1222 & 234881024));
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = companion;
            j5 = j822;
            plainTooltipState2 = tooltipState22;
            shape2 = shape322;
            j6 = j722;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        obj = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        obj2 = plainTooltipState;
        if ((i & 7168) == 0) {
        }
        if ((i & 57344) == 0) {
        }
        if ((i & 458752) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        i3 |= i5;
        if ((i3 & 2995931) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 == 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        TooltipState tooltipState222 = obj2;
        Shape shape3222 = obj3;
        long j7222 = j3;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume222 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        int mo582roundToPx0680j_4222 = ((Density) consume222).mo582roundToPx0680j_4(TooltipAnchorPadding);
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        int i10222 = i3 << 3;
        int i11222 = i3 & 7168;
        int i12222 = i3 << 6;
        long j8222 = j4;
        composer2 = startRestartGroup;
        m2258TooltipBoxXDn_Kpo(ComposableLambdaKt.composableLambda(startRestartGroup, -785135750, true, new TooltipKt$PlainTooltipBox$2(j4, tooltip, i3)), (PlainTooltipPositionProvider) rememberedValue, companion, shape3222, tooltipState222, j7222, Dp.m5607constructorimpl(0), PlainTooltipMaxWidth, content, startRestartGroup, i11222 | (i10222 & 896) | 14155830 | (57344 & i12222) | (458752 & i10222) | (i12222 & 234881024));
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        j5 = j8222;
        plainTooltipState2 = tooltipState222;
        shape2 = shape3222;
        j6 = j7222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RichTooltipBox(Function2<? super Composer, ? super Integer, Unit> text, Modifier modifier, RichTooltipState richTooltipState, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Shape shape, RichTooltipColors richTooltipColors, Function3<? super TooltipBoxScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        Object obj2;
        int i5;
        Object obj3;
        int i6;
        Object obj4;
        Object obj5;
        int i7;
        Modifier.Companion companion;
        RichTooltipColors m2255richTooltipColorsro_MJ88;
        Object rememberedValue;
        boolean changed;
        TooltipKt$RichTooltipBox$2$1 rememberedValue2;
        Composer composer2;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Modifier modifier2;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Shape shape2;
        RichTooltipColors richTooltipColors2;
        RichTooltipState richTooltipState2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(180959998);
        ComposerKt.sourceInformation(startRestartGroup, "C(RichTooltipBox)P(5,3,7,6!1,4)151@6531L31,154@6690L25,155@6765L19,*158@6891L7,159@6964L62,161@7043L130,161@7032L141,166@7179L536:Tooltip.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                obj2 = richTooltipState;
                i3 |= startRestartGroup.changed(obj2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i & 7168) == 0) {
                    obj3 = function2;
                    i3 |= startRestartGroup.changedInstance(obj3) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 57344) == 0) {
                        obj4 = function22;
                        i3 |= startRestartGroup.changedInstance(obj4) ? 16384 : 8192;
                        if ((i & 458752) == 0) {
                            obj5 = shape;
                            i3 |= ((i2 & 32) == 0 && startRestartGroup.changed(obj5)) ? 131072 : 65536;
                        } else {
                            obj5 = shape;
                        }
                        if ((i & 3670016) == 0) {
                            i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(richTooltipColors)) ? 1048576 : 524288;
                        }
                        if ((i2 & 128) == 0) {
                            if ((29360128 & i) == 0) {
                                i7 = startRestartGroup.changedInstance(content) ? 8388608 : 4194304;
                            }
                            if ((23967451 & i3) == 4793490 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    companion = i8 == 0 ? Modifier.Companion : modifier;
                                    if (i4 != 0) {
                                        startRestartGroup.startReplaceableGroup(-492369756);
                                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                        Object rememberedValue3 = startRestartGroup.rememberedValue();
                                        if (rememberedValue3 == Composer.Companion.getEmpty()) {
                                            rememberedValue3 = new RichTooltipState();
                                            startRestartGroup.updateRememberedValue(rememberedValue3);
                                        }
                                        startRestartGroup.endReplaceableGroup();
                                        obj2 = (RichTooltipState) rememberedValue3;
                                    }
                                    if (i5 != 0) {
                                        obj3 = null;
                                    }
                                    if (i6 != 0) {
                                        obj4 = null;
                                    }
                                    if ((i2 & 32) != 0) {
                                        i3 &= -458753;
                                        obj5 = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(startRestartGroup, 6);
                                    }
                                    if ((i2 & 64) != 0) {
                                        i3 &= -3670017;
                                        m2255richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m2255richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, startRestartGroup, 24576, 15);
                                        Function2<? super Composer, ? super Integer, Unit> function25 = obj3;
                                        Shape shape3 = obj5;
                                        Function2<? super Composer, ? super Integer, Unit> function26 = obj4;
                                        RichTooltipState richTooltipState3 = obj2;
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(180959998, i3, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                                        }
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                        Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        int mo582roundToPx0680j_4 = ((Density) consume).mo582roundToPx0680j_4(TooltipAnchorPadding);
                                        startRestartGroup.startReplaceableGroup(-492369756);
                                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                        rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.Companion.getEmpty()) {
                                            rememberedValue = new RichTooltipPositionProvider(mo582roundToPx0680j_4);
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        startRestartGroup.endReplaceableGroup();
                                        RichTooltipPositionProvider richTooltipPositionProvider = (RichTooltipPositionProvider) rememberedValue;
                                        int i9 = i3 >> 6;
                                        startRestartGroup.startReplaceableGroup(511388516);
                                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                        changed = startRestartGroup.changed(richTooltipState3) | startRestartGroup.changed(function26);
                                        rememberedValue2 = startRestartGroup.rememberedValue();
                                        if (!changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                                            rememberedValue2 = new TooltipKt$RichTooltipBox$2$1(richTooltipState3, function26);
                                            startRestartGroup.updateRememberedValue(rememberedValue2);
                                        }
                                        startRestartGroup.endReplaceableGroup();
                                        EffectsKt.SideEffect((Function0) rememberedValue2, startRestartGroup, 0);
                                        int i10 = i3 << 3;
                                        composer2 = startRestartGroup;
                                        m2258TooltipBoxXDn_Kpo(ComposableLambdaKt.composableLambda(startRestartGroup, 1423372873, true, new TooltipKt$RichTooltipBox$3(m2255richTooltipColorsro_MJ88, text, function25, function26, i3)), richTooltipPositionProvider, companion, shape3, richTooltipState3, m2255richTooltipColorsro_MJ88.m1946getContainerColor0d7_KjU(), RichTooltipTokens.INSTANCE.m2693getContainerElevationD9Ej5fM(), RichTooltipMaxWidth, content, startRestartGroup, ((i3 << 6) & 57344) | (i9 & 7168) | (i10 & 896) | 14155830 | (i10 & 234881024));
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        function23 = function26;
                                        modifier2 = companion;
                                        function24 = function25;
                                        shape2 = shape3;
                                        richTooltipColors2 = m2255richTooltipColorsro_MJ88;
                                        richTooltipState2 = richTooltipState3;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 32) != 0) {
                                        i3 &= -458753;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i3 &= -3670017;
                                    }
                                    companion = modifier;
                                }
                                m2255richTooltipColorsro_MJ88 = richTooltipColors;
                                Function2<? super Composer, ? super Integer, Unit> function252 = obj3;
                                Shape shape32 = obj5;
                                Function2<? super Composer, ? super Integer, Unit> function262 = obj4;
                                RichTooltipState richTooltipState32 = obj2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                int mo582roundToPx0680j_42 = ((Density) consume2).mo582roundToPx0680j_4(TooltipAnchorPadding);
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                RichTooltipPositionProvider richTooltipPositionProvider2 = (RichTooltipPositionProvider) rememberedValue;
                                int i92 = i3 >> 6;
                                startRestartGroup.startReplaceableGroup(511388516);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                changed = startRestartGroup.changed(richTooltipState32) | startRestartGroup.changed(function262);
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!changed) {
                                }
                                rememberedValue2 = new TooltipKt$RichTooltipBox$2$1(richTooltipState32, function262);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                                startRestartGroup.endReplaceableGroup();
                                EffectsKt.SideEffect((Function0) rememberedValue2, startRestartGroup, 0);
                                int i102 = i3 << 3;
                                composer2 = startRestartGroup;
                                m2258TooltipBoxXDn_Kpo(ComposableLambdaKt.composableLambda(startRestartGroup, 1423372873, true, new TooltipKt$RichTooltipBox$3(m2255richTooltipColorsro_MJ88, text, function252, function262, i3)), richTooltipPositionProvider2, companion, shape32, richTooltipState32, m2255richTooltipColorsro_MJ88.m1946getContainerColor0d7_KjU(), RichTooltipTokens.INSTANCE.m2693getContainerElevationD9Ej5fM(), RichTooltipMaxWidth, content, startRestartGroup, ((i3 << 6) & 57344) | (i92 & 7168) | (i102 & 896) | 14155830 | (i102 & 234881024));
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                function23 = function262;
                                modifier2 = companion;
                                function24 = function252;
                                shape2 = shape32;
                                richTooltipColors2 = m2255richTooltipColorsro_MJ88;
                                richTooltipState2 = richTooltipState32;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier2 = obj;
                                richTooltipState2 = obj2;
                                function24 = obj3;
                                shape2 = obj5;
                                function23 = obj4;
                                composer2 = startRestartGroup;
                                richTooltipColors2 = richTooltipColors;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new TooltipKt$RichTooltipBox$4(text, modifier2, richTooltipState2, function24, function23, shape2, richTooltipColors2, content, i, i2));
                            return;
                        }
                        i7 = 12582912;
                        i3 |= i7;
                        if ((23967451 & i3) == 4793490) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if ((i2 & 32) != 0) {
                        }
                        if ((i2 & 64) != 0) {
                        }
                        m2255richTooltipColorsro_MJ88 = richTooltipColors;
                        Function2<? super Composer, ? super Integer, Unit> function2522 = obj3;
                        Shape shape322 = obj5;
                        Function2<? super Composer, ? super Integer, Unit> function2622 = obj4;
                        RichTooltipState richTooltipState322 = obj2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume22 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        int mo582roundToPx0680j_422 = ((Density) consume22).mo582roundToPx0680j_4(TooltipAnchorPadding);
                        startRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.Companion.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        RichTooltipPositionProvider richTooltipPositionProvider22 = (RichTooltipPositionProvider) rememberedValue;
                        int i922 = i3 >> 6;
                        startRestartGroup.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                        changed = startRestartGroup.changed(richTooltipState322) | startRestartGroup.changed(function2622);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue2 = new TooltipKt$RichTooltipBox$2$1(richTooltipState322, function2622);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                        startRestartGroup.endReplaceableGroup();
                        EffectsKt.SideEffect((Function0) rememberedValue2, startRestartGroup, 0);
                        int i1022 = i3 << 3;
                        composer2 = startRestartGroup;
                        m2258TooltipBoxXDn_Kpo(ComposableLambdaKt.composableLambda(startRestartGroup, 1423372873, true, new TooltipKt$RichTooltipBox$3(m2255richTooltipColorsro_MJ88, text, function2522, function2622, i3)), richTooltipPositionProvider22, companion, shape322, richTooltipState322, m2255richTooltipColorsro_MJ88.m1946getContainerColor0d7_KjU(), RichTooltipTokens.INSTANCE.m2693getContainerElevationD9Ej5fM(), RichTooltipMaxWidth, content, startRestartGroup, ((i3 << 6) & 57344) | (i922 & 7168) | (i1022 & 896) | 14155830 | (i1022 & 234881024));
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function23 = function2622;
                        modifier2 = companion;
                        function24 = function2522;
                        shape2 = shape322;
                        richTooltipColors2 = m2255richTooltipColorsro_MJ88;
                        richTooltipState2 = richTooltipState322;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    obj4 = function22;
                    if ((i & 458752) == 0) {
                    }
                    if ((i & 3670016) == 0) {
                    }
                    if ((i2 & 128) == 0) {
                    }
                    i3 |= i7;
                    if ((23967451 & i3) == 4793490) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    m2255richTooltipColorsro_MJ88 = richTooltipColors;
                    Function2<? super Composer, ? super Integer, Unit> function25222 = obj3;
                    Shape shape3222 = obj5;
                    Function2<? super Composer, ? super Integer, Unit> function26222 = obj4;
                    RichTooltipState richTooltipState3222 = obj2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume222 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    int mo582roundToPx0680j_4222 = ((Density) consume222).mo582roundToPx0680j_4(TooltipAnchorPadding);
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    RichTooltipPositionProvider richTooltipPositionProvider222 = (RichTooltipPositionProvider) rememberedValue;
                    int i9222 = i3 >> 6;
                    startRestartGroup.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                    changed = startRestartGroup.changed(richTooltipState3222) | startRestartGroup.changed(function26222);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue2 = new TooltipKt$RichTooltipBox$2$1(richTooltipState3222, function26222);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceableGroup();
                    EffectsKt.SideEffect((Function0) rememberedValue2, startRestartGroup, 0);
                    int i10222 = i3 << 3;
                    composer2 = startRestartGroup;
                    m2258TooltipBoxXDn_Kpo(ComposableLambdaKt.composableLambda(startRestartGroup, 1423372873, true, new TooltipKt$RichTooltipBox$3(m2255richTooltipColorsro_MJ88, text, function25222, function26222, i3)), richTooltipPositionProvider222, companion, shape3222, richTooltipState3222, m2255richTooltipColorsro_MJ88.m1946getContainerColor0d7_KjU(), RichTooltipTokens.INSTANCE.m2693getContainerElevationD9Ej5fM(), RichTooltipMaxWidth, content, startRestartGroup, ((i3 << 6) & 57344) | (i9222 & 7168) | (i10222 & 896) | 14155830 | (i10222 & 234881024));
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function23 = function26222;
                    modifier2 = companion;
                    function24 = function25222;
                    shape2 = shape3222;
                    richTooltipColors2 = m2255richTooltipColorsro_MJ88;
                    richTooltipState2 = richTooltipState3222;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                obj3 = function2;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                obj4 = function22;
                if ((i & 458752) == 0) {
                }
                if ((i & 3670016) == 0) {
                }
                if ((i2 & 128) == 0) {
                }
                i3 |= i7;
                if ((23967451 & i3) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i8 == 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                m2255richTooltipColorsro_MJ88 = richTooltipColors;
                Function2<? super Composer, ? super Integer, Unit> function252222 = obj3;
                Shape shape32222 = obj5;
                Function2<? super Composer, ? super Integer, Unit> function262222 = obj4;
                RichTooltipState richTooltipState32222 = obj2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume2222 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                int mo582roundToPx0680j_42222 = ((Density) consume2222).mo582roundToPx0680j_4(TooltipAnchorPadding);
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                RichTooltipPositionProvider richTooltipPositionProvider2222 = (RichTooltipPositionProvider) rememberedValue;
                int i92222 = i3 >> 6;
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(richTooltipState32222) | startRestartGroup.changed(function262222);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue2 = new TooltipKt$RichTooltipBox$2$1(richTooltipState32222, function262222);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceableGroup();
                EffectsKt.SideEffect((Function0) rememberedValue2, startRestartGroup, 0);
                int i102222 = i3 << 3;
                composer2 = startRestartGroup;
                m2258TooltipBoxXDn_Kpo(ComposableLambdaKt.composableLambda(startRestartGroup, 1423372873, true, new TooltipKt$RichTooltipBox$3(m2255richTooltipColorsro_MJ88, text, function252222, function262222, i3)), richTooltipPositionProvider2222, companion, shape32222, richTooltipState32222, m2255richTooltipColorsro_MJ88.m1946getContainerColor0d7_KjU(), RichTooltipTokens.INSTANCE.m2693getContainerElevationD9Ej5fM(), RichTooltipMaxWidth, content, startRestartGroup, ((i3 << 6) & 57344) | (i92222 & 7168) | (i102222 & 896) | 14155830 | (i102222 & 234881024));
                if (ComposerKt.isTraceInProgress()) {
                }
                function23 = function262222;
                modifier2 = companion;
                function24 = function252222;
                shape2 = shape32222;
                richTooltipColors2 = m2255richTooltipColorsro_MJ88;
                richTooltipState2 = richTooltipState32222;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            obj2 = richTooltipState;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            obj3 = function2;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            obj4 = function22;
            if ((i & 458752) == 0) {
            }
            if ((i & 3670016) == 0) {
            }
            if ((i2 & 128) == 0) {
            }
            i3 |= i7;
            if ((23967451 & i3) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 == 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            m2255richTooltipColorsro_MJ88 = richTooltipColors;
            Function2<? super Composer, ? super Integer, Unit> function2522222 = obj3;
            Shape shape322222 = obj5;
            Function2<? super Composer, ? super Integer, Unit> function2622222 = obj4;
            RichTooltipState richTooltipState322222 = obj2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume22222 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int mo582roundToPx0680j_422222 = ((Density) consume22222).mo582roundToPx0680j_4(TooltipAnchorPadding);
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            RichTooltipPositionProvider richTooltipPositionProvider22222 = (RichTooltipPositionProvider) rememberedValue;
            int i922222 = i3 >> 6;
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(richTooltipState322222) | startRestartGroup.changed(function2622222);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue2 = new TooltipKt$RichTooltipBox$2$1(richTooltipState322222, function2622222);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceableGroup();
            EffectsKt.SideEffect((Function0) rememberedValue2, startRestartGroup, 0);
            int i1022222 = i3 << 3;
            composer2 = startRestartGroup;
            m2258TooltipBoxXDn_Kpo(ComposableLambdaKt.composableLambda(startRestartGroup, 1423372873, true, new TooltipKt$RichTooltipBox$3(m2255richTooltipColorsro_MJ88, text, function2522222, function2622222, i3)), richTooltipPositionProvider22222, companion, shape322222, richTooltipState322222, m2255richTooltipColorsro_MJ88.m1946getContainerColor0d7_KjU(), RichTooltipTokens.INSTANCE.m2693getContainerElevationD9Ej5fM(), RichTooltipMaxWidth, content, startRestartGroup, ((i3 << 6) & 57344) | (i922222 & 7168) | (i1022222 & 896) | 14155830 | (i1022222 & 234881024));
            if (ComposerKt.isTraceInProgress()) {
            }
            function23 = function2622222;
            modifier2 = companion;
            function24 = function2522222;
            shape2 = shape322222;
            richTooltipColors2 = m2255richTooltipColorsro_MJ88;
            richTooltipState2 = richTooltipState322222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        obj = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        obj2 = richTooltipState;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        obj3 = function2;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        obj4 = function22;
        if ((i & 458752) == 0) {
        }
        if ((i & 3670016) == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        i3 |= i7;
        if ((23967451 & i3) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        m2255richTooltipColorsro_MJ88 = richTooltipColors;
        Function2<? super Composer, ? super Integer, Unit> function25222222 = obj3;
        Shape shape3222222 = obj5;
        Function2<? super Composer, ? super Integer, Unit> function26222222 = obj4;
        RichTooltipState richTooltipState3222222 = obj2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume222222 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        int mo582roundToPx0680j_4222222 = ((Density) consume222222).mo582roundToPx0680j_4(TooltipAnchorPadding);
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        RichTooltipPositionProvider richTooltipPositionProvider222222 = (RichTooltipPositionProvider) rememberedValue;
        int i9222222 = i3 >> 6;
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(richTooltipState3222222) | startRestartGroup.changed(function26222222);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue2 = new TooltipKt$RichTooltipBox$2$1(richTooltipState3222222, function26222222);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceableGroup();
        EffectsKt.SideEffect((Function0) rememberedValue2, startRestartGroup, 0);
        int i10222222 = i3 << 3;
        composer2 = startRestartGroup;
        m2258TooltipBoxXDn_Kpo(ComposableLambdaKt.composableLambda(startRestartGroup, 1423372873, true, new TooltipKt$RichTooltipBox$3(m2255richTooltipColorsro_MJ88, text, function25222222, function26222222, i3)), richTooltipPositionProvider222222, companion, shape3222222, richTooltipState3222222, m2255richTooltipColorsro_MJ88.m1946getContainerColor0d7_KjU(), RichTooltipTokens.INSTANCE.m2693getContainerElevationD9Ej5fM(), RichTooltipMaxWidth, content, startRestartGroup, ((i3 << 6) & 57344) | (i9222222 & 7168) | (i10222222 & 896) | 14155830 | (i10222222 & 234881024));
        if (ComposerKt.isTraceInProgress()) {
        }
        function23 = function26222222;
        modifier2 = companion;
        function24 = function25222222;
        shape2 = shape3222222;
        richTooltipColors2 = m2255richTooltipColorsro_MJ88;
        richTooltipState2 = richTooltipState3222222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TooltipBox-XDn_Kpo  reason: not valid java name */
    public static final void m2258TooltipBoxXDn_Kpo(Function2<? super Composer, ? super Integer, Unit> function2, PopupPositionProvider popupPositionProvider, Modifier modifier, Shape shape, final TooltipState tooltipState, long j, float f, float f2, Function3<? super TooltipBoxScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1415647894);
        ComposerKt.sourceInformation(startRestartGroup, "C(TooltipBox)P(6,7,4,5,8,0:c#ui.graphics.Color,2:c#ui.unit.Dp,3:c#ui.unit.Dp)199@8111L24,200@8161L49,202@8228L1804,245@10038L1263:Tooltip.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(popupPositionProvider) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(shape) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changed(tooltipState) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changed(j) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= startRestartGroup.changed(f) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i2 |= startRestartGroup.changed(f2) ? 8388608 : 4194304;
        }
        if ((234881024 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((191739611 & i2) != 38347922 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1415647894, i2, -1, "androidx.compose.material3.TooltipBox (Tooltip.kt:188)");
            }
            startRestartGroup.startReplaceableGroup(773894976);
            ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)476@19869L144:Effects.kt#9igjgp");
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            final String m2058getStringNWtq28 = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2056getTooltipLongPressLabeladMyvUU(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new TooltipBoxScope() { // from class: androidx.compose.material3.TooltipKt$TooltipBox$scope$1$1
                    @Override // androidx.compose.material3.TooltipBoxScope
                    public Modifier tooltipAnchor(Modifier modifier2) {
                        Intrinsics.checkNotNullParameter(modifier2, "<this>");
                        TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$onLongPress$1 tooltipKt$TooltipBox$scope$1$1$tooltipAnchor$onLongPress$1 = new TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$onLongPress$1(coroutineScope, TooltipState.this);
                        return SemanticsModifierKt.semantics(SuspendingPointerInputFilterKt.pointerInput(modifier2, TooltipState.this, new TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1(tooltipKt$TooltipBox$scope$1$1$tooltipAnchor$onLongPress$1, null)), true, new TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$2(m2058getStringNWtq28, tooltipKt$TooltipBox$scope$1$1$tooltipAnchor$onLongPress$1));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            TooltipKt$TooltipBox$scope$1$1 tooltipKt$TooltipBox$scope$1$1 = (TooltipKt$TooltipBox$scope$1$1) rememberedValue2;
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(Modifier.Companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1995827622, "C246@10069L70,275@11286L9:Tooltip.kt#uh7d8r");
            Transition updateTransition = TransitionKt.updateTransition(Boolean.valueOf(tooltipState.isVisible()), "Tooltip transition", startRestartGroup, 48, 0);
            startRestartGroup.startReplaceableGroup(-1995827526);
            ComposerKt.sourceInformation(startRestartGroup, "248@10246L41,249@10300L960");
            if (((Boolean) updateTransition.getCurrentState()).booleanValue() || ((Boolean) updateTransition.getTargetState()).booleanValue()) {
                TooltipPopup_androidKt.TooltipPopup(popupPositionProvider, new TooltipKt$TooltipBox$1$1(tooltipState, coroutineScope), ComposableLambdaKt.composableLambda(startRestartGroup, -442150991, true, new TooltipKt$TooltipBox$1$2(modifier, f2, updateTransition, Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2057getTooltipPaneDescriptionadMyvUU(), startRestartGroup, 6), shape, j, f, function2, i2)), startRestartGroup, ((i2 >> 3) & 14) | 384);
            }
            startRestartGroup.endReplaceableGroup();
            function3.invoke(tooltipKt$TooltipBox$scope$1$1, startRestartGroup, Integer.valueOf(((i2 >> 21) & 112) | 6));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new TooltipKt$TooltipBox$2(function2, popupPositionProvider, modifier, shape, tooltipState, j, f, f2, function3, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PlainTooltipImpl-Iv8Zu3U  reason: not valid java name */
    public static final void m2257PlainTooltipImplIv8Zu3U(long j, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(893340370);
        ComposerKt.sourceInformation(startRestartGroup, "C(PlainTooltipImpl)P(1:c#ui.graphics.Color)284@11413L337:Tooltip.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(893340370, i2, -1, "androidx.compose.material3.PlainTooltipImpl (Tooltip.kt:280)");
            }
            Modifier padding = PaddingKt.padding(Modifier.Companion, PlainTooltipContentPadding);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(padding);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1000468479, "C285@11514L10,286@11582L162:Tooltip.kt#uh7d8r");
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(j)), TextKt.getLocalTextStyle().provides(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), PlainTooltipTokens.INSTANCE.getSupportingTextFont()))}, function2, startRestartGroup, (i2 & 112) | 8);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new TooltipKt$PlainTooltipImpl$2(j, function2, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RichTooltipImpl(RichTooltipColors richTooltipColors, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Composer composer, int i) {
        int i2;
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-878950288);
        ComposerKt.sourceInformation(startRestartGroup, "C(RichTooltipImpl)P(1,2,3)303@12033L10,305@12142L10,307@12246L10,308@12309L1298:Tooltip.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(richTooltipColors) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changedInstance(function23) ? 2048 : 1024;
        }
        if ((i2 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-878950288, i2, -1, "androidx.compose.material3.RichTooltipImpl (Tooltip.kt:296)");
            }
            TextStyle fromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), RichTooltipTokens.INSTANCE.getActionLabelTextFont());
            TextStyle fromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), RichTooltipTokens.INSTANCE.getSubheadFont());
            TextStyle fromToken3 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), RichTooltipTokens.INSTANCE.getSupportingTextFont());
            Modifier m750paddingVpY3zN4$default = PaddingKt.m750paddingVpY3zN4$default(Modifier.Companion, RichTooltipHorizontalPadding, 0.0f, 2, null);
            startRestartGroup.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m750paddingVpY3zN4$default);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693704, "C79@4027L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 51873561, "C322@12806L317:Tooltip.kt#uh7d8r");
            startRestartGroup.startReplaceableGroup(51873568);
            ComposerKt.sourceInformation(startRestartGroup, "*312@12437L350");
            if (function22 == null) {
                i3 = i2;
            } else {
                Modifier m630paddingFromBaselineVpY3zN4$default = AlignmentLineKt.m630paddingFromBaselineVpY3zN4$default(Modifier.Companion, HeightToSubheadFirstLine, 0.0f, 2, null);
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume4 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density2 = (Density) consume4;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume5 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume6 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(m630paddingFromBaselineVpY3zN4$default);
                i3 = i2;
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m2893constructorimpl2 = Updater.m2893constructorimpl(startRestartGroup);
                Updater.m2900setimpl(m2893constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl2, density2, ComposeUiNode.Companion.getSetDensity());
                Updater.m2900setimpl(m2893constructorimpl2, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2900setimpl(m2893constructorimpl2, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1242326159, "C315@12562L211:Tooltip.kt#uh7d8r");
                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(richTooltipColors.m1948getTitleContentColor0d7_KjU())), TextKt.getLocalTextStyle().provides(fromToken2)}, function22, startRestartGroup, 8);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                Unit unit = Unit.INSTANCE;
                Unit unit2 = Unit.INSTANCE;
            }
            startRestartGroup.endReplaceableGroup();
            Modifier textVerticalPadding = textVerticalPadding(Modifier.Companion, function22 != null, function23 != null);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume7 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density3 = (Density) consume7;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume8 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection3 = (LayoutDirection) consume8;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume9 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume9;
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(textVerticalPadding);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m2893constructorimpl3 = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl3, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl3, density3, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl3, layoutDirection3, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl3, viewConfiguration3, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf3.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 471369652, "C325@12918L195:Tooltip.kt#uh7d8r");
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(richTooltipColors.m1947getContentColor0d7_KjU())), TextKt.getLocalTextStyle().provides(fromToken3)}, function2, startRestartGroup, (i3 & 112) | 8);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(75391440);
            ComposerKt.sourceInformation(startRestartGroup, "*332@13158L433");
            if (function23 != null) {
                Modifier m752paddingqDBjuR0$default = PaddingKt.m752paddingqDBjuR0$default(SizeKt.m786requiredHeightInVpY3zN4$default(Modifier.Companion, ActionLabelMinHeight, 0.0f, 2, null), 0.0f, 0.0f, 0.0f, ActionLabelBottomPadding, 7, null);
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume10 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density4 = (Density) consume10;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume11 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection4 = (LayoutDirection) consume11;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume12 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration4 = (ViewConfiguration) consume12;
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf4 = LayoutKt.materializerOf(m752paddingqDBjuR0$default);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor4);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m2893constructorimpl4 = Updater.m2893constructorimpl(startRestartGroup);
                Updater.m2900setimpl(m2893constructorimpl4, rememberBoxMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl4, density4, ComposeUiNode.Companion.getSetDensity());
                Updater.m2900setimpl(m2893constructorimpl4, layoutDirection4, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2900setimpl(m2893constructorimpl4, viewConfiguration4, ComposeUiNode.Companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf4.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1242325360, "C337@13361L216:Tooltip.kt#uh7d8r");
                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(richTooltipColors.m1945getActionContentColor0d7_KjU())), TextKt.getLocalTextStyle().provides(fromToken)}, function23, startRestartGroup, 8);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                Unit unit3 = Unit.INSTANCE;
                Unit unit4 = Unit.INSTANCE;
            }
            startRestartGroup.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new TooltipKt$RichTooltipImpl$2(richTooltipColors, function2, function22, function23, i));
    }

    private static final Modifier textVerticalPadding(Modifier modifier, boolean z, boolean z2) {
        if (!z && !z2) {
            return PaddingKt.m750paddingVpY3zN4$default(modifier, 0.0f, PlainTooltipVerticalPadding, 1, null);
        }
        return PaddingKt.m752paddingqDBjuR0$default(AlignmentLineKt.m630paddingFromBaselineVpY3zN4$default(modifier, HeightFromSubheadToTextFirstLine, 0.0f, 2, null), 0.0f, 0.0f, 0.0f, TextBottomPadding, 7, null);
    }

    public static final float getTooltipMinHeight() {
        return TooltipMinHeight;
    }

    public static final float getTooltipMinWidth() {
        return TooltipMinWidth;
    }

    public static final float getRichTooltipHorizontalPadding() {
        return RichTooltipHorizontalPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier animateTooltip(Modifier modifier, Transition<Boolean> transition) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new TooltipKt$animateTooltip$$inlined$debugInspectorInfo$1(transition) : InspectableValueKt.getNoInspectorInfo(), new TooltipKt$animateTooltip$2(transition));
    }

    static {
        float f = 4;
        TooltipAnchorPadding = Dp.m5607constructorimpl(f);
        float f2 = 24;
        TooltipMinHeight = Dp.m5607constructorimpl(f2);
        float m5607constructorimpl = Dp.m5607constructorimpl(f);
        PlainTooltipVerticalPadding = m5607constructorimpl;
        float f3 = 8;
        float m5607constructorimpl2 = Dp.m5607constructorimpl(f3);
        PlainTooltipHorizontalPadding = m5607constructorimpl2;
        PlainTooltipContentPadding = PaddingKt.m742PaddingValuesYgX7TsA(m5607constructorimpl2, m5607constructorimpl);
        RichTooltipMaxWidth = Dp.m5607constructorimpl(320);
        float f4 = 16;
        RichTooltipHorizontalPadding = Dp.m5607constructorimpl(f4);
        HeightToSubheadFirstLine = Dp.m5607constructorimpl(28);
        HeightFromSubheadToTextFirstLine = Dp.m5607constructorimpl(f2);
        TextBottomPadding = Dp.m5607constructorimpl(f4);
        ActionLabelMinHeight = Dp.m5607constructorimpl(36);
        ActionLabelBottomPadding = Dp.m5607constructorimpl(f3);
    }
}
