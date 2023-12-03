package je;

import com.google.firebase.database.collection.ImmutableSortedMap;
import java.util.HashMap;
import java.util.Map;
/* compiled from: LocalDocumentsResult.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final int f21825a;

    /* renamed from: b  reason: collision with root package name */
    public final ImmutableSortedMap<ke.i, ke.g> f21826b;

    public g(int i6, ImmutableSortedMap<ke.i, ke.g> immutableSortedMap) {
        this.f21825a = i6;
        this.f21826b = immutableSortedMap;
    }

    public static g a(int i6, HashMap hashMap) {
        ImmutableSortedMap<ke.i, ?> immutableSortedMap = ke.h.f23272a;
        for (Map.Entry entry : hashMap.entrySet()) {
            immutableSortedMap = immutableSortedMap.insert((ke.i) entry.getKey(), ((y) entry.getValue()).f21969a);
        }
        return new g(i6, immutableSortedMap);
    }
}
