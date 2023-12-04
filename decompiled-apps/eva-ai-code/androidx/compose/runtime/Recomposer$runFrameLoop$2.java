package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Recomposer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/CancellableContinuation;", "", "frameTime", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Recomposer$runFrameLoop$2 extends Lambda implements Function1<Long, CancellableContinuation<? super Unit>> {
    final /* synthetic */ ProduceFrameSignal $frameSignal;
    final /* synthetic */ List<ControlledComposition> $toApply;
    final /* synthetic */ List<ControlledComposition> $toRecompose;
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runFrameLoop$2(Recomposer recomposer, List<ControlledComposition> list, List<ControlledComposition> list2, ProduceFrameSignal produceFrameSignal) {
        super(1);
        this.this$0 = recomposer;
        this.$toRecompose = list;
        this.$toApply = list2;
        this.$frameSignal = produceFrameSignal;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ CancellableContinuation<? super Unit> invoke(Long l) {
        return invoke(l.longValue());
    }

    public final CancellableContinuation<Unit> invoke(long j) {
        boolean hasBroadcastFrameClockAwaiters;
        Object beginSection;
        List list;
        int i;
        List list2;
        CancellableContinuation<Unit> deriveStateLocked;
        ControlledComposition performRecompose;
        BroadcastFrameClock broadcastFrameClock;
        hasBroadcastFrameClockAwaiters = this.this$0.getHasBroadcastFrameClockAwaiters();
        if (hasBroadcastFrameClockAwaiters) {
            Recomposer recomposer = this.this$0;
            beginSection = Trace.INSTANCE.beginSection("Recomposer:animation");
            try {
                broadcastFrameClock = recomposer.broadcastFrameClock;
                broadcastFrameClock.sendFrame(j);
                Snapshot.Companion.sendApplyNotifications();
                Unit unit = Unit.INSTANCE;
                Trace.INSTANCE.endSection(beginSection);
            } finally {
            }
        }
        Recomposer recomposer2 = this.this$0;
        List<ControlledComposition> list3 = this.$toRecompose;
        List<ControlledComposition> list4 = this.$toApply;
        ProduceFrameSignal produceFrameSignal = this.$frameSignal;
        beginSection = Trace.INSTANCE.beginSection("Recomposer:recompose");
        try {
            recomposer2.recordComposerModifications();
            synchronized (recomposer2.stateLock) {
                list = recomposer2.compositionsAwaitingApply;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    list4.add((ControlledComposition) list.get(i2));
                }
                list2 = recomposer2.compositionsAwaitingApply;
                list2.clear();
                List list5 = recomposer2.compositionInvalidations;
                int size2 = list5.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    list3.add((ControlledComposition) list5.get(i3));
                }
                recomposer2.compositionInvalidations.clear();
                produceFrameSignal.takeFrameRequestLocked();
                Unit unit2 = Unit.INSTANCE;
            }
            IdentityArraySet identityArraySet = new IdentityArraySet();
            int size3 = list3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                performRecompose = recomposer2.performRecompose(list3.get(i4), identityArraySet);
                if (performRecompose != null) {
                    list4.add(performRecompose);
                }
            }
            list3.clear();
            if (!list4.isEmpty()) {
                recomposer2.changeCount = recomposer2.getChangeCount() + 1;
            }
            int size4 = list4.size();
            for (i = 0; i < size4; i++) {
                list4.get(i).applyChanges();
            }
            list4.clear();
            synchronized (recomposer2.stateLock) {
                deriveStateLocked = recomposer2.deriveStateLocked();
            }
            return deriveStateLocked;
        } finally {
        }
    }
}
