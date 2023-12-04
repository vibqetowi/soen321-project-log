package com.ifriend.ui.components.progress.dots;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DotsLoading.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aY\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aY\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a\r\u0010\u001b\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Dot", "", "size", "Landroidx/compose/ui/unit/Dp;", "color", "Landroidx/compose/ui/graphics/Color;", "yOffset", "Lkotlin/Function0;", "", "xOffset", "alpha", "Dot-ZHrjRmQ", "(FJLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "DotsLoadingFade", "state", "Lcom/ifriend/ui/components/progress/dots/DotsLoadingState;", "modifier", "Landroidx/compose/ui/Modifier;", "dotsCount", "", "dotsSize", "dotsColor", "duration", "easing", "Landroidx/compose/animation/core/Easing;", "DotsLoadingFade-DDuSU3M", "(Lcom/ifriend/ui/components/progress/dots/DotsLoadingState;Landroidx/compose/ui/Modifier;IFJILandroidx/compose/animation/core/Easing;Landroidx/compose/runtime/Composer;II)V", "rememberDotsLoading", "(Landroidx/compose/runtime/Composer;I)Lcom/ifriend/ui/components/progress/dots/DotsLoadingState;", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DotsLoadingKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0192  */
    /* renamed from: Dot-ZHrjRmQ  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7060DotZHrjRmQ(float f, long j, Function0<Float> function0, Function0<Float> function02, Function0<Float> function03, Composer composer, int i, int i2) {
        float f2;
        int i3;
        long j2;
        DotsLoadingKt$Dot$1 dotsLoadingKt$Dot$1;
        int i4;
        DotsLoadingKt$Dot$2 dotsLoadingKt$Dot$2;
        int i5;
        DotsLoadingKt$Dot$3 dotsLoadingKt$Dot$3;
        float m5607constructorimpl;
        boolean changed;
        DotsLoadingKt$Dot$4$1 rememberedValue;
        ScopeUpdateScope endRestartGroup;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-1489857527);
        ComposerKt.sourceInformation(startRestartGroup, "C(Dot)P(2:c#ui.unit.Dp,1:c#ui.graphics.Color,4,3)");
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            f2 = f;
        } else if ((i & 14) == 0) {
            f2 = f;
            i3 = (startRestartGroup.changed(f2) ? 4 : 2) | i;
        } else {
            f2 = f;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                j2 = j;
                if (startRestartGroup.changed(j2)) {
                    i6 = 32;
                    i3 |= i6;
                }
            } else {
                j2 = j;
            }
            i6 = 16;
            i3 |= i6;
        } else {
            j2 = j;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            dotsLoadingKt$Dot$1 = function0;
            i3 |= startRestartGroup.changedInstance(dotsLoadingKt$Dot$1) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                dotsLoadingKt$Dot$2 = function02;
                i3 |= startRestartGroup.changedInstance(dotsLoadingKt$Dot$2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    dotsLoadingKt$Dot$3 = function03;
                    i3 |= startRestartGroup.changedInstance(dotsLoadingKt$Dot$3) ? 16384 : 8192;
                    if ((i3 & 46811) == 9362 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) == 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            m5607constructorimpl = f2;
                        } else {
                            m5607constructorimpl = i7 == 0 ? Dp.m5607constructorimpl(4) : f2;
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                j2 = AppTheme.INSTANCE.getColors(startRestartGroup, 6).m7105getPrimary0d7_KjU();
                            }
                            if (i8 != 0) {
                                dotsLoadingKt$Dot$1 = DotsLoadingKt$Dot$1.INSTANCE;
                            }
                            if (i4 != 0) {
                                dotsLoadingKt$Dot$2 = DotsLoadingKt$Dot$2.INSTANCE;
                            }
                            if (i5 != 0) {
                                dotsLoadingKt$Dot$3 = DotsLoadingKt$Dot$3.INSTANCE;
                            }
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1489857527, i3, -1, "com.ifriend.ui.components.progress.dots.Dot (DotsLoading.kt:39)");
                        }
                        Modifier alpha = AlphaKt.alpha(OffsetKt.m708offsetVpY3zN4(SizeKt.m795size3ABfNKs(PaddingKt.m750paddingVpY3zN4$default(Modifier.Companion, Dp.m5607constructorimpl(3), 0.0f, 2, null), m5607constructorimpl), Dp.m5607constructorimpl(dotsLoadingKt$Dot$2.invoke().floatValue()), Dp.m5607constructorimpl(dotsLoadingKt$Dot$1.invoke().floatValue())), dotsLoadingKt$Dot$3.invoke().floatValue());
                        Color m3281boximpl = Color.m3281boximpl(j2);
                        startRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        changed = startRestartGroup.changed(m3281boximpl);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changed || rememberedValue == Composer.Companion.getEmpty()) {
                            rememberedValue = new DotsLoadingKt$Dot$4$1(j2);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        startRestartGroup.endReplaceableGroup();
                        CanvasKt.Canvas(alpha, (Function1) rememberedValue, startRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f2 = m5607constructorimpl;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                    }
                    long j3 = j2;
                    Function0<Float> function04 = dotsLoadingKt$Dot$1;
                    Function0<Float> function05 = dotsLoadingKt$Dot$3;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new DotsLoadingKt$Dot$5(f2, j3, function04, dotsLoadingKt$Dot$2, function05, i, i2));
                    return;
                }
                dotsLoadingKt$Dot$3 = function03;
                if ((i3 & 46811) == 9362) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                }
                if (i7 == 0) {
                }
                if ((i2 & 2) != 0) {
                }
                if (i8 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier alpha2 = AlphaKt.alpha(OffsetKt.m708offsetVpY3zN4(SizeKt.m795size3ABfNKs(PaddingKt.m750paddingVpY3zN4$default(Modifier.Companion, Dp.m5607constructorimpl(3), 0.0f, 2, null), m5607constructorimpl), Dp.m5607constructorimpl(dotsLoadingKt$Dot$2.invoke().floatValue()), Dp.m5607constructorimpl(dotsLoadingKt$Dot$1.invoke().floatValue())), dotsLoadingKt$Dot$3.invoke().floatValue());
                Color m3281boximpl2 = Color.m3281boximpl(j2);
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(m3281boximpl2);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue = new DotsLoadingKt$Dot$4$1(j2);
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(alpha2, (Function1) rememberedValue, startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                f2 = m5607constructorimpl;
                long j32 = j2;
                Function0<Float> function042 = dotsLoadingKt$Dot$1;
                Function0<Float> function052 = dotsLoadingKt$Dot$3;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            dotsLoadingKt$Dot$2 = function02;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            dotsLoadingKt$Dot$3 = function03;
            if ((i3 & 46811) == 9362) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) == 0) {
            }
            if (i7 == 0) {
            }
            if ((i2 & 2) != 0) {
            }
            if (i8 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier alpha22 = AlphaKt.alpha(OffsetKt.m708offsetVpY3zN4(SizeKt.m795size3ABfNKs(PaddingKt.m750paddingVpY3zN4$default(Modifier.Companion, Dp.m5607constructorimpl(3), 0.0f, 2, null), m5607constructorimpl), Dp.m5607constructorimpl(dotsLoadingKt$Dot$2.invoke().floatValue()), Dp.m5607constructorimpl(dotsLoadingKt$Dot$1.invoke().floatValue())), dotsLoadingKt$Dot$3.invoke().floatValue());
            Color m3281boximpl22 = Color.m3281boximpl(j2);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(m3281boximpl22);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new DotsLoadingKt$Dot$4$1(j2);
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(alpha22, (Function1) rememberedValue, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            f2 = m5607constructorimpl;
            long j322 = j2;
            Function0<Float> function0422 = dotsLoadingKt$Dot$1;
            Function0<Float> function0522 = dotsLoadingKt$Dot$3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        dotsLoadingKt$Dot$1 = function0;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        dotsLoadingKt$Dot$2 = function02;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        dotsLoadingKt$Dot$3 = function03;
        if ((i3 & 46811) == 9362) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) == 0) {
        }
        if (i7 == 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if (i8 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier alpha222 = AlphaKt.alpha(OffsetKt.m708offsetVpY3zN4(SizeKt.m795size3ABfNKs(PaddingKt.m750paddingVpY3zN4$default(Modifier.Companion, Dp.m5607constructorimpl(3), 0.0f, 2, null), m5607constructorimpl), Dp.m5607constructorimpl(dotsLoadingKt$Dot$2.invoke().floatValue()), Dp.m5607constructorimpl(dotsLoadingKt$Dot$1.invoke().floatValue())), dotsLoadingKt$Dot$3.invoke().floatValue());
        Color m3281boximpl222 = Color.m3281boximpl(j2);
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(m3281boximpl222);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new DotsLoadingKt$Dot$4$1(j2);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        CanvasKt.Canvas(alpha222, (Function1) rememberedValue, startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        f2 = m5607constructorimpl;
        long j3222 = j2;
        Function0<Float> function04222 = dotsLoadingKt$Dot$1;
        Function0<Float> function05222 = dotsLoadingKt$Dot$3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final DotsLoadingState rememberDotsLoading(Composer composer, int i) {
        composer.startReplaceableGroup(-518566713);
        ComposerKt.sourceInformation(composer, "C(rememberDotsLoading)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-518566713, i, -1, "com.ifriend.ui.components.progress.dots.rememberDotsLoading (DotsLoading.kt:55)");
        }
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DotsLoadingState();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DotsLoadingState dotsLoadingState = (DotsLoadingState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return dotsLoadingState;
    }

    /* renamed from: DotsLoadingFade-DDuSU3M  reason: not valid java name */
    public static final void m7061DotsLoadingFadeDDuSU3M(DotsLoadingState state, Modifier modifier, int i, float f, long j, int i2, Easing easing, Composer composer, int i3, int i4) {
        long j2;
        int i5;
        int i6;
        Easing easing2;
        Easing easing3;
        int i7;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer startRestartGroup = composer.startRestartGroup(-328295815);
        ComposerKt.sourceInformation(startRestartGroup, "C(DotsLoadingFade)P(6,5,1,2:c#ui.unit.Dp,0:c#ui.graphics.Color)");
        Modifier.Companion companion = (i4 & 2) != 0 ? Modifier.Companion : modifier;
        int i8 = (i4 & 4) != 0 ? 3 : i;
        float m5607constructorimpl = (i4 & 8) != 0 ? Dp.m5607constructorimpl(4) : f;
        if ((i4 & 16) != 0) {
            i5 = i3 & (-57345);
            j2 = AppTheme.INSTANCE.getColors(startRestartGroup, 6).m7105getPrimary0d7_KjU();
        } else {
            j2 = j;
            i5 = i3;
        }
        if ((i4 & 32) != 0) {
            i5 &= -458753;
            i6 = AppTheme.INSTANCE.getAnimationDuration(startRestartGroup, 6).getLong();
        } else {
            i6 = i2;
        }
        if ((i4 & 64) != 0) {
            i5 &= -3670017;
            easing2 = EasingKt.getLinearEasing();
        } else {
            easing2 = easing;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-328295815, i5, -1, "com.ifriend.ui.components.progress.dots.DotsLoadingFade (DotsLoading.kt:111)");
        }
        state.updateSelectedEasing(easing2);
        state.updateSelectedDotsCount(i8);
        state.m7065updateSelectedDotsSize0680j_4(m5607constructorimpl);
        state.m7064updateSelectedDotsColor8_81llA(j2);
        state.updateSelectedDotsDuration(i6);
        int i9 = (i5 >> 3) & 14;
        startRestartGroup.startReplaceableGroup(693286680);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
        int i10 = i9 >> 3;
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), startRestartGroup, (i10 & 14) | (i10 & 112));
        startRestartGroup.startReplaceableGroup(-1323940314);
        String str = "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh";
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        long j3 = j2;
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
        int i11 = ((((i9 << 3) & 112) << 9) & 7168) | 6;
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
        Updater.m2900setimpl(m2893constructorimpl, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i11 >> 3) & 112));
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682417, "C78@3887L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(2133654985);
        int selectedDotsCount$common_ui_release = state.getSelectedDotsCount$common_ui_release();
        if (1 <= selectedDotsCount$common_ui_release) {
            int i12 = 1;
            while (true) {
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = AnimatableKt.Animatable$default(1.0f, 0.0f, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                Animatable animatable = (Animatable) rememberedValue;
                EffectsKt.LaunchedEffect(state, new DotsLoadingKt$DotsLoadingFade$2$1(state, i12, animatable, 0.2f, null), startRestartGroup, 72);
                Alignment center = Alignment.Companion.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, str);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(Modifier.Companion);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m2893constructorimpl2 = Updater.m2893constructorimpl(startRestartGroup);
                Updater.m2900setimpl(m2893constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (m2893constructorimpl2.getInserting() || !Intrinsics.areEqual(m2893constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m2893constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m2893constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                String str2 = str;
                easing3 = easing2;
                i7 = i6;
                int i13 = i12;
                m7060DotZHrjRmQ(state.m7063getSelectedDotsSizeD9Ej5fM$common_ui_release(), state.m7062getSelectedDotsColor0d7_KjU$common_ui_release(), null, null, new DotsLoadingKt$DotsLoadingFade$2$2$1(animatable), startRestartGroup, 0, 12);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                if (i13 == selectedDotsCount$common_ui_release) {
                    break;
                }
                i12 = i13 + 1;
                str = str2;
                i6 = i7;
                easing2 = easing3;
            }
        } else {
            easing3 = easing2;
            i7 = i6;
        }
        startRestartGroup.endReplaceableGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new DotsLoadingKt$DotsLoadingFade$3(state, companion, i8, m5607constructorimpl, j3, i7, easing3, i3, i4));
    }
}
