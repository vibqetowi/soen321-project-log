package e4;

import androidx.recyclerview.widget.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: NetworkResponse.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final int f13768a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f13769b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f13770c;

    /* renamed from: d  reason: collision with root package name */
    public final List<f> f13771d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f13772e;

    public i(int i6, byte[] bArr, Map map, List list, boolean z10) {
        this.f13768a = i6;
        this.f13769b = bArr;
        this.f13770c = map;
        if (list == null) {
            this.f13771d = null;
        } else {
            this.f13771d = Collections.unmodifiableList(list);
        }
        this.f13772e = z10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.TreeMap] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i(int i6, byte[] bArr, boolean z10, long j10, List<f> list) {
        this(i6, bArr, (Map) r12, list, z10);
        ?? treeMap;
        if (list == null) {
            treeMap = 0;
        } else if (list.isEmpty()) {
            treeMap = Collections.emptyMap();
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (f fVar : list) {
                treeMap.put(fVar.f13761a, fVar.f13762b);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i(byte[] bArr, Map<String, String> map) {
        this((int) k.d.DEFAULT_DRAG_ANIMATION_DURATION, bArr, (Map) map, (List) r0, false);
        ?? arrayList;
        if (map == null) {
            arrayList = 0;
        } else if (map.isEmpty()) {
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(new f(entry.getKey(), entry.getValue()));
            }
        }
    }
}
