package kotlinx.coroutines.channels;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
/* compiled from: Deprecated.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/ProducerScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {254, 255}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "remaining"}, s = {"L$0", "I$0", "L$0", "I$0"})
/* loaded from: classes5.dex */
final class ChannelsKt__DeprecatedKt$take$1 extends SuspendLambda implements Function2<ProducerScope<? super E>, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $n;
    final /* synthetic */ ReceiveChannel<E> $this_take;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsKt__DeprecatedKt$take$1(int i, ReceiveChannel<? extends E> receiveChannel, Continuation<? super ChannelsKt__DeprecatedKt$take$1> continuation) {
        super(2, continuation);
        this.$n = i;
        this.$this_take = receiveChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChannelsKt__DeprecatedKt$take$1 channelsKt__DeprecatedKt$take$1 = new ChannelsKt__DeprecatedKt$take$1(this.$n, this.$this_take, continuation);
        channelsKt__DeprecatedKt$take$1.L$0 = obj;
        return channelsKt__DeprecatedKt$take$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super E> producerScope, Continuation<? super Unit> continuation) {
        return ((ChannelsKt__DeprecatedKt$take$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0086 -> B:29:0x0088). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ProducerScope producerScope;
        int i;
        ChannelIterator it;
        ChannelsKt__DeprecatedKt$take$1 channelsKt__DeprecatedKt$take$1;
        ChannelsKt__DeprecatedKt$take$1 channelsKt__DeprecatedKt$take$12;
        ProducerScope producerScope2;
        Object hasNext;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            producerScope = (ProducerScope) this.L$0;
            i = this.$n;
            if (i == 0) {
                return Unit.INSTANCE;
            }
            if (!(i >= 0)) {
                throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
            }
            it = this.$this_take.iterator();
            channelsKt__DeprecatedKt$take$1 = this;
            channelsKt__DeprecatedKt$take$1.L$0 = producerScope;
            channelsKt__DeprecatedKt$take$1.L$1 = it;
            channelsKt__DeprecatedKt$take$1.I$0 = i;
            channelsKt__DeprecatedKt$take$1.label = 1;
            hasNext = it.hasNext(channelsKt__DeprecatedKt$take$1);
            if (hasNext == coroutine_suspended) {
            }
        } else if (i2 == 1) {
            i = this.I$0;
            it = (ChannelIterator) this.L$1;
            producerScope2 = (ProducerScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            channelsKt__DeprecatedKt$take$12 = this;
            if (!((Boolean) obj).booleanValue()) {
            }
        } else if (i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            i = this.I$0;
            it = (ChannelIterator) this.L$1;
            ResultKt.throwOnFailure(obj);
            producerScope = (ProducerScope) this.L$0;
            channelsKt__DeprecatedKt$take$1 = this;
            i--;
            if (i == 0) {
                return Unit.INSTANCE;
            }
            channelsKt__DeprecatedKt$take$1.L$0 = producerScope;
            channelsKt__DeprecatedKt$take$1.L$1 = it;
            channelsKt__DeprecatedKt$take$1.I$0 = i;
            channelsKt__DeprecatedKt$take$1.label = 1;
            hasNext = it.hasNext(channelsKt__DeprecatedKt$take$1);
            if (hasNext == coroutine_suspended) {
                return coroutine_suspended;
            }
            ChannelsKt__DeprecatedKt$take$1 channelsKt__DeprecatedKt$take$13 = channelsKt__DeprecatedKt$take$1;
            producerScope2 = producerScope;
            obj = hasNext;
            channelsKt__DeprecatedKt$take$12 = channelsKt__DeprecatedKt$take$13;
            if (!((Boolean) obj).booleanValue()) {
                channelsKt__DeprecatedKt$take$12.L$0 = producerScope2;
                channelsKt__DeprecatedKt$take$12.L$1 = it;
                channelsKt__DeprecatedKt$take$12.I$0 = i;
                channelsKt__DeprecatedKt$take$12.label = 2;
                if (producerScope2.send(it.next(), channelsKt__DeprecatedKt$take$12) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                producerScope = producerScope2;
                channelsKt__DeprecatedKt$take$1 = channelsKt__DeprecatedKt$take$12;
                i--;
                if (i == 0) {
                }
                channelsKt__DeprecatedKt$take$1.L$0 = producerScope;
                channelsKt__DeprecatedKt$take$1.L$1 = it;
                channelsKt__DeprecatedKt$take$1.I$0 = i;
                channelsKt__DeprecatedKt$take$1.label = 1;
                hasNext = it.hasNext(channelsKt__DeprecatedKt$take$1);
                if (hasNext == coroutine_suspended) {
                }
            } else {
                return Unit.INSTANCE;
            }
        }
    }
}
