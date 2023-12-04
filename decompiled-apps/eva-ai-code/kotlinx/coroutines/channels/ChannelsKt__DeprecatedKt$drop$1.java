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
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1", f = "Deprecated.kt", i = {0, 0, 1, 2}, l = {164, 169, 170}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "$this$produce"}, s = {"L$0", "I$0", "L$0", "L$0"})
/* loaded from: classes5.dex */
final class ChannelsKt__DeprecatedKt$drop$1 extends SuspendLambda implements Function2<ProducerScope<? super E>, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $n;
    final /* synthetic */ ReceiveChannel<E> $this_drop;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsKt__DeprecatedKt$drop$1(int i, ReceiveChannel<? extends E> receiveChannel, Continuation<? super ChannelsKt__DeprecatedKt$drop$1> continuation) {
        super(2, continuation);
        this.$n = i;
        this.$this_drop = receiveChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChannelsKt__DeprecatedKt$drop$1 channelsKt__DeprecatedKt$drop$1 = new ChannelsKt__DeprecatedKt$drop$1(this.$n, this.$this_drop, continuation);
        channelsKt__DeprecatedKt$drop$1.L$0 = obj;
        return channelsKt__DeprecatedKt$drop$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super E> producerScope, Continuation<? super Unit> continuation) {
        return ((ChannelsKt__DeprecatedKt$drop$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007a -> B:23:0x0081). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00d1 -> B:32:0x00a2). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ProducerScope producerScope;
        int i;
        Object obj2;
        ChannelsKt__DeprecatedKt$drop$1 channelsKt__DeprecatedKt$drop$1;
        ChannelIterator it;
        ProducerScope producerScope2;
        ChannelsKt__DeprecatedKt$drop$1 channelsKt__DeprecatedKt$drop$12;
        ChannelIterator it2;
        Object hasNext;
        ProducerScope producerScope3;
        Object hasNext2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            producerScope = (ProducerScope) this.L$0;
            i = this.$n;
            if (!(i >= 0)) {
                throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
            } else if (i > 0) {
                it = this.$this_drop.iterator();
                producerScope2 = producerScope;
                channelsKt__DeprecatedKt$drop$12 = this;
                channelsKt__DeprecatedKt$drop$12.L$0 = producerScope2;
                channelsKt__DeprecatedKt$drop$12.L$1 = it;
                channelsKt__DeprecatedKt$drop$12.I$0 = i;
                channelsKt__DeprecatedKt$drop$12.label = 1;
                hasNext = it.hasNext(channelsKt__DeprecatedKt$drop$12);
                if (hasNext != coroutine_suspended) {
                }
            } else {
                obj2 = coroutine_suspended;
                channelsKt__DeprecatedKt$drop$1 = this;
                it2 = channelsKt__DeprecatedKt$drop$1.$this_drop.iterator();
                channelsKt__DeprecatedKt$drop$1.L$0 = producerScope;
                channelsKt__DeprecatedKt$drop$1.L$1 = it2;
                channelsKt__DeprecatedKt$drop$1.label = 2;
                hasNext2 = it2.hasNext(channelsKt__DeprecatedKt$drop$1);
                if (hasNext2 != obj2) {
                }
            }
        } else if (i2 == 1) {
            int i3 = this.I$0;
            ResultKt.throwOnFailure(obj);
            ProducerScope producerScope4 = (ProducerScope) this.L$0;
            ChannelIterator channelIterator = (ChannelIterator) this.L$1;
            int i4 = i3;
            obj2 = coroutine_suspended;
            channelsKt__DeprecatedKt$drop$1 = this;
            if (((Boolean) obj).booleanValue()) {
                channelIterator.next();
                int i5 = i4 - 1;
                if (i5 != 0) {
                    it = channelIterator;
                    producerScope2 = producerScope4;
                    Object obj3 = obj2;
                    i = i5;
                    channelsKt__DeprecatedKt$drop$12 = channelsKt__DeprecatedKt$drop$1;
                    coroutine_suspended = obj3;
                    channelsKt__DeprecatedKt$drop$12.L$0 = producerScope2;
                    channelsKt__DeprecatedKt$drop$12.L$1 = it;
                    channelsKt__DeprecatedKt$drop$12.I$0 = i;
                    channelsKt__DeprecatedKt$drop$12.label = 1;
                    hasNext = it.hasNext(channelsKt__DeprecatedKt$drop$12);
                    if (hasNext != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Object obj4 = coroutine_suspended;
                    channelsKt__DeprecatedKt$drop$1 = channelsKt__DeprecatedKt$drop$12;
                    obj = hasNext;
                    producerScope4 = producerScope2;
                    channelIterator = it;
                    i4 = i;
                    obj2 = obj4;
                    if (((Boolean) obj).booleanValue()) {
                    }
                }
            }
            producerScope = producerScope4;
            it2 = channelsKt__DeprecatedKt$drop$1.$this_drop.iterator();
            channelsKt__DeprecatedKt$drop$1.L$0 = producerScope;
            channelsKt__DeprecatedKt$drop$1.L$1 = it2;
            channelsKt__DeprecatedKt$drop$1.label = 2;
            hasNext2 = it2.hasNext(channelsKt__DeprecatedKt$drop$1);
            if (hasNext2 != obj2) {
            }
        } else if (i2 == 2) {
            ResultKt.throwOnFailure(obj);
            producerScope3 = (ProducerScope) this.L$0;
            it2 = (ChannelIterator) this.L$1;
            obj2 = coroutine_suspended;
            channelsKt__DeprecatedKt$drop$1 = this;
            if (!((Boolean) obj).booleanValue()) {
            }
        } else if (i2 != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
            producerScope = (ProducerScope) this.L$0;
            it2 = (ChannelIterator) this.L$1;
            obj2 = coroutine_suspended;
            channelsKt__DeprecatedKt$drop$1 = this;
            channelsKt__DeprecatedKt$drop$1.L$0 = producerScope;
            channelsKt__DeprecatedKt$drop$1.L$1 = it2;
            channelsKt__DeprecatedKt$drop$1.label = 2;
            hasNext2 = it2.hasNext(channelsKt__DeprecatedKt$drop$1);
            if (hasNext2 != obj2) {
                return obj2;
            }
            producerScope3 = producerScope;
            obj = hasNext2;
            if (!((Boolean) obj).booleanValue()) {
                channelsKt__DeprecatedKt$drop$1.L$0 = producerScope3;
                channelsKt__DeprecatedKt$drop$1.L$1 = it2;
                channelsKt__DeprecatedKt$drop$1.label = 3;
                if (producerScope3.send(it2.next(), channelsKt__DeprecatedKt$drop$1) == obj2) {
                    return obj2;
                }
                producerScope = producerScope3;
                channelsKt__DeprecatedKt$drop$1.L$0 = producerScope;
                channelsKt__DeprecatedKt$drop$1.L$1 = it2;
                channelsKt__DeprecatedKt$drop$1.label = 2;
                hasNext2 = it2.hasNext(channelsKt__DeprecatedKt$drop$1);
                if (hasNext2 != obj2) {
                }
            } else {
                return Unit.INSTANCE;
            }
        }
    }
}
