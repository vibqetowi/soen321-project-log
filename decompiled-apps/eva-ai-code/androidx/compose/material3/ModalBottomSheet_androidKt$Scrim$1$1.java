package androidx.compose.material3;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ModalBottomSheet.android.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ModalBottomSheet_androidKt$Scrim$1$1 extends Lambda implements Function1<DrawScope, Unit> {
    final /* synthetic */ State<Float> $alpha$delegate;
    final /* synthetic */ long $color;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheet_androidKt$Scrim$1$1(long j, State<Float> state) {
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
        float Scrim_3J_VO9M$lambda$2;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        long j = this.$color;
        Scrim_3J_VO9M$lambda$2 = ModalBottomSheet_androidKt.Scrim_3J_VO9M$lambda$2(this.$alpha$delegate);
        DrawScope.CC.m3842drawRectnJ9OG0$default(Canvas, j, 0L, 0L, Scrim_3J_VO9M$lambda$2, null, null, 0, 118, null);
    }
}
