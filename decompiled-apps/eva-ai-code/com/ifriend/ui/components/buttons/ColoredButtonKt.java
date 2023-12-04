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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ColoredButton.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aw\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u00010\u000bj\u0002`\f2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"ColoredButton", "", "modifier", "Landroidx/compose/ui/Modifier;", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "Landroidx/compose/ui/unit/Dp;", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "radius", "enabled", "", "onClick", "Lkotlin/Function0;", "Lcom/ifriend/ui/tools/OnClick;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "ColoredButton-XiNizjQ", "(Landroidx/compose/ui/Modifier;FFFZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ColoredButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0129  */
    /* renamed from: ColoredButton-XiNizjQ  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7025ColoredButtonXiNizjQ(Modifier modifier, float f, float f2, float f3, boolean z, Function0<Unit> onClick, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        Object obj;
        int i3;
        float f4;
        float f5;
        float f6;
        int i4;
        boolean z2;
        int i5;
        int i6;
        float f7;
        float f8;
        int i7;
        float f9;
        boolean z3;
        Modifier modifier2;
        Composer composer2;
        float f10;
        boolean z4;
        float f11;
        float f12;
        Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-593650563);
        ComposerKt.sourceInformation(startRestartGroup, "C(ColoredButton)P(3,2:c#ui.unit.Dp,6:c#ui.unit.Dp,5:c#ui.unit.Dp,1,4)");
        int i10 = i2 & 1;
        if (i10 != 0) {
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
                f4 = f;
                if (startRestartGroup.changed(f4)) {
                    i9 = 32;
                    i3 |= i9;
                }
            } else {
                f4 = f;
            }
            i9 = 16;
            i3 |= i9;
        } else {
            f4 = f;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            f5 = f2;
            i3 |= startRestartGroup.changed(f5) ? 256 : 128;
            if ((i & 7168) != 0) {
                if ((i2 & 8) == 0) {
                    f6 = f3;
                    if (startRestartGroup.changed(f6)) {
                        i8 = 2048;
                        i3 |= i8;
                    }
                } else {
                    f6 = f3;
                }
                i8 = 1024;
                i3 |= i8;
            } else {
                f6 = f3;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                if ((i2 & 32) != 0) {
                    i5 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else {
                    if ((458752 & i) == 0) {
                        i5 = startRestartGroup.changedInstance(onClick) ? 131072 : 65536;
                    }
                    if ((i2 & 64) != 0) {
                        if ((3670016 & i) == 0) {
                            i6 = startRestartGroup.changedInstance(content) ? 1048576 : 524288;
                        }
                        if ((2995931 & i3) == 599186 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i10 != 0 ? Modifier.Companion : obj;
                                if ((i2 & 2) != 0) {
                                    i3 &= -113;
                                    f4 = AppTheme.INSTANCE.getDimensions(startRestartGroup, 6).m7164getButtonHeightD9Ej5fM();
                                }
                                if (i11 != 0) {
                                    f5 = Dp.Companion.m5627getUnspecifiedD9Ej5fM();
                                }
                                if ((i2 & 8) != 0) {
                                    f7 = Dp.m5607constructorimpl(f4 / 2);
                                    i3 &= -7169;
                                } else {
                                    f7 = f3;
                                }
                                if (i4 != 0) {
                                    modifier2 = companion;
                                    f8 = f7;
                                    i7 = i3;
                                    f9 = f4;
                                    z3 = true;
                                } else {
                                    f8 = f7;
                                    i7 = i3;
                                    f9 = f4;
                                    z3 = z2;
                                    modifier2 = companion;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 2) != 0) {
                                    i3 &= -113;
                                }
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                f8 = f3;
                                i7 = i3;
                                f9 = f4;
                                z3 = z2;
                                modifier2 = obj;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-593650563, i7, -1, "com.ifriend.ui.components.buttons.ColoredButton (ColoredButton.kt:28)");
                            }
                            int i12 = i7;
                            float f13 = f5;
                            float f14 = f9;
                            Modifier modifier4 = modifier2;
                            composer2 = startRestartGroup;
                            SurfaceKt.m2070Surfaceo_FOJdg(onClick, SizeKt.m797sizeVpY3zN4(modifier2, f5, f9), z3, RoundedCornerShapeKt.m1009RoundedCornerShape0680j_4(f8), Color.Companion.m3326getTransparent0d7_KjU(), 0L, 0.0f, 0.0f, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 2136166226, true, new ColoredButtonKt$ColoredButton$1(content, i12)), composer2, ((i12 >> 15) & 14) | 24576 | ((i12 >> 6) & 896), 6, 992);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f10 = f8;
                            z4 = z3;
                            f11 = f13;
                            f12 = f14;
                            modifier3 = modifier4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = obj;
                            f12 = f4;
                            f11 = f5;
                            f10 = f6;
                            z4 = z2;
                            composer2 = startRestartGroup;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new ColoredButtonKt$ColoredButton$2(modifier3, f12, f11, f10, z4, onClick, content, i, i2));
                        return;
                    }
                    i6 = 1572864;
                    i3 |= i6;
                    if ((2995931 & i3) == 599186) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if ((i2 & 2) != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if ((i2 & 8) != 0) {
                    }
                    if (i4 != 0) {
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i122 = i7;
                    float f132 = f5;
                    float f142 = f9;
                    Modifier modifier42 = modifier2;
                    composer2 = startRestartGroup;
                    SurfaceKt.m2070Surfaceo_FOJdg(onClick, SizeKt.m797sizeVpY3zN4(modifier2, f5, f9), z3, RoundedCornerShapeKt.m1009RoundedCornerShape0680j_4(f8), Color.Companion.m3326getTransparent0d7_KjU(), 0L, 0.0f, 0.0f, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 2136166226, true, new ColoredButtonKt$ColoredButton$1(content, i122)), composer2, ((i122 >> 15) & 14) | 24576 | ((i122 >> 6) & 896), 6, 992);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    f10 = f8;
                    z4 = z3;
                    f11 = f132;
                    f12 = f142;
                    modifier3 = modifier42;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i3 |= i5;
                if ((i2 & 64) != 0) {
                }
                i3 |= i6;
                if ((2995931 & i3) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i10 != 0) {
                }
                if ((i2 & 2) != 0) {
                }
                if (i11 != 0) {
                }
                if ((i2 & 8) != 0) {
                }
                if (i4 != 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i1222 = i7;
                float f1322 = f5;
                float f1422 = f9;
                Modifier modifier422 = modifier2;
                composer2 = startRestartGroup;
                SurfaceKt.m2070Surfaceo_FOJdg(onClick, SizeKt.m797sizeVpY3zN4(modifier2, f5, f9), z3, RoundedCornerShapeKt.m1009RoundedCornerShape0680j_4(f8), Color.Companion.m3326getTransparent0d7_KjU(), 0L, 0.0f, 0.0f, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 2136166226, true, new ColoredButtonKt$ColoredButton$1(content, i1222)), composer2, ((i1222 >> 15) & 14) | 24576 | ((i1222 >> 6) & 896), 6, 992);
                if (ComposerKt.isTraceInProgress()) {
                }
                f10 = f8;
                z4 = z3;
                f11 = f1322;
                f12 = f1422;
                modifier3 = modifier422;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i2 & 32) != 0) {
            }
            i3 |= i5;
            if ((i2 & 64) != 0) {
            }
            i3 |= i6;
            if ((2995931 & i3) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 != 0) {
            }
            if ((i2 & 2) != 0) {
            }
            if (i11 != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if (i4 != 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i12222 = i7;
            float f13222 = f5;
            float f14222 = f9;
            Modifier modifier4222 = modifier2;
            composer2 = startRestartGroup;
            SurfaceKt.m2070Surfaceo_FOJdg(onClick, SizeKt.m797sizeVpY3zN4(modifier2, f5, f9), z3, RoundedCornerShapeKt.m1009RoundedCornerShape0680j_4(f8), Color.Companion.m3326getTransparent0d7_KjU(), 0L, 0.0f, 0.0f, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 2136166226, true, new ColoredButtonKt$ColoredButton$1(content, i12222)), composer2, ((i12222 >> 15) & 14) | 24576 | ((i12222 >> 6) & 896), 6, 992);
            if (ComposerKt.isTraceInProgress()) {
            }
            f10 = f8;
            z4 = z3;
            f11 = f13222;
            f12 = f14222;
            modifier3 = modifier4222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        f5 = f2;
        if ((i & 7168) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i2 & 32) != 0) {
        }
        i3 |= i5;
        if ((i2 & 64) != 0) {
        }
        i3 |= i6;
        if ((2995931 & i3) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if (i11 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if (i4 != 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i122222 = i7;
        float f132222 = f5;
        float f142222 = f9;
        Modifier modifier42222 = modifier2;
        composer2 = startRestartGroup;
        SurfaceKt.m2070Surfaceo_FOJdg(onClick, SizeKt.m797sizeVpY3zN4(modifier2, f5, f9), z3, RoundedCornerShapeKt.m1009RoundedCornerShape0680j_4(f8), Color.Companion.m3326getTransparent0d7_KjU(), 0L, 0.0f, 0.0f, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 2136166226, true, new ColoredButtonKt$ColoredButton$1(content, i122222)), composer2, ((i122222 >> 15) & 14) | 24576 | ((i122222 >> 6) & 896), 6, 992);
        if (ComposerKt.isTraceInProgress()) {
        }
        f10 = f8;
        z4 = z3;
        f11 = f132222;
        f12 = f142222;
        modifier3 = modifier42222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
