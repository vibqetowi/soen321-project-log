package com.ifriend.domain;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.apache.http.cookie.ClientCookie;
/* compiled from: CoroutineDispatchers.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\u00048VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/ifriend/domain/CoroutineDispatchers;", "", "()V", "IO", "Lkotlin/coroutines/CoroutineContext;", "getIO", "()Lkotlin/coroutines/CoroutineContext;", "IO$delegate", "Lkotlin/Lazy;", "Main", "getMain", "Main$delegate", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public class CoroutineDispatchers {
    private final Lazy Main$delegate = LazyKt.lazy(CoroutineDispatchers$Main$2.INSTANCE);
    private final Lazy IO$delegate = LazyKt.lazy(CoroutineDispatchers$IO$2.INSTANCE);

    public CoroutineContext getMain() {
        return (CoroutineContext) this.Main$delegate.getValue();
    }

    public CoroutineContext getIO() {
        return (CoroutineContext) this.IO$delegate.getValue();
    }
}
