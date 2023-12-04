package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidCursorHandle.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/draw/CacheDrawScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1 extends Lambda implements Function1<CacheDrawScope, DrawResult> {
    final /* synthetic */ long $handleColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1(long j) {
        super(1);
        this.$handleColor = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DrawResult invoke(CacheDrawScope drawWithCache) {
        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
        float m3087getWidthimpl = Size.m3087getWidthimpl(drawWithCache.m2924getSizeNHjbRc()) / 2.0f;
        return drawWithCache.onDrawWithContent(new AnonymousClass1(m3087getWidthimpl, AndroidSelectionHandles_androidKt.createHandleImage(drawWithCache, m3087getWidthimpl), ColorFilter.Companion.m3332tintxETnrds$default(ColorFilter.Companion, this.$handleColor, 0, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidCursorHandle.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<ContentDrawScope, Unit> {
        final /* synthetic */ ColorFilter $colorFilter;
        final /* synthetic */ ImageBitmap $imageBitmap;
        final /* synthetic */ float $radius;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(float f, ImageBitmap imageBitmap, ColorFilter colorFilter) {
            super(1);
            this.$radius = f;
            this.$imageBitmap = imageBitmap;
            this.$colorFilter = colorFilter;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
            invoke2(contentDrawScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(ContentDrawScope onDrawWithContent) {
            Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
            onDrawWithContent.drawContent();
            ContentDrawScope contentDrawScope = onDrawWithContent;
            float f = this.$radius;
            ImageBitmap imageBitmap = this.$imageBitmap;
            ColorFilter colorFilter = this.$colorFilter;
            DrawContext drawContext = contentDrawScope.getDrawContext();
            long mo3768getSizeNHjbRc = drawContext.mo3768getSizeNHjbRc();
            drawContext.getCanvas().save();
            DrawTransform transform = drawContext.getTransform();
            DrawTransform.CC.translate$default(transform, f, 0.0f, 2, null);
            transform.mo3774rotateUv8p0NA(45.0f, Offset.Companion.m3034getZeroF1C5BW0());
            DrawScope.CC.m3832drawImagegbVJVH8$default(contentDrawScope, imageBitmap, 0L, 0.0f, null, colorFilter, 0, 46, null);
            drawContext.getCanvas().restore();
            drawContext.mo3769setSizeuvyYCjk(mo3768getSizeNHjbRc);
        }
    }
}
