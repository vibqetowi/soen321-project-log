package kotlinx.collections.immutable;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
/* compiled from: ImmutableMap.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003R$\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkotlinx/collections/immutable/ImmutableMap;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "Lkotlinx/collections/immutable/ImmutableSet;", "", "getEntries", "()Lkotlinx/collections/immutable/ImmutableSet;", UserMetadata.KEYDATA_FILENAME, "getKeys", "values", "Lkotlinx/collections/immutable/ImmutableCollection;", "getValues", "()Lkotlinx/collections/immutable/ImmutableCollection;", "kotlinx-collections-immutable"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface ImmutableMap<K, V> extends Map<K, V>, KMappedMarker {
    ImmutableSet<Map.Entry<K, V>> getEntries();

    ImmutableSet<K> getKeys();

    ImmutableCollection<V> getValues();
}
