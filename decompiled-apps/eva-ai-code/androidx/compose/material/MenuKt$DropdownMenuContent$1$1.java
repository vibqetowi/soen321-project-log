package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Menu.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MenuKt$DropdownMenuContent$1$1 extends Lambda implements Function1<GraphicsLayerScope, Unit> {
    final /* synthetic */ State<Float> $alpha$delegate;
    final /* synthetic */ State<Float> $scale$delegate;
    final /* synthetic */ MutableState<TransformOrigin> $transformOriginState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuKt$DropdownMenuContent$1$1(MutableState<TransformOrigin> mutableState, State<Float> state, State<Float> state2) {
        super(1);
        this.$transformOriginState = mutableState;
        this.$scale$delegate = state;
        this.$alpha$delegate = state2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
        invoke2(graphicsLayerScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(GraphicsLayerScope graphicsLayer) {
        float DropdownMenuContent$lambda$1;
        float DropdownMenuContent$lambda$12;
        float DropdownMenuContent$lambda$3;
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        DropdownMenuContent$lambda$1 = MenuKt.DropdownMenuContent$lambda$1(this.$scale$delegate);
        graphicsLayer.setScaleX(DropdownMenuContent$lambda$1);
        DropdownMenuContent$lambda$12 = MenuKt.DropdownMenuContent$lambda$1(this.$scale$delegate);
        graphicsLayer.setScaleY(DropdownMenuContent$lambda$12);
        DropdownMenuContent$lambda$3 = MenuKt.DropdownMenuContent$lambda$3(this.$alpha$delegate);
        graphicsLayer.setAlpha(DropdownMenuContent$lambda$3);
        graphicsLayer.mo3460setTransformOrigin__ExYCQ(this.$transformOriginState.getValue().m3681unboximpl());
    }
}
