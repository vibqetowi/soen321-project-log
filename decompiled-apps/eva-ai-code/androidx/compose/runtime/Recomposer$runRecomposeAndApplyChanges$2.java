package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Recomposer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/runtime/MonotonicFrameClock;", "parentFrameClock", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {526, 537}, m = "invokeSuspend", n = {"parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
/* loaded from: classes3.dex */
public final class Recomposer$runRecomposeAndApplyChanges$2 extends SuspendLambda implements Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeAndApplyChanges$2(Recomposer recomposer, Continuation<? super Recomposer$runRecomposeAndApplyChanges$2> continuation) {
        super(3, continuation);
        this.this$0 = recomposer;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(CoroutineScope coroutineScope, MonotonicFrameClock monotonicFrameClock, Continuation<? super Unit> continuation) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.this$0, continuation);
        recomposer$runRecomposeAndApplyChanges$2.L$0 = monotonicFrameClock;
        return recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0107  */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00f3 -> B:23:0x00f8). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00fe -> B:25:0x0105). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MonotonicFrameClock monotonicFrameClock;
        Collection collection;
        Collection collection2;
        Collection collection3;
        Collection collection4;
        Collection collection5;
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2;
        Collection collection6;
        Collection collection7;
        Collection collection8;
        Collection collection9;
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$22;
        Collection collection10;
        boolean recordComposerModifications;
        boolean shouldKeepRecomposing;
        Object awaitWorkAvailable;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            monotonicFrameClock = (MonotonicFrameClock) this.L$0;
            collection = (List) new ArrayList();
            collection2 = (List) new ArrayList();
            collection3 = (List) new ArrayList();
            collection4 = (Set) new LinkedHashSet();
            collection5 = (Set) new LinkedHashSet();
            recomposer$runRecomposeAndApplyChanges$2 = this;
            shouldKeepRecomposing = recomposer$runRecomposeAndApplyChanges$2.this$0.getShouldKeepRecomposing();
            if (!shouldKeepRecomposing) {
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            recomposer$runRecomposeAndApplyChanges$22 = this;
            collection10 = (Set) this.L$5;
            collection6 = (Set) this.L$4;
            collection7 = (List) this.L$3;
            collection8 = (List) this.L$2;
            collection9 = (List) this.L$1;
            monotonicFrameClock = (MonotonicFrameClock) this.L$0;
            recordComposerModifications = recomposer$runRecomposeAndApplyChanges$22.this$0.recordComposerModifications();
            if (recordComposerModifications) {
            }
        } else if (i != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            Collection collection11 = (List) this.L$2;
            Collection collection12 = (List) this.L$1;
            MonotonicFrameClock monotonicFrameClock2 = (MonotonicFrameClock) this.L$0;
            ResultKt.throwOnFailure(obj);
            recomposer$runRecomposeAndApplyChanges$2 = this;
            collection5 = (Set) this.L$5;
            monotonicFrameClock = monotonicFrameClock2;
            collection4 = (Set) this.L$4;
            collection = collection12;
            collection3 = (List) this.L$3;
            collection2 = collection11;
            recomposer$runRecomposeAndApplyChanges$2.this$0.discardUnusedValues();
            i2 = 1;
            shouldKeepRecomposing = recomposer$runRecomposeAndApplyChanges$2.this$0.getShouldKeepRecomposing();
            if (!shouldKeepRecomposing) {
                recomposer$runRecomposeAndApplyChanges$2.L$0 = monotonicFrameClock;
                recomposer$runRecomposeAndApplyChanges$2.L$1 = collection;
                recomposer$runRecomposeAndApplyChanges$2.L$2 = collection2;
                recomposer$runRecomposeAndApplyChanges$2.L$3 = collection3;
                recomposer$runRecomposeAndApplyChanges$2.L$4 = collection4;
                recomposer$runRecomposeAndApplyChanges$2.L$5 = collection5;
                recomposer$runRecomposeAndApplyChanges$2.label = i2;
                awaitWorkAvailable = recomposer$runRecomposeAndApplyChanges$2.this$0.awaitWorkAvailable(recomposer$runRecomposeAndApplyChanges$2);
                if (awaitWorkAvailable == coroutine_suspended) {
                    return coroutine_suspended;
                }
                collection9 = collection;
                collection8 = collection2;
                collection7 = collection3;
                collection6 = collection4;
                recomposer$runRecomposeAndApplyChanges$22 = recomposer$runRecomposeAndApplyChanges$2;
                collection10 = collection5;
                recordComposerModifications = recomposer$runRecomposeAndApplyChanges$22.this$0.recordComposerModifications();
                if (recordComposerModifications) {
                    collection5 = collection10;
                    recomposer$runRecomposeAndApplyChanges$2 = recomposer$runRecomposeAndApplyChanges$22;
                    collection = collection9;
                    collection2 = collection8;
                    collection3 = collection7;
                    collection4 = collection6;
                    i2 = 1;
                    shouldKeepRecomposing = recomposer$runRecomposeAndApplyChanges$2.this$0.getShouldKeepRecomposing();
                    if (!shouldKeepRecomposing) {
                    }
                } else {
                    LinkedHashSet linkedHashSet = collection10;
                    Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$23 = recomposer$runRecomposeAndApplyChanges$22;
                    recomposer$runRecomposeAndApplyChanges$23.L$0 = monotonicFrameClock;
                    recomposer$runRecomposeAndApplyChanges$23.L$1 = collection9;
                    recomposer$runRecomposeAndApplyChanges$23.L$2 = collection8;
                    recomposer$runRecomposeAndApplyChanges$23.L$3 = collection7;
                    recomposer$runRecomposeAndApplyChanges$23.L$4 = collection6;
                    collection5 = linkedHashSet;
                    recomposer$runRecomposeAndApplyChanges$23.L$5 = collection5;
                    recomposer$runRecomposeAndApplyChanges$23.label = 2;
                    if (monotonicFrameClock.withFrameNanos(new AnonymousClass1(recomposer$runRecomposeAndApplyChanges$22.this$0, collection9, collection8, collection6, collection7, linkedHashSet), recomposer$runRecomposeAndApplyChanges$23) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    recomposer$runRecomposeAndApplyChanges$2 = recomposer$runRecomposeAndApplyChanges$23;
                    collection = collection9;
                    collection2 = collection8;
                    collection3 = collection7;
                    collection4 = collection6;
                    recomposer$runRecomposeAndApplyChanges$2.this$0.discardUnusedValues();
                    i2 = 1;
                    shouldKeepRecomposing = recomposer$runRecomposeAndApplyChanges$2.this$0.getShouldKeepRecomposing();
                    if (!shouldKeepRecomposing) {
                        return Unit.INSTANCE;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$clearRecompositionState(List<ControlledComposition> list, List<MovableContentStateReference> list2, List<ControlledComposition> list3, Set<ControlledComposition> set, Set<ControlledComposition> set2) {
        list.clear();
        list2.clear();
        list3.clear();
        set.clear();
        set2.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer) {
        List list2;
        List list3;
        list.clear();
        synchronized (recomposer.stateLock) {
            list2 = recomposer.compositionValuesAwaitingInsert;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                list.add((MovableContentStateReference) list2.get(i));
            }
            list3 = recomposer.compositionValuesAwaitingInsert;
            list3.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "frameTime", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<Long, Unit> {
        final /* synthetic */ List<ControlledComposition> $toApply;
        final /* synthetic */ Set<ControlledComposition> $toComplete;
        final /* synthetic */ List<MovableContentStateReference> $toInsert;
        final /* synthetic */ Set<ControlledComposition> $toLateApply;
        final /* synthetic */ List<ControlledComposition> $toRecompose;
        final /* synthetic */ Recomposer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Recomposer recomposer, List<ControlledComposition> list, List<MovableContentStateReference> list2, Set<ControlledComposition> set, List<ControlledComposition> list3, Set<ControlledComposition> set2) {
            super(1);
            this.this$0 = recomposer;
            this.$toRecompose = list;
            this.$toInsert = list2;
            this.$toLateApply = set;
            this.$toApply = list3;
            this.$toComplete = set2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            invoke(l.longValue());
            return Unit.INSTANCE;
        }

        public final void invoke(long j) {
            boolean hasBroadcastFrameClockAwaiters;
            Object beginSection;
            List performInsertValues;
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
            List<ControlledComposition> list = this.$toRecompose;
            List<MovableContentStateReference> list2 = this.$toInsert;
            Set<ControlledComposition> set = this.$toLateApply;
            List<ControlledComposition> list3 = this.$toApply;
            Set<ControlledComposition> set2 = this.$toComplete;
            beginSection = Trace.INSTANCE.beginSection("Recomposer:recompose");
            try {
                recomposer2.recordComposerModifications();
                synchronized (recomposer2.stateLock) {
                    List list4 = recomposer2.compositionInvalidations;
                    int size = list4.size();
                    for (int i = 0; i < size; i++) {
                        list.add((ControlledComposition) list4.get(i));
                    }
                    recomposer2.compositionInvalidations.clear();
                    Unit unit2 = Unit.INSTANCE;
                }
                IdentityArraySet identityArraySet = new IdentityArraySet();
                IdentityArraySet identityArraySet2 = new IdentityArraySet();
                while (true) {
                    if (!(!list.isEmpty()) && !(!list2.isEmpty())) {
                        break;
                    }
                    try {
                        int size2 = list.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            ControlledComposition controlledComposition = list.get(i2);
                            identityArraySet2.add(controlledComposition);
                            performRecompose = recomposer2.performRecompose(controlledComposition, identityArraySet);
                            if (performRecompose != null) {
                                list3.add(performRecompose);
                            }
                        }
                        list.clear();
                        if (identityArraySet.isNotEmpty()) {
                            synchronized (recomposer2.stateLock) {
                                List list5 = recomposer2.knownCompositions;
                                int size3 = list5.size();
                                for (int i3 = 0; i3 < size3; i3++) {
                                    ControlledComposition controlledComposition2 = (ControlledComposition) list5.get(i3);
                                    if (!identityArraySet2.contains(controlledComposition2) && controlledComposition2.observesAnyOf(identityArraySet)) {
                                        list.add(controlledComposition2);
                                    }
                                }
                                Unit unit3 = Unit.INSTANCE;
                            }
                        }
                        if (list.isEmpty()) {
                            try {
                                Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$fillToInsert(list2, recomposer2);
                                while (!list2.isEmpty()) {
                                    performInsertValues = recomposer2.performInsertValues(list2, identityArraySet);
                                    CollectionsKt.addAll(set, performInsertValues);
                                    Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$fillToInsert(list2, recomposer2);
                                }
                            } catch (Exception e) {
                                Recomposer.processCompositionError$default(recomposer2, e, null, true, 2, null);
                                Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(list, list2, list3, set, set2);
                                return;
                            }
                        }
                    } catch (Exception e2) {
                        Recomposer.processCompositionError$default(recomposer2, e2, null, true, 2, null);
                        Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(list, list2, list3, set, set2);
                        list.clear();
                    }
                }
                if (!list3.isEmpty()) {
                    recomposer2.changeCount = recomposer2.getChangeCount() + 1;
                    try {
                        int size4 = list3.size();
                        for (int i4 = 0; i4 < size4; i4++) {
                            set2.add(list3.get(i4));
                        }
                        int size5 = list3.size();
                        for (int i5 = 0; i5 < size5; i5++) {
                            list3.get(i5).applyChanges();
                        }
                        list3.clear();
                    } catch (Exception e3) {
                        Recomposer.processCompositionError$default(recomposer2, e3, null, false, 6, null);
                        Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(list, list2, list3, set, set2);
                        list3.clear();
                        return;
                    }
                }
                if (!set.isEmpty()) {
                    try {
                        CollectionsKt.addAll(set2, set);
                        for (ControlledComposition controlledComposition3 : set) {
                            controlledComposition3.applyLateChanges();
                        }
                        set.clear();
                    } catch (Exception e4) {
                        Recomposer.processCompositionError$default(recomposer2, e4, null, false, 6, null);
                        Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(list, list2, list3, set, set2);
                        set.clear();
                        return;
                    }
                }
                if (!set2.isEmpty()) {
                    try {
                        for (ControlledComposition controlledComposition4 : set2) {
                            controlledComposition4.changesApplied();
                        }
                        set2.clear();
                    } catch (Exception e5) {
                        Recomposer.processCompositionError$default(recomposer2, e5, null, false, 6, null);
                        Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(list, list2, list3, set, set2);
                        set2.clear();
                        return;
                    }
                }
                synchronized (recomposer2.stateLock) {
                    recomposer2.deriveStateLocked();
                }
                Snapshot.Companion.notifyObjectsInitialized();
                recomposer2.compositionsRemoved = null;
                Unit unit4 = Unit.INSTANCE;
            } finally {
            }
        }
    }
}
