package pg;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: TrackingOptOutConfig.kt */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f28421a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f28422b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<Class<?>> f28423c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashSet f28424d = new LinkedHashSet();

    /* JADX WARN: Multi-variable type inference failed */
    public n(boolean z10, boolean z11, Set<? extends Class<?>> set) {
        this.f28421a = z10;
        this.f28422b = z11;
        this.f28423c = set;
        if (set != 0) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                this.f28424d.add(((Class) it.next()).getName());
            }
        }
        this.f28424d.addAll(o.f28425a);
    }

    public final String toString() {
        return "(isCarrierTrackingEnabled=" + this.f28421a + ", isDeviceAttributeTrackingEnabled=" + this.f28422b + ", optedOutActivityNames=" + this.f28424d + ')';
    }
}
