package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Tooltip.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J!\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0014R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/material3/TooltipSync;", "", "()V", "mutatorMutex", "Landroidx/compose/foundation/MutatorMutex;", "getMutatorMutex", "()Landroidx/compose/foundation/MutatorMutex;", "mutexOwner", "Landroidx/compose/material3/TooltipState;", "getMutexOwner", "()Landroidx/compose/material3/TooltipState;", "setMutexOwner", "(Landroidx/compose/material3/TooltipState;)V", "dismissCurrentTooltip", "", "state", "(Landroidx/compose/material3/TooltipState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "show", "persistent", "", "(Landroidx/compose/material3/TooltipState;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TooltipSync {
    public static final TooltipSync INSTANCE = new TooltipSync();
    private static final MutatorMutex mutatorMutex = new MutatorMutex();
    private static TooltipState mutexOwner;

    private TooltipSync() {
    }

    public final MutatorMutex getMutatorMutex() {
        return mutatorMutex;
    }

    public final TooltipState getMutexOwner() {
        return mutexOwner;
    }

    public final void setMutexOwner(TooltipState tooltipState) {
        mutexOwner = tooltipState;
    }

    public final Object show(TooltipState tooltipState, boolean z, Continuation<? super Unit> continuation) {
        TooltipSync$show$4 tooltipSync$show$4;
        TooltipSync$show$5 tooltipSync$show$5;
        if (tooltipState instanceof PlainTooltipState) {
            tooltipSync$show$4 = new TooltipSync$show$2(tooltipState, null);
            tooltipSync$show$5 = new TooltipSync$show$3(tooltipState);
        } else if (tooltipState instanceof RichTooltipState) {
            tooltipSync$show$4 = new TooltipSync$show$4(z, tooltipState, null);
            tooltipSync$show$5 = new TooltipSync$show$5(tooltipState);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        Object mutate = mutatorMutex.mutate(MutatePriority.Default, new TooltipSync$show$6(tooltipState, tooltipSync$show$4, tooltipSync$show$5, null), continuation);
        return mutate == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mutate : Unit.INSTANCE;
    }

    public final Object dismissCurrentTooltip(TooltipState tooltipState, Continuation<? super Unit> continuation) {
        if (Intrinsics.areEqual(tooltipState, mutexOwner)) {
            Object mutate = mutatorMutex.mutate(MutatePriority.UserInput, new TooltipSync$dismissCurrentTooltip$2(null), continuation);
            return mutate == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mutate : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
