package com.ifriend.ui.theme;

import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import kotlin.Metadata;
/* compiled from: AppColors.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0016\u001a³\u0001\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u00012\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020\u00012\b\b\u0002\u0010!\u001a\u00020\u00012\b\b\u0002\u0010\"\u001a\u00020\u00012\b\b\u0002\u0010#\u001a\u00020\u00012\b\b\u0002\u0010$\u001a\u00020\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010&\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0013\u0010\t\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\n\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u000b\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\f\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\r\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u000e\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u000f\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"Dark", "Landroidx/compose/ui/graphics/Color;", "J", "Error", "LocalColors", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/ifriend/ui/theme/AppColors;", "getLocalColors", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "Primary", "Warning", "White", "White10", "White20", "White25", "White5", "textSelectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "getTextSelectionColors", "()Landroidx/compose/foundation/text/selection/TextSelectionColors;", "lightColors", "textPrimary", "textSecondary", "iconPrimary", "light", "light5", "light10", "light20", "light25", "dark", "background", "surface", "surfaceVariant", "primary", "accent", "error", "warning", "lightColors-Q_H9qLU", "(JJJJJJJJJJJJJJJJ)Lcom/ifriend/ui/theme/AppColors;", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppColorsKt {
    private static final long Dark;
    private static final long Error;
    private static final ProvidableCompositionLocal<AppColors> LocalColors = CompositionLocalKt.staticCompositionLocalOf(AppColorsKt$LocalColors$1.INSTANCE);
    private static final long Primary;
    private static final long Warning;
    private static final long White;
    private static final long White10;
    private static final long White20;
    private static final long White25;
    private static final long White5;
    private static final TextSelectionColors textSelectionColors;

    static {
        long Color = ColorKt.Color(4294967295L);
        White = Color;
        White5 = ColorKt.Color(234881023);
        White10 = ColorKt.Color(452984831);
        White20 = ColorKt.Color((int) DefaultTimeBar.DEFAULT_UNPLAYED_COLOR);
        White25 = ColorKt.Color(1090519039);
        Dark = ColorKt.Color(4279111439L);
        Primary = ColorKt.Color(4280137873L);
        Error = ColorKt.Color(4294933629L);
        Warning = ColorKt.Color(4294687292L);
        textSelectionColors = new TextSelectionColors(Color, Color.m3290copywmQWz5c$default(Color, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
    }

    public static final ProvidableCompositionLocal<AppColors> getLocalColors() {
        return LocalColors;
    }

    /* renamed from: lightColors-Q_H9qLU  reason: not valid java name */
    public static final AppColors m7145lightColorsQ_H9qLU(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        return new AppColors(j, j2, j3, j10, j11, j12, j4, j9, j5, j6, j7, j8, j13, j15, j16, j14, true, null);
    }

    public static final TextSelectionColors getTextSelectionColors() {
        return textSelectionColors;
    }
}
