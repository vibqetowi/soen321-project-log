package androidx.compose.foundation.text.selection;

import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidSelectionHandles.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/draw/CacheDrawScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1 extends Lambda implements Function1<CacheDrawScope, DrawResult> {
    final /* synthetic */ ResolvedTextDirection $direction;
    final /* synthetic */ long $handleColor;
    final /* synthetic */ boolean $handlesCrossed;
    final /* synthetic */ boolean $isStartHandle;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1(long j, boolean z, ResolvedTextDirection resolvedTextDirection, boolean z2) {
        super(1);
        this.$handleColor = j;
        this.$isStartHandle = z;
        this.$direction = resolvedTextDirection;
        this.$handlesCrossed = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DrawResult invoke(CacheDrawScope drawWithCache) {
        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
        return drawWithCache.onDrawWithContent(new AnonymousClass1(this.$isStartHandle, this.$direction, this.$handlesCrossed, AndroidSelectionHandles_androidKt.createHandleImage(drawWithCache, Size.m3087getWidthimpl(drawWithCache.m2924getSizeNHjbRc()) / 2.0f), ColorFilter.Companion.m3332tintxETnrds$default(ColorFilter.Companion, this.$handleColor, 0, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidSelectionHandles.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<ContentDrawScope, Unit> {
        final /* synthetic */ ColorFilter $colorFilter;
        final /* synthetic */ ResolvedTextDirection $direction;
        final /* synthetic */ ImageBitmap $handleImage;
        final /* synthetic */ boolean $handlesCrossed;
        final /* synthetic */ boolean $isStartHandle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z, ResolvedTextDirection resolvedTextDirection, boolean z2, ImageBitmap imageBitmap, ColorFilter colorFilter) {
            super(1);
            this.$isStartHandle = z;
            this.$direction = resolvedTextDirection;
            this.$handlesCrossed = z2;
            this.$handleImage = imageBitmap;
            this.$colorFilter = colorFilter;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
            invoke2(contentDrawScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(ContentDrawScope onDrawWithContent) {
            boolean isLeft;
            Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
            onDrawWithContent.drawContent();
            isLeft = AndroidSelectionHandles_androidKt.isLeft(this.$isStartHandle, this.$direction, this.$handlesCrossed);
            if (isLeft) {
                ContentDrawScope contentDrawScope = onDrawWithContent;
                ImageBitmap imageBitmap = this.$handleImage;
                ColorFilter colorFilter = this.$colorFilter;
                long mo3761getCenterF1C5BW0 = contentDrawScope.mo3761getCenterF1C5BW0();
                DrawContext drawContext = contentDrawScope.getDrawContext();
                long mo3768getSizeNHjbRc = drawContext.mo3768getSizeNHjbRc();
                drawContext.getCanvas().save();
                drawContext.getTransform().mo3775scale0AR0LA0(-1.0f, 1.0f, mo3761getCenterF1C5BW0);
                DrawScope.CC.m3832drawImagegbVJVH8$default(contentDrawScope, imageBitmap, 0L, 0.0f, null, colorFilter, 0, 46, null);
                drawContext.getCanvas().restore();
                drawContext.mo3769setSizeuvyYCjk(mo3768getSizeNHjbRc);
                return;
            }
            DrawScope.CC.m3832drawImagegbVJVH8$default(onDrawWithContent, this.$handleImage, 0L, 0.0f, null, this.$colorFilter, 0, 46, null);
        }
    }
}
