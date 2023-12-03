package v4;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: TranscoderRegistry.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f34808a = new ArrayList();

    /* compiled from: TranscoderRegistry.java */
    /* loaded from: classes.dex */
    public static final class a<Z, R> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<Z> f34809a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<R> f34810b;

        /* renamed from: c  reason: collision with root package name */
        public final b<Z, R> f34811c;

        public a(Class<Z> cls, Class<R> cls2, b<Z, R> bVar) {
            this.f34809a = cls;
            this.f34810b = cls2;
            this.f34811c = bVar;
        }
    }

    public final synchronized <Z, R> b<Z, R> a(Class<Z> cls, Class<R> cls2) {
        boolean z10;
        if (cls2.isAssignableFrom(cls)) {
            return uf.c.f34052u;
        }
        Iterator it = this.f34808a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f34809a.isAssignableFrom(cls) && cls2.isAssignableFrom(aVar.f34810b)) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (z10) {
                return aVar.f34811c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public final synchronized ArrayList b(Class cls, Class cls2) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.f34808a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f34809a.isAssignableFrom(cls) && cls2.isAssignableFrom(aVar.f34810b)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }
}
