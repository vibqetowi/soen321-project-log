package k4;

import com.bumptech.glide.load.engine.GlideException;
import e5.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k4.j;
/* compiled from: LoadPath.java */
/* loaded from: classes.dex */
public final class t<Data, ResourceType, Transcode> {

    /* renamed from: a  reason: collision with root package name */
    public final s0.d<List<Throwable>> f22933a;

    /* renamed from: b  reason: collision with root package name */
    public final List<? extends k<Data, ResourceType, Transcode>> f22934b;

    /* renamed from: c  reason: collision with root package name */
    public final String f22935c;

    public t(Class cls, Class cls2, Class cls3, List list, a.c cVar) {
        this.f22933a = cVar;
        if (!list.isEmpty()) {
            this.f22934b = list;
            this.f22935c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public final v a(int i6, int i10, h4.g gVar, i4.e eVar, j.b bVar) {
        s0.d<List<Throwable>> dVar = this.f22933a;
        List<Throwable> b10 = dVar.b();
        kc.f.p(b10);
        List<Throwable> list = b10;
        try {
            List<? extends k<Data, ResourceType, Transcode>> list2 = this.f22934b;
            int size = list2.size();
            v vVar = null;
            for (int i11 = 0; i11 < size; i11++) {
                try {
                    vVar = list2.get(i11).a(i6, i10, gVar, eVar, bVar);
                } catch (GlideException e10) {
                    list.add(e10);
                }
                if (vVar != null) {
                    break;
                }
            }
            if (vVar != null) {
                return vVar;
            }
            throw new GlideException(this.f22935c, new ArrayList(list));
        } finally {
            dVar.a(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f22934b.toArray()) + '}';
    }
}
