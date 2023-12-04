package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.StrokeJoin;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: VectorCompose.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/vector/PathComponent;", "it", "Landroidx/compose/ui/graphics/StrokeJoin;", "invoke-kLtJ_vA", "(Landroidx/compose/ui/graphics/vector/PathComponent;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class VectorComposeKt$Path$2$9 extends Lambda implements Function2<PathComponent, StrokeJoin, Unit> {
    public static final VectorComposeKt$Path$2$9 INSTANCE = new VectorComposeKt$Path$2$9();

    VectorComposeKt$Path$2$9() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, StrokeJoin strokeJoin) {
        m3939invokekLtJ_vA(pathComponent, strokeJoin.m3653unboximpl());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-kLtJ_vA  reason: not valid java name */
    public final void m3939invokekLtJ_vA(PathComponent set, int i) {
        Intrinsics.checkNotNullParameter(set, "$this$set");
        set.m3935setStrokeLineJoinWw9F2mQ(i);
    }
}
