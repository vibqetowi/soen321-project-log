package com.ifriend.common_utils.data;

import com.google.android.gms.actions.SearchIntents;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: NetworkBoundResource.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u009e\u0001\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u00042\u0014\b\u0004\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00010\u00062\u001e\b\u0004\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b2$\b\u0004\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\f2\u0014\b\u0006\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u000f0\bH\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\u0010\u0010\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"networkBoundResource", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ifriend/common_utils/data/Resource;", "ResultType", "RequestType", SearchIntents.EXTRA_QUERY, "Lkotlin/Function0;", RemoteConfigComponent.FETCH_FILE_NAME, "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "saveFetchResult", "Lkotlin/Function2;", "", "shouldFetch", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;", "common_utils"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NetworkBoundResourceKt {
    public static /* synthetic */ Flow networkBoundResource$default(Function0 query, Function1 fetch, Function2 saveFetchResult, Function1 function1, int i, Object obj) {
        if ((i & 8) != 0) {
            function1 = NetworkBoundResourceKt$networkBoundResource$1.INSTANCE;
        }
        Function1 shouldFetch = function1;
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(fetch, "fetch");
        Intrinsics.checkNotNullParameter(saveFetchResult, "saveFetchResult");
        Intrinsics.checkNotNullParameter(shouldFetch, "shouldFetch");
        return FlowKt.flow(new NetworkBoundResourceKt$networkBoundResource$2(query, shouldFetch, saveFetchResult, fetch, null));
    }

    public static final <ResultType, RequestType> Flow<Resource<ResultType>> networkBoundResource(Function0<? extends Flow<? extends ResultType>> query, Function1<? super Continuation<? super RequestType>, ? extends Object> fetch, Function2<? super RequestType, ? super Continuation<? super Unit>, ? extends Object> saveFetchResult, Function1<? super ResultType, Boolean> shouldFetch) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(fetch, "fetch");
        Intrinsics.checkNotNullParameter(saveFetchResult, "saveFetchResult");
        Intrinsics.checkNotNullParameter(shouldFetch, "shouldFetch");
        return FlowKt.flow(new NetworkBoundResourceKt$networkBoundResource$2(query, shouldFetch, saveFetchResult, fetch, null));
    }
}
