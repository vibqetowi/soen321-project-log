package androidx.constraintlayout.compose;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.Channel;
/* compiled from: MotionLayout.kt */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class MotionLayoutKt$MotionLayoutCore$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Channel<ConstraintSet> $channel;
    final /* synthetic */ ConstraintSet $targetConstraintSet;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MotionLayoutKt$MotionLayoutCore$1(Channel<ConstraintSet> channel, ConstraintSet constraintSet) {
        super(0);
        this.$channel = channel;
        this.$targetConstraintSet = constraintSet;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$channel.mo8817trySendJP2dKIU(this.$targetConstraintSet);
    }
}
