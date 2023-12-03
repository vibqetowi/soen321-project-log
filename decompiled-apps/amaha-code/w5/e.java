package w5;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
/* compiled from: CustomTab.kt */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public Uri f36452a;

    public e(Bundle bundle, String str) {
        Uri b10;
        bundle = bundle == null ? new Bundle() : bundle;
        q[] valuesCustom = q.valuesCustom();
        ArrayList arrayList = new ArrayList(valuesCustom.length);
        for (q qVar : valuesCustom) {
            arrayList.add(qVar.f36538u);
        }
        if (arrayList.contains(str)) {
            e0 e0Var = e0.f36453a;
            int i6 = a0.f36434a;
            h5.p pVar = h5.p.f17269a;
            b10 = e0.b(defpackage.b.o(new Object[]{"fb.gg"}, 1, "%s", "java.lang.String.format(format, *args)"), kotlin.jvm.internal.i.n(str, "/dialog/"), bundle);
        } else {
            e0 e0Var2 = e0.f36453a;
            b10 = e0.b(a0.a(), h5.p.d() + "/dialog/" + str, bundle);
        }
        this.f36452a = b10;
    }
}
