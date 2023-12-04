package com.ifriend.domain.data.cache;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import org.apache.http.cookie.ClientCookie;
/* compiled from: Cache.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u000f\u0010\u0003\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/ifriend/domain/data/cache/Cache;", ExifInterface.GPS_DIRECTION_TRUE, "", "get", "()Ljava/lang/Object;", "save", "", "data", "(Ljava/lang/Object;)V", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface Cache<T> {
    T get();

    void save(T t);
}
