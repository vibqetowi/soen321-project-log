package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SnapshotFlow.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {133, 137, 159}, m = "invokeSuspend", n = {"$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "found", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
/* loaded from: classes3.dex */
public final class SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<T> $block;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(Function0<? extends T> function0, Continuation<? super SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1> continuation) {
        super(2, continuation);
        this.$block = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 snapshotStateKt__SnapshotFlowKt$snapshotFlow$1 = new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(this.$block, continuation);
        snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$0 = obj;
        return snapshotStateKt__SnapshotFlowKt$snapshotFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
        return ((SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f5 A[Catch: all -> 0x0053, TryCatch #3 {all -> 0x0053, blocks: (B:32:0x00f1, B:34:0x00f5, B:39:0x00ff, B:42:0x010d, B:46:0x0123, B:48:0x012c, B:11:0x004b, B:43:0x0118, B:45:0x0120, B:44:0x011c), top: B:73:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010d A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #3 {all -> 0x0053, blocks: (B:32:0x00f1, B:34:0x00f5, B:39:0x00ff, B:42:0x010d, B:46:0x0123, B:48:0x012c, B:11:0x004b, B:43:0x0118, B:45:0x0120, B:44:0x011c), top: B:73:0x004b }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x015c -> B:28:0x00cf). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ObserverHandle observerHandle;
        FlowCollector flowCollector;
        LinkedHashSet linkedHashSet;
        SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1 snapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1;
        Channel Channel$default;
        Object obj2;
        Object obj3;
        SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 snapshotStateKt__SnapshotFlowKt$snapshotFlow$1;
        boolean intersects$SnapshotStateKt__SnapshotFlowKt;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i != 0) {
                if (i == 1) {
                    obj2 = this.L$5;
                    observerHandle = (ObserverHandle) this.L$4;
                    Channel$default = (Channel) this.L$3;
                    snapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1 = (Function1) this.L$2;
                    linkedHashSet = (Set) this.L$1;
                    flowCollector = (FlowCollector) this.L$0;
                } else if (i == 2) {
                    int i2 = this.I$0;
                    Object obj4 = this.L$5;
                    ObserverHandle observerHandle2 = (ObserverHandle) this.L$4;
                    Channel channel = (Channel) this.L$3;
                    Function1<Object, Unit> function1 = (Function1) this.L$2;
                    Set set = (Set) this.L$1;
                    FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        obj3 = obj;
                        SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 snapshotStateKt__SnapshotFlowKt$snapshotFlow$12 = this;
                        Set set2 = (Set) obj3;
                        do {
                            if (i2 == 0) {
                                intersects$SnapshotStateKt__SnapshotFlowKt = SnapshotStateKt__SnapshotFlowKt.intersects$SnapshotStateKt__SnapshotFlowKt(set, set2);
                                if (!intersects$SnapshotStateKt__SnapshotFlowKt) {
                                    i2 = 0;
                                    set2 = (Set) ChannelResult.m8832getOrNullimpl(channel.mo8822tryReceivePtdJZtk());
                                }
                            }
                            i2 = 1;
                            set2 = (Set) ChannelResult.m8832getOrNullimpl(channel.mo8822tryReceivePtdJZtk());
                        } while (set2 != null);
                        if (i2 != 0) {
                            set.clear();
                            Snapshot takeSnapshot = Snapshot.Companion.takeSnapshot(function1);
                            Function0<T> function0 = snapshotStateKt__SnapshotFlowKt$snapshotFlow$12.$block;
                            Snapshot makeCurrent = takeSnapshot.makeCurrent();
                            Object invoke = function0.invoke();
                            takeSnapshot.restoreCurrent(makeCurrent);
                            takeSnapshot.dispose();
                            if (!Intrinsics.areEqual(invoke, obj4)) {
                                snapshotStateKt__SnapshotFlowKt$snapshotFlow$12.L$0 = flowCollector2;
                                snapshotStateKt__SnapshotFlowKt$snapshotFlow$12.L$1 = set;
                                snapshotStateKt__SnapshotFlowKt$snapshotFlow$12.L$2 = function1;
                                snapshotStateKt__SnapshotFlowKt$snapshotFlow$12.L$3 = channel;
                                snapshotStateKt__SnapshotFlowKt$snapshotFlow$12.L$4 = observerHandle2;
                                snapshotStateKt__SnapshotFlowKt$snapshotFlow$12.L$5 = invoke;
                                snapshotStateKt__SnapshotFlowKt$snapshotFlow$12.label = 3;
                                if (flowCollector2.emit(invoke, snapshotStateKt__SnapshotFlowKt$snapshotFlow$12) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                observerHandle = observerHandle2;
                                Channel$default = channel;
                                snapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1 = function1;
                                linkedHashSet = set;
                                flowCollector = flowCollector2;
                                obj2 = invoke;
                                snapshotStateKt__SnapshotFlowKt$snapshotFlow$1 = snapshotStateKt__SnapshotFlowKt$snapshotFlow$12;
                                snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$0 = flowCollector;
                                snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$1 = linkedHashSet;
                                snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$2 = snapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1;
                                snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$3 = Channel$default;
                                snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$4 = observerHandle;
                                snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$5 = obj2;
                                snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.I$0 = 0;
                                snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.label = 2;
                                obj3 = Channel$default.receive(snapshotStateKt__SnapshotFlowKt$snapshotFlow$1);
                                if (obj3 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                snapshotStateKt__SnapshotFlowKt$snapshotFlow$12 = snapshotStateKt__SnapshotFlowKt$snapshotFlow$1;
                                flowCollector2 = flowCollector;
                                set = linkedHashSet;
                                function1 = snapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1;
                                channel = Channel$default;
                                observerHandle2 = observerHandle;
                                obj4 = obj2;
                                i2 = 0;
                                Set set22 = (Set) obj3;
                                do {
                                    if (i2 == 0) {
                                    }
                                    i2 = 1;
                                    set22 = (Set) ChannelResult.m8832getOrNullimpl(channel.mo8822tryReceivePtdJZtk());
                                } while (set22 != null);
                                if (i2 != 0) {
                                }
                            }
                        }
                        obj2 = obj4;
                        observerHandle = observerHandle2;
                        Channel$default = channel;
                        snapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1 = function1;
                        linkedHashSet = set;
                        flowCollector = flowCollector2;
                        snapshotStateKt__SnapshotFlowKt$snapshotFlow$1 = snapshotStateKt__SnapshotFlowKt$snapshotFlow$12;
                        snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$0 = flowCollector;
                        snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$1 = linkedHashSet;
                        snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$2 = snapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1;
                        snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$3 = Channel$default;
                        snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$4 = observerHandle;
                        snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$5 = obj2;
                        snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.I$0 = 0;
                        snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.label = 2;
                        obj3 = Channel$default.receive(snapshotStateKt__SnapshotFlowKt$snapshotFlow$1);
                        if (obj3 == coroutine_suspended) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        observerHandle = observerHandle2;
                        observerHandle.dispose();
                        throw th;
                    }
                } else if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    obj2 = this.L$5;
                    observerHandle = (ObserverHandle) this.L$4;
                    Channel$default = (Channel) this.L$3;
                    snapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1 = (Function1) this.L$2;
                    linkedHashSet = (Set) this.L$1;
                    flowCollector = (FlowCollector) this.L$0;
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                linkedHashSet = new LinkedHashSet();
                snapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1 = new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1(linkedHashSet);
                Channel$default = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
                observerHandle = Snapshot.Companion.registerApplyObserver(new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1(Channel$default));
                Snapshot takeSnapshot2 = Snapshot.Companion.takeSnapshot(snapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1);
                Function0<T> function02 = this.$block;
                Snapshot makeCurrent2 = takeSnapshot2.makeCurrent();
                Object invoke2 = function02.invoke();
                takeSnapshot2.restoreCurrent(makeCurrent2);
                takeSnapshot2.dispose();
                this.L$0 = flowCollector;
                this.L$1 = linkedHashSet;
                this.L$2 = snapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1;
                this.L$3 = Channel$default;
                this.L$4 = observerHandle;
                this.L$5 = invoke2;
                this.label = 1;
                if (flowCollector.emit(invoke2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj2 = invoke2;
            }
            snapshotStateKt__SnapshotFlowKt$snapshotFlow$1 = this;
            snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$0 = flowCollector;
            snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$1 = linkedHashSet;
            snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$2 = snapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1;
            snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$3 = Channel$default;
            snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$4 = observerHandle;
            snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$5 = obj2;
            snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.I$0 = 0;
            snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.label = 2;
            obj3 = Channel$default.receive(snapshotStateKt__SnapshotFlowKt$snapshotFlow$1);
            if (obj3 == coroutine_suspended) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
