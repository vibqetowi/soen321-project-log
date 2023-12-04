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
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Deprecated.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {ExifInterface.LONGITUDE_EAST, "R", "Lkotlinx/coroutines/channels/ProducerScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {344, 345, 345}, m = "invokeSuspend", n = {"$this$produce", FirebaseAnalytics.Param.INDEX, "$this$produce", FirebaseAnalytics.Param.INDEX, "$this$produce", FirebaseAnalytics.Param.INDEX}, s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0"})
/* loaded from: classes5.dex */
public final class ChannelsKt__DeprecatedKt$mapIndexed$1 extends SuspendLambda implements Function2<ProducerScope<? super R>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ReceiveChannel<E> $this_mapIndexed;
    final /* synthetic */ Function3<Integer, E, Continuation<? super R>, Object> $transform;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsKt__DeprecatedKt$mapIndexed$1(ReceiveChannel<? extends E> receiveChannel, Function3<? super Integer, ? super E, ? super Continuation<? super R>, ? extends Object> function3, Continuation<? super ChannelsKt__DeprecatedKt$mapIndexed$1> continuation) {
        super(2, continuation);
        this.$this_mapIndexed = receiveChannel;
        this.$transform = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChannelsKt__DeprecatedKt$mapIndexed$1 channelsKt__DeprecatedKt$mapIndexed$1 = new ChannelsKt__DeprecatedKt$mapIndexed$1(this.$this_mapIndexed, this.$transform, continuation);
        channelsKt__DeprecatedKt$mapIndexed$1.L$0 = obj;
        return channelsKt__DeprecatedKt$mapIndexed$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super R> producerScope, Continuation<? super Unit> continuation) {
        return ((ChannelsKt__DeprecatedKt$mapIndexed$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00b3 -> B:13:0x005e). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ProducerScope producerScope;
        ChannelsKt__DeprecatedKt$mapIndexed$1 channelsKt__DeprecatedKt$mapIndexed$1;
        ChannelIterator it;
        int i;
        ChannelsKt__DeprecatedKt$mapIndexed$1 channelsKt__DeprecatedKt$mapIndexed$12;
        ProducerScope producerScope2;
        ChannelIterator channelIterator;
        ProducerScope producerScope3;
        ChannelsKt__DeprecatedKt$mapIndexed$1 channelsKt__DeprecatedKt$mapIndexed$13;
        ProducerScope producerScope4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            producerScope = (ProducerScope) this.L$0;
            channelsKt__DeprecatedKt$mapIndexed$1 = this;
            it = this.$this_mapIndexed.iterator();
            i = 0;
        } else if (i2 == 1) {
            i = this.I$0;
            it = (ChannelIterator) this.L$1;
            producerScope4 = (ProducerScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            channelsKt__DeprecatedKt$mapIndexed$13 = this;
            if (!((Boolean) obj).booleanValue()) {
                Object next = it.next();
                Function3<Integer, E, Continuation<? super R>, Object> function3 = channelsKt__DeprecatedKt$mapIndexed$13.$transform;
                int i3 = i + 1;
                Integer boxInt = Boxing.boxInt(i);
                channelsKt__DeprecatedKt$mapIndexed$13.L$0 = producerScope4;
                channelsKt__DeprecatedKt$mapIndexed$13.L$1 = it;
                channelsKt__DeprecatedKt$mapIndexed$13.L$2 = producerScope4;
                channelsKt__DeprecatedKt$mapIndexed$13.I$0 = i3;
                channelsKt__DeprecatedKt$mapIndexed$13.label = 2;
                obj = function3.invoke(boxInt, next, channelsKt__DeprecatedKt$mapIndexed$13);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                channelsKt__DeprecatedKt$mapIndexed$12 = channelsKt__DeprecatedKt$mapIndexed$13;
                i = i3;
                producerScope2 = producerScope4;
                channelIterator = it;
                producerScope3 = producerScope2;
                channelsKt__DeprecatedKt$mapIndexed$12.L$0 = producerScope2;
                channelsKt__DeprecatedKt$mapIndexed$12.L$1 = channelIterator;
                channelsKt__DeprecatedKt$mapIndexed$12.L$2 = null;
                channelsKt__DeprecatedKt$mapIndexed$12.I$0 = i;
                channelsKt__DeprecatedKt$mapIndexed$12.label = 3;
                if (producerScope3.send(obj, channelsKt__DeprecatedKt$mapIndexed$12) != coroutine_suspended) {
                }
            } else {
                return Unit.INSTANCE;
            }
        } else if (i2 == 2) {
            i = this.I$0;
            producerScope3 = (ProducerScope) this.L$2;
            channelIterator = (ChannelIterator) this.L$1;
            producerScope2 = (ProducerScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            channelsKt__DeprecatedKt$mapIndexed$12 = this;
            channelsKt__DeprecatedKt$mapIndexed$12.L$0 = producerScope2;
            channelsKt__DeprecatedKt$mapIndexed$12.L$1 = channelIterator;
            channelsKt__DeprecatedKt$mapIndexed$12.L$2 = null;
            channelsKt__DeprecatedKt$mapIndexed$12.I$0 = i;
            channelsKt__DeprecatedKt$mapIndexed$12.label = 3;
            if (producerScope3.send(obj, channelsKt__DeprecatedKt$mapIndexed$12) != coroutine_suspended) {
                return coroutine_suspended;
            }
            it = channelIterator;
            producerScope = producerScope2;
            channelsKt__DeprecatedKt$mapIndexed$1 = channelsKt__DeprecatedKt$mapIndexed$12;
        } else if (i2 != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            i = this.I$0;
            it = (ChannelIterator) this.L$1;
            ResultKt.throwOnFailure(obj);
            producerScope = (ProducerScope) this.L$0;
            channelsKt__DeprecatedKt$mapIndexed$1 = this;
        }
        channelsKt__DeprecatedKt$mapIndexed$1.L$0 = producerScope;
        channelsKt__DeprecatedKt$mapIndexed$1.L$1 = it;
        channelsKt__DeprecatedKt$mapIndexed$1.I$0 = i;
        channelsKt__DeprecatedKt$mapIndexed$1.label = 1;
        Object hasNext = it.hasNext(channelsKt__DeprecatedKt$mapIndexed$1);
        if (hasNext == coroutine_suspended) {
            return coroutine_suspended;
        }
        ChannelsKt__DeprecatedKt$mapIndexed$1 channelsKt__DeprecatedKt$mapIndexed$14 = channelsKt__DeprecatedKt$mapIndexed$1;
        producerScope4 = producerScope;
        obj = hasNext;
        channelsKt__DeprecatedKt$mapIndexed$13 = channelsKt__DeprecatedKt$mapIndexed$14;
        if (!((Boolean) obj).booleanValue()) {
        }
    }
}
