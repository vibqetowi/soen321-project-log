package com.bumptech.glide;

import androidx.appcompat.widget.l;
import com.bumptech.glide.load.ImageHeaderParser;
import e5.a;
import h4.i;
import h4.j;
import i4.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k4.k;
import o4.n;
import o4.o;
import o4.p;
import v4.c;
import y4.a;
import y4.c;
import y4.d;
/* loaded from: classes.dex */
public final class Registry {

    /* renamed from: a  reason: collision with root package name */
    public final p f5930a;

    /* renamed from: b  reason: collision with root package name */
    public final y4.a f5931b;

    /* renamed from: c  reason: collision with root package name */
    public final y4.c f5932c;

    /* renamed from: d  reason: collision with root package name */
    public final y4.d f5933d;

    /* renamed from: e  reason: collision with root package name */
    public final i4.f f5934e;
    public final v4.c f;

    /* renamed from: g  reason: collision with root package name */
    public final k1.c f5935g;

    /* renamed from: h  reason: collision with root package name */
    public final l f5936h = new l(8);

    /* renamed from: i  reason: collision with root package name */
    public final y4.b f5937i = new y4.b();

    /* renamed from: j  reason: collision with root package name */
    public final a.c f5938j;

    /* loaded from: classes.dex */
    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    /* loaded from: classes.dex */
    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> NoModelLoaderAvailableException(M m10, List<n<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m10);
        }

        public NoModelLoaderAvailableException(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    /* loaded from: classes.dex */
    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* loaded from: classes.dex */
    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(Class<?> cls) {
            super(defpackage.b.l("Failed to find source encoder for data class: ", cls));
        }
    }

    public Registry() {
        a.c cVar = new a.c(new s0.e(20), new e5.b(), new e5.c());
        this.f5938j = cVar;
        this.f5930a = new p(cVar);
        this.f5931b = new y4.a();
        y4.c cVar2 = new y4.c();
        this.f5932c = cVar2;
        this.f5933d = new y4.d();
        this.f5934e = new i4.f();
        this.f = new v4.c();
        this.f5935g = new k1.c(3);
        List asList = Arrays.asList("Gif", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.addAll(asList);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        synchronized (cVar2) {
            ArrayList arrayList2 = new ArrayList(cVar2.f38248a);
            cVar2.f38248a.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                cVar2.f38248a.add((String) it.next());
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (!arrayList.contains(str)) {
                    cVar2.f38248a.add(str);
                }
            }
        }
    }

    public final void a(i iVar, Class cls, Class cls2, String str) {
        y4.c cVar = this.f5932c;
        synchronized (cVar) {
            cVar.a(str).add(new c.a<>(cls, cls2, iVar));
        }
    }

    public final void b(Class cls, h4.d dVar) {
        y4.a aVar = this.f5931b;
        synchronized (aVar) {
            aVar.f38242a.add(new a.C0648a(cls, dVar));
        }
    }

    public final void c(Class cls, j jVar) {
        y4.d dVar = this.f5933d;
        synchronized (dVar) {
            dVar.f38253a.add(new d.a(cls, jVar));
        }
    }

    public final void d(Class cls, Class cls2, o oVar) {
        p pVar = this.f5930a;
        synchronized (pVar) {
            pVar.f27082a.a(cls, cls2, oVar);
            pVar.f27083b.f27084a.clear();
        }
    }

    public final ArrayList e(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.f5932c.b(cls, cls2).iterator();
        while (it.hasNext()) {
            Class cls4 = (Class) it.next();
            Iterator it2 = this.f.b(cls4, cls3).iterator();
            while (it2.hasNext()) {
                Class cls5 = (Class) it2.next();
                y4.c cVar = this.f5932c;
                synchronized (cVar) {
                    arrayList = new ArrayList();
                    Iterator it3 = cVar.f38248a.iterator();
                    while (it3.hasNext()) {
                        List<c.a> list = (List) cVar.f38249b.get((String) it3.next());
                        if (list != null) {
                            for (c.a aVar : list) {
                                if (aVar.f38250a.isAssignableFrom(cls) && cls4.isAssignableFrom(aVar.f38251b)) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    arrayList.add(aVar.f38252c);
                                }
                            }
                        }
                    }
                }
                arrayList2.add(new k(cls, cls4, cls5, arrayList, this.f.a(cls4, cls5), this.f5938j));
            }
        }
        return arrayList2;
    }

    public final List<ImageHeaderParser> f() {
        List<ImageHeaderParser> list;
        k1.c cVar = this.f5935g;
        synchronized (cVar) {
            list = cVar.f22768a;
        }
        if (!list.isEmpty()) {
            return list;
        }
        throw new NoImageHeaderParserException();
    }

    public final <Model> List<n<Model, ?>> g(Model model) {
        List<n<Model, ?>> list;
        p pVar = this.f5930a;
        pVar.getClass();
        Class<?> cls = model.getClass();
        synchronized (pVar) {
            p.a.C0449a c0449a = (p.a.C0449a) pVar.f27083b.f27084a.get(cls);
            if (c0449a == null) {
                list = null;
            } else {
                list = c0449a.f27085a;
            }
            if (list == null) {
                list = Collections.unmodifiableList(pVar.f27082a.b(cls));
                if (((p.a.C0449a) pVar.f27083b.f27084a.put(cls, new p.a.C0449a(list))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (!list.isEmpty()) {
            int size = list.size();
            List<n<Model, ?>> emptyList = Collections.emptyList();
            boolean z10 = true;
            for (int i6 = 0; i6 < size; i6++) {
                n<Model, ?> nVar = list.get(i6);
                if (nVar.a(model)) {
                    if (z10) {
                        emptyList = new ArrayList<>(size - i6);
                        z10 = false;
                    }
                    emptyList.add(nVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new NoModelLoaderAvailableException(model, list);
        }
        throw new NoModelLoaderAvailableException(model);
    }

    public final void h(ImageHeaderParser imageHeaderParser) {
        k1.c cVar = this.f5935g;
        synchronized (cVar) {
            cVar.f22768a.add(imageHeaderParser);
        }
    }

    public final void i(e.a aVar) {
        i4.f fVar = this.f5934e;
        synchronized (fVar) {
            fVar.f19811a.put(aVar.a(), aVar);
        }
    }

    public final void j(Class cls, Class cls2, v4.b bVar) {
        v4.c cVar = this.f;
        synchronized (cVar) {
            cVar.f34808a.add(new c.a(cls, cls2, bVar));
        }
    }
}
