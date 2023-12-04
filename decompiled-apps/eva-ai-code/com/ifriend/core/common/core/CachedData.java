package com.ifriend.core.common.core;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
/* compiled from: CachedData.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B:\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0013\u0010\u0013\u001a\u0004\u0018\u00018\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0014J\u0011\u0010\u0017\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u0011\u0010\u0018\u001a\u00020\u0019H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0014R\u001e\u0010\u000b\u001a\u0004\u0018\u00018\u0000X\u0084\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R)\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bX\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/ifriend/core/common/core/CachedData;", ExifInterface.GPS_DIRECTION_TRUE, "", "refreshIntervalMillis", "", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "loadDataFunction", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(JLkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function1;)V", "cachedData", "getCachedData", "()Ljava/lang/Object;", "setCachedData", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "lastUpdateTime", "Lkotlin/jvm/functions/Function1;", "getData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isDataStale", "", "loadData", "refreshData", "", "common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public class CachedData<T> {
    private T cachedData;
    private final CoroutineDispatcher dispatcher;
    private long lastUpdateTime;
    private final Function1<Continuation<? super T>, Object> loadDataFunction;
    private final long refreshIntervalMillis;

    public Object getData(Continuation<? super T> continuation) {
        return getData$suspendImpl(this, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CachedData(long j, CoroutineDispatcher dispatcher, Function1<? super Continuation<? super T>, ? extends Object> loadDataFunction) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(loadDataFunction, "loadDataFunction");
        this.refreshIntervalMillis = j;
        this.dispatcher = dispatcher;
        this.loadDataFunction = loadDataFunction;
    }

    public /* synthetic */ CachedData(long j, CoroutineDispatcher coroutineDispatcher, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 5000L : j, (i & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher, function1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final T getCachedData() {
        return this.cachedData;
    }

    protected final void setCachedData(T t) {
        this.cachedData = t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ <T> Object getData$suspendImpl(CachedData<T> cachedData, Continuation<? super T> continuation) {
        CachedData$getData$1 cachedData$getData$1;
        int i;
        if (continuation instanceof CachedData$getData$1) {
            cachedData$getData$1 = (CachedData$getData$1) continuation;
            if ((cachedData$getData$1.label & Integer.MIN_VALUE) != 0) {
                cachedData$getData$1.label -= Integer.MIN_VALUE;
                Object obj = cachedData$getData$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cachedData$getData$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (cachedData.isDataStale()) {
                        cachedData$getData$1.L$0 = cachedData;
                        cachedData$getData$1.label = 1;
                        if (cachedData.refreshData(cachedData$getData$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    cachedData = (CachedData) cachedData$getData$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return ((CachedData) cachedData).cachedData;
            }
        }
        cachedData$getData$1 = new CachedData$getData$1(cachedData, continuation);
        Object obj2 = cachedData$getData$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cachedData$getData$1.label;
        if (i != 0) {
        }
        return ((CachedData) cachedData).cachedData;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refreshData(Continuation<? super Unit> continuation) {
        CachedData$refreshData$1 cachedData$refreshData$1;
        int i;
        CachedData<T> cachedData;
        if (continuation instanceof CachedData$refreshData$1) {
            cachedData$refreshData$1 = (CachedData$refreshData$1) continuation;
            if ((cachedData$refreshData$1.label & Integer.MIN_VALUE) != 0) {
                cachedData$refreshData$1.label -= Integer.MIN_VALUE;
                T t = (T) cachedData$refreshData$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cachedData$refreshData$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(t);
                    cachedData$refreshData$1.L$0 = this;
                    cachedData$refreshData$1.label = 1;
                    t = (T) loadData(cachedData$refreshData$1);
                    if (t == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    cachedData = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    cachedData = (CachedData) cachedData$refreshData$1.L$0;
                    ResultKt.throwOnFailure(t);
                }
                cachedData.cachedData = t;
                return Unit.INSTANCE;
            }
        }
        cachedData$refreshData$1 = new CachedData$refreshData$1(this, continuation);
        T t2 = (T) cachedData$refreshData$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cachedData$refreshData$1.label;
        if (i != 0) {
        }
        cachedData.cachedData = t2;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadData(Continuation<? super T> continuation) {
        CachedData$loadData$1 cachedData$loadData$1;
        int i;
        CachedData<T> cachedData;
        if (continuation instanceof CachedData$loadData$1) {
            cachedData$loadData$1 = (CachedData$loadData$1) continuation;
            if ((cachedData$loadData$1.label & Integer.MIN_VALUE) != 0) {
                cachedData$loadData$1.label -= Integer.MIN_VALUE;
                Object obj = cachedData$loadData$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cachedData$loadData$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    cachedData$loadData$1.L$0 = this;
                    cachedData$loadData$1.label = 1;
                    obj = BuildersKt.withContext(this.dispatcher, new CachedData$loadData$newData$1(this, null), cachedData$loadData$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    cachedData = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    cachedData = (CachedData) cachedData$loadData$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                cachedData.lastUpdateTime = System.currentTimeMillis();
                return obj;
            }
        }
        cachedData$loadData$1 = new CachedData$loadData$1(this, continuation);
        Object obj2 = cachedData$loadData$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cachedData$loadData$1.label;
        if (i != 0) {
        }
        cachedData.lastUpdateTime = System.currentTimeMillis();
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isDataStale() {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.cachedData != null) {
            long j = this.lastUpdateTime;
            if (j != 0 && currentTimeMillis - j < this.refreshIntervalMillis) {
                return false;
            }
        }
        return true;
    }
}
