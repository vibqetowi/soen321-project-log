package kotlinx.coroutines.channels;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
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
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2, 3, 4}, l = {181, 182, 183, 187, TsExtractor.TS_PACKET_SIZE}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0", "L$0", "L$0"})
/* loaded from: classes5.dex */
final class ChannelsKt__DeprecatedKt$dropWhile$1 extends SuspendLambda implements Function2<ProducerScope<? super E>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<E, Continuation<? super Boolean>, Object> $predicate;
    final /* synthetic */ ReceiveChannel<E> $this_dropWhile;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsKt__DeprecatedKt$dropWhile$1(ReceiveChannel<? extends E> receiveChannel, Function2<? super E, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super ChannelsKt__DeprecatedKt$dropWhile$1> continuation) {
        super(2, continuation);
        this.$this_dropWhile = receiveChannel;
        this.$predicate = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChannelsKt__DeprecatedKt$dropWhile$1 channelsKt__DeprecatedKt$dropWhile$1 = new ChannelsKt__DeprecatedKt$dropWhile$1(this.$this_dropWhile, this.$predicate, continuation);
        channelsKt__DeprecatedKt$dropWhile$1.L$0 = obj;
        return channelsKt__DeprecatedKt$dropWhile$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super E> producerScope, Continuation<? super Unit> continuation) {
        return ((ChannelsKt__DeprecatedKt$dropWhile$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0111  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00b5 -> B:27:0x00b9). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x010f -> B:35:0x00e0). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ChannelIterator it;
        ProducerScope producerScope;
        ChannelsKt__DeprecatedKt$dropWhile$1 channelsKt__DeprecatedKt$dropWhile$1;
        ProducerScope producerScope2;
        ChannelIterator channelIterator;
        Object obj2;
        ChannelsKt__DeprecatedKt$dropWhile$1 channelsKt__DeprecatedKt$dropWhile$12;
        ProducerScope producerScope3;
        Object hasNext;
        ChannelIterator it2;
        ChannelIterator channelIterator2;
        Object hasNext2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            it = this.$this_dropWhile.iterator();
            producerScope = (ProducerScope) this.L$0;
            channelsKt__DeprecatedKt$dropWhile$1 = this;
            channelsKt__DeprecatedKt$dropWhile$1.L$0 = producerScope;
            channelsKt__DeprecatedKt$dropWhile$1.L$1 = it;
            channelsKt__DeprecatedKt$dropWhile$1.L$2 = null;
            channelsKt__DeprecatedKt$dropWhile$1.label = 1;
            hasNext = it.hasNext(channelsKt__DeprecatedKt$dropWhile$1);
            if (hasNext != coroutine_suspended) {
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            producerScope2 = (ProducerScope) this.L$0;
            channelIterator = (ChannelIterator) this.L$1;
            obj2 = coroutine_suspended;
            channelsKt__DeprecatedKt$dropWhile$12 = this;
            if (((Boolean) obj).booleanValue()) {
            }
            it2 = channelsKt__DeprecatedKt$dropWhile$12.$this_dropWhile.iterator();
            channelsKt__DeprecatedKt$dropWhile$12.L$0 = producerScope2;
            channelsKt__DeprecatedKt$dropWhile$12.L$1 = it2;
            channelsKt__DeprecatedKt$dropWhile$12.label = 4;
            hasNext2 = it2.hasNext(channelsKt__DeprecatedKt$dropWhile$12);
            if (hasNext2 != obj2) {
            }
        } else if (i == 2) {
            Object obj3 = this.L$2;
            channelIterator = (ChannelIterator) this.L$1;
            ResultKt.throwOnFailure(obj);
            producerScope3 = (ProducerScope) this.L$0;
            Object obj4 = obj3;
            obj2 = coroutine_suspended;
            channelsKt__DeprecatedKt$dropWhile$12 = this;
            if (((Boolean) obj).booleanValue()) {
                channelsKt__DeprecatedKt$dropWhile$12.L$0 = producerScope3;
                channelsKt__DeprecatedKt$dropWhile$12.L$1 = null;
                channelsKt__DeprecatedKt$dropWhile$12.L$2 = null;
                channelsKt__DeprecatedKt$dropWhile$12.label = 3;
                if (producerScope3.send(obj4, channelsKt__DeprecatedKt$dropWhile$12) == obj2) {
                    return obj2;
                }
                producerScope2 = producerScope3;
                it2 = channelsKt__DeprecatedKt$dropWhile$12.$this_dropWhile.iterator();
                channelsKt__DeprecatedKt$dropWhile$12.L$0 = producerScope2;
                channelsKt__DeprecatedKt$dropWhile$12.L$1 = it2;
                channelsKt__DeprecatedKt$dropWhile$12.label = 4;
                hasNext2 = it2.hasNext(channelsKt__DeprecatedKt$dropWhile$12);
                if (hasNext2 != obj2) {
                }
            } else {
                channelsKt__DeprecatedKt$dropWhile$1 = channelsKt__DeprecatedKt$dropWhile$12;
                coroutine_suspended = obj2;
                it = channelIterator;
                producerScope = producerScope3;
                channelsKt__DeprecatedKt$dropWhile$1.L$0 = producerScope;
                channelsKt__DeprecatedKt$dropWhile$1.L$1 = it;
                channelsKt__DeprecatedKt$dropWhile$1.L$2 = null;
                channelsKt__DeprecatedKt$dropWhile$1.label = 1;
                hasNext = it.hasNext(channelsKt__DeprecatedKt$dropWhile$1);
                if (hasNext != coroutine_suspended) {
                    return coroutine_suspended;
                }
                Object obj5 = coroutine_suspended;
                channelsKt__DeprecatedKt$dropWhile$12 = channelsKt__DeprecatedKt$dropWhile$1;
                obj = hasNext;
                producerScope2 = producerScope;
                channelIterator = it;
                obj2 = obj5;
                if (((Boolean) obj).booleanValue()) {
                    Object next = channelIterator.next();
                    Function2<E, Continuation<? super Boolean>, Object> function2 = channelsKt__DeprecatedKt$dropWhile$12.$predicate;
                    channelsKt__DeprecatedKt$dropWhile$12.L$0 = producerScope2;
                    channelsKt__DeprecatedKt$dropWhile$12.L$1 = channelIterator;
                    channelsKt__DeprecatedKt$dropWhile$12.L$2 = next;
                    channelsKt__DeprecatedKt$dropWhile$12.label = 2;
                    Object invoke = function2.invoke(next, channelsKt__DeprecatedKt$dropWhile$12);
                    if (invoke == obj2) {
                        return obj2;
                    }
                    ProducerScope producerScope4 = producerScope2;
                    obj4 = next;
                    obj = invoke;
                    producerScope3 = producerScope4;
                    if (((Boolean) obj).booleanValue()) {
                    }
                }
                it2 = channelsKt__DeprecatedKt$dropWhile$12.$this_dropWhile.iterator();
                channelsKt__DeprecatedKt$dropWhile$12.L$0 = producerScope2;
                channelsKt__DeprecatedKt$dropWhile$12.L$1 = it2;
                channelsKt__DeprecatedKt$dropWhile$12.label = 4;
                hasNext2 = it2.hasNext(channelsKt__DeprecatedKt$dropWhile$12);
                if (hasNext2 != obj2) {
                }
            }
        } else if (i == 3) {
            ResultKt.throwOnFailure(obj);
            producerScope3 = (ProducerScope) this.L$0;
            obj2 = coroutine_suspended;
            channelsKt__DeprecatedKt$dropWhile$12 = this;
            producerScope2 = producerScope3;
            it2 = channelsKt__DeprecatedKt$dropWhile$12.$this_dropWhile.iterator();
            channelsKt__DeprecatedKt$dropWhile$12.L$0 = producerScope2;
            channelsKt__DeprecatedKt$dropWhile$12.L$1 = it2;
            channelsKt__DeprecatedKt$dropWhile$12.label = 4;
            hasNext2 = it2.hasNext(channelsKt__DeprecatedKt$dropWhile$12);
            if (hasNext2 != obj2) {
            }
        } else if (i == 4) {
            ResultKt.throwOnFailure(obj);
            producerScope2 = (ProducerScope) this.L$0;
            channelIterator2 = (ChannelIterator) this.L$1;
            obj2 = coroutine_suspended;
            channelsKt__DeprecatedKt$dropWhile$12 = this;
            if (!((Boolean) obj).booleanValue()) {
            }
        } else if (i != 5) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
            it2 = (ChannelIterator) this.L$1;
            producerScope2 = (ProducerScope) this.L$0;
            obj2 = coroutine_suspended;
            channelsKt__DeprecatedKt$dropWhile$12 = this;
            channelsKt__DeprecatedKt$dropWhile$12.L$0 = producerScope2;
            channelsKt__DeprecatedKt$dropWhile$12.L$1 = it2;
            channelsKt__DeprecatedKt$dropWhile$12.label = 4;
            hasNext2 = it2.hasNext(channelsKt__DeprecatedKt$dropWhile$12);
            if (hasNext2 != obj2) {
                return obj2;
            }
            channelIterator2 = it2;
            obj = hasNext2;
            if (!((Boolean) obj).booleanValue()) {
                channelsKt__DeprecatedKt$dropWhile$12.L$0 = producerScope2;
                channelsKt__DeprecatedKt$dropWhile$12.L$1 = channelIterator2;
                channelsKt__DeprecatedKt$dropWhile$12.label = 5;
                if (producerScope2.send(channelIterator2.next(), channelsKt__DeprecatedKt$dropWhile$12) == obj2) {
                    return obj2;
                }
                it2 = channelIterator2;
                channelsKt__DeprecatedKt$dropWhile$12.L$0 = producerScope2;
                channelsKt__DeprecatedKt$dropWhile$12.L$1 = it2;
                channelsKt__DeprecatedKt$dropWhile$12.label = 4;
                hasNext2 = it2.hasNext(channelsKt__DeprecatedKt$dropWhile$12);
                if (hasNext2 != obj2) {
                }
            } else {
                return Unit.INSTANCE;
            }
        }
    }
}
