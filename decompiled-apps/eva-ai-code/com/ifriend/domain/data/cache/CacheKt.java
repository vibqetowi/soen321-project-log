package com.ifriend.domain.data.cache;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: Cache.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u0001H\u0002¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"saveIfNotNull", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/ifriend/domain/data/cache/Cache;", "data", "(Lcom/ifriend/domain/data/cache/Cache;Ljava/lang/Object;)V", ClientCookie.DOMAIN_ATTR}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CacheKt {
    public static final <T> void saveIfNotNull(Cache<T> cache, T t) {
        Intrinsics.checkNotNullParameter(cache, "<this>");
        if (t != null) {
            cache.save(t);
        }
    }
}
