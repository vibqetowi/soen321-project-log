package com.ifriend.core.tools.api;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
/* compiled from: DispatcherProvider.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006"}, d2 = {"Lcom/ifriend/core/tools/api/DispatcherProvider;", "", "background", "Lkotlin/coroutines/CoroutineContext;", "main", "nonCancellable", "api"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface DispatcherProvider {
    CoroutineContext background();

    CoroutineContext main();

    CoroutineContext nonCancellable();
}
