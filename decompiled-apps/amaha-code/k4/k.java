package k4;

import android.util.Log;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.engine.GlideException;
import e5.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import k4.j;
import o4.n;
/* compiled from: DecodePath.java */
/* loaded from: classes.dex */
public final class k<DataType, ResourceType, Transcode> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<DataType> f22873a;

    /* renamed from: b  reason: collision with root package name */
    public final List<? extends h4.i<DataType, ResourceType>> f22874b;

    /* renamed from: c  reason: collision with root package name */
    public final v4.b<ResourceType, Transcode> f22875c;

    /* renamed from: d  reason: collision with root package name */
    public final s0.d<List<Throwable>> f22876d;

    /* renamed from: e  reason: collision with root package name */
    public final String f22877e;

    public k(Class cls, Class cls2, Class cls3, List list, v4.b bVar, a.c cVar) {
        this.f22873a = cls;
        this.f22874b = list;
        this.f22875c = bVar;
        this.f22876d = cVar;
        this.f22877e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final v a(int i6, int i10, h4.g gVar, i4.e eVar, j.b bVar) {
        v vVar;
        h4.k kVar;
        boolean z10;
        h4.c cVar;
        boolean z11;
        h4.e fVar;
        s0.d<List<Throwable>> dVar = this.f22876d;
        List<Throwable> b10 = dVar.b();
        kc.f.p(b10);
        List<Throwable> list = b10;
        try {
            v<ResourceType> b11 = b(eVar, i6, i10, gVar, list);
            dVar.a(list);
            j jVar = j.this;
            jVar.getClass();
            Class<?> cls = b11.get().getClass();
            h4.a aVar = h4.a.RESOURCE_DISK_CACHE;
            h4.a aVar2 = bVar.f22865a;
            i<R> iVar = jVar.f22859u;
            h4.j jVar2 = null;
            if (aVar2 != aVar) {
                h4.k e10 = iVar.e(cls);
                vVar = e10.b(jVar.B, b11, jVar.F, jVar.G);
                kVar = e10;
            } else {
                vVar = b11;
                kVar = null;
            }
            if (!b11.equals(vVar)) {
                b11.recycle();
            }
            if (iVar.f22845c.f5941b.f5933d.a(vVar.b()) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                Registry registry = iVar.f22845c.f5941b;
                registry.getClass();
                h4.j a10 = registry.f5933d.a(vVar.b());
                if (a10 != null) {
                    cVar = a10.v(jVar.I);
                    jVar2 = a10;
                } else {
                    throw new Registry.NoResultEncoderAvailableException(vVar.b());
                }
            } else {
                cVar = h4.c.NONE;
            }
            h4.e eVar2 = jVar.R;
            ArrayList b12 = iVar.b();
            int size = b12.size();
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    if (((n.a) b12.get(i11)).f27079a.equals(eVar2)) {
                        z11 = true;
                        break;
                    }
                    i11++;
                } else {
                    z11 = false;
                    break;
                }
            }
            if (jVar.H.d(!z11, aVar2, cVar)) {
                if (jVar2 != null) {
                    int ordinal = cVar.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            fVar = new x(iVar.f22845c.f5940a, jVar.R, jVar.C, jVar.F, jVar.G, kVar, cls, jVar.I);
                        } else {
                            throw new IllegalArgumentException("Unknown strategy: " + cVar);
                        }
                    } else {
                        fVar = new f(jVar.R, jVar.C);
                    }
                    u<Z> uVar = (u) u.f22936y.b();
                    kc.f.p(uVar);
                    uVar.f22940x = false;
                    uVar.f22939w = true;
                    uVar.f22938v = vVar;
                    j.c<?> cVar2 = jVar.f22864z;
                    cVar2.f22867a = fVar;
                    cVar2.f22868b = jVar2;
                    cVar2.f22869c = uVar;
                    vVar = uVar;
                } else {
                    throw new Registry.NoResultEncoderAvailableException(vVar.get().getClass());
                }
            }
            return this.f22875c.n(vVar, gVar);
        } catch (Throwable th2) {
            dVar.a(list);
            throw th2;
        }
    }

    public final v<ResourceType> b(i4.e<DataType> eVar, int i6, int i10, h4.g gVar, List<Throwable> list) {
        List<? extends h4.i<DataType, ResourceType>> list2 = this.f22874b;
        int size = list2.size();
        v<ResourceType> vVar = null;
        for (int i11 = 0; i11 < size; i11++) {
            h4.i<DataType, ResourceType> iVar = list2.get(i11);
            try {
                if (iVar.a(eVar.a(), gVar)) {
                    vVar = iVar.b(eVar.a(), i6, i10, gVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + iVar, e10);
                }
                list.add(e10);
            }
            if (vVar != null) {
                break;
            }
        }
        if (vVar != null) {
            return vVar;
        }
        throw new GlideException(this.f22877e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f22873a + ", decoders=" + this.f22874b + ", transcoder=" + this.f22875c + '}';
    }
}
