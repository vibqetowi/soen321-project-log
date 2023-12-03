package y4;

import h4.j;
import java.util.ArrayList;
/* compiled from: ResourceEncoderRegistry.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f38253a = new ArrayList();

    /* compiled from: ResourceEncoderRegistry.java */
    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f38254a;

        /* renamed from: b  reason: collision with root package name */
        public final j<T> f38255b;

        public a(Class<T> cls, j<T> jVar) {
            this.f38254a = cls;
            this.f38255b = jVar;
        }
    }

    public final synchronized <Z> j<Z> a(Class<Z> cls) {
        int size = this.f38253a.size();
        for (int i6 = 0; i6 < size; i6++) {
            a aVar = (a) this.f38253a.get(i6);
            if (aVar.f38254a.isAssignableFrom(cls)) {
                return (j<Z>) aVar.f38255b;
            }
        }
        return null;
    }
}
