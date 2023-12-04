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
@Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {ExifInterface.LONGITUDE_EAST, "R", "Lkotlinx/coroutines/channels/ProducerScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1", f = "Deprecated.kt", i = {0, 1, 2}, l = {321, 322, 322}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes5.dex */
final class ChannelsKt__DeprecatedKt$flatMap$1 extends SuspendLambda implements Function2<ProducerScope<? super R>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ReceiveChannel<E> $this_flatMap;
    final /* synthetic */ Function2<E, Continuation<? super ReceiveChannel<? extends R>>, Object> $transform;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsKt__DeprecatedKt$flatMap$1(ReceiveChannel<? extends E> receiveChannel, Function2<? super E, ? super Continuation<? super ReceiveChannel<? extends R>>, ? extends Object> function2, Continuation<? super ChannelsKt__DeprecatedKt$flatMap$1> continuation) {
        super(2, continuation);
        this.$this_flatMap = receiveChannel;
        this.$transform = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChannelsKt__DeprecatedKt$flatMap$1 channelsKt__DeprecatedKt$flatMap$1 = new ChannelsKt__DeprecatedKt$flatMap$1(this.$this_flatMap, this.$transform, continuation);
        channelsKt__DeprecatedKt$flatMap$1.L$0 = obj;
        return channelsKt__DeprecatedKt$flatMap$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super R> producerScope, Continuation<? super Unit> continuation) {
        return ((ChannelsKt__DeprecatedKt$flatMap$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009a -> B:14:0x0054). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ChannelIterator it;
        ProducerScope producerScope;
        ProducerScope producerScope2;
        ChannelIterator channelIterator;
        Object obj2;
        ChannelsKt__DeprecatedKt$flatMap$1 channelsKt__DeprecatedKt$flatMap$1;
        ChannelsKt__DeprecatedKt$flatMap$1 channelsKt__DeprecatedKt$flatMap$12;
        Object hasNext;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            it = this.$this_flatMap.iterator();
            producerScope = (ProducerScope) this.L$0;
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            producerScope2 = (ProducerScope) this.L$0;
            channelIterator = (ChannelIterator) this.L$1;
            obj2 = coroutine_suspended;
            channelsKt__DeprecatedKt$flatMap$1 = this;
            if (!((Boolean) obj).booleanValue()) {
            }
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            producerScope2 = (ProducerScope) this.L$0;
            channelIterator = (ChannelIterator) this.L$1;
            obj2 = coroutine_suspended;
            channelsKt__DeprecatedKt$flatMap$1 = this;
            channelsKt__DeprecatedKt$flatMap$1.L$0 = producerScope2;
            channelsKt__DeprecatedKt$flatMap$1.L$1 = channelIterator;
            channelsKt__DeprecatedKt$flatMap$1.label = 3;
            if (ChannelsKt.toChannel((ReceiveChannel) obj, producerScope2, channelsKt__DeprecatedKt$flatMap$1) != obj2) {
                return obj2;
            }
            channelsKt__DeprecatedKt$flatMap$12 = channelsKt__DeprecatedKt$flatMap$1;
            coroutine_suspended = obj2;
            it = channelIterator;
            producerScope = producerScope2;
            channelsKt__DeprecatedKt$flatMap$12.L$0 = producerScope;
            channelsKt__DeprecatedKt$flatMap$12.L$1 = it;
            channelsKt__DeprecatedKt$flatMap$12.label = 1;
            hasNext = it.hasNext(channelsKt__DeprecatedKt$flatMap$12);
            if (hasNext != coroutine_suspended) {
                return coroutine_suspended;
            }
            Object obj3 = coroutine_suspended;
            channelsKt__DeprecatedKt$flatMap$1 = channelsKt__DeprecatedKt$flatMap$12;
            obj = hasNext;
            producerScope2 = producerScope;
            channelIterator = it;
            obj2 = obj3;
            if (!((Boolean) obj).booleanValue()) {
                Object next = channelIterator.next();
                Function2<E, Continuation<? super ReceiveChannel<? extends R>>, Object> function2 = channelsKt__DeprecatedKt$flatMap$1.$transform;
                channelsKt__DeprecatedKt$flatMap$1.L$0 = producerScope2;
                channelsKt__DeprecatedKt$flatMap$1.L$1 = channelIterator;
                channelsKt__DeprecatedKt$flatMap$1.label = 2;
                obj = function2.invoke(next, channelsKt__DeprecatedKt$flatMap$1);
                if (obj == obj2) {
                    return obj2;
                }
                channelsKt__DeprecatedKt$flatMap$1.L$0 = producerScope2;
                channelsKt__DeprecatedKt$flatMap$1.L$1 = channelIterator;
                channelsKt__DeprecatedKt$flatMap$1.label = 3;
                if (ChannelsKt.toChannel((ReceiveChannel) obj, producerScope2, channelsKt__DeprecatedKt$flatMap$1) != obj2) {
                }
            } else {
                return Unit.INSTANCE;
            }
        } else if (i != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            it = (ChannelIterator) this.L$1;
            producerScope = (ProducerScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        channelsKt__DeprecatedKt$flatMap$12 = this;
        channelsKt__DeprecatedKt$flatMap$12.L$0 = producerScope;
        channelsKt__DeprecatedKt$flatMap$12.L$1 = it;
        channelsKt__DeprecatedKt$flatMap$12.label = 1;
        hasNext = it.hasNext(channelsKt__DeprecatedKt$flatMap$12);
        if (hasNext != coroutine_suspended) {
        }
    }
}
