package kotlinx.coroutines.channels;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
/* compiled from: Deprecated.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/ProducerScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2}, l = {211, 212, 212}, m = "invokeSuspend", n = {"$this$produce", FirebaseAnalytics.Param.INDEX, "$this$produce", "e", FirebaseAnalytics.Param.INDEX, "$this$produce", FirebaseAnalytics.Param.INDEX}, s = {"L$0", "I$0", "L$0", "L$2", "I$0", "L$0", "I$0"})
/* loaded from: classes5.dex */
final class ChannelsKt__DeprecatedKt$filterIndexed$1 extends SuspendLambda implements Function2<ProducerScope<? super E>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function3<Integer, E, Continuation<? super Boolean>, Object> $predicate;
    final /* synthetic */ ReceiveChannel<E> $this_filterIndexed;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsKt__DeprecatedKt$filterIndexed$1(ReceiveChannel<? extends E> receiveChannel, Function3<? super Integer, ? super E, ? super Continuation<? super Boolean>, ? extends Object> function3, Continuation<? super ChannelsKt__DeprecatedKt$filterIndexed$1> continuation) {
        super(2, continuation);
        this.$this_filterIndexed = receiveChannel;
        this.$predicate = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChannelsKt__DeprecatedKt$filterIndexed$1 channelsKt__DeprecatedKt$filterIndexed$1 = new ChannelsKt__DeprecatedKt$filterIndexed$1(this.$this_filterIndexed, this.$predicate, continuation);
        channelsKt__DeprecatedKt$filterIndexed$1.L$0 = obj;
        return channelsKt__DeprecatedKt$filterIndexed$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super E> producerScope, Continuation<? super Unit> continuation) {
        return ((ChannelsKt__DeprecatedKt$filterIndexed$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c6 -> B:14:0x0066). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ProducerScope producerScope;
        ChannelsKt__DeprecatedKt$filterIndexed$1 channelsKt__DeprecatedKt$filterIndexed$1;
        ChannelIterator it;
        int i;
        ChannelIterator channelIterator;
        int i2;
        ProducerScope producerScope2;
        Object obj2;
        Object obj3;
        ChannelsKt__DeprecatedKt$filterIndexed$1 channelsKt__DeprecatedKt$filterIndexed$12;
        ChannelIterator channelIterator2;
        int i3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            producerScope = (ProducerScope) this.L$0;
            channelsKt__DeprecatedKt$filterIndexed$1 = this;
            it = this.$this_filterIndexed.iterator();
            i = 0;
        } else if (i4 == 1) {
            int i5 = this.I$0;
            ResultKt.throwOnFailure(obj);
            producerScope2 = (ProducerScope) this.L$0;
            channelIterator2 = (ChannelIterator) this.L$1;
            i3 = i5;
            obj3 = coroutine_suspended;
            channelsKt__DeprecatedKt$filterIndexed$12 = this;
            if (!((Boolean) obj).booleanValue()) {
                Object next = channelIterator2.next();
                Function3<Integer, E, Continuation<? super Boolean>, Object> function3 = channelsKt__DeprecatedKt$filterIndexed$12.$predicate;
                i2 = i3 + 1;
                Integer boxInt = Boxing.boxInt(i3);
                channelsKt__DeprecatedKt$filterIndexed$12.L$0 = producerScope2;
                channelsKt__DeprecatedKt$filterIndexed$12.L$1 = channelIterator2;
                channelsKt__DeprecatedKt$filterIndexed$12.L$2 = next;
                channelsKt__DeprecatedKt$filterIndexed$12.I$0 = i2;
                channelsKt__DeprecatedKt$filterIndexed$12.label = 2;
                Object invoke = function3.invoke(boxInt, next, channelsKt__DeprecatedKt$filterIndexed$12);
                if (invoke == obj3) {
                    return obj3;
                }
                channelIterator = channelIterator2;
                obj2 = next;
                obj = invoke;
                it = channelIterator;
                if (((Boolean) obj).booleanValue()) {
                }
                channelsKt__DeprecatedKt$filterIndexed$1 = channelsKt__DeprecatedKt$filterIndexed$12;
                coroutine_suspended = obj3;
                producerScope = producerScope2;
                i = i2;
            } else {
                return Unit.INSTANCE;
            }
        } else if (i4 == 2) {
            int i6 = this.I$0;
            Object obj4 = this.L$2;
            producerScope2 = (ProducerScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            i2 = i6;
            obj3 = coroutine_suspended;
            channelsKt__DeprecatedKt$filterIndexed$12 = this;
            channelIterator = (ChannelIterator) this.L$1;
            obj2 = obj4;
            it = channelIterator;
            if (((Boolean) obj).booleanValue()) {
                channelsKt__DeprecatedKt$filterIndexed$12.L$0 = producerScope2;
                channelsKt__DeprecatedKt$filterIndexed$12.L$1 = it;
                channelsKt__DeprecatedKt$filterIndexed$12.L$2 = null;
                channelsKt__DeprecatedKt$filterIndexed$12.I$0 = i2;
                channelsKt__DeprecatedKt$filterIndexed$12.label = 3;
                if (producerScope2.send(obj2, channelsKt__DeprecatedKt$filterIndexed$12) == obj3) {
                    return obj3;
                }
            }
            channelsKt__DeprecatedKt$filterIndexed$1 = channelsKt__DeprecatedKt$filterIndexed$12;
            coroutine_suspended = obj3;
            producerScope = producerScope2;
            i = i2;
        } else if (i4 != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            i = this.I$0;
            it = (ChannelIterator) this.L$1;
            producerScope = (ProducerScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            channelsKt__DeprecatedKt$filterIndexed$1 = this;
        }
        channelsKt__DeprecatedKt$filterIndexed$1.L$0 = producerScope;
        channelsKt__DeprecatedKt$filterIndexed$1.L$1 = it;
        channelsKt__DeprecatedKt$filterIndexed$1.L$2 = null;
        channelsKt__DeprecatedKt$filterIndexed$1.I$0 = i;
        channelsKt__DeprecatedKt$filterIndexed$1.label = 1;
        Object hasNext = it.hasNext(channelsKt__DeprecatedKt$filterIndexed$1);
        if (hasNext == coroutine_suspended) {
            return coroutine_suspended;
        }
        Object obj5 = coroutine_suspended;
        channelsKt__DeprecatedKt$filterIndexed$12 = channelsKt__DeprecatedKt$filterIndexed$1;
        obj = hasNext;
        producerScope2 = producerScope;
        channelIterator2 = it;
        i3 = i;
        obj3 = obj5;
        if (!((Boolean) obj).booleanValue()) {
        }
    }
}
