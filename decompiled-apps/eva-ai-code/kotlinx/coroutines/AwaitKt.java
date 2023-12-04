package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
/* compiled from: Await.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\u001a=\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u001e\u0010\u0003\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004\"\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u001a%\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0004\"\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a-\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\r\u001a\u001b\u0010\u0007\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\n0\fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"awaitAll", "", ExifInterface.GPS_DIRECTION_TRUE, "deferreds", "", "Lkotlinx/coroutines/Deferred;", "([Lkotlinx/coroutines/Deferred;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "joinAll", "", "jobs", "Lkotlinx/coroutines/Job;", "([Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AwaitKt {
    public static final <T> Object awaitAll(Deferred<? extends T>[] deferredArr, Continuation<? super List<? extends T>> continuation) {
        return deferredArr.length == 0 ? CollectionsKt.emptyList() : new AwaitAll(deferredArr).await(continuation);
    }

    public static final <T> Object awaitAll(Collection<? extends Deferred<? extends T>> collection, Continuation<? super List<? extends T>> continuation) {
        return collection.isEmpty() ? CollectionsKt.emptyList() : new AwaitAll((Deferred[]) collection.toArray(new Deferred[0])).await(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0053 -> B:19:0x0056). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object joinAll(Job[] jobArr, Continuation<? super Unit> continuation) {
        AwaitKt$joinAll$1 awaitKt$joinAll$1;
        int i;
        int i2;
        Job[] jobArr2;
        int length;
        if (continuation instanceof AwaitKt$joinAll$1) {
            awaitKt$joinAll$1 = (AwaitKt$joinAll$1) continuation;
            if ((awaitKt$joinAll$1.label & Integer.MIN_VALUE) != 0) {
                awaitKt$joinAll$1.label -= Integer.MIN_VALUE;
                Object obj = awaitKt$joinAll$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = awaitKt$joinAll$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    i2 = 0;
                    jobArr2 = jobArr;
                    length = jobArr.length;
                    if (i2 < length) {
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    length = awaitKt$joinAll$1.I$1;
                    i2 = awaitKt$joinAll$1.I$0;
                    ResultKt.throwOnFailure(obj);
                    jobArr2 = (Job[]) awaitKt$joinAll$1.L$0;
                    i2++;
                    if (i2 < length) {
                        Job job = jobArr2[i2];
                        awaitKt$joinAll$1.L$0 = jobArr2;
                        awaitKt$joinAll$1.I$0 = i2;
                        awaitKt$joinAll$1.I$1 = length;
                        awaitKt$joinAll$1.label = 1;
                        if (job.join(awaitKt$joinAll$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i2++;
                        if (i2 < length) {
                            return Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        awaitKt$joinAll$1 = new AwaitKt$joinAll$1(continuation);
        Object obj2 = awaitKt$joinAll$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = awaitKt$joinAll$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object joinAll(Collection<? extends Job> collection, Continuation<? super Unit> continuation) {
        AwaitKt$joinAll$3 awaitKt$joinAll$3;
        int i;
        Iterator it;
        if (continuation instanceof AwaitKt$joinAll$3) {
            awaitKt$joinAll$3 = (AwaitKt$joinAll$3) continuation;
            if ((awaitKt$joinAll$3.label & Integer.MIN_VALUE) != 0) {
                awaitKt$joinAll$3.label -= Integer.MIN_VALUE;
                Object obj = awaitKt$joinAll$3.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = awaitKt$joinAll$3.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    it = collection.iterator();
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    it = (Iterator) awaitKt$joinAll$3.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                while (it.hasNext()) {
                    awaitKt$joinAll$3.L$0 = it;
                    awaitKt$joinAll$3.label = 1;
                    if (((Job) it.next()).join(awaitKt$joinAll$3) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        awaitKt$joinAll$3 = new AwaitKt$joinAll$3(continuation);
        Object obj2 = awaitKt$joinAll$3.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = awaitKt$joinAll$3.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }
}
