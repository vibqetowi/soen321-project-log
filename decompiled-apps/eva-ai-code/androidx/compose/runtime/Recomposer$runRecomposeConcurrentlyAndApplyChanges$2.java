package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
/* compiled from: Recomposer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/runtime/MonotonicFrameClock;", "parentFrameClock", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 1}, l = {791, 811, 812}, m = "invokeSuspend", n = {"recomposeCoroutineScope", "frameSignal", "frameLoop", "frameLoop"}, s = {"L$0", "L$1", "L$2", "L$0"})
/* loaded from: classes3.dex */
final class Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 extends SuspendLambda implements Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> {
    final /* synthetic */ CoroutineContext $recomposeCoroutineContext;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(CoroutineContext coroutineContext, Recomposer recomposer, Continuation<? super Recomposer$runRecomposeConcurrentlyAndApplyChanges$2> continuation) {
        super(3, continuation);
        this.$recomposeCoroutineContext = coroutineContext;
        this.this$0 = recomposer;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(CoroutineScope coroutineScope, MonotonicFrameClock monotonicFrameClock, Continuation<? super Unit> continuation) {
        Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 recomposer$runRecomposeConcurrentlyAndApplyChanges$2 = new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(this.$recomposeCoroutineContext, this.this$0, continuation);
        recomposer$runRecomposeConcurrentlyAndApplyChanges$2.L$0 = coroutineScope;
        recomposer$runRecomposeConcurrentlyAndApplyChanges$2.L$1 = monotonicFrameClock;
        return recomposer$runRecomposeConcurrentlyAndApplyChanges$2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019c A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00b2 -> B:25:0x00b4). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Job launch$default;
        Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 recomposer$runRecomposeConcurrentlyAndApplyChanges$2;
        CoroutineScope coroutineScope;
        ProduceFrameSignal produceFrameSignal;
        boolean shouldKeepRecomposing;
        Object awaitWorkAvailable;
        boolean hasConcurrentFrameWorkLocked;
        Continuation<Unit> requestFrameLocked;
        int i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        int i3 = 1;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) this.L$1;
            boolean z = this.$recomposeCoroutineContext.get(Job.Key) == null;
            CoroutineContext coroutineContext = this.$recomposeCoroutineContext;
            if (!z) {
                throw new IllegalArgumentException(("recomposeCoroutineContext may not contain a Job; found " + coroutineContext.get(Job.Key)).toString());
            }
            CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(coroutineScope2.getCoroutineContext().plus(this.$recomposeCoroutineContext).plus(JobKt.Job(JobKt.getJob(coroutineScope2.getCoroutineContext()))));
            ProduceFrameSignal produceFrameSignal2 = new ProduceFrameSignal();
            launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1(this.this$0, monotonicFrameClock, produceFrameSignal2, null), 3, null);
            recomposer$runRecomposeConcurrentlyAndApplyChanges$2 = this;
            coroutineScope = CoroutineScope;
            produceFrameSignal = produceFrameSignal2;
            shouldKeepRecomposing = recomposer$runRecomposeConcurrentlyAndApplyChanges$2.this$0.getShouldKeepRecomposing();
            if (!shouldKeepRecomposing) {
            }
        } else if (i2 == 1) {
            launch$default = (Job) this.L$2;
            produceFrameSignal = (ProduceFrameSignal) this.L$1;
            ResultKt.throwOnFailure(obj);
            Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 recomposer$runRecomposeConcurrentlyAndApplyChanges$22 = this;
            CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
            Recomposer recomposer = recomposer$runRecomposeConcurrentlyAndApplyChanges$22.this$0;
            IdentityArraySet identityArraySet = recomposer.snapshotInvalidations;
            if (identityArraySet.isNotEmpty()) {
                List list = recomposer.knownCompositions;
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((ControlledComposition) list.get(i4)).recordModificationsOf(identityArraySet);
                }
                recomposer.snapshotInvalidations = new IdentityArraySet();
            }
            List list2 = recomposer.compositionInvalidations;
            int size2 = list2.size();
            int i5 = 0;
            while (i5 < size2) {
                ControlledComposition controlledComposition = (ControlledComposition) list2.get(i5);
                synchronized (recomposer.stateLock) {
                    i = recomposer.concurrentCompositionsOutstanding;
                    recomposer.concurrentCompositionsOutstanding = i + i3;
                }
                BuildersKt__Builders_commonKt.launch$default(coroutineScope3, CompositionKt.getRecomposeCoroutineContext(controlledComposition), null, new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2(recomposer, controlledComposition, null), 2, null);
                i5++;
                recomposer$runRecomposeConcurrentlyAndApplyChanges$22 = recomposer$runRecomposeConcurrentlyAndApplyChanges$22;
                recomposer = recomposer;
                i3 = 1;
            }
            Recomposer recomposer2 = recomposer;
            Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 recomposer$runRecomposeConcurrentlyAndApplyChanges$23 = recomposer$runRecomposeConcurrentlyAndApplyChanges$22;
            recomposer2.compositionInvalidations.clear();
            if (recomposer2.deriveStateLocked() != null) {
                Object obj2 = recomposer$runRecomposeConcurrentlyAndApplyChanges$23.this$0.stateLock;
                Recomposer recomposer3 = recomposer$runRecomposeConcurrentlyAndApplyChanges$23.this$0;
                synchronized (obj2) {
                    hasConcurrentFrameWorkLocked = recomposer3.getHasConcurrentFrameWorkLocked();
                    requestFrameLocked = hasConcurrentFrameWorkLocked ? produceFrameSignal.requestFrameLocked() : null;
                }
                if (requestFrameLocked != null) {
                    Result.Companion companion = Result.Companion;
                    requestFrameLocked.resumeWith(Result.m7271constructorimpl(Unit.INSTANCE));
                }
                recomposer$runRecomposeConcurrentlyAndApplyChanges$2 = recomposer$runRecomposeConcurrentlyAndApplyChanges$23;
                coroutineScope = coroutineScope3;
                i3 = 1;
                shouldKeepRecomposing = recomposer$runRecomposeConcurrentlyAndApplyChanges$2.this$0.getShouldKeepRecomposing();
                if (!shouldKeepRecomposing) {
                    recomposer$runRecomposeConcurrentlyAndApplyChanges$2.L$0 = coroutineScope;
                    recomposer$runRecomposeConcurrentlyAndApplyChanges$2.L$1 = produceFrameSignal;
                    recomposer$runRecomposeConcurrentlyAndApplyChanges$2.L$2 = launch$default;
                    recomposer$runRecomposeConcurrentlyAndApplyChanges$2.label = i3;
                    awaitWorkAvailable = recomposer$runRecomposeConcurrentlyAndApplyChanges$2.this$0.awaitWorkAvailable(recomposer$runRecomposeConcurrentlyAndApplyChanges$2);
                    if (awaitWorkAvailable == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    coroutineScope3 = coroutineScope;
                    recomposer$runRecomposeConcurrentlyAndApplyChanges$22 = recomposer$runRecomposeConcurrentlyAndApplyChanges$2;
                    Recomposer recomposer4 = recomposer$runRecomposeConcurrentlyAndApplyChanges$22.this$0;
                    IdentityArraySet identityArraySet2 = recomposer4.snapshotInvalidations;
                    if (identityArraySet2.isNotEmpty()) {
                    }
                    List list22 = recomposer4.compositionInvalidations;
                    int size22 = list22.size();
                    int i52 = 0;
                    while (i52 < size22) {
                    }
                    Recomposer recomposer22 = recomposer4;
                    Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 recomposer$runRecomposeConcurrentlyAndApplyChanges$232 = recomposer$runRecomposeConcurrentlyAndApplyChanges$22;
                    recomposer22.compositionInvalidations.clear();
                    if (recomposer22.deriveStateLocked() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
                    }
                } else {
                    recomposer$runRecomposeConcurrentlyAndApplyChanges$2.L$0 = launch$default;
                    recomposer$runRecomposeConcurrentlyAndApplyChanges$2.L$1 = null;
                    recomposer$runRecomposeConcurrentlyAndApplyChanges$2.L$2 = null;
                    recomposer$runRecomposeConcurrentlyAndApplyChanges$2.label = 2;
                    if (JobKt.cancelAndJoin(JobKt.getJob(coroutineScope.getCoroutineContext()), recomposer$runRecomposeConcurrentlyAndApplyChanges$2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    recomposer$runRecomposeConcurrentlyAndApplyChanges$2.L$0 = null;
                    recomposer$runRecomposeConcurrentlyAndApplyChanges$2.label = 3;
                    if (JobKt.cancelAndJoin(launch$default, recomposer$runRecomposeConcurrentlyAndApplyChanges$2) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                }
            }
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            launch$default = (Job) this.L$0;
            ResultKt.throwOnFailure(obj);
            recomposer$runRecomposeConcurrentlyAndApplyChanges$2 = this;
            recomposer$runRecomposeConcurrentlyAndApplyChanges$2.L$0 = null;
            recomposer$runRecomposeConcurrentlyAndApplyChanges$2.label = 3;
            if (JobKt.cancelAndJoin(launch$default, recomposer$runRecomposeConcurrentlyAndApplyChanges$2) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }
}
