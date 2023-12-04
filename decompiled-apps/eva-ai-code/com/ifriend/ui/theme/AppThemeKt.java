package com.ifriend.ui.theme;

import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material.ripple.RippleThemeKt;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppTheme.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aH\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\fH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"AppTheme", "", "colors", "Lcom/ifriend/ui/theme/AppColors;", "typography", "Lcom/ifriend/ui/theme/AppTypography;", "dimensions", "Lcom/ifriend/ui/theme/AppDimensions;", "selectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lcom/ifriend/ui/theme/AppColors;Lcom/ifriend/ui/theme/AppTypography;Lcom/ifriend/ui/theme/AppDimensions;Landroidx/compose/foundation/text/selection/TextSelectionColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppThemeKt {
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AppTheme(AppColors appColors, AppTypography appTypography, AppDimensions appDimensions, TextSelectionColors textSelectionColors, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        AppColors appColors2;
        int i3;
        AppTypography appTypography2;
        AppDimensions appDimensions2;
        Object obj;
        ScopeUpdateScope endRestartGroup;
        int i4;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(503020467);
        ComposerKt.sourceInformation(startRestartGroup, "C(AppTheme)P(!1,4,2,3)");
        if ((i & 14) == 0) {
            if ((i2 & 1) == 0) {
                appColors2 = appColors;
                if (startRestartGroup.changed(appColors2)) {
                    i6 = 4;
                    i3 = i6 | i;
                }
            } else {
                appColors2 = appColors;
            }
            i6 = 2;
            i3 = i6 | i;
        } else {
            appColors2 = appColors;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                appTypography2 = appTypography;
                if (startRestartGroup.changed(appTypography2)) {
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                appTypography2 = appTypography;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            appTypography2 = appTypography;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                appDimensions2 = appDimensions;
                if (startRestartGroup.changed(appDimensions2)) {
                    i4 = 256;
                    i3 |= i4;
                }
            } else {
                appDimensions2 = appDimensions;
            }
            i4 = 128;
            i3 |= i4;
        } else {
            appDimensions2 = appDimensions;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i & 7168) == 0) {
            obj = textSelectionColors;
            i3 |= startRestartGroup.changed(obj) ? 2048 : 1024;
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                i3 |= startRestartGroup.changedInstance(content) ? 16384 : 8192;
            }
            if ((46811 & i3) == 9362 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    if ((i2 & 1) != 0) {
                        appColors2 = AppTheme.INSTANCE.getColors(startRestartGroup, 6);
                        i3 &= -15;
                    }
                    if ((i2 & 2) != 0) {
                        appTypography2 = AppTheme.INSTANCE.getTypography(startRestartGroup, 6);
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        appDimensions2 = AppTheme.INSTANCE.getDimensions(startRestartGroup, 6);
                        i3 &= -897;
                    }
                    if (i7 != 0) {
                        obj = AppColorsKt.getTextSelectionColors();
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 1) != 0) {
                        i3 &= -15;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(503020467, i3, -1, "com.ifriend.ui.theme.AppTheme (AppTheme.kt:51)");
                }
                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{AppColorsKt.getLocalColors().provides(appColors2), AppDimensionsKt.getLocalDimensions().provides(appDimensions2), AppTypographyKt.getLocalTypography().provides(appTypography2), TextSelectionColorsKt.getLocalTextSelectionColors().provides(obj), RippleThemeKt.getLocalRippleTheme().provides(AppRippleTheme.INSTANCE), ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(appColors2.m7108getTextPrimary0d7_KjU())), CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, content, startRestartGroup, ((i3 >> 9) & 112) | 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            AppDimensions appDimensions3 = appDimensions2;
            TextSelectionColors textSelectionColors2 = obj;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new AppThemeKt$AppTheme$1(appColors2, appTypography2, appDimensions3, textSelectionColors2, content, i, i2));
            return;
        }
        obj = textSelectionColors;
        if ((i2 & 16) == 0) {
        }
        if ((46811 & i3) == 9362) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if ((i2 & 1) != 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i7 != 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{AppColorsKt.getLocalColors().provides(appColors2), AppDimensionsKt.getLocalDimensions().provides(appDimensions2), AppTypographyKt.getLocalTypography().provides(appTypography2), TextSelectionColorsKt.getLocalTextSelectionColors().provides(obj), RippleThemeKt.getLocalRippleTheme().provides(AppRippleTheme.INSTANCE), ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(appColors2.m7108getTextPrimary0d7_KjU())), CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, content, startRestartGroup, ((i3 >> 9) & 112) | 8);
        if (ComposerKt.isTraceInProgress()) {
        }
        AppDimensions appDimensions32 = appDimensions2;
        TextSelectionColors textSelectionColors22 = obj;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
