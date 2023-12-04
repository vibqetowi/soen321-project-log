package androidx.compose.ui.platform;

import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ReceiveChannel;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GlobalSnapshotManager.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", i = {0}, l = {63}, m = "invokeSuspend", n = {"$this$consume$iv$iv"}, s = {"L$0"})
/* loaded from: classes3.dex */
public final class GlobalSnapshotManager$ensureStarted$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Channel<Unit> $channel;
    Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSnapshotManager$ensureStarted$1(Channel<Unit> channel, Continuation<? super GlobalSnapshotManager$ensureStarted$1> continuation) {
        super(2, continuation);
        this.$channel = channel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GlobalSnapshotManager$ensureStarted$1(this.$channel, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GlobalSnapshotManager$ensureStarted$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c A[Catch: all -> 0x0063, TRY_LEAVE, TryCatch #0 {all -> 0x0063, blocks: (B:16:0x0044, B:18:0x004c), top: B:29:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003e -> B:29:0x0044). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Channel<Unit> channel;
        ChannelIterator it;
        GlobalSnapshotManager$ensureStarted$1 globalSnapshotManager$ensureStarted$1;
        Object hasNext;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                channel = this.$channel;
                it = channel.iterator();
                globalSnapshotManager$ensureStarted$1 = this;
                globalSnapshotManager$ensureStarted$1.L$0 = channel;
                globalSnapshotManager$ensureStarted$1.L$1 = it;
                globalSnapshotManager$ensureStarted$1.label = 1;
                hasNext = it.hasNext(globalSnapshotManager$ensureStarted$1);
                if (hasNext != coroutine_suspended) {
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ChannelIterator channelIterator = (ChannelIterator) this.L$1;
                ReceiveChannel receiveChannel = (ReceiveChannel) this.L$0;
                ResultKt.throwOnFailure(obj);
                ReceiveChannel receiveChannel2 = receiveChannel;
                ChannelIterator channelIterator2 = channelIterator;
                Object obj2 = coroutine_suspended;
                GlobalSnapshotManager$ensureStarted$1 globalSnapshotManager$ensureStarted$12 = this;
                try {
                    if (!((Boolean) obj).booleanValue()) {
                        Unit unit = (Unit) channelIterator2.next();
                        Snapshot.Companion.sendApplyNotifications();
                        globalSnapshotManager$ensureStarted$1 = globalSnapshotManager$ensureStarted$12;
                        coroutine_suspended = obj2;
                        it = channelIterator2;
                        channel = receiveChannel2;
                        globalSnapshotManager$ensureStarted$1.L$0 = channel;
                        globalSnapshotManager$ensureStarted$1.L$1 = it;
                        globalSnapshotManager$ensureStarted$1.label = 1;
                        hasNext = it.hasNext(globalSnapshotManager$ensureStarted$1);
                        if (hasNext != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Object obj3 = coroutine_suspended;
                        globalSnapshotManager$ensureStarted$12 = globalSnapshotManager$ensureStarted$1;
                        obj = hasNext;
                        receiveChannel2 = channel;
                        channelIterator2 = it;
                        obj2 = obj3;
                        if (!((Boolean) obj).booleanValue()) {
                            ChannelsKt.cancelConsumed(receiveChannel2, null);
                            return Unit.INSTANCE;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    channel = receiveChannel2;
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ChannelsKt.cancelConsumed(channel, th);
                        throw th2;
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
