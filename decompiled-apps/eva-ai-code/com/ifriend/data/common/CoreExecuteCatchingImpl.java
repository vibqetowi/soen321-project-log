package com.ifriend.data.common;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.NativeProtocol;
import com.ifriend.data.exception.mappers.CoreExceptionMapper;
import com.ifriend.domain.CoroutineDispatchers;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: CoreExecuteCatching.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J%\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ@\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f¢\u0006\u0002\b\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/ifriend/data/common/CoreExecuteCatchingImpl;", "Lcom/ifriend/data/common/CoreExecuteCatching;", "coroutineDispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "coreExceptionMapper", "Lcom/ifriend/data/exception/mappers/CoreExceptionMapper;", "(Lcom/ifriend/domain/CoroutineDispatchers;Lcom/ifriend/data/exception/mappers/CoreExceptionMapper;)V", "executeInBackground", ExifInterface.GPS_DIRECTION_TRUE, NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/reflect/KSuspendFunction0;", "(Lkotlin/reflect/KFunction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CoreExecuteCatchingImpl implements CoreExecuteCatching {
    private final CoreExceptionMapper coreExceptionMapper;
    private final CoroutineDispatchers coroutineDispatchers;

    @Inject
    public CoreExecuteCatchingImpl(CoroutineDispatchers coroutineDispatchers, CoreExceptionMapper coreExceptionMapper) {
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        Intrinsics.checkNotNullParameter(coreExceptionMapper, "coreExceptionMapper");
        this.coroutineDispatchers = coroutineDispatchers;
        this.coreExceptionMapper = coreExceptionMapper;
    }

    @Override // com.ifriend.data.common.CoreExecuteCatching
    public <T> Object executeInBackground(Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return BuildersKt.withContext(this.coroutineDispatchers.getIO(), new CoreExecuteCatchingImpl$executeInBackground$2(this, function2, null), continuation);
    }

    @Override // com.ifriend.data.common.CoreExecuteCatching
    public <T> Object executeInBackground(KFunction<? extends T> kFunction, Continuation<? super T> continuation) {
        return BuildersKt.withContext(this.coroutineDispatchers.getIO(), new CoreExecuteCatchingImpl$executeInBackground$4(kFunction, this, null), continuation);
    }
}
