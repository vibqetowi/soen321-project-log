package androidx.compose.foundation;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
/* compiled from: Border.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BorderModifierNode$drawGenericBorder$3 extends Lambda implements Function1<ContentDrawScope, Unit> {
    final /* synthetic */ Ref.ObjectRef<ImageBitmap> $cacheImageBitmap;
    final /* synthetic */ ColorFilter $colorFilter;
    final /* synthetic */ Rect $pathBounds;
    final /* synthetic */ long $pathBoundsSize;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorderModifierNode$drawGenericBorder$3(Rect rect, Ref.ObjectRef<ImageBitmap> objectRef, long j, ColorFilter colorFilter) {
        super(1);
        this.$pathBounds = rect;
        this.$cacheImageBitmap = objectRef;
        this.$pathBoundsSize = j;
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
        float left = this.$pathBounds.getLeft();
        float top = this.$pathBounds.getTop();
        Ref.ObjectRef<ImageBitmap> objectRef = this.$cacheImageBitmap;
        long j = this.$pathBoundsSize;
        ColorFilter colorFilter = this.$colorFilter;
        contentDrawScope.getDrawContext().getTransform().translate(left, top);
        DrawScope.CC.m3831drawImageAZ2fEMs$default(contentDrawScope, objectRef.element, 0L, j, 0L, 0L, 0.0f, null, colorFilter, 0, 0, 890, null);
        contentDrawScope.getDrawContext().getTransform().translate(-left, -top);
    }
}
