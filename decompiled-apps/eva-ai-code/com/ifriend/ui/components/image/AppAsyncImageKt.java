package com.ifriend.ui.components.image;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import coil.ImageLoader;
import coil.compose.AsyncImageKt;
import coil.request.CachePolicy;
import coil.request.ImageRequest;
import com.ifriend.ui.components.providers.AppLocalProviderKt;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppAsyncImage.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aS\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"AppAsyncImage", "", "imageModel", "", "modifier", "Landroidx/compose/ui/Modifier;", "imageLoader", "Lcoil/ImageLoader;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alignment", "Landroidx/compose/ui/Alignment;", "placeholder", "Landroidx/compose/ui/graphics/painter/Painter;", "error", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lcoil/ImageLoader;Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/runtime/Composer;II)V", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppAsyncImageKt {
    public static final void AppAsyncImage(Object imageModel, Modifier modifier, ImageLoader imageLoader, ContentScale contentScale, Alignment alignment, Painter painter, Painter painter2, Composer composer, int i, int i2) {
        ImageLoader imageLoader2;
        int i3;
        ColorPainter colorPainter;
        ColorPainter colorPainter2;
        Intrinsics.checkNotNullParameter(imageModel, "imageModel");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer startRestartGroup = composer.startRestartGroup(1002253084);
        ComposerKt.sourceInformation(startRestartGroup, "C(AppAsyncImage)P(4,5,3,1!1,6)");
        if ((i2 & 4) != 0) {
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(AppLocalProviderKt.getLocalAppImageLoaderProvider());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            i3 = i & (-897);
            imageLoader2 = (ImageLoader) consume;
        } else {
            imageLoader2 = imageLoader;
            i3 = i;
        }
        ContentScale crop = (i2 & 8) != 0 ? ContentScale.Companion.getCrop() : contentScale;
        Alignment center = (i2 & 16) != 0 ? Alignment.Companion.getCenter() : alignment;
        if ((i2 & 32) != 0) {
            i3 &= -458753;
            colorPainter = new ColorPainter(AppTheme.INSTANCE.getColors(startRestartGroup, 6).m7102getLight200d7_KjU(), null);
        } else {
            colorPainter = painter;
        }
        if ((i2 & 64) != 0) {
            i3 &= -3670017;
            colorPainter2 = new ColorPainter(AppTheme.INSTANCE.getColors(startRestartGroup, 6).m7102getLight200d7_KjU(), null);
        } else {
            colorPainter2 = painter2;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1002253084, i3, -1, "com.ifriend.ui.components.image.AppAsyncImage (AppAsyncImage.kt:46)");
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2 = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        AsyncImageKt.m6154AsyncImageQ4Kwu38(new ImageRequest.Builder((Context) consume2).data(imageModel).diskCachePolicy(CachePolicy.ENABLED).build(), null, imageLoader2, modifier, colorPainter, colorPainter2, null, null, null, null, center, crop, 0.0f, null, 0, startRestartGroup, ((i3 << 6) & 7168) | 295480, ((i3 >> 12) & 14) | ((i3 >> 6) & 112), 29632);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new AppAsyncImageKt$AppAsyncImage$1(imageModel, modifier, imageLoader2, crop, center, colorPainter, colorPainter2, i, i2));
    }
}
