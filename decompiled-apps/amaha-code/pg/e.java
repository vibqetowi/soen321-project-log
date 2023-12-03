package pg;

import is.y;
import java.util.LinkedHashSet;
/* compiled from: InAppConfig.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet f28407a;

    public e() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f28407a = linkedHashSet;
        linkedHashSet.addAll(f.f28408a);
    }

    public final String toString() {
        return "(optOutActivities=" + y.f20678u + ", activityNames=" + this.f28407a + ')';
    }
}
