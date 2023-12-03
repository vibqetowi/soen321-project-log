package dw;

import java.lang.reflect.Array;
/* compiled from: ParameterHandler.java */
/* loaded from: classes2.dex */
public final class u extends v<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v f13604a;

    public u(v vVar) {
        this.f13604a = vVar;
    }

    @Override // dw.v
    public final void a(x xVar, Object obj) {
        if (obj == null) {
            return;
        }
        int length = Array.getLength(obj);
        for (int i6 = 0; i6 < length; i6++) {
            this.f13604a.a(xVar, Array.get(obj, i6));
        }
    }
}
