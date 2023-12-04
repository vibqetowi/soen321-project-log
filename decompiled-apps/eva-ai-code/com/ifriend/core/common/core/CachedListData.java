package com.ifriend.core.common.core;

import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
/* compiled from: CachedData.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B@\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/ifriend/core/common/core/CachedListData;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/ifriend/core/common/core/CachedData;", "", "refreshIntervalMillis", "", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "loadDataFunction", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(JLkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function1;)V", "getData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isDataStale", "", "common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CachedListData<T> extends CachedData<List<? extends T>> {
    public /* synthetic */ CachedListData(long j, CoroutineDispatcher coroutineDispatcher, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 5000L : j, (i & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher, function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedListData(long j, CoroutineDispatcher dispatcher, Function1<? super Continuation<? super List<? extends T>>, ? extends Object> loadDataFunction) {
        super(j, dispatcher, loadDataFunction);
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(loadDataFunction, "loadDataFunction");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // com.ifriend.core.common.core.CachedData
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getData(Continuation<? super List<? extends T>> continuation) {
        CachedListData$getData$1 cachedListData$getData$1;
        int i;
        if (continuation instanceof CachedListData$getData$1) {
            cachedListData$getData$1 = (CachedListData$getData$1) continuation;
            if ((cachedListData$getData$1.label & Integer.MIN_VALUE) != 0) {
                cachedListData$getData$1.label -= Integer.MIN_VALUE;
                Object obj = cachedListData$getData$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cachedListData$getData$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    cachedListData$getData$1.label = 1;
                    obj = super.getData(cachedListData$getData$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                List list = (List) obj;
                return list != null ? CollectionsKt.emptyList() : list;
            }
        }
        cachedListData$getData$1 = new CachedListData$getData$1(this, continuation);
        Object obj2 = cachedListData$getData$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cachedListData$getData$1.label;
        if (i != 0) {
        }
        List list2 = (List) obj2;
        if (list2 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ifriend.core.common.core.CachedData
    public boolean isDataStale() {
        if (super.isDataStale()) {
            return true;
        }
        Collection collection = (Collection) getCachedData();
        return collection == null || collection.isEmpty();
    }
}
