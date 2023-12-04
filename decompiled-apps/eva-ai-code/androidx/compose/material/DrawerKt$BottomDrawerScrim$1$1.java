package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Drawer.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DrawerKt$BottomDrawerScrim$1$1 extends Lambda implements Function1<DrawScope, Unit> {
    final /* synthetic */ State<Float> $alpha$delegate;
    final /* synthetic */ long $color;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerKt$BottomDrawerScrim$1$1(long j, State<Float> state) {
        super(1);
        this.$color = j;
        this.$alpha$delegate = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(DrawScope Canvas) {
        float BottomDrawerScrim_3J_VO9M$lambda$3;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        long j = this.$color;
        BottomDrawerScrim_3J_VO9M$lambda$3 = DrawerKt.BottomDrawerScrim_3J_VO9M$lambda$3(this.$alpha$delegate);
        DrawScope.CC.m3842drawRectnJ9OG0$default(Canvas, j, 0L, 0L, BottomDrawerScrim_3J_VO9M$lambda$3, null, null, 0, 118, null);
    }
}
