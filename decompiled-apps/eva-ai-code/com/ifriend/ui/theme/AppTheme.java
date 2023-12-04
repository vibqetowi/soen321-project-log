package com.ifriend.ui.theme;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
/* compiled from: AppTheme.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/ifriend/ui/theme/AppTheme;", "", "()V", "animationDuration", "Lcom/ifriend/ui/theme/AppAnimationDuration;", "getAnimationDuration", "(Landroidx/compose/runtime/Composer;I)Lcom/ifriend/ui/theme/AppAnimationDuration;", "colors", "Lcom/ifriend/ui/theme/AppColors;", "getColors", "(Landroidx/compose/runtime/Composer;I)Lcom/ifriend/ui/theme/AppColors;", "dimensions", "Lcom/ifriend/ui/theme/AppDimensions;", "getDimensions", "(Landroidx/compose/runtime/Composer;I)Lcom/ifriend/ui/theme/AppDimensions;", "elevations", "Lcom/ifriend/ui/theme/AppElevations;", "getElevations", "(Landroidx/compose/runtime/Composer;I)Lcom/ifriend/ui/theme/AppElevations;", "shapes", "Lcom/ifriend/ui/theme/AppShapes;", "getShapes", "(Landroidx/compose/runtime/Composer;I)Lcom/ifriend/ui/theme/AppShapes;", "typography", "Lcom/ifriend/ui/theme/AppTypography;", "getTypography", "(Landroidx/compose/runtime/Composer;I)Lcom/ifriend/ui/theme/AppTypography;", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppTheme {
    public static final int $stable = 0;
    public static final AppTheme INSTANCE = new AppTheme();

    private AppTheme() {
    }

    public final AppColors getColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1271280789, i, -1, "com.ifriend.ui.theme.AppTheme.<get-colors> (AppTheme.kt:16)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(AppColorsKt.getLocalColors());
        ComposerKt.sourceInformationMarkerEnd(composer);
        AppColors appColors = (AppColors) consume;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return appColors;
    }

    public final AppTypography getTypography(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1842691190, i, -1, "com.ifriend.ui.theme.AppTheme.<get-typography> (AppTheme.kt:21)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(AppTypographyKt.getLocalTypography());
        ComposerKt.sourceInformationMarkerEnd(composer);
        AppTypography appTypography = (AppTypography) consume;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return appTypography;
    }

    public final AppDimensions getDimensions(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1738882536, i, -1, "com.ifriend.ui.theme.AppTheme.<get-dimensions> (AppTheme.kt:26)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(AppDimensionsKt.getLocalDimensions());
        ComposerKt.sourceInformationMarkerEnd(composer);
        AppDimensions appDimensions = (AppDimensions) consume;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return appDimensions;
    }

    public final AppShapes getShapes(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1675475501, i, -1, "com.ifriend.ui.theme.AppTheme.<get-shapes> (AppTheme.kt:31)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(AppShapeKt.getLocalShapes());
        ComposerKt.sourceInformationMarkerEnd(composer);
        AppShapes appShapes = (AppShapes) consume;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return appShapes;
    }

    public final AppElevations getElevations(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1471964431, i, -1, "com.ifriend.ui.theme.AppTheme.<get-elevations> (AppTheme.kt:36)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(AppElevationsKt.getLocalElevations());
        ComposerKt.sourceInformationMarkerEnd(composer);
        AppElevations appElevations = (AppElevations) consume;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return appElevations;
    }

    public final AppAnimationDuration getAnimationDuration(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1146794383, i, -1, "com.ifriend.ui.theme.AppTheme.<get-animationDuration> (AppTheme.kt:41)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(AppAnimationDurationKt.getLocalAnimationDuration());
        ComposerKt.sourceInformationMarkerEnd(composer);
        AppAnimationDuration appAnimationDuration = (AppAnimationDuration) consume;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return appAnimationDuration;
    }
}
