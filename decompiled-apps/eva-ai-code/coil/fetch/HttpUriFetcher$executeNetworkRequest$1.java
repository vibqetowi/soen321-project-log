package coil.fetch;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HttpUriFetcher.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "coil.fetch.HttpUriFetcher", f = "HttpUriFetcher.kt", i = {}, l = {224}, m = "executeNetworkRequest", n = {}, s = {})
/* loaded from: classes2.dex */
public final class HttpUriFetcher$executeNetworkRequest$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HttpUriFetcher this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpUriFetcher$executeNetworkRequest$1(HttpUriFetcher httpUriFetcher, Continuation<? super HttpUriFetcher$executeNetworkRequest$1> continuation) {
        super(continuation);
        this.this$0 = httpUriFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object executeNetworkRequest;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        executeNetworkRequest = this.this$0.executeNetworkRequest(null, this);
        return executeNetworkRequest;
    }
}
