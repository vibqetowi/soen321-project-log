package com.ifriend.ui.components.buttons;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import com.ifriend.ui.components.brush.LinearGradientKt;
import com.ifriend.ui.components.shadow.ColoredShadowKt;
import com.ifriend.ui.components.shadow.ShadowKt;
import com.ifriend.ui.theme.AppColors;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: NeomorphicButtons.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0081\u0001\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\f2\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00050\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u0017H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u001b\u001am\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\u0010\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f2\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00050\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u0017H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"darkButtonInnerShadowColor", "Landroidx/compose/ui/graphics/Color;", "J", "darkButtonShadowColor", "NeomorphicButton", "", "onClick", "Lkotlin/Function0;", "Lcom/ifriend/ui/tools/OnClick;", "modifier", "Landroidx/compose/ui/Modifier;", "borderRadius", "Landroidx/compose/ui/unit/Dp;", "enabled", "", "background", "Landroidx/compose/ui/graphics/Brush;", "innerShadowColor", "shadowOffset", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "NeomorphicButton-rNcnHrQ", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;FZLandroidx/compose/ui/graphics/Brush;JFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "NeomorphicButtonPreview", "(Landroidx/compose/runtime/Composer;I)V", "NeomorphicDarkLightButton", "NeomorphicDarkLightButton-nSlTg7c", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZFFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NeomorphicButtonsKt {
    private static final long darkButtonShadowColor = ColorKt.Color(4294769916L);
    private static final long darkButtonInnerShadowColor = ColorKt.Color(4278190080L);

    /* JADX WARN: Removed duplicated region for block: B:103:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0126  */
    /* renamed from: NeomorphicButton-rNcnHrQ  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7030NeomorphicButtonrNcnHrQ(Function0<Unit> onClick, Modifier modifier, float f, boolean z, Brush brush, long j, float f2, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Modifier.Companion companion;
        float f3;
        int i4;
        boolean z2;
        int i5;
        Object obj;
        int i6;
        int i7;
        float f4;
        int i8;
        Composer composer2;
        long j2;
        Composer composer3;
        boolean changed;
        Object rememberedValue;
        Modifier m7069innerShadowhy0AmR8;
        int currentCompositeKeyHash;
        Composer m2893constructorimpl;
        float f5;
        Modifier modifier2;
        float f6;
        boolean z3;
        Brush brush2;
        long j3;
        ScopeUpdateScope endRestartGroup;
        int i9;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1123837607);
        ComposerKt.sourceInformation(startRestartGroup, "C(NeomorphicButton)P(6,5,1:c#ui.unit.Dp,3!1,4:c#ui.graphics.Color,7:c#ui.unit.Dp)");
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
            companion = modifier;
            i3 |= startRestartGroup.changed(companion) ? 32 : 16;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    f3 = f;
                    if (startRestartGroup.changed(f3)) {
                        i9 = 256;
                        i3 |= i9;
                    }
                } else {
                    f3 = f;
                }
                i9 = 128;
                i3 |= i9;
            } else {
                f3 = f;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    obj = brush;
                    i3 |= startRestartGroup.changed(obj) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & 458752) == 0) {
                        i3 |= startRestartGroup.changed(j) ? 131072 : 65536;
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 1572864;
                        f4 = f2;
                    } else {
                        f4 = f2;
                        if ((i & 3670016) == 0) {
                            i3 |= startRestartGroup.changed(f4) ? 1048576 : 524288;
                        }
                    }
                    if ((i2 & 128) != 0) {
                        if ((29360128 & i) == 0) {
                            i8 = startRestartGroup.changedInstance(content) ? 8388608 : 4194304;
                        }
                        if ((23967451 & i3) == 4793490 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i10 != 0) {
                                    companion = Modifier.Companion;
                                }
                                if ((i2 & 4) != 0) {
                                    i3 &= -897;
                                    f3 = AppTheme.INSTANCE.getDimensions(startRestartGroup, 6).m7175getMediumD9Ej5fM();
                                }
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                if (i5 != 0) {
                                    composer2 = startRestartGroup;
                                    obj = LinearGradientKt.m7018linearGradienteBVf0pg$default(Brush.Companion, CollectionsKt.listOf((Object[]) new Color[]{Color.m3281boximpl(Color.m3290copywmQWz5c$default(Color.Companion.m3317getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3281boximpl(ColorKt.m3336compositeOverOWjLjI(Color.m3290copywmQWz5c$default(Color.Companion.m3328getWhite0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3290copywmQWz5c$default(Color.Companion.m3317getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null)))}), null, 0, 45.0f, false, 22, null);
                                } else {
                                    composer2 = startRestartGroup;
                                }
                                j2 = i6 != 0 ? darkButtonInnerShadowColor : j;
                                if (i7 != 0) {
                                    f4 = Dp.m5607constructorimpl(-2);
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 4) != 0) {
                                    i3 &= -897;
                                }
                                j2 = j;
                                composer2 = startRestartGroup;
                            }
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1123837607, i3, -1, "com.ifriend.ui.components.buttons.NeomorphicButton (NeomorphicButtons.kt:54)");
                            }
                            Dp m5605boximpl = Dp.m5605boximpl(f3);
                            composer3 = composer2;
                            composer3.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composer3, "CC(remember)P(1):Composables.kt#9igjgp");
                            changed = composer3.changed(m5605boximpl);
                            rememberedValue = composer3.rememberedValue();
                            if (!changed || rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = RoundedCornerShapeKt.m1009RoundedCornerShape0680j_4(f3);
                                composer3.updateRememberedValue(rememberedValue);
                            }
                            composer3.endReplaceableGroup();
                            RoundedCornerShape roundedCornerShape = (RoundedCornerShape) rememberedValue;
                            float f7 = (float) 0.5d;
                            m7069innerShadowhy0AmR8 = ShadowKt.m7069innerShadowhy0AmR8(BackgroundKt.background$default(ColoredShadowKt.m7067coloredShadowPRYyx80(companion, darkButtonShadowColor, 0.05f, f3, Dp.m5607constructorimpl(3), f4, f4), obj, roundedCornerShape, 0.0f, 4, null), (r16 & 1) != 0 ? AppColors.Companion.m7142getViolet0d7_KjU() : j2, (r16 & 2) != 0 ? Dp.m5607constructorimpl(0) : f3, (r16 & 4) != 0 ? Dp.m5607constructorimpl(0) : 0.0f, (r16 & 8) != 0 ? Dp.m5607constructorimpl(0) : Dp.m5607constructorimpl(10), (r16 & 16) != 0 ? Dp.m5607constructorimpl(0) : Dp.m5607constructorimpl(f7), (r16 & 32) != 0 ? Dp.m5607constructorimpl(0) : Dp.m5607constructorimpl(f7));
                            Modifier m454clickableXHw0xAI$default = ClickableKt.m454clickableXHw0xAI$default(ClipKt.clip(m7069innerShadowhy0AmR8, roundedCornerShape), z2, null, null, onClick, 6, null);
                            Alignment center = Alignment.Companion.getCenter();
                            composer3.startReplaceableGroup(733328855);
                            ComposerKt.sourceInformation(composer3, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                            composer3.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m454clickableXHw0xAI$default);
                            long j4 = j2;
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            m2893constructorimpl = Updater.m2893constructorimpl(composer3);
                            Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                            if (!m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            ComposerKt.sourceInformationMarkerStart(composer3, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                            content.invoke(BoxScopeInstance.INSTANCE, composer3, Integer.valueOf(((i3 >> 18) & 112) | 6));
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f5 = f4;
                            modifier2 = companion;
                            f6 = f3;
                            z3 = z2;
                            brush2 = obj;
                            j3 = j4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            composer3 = startRestartGroup;
                            f5 = f4;
                            modifier2 = companion;
                            f6 = f3;
                            z3 = z2;
                            brush2 = obj;
                            j3 = j;
                        }
                        endRestartGroup = composer3.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new NeomorphicButtonsKt$NeomorphicButton$2(onClick, modifier2, f6, z3, brush2, j3, f5, content, i, i2));
                        return;
                    }
                    i8 = 12582912;
                    i3 |= i8;
                    if ((23967451 & i3) == 4793490) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Dp m5605boximpl2 = Dp.m5605boximpl(f3);
                    composer3 = composer2;
                    composer3.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composer3, "CC(remember)P(1):Composables.kt#9igjgp");
                    changed = composer3.changed(m5605boximpl2);
                    rememberedValue = composer3.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = RoundedCornerShapeKt.m1009RoundedCornerShape0680j_4(f3);
                    composer3.updateRememberedValue(rememberedValue);
                    composer3.endReplaceableGroup();
                    RoundedCornerShape roundedCornerShape2 = (RoundedCornerShape) rememberedValue;
                    float f72 = (float) 0.5d;
                    m7069innerShadowhy0AmR8 = ShadowKt.m7069innerShadowhy0AmR8(BackgroundKt.background$default(ColoredShadowKt.m7067coloredShadowPRYyx80(companion, darkButtonShadowColor, 0.05f, f3, Dp.m5607constructorimpl(3), f4, f4), obj, roundedCornerShape2, 0.0f, 4, null), (r16 & 1) != 0 ? AppColors.Companion.m7142getViolet0d7_KjU() : j2, (r16 & 2) != 0 ? Dp.m5607constructorimpl(0) : f3, (r16 & 4) != 0 ? Dp.m5607constructorimpl(0) : 0.0f, (r16 & 8) != 0 ? Dp.m5607constructorimpl(0) : Dp.m5607constructorimpl(10), (r16 & 16) != 0 ? Dp.m5607constructorimpl(0) : Dp.m5607constructorimpl(f72), (r16 & 32) != 0 ? Dp.m5607constructorimpl(0) : Dp.m5607constructorimpl(f72));
                    Modifier m454clickableXHw0xAI$default2 = ClickableKt.m454clickableXHw0xAI$default(ClipKt.clip(m7069innerShadowhy0AmR8, roundedCornerShape2), z2, null, null, onClick, 6, null);
                    Alignment center2 = Alignment.Companion.getCenter();
                    composer3.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composer3, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                    MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer3, 6);
                    composer3.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m454clickableXHw0xAI$default2);
                    long j42 = j2;
                    if (!(composer3.getApplier() instanceof Applier)) {
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                    }
                    m2893constructorimpl = Updater.m2893constructorimpl(composer3);
                    Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (!m2893constructorimpl.getInserting()) {
                    }
                    m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                    modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer3)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                    content.invoke(BoxScopeInstance.INSTANCE, composer3, Integer.valueOf(((i3 >> 18) & 112) | 6));
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    f5 = f4;
                    modifier2 = companion;
                    f6 = f3;
                    z3 = z2;
                    brush2 = obj;
                    j3 = j42;
                    endRestartGroup = composer3.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                obj = brush;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                if ((i2 & 128) != 0) {
                }
                i3 |= i8;
                if ((23967451 & i3) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i10 != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Dp m5605boximpl22 = Dp.m5605boximpl(f3);
                composer3 = composer2;
                composer3.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composer3, "CC(remember)P(1):Composables.kt#9igjgp");
                changed = composer3.changed(m5605boximpl22);
                rememberedValue = composer3.rememberedValue();
                if (!changed) {
                }
                rememberedValue = RoundedCornerShapeKt.m1009RoundedCornerShape0680j_4(f3);
                composer3.updateRememberedValue(rememberedValue);
                composer3.endReplaceableGroup();
                RoundedCornerShape roundedCornerShape22 = (RoundedCornerShape) rememberedValue;
                float f722 = (float) 0.5d;
                m7069innerShadowhy0AmR8 = ShadowKt.m7069innerShadowhy0AmR8(BackgroundKt.background$default(ColoredShadowKt.m7067coloredShadowPRYyx80(companion, darkButtonShadowColor, 0.05f, f3, Dp.m5607constructorimpl(3), f4, f4), obj, roundedCornerShape22, 0.0f, 4, null), (r16 & 1) != 0 ? AppColors.Companion.m7142getViolet0d7_KjU() : j2, (r16 & 2) != 0 ? Dp.m5607constructorimpl(0) : f3, (r16 & 4) != 0 ? Dp.m5607constructorimpl(0) : 0.0f, (r16 & 8) != 0 ? Dp.m5607constructorimpl(0) : Dp.m5607constructorimpl(10), (r16 & 16) != 0 ? Dp.m5607constructorimpl(0) : Dp.m5607constructorimpl(f722), (r16 & 32) != 0 ? Dp.m5607constructorimpl(0) : Dp.m5607constructorimpl(f722));
                Modifier m454clickableXHw0xAI$default22 = ClickableKt.m454clickableXHw0xAI$default(ClipKt.clip(m7069innerShadowhy0AmR8, roundedCornerShape22), z2, null, null, onClick, 6, null);
                Alignment center22 = Alignment.Companion.getCenter();
                composer3.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(composer3, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(center22, false, composer3, 6);
                composer3.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composer3.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor22 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(m454clickableXHw0xAI$default22);
                long j422 = j2;
                if (!(composer3.getApplier() instanceof Applier)) {
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                }
                m2893constructorimpl = Updater.m2893constructorimpl(composer3);
                Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy22, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap22, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (!m2893constructorimpl.getInserting()) {
                }
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
                modifierMaterializerOf22.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer3)), composer3, 0);
                composer3.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composer3, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                content.invoke(BoxScopeInstance.INSTANCE, composer3, Integer.valueOf(((i3 >> 18) & 112) | 6));
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer3.endReplaceableGroup();
                composer3.endNode();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                f5 = f4;
                modifier2 = companion;
                f6 = f3;
                z3 = z2;
                brush2 = obj;
                j3 = j422;
                endRestartGroup = composer3.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            obj = brush;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            if ((i2 & 128) != 0) {
            }
            i3 |= i8;
            if ((23967451 & i3) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            Dp m5605boximpl222 = Dp.m5605boximpl(f3);
            composer3 = composer2;
            composer3.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer3, "CC(remember)P(1):Composables.kt#9igjgp");
            changed = composer3.changed(m5605boximpl222);
            rememberedValue = composer3.rememberedValue();
            if (!changed) {
            }
            rememberedValue = RoundedCornerShapeKt.m1009RoundedCornerShape0680j_4(f3);
            composer3.updateRememberedValue(rememberedValue);
            composer3.endReplaceableGroup();
            RoundedCornerShape roundedCornerShape222 = (RoundedCornerShape) rememberedValue;
            float f7222 = (float) 0.5d;
            m7069innerShadowhy0AmR8 = ShadowKt.m7069innerShadowhy0AmR8(BackgroundKt.background$default(ColoredShadowKt.m7067coloredShadowPRYyx80(companion, darkButtonShadowColor, 0.05f, f3, Dp.m5607constructorimpl(3), f4, f4), obj, roundedCornerShape222, 0.0f, 4, null), (r16 & 1) != 0 ? AppColors.Companion.m7142getViolet0d7_KjU() : j2, (r16 & 2) != 0 ? Dp.m5607constructorimpl(0) : f3, (r16 & 4) != 0 ? Dp.m5607constructorimpl(0) : 0.0f, (r16 & 8) != 0 ? Dp.m5607constructorimpl(0) : Dp.m5607constructorimpl(10), (r16 & 16) != 0 ? Dp.m5607constructorimpl(0) : Dp.m5607constructorimpl(f7222), (r16 & 32) != 0 ? Dp.m5607constructorimpl(0) : Dp.m5607constructorimpl(f7222));
            Modifier m454clickableXHw0xAI$default222 = ClickableKt.m454clickableXHw0xAI$default(ClipKt.clip(m7069innerShadowhy0AmR8, roundedCornerShape222), z2, null, null, onClick, 6, null);
            Alignment center222 = Alignment.Companion.getCenter();
            composer3.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composer3, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy222 = BoxKt.rememberBoxMeasurePolicy(center222, false, composer3, 6);
            composer3.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
            CompositionLocalMap currentCompositionLocalMap222 = composer3.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor222 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf222 = LayoutKt.modifierMaterializerOf(m454clickableXHw0xAI$default222);
            long j4222 = j2;
            if (!(composer3.getApplier() instanceof Applier)) {
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
            }
            m2893constructorimpl = Updater.m2893constructorimpl(composer3);
            Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy222, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap222, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (!m2893constructorimpl.getInserting()) {
            }
            m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
            modifierMaterializerOf222.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer3)), composer3, 0);
            composer3.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer3, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
            content.invoke(BoxScopeInstance.INSTANCE, composer3, Integer.valueOf(((i3 >> 18) & 112) | 6));
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endReplaceableGroup();
            composer3.endNode();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            f5 = f4;
            modifier2 = companion;
            f6 = f3;
            z3 = z2;
            brush2 = obj;
            j3 = j4222;
            endRestartGroup = composer3.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        companion = modifier;
        if ((i & 896) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        obj = brush;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        if ((i2 & 128) != 0) {
        }
        i3 |= i8;
        if ((23967451 & i3) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        composer2.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        Dp m5605boximpl2222 = Dp.m5605boximpl(f3);
        composer3 = composer2;
        composer3.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer3, "CC(remember)P(1):Composables.kt#9igjgp");
        changed = composer3.changed(m5605boximpl2222);
        rememberedValue = composer3.rememberedValue();
        if (!changed) {
        }
        rememberedValue = RoundedCornerShapeKt.m1009RoundedCornerShape0680j_4(f3);
        composer3.updateRememberedValue(rememberedValue);
        composer3.endReplaceableGroup();
        RoundedCornerShape roundedCornerShape2222 = (RoundedCornerShape) rememberedValue;
        float f72222 = (float) 0.5d;
        m7069innerShadowhy0AmR8 = ShadowKt.m7069innerShadowhy0AmR8(BackgroundKt.background$default(ColoredShadowKt.m7067coloredShadowPRYyx80(companion, darkButtonShadowColor, 0.05f, f3, Dp.m5607constructorimpl(3), f4, f4), obj, roundedCornerShape2222, 0.0f, 4, null), (r16 & 1) != 0 ? AppColors.Companion.m7142getViolet0d7_KjU() : j2, (r16 & 2) != 0 ? Dp.m5607constructorimpl(0) : f3, (r16 & 4) != 0 ? Dp.m5607constructorimpl(0) : 0.0f, (r16 & 8) != 0 ? Dp.m5607constructorimpl(0) : Dp.m5607constructorimpl(10), (r16 & 16) != 0 ? Dp.m5607constructorimpl(0) : Dp.m5607constructorimpl(f72222), (r16 & 32) != 0 ? Dp.m5607constructorimpl(0) : Dp.m5607constructorimpl(f72222));
        Modifier m454clickableXHw0xAI$default2222 = ClickableKt.m454clickableXHw0xAI$default(ClipKt.clip(m7069innerShadowhy0AmR8, roundedCornerShape2222), z2, null, null, onClick, 6, null);
        Alignment center2222 = Alignment.Companion.getCenter();
        composer3.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(composer3, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
        MeasurePolicy rememberBoxMeasurePolicy2222 = BoxKt.rememberBoxMeasurePolicy(center2222, false, composer3, 6);
        composer3.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
        CompositionLocalMap currentCompositionLocalMap2222 = composer3.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2222 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2222 = LayoutKt.modifierMaterializerOf(m454clickableXHw0xAI$default2222);
        long j42222 = j2;
        if (!(composer3.getApplier() instanceof Applier)) {
        }
        composer3.startReusableNode();
        if (composer3.getInserting()) {
        }
        m2893constructorimpl = Updater.m2893constructorimpl(composer3);
        Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy2222, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap2222, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (!m2893constructorimpl.getInserting()) {
        }
        m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
        modifierMaterializerOf2222.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer3)), composer3, 0);
        composer3.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(composer3, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
        content.invoke(BoxScopeInstance.INSTANCE, composer3, Integer.valueOf(((i3 >> 18) & 112) | 6));
        ComposerKt.sourceInformationMarkerEnd(composer3);
        composer3.endReplaceableGroup();
        composer3.endNode();
        composer3.endReplaceableGroup();
        composer3.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        f5 = f4;
        modifier2 = companion;
        f6 = f3;
        z3 = z2;
        brush2 = obj;
        j3 = j42222;
        endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01df  */
    /* renamed from: NeomorphicDarkLightButton-nSlTg7c  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7031NeomorphicDarkLightButtonnSlTg7c(Modifier modifier, Function0<Unit> onClick, boolean z, float f, float f2, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        Object obj;
        int i3;
        boolean z2;
        float f3;
        int i4;
        float f4;
        int i5;
        Object obj2;
        float m5607constructorimpl;
        boolean z3;
        float f5;
        Modifier modifier2;
        boolean z4;
        float f6;
        float f7;
        int i6;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-2121531852);
        ComposerKt.sourceInformation(startRestartGroup, "C(NeomorphicDarkLightButton)P(3,4,2,0:c#ui.unit.Dp,5:c#ui.unit.Dp)");
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            obj = modifier;
        } else if ((i & 14) == 0) {
            obj = modifier;
            i3 = (startRestartGroup.changed(obj) ? 4 : 2) | i;
        } else {
            obj = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            z2 = z;
            i3 |= startRestartGroup.changed(z2) ? 256 : 128;
            if ((i & 7168) != 0) {
                if ((i2 & 8) == 0) {
                    f3 = f;
                    if (startRestartGroup.changed(f3)) {
                        i6 = 2048;
                        i3 |= i6;
                    }
                } else {
                    f3 = f;
                }
                i6 = 1024;
                i3 |= i6;
            } else {
                f3 = f;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                f4 = f2;
                i3 |= startRestartGroup.changed(f4) ? 16384 : 8192;
                if ((i2 & 32) == 0) {
                    if ((458752 & i) == 0) {
                        i5 = startRestartGroup.changedInstance(content) ? 131072 : 65536;
                    }
                    if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i7 == 0 ? Modifier.Companion : obj;
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                f3 = AppTheme.INSTANCE.getDimensions(startRestartGroup, 6).m7175getMediumD9Ej5fM();
                            }
                            if (i4 == 0) {
                                obj2 = companion;
                                m5607constructorimpl = Dp.m5607constructorimpl(-4);
                                z3 = z2;
                                f5 = f3;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2121531852, i3, -1, "com.ifriend.ui.components.buttons.NeomorphicDarkLightButton (NeomorphicButtons.kt:96)");
                                }
                                int i9 = i3 >> 3;
                                int i10 = i3 << 3;
                                int i11 = i3 << 6;
                                m7030NeomorphicButtonrNcnHrQ(onClick, obj2, f5, z3, LinearGradientKt.m7018linearGradienteBVf0pg$default(Brush.Companion, CollectionsKt.listOf((Object[]) new Color[]{Color.m3281boximpl(ColorKt.m3336compositeOverOWjLjI(Color.m3290copywmQWz5c$default(Color.Companion.m3328getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3290copywmQWz5c$default(Color.Companion.m3317getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null))), Color.m3281boximpl(Color.m3290copywmQWz5c$default(Color.Companion.m3317getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null))}), null, 0, 45.0f, false, 22, null), Color.m3290copywmQWz5c$default(Color.Companion.m3317getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), m5607constructorimpl, content, startRestartGroup, (i9 & 896) | (i9 & 14) | 221184 | (i10 & 112) | (i10 & 7168) | (3670016 & i11) | (i11 & 29360128), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier2 = obj2;
                                z4 = z3;
                                f6 = f5;
                                f7 = m5607constructorimpl;
                            } else {
                                obj2 = companion;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            obj2 = obj;
                        }
                        z3 = z2;
                        f5 = f3;
                        m5607constructorimpl = f4;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i92 = i3 >> 3;
                        int i102 = i3 << 3;
                        int i112 = i3 << 6;
                        m7030NeomorphicButtonrNcnHrQ(onClick, obj2, f5, z3, LinearGradientKt.m7018linearGradienteBVf0pg$default(Brush.Companion, CollectionsKt.listOf((Object[]) new Color[]{Color.m3281boximpl(ColorKt.m3336compositeOverOWjLjI(Color.m3290copywmQWz5c$default(Color.Companion.m3328getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3290copywmQWz5c$default(Color.Companion.m3317getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null))), Color.m3281boximpl(Color.m3290copywmQWz5c$default(Color.Companion.m3317getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null))}), null, 0, 45.0f, false, 22, null), Color.m3290copywmQWz5c$default(Color.Companion.m3317getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), m5607constructorimpl, content, startRestartGroup, (i92 & 896) | (i92 & 14) | 221184 | (i102 & 112) | (i102 & 7168) | (3670016 & i112) | (i112 & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = obj2;
                        z4 = z3;
                        f6 = f5;
                        f7 = m5607constructorimpl;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = obj;
                        z4 = z2;
                        f6 = f3;
                        f7 = f4;
                    }
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    endRestartGroup.updateScope(new NeomorphicButtonsKt$NeomorphicDarkLightButton$1(modifier2, onClick, z4, f6, f7, content, i, i2));
                    return;
                }
                i5 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i3 |= i5;
                if ((374491 & i3) == 74898) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i7 == 0) {
                }
                if (i8 != 0) {
                }
                if ((i2 & 8) != 0) {
                }
                if (i4 == 0) {
                }
            }
            f4 = f2;
            if ((i2 & 32) == 0) {
            }
            i3 |= i5;
            if ((374491 & i3) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i7 == 0) {
            }
            if (i8 != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if (i4 == 0) {
            }
        }
        z2 = z;
        if ((i & 7168) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        f4 = f2;
        if ((i2 & 32) == 0) {
        }
        i3 |= i5;
        if ((374491 & i3) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i7 == 0) {
        }
        if (i8 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if (i4 == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NeomorphicButtonPreview(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(1726920580);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1726920580, i, -1, "com.ifriend.ui.components.buttons.NeomorphicButtonPreview (NeomorphicButtons.kt:116)");
            }
            SurfaceKt.m2067SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, Color.Companion.m3317getBlack0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableSingletons$NeomorphicButtonsKt.INSTANCE.m7029getLambda2$common_ui_release(), startRestartGroup, 12583302, 122);
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
        endRestartGroup.updateScope(new NeomorphicButtonsKt$NeomorphicButtonPreview$1(i));
    }
}
