package com.ifriend.core.tools.impl;

import com.ifriend.core.tools.api.DispatcherProvider;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.NonCancellable;
/* compiled from: DispatcherProviderImpl.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/ifriend/core/tools/impl/DispatcherProviderImpl;", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "()V", "background", "Lkotlinx/coroutines/CoroutineDispatcher;", "main", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "nonCancellable", "Lkotlinx/coroutines/NonCancellable;", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DispatcherProviderImpl implements DispatcherProvider {
    @Override // com.ifriend.core.tools.api.DispatcherProvider
    public MainCoroutineDispatcher main() {
        return Dispatchers.getMain();
    }

    @Override // com.ifriend.core.tools.api.DispatcherProvider
    public CoroutineDispatcher background() {
        return Dispatchers.getIO();
    }

    @Override // com.ifriend.core.tools.api.DispatcherProvider
    public NonCancellable nonCancellable() {
        return NonCancellable.INSTANCE;
    }
}
