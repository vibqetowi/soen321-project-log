package androidx.compose.ui.graphics.vector;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: VectorCompose.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/vector/PathComponent;", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class VectorComposeKt$Path$2$12 extends Lambda implements Function2<PathComponent, Float, Unit> {
    public static final VectorComposeKt$Path$2$12 INSTANCE = new VectorComposeKt$Path$2$12();

    VectorComposeKt$Path$2$12() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f) {
        invoke(pathComponent, f.floatValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PathComponent set, float f) {
        Intrinsics.checkNotNullParameter(set, "$this$set");
        set.setTrimPathStart(f);
    }
}
