package j$.time.zone;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
final class g implements PrivilegedAction {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f21075a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(ArrayList arrayList) {
        this.f21075a = arrayList;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        String property = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if (property == null) {
            i.e(new h());
            return null;
        }
        try {
            i iVar = (i) i.class.cast(Class.forName(property, true, i.class.getClassLoader()).newInstance());
            i.e(iVar);
            this.f21075a.add(iVar);
            return null;
        } catch (Exception e10) {
            throw new Error(e10);
        }
    }
}
