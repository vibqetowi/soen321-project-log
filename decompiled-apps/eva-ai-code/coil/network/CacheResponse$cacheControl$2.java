package coil.network;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import okhttp3.CacheControl;
/* compiled from: CacheResponse.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lokhttp3/CacheControl;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CacheResponse$cacheControl$2 extends Lambda implements Function0<CacheControl> {
    final /* synthetic */ CacheResponse this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheResponse$cacheControl$2(CacheResponse cacheResponse) {
        super(0);
        this.this$0 = cacheResponse;
    }

    @Override // kotlin.jvm.functions.Function0
    public final CacheControl invoke() {
        return CacheControl.Companion.parse(this.this$0.getResponseHeaders());
    }
}
