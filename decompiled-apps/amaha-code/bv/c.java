package bv;

import kotlin.jvm.internal.i;
import wu.d1;
import wu.f1;
import wu.n1;
import wu.x0;
import wu.z0;
/* compiled from: CapturedTypeApproximation.kt */
/* loaded from: classes2.dex */
public final class c extends z0 {
    @Override // wu.z0
    public final d1 g(x0 key) {
        ju.b bVar;
        i.g(key, "key");
        if (key instanceof ju.b) {
            bVar = (ju.b) key;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            return null;
        }
        if (bVar.e().d()) {
            return new f1(bVar.e().a(), n1.OUT_VARIANCE);
        }
        return bVar.e();
    }
}
