package kotlinx.coroutines.channels;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Deprecated.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"}, d2 = {ExifInterface.LONGITUDE_EAST, "K", "Lkotlinx/coroutines/channels/ProducerScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2, 2}, l = {387, 388, 390}, m = "invokeSuspend", n = {"$this$produce", UserMetadata.KEYDATA_FILENAME, "$this$produce", UserMetadata.KEYDATA_FILENAME, "e", "$this$produce", UserMetadata.KEYDATA_FILENAME, "k"}, s = {"L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3"})
/* loaded from: classes5.dex */
public final class ChannelsKt__DeprecatedKt$distinctBy$1 extends SuspendLambda implements Function2<ProducerScope<? super E>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<E, Continuation<? super K>, Object> $selector;
    final /* synthetic */ ReceiveChannel<E> $this_distinctBy;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsKt__DeprecatedKt$distinctBy$1(ReceiveChannel<? extends E> receiveChannel, Function2<? super E, ? super Continuation<? super K>, ? extends Object> function2, Continuation<? super ChannelsKt__DeprecatedKt$distinctBy$1> continuation) {
        super(2, continuation);
        this.$this_distinctBy = receiveChannel;
        this.$selector = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChannelsKt__DeprecatedKt$distinctBy$1 channelsKt__DeprecatedKt$distinctBy$1 = new ChannelsKt__DeprecatedKt$distinctBy$1(this.$this_distinctBy, this.$selector, continuation);
        channelsKt__DeprecatedKt$distinctBy$1.L$0 = obj;
        return channelsKt__DeprecatedKt$distinctBy$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super E> producerScope, Continuation<? super Unit> continuation) {
        return ((ChannelsKt__DeprecatedKt$distinctBy$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00cb -> B:29:0x00d1). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00db -> B:13:0x0071). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ProducerScope producerScope;
        ChannelsKt__DeprecatedKt$distinctBy$1 channelsKt__DeprecatedKt$distinctBy$1;
        HashSet hashSet;
        ChannelIterator channelIterator;
        ProducerScope producerScope2;
        HashSet hashSet2;
        Object obj2;
        ChannelIterator channelIterator2;
        Object obj3;
        ChannelsKt__DeprecatedKt$distinctBy$1 channelsKt__DeprecatedKt$distinctBy$12;
        ProducerScope producerScope3;
        HashSet hashSet3;
        Object hasNext;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            HashSet hashSet4 = new HashSet();
            ChannelIterator it = this.$this_distinctBy.iterator();
            producerScope = (ProducerScope) this.L$0;
            channelsKt__DeprecatedKt$distinctBy$1 = this;
            hashSet = hashSet4;
            channelIterator = it;
            channelsKt__DeprecatedKt$distinctBy$1.L$0 = producerScope;
            channelsKt__DeprecatedKt$distinctBy$1.L$1 = hashSet;
            channelsKt__DeprecatedKt$distinctBy$1.L$2 = channelIterator;
            channelsKt__DeprecatedKt$distinctBy$1.L$3 = null;
            channelsKt__DeprecatedKt$distinctBy$1.label = 1;
            hasNext = channelIterator.hasNext(channelsKt__DeprecatedKt$distinctBy$1);
            if (hasNext != coroutine_suspended) {
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            producerScope3 = (ProducerScope) this.L$0;
            hashSet3 = (HashSet) this.L$1;
            channelIterator2 = (ChannelIterator) this.L$2;
            obj3 = coroutine_suspended;
            channelsKt__DeprecatedKt$distinctBy$12 = this;
            if (!((Boolean) obj).booleanValue()) {
            }
        } else if (i == 2) {
            Object obj4 = this.L$3;
            channelIterator2 = (ChannelIterator) this.L$2;
            ResultKt.throwOnFailure(obj);
            producerScope2 = (ProducerScope) this.L$0;
            hashSet2 = (HashSet) this.L$1;
            obj2 = obj4;
            obj3 = coroutine_suspended;
            channelsKt__DeprecatedKt$distinctBy$12 = this;
            if (hashSet2.contains(obj)) {
            }
        } else if (i != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            Object obj5 = this.L$3;
            channelIterator2 = (ChannelIterator) this.L$2;
            HashSet hashSet5 = (HashSet) this.L$1;
            ProducerScope producerScope4 = (ProducerScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            channelsKt__DeprecatedKt$distinctBy$1 = this;
            hashSet5.add(obj5);
            channelIterator = channelIterator2;
            hashSet = hashSet5;
            producerScope = producerScope4;
            channelsKt__DeprecatedKt$distinctBy$1.L$0 = producerScope;
            channelsKt__DeprecatedKt$distinctBy$1.L$1 = hashSet;
            channelsKt__DeprecatedKt$distinctBy$1.L$2 = channelIterator;
            channelsKt__DeprecatedKt$distinctBy$1.L$3 = null;
            channelsKt__DeprecatedKt$distinctBy$1.label = 1;
            hasNext = channelIterator.hasNext(channelsKt__DeprecatedKt$distinctBy$1);
            if (hasNext != coroutine_suspended) {
                return coroutine_suspended;
            }
            Object obj6 = coroutine_suspended;
            channelsKt__DeprecatedKt$distinctBy$12 = channelsKt__DeprecatedKt$distinctBy$1;
            obj = hasNext;
            producerScope3 = producerScope;
            hashSet3 = hashSet;
            channelIterator2 = channelIterator;
            obj3 = obj6;
            if (!((Boolean) obj).booleanValue()) {
                Object next = channelIterator2.next();
                Function2<E, Continuation<? super K>, Object> function2 = channelsKt__DeprecatedKt$distinctBy$12.$selector;
                channelsKt__DeprecatedKt$distinctBy$12.L$0 = producerScope3;
                channelsKt__DeprecatedKt$distinctBy$12.L$1 = hashSet3;
                channelsKt__DeprecatedKt$distinctBy$12.L$2 = channelIterator2;
                channelsKt__DeprecatedKt$distinctBy$12.L$3 = next;
                channelsKt__DeprecatedKt$distinctBy$12.label = 2;
                Object invoke = function2.invoke(next, channelsKt__DeprecatedKt$distinctBy$12);
                if (invoke == obj3) {
                    return obj3;
                }
                HashSet hashSet6 = hashSet3;
                obj2 = next;
                obj = invoke;
                producerScope2 = producerScope3;
                hashSet2 = hashSet6;
                if (hashSet2.contains(obj)) {
                    channelsKt__DeprecatedKt$distinctBy$12.L$0 = producerScope2;
                    channelsKt__DeprecatedKt$distinctBy$12.L$1 = hashSet2;
                    channelsKt__DeprecatedKt$distinctBy$12.L$2 = channelIterator2;
                    channelsKt__DeprecatedKt$distinctBy$12.L$3 = obj;
                    channelsKt__DeprecatedKt$distinctBy$12.label = 3;
                    if (producerScope2.send(obj2, channelsKt__DeprecatedKt$distinctBy$12) == obj3) {
                        return obj3;
                    }
                    hashSet5 = hashSet2;
                    producerScope4 = producerScope2;
                    Object obj7 = obj3;
                    obj5 = obj;
                    channelsKt__DeprecatedKt$distinctBy$1 = channelsKt__DeprecatedKt$distinctBy$12;
                    coroutine_suspended = obj7;
                    hashSet5.add(obj5);
                    channelIterator = channelIterator2;
                    hashSet = hashSet5;
                    producerScope = producerScope4;
                    channelsKt__DeprecatedKt$distinctBy$1.L$0 = producerScope;
                    channelsKt__DeprecatedKt$distinctBy$1.L$1 = hashSet;
                    channelsKt__DeprecatedKt$distinctBy$1.L$2 = channelIterator;
                    channelsKt__DeprecatedKt$distinctBy$1.L$3 = null;
                    channelsKt__DeprecatedKt$distinctBy$1.label = 1;
                    hasNext = channelIterator.hasNext(channelsKt__DeprecatedKt$distinctBy$1);
                    if (hasNext != coroutine_suspended) {
                    }
                } else {
                    channelsKt__DeprecatedKt$distinctBy$1 = channelsKt__DeprecatedKt$distinctBy$12;
                    coroutine_suspended = obj3;
                    channelIterator = channelIterator2;
                    hashSet = hashSet2;
                    producerScope = producerScope2;
                    channelsKt__DeprecatedKt$distinctBy$1.L$0 = producerScope;
                    channelsKt__DeprecatedKt$distinctBy$1.L$1 = hashSet;
                    channelsKt__DeprecatedKt$distinctBy$1.L$2 = channelIterator;
                    channelsKt__DeprecatedKt$distinctBy$1.L$3 = null;
                    channelsKt__DeprecatedKt$distinctBy$1.label = 1;
                    hasNext = channelIterator.hasNext(channelsKt__DeprecatedKt$distinctBy$1);
                    if (hasNext != coroutine_suspended) {
                    }
                }
            } else {
                return Unit.INSTANCE;
            }
        }
    }
}
