package com.ifriend.domain.data.cache;

import androidx.exifinterface.media.ExifInterface;
import io.grpc.netty.shaded.io.netty.handler.codec.rtsp.RtspHeaders;
import java.lang.ref.SoftReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.apache.http.cookie.ClientCookie;
/* compiled from: LRUCache.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u000f\u0010\n\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u000bJ\u0015\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000fR\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/ifriend/domain/data/cache/LRUCache;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/ifriend/domain/data/cache/Cache;", RtspHeaders.Values.TTL, "", "(Ljava/lang/Long;)V", "cachedData", "Ljava/lang/ref/SoftReference;", "savingTimestamp", "Ljava/lang/Long;", "get", "()Ljava/lang/Object;", "save", "", "data", "(Ljava/lang/Object;)V", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LRUCache<T> implements Cache<T> {
    private SoftReference<T> cachedData;
    private Long savingTimestamp;
    private final Long ttl;

    public LRUCache() {
        this(null, 1, null);
    }

    public LRUCache(Long l) {
        this.ttl = l;
    }

    public /* synthetic */ LRUCache(Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l);
    }

    @Override // com.ifriend.domain.data.cache.Cache
    public void save(T t) {
        this.cachedData = new SoftReference<>(t);
        this.savingTimestamp = Long.valueOf(System.currentTimeMillis());
    }

    @Override // com.ifriend.domain.data.cache.Cache
    public T get() {
        if (this.ttl != null) {
            Long l = this.savingTimestamp;
            if ((l != null ? l.longValue() : 0L) + this.ttl.longValue() > System.currentTimeMillis()) {
                SoftReference<T> softReference = this.cachedData;
                if (softReference != null) {
                    return softReference.get();
                }
                return null;
            }
            this.savingTimestamp = 0L;
            this.cachedData = null;
        }
        SoftReference<T> softReference2 = this.cachedData;
        if (softReference2 != null) {
            return softReference2.get();
        }
        return null;
    }
}
