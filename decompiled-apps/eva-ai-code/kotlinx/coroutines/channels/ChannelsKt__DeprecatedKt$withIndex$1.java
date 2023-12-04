package kotlinx.coroutines.channels;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
/* compiled from: Deprecated.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@"}, d2 = {ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/collections/IndexedValue;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {370, 371}, m = "invokeSuspend", n = {"$this$produce", FirebaseAnalytics.Param.INDEX, "$this$produce", FirebaseAnalytics.Param.INDEX}, s = {"L$0", "I$0", "L$0", "I$0"})
/* loaded from: classes5.dex */
final class ChannelsKt__DeprecatedKt$withIndex$1 extends SuspendLambda implements Function2<ProducerScope<? super IndexedValue<? extends E>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ReceiveChannel<E> $this_withIndex;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsKt__DeprecatedKt$withIndex$1(ReceiveChannel<? extends E> receiveChannel, Continuation<? super ChannelsKt__DeprecatedKt$withIndex$1> continuation) {
        super(2, continuation);
        this.$this_withIndex = receiveChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChannelsKt__DeprecatedKt$withIndex$1 channelsKt__DeprecatedKt$withIndex$1 = new ChannelsKt__DeprecatedKt$withIndex$1(this.$this_withIndex, continuation);
        channelsKt__DeprecatedKt$withIndex$1.L$0 = obj;
        return channelsKt__DeprecatedKt$withIndex$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super IndexedValue<? extends E>> producerScope, Continuation<? super Unit> continuation) {
        return ((ChannelsKt__DeprecatedKt$withIndex$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0085 -> B:11:0x0047). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ProducerScope producerScope;
        ChannelIterator it;
        int i;
        ChannelsKt__DeprecatedKt$withIndex$1 channelsKt__DeprecatedKt$withIndex$1;
        ChannelsKt__DeprecatedKt$withIndex$1 channelsKt__DeprecatedKt$withIndex$12;
        ProducerScope producerScope2;
        ChannelIterator channelIterator;
        int i2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            producerScope = (ProducerScope) this.L$0;
            it = this.$this_withIndex.iterator();
            i = 0;
            channelsKt__DeprecatedKt$withIndex$1 = this;
        } else if (i3 == 1) {
            i2 = this.I$0;
            channelIterator = (ChannelIterator) this.L$1;
            producerScope2 = (ProducerScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            channelsKt__DeprecatedKt$withIndex$12 = this;
            if (!((Boolean) obj).booleanValue()) {
                int i4 = i2 + 1;
                channelsKt__DeprecatedKt$withIndex$12.L$0 = producerScope2;
                channelsKt__DeprecatedKt$withIndex$12.L$1 = channelIterator;
                channelsKt__DeprecatedKt$withIndex$12.I$0 = i4;
                channelsKt__DeprecatedKt$withIndex$12.label = 2;
                if (producerScope2.send(new IndexedValue(i2, channelIterator.next()), channelsKt__DeprecatedKt$withIndex$12) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                it = channelIterator;
                producerScope = producerScope2;
                channelsKt__DeprecatedKt$withIndex$1 = channelsKt__DeprecatedKt$withIndex$12;
                i = i4;
            } else {
                return Unit.INSTANCE;
            }
        } else if (i3 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            int i5 = this.I$0;
            ChannelIterator channelIterator2 = (ChannelIterator) this.L$1;
            ResultKt.throwOnFailure(obj);
            producerScope = (ProducerScope) this.L$0;
            channelsKt__DeprecatedKt$withIndex$1 = this;
            i = i5;
            it = channelIterator2;
        }
        channelsKt__DeprecatedKt$withIndex$1.L$0 = producerScope;
        channelsKt__DeprecatedKt$withIndex$1.L$1 = it;
        channelsKt__DeprecatedKt$withIndex$1.I$0 = i;
        channelsKt__DeprecatedKt$withIndex$1.label = 1;
        Object hasNext = it.hasNext(channelsKt__DeprecatedKt$withIndex$1);
        if (hasNext == coroutine_suspended) {
            return coroutine_suspended;
        }
        ChannelsKt__DeprecatedKt$withIndex$1 channelsKt__DeprecatedKt$withIndex$13 = channelsKt__DeprecatedKt$withIndex$1;
        producerScope2 = producerScope;
        obj = hasNext;
        channelsKt__DeprecatedKt$withIndex$12 = channelsKt__DeprecatedKt$withIndex$13;
        int i6 = i;
        channelIterator = it;
        i2 = i6;
        if (!((Boolean) obj).booleanValue()) {
        }
    }
}
