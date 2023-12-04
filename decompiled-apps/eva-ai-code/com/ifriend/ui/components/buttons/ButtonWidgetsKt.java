package com.ifriend.ui.components.buttons;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.ui.theme.AppColors;
import com.ifriend.ui.theme.AppTheme;
import com.ifriend.ui.theme.AppThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ButtonWidgets.kt */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a\u008b\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0010\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u00010\rj\u0002`\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\t2\u001c\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0018\u001aE\u0010\u0019\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006!"}, d2 = {"AppShadowButtonWithContent", "", "modifier", "Landroidx/compose/ui/Modifier;", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "Landroidx/compose/ui/unit/Dp;", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "radius", "color", "Landroidx/compose/ui/graphics/Color;", "enabled", "", "onClick", "Lkotlin/Function0;", "Lcom/ifriend/ui/tools/OnClick;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "AppShadowButtonWithContent-BHesuOE", "(Landroidx/compose/ui/Modifier;FFFJZLkotlin/jvm/functions/Function0;JLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ButtonPreview", "(Landroidx/compose/runtime/Composer;I)V", "innerButtonGradient", "alpha", "", "shadowRadius", "offsetY", "offsetX", "innerButtonGradient-TIErZ5U", "(Landroidx/compose/ui/Modifier;JFFFF)Landroidx/compose/ui/Modifier;", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ButtonWidgetsKt {
    public static final void ButtonPreview(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(834413736);
        ComposerKt.sourceInformation(startRestartGroup, "C(ButtonPreview)");
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(834413736, i, -1, "com.ifriend.ui.components.buttons.ButtonPreview (ButtonWidgets.kt:31)");
            }
            AppThemeKt.AppTheme(null, null, null, null, ComposableSingletons$ButtonWidgetsKt.INSTANCE.m7027getLambda2$common_ui_release(), startRestartGroup, 24576, 15);
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
        endRestartGroup.updateScope(new ButtonWidgetsKt$ButtonPreview$1(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012a  */
    /* renamed from: AppShadowButtonWithContent-BHesuOE  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7022AppShadowButtonWithContentBHesuOE(Modifier modifier, float f, float f2, float f3, long j, boolean z, Function0<Unit> onClick, long j2, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        float f4;
        float f5;
        float f6;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        float f7;
        float f8;
        long j3;
        Modifier modifier2;
        float f9;
        long j4;
        boolean z2;
        float f10;
        int i9;
        float f11;
        Composer composer2;
        float f12;
        long j5;
        boolean z3;
        long j6;
        float f13;
        float f14;
        Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1065578174);
        ComposerKt.sourceInformation(startRestartGroup, "C(AppShadowButtonWithContent)P(5,4:c#ui.unit.Dp,8:c#ui.unit.Dp,7:c#ui.unit.Dp,1:c#ui.graphics.Color,3,6,0:c#ui.graphics.Color)");
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                f4 = f;
                if (startRestartGroup.changed(f4)) {
                    i11 = 32;
                    i3 |= i11;
                }
            } else {
                f4 = f;
            }
            i11 = 16;
            i3 |= i11;
        } else {
            f4 = f;
        }
        int i13 = i2 & 4;
        if (i13 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            f5 = f2;
            i3 |= startRestartGroup.changed(f5) ? 256 : 128;
            if ((i & 7168) != 0) {
                if ((i2 & 8) == 0) {
                    f6 = f3;
                    if (startRestartGroup.changed(f6)) {
                        i10 = 2048;
                        i3 |= i10;
                    }
                } else {
                    f6 = f3;
                }
                i10 = 1024;
                i3 |= i10;
            } else {
                f6 = f3;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                i3 |= startRestartGroup.changed(j) ? 16384 : 8192;
            }
            i5 = i2 & 32;
            if (i5 == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & 458752) == 0) {
                i3 |= startRestartGroup.changed(z) ? 131072 : 65536;
            }
            if ((i2 & 64) == 0) {
                i6 = 1572864;
            } else {
                if ((i & 3670016) == 0) {
                    i6 = startRestartGroup.changedInstance(onClick) ? 1048576 : 524288;
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    i3 |= startRestartGroup.changed(j2) ? 8388608 : 4194304;
                }
                if ((i2 & 256) == 0) {
                    if ((234881024 & i) == 0) {
                        i8 = startRestartGroup.changedInstance(content) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((191739611 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i12 == 0 ? Modifier.Companion : modifier;
                            if ((i2 & 2) == 0) {
                                f7 = AppTheme.INSTANCE.getDimensions(startRestartGroup, 6).m7164getButtonHeightD9Ej5fM();
                                i3 &= -113;
                            } else {
                                f7 = f4;
                            }
                            float m5627getUnspecifiedD9Ej5fM = i13 == 0 ? Dp.Companion.m5627getUnspecifiedD9Ej5fM() : f5;
                            if ((i2 & 8) == 0) {
                                f8 = Dp.m5607constructorimpl(f7 / 2);
                                i3 &= -7169;
                            } else {
                                f8 = f6;
                            }
                            long m7142getViolet0d7_KjU = i4 == 0 ? AppColors.Companion.m7142getViolet0d7_KjU() : j;
                            boolean z4 = i5 == 0 ? true : z;
                            if (i7 == 0) {
                                modifier2 = companion;
                                f9 = f8;
                                j4 = m7142getViolet0d7_KjU;
                                z2 = z4;
                                j3 = Color.Companion.m3326getTransparent0d7_KjU();
                            } else {
                                j3 = j2;
                                modifier2 = companion;
                                f9 = f8;
                                j4 = m7142getViolet0d7_KjU;
                                z2 = z4;
                            }
                            f10 = f7;
                            i9 = i3;
                            f11 = m5627getUnspecifiedD9Ej5fM;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            modifier2 = modifier;
                            j4 = j;
                            z2 = z;
                            j3 = j2;
                            f10 = f4;
                            f9 = f6;
                            f11 = f5;
                            i9 = i3;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1065578174, i9, -1, "com.ifriend.ui.components.buttons.AppShadowButtonWithContent (ButtonWidgets.kt:60)");
                        }
                        int i14 = i9;
                        float f15 = f11;
                        float f16 = f10;
                        Modifier modifier4 = modifier2;
                        composer2 = startRestartGroup;
                        SurfaceKt.m2070Surfaceo_FOJdg(onClick, SizeKt.m797sizeVpY3zN4(modifier2, f11, f10), z2, RoundedCornerShapeKt.m1009RoundedCornerShape0680j_4(f9), Color.Companion.m3326getTransparent0d7_KjU(), 0L, 0.0f, 0.0f, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1208755593, true, new ButtonWidgetsKt$AppShadowButtonWithContent$1(j3, f9, j4, content, i14)), startRestartGroup, ((i14 >> 18) & 14) | 24576 | ((i14 >> 9) & 896), 6, 992);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f12 = f9;
                        j5 = j4;
                        z3 = z2;
                        j6 = j3;
                        f13 = f15;
                        f14 = f16;
                        modifier3 = modifier4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        j5 = j;
                        f14 = f4;
                        f13 = f5;
                        f12 = f6;
                        composer2 = startRestartGroup;
                        z3 = z;
                        j6 = j2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new ButtonWidgetsKt$AppShadowButtonWithContent$2(modifier3, f14, f13, f12, j5, z3, onClick, j6, content, i, i2));
                    return;
                }
                i8 = 100663296;
                i3 |= i8;
                if ((191739611 & i3) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i12 == 0) {
                }
                if ((i2 & 2) == 0) {
                }
                if (i13 == 0) {
                }
                if ((i2 & 8) == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i7 == 0) {
                }
                f10 = f7;
                i9 = i3;
                f11 = m5627getUnspecifiedD9Ej5fM;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i142 = i9;
                float f152 = f11;
                float f162 = f10;
                Modifier modifier42 = modifier2;
                composer2 = startRestartGroup;
                SurfaceKt.m2070Surfaceo_FOJdg(onClick, SizeKt.m797sizeVpY3zN4(modifier2, f11, f10), z2, RoundedCornerShapeKt.m1009RoundedCornerShape0680j_4(f9), Color.Companion.m3326getTransparent0d7_KjU(), 0L, 0.0f, 0.0f, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1208755593, true, new ButtonWidgetsKt$AppShadowButtonWithContent$1(j3, f9, j4, content, i142)), startRestartGroup, ((i142 >> 18) & 14) | 24576 | ((i142 >> 9) & 896), 6, 992);
                if (ComposerKt.isTraceInProgress()) {
                }
                f12 = f9;
                j5 = j4;
                z3 = z2;
                j6 = j3;
                f13 = f152;
                f14 = f162;
                modifier3 = modifier42;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i3 |= i6;
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            if ((i2 & 256) == 0) {
            }
            i3 |= i8;
            if ((191739611 & i3) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i12 == 0) {
            }
            if ((i2 & 2) == 0) {
            }
            if (i13 == 0) {
            }
            if ((i2 & 8) == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i7 == 0) {
            }
            f10 = f7;
            i9 = i3;
            f11 = m5627getUnspecifiedD9Ej5fM;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i1422 = i9;
            float f1522 = f11;
            float f1622 = f10;
            Modifier modifier422 = modifier2;
            composer2 = startRestartGroup;
            SurfaceKt.m2070Surfaceo_FOJdg(onClick, SizeKt.m797sizeVpY3zN4(modifier2, f11, f10), z2, RoundedCornerShapeKt.m1009RoundedCornerShape0680j_4(f9), Color.Companion.m3326getTransparent0d7_KjU(), 0L, 0.0f, 0.0f, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1208755593, true, new ButtonWidgetsKt$AppShadowButtonWithContent$1(j3, f9, j4, content, i1422)), startRestartGroup, ((i1422 >> 18) & 14) | 24576 | ((i1422 >> 9) & 896), 6, 992);
            if (ComposerKt.isTraceInProgress()) {
            }
            f12 = f9;
            j5 = j4;
            z3 = z2;
            j6 = j3;
            f13 = f1522;
            f14 = f1622;
            modifier3 = modifier422;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        f5 = f2;
        if ((i & 7168) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        i3 |= i6;
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        if ((i2 & 256) == 0) {
        }
        i3 |= i8;
        if ((191739611 & i3) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i12 == 0) {
        }
        if ((i2 & 2) == 0) {
        }
        if (i13 == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i7 == 0) {
        }
        f10 = f7;
        i9 = i3;
        f11 = m5627getUnspecifiedD9Ej5fM;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i14222 = i9;
        float f15222 = f11;
        float f16222 = f10;
        Modifier modifier4222 = modifier2;
        composer2 = startRestartGroup;
        SurfaceKt.m2070Surfaceo_FOJdg(onClick, SizeKt.m797sizeVpY3zN4(modifier2, f11, f10), z2, RoundedCornerShapeKt.m1009RoundedCornerShape0680j_4(f9), Color.Companion.m3326getTransparent0d7_KjU(), 0L, 0.0f, 0.0f, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1208755593, true, new ButtonWidgetsKt$AppShadowButtonWithContent$1(j3, f9, j4, content, i14222)), startRestartGroup, ((i14222 >> 18) & 14) | 24576 | ((i14222 >> 9) & 896), 6, 992);
        if (ComposerKt.isTraceInProgress()) {
        }
        f12 = f9;
        j5 = j4;
        z3 = z2;
        j6 = j3;
        f13 = f15222;
        f14 = f16222;
        modifier3 = modifier4222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: innerButtonGradient-TIErZ5U  reason: not valid java name */
    public static final Modifier m7023innerButtonGradientTIErZ5U(Modifier innerButtonGradient, long j, float f, float f2, float f3, float f4) {
        Intrinsics.checkNotNullParameter(innerButtonGradient, "$this$innerButtonGradient");
        return DrawModifierKt.drawBehind(innerButtonGradient, new ButtonWidgetsKt$innerButtonGradient$1(f3, ColorKt.m3345toArgb8_81llA(Color.m3290copywmQWz5c$default(j, 0.0f, 0.0f, 0.0f, 0.0f, 14, null)), f2, f4, ColorKt.m3345toArgb8_81llA(Color.m3290copywmQWz5c$default(j, f, 0.0f, 0.0f, 0.0f, 14, null))));
    }

    /* renamed from: innerButtonGradient-TIErZ5U$default  reason: not valid java name */
    public static /* synthetic */ Modifier m7024innerButtonGradientTIErZ5U$default(Modifier modifier, long j, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.2f;
        }
        float f5 = f;
        if ((i & 8) != 0) {
            f3 = Dp.m5607constructorimpl(0);
        }
        float f6 = f3;
        if ((i & 16) != 0) {
            f4 = Dp.m5607constructorimpl(0);
        }
        return m7023innerButtonGradientTIErZ5U(modifier, j, f5, f2, f6, f4);
    }
}
