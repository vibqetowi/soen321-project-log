package com.ifriend.ui.components.buttons;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.ui.theme.defaults.AppButtonDefaults;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppTranslucentButton.kt */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ao\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0010\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u00010\rj\u0002`\u000e2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"AppTranslucentButton", "", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "colors", "Landroidx/compose/material3/ButtonColors;", "shape", "Landroidx/compose/ui/graphics/Shape;", "onClick", "Lkotlin/Function0;", "Lcom/ifriend/ui/tools/OnClick;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/BorderStroke;Landroidx/compose/material3/ButtonColors;Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppTranslucentButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AppTranslucentButton(Modifier modifier, boolean z, BorderStroke borderStroke, ButtonColors buttonColors, Shape shape, Function0<Unit> onClick, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        Object obj;
        Object obj2;
        Object obj3;
        int i5;
        int i6;
        boolean z3;
        RoundedCornerShape m1009RoundedCornerShape0680j_4;
        Object obj4;
        Object obj5;
        Composer composer2;
        boolean z4;
        BorderStroke borderStroke2;
        ButtonColors buttonColors2;
        Shape shape2;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(2084552910);
        ComposerKt.sourceInformation(startRestartGroup, "C(AppTranslucentButton)P(4,3!2,6,5)");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            z2 = z;
            i3 |= startRestartGroup.changed(z2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                obj = borderStroke;
                i3 |= startRestartGroup.changed(obj) ? 256 : 128;
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0) {
                        obj2 = buttonColors;
                        if (startRestartGroup.changed(obj2)) {
                            i8 = 2048;
                            i3 |= i8;
                        }
                    } else {
                        obj2 = buttonColors;
                    }
                    i8 = 1024;
                    i3 |= i8;
                } else {
                    obj2 = buttonColors;
                }
                if ((i & 57344) == 0) {
                    if ((i2 & 16) == 0) {
                        obj3 = shape;
                        if (startRestartGroup.changed(obj3)) {
                            i7 = 16384;
                            i3 |= i7;
                        }
                    } else {
                        obj3 = shape;
                    }
                    i7 = 8192;
                    i3 |= i7;
                } else {
                    obj3 = shape;
                }
                if ((i2 & 32) != 0) {
                    i5 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else {
                    if ((458752 & i) == 0) {
                        i5 = startRestartGroup.changedInstance(onClick) ? 131072 : 65536;
                    }
                    if ((i2 & 64) != 0) {
                        if ((i & 3670016) == 0) {
                            i6 = startRestartGroup.changedInstance(content) ? 1048576 : 524288;
                        }
                        if ((2995931 & i3) == 599186 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                boolean z5 = i9 != 0 ? true : z2;
                                if (i4 != 0) {
                                    obj = BorderStrokeKt.m448BorderStrokecXLIe8U(Dp.m5607constructorimpl(4), ColorKt.Color(83886080));
                                }
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                    obj2 = AppButtonDefaults.INSTANCE.buttonTranslucentColors(startRestartGroup, 6);
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    m1009RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1009RoundedCornerShape0680j_4(Dp.m5607constructorimpl(15));
                                    z3 = z5;
                                    obj4 = obj;
                                    obj5 = obj2;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(2084552910, i3, -1, "com.ifriend.ui.components.buttons.AppTranslucentButton (AppTranslucentButton.kt:24)");
                                    }
                                    int i10 = i3 << 3;
                                    composer2 = startRestartGroup;
                                    ButtonKt.Button(onClick, modifier, z3, m1009RoundedCornerShape0680j_4, obj5, null, obj4, null, null, content, startRestartGroup, ((i3 >> 15) & 14) | (i10 & 112) | (i10 & 896) | ((i3 >> 3) & 7168) | (i10 & 57344) | ((i3 << 12) & 3670016) | ((i3 << 9) & 1879048192), 416);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    z4 = z3;
                                    borderStroke2 = obj4;
                                    buttonColors2 = obj5;
                                    shape2 = m1009RoundedCornerShape0680j_4;
                                } else {
                                    z3 = z5;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                z3 = z2;
                            }
                            obj4 = obj;
                            obj5 = obj2;
                            m1009RoundedCornerShape0680j_4 = obj3;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i102 = i3 << 3;
                            composer2 = startRestartGroup;
                            ButtonKt.Button(onClick, modifier, z3, m1009RoundedCornerShape0680j_4, obj5, null, obj4, null, null, content, startRestartGroup, ((i3 >> 15) & 14) | (i102 & 112) | (i102 & 896) | ((i3 >> 3) & 7168) | (i102 & 57344) | ((i3 << 12) & 3670016) | ((i3 << 9) & 1879048192), 416);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z4 = z3;
                            borderStroke2 = obj4;
                            buttonColors2 = obj5;
                            shape2 = m1009RoundedCornerShape0680j_4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            z4 = z2;
                            borderStroke2 = obj;
                            buttonColors2 = obj2;
                            shape2 = obj3;
                            composer2 = startRestartGroup;
                        }
                        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new AppTranslucentButtonKt$AppTranslucentButton$1(modifier, z4, borderStroke2, buttonColors2, shape2, onClick, content, i, i2));
                        return;
                    }
                    i6 = 1572864;
                    i3 |= i6;
                    if ((2995931 & i3) == 599186) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if ((i2 & 8) != 0) {
                    }
                    if ((i2 & 16) != 0) {
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
                if (i9 != 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 8) != 0) {
                }
                if ((i2 & 16) != 0) {
                }
            }
            obj = borderStroke;
            if ((i & 7168) == 0) {
            }
            if ((i & 57344) == 0) {
            }
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
            if (i9 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
        }
        z2 = z;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        obj = borderStroke;
        if ((i & 7168) == 0) {
        }
        if ((i & 57344) == 0) {
        }
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
        if (i9 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
    }
}
