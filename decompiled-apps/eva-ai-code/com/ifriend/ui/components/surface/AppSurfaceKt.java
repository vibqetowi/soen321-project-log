package com.ifriend.ui.components.surface;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppSurface.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001af\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"AppSurface", "", "modifier", "Landroidx/compose/ui/Modifier;", "shape", "Landroidx/compose/ui/graphics/Shape;", "color", "Landroidx/compose/ui/graphics/Color;", "contentColor", OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "elevation", "Landroidx/compose/ui/unit/Dp;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "AppSurface-F-jzlyU", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppSurfaceKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012f  */
    /* renamed from: AppSurface-F-jzlyU  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7071AppSurfaceFjzlyU(Modifier modifier, Shape shape, long j, long j2, BorderStroke borderStroke, float f, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        long j3;
        long j4;
        int i4;
        Object obj2;
        int i5;
        int i6;
        float f2;
        Modifier modifier2;
        Modifier modifier3;
        Shape shape2;
        long j5;
        long j6;
        BorderStroke borderStroke2;
        float f3;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-78849747);
        ComposerKt.sourceInformation(startRestartGroup, "C(AppSurface)P(5,6,1:c#ui.graphics.Color,3:c#ui.graphics.Color!1,4:c#ui.unit.Dp)");
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = shape;
            i3 |= startRestartGroup.changed(obj) ? 32 : 16;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i8 = 256;
                        i3 |= i8;
                    }
                } else {
                    j3 = j;
                }
                i8 = 128;
                i3 |= i8;
            } else {
                j3 = j;
            }
            if ((i & 7168) != 0) {
                if ((i2 & 8) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i7 = 2048;
                        i3 |= i7;
                    }
                } else {
                    j4 = j2;
                }
                i7 = 1024;
                i3 |= i7;
            } else {
                j4 = j2;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                obj2 = borderStroke;
                i3 |= startRestartGroup.changed(obj2) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & 458752) == 0) {
                    i3 |= startRestartGroup.changed(f) ? 131072 : 65536;
                }
                if ((i2 & 64) == 0) {
                    if ((i & 3670016) == 0) {
                        i6 = startRestartGroup.changedInstance(content) ? 1048576 : 524288;
                    }
                    if ((i3 & 2995931) == 599186 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i9 == 0 ? Modifier.Companion : modifier;
                            if (i10 != 0) {
                                obj = RectangleShapeKt.getRectangleShape();
                            }
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                                j3 = AppTheme.INSTANCE.getColors(startRestartGroup, 6).m7096getBackground0d7_KjU();
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                j4 = ColorSchemeKt.m1687contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 6) & 14);
                            }
                            if (i4 != 0) {
                                obj2 = null;
                            }
                            if (i5 == 0) {
                                modifier2 = companion;
                                f2 = Dp.m5607constructorimpl(0);
                            } else {
                                f2 = f;
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
                            modifier2 = modifier;
                            f2 = f;
                        }
                        Shape shape3 = obj;
                        long j7 = j3;
                        long j8 = j4;
                        BorderStroke borderStroke3 = obj2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-78849747, i3, -1, "com.ifriend.ui.components.surface.AppSurface (AppSurface.kt:23)");
                        }
                        SurfaceKt.m2067SurfaceT9BRK9s(modifier2, shape3, j7, j8, 0.0f, f2, borderStroke3, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 458752) | ((i3 << 6) & 3670016) | ((i3 << 3) & 29360128), 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        shape2 = shape3;
                        j5 = j7;
                        j6 = j8;
                        borderStroke2 = borderStroke3;
                        f3 = f2;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        shape2 = obj;
                        j5 = j3;
                        j6 = j4;
                        borderStroke2 = obj2;
                        f3 = f;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new AppSurfaceKt$AppSurface$1(modifier3, shape2, j5, j6, borderStroke2, f3, content, i, i2));
                    return;
                }
                i6 = 1572864;
                i3 |= i6;
                if ((i3 & 2995931) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 == 0) {
                }
                if (i10 != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if ((i2 & 8) != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 == 0) {
                }
                Shape shape32 = obj;
                long j72 = j3;
                long j82 = j4;
                BorderStroke borderStroke32 = obj2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SurfaceKt.m2067SurfaceT9BRK9s(modifier2, shape32, j72, j82, 0.0f, f2, borderStroke32, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 458752) | ((i3 << 6) & 3670016) | ((i3 << 3) & 29360128), 16);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier2;
                shape2 = shape32;
                j5 = j72;
                j6 = j82;
                borderStroke2 = borderStroke32;
                f3 = f2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            obj2 = borderStroke;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            if ((i2 & 64) == 0) {
            }
            i3 |= i6;
            if ((i3 & 2995931) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 == 0) {
            }
            if (i10 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 == 0) {
            }
            Shape shape322 = obj;
            long j722 = j3;
            long j822 = j4;
            BorderStroke borderStroke322 = obj2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            SurfaceKt.m2067SurfaceT9BRK9s(modifier2, shape322, j722, j822, 0.0f, f2, borderStroke322, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 458752) | ((i3 << 6) & 3670016) | ((i3 << 3) & 29360128), 16);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier2;
            shape2 = shape322;
            j5 = j722;
            j6 = j822;
            borderStroke2 = borderStroke322;
            f3 = f2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        obj = shape;
        if ((i & 896) != 0) {
        }
        if ((i & 7168) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        obj2 = borderStroke;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        if ((i2 & 64) == 0) {
        }
        i3 |= i6;
        if ((i3 & 2995931) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 == 0) {
        }
        if (i10 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 == 0) {
        }
        Shape shape3222 = obj;
        long j7222 = j3;
        long j8222 = j4;
        BorderStroke borderStroke3222 = obj2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        SurfaceKt.m2067SurfaceT9BRK9s(modifier2, shape3222, j7222, j8222, 0.0f, f2, borderStroke3222, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 458752) | ((i3 << 6) & 3670016) | ((i3 << 3) & 29360128), 16);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier2;
        shape2 = shape3222;
        j5 = j7222;
        j6 = j8222;
        borderStroke2 = borderStroke3222;
        f3 = f2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
