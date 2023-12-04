package com.ifriend.domain.data;

import androidx.exifinterface.media.ExifInterface;
import java.util.Map;
import kotlin.Metadata;
import org.apache.http.cookie.ClientCookie;
/* compiled from: LimitedSizeHashMap.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u001a&\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"hashMapOf", "", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "maxSize", "", ClientCookie.DOMAIN_ATTR}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LimitedSizeHashMapKt {
    public static final <K, V> Map<K, V> hashMapOf(int i) {
        return new LimitedSizeHashMap(i, null, 2, null);
    }
}
