package androidx.compose.material3;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Chip.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ChipKt$InputChip$2$1$1 extends Lambda implements Function1<GraphicsLayerScope, Unit> {
    final /* synthetic */ float $avatarOpacity;
    final /* synthetic */ Shape $avatarShape;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipKt$InputChip$2$1$1(float f, Shape shape) {
        super(1);
        this.$avatarOpacity = f;
        this.$avatarShape = shape;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
        invoke2(graphicsLayerScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setAlpha(this.$avatarOpacity);
        graphicsLayer.setShape(this.$avatarShape);
        graphicsLayer.setClip(true);
    }
}
