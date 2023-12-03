package ne;

import com.google.firebase.database.collection.ImmutableSortedSet;
import he.h;
import java.util.HashMap;
import java.util.Map;
/* compiled from: TargetState.java */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public int f26178a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f26179b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public boolean f26180c = true;

    /* renamed from: d  reason: collision with root package name */
    public com.google.protobuf.h f26181d = com.google.protobuf.h.f9922v;

    /* renamed from: e  reason: collision with root package name */
    public boolean f26182e = false;

    public final a0 a() {
        ImmutableSortedSet<ke.i> immutableSortedSet = ke.i.f23274w;
        ImmutableSortedSet<ke.i> immutableSortedSet2 = immutableSortedSet;
        ImmutableSortedSet<ke.i> immutableSortedSet3 = immutableSortedSet2;
        ImmutableSortedSet<ke.i> immutableSortedSet4 = immutableSortedSet3;
        for (Map.Entry entry : this.f26179b.entrySet()) {
            ke.i iVar = (ke.i) entry.getKey();
            h.a aVar = (h.a) entry.getValue();
            int ordinal = aVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        immutableSortedSet3 = immutableSortedSet3.insert(iVar);
                    } else {
                        ca.a.V("Encountered invalid change type: %s", aVar);
                        throw null;
                    }
                } else {
                    immutableSortedSet2 = immutableSortedSet2.insert(iVar);
                }
            } else {
                immutableSortedSet4 = immutableSortedSet4.insert(iVar);
            }
        }
        return new a0(this.f26181d, this.f26182e, immutableSortedSet2, immutableSortedSet3, immutableSortedSet4);
    }
}
