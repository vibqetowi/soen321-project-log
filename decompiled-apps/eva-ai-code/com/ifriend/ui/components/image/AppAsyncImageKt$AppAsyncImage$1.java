package com.ifriend.ui.components.image;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import coil.ImageLoader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppAsyncImage.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppAsyncImageKt$AppAsyncImage$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Alignment $alignment;
    final /* synthetic */ ContentScale $contentScale;
    final /* synthetic */ Painter $error;
    final /* synthetic */ ImageLoader $imageLoader;
    final /* synthetic */ Object $imageModel;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Painter $placeholder;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppAsyncImageKt$AppAsyncImage$1(Object obj, Modifier modifier, ImageLoader imageLoader, ContentScale contentScale, Alignment alignment, Painter painter, Painter painter2, int i, int i2) {
        super(2);
        this.$imageModel = obj;
        this.$modifier = modifier;
        this.$imageLoader = imageLoader;
        this.$contentScale = contentScale;
        this.$alignment = alignment;
        this.$placeholder = painter;
        this.$error = painter2;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        AppAsyncImageKt.AppAsyncImage(this.$imageModel, this.$modifier, this.$imageLoader, this.$contentScale, this.$alignment, this.$placeholder, this.$error, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
