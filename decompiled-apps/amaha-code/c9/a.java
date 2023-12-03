package c9;

import android.os.Bundle;
import com.google.android.exoplayer2.f;
import com.google.common.collect.l0;
import com.google.common.collect.s;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: BundleableUtil.java */
/* loaded from: classes.dex */
public final class a {
    public static l0 a(f.a aVar, ArrayList arrayList) {
        s.b bVar = com.google.common.collect.s.f9446v;
        s.a aVar2 = new s.a();
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            Bundle bundle = (Bundle) arrayList.get(i6);
            bundle.getClass();
            aVar2.b(aVar.c(bundle));
        }
        return aVar2.c();
    }

    public static <T extends com.google.android.exoplayer2.f> T b(f.a<T> aVar, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return aVar.c(bundle);
    }

    public static <T extends com.google.android.exoplayer2.f> ArrayList<Bundle> c(Collection<T> collection) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        for (T t3 : collection) {
            arrayList.add(t3.a());
        }
        return arrayList;
    }

    public static Bundle d(com.google.android.exoplayer2.f fVar) {
        if (fVar == null) {
            return null;
        }
        return fVar.a();
    }
}
