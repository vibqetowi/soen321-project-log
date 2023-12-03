package r1;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: MediaRouteProviderDescriptor.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final List<e> f30284a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f30285b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    public j(ArrayList arrayList, boolean z10) {
        this.f30284a = arrayList == null ? Collections.emptyList() : arrayList;
        this.f30285b = z10;
    }

    public static j a(Bundle bundle) {
        e eVar;
        ArrayList arrayList = null;
        if (bundle == null) {
            return null;
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            int size = parcelableArrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i6 = 0; i6 < size; i6++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i6);
                if (bundle2 != null) {
                    eVar = new e(bundle2);
                } else {
                    eVar = null;
                }
                arrayList2.add(eVar);
            }
            arrayList = arrayList2;
        }
        return new j(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    public final boolean b() {
        List<e> list = this.f30284a;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            e eVar = list.get(i6);
            if (eVar == null || !eVar.e()) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return "MediaRouteProviderDescriptor{ routes=" + Arrays.toString(this.f30284a.toArray()) + ", isValid=" + b() + " }";
    }
}
