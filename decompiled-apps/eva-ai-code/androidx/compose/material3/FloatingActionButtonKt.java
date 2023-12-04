package androidx.compose.material3;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.FabPrimaryLargeTokens;
import androidx.compose.material3.tokens.FabPrimarySmallTokens;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.android.exoplayer2.C;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: FloatingActionButton.kt */
@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\u001a}\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u001c\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000b0\u001a¢\u0006\u0002\b\u001c¢\u0006\u0002\b\u001dH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u008f\u0001\u0010\n\u001a\u00020\u000b2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u001c2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u001c2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001ar\u0010&\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u001cH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001ar\u0010)\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u001cH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010(\u001ar\u0010+\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u001cH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010(\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\t\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"ExtendedFabCollapseAnimation", "Landroidx/compose/animation/ExitTransition;", "ExtendedFabEndIconPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ExtendedFabExpandAnimation", "Landroidx/compose/animation/EnterTransition;", "ExtendedFabMinimumWidth", "ExtendedFabStartIconPadding", "ExtendedFabTextPadding", "ExtendedFloatingActionButton", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "elevation", "Landroidx/compose/material3/FloatingActionButtonElevation;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "ExtendedFloatingActionButton-X-z6DiA", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "text", "icon", "expanded", "", "ExtendedFloatingActionButton-ElI5-7k", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "FloatingActionButton", "FloatingActionButton-X-z6DiA", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "LargeFloatingActionButton", "LargeFloatingActionButton-X-z6DiA", "SmallFloatingActionButton", "SmallFloatingActionButton-X-z6DiA", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FloatingActionButtonKt {
    private static final float ExtendedFabStartIconPadding = Dp.m5607constructorimpl(16);
    private static final float ExtendedFabEndIconPadding = Dp.m5607constructorimpl(12);
    private static final float ExtendedFabTextPadding = Dp.m5607constructorimpl(20);
    private static final float ExtendedFabMinimumWidth = Dp.m5607constructorimpl(80);
    private static final ExitTransition ExtendedFabCollapseAnimation = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, 0, MotionTokens.INSTANCE.getEasingLinearCubicBezier(), 2, null), 0.0f, 2, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(AnimationSpecKt.tween$default(500, 0, MotionTokens.INSTANCE.getEasingEmphasizedCubicBezier(), 2, null), Alignment.Companion.getStart(), false, null, 12, null));
    private static final EnterTransition ExtendedFabExpandAnimation = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween(200, 100, MotionTokens.INSTANCE.getEasingLinearCubicBezier()), 0.0f, 2, null).plus(EnterExitTransitionKt.expandHorizontally$default(AnimationSpecKt.tween$default(500, 0, MotionTokens.INSTANCE.getEasingEmphasizedCubicBezier(), 2, null), Alignment.Companion.getStart(), false, null, 12, null));

    /* JADX WARN: Removed duplicated region for block: B:112:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0129  */
    /* renamed from: FloatingActionButton-X-z6DiA  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1816FloatingActionButtonXz6DiA(Function0<Unit> onClick, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        long j3;
        long j4;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        int i4;
        int i5;
        long j5;
        MutableInteractionSource mutableInteractionSource2;
        Object obj2;
        long j6;
        FloatingActionButtonElevation floatingActionButtonElevation3;
        Modifier modifier2;
        int i6;
        Composer composer2;
        Shape shape2;
        long j7;
        MutableInteractionSource mutableInteractionSource3;
        FloatingActionButtonElevation floatingActionButtonElevation4;
        long j8;
        Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        int i9;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-731723913);
        ComposerKt.sourceInformation(startRestartGroup, "C(FloatingActionButton)P(6,5,7,0:c#ui.graphics.Color,2:c#ui.graphics.Color,3,4)98@4887L5,99@4951L14,100@4993L31,101@5102L11,102@5165L39,111@5476L53,112@5573L54,105@5251L1386:FloatingActionButton.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    obj = shape;
                    if (startRestartGroup.changed(obj)) {
                        i9 = 256;
                        i3 |= i9;
                    }
                } else {
                    obj = shape;
                }
                i9 = 128;
                i3 |= i9;
            } else {
                obj = shape;
            }
            if ((i & 7168) != 0) {
                if ((i2 & 8) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i8 = 2048;
                        i3 |= i8;
                    }
                } else {
                    j3 = j;
                }
                i8 = 1024;
                i3 |= i8;
            } else {
                j3 = j;
            }
            if ((i & 57344) != 0) {
                j4 = j2;
                i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j4)) ? 16384 : 8192;
            } else {
                j4 = j2;
            }
            if ((i & 458752) != 0) {
                if ((i2 & 32) == 0) {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                    if (startRestartGroup.changed(floatingActionButtonElevation2)) {
                        i7 = 131072;
                        i3 |= i7;
                    }
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                i7 = 65536;
                i3 |= i7;
            } else {
                floatingActionButtonElevation2 = floatingActionButtonElevation;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                i3 |= startRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
            }
            if ((i2 & 128) != 0) {
                if ((29360128 & i) == 0) {
                    i5 = startRestartGroup.changedInstance(content) ? 8388608 : 4194304;
                }
                if ((23967451 & i3) == 4793490 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier.Companion companion = i10 != 0 ? Modifier.Companion : modifier;
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            obj = FloatingActionButtonDefaults.INSTANCE.getShape(startRestartGroup, 6);
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            j3 = FloatingActionButtonDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                        }
                        if ((i2 & 16) != 0) {
                            j5 = ColorSchemeKt.m1687contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 9) & 14);
                            i3 &= -57345;
                        } else {
                            j5 = j4;
                        }
                        if ((i2 & 32) != 0) {
                            floatingActionButtonElevation2 = FloatingActionButtonDefaults.INSTANCE.m1811elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 24576, 15);
                            i3 &= -458753;
                        }
                        if (i4 != 0) {
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            j4 = j5;
                            obj2 = obj;
                            j6 = j3;
                            floatingActionButtonElevation3 = floatingActionButtonElevation2;
                            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                            j4 = j5;
                            obj2 = obj;
                            j6 = j3;
                            floatingActionButtonElevation3 = floatingActionButtonElevation2;
                        }
                        modifier2 = companion;
                        i6 = i3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        mutableInteractionSource2 = mutableInteractionSource;
                        i6 = i3;
                        obj2 = obj;
                        j6 = j3;
                        floatingActionButtonElevation3 = floatingActionButtonElevation2;
                        modifier2 = modifier;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-731723913, i6, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:95)");
                    }
                    MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                    int i11 = ((i6 >> 12) & 112) | ((i6 >> 18) & 14);
                    int i12 = i6 << 3;
                    FloatingActionButtonElevation floatingActionButtonElevation5 = floatingActionButtonElevation3;
                    long j9 = j4;
                    composer2 = startRestartGroup;
                    Modifier modifier4 = modifier2;
                    SurfaceKt.m2070Surfaceo_FOJdg(onClick, SemanticsModifierKt.semantics$default(modifier2, false, FloatingActionButtonKt$FloatingActionButton$2.INSTANCE, 1, null), false, obj2, j6, j9, floatingActionButtonElevation3.tonalElevation$material3_release(mutableInteractionSource4, startRestartGroup, i11).getValue().m5621unboximpl(), floatingActionButtonElevation3.shadowElevation$material3_release(mutableInteractionSource4, startRestartGroup, i11).getValue().m5621unboximpl(), null, mutableInteractionSource2, ComposableLambdaKt.composableLambda(startRestartGroup, 1249316354, true, new FloatingActionButtonKt$FloatingActionButton$3(j4, content, i6)), composer2, ((i6 << 9) & 1879048192) | (i6 & 14) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752), 6, 260);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape2 = obj2;
                    j7 = j6;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    floatingActionButtonElevation4 = floatingActionButtonElevation5;
                    j8 = j9;
                    modifier3 = modifier4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier;
                    composer2 = startRestartGroup;
                    shape2 = obj;
                    j7 = j3;
                    floatingActionButtonElevation4 = floatingActionButtonElevation2;
                    j8 = j4;
                    mutableInteractionSource3 = mutableInteractionSource;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new FloatingActionButtonKt$FloatingActionButton$4(onClick, modifier3, shape2, j7, j8, floatingActionButtonElevation4, mutableInteractionSource3, content, i, i2));
                return;
            }
            i5 = 12582912;
            i3 |= i5;
            if ((23967451 & i3) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i4 != 0) {
            }
            modifier2 = companion;
            i6 = i3;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
            int i112 = ((i6 >> 12) & 112) | ((i6 >> 18) & 14);
            int i122 = i6 << 3;
            FloatingActionButtonElevation floatingActionButtonElevation52 = floatingActionButtonElevation3;
            long j92 = j4;
            composer2 = startRestartGroup;
            Modifier modifier42 = modifier2;
            SurfaceKt.m2070Surfaceo_FOJdg(onClick, SemanticsModifierKt.semantics$default(modifier2, false, FloatingActionButtonKt$FloatingActionButton$2.INSTANCE, 1, null), false, obj2, j6, j92, floatingActionButtonElevation3.tonalElevation$material3_release(mutableInteractionSource42, startRestartGroup, i112).getValue().m5621unboximpl(), floatingActionButtonElevation3.shadowElevation$material3_release(mutableInteractionSource42, startRestartGroup, i112).getValue().m5621unboximpl(), null, mutableInteractionSource2, ComposableLambdaKt.composableLambda(startRestartGroup, 1249316354, true, new FloatingActionButtonKt$FloatingActionButton$3(j4, content, i6)), composer2, ((i6 << 9) & 1879048192) | (i6 & 14) | (i122 & 7168) | (i122 & 57344) | (i122 & 458752), 6, 260);
            if (ComposerKt.isTraceInProgress()) {
            }
            shape2 = obj2;
            j7 = j6;
            mutableInteractionSource3 = mutableInteractionSource2;
            floatingActionButtonElevation4 = floatingActionButtonElevation52;
            j8 = j92;
            modifier3 = modifier42;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i & 896) != 0) {
        }
        if ((i & 7168) != 0) {
        }
        if ((i & 57344) != 0) {
        }
        if ((i & 458752) != 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        if ((i2 & 128) != 0) {
        }
        i3 |= i5;
        if ((23967451 & i3) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i4 != 0) {
        }
        modifier2 = companion;
        i6 = i3;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        MutableInteractionSource mutableInteractionSource422 = mutableInteractionSource2;
        int i1122 = ((i6 >> 12) & 112) | ((i6 >> 18) & 14);
        int i1222 = i6 << 3;
        FloatingActionButtonElevation floatingActionButtonElevation522 = floatingActionButtonElevation3;
        long j922 = j4;
        composer2 = startRestartGroup;
        Modifier modifier422 = modifier2;
        SurfaceKt.m2070Surfaceo_FOJdg(onClick, SemanticsModifierKt.semantics$default(modifier2, false, FloatingActionButtonKt$FloatingActionButton$2.INSTANCE, 1, null), false, obj2, j6, j922, floatingActionButtonElevation3.tonalElevation$material3_release(mutableInteractionSource422, startRestartGroup, i1122).getValue().m5621unboximpl(), floatingActionButtonElevation3.shadowElevation$material3_release(mutableInteractionSource422, startRestartGroup, i1122).getValue().m5621unboximpl(), null, mutableInteractionSource2, ComposableLambdaKt.composableLambda(startRestartGroup, 1249316354, true, new FloatingActionButtonKt$FloatingActionButton$3(j4, content, i6)), composer2, ((i6 << 9) & 1879048192) | (i6 & 14) | (i1222 & 7168) | (i1222 & 57344) | (i1222 & 458752), 6, 260);
        if (ComposerKt.isTraceInProgress()) {
        }
        shape2 = obj2;
        j7 = j6;
        mutableInteractionSource3 = mutableInteractionSource2;
        floatingActionButtonElevation4 = floatingActionButtonElevation522;
        j8 = j922;
        modifier3 = modifier422;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0129  */
    /* renamed from: SmallFloatingActionButton-X-z6DiA  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1818SmallFloatingActionButtonXz6DiA(Function0<Unit> onClick, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        long j3;
        long j4;
        Object obj2;
        int i4;
        Object obj3;
        int i5;
        Shape shape2;
        int i6;
        long j5;
        long j6;
        Modifier modifier2;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        Modifier modifier3;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        Shape shape3;
        long j7;
        long j8;
        int i7;
        int i8;
        int i9;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1444748300);
        ComposerKt.sourceInformation(startRestartGroup, "C(SmallFloatingActionButton)P(6,5,7,0:c#ui.graphics.Color,2:c#ui.graphics.Color,3,4)166@8483L10,167@8552L14,168@8594L31,169@8703L11,170@8766L39,173@8852L431:FloatingActionButton.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    obj = shape;
                    if (startRestartGroup.changed(obj)) {
                        i9 = 256;
                        i3 |= i9;
                    }
                } else {
                    obj = shape;
                }
                i9 = 128;
                i3 |= i9;
            } else {
                obj = shape;
            }
            if ((i & 7168) != 0) {
                if ((i2 & 8) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i8 = 2048;
                        i3 |= i8;
                    }
                } else {
                    j3 = j;
                }
                i8 = 1024;
                i3 |= i8;
            } else {
                j3 = j;
            }
            if ((i & 57344) != 0) {
                if ((i2 & 16) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i7 = 16384;
                        i3 |= i7;
                    }
                } else {
                    j4 = j2;
                }
                i7 = 8192;
                i3 |= i7;
            } else {
                j4 = j2;
            }
            if ((i & 458752) != 0) {
                obj2 = floatingActionButtonElevation;
                i3 |= ((i2 & 32) == 0 && startRestartGroup.changed(obj2)) ? 131072 : 65536;
            } else {
                obj2 = floatingActionButtonElevation;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
                obj3 = mutableInteractionSource;
            } else {
                obj3 = mutableInteractionSource;
                if ((i & 3670016) == 0) {
                    i3 |= startRestartGroup.changed(obj3) ? 1048576 : 524288;
                }
            }
            if ((i2 & 128) != 0) {
                if ((i & 29360128) == 0) {
                    i5 = startRestartGroup.changedInstance(content) ? 8388608 : 4194304;
                }
                if ((23967451 & i3) == 4793490 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier.Companion companion = i10 != 0 ? Modifier.Companion : modifier;
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            shape2 = FloatingActionButtonDefaults.INSTANCE.getSmallShape(startRestartGroup, 6);
                        } else {
                            shape2 = obj;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            j3 = FloatingActionButtonDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i6 = i3 & (-57345);
                            j5 = ColorSchemeKt.m1687contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 9) & 14);
                        } else {
                            i6 = i3;
                            j5 = j4;
                        }
                        if ((i2 & 32) != 0) {
                            j6 = j3;
                            obj2 = FloatingActionButtonDefaults.INSTANCE.m1811elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 24576, 15);
                            i3 = i6 & (-458753);
                        } else {
                            j6 = j3;
                            i3 = i6;
                        }
                        if (i4 != 0) {
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            modifier2 = companion;
                            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                            FloatingActionButtonElevation floatingActionButtonElevation3 = obj2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1444748300, i3, -1, "androidx.compose.material3.SmallFloatingActionButton (FloatingActionButton.kt:163)");
                            }
                            composer2 = startRestartGroup;
                            m1816FloatingActionButtonXz6DiA(onClick, SizeKt.m799sizeInqDBjuR0$default(modifier2, FabPrimarySmallTokens.INSTANCE.m2437getContainerWidthD9Ej5fM(), FabPrimarySmallTokens.INSTANCE.m2436getContainerHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), shape2, j6, j5, floatingActionButtonElevation3, mutableInteractionSource2, content, startRestartGroup, (i3 & 14) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016) | (i3 & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier2;
                            floatingActionButtonElevation2 = floatingActionButtonElevation3;
                            obj3 = mutableInteractionSource2;
                            shape3 = shape2;
                            j7 = j5;
                            j8 = j6;
                        } else {
                            modifier2 = companion;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        modifier2 = modifier;
                        shape2 = obj;
                        j6 = j3;
                        j5 = j4;
                    }
                    mutableInteractionSource2 = obj3;
                    FloatingActionButtonElevation floatingActionButtonElevation32 = obj2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composer2 = startRestartGroup;
                    m1816FloatingActionButtonXz6DiA(onClick, SizeKt.m799sizeInqDBjuR0$default(modifier2, FabPrimarySmallTokens.INSTANCE.m2437getContainerWidthD9Ej5fM(), FabPrimarySmallTokens.INSTANCE.m2436getContainerHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), shape2, j6, j5, floatingActionButtonElevation32, mutableInteractionSource2, content, startRestartGroup, (i3 & 14) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016) | (i3 & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier2;
                    floatingActionButtonElevation2 = floatingActionButtonElevation32;
                    obj3 = mutableInteractionSource2;
                    shape3 = shape2;
                    j7 = j5;
                    j8 = j6;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier;
                    shape3 = obj;
                    j8 = j3;
                    j7 = j4;
                    floatingActionButtonElevation2 = obj2;
                    composer2 = startRestartGroup;
                }
                ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new FloatingActionButtonKt$SmallFloatingActionButton$2(onClick, modifier3, shape3, j8, j7, floatingActionButtonElevation2, obj3, content, i, i2));
                return;
            }
            i5 = 12582912;
            i3 |= i5;
            if ((23967451 & i3) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i4 != 0) {
            }
        }
        if ((i & 896) != 0) {
        }
        if ((i & 7168) != 0) {
        }
        if ((i & 57344) != 0) {
        }
        if ((i & 458752) != 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        if ((i2 & 128) != 0) {
        }
        i3 |= i5;
        if ((23967451 & i3) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i4 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0129  */
    /* renamed from: LargeFloatingActionButton-X-z6DiA  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1817LargeFloatingActionButtonXz6DiA(Function0<Unit> onClick, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        long j3;
        long j4;
        Object obj2;
        int i4;
        Object obj3;
        int i5;
        Shape shape2;
        int i6;
        long j5;
        long j6;
        Modifier modifier2;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        Modifier modifier3;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        Shape shape3;
        long j7;
        long j8;
        int i7;
        int i8;
        int i9;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1650866856);
        ComposerKt.sourceInformation(startRestartGroup, "C(LargeFloatingActionButton)P(6,5,7,0:c#ui.graphics.Color,2:c#ui.graphics.Color,3,4)218@11129L10,219@11198L14,220@11240L31,221@11349L11,222@11412L39,225@11498L431:FloatingActionButton.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    obj = shape;
                    if (startRestartGroup.changed(obj)) {
                        i9 = 256;
                        i3 |= i9;
                    }
                } else {
                    obj = shape;
                }
                i9 = 128;
                i3 |= i9;
            } else {
                obj = shape;
            }
            if ((i & 7168) != 0) {
                if ((i2 & 8) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i8 = 2048;
                        i3 |= i8;
                    }
                } else {
                    j3 = j;
                }
                i8 = 1024;
                i3 |= i8;
            } else {
                j3 = j;
            }
            if ((i & 57344) != 0) {
                if ((i2 & 16) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i7 = 16384;
                        i3 |= i7;
                    }
                } else {
                    j4 = j2;
                }
                i7 = 8192;
                i3 |= i7;
            } else {
                j4 = j2;
            }
            if ((i & 458752) != 0) {
                obj2 = floatingActionButtonElevation;
                i3 |= ((i2 & 32) == 0 && startRestartGroup.changed(obj2)) ? 131072 : 65536;
            } else {
                obj2 = floatingActionButtonElevation;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
                obj3 = mutableInteractionSource;
            } else {
                obj3 = mutableInteractionSource;
                if ((i & 3670016) == 0) {
                    i3 |= startRestartGroup.changed(obj3) ? 1048576 : 524288;
                }
            }
            if ((i2 & 128) != 0) {
                if ((i & 29360128) == 0) {
                    i5 = startRestartGroup.changedInstance(content) ? 8388608 : 4194304;
                }
                if ((23967451 & i3) == 4793490 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier.Companion companion = i10 != 0 ? Modifier.Companion : modifier;
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            shape2 = FloatingActionButtonDefaults.INSTANCE.getLargeShape(startRestartGroup, 6);
                        } else {
                            shape2 = obj;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            j3 = FloatingActionButtonDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                        }
                        if ((i2 & 16) != 0) {
                            i6 = i3 & (-57345);
                            j5 = ColorSchemeKt.m1687contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 9) & 14);
                        } else {
                            i6 = i3;
                            j5 = j4;
                        }
                        if ((i2 & 32) != 0) {
                            j6 = j3;
                            obj2 = FloatingActionButtonDefaults.INSTANCE.m1811elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 24576, 15);
                            i3 = i6 & (-458753);
                        } else {
                            j6 = j3;
                            i3 = i6;
                        }
                        if (i4 != 0) {
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            modifier2 = companion;
                            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                            FloatingActionButtonElevation floatingActionButtonElevation3 = obj2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1650866856, i3, -1, "androidx.compose.material3.LargeFloatingActionButton (FloatingActionButton.kt:215)");
                            }
                            composer2 = startRestartGroup;
                            m1816FloatingActionButtonXz6DiA(onClick, SizeKt.m799sizeInqDBjuR0$default(modifier2, FabPrimaryLargeTokens.INSTANCE.m2426getContainerWidthD9Ej5fM(), FabPrimaryLargeTokens.INSTANCE.m2425getContainerHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), shape2, j6, j5, floatingActionButtonElevation3, mutableInteractionSource2, content, startRestartGroup, (i3 & 14) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016) | (i3 & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier2;
                            floatingActionButtonElevation2 = floatingActionButtonElevation3;
                            obj3 = mutableInteractionSource2;
                            shape3 = shape2;
                            j7 = j5;
                            j8 = j6;
                        } else {
                            modifier2 = companion;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        modifier2 = modifier;
                        shape2 = obj;
                        j6 = j3;
                        j5 = j4;
                    }
                    mutableInteractionSource2 = obj3;
                    FloatingActionButtonElevation floatingActionButtonElevation32 = obj2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composer2 = startRestartGroup;
                    m1816FloatingActionButtonXz6DiA(onClick, SizeKt.m799sizeInqDBjuR0$default(modifier2, FabPrimaryLargeTokens.INSTANCE.m2426getContainerWidthD9Ej5fM(), FabPrimaryLargeTokens.INSTANCE.m2425getContainerHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), shape2, j6, j5, floatingActionButtonElevation32, mutableInteractionSource2, content, startRestartGroup, (i3 & 14) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016) | (i3 & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier2;
                    floatingActionButtonElevation2 = floatingActionButtonElevation32;
                    obj3 = mutableInteractionSource2;
                    shape3 = shape2;
                    j7 = j5;
                    j8 = j6;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier;
                    shape3 = obj;
                    j8 = j3;
                    j7 = j4;
                    floatingActionButtonElevation2 = obj2;
                    composer2 = startRestartGroup;
                }
                ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new FloatingActionButtonKt$LargeFloatingActionButton$2(onClick, modifier3, shape3, j8, j7, floatingActionButtonElevation2, obj3, content, i, i2));
                return;
            }
            i5 = 12582912;
            i3 |= i5;
            if ((23967451 & i3) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i4 != 0) {
            }
        }
        if ((i & 896) != 0) {
        }
        if ((i & 7168) != 0) {
        }
        if ((i & 57344) != 0) {
        }
        if ((i & 458752) != 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        if ((i2 & 128) != 0) {
        }
        i3 |= i5;
        if ((23967451 & i3) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i4 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ee  */
    /* renamed from: ExtendedFloatingActionButton-X-z6DiA  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1815ExtendedFloatingActionButtonXz6DiA(Function0<Unit> onClick, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        long j3;
        long j4;
        Object obj2;
        int i4;
        Object obj3;
        Shape shape2;
        int i5;
        long j5;
        long j6;
        Modifier modifier2;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        Modifier modifier3;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        Shape shape3;
        long j7;
        long j8;
        int i6;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-326283107);
        ComposerKt.sourceInformation(startRestartGroup, "C(ExtendedFloatingActionButton)P(6,5,7,0:c#ui.graphics.Color,2:c#ui.graphics.Color,3,4)273@13913L16,274@13988L14,275@14030L31,276@14139L11,277@14202L39,280@14297L595:FloatingActionButton.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    obj = shape;
                    if (startRestartGroup.changed(obj)) {
                        i8 = 256;
                        i3 |= i8;
                    }
                } else {
                    obj = shape;
                }
                i8 = 128;
                i3 |= i8;
            } else {
                obj = shape;
            }
            if ((i & 7168) != 0) {
                if ((i2 & 8) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i7 = 2048;
                        i3 |= i7;
                    }
                } else {
                    j3 = j;
                }
                i7 = 1024;
                i3 |= i7;
            } else {
                j3 = j;
            }
            if ((i & 57344) != 0) {
                if ((i2 & 16) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i6 = 16384;
                        i3 |= i6;
                    }
                } else {
                    j4 = j2;
                }
                i6 = 8192;
                i3 |= i6;
            } else {
                j4 = j2;
            }
            if ((i & 458752) != 0) {
                obj2 = floatingActionButtonElevation;
                i3 |= ((i2 & 32) == 0 && startRestartGroup.changed(obj2)) ? 131072 : 65536;
            } else {
                obj2 = floatingActionButtonElevation;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
                obj3 = mutableInteractionSource;
            } else {
                obj3 = mutableInteractionSource;
                if ((i & 3670016) == 0) {
                    i3 |= startRestartGroup.changed(obj3) ? 1048576 : 524288;
                }
            }
            if ((i2 & 128) == 0) {
                i3 |= 12582912;
            } else if ((29360128 & i) == 0) {
                i3 |= startRestartGroup.changedInstance(content) ? 8388608 : 4194304;
            }
            if ((23967451 & i3) == 4793490 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    Modifier.Companion companion = i9 == 0 ? Modifier.Companion : modifier;
                    if ((i2 & 4) == 0) {
                        i3 &= -897;
                        shape2 = FloatingActionButtonDefaults.INSTANCE.getExtendedFabShape(startRestartGroup, 6);
                    } else {
                        shape2 = obj;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        j3 = FloatingActionButtonDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                    }
                    if ((i2 & 16) == 0) {
                        i5 = i3 & (-57345);
                        j5 = ColorSchemeKt.m1687contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 9) & 14);
                    } else {
                        i5 = i3;
                        j5 = j4;
                    }
                    if ((i2 & 32) == 0) {
                        j6 = j3;
                        obj2 = FloatingActionButtonDefaults.INSTANCE.m1811elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 24576, 15);
                        i3 = i5 & (-458753);
                    } else {
                        j6 = j3;
                        i3 = i5;
                    }
                    if (i4 == 0) {
                        startRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                        Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.Companion.getEmpty()) {
                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        startRestartGroup.endReplaceableGroup();
                        modifier2 = companion;
                        mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                        FloatingActionButtonElevation floatingActionButtonElevation3 = obj2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-326283107, i3, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:270)");
                        }
                        composer2 = startRestartGroup;
                        m1816FloatingActionButtonXz6DiA(onClick, modifier2, shape2, j6, j5, floatingActionButtonElevation3, mutableInteractionSource2, ComposableLambdaKt.composableLambda(startRestartGroup, 398457247, true, new FloatingActionButtonKt$ExtendedFloatingActionButton$2(content, i3)), startRestartGroup, (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        floatingActionButtonElevation2 = floatingActionButtonElevation3;
                        obj3 = mutableInteractionSource2;
                        shape3 = shape2;
                        j7 = j5;
                        j8 = j6;
                    } else {
                        modifier2 = companion;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    modifier2 = modifier;
                    shape2 = obj;
                    j6 = j3;
                    j5 = j4;
                }
                mutableInteractionSource2 = obj3;
                FloatingActionButtonElevation floatingActionButtonElevation32 = obj2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composer2 = startRestartGroup;
                m1816FloatingActionButtonXz6DiA(onClick, modifier2, shape2, j6, j5, floatingActionButtonElevation32, mutableInteractionSource2, ComposableLambdaKt.composableLambda(startRestartGroup, 398457247, true, new FloatingActionButtonKt$ExtendedFloatingActionButton$2(content, i3)), startRestartGroup, (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier2;
                floatingActionButtonElevation2 = floatingActionButtonElevation32;
                obj3 = mutableInteractionSource2;
                shape3 = shape2;
                j7 = j5;
                j8 = j6;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier;
                shape3 = obj;
                j8 = j3;
                j7 = j4;
                floatingActionButtonElevation2 = obj2;
                composer2 = startRestartGroup;
            }
            ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                return;
            }
            endRestartGroup.updateScope(new FloatingActionButtonKt$ExtendedFloatingActionButton$3(onClick, modifier3, shape3, j8, j7, floatingActionButtonElevation2, obj3, content, i, i2));
            return;
        }
        if ((i & 896) != 0) {
        }
        if ((i & 7168) != 0) {
        }
        if ((i & 57344) != 0) {
        }
        if ((i & 458752) != 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((23967451 & i3) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 == 0) {
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if (i4 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0121  */
    /* renamed from: ExtendedFloatingActionButton-ElI5-7k  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1814ExtendedFloatingActionButtonElI57k(Function2<? super Composer, ? super Integer, Unit> text, Function2<? super Composer, ? super Integer, Unit> icon, Function0<Unit> onClick, Modifier modifier, boolean z, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2) {
        int i3;
        int i4;
        long j3;
        long j4;
        Object obj;
        int i5;
        Modifier.Companion companion;
        Shape shape2;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        MutableInteractionSource mutableInteractionSource2;
        boolean z2;
        Object obj2;
        Shape shape3;
        long j5;
        long j6;
        Composer composer2;
        Modifier modifier2;
        Shape shape4;
        long j7;
        FloatingActionButtonElevation floatingActionButtonElevation3;
        boolean z3;
        long j8;
        MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-1387401842);
        ComposerKt.sourceInformation(startRestartGroup, "C(ExtendedFloatingActionButton)P(9,4,7,6,3,8,0:c#ui.graphics.Color,1:c#ui.graphics.Color)343@17455L16,344@17530L14,345@17572L31,346@17681L11,347@17744L39,349@17793L1269:FloatingActionButton.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(icon) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 57344) == 0) {
                i3 |= startRestartGroup.changed(z) ? 16384 : 8192;
                if ((i & 458752) == 0) {
                    if ((i2 & 32) == 0 && startRestartGroup.changed(shape)) {
                        i7 = 131072;
                        i3 |= i7;
                    }
                    i7 = 65536;
                    i3 |= i7;
                }
                if ((i & 3670016) == 0) {
                    j3 = j;
                    i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(j3)) ? 1048576 : 524288;
                } else {
                    j3 = j;
                }
                if ((i & 29360128) == 0) {
                    j4 = j2;
                    i3 |= ((i2 & 128) == 0 && startRestartGroup.changed(j4)) ? 8388608 : 4194304;
                } else {
                    j4 = j2;
                }
                if ((i & 234881024) == 0) {
                    if ((i2 & 256) == 0) {
                        obj = floatingActionButtonElevation;
                        if (startRestartGroup.changed(obj)) {
                            i6 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            i3 |= i6;
                        }
                    } else {
                        obj = floatingActionButtonElevation;
                    }
                    i6 = 33554432;
                    i3 |= i6;
                } else {
                    obj = floatingActionButtonElevation;
                }
                i5 = i2 & 512;
                if (i5 != 0) {
                    i3 |= C.ENCODING_PCM_32BIT;
                } else if ((i & 1879048192) == 0) {
                    i3 |= startRestartGroup.changed(mutableInteractionSource) ? 536870912 : 268435456;
                }
                if ((i3 & 1533916891) == 306783378 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        companion = i8 != 0 ? Modifier.Companion : modifier;
                        boolean z4 = i4 != 0 ? true : z;
                        if ((i2 & 32) != 0) {
                            shape2 = FloatingActionButtonDefaults.INSTANCE.getExtendedFabShape(startRestartGroup, 6);
                            i3 &= -458753;
                        } else {
                            shape2 = shape;
                        }
                        if ((i2 & 64) != 0) {
                            j3 = FloatingActionButtonDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                            i3 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            j4 = ColorSchemeKt.m1687contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        }
                        if ((i2 & 256) != 0) {
                            floatingActionButtonElevation2 = FloatingActionButtonDefaults.INSTANCE.m1811elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 24576, 15);
                            i3 &= -234881025;
                        } else {
                            floatingActionButtonElevation2 = obj;
                        }
                        if (i5 != 0) {
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        z2 = z4;
                        obj2 = floatingActionButtonElevation2;
                        shape3 = shape2;
                        j5 = j4;
                        j6 = j3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            i3 &= -29360129;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                        }
                        companion = modifier;
                        shape3 = shape;
                        mutableInteractionSource2 = mutableInteractionSource;
                        j5 = j4;
                        j6 = j3;
                        obj2 = obj;
                        z2 = z;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1387401842, i3, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:337)");
                    }
                    ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 1172118032, true, new FloatingActionButtonKt$ExtendedFloatingActionButton$5(z2, icon, i3, text));
                    int i9 = i3 >> 6;
                    int i10 = i3 >> 9;
                    boolean z5 = z2;
                    composer2 = startRestartGroup;
                    m1816FloatingActionButtonXz6DiA(onClick, companion, shape3, j6, j5, obj2, mutableInteractionSource2, composableLambda, startRestartGroup, (i9 & 112) | (i9 & 14) | 12582912 | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (i10 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion;
                    shape4 = shape3;
                    j7 = j6;
                    floatingActionButtonElevation3 = obj2;
                    z3 = z5;
                    j8 = j5;
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier2 = modifier;
                    z3 = z;
                    shape4 = shape;
                    composer2 = startRestartGroup;
                    Object obj3 = obj;
                    mutableInteractionSource3 = mutableInteractionSource;
                    floatingActionButtonElevation3 = obj3;
                    j8 = j4;
                    j7 = j3;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new FloatingActionButtonKt$ExtendedFloatingActionButton$6(text, icon, onClick, modifier2, z3, shape4, j7, j8, floatingActionButtonElevation3, mutableInteractionSource3, i, i2));
                return;
            }
            if ((i & 458752) == 0) {
            }
            if ((i & 3670016) == 0) {
            }
            if ((i & 29360128) == 0) {
            }
            if ((i & 234881024) == 0) {
            }
            i5 = i2 & 512;
            if (i5 != 0) {
            }
            if ((i3 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if ((i2 & 256) != 0) {
            }
            if (i5 != 0) {
            }
            z2 = z4;
            obj2 = floatingActionButtonElevation2;
            shape3 = shape2;
            j5 = j4;
            j6 = j3;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(startRestartGroup, 1172118032, true, new FloatingActionButtonKt$ExtendedFloatingActionButton$5(z2, icon, i3, text));
            int i92 = i3 >> 6;
            int i102 = i3 >> 9;
            boolean z52 = z2;
            composer2 = startRestartGroup;
            m1816FloatingActionButtonXz6DiA(onClick, companion, shape3, j6, j5, obj2, mutableInteractionSource2, composableLambda2, startRestartGroup, (i92 & 112) | (i92 & 14) | 12582912 | (i102 & 896) | (i102 & 7168) | (57344 & i102) | (458752 & i102) | (i102 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = companion;
            shape4 = shape3;
            j7 = j6;
            floatingActionButtonElevation3 = obj2;
            z3 = z52;
            j8 = j5;
            mutableInteractionSource3 = mutableInteractionSource2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        if ((i & 458752) == 0) {
        }
        if ((i & 3670016) == 0) {
        }
        if ((i & 29360128) == 0) {
        }
        if ((i & 234881024) == 0) {
        }
        i5 = i2 & 512;
        if (i5 != 0) {
        }
        if ((i3 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((i2 & 256) != 0) {
        }
        if (i5 != 0) {
        }
        z2 = z4;
        obj2 = floatingActionButtonElevation2;
        shape3 = shape2;
        j5 = j4;
        j6 = j3;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposableLambda composableLambda22 = ComposableLambdaKt.composableLambda(startRestartGroup, 1172118032, true, new FloatingActionButtonKt$ExtendedFloatingActionButton$5(z2, icon, i3, text));
        int i922 = i3 >> 6;
        int i1022 = i3 >> 9;
        boolean z522 = z2;
        composer2 = startRestartGroup;
        m1816FloatingActionButtonXz6DiA(onClick, companion, shape3, j6, j5, obj2, mutableInteractionSource2, composableLambda22, startRestartGroup, (i922 & 112) | (i922 & 14) | 12582912 | (i1022 & 896) | (i1022 & 7168) | (57344 & i1022) | (458752 & i1022) | (i1022 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        shape4 = shape3;
        j7 = j6;
        floatingActionButtonElevation3 = obj2;
        z3 = z522;
        j8 = j5;
        mutableInteractionSource3 = mutableInteractionSource2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
