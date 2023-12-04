package com.ifriend.core.utils;

import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: CoroutineExceptionHandler.kt */
@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CoroutinesKt$safeLaunch$$inlined$CoroutineExceptionHandler$2 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    final /* synthetic */ Function2 $errorHandler$inlined;
    final /* synthetic */ CoroutineScope $this_safeLaunch$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesKt$safeLaunch$$inlined$CoroutineExceptionHandler$2(CoroutineExceptionHandler.Key key, CoroutineScope coroutineScope, Function2 function2) {
        super(key);
        this.$this_safeLaunch$inlined = coroutineScope;
        this.$errorHandler$inlined = function2;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(CoroutineContext coroutineContext, Throwable th) {
        BuildersKt__Builders_commonKt.launch$default(this.$this_safeLaunch$inlined, null, null, new CoroutinesKt$safeLaunch$3$1(this.$errorHandler$inlined, th, null), 3, null);
    }
}
