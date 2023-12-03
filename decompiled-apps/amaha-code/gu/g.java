package gu;

import gu.a;
import gu.e;
import gu.f;
import gu.h;
import gu.i;
import gu.n;
import gu.s;
import gu.u;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
/* compiled from: GeneratedMessageLite.java */
/* loaded from: classes2.dex */
public abstract class g extends gu.a implements Serializable {

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes2.dex */
    public static abstract class a<MessageType extends g, BuilderType extends a> extends a.AbstractC0262a<BuilderType> {

        /* renamed from: u  reason: collision with root package name */
        public gu.c f16856u = gu.c.f16833u;

        @Override // 
        /* renamed from: i */
        public BuilderType clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        public abstract BuilderType j(MessageType messagetype);
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes2.dex */
    public static abstract class b<MessageType extends c<MessageType>, BuilderType extends b<MessageType, BuilderType>> extends a<MessageType, BuilderType> implements o {

        /* renamed from: v  reason: collision with root package name */
        public f<d> f16857v = f.f16852d;

        /* renamed from: w  reason: collision with root package name */
        public boolean f16858w;

        public final void k(MessageType messagetype) {
            r rVar;
            if (!this.f16858w) {
                this.f16857v = this.f16857v.clone();
                this.f16858w = true;
            }
            f<d> fVar = this.f16857v;
            f<d> fVar2 = messagetype.f16859u;
            fVar.getClass();
            int i6 = 0;
            while (true) {
                int size = fVar2.f16853a.f16897v.size();
                rVar = fVar2.f16853a;
                if (i6 >= size) {
                    break;
                }
                fVar.h(rVar.f16897v.get(i6));
                i6++;
            }
            for (Map.Entry<Object, Object> entry : rVar.c()) {
                fVar.h(entry);
            }
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes2.dex */
    public static final class d implements f.a<d> {

        /* renamed from: u  reason: collision with root package name */
        public final int f16863u;

        /* renamed from: v  reason: collision with root package name */
        public final u f16864v;

        /* renamed from: w  reason: collision with root package name */
        public final boolean f16865w;

        /* renamed from: x  reason: collision with root package name */
        public final boolean f16866x = false;

        public d(int i6, u uVar, boolean z10) {
            this.f16863u = i6;
            this.f16864v = uVar;
            this.f16865w = z10;
        }

        @Override // gu.f.a
        public final a I(n.a aVar, n nVar) {
            return ((a) aVar).j((g) nVar);
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f16863u - ((d) obj).f16863u;
        }

        @Override // gu.f.a
        public final int e() {
            return this.f16863u;
        }

        @Override // gu.f.a
        public final boolean g() {
            return this.f16865w;
        }

        @Override // gu.f.a
        public final u m() {
            return this.f16864v;
        }

        @Override // gu.f.a
        public final v o() {
            return this.f16864v.f16918u;
        }

        @Override // gu.f.a
        public final boolean q() {
            return this.f16866x;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes2.dex */
    public static class e<ContainingType extends n, Type> {

        /* renamed from: a  reason: collision with root package name */
        public final ContainingType f16867a;

        /* renamed from: b  reason: collision with root package name */
        public final Type f16868b;

        /* renamed from: c  reason: collision with root package name */
        public final n f16869c;

        /* renamed from: d  reason: collision with root package name */
        public final d f16870d;

        /* renamed from: e  reason: collision with root package name */
        public final Method f16871e;

        /* JADX WARN: Multi-variable type inference failed */
        public e(c cVar, Object obj, g gVar, d dVar, Class cls) {
            if (cVar != null) {
                if (dVar.f16864v == u.f16917z && gVar == null) {
                    throw new IllegalArgumentException("Null messageDefaultInstance");
                }
                this.f16867a = cVar;
                this.f16868b = obj;
                this.f16869c = gVar;
                this.f16870d = dVar;
                if (h.a.class.isAssignableFrom(cls)) {
                    try {
                        this.f16871e = cls.getMethod("valueOf", Integer.TYPE);
                        return;
                    } catch (NoSuchMethodException e10) {
                        String name = cls.getName();
                        StringBuilder sb2 = new StringBuilder(name.length() + 45 + 7);
                        sb2.append("Generated message class \"");
                        sb2.append(name);
                        sb2.append("\" missing method \"valueOf\".");
                        throw new RuntimeException(sb2.toString(), e10);
                    }
                }
                this.f16871e = null;
                return;
            }
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }

        public final Object a(Object obj) {
            if (this.f16870d.f16864v.f16918u == v.C) {
                try {
                    return this.f16871e.invoke(null, (Integer) obj);
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
                } catch (InvocationTargetException e11) {
                    Throwable cause = e11.getCause();
                    if (!(cause instanceof RuntimeException)) {
                        if (cause instanceof Error) {
                            throw ((Error) cause);
                        }
                        throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
                    }
                    throw ((RuntimeException) cause);
                }
            }
            return obj;
        }

        public final Object b(Object obj) {
            if (this.f16870d.f16864v.f16918u == v.C) {
                return Integer.valueOf(((h.a) obj).e());
            }
            return obj;
        }
    }

    public g() {
    }

    public static e g(c cVar, g gVar, int i6, u.c cVar2, Class cls) {
        return new e(cVar, Collections.emptyList(), gVar, new d(i6, cVar2, true), cls);
    }

    public static e h(c cVar, Serializable serializable, g gVar, int i6, u uVar, Class cls) {
        return new e(cVar, serializable, gVar, new d(i6, uVar, false), cls);
    }

    public g(int i6) {
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes2.dex */
    public static abstract class c<MessageType extends c<MessageType>> extends g implements o {

        /* renamed from: u  reason: collision with root package name */
        public final f<d> f16859u;

        /* compiled from: GeneratedMessageLite.java */
        /* loaded from: classes2.dex */
        public class a {

            /* renamed from: a  reason: collision with root package name */
            public final Iterator<Map.Entry<d, Object>> f16860a;

            /* renamed from: b  reason: collision with root package name */
            public Map.Entry<d, Object> f16861b;

            /* renamed from: c  reason: collision with root package name */
            public final boolean f16862c;

            public a(c cVar) {
                Iterator<Map.Entry<d, Object>> it;
                f<d> fVar = cVar.f16859u;
                boolean z10 = fVar.f16855c;
                r rVar = fVar.f16853a;
                if (z10) {
                    it = new i.b<>(((s.d) rVar.entrySet()).iterator());
                } else {
                    it = ((s.d) rVar.entrySet()).iterator();
                }
                this.f16860a = it;
                if (it.hasNext()) {
                    this.f16861b = it.next();
                }
                this.f16862c = false;
            }

            public final void a(int i6, CodedOutputStream codedOutputStream) {
                while (true) {
                    Map.Entry<d, Object> entry = this.f16861b;
                    if (entry != null && entry.getKey().f16863u < i6) {
                        d key = this.f16861b.getKey();
                        int i10 = 0;
                        if (this.f16862c && key.f16864v.f16918u == v.D && !key.f16865w) {
                            codedOutputStream.x(1, 3);
                            codedOutputStream.x(2, 0);
                            codedOutputStream.v(key.f16863u);
                            codedOutputStream.o(3, (n) this.f16861b.getValue());
                            codedOutputStream.x(1, 4);
                        } else {
                            Object value = this.f16861b.getValue();
                            f fVar = f.f16852d;
                            u m10 = key.m();
                            int e10 = key.e();
                            if (key.g()) {
                                List<Object> list = (List) value;
                                if (key.q()) {
                                    codedOutputStream.x(e10, 2);
                                    for (Object obj : list) {
                                        i10 += f.c(m10, obj);
                                    }
                                    codedOutputStream.v(i10);
                                    for (Object obj2 : list) {
                                        f.m(codedOutputStream, m10, obj2);
                                    }
                                } else {
                                    for (Object obj3 : list) {
                                        f.l(codedOutputStream, m10, e10, obj3);
                                    }
                                }
                            } else if (value instanceof i) {
                                f.l(codedOutputStream, m10, e10, ((i) value).a());
                            } else {
                                f.l(codedOutputStream, m10, e10, value);
                            }
                        }
                        Iterator<Map.Entry<d, Object>> it = this.f16860a;
                        if (it.hasNext()) {
                            this.f16861b = it.next();
                        } else {
                            this.f16861b = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        public c() {
            this.f16859u = new f<>();
        }

        public final boolean i() {
            int i6 = 0;
            while (true) {
                r rVar = this.f16859u.f16853a;
                if (i6 < rVar.f16897v.size()) {
                    if (!f.f(rVar.f16897v.get(i6))) {
                        return false;
                    }
                    i6++;
                } else {
                    for (Map.Entry<Object, Object> entry : rVar.c()) {
                        if (!f.f(entry)) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }

        public final int j() {
            r rVar;
            int i6 = 0;
            int i10 = 0;
            while (true) {
                rVar = this.f16859u.f16853a;
                if (i6 >= rVar.f16897v.size()) {
                    break;
                }
                s<K, V>.b bVar = rVar.f16897v.get(i6);
                i10 += f.d((f.a) bVar.getKey(), bVar.getValue());
                i6++;
            }
            for (Map.Entry<Object, Object> entry : rVar.c()) {
                i10 += f.d((f.a) entry.getKey(), entry.getValue());
            }
            return i10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [Type, java.util.ArrayList] */
        public final <Type> Type k(e<MessageType, Type> eVar) {
            p(eVar);
            f<d> fVar = this.f16859u;
            d dVar = eVar.f16870d;
            Type type = (Type) fVar.e(dVar);
            if (type == null) {
                return eVar.f16868b;
            }
            if (dVar.f16865w) {
                if (dVar.f16864v.f16918u == v.C) {
                    ?? r12 = (Type) new ArrayList();
                    for (Object obj : (List) type) {
                        r12.add(eVar.a(obj));
                    }
                    return r12;
                }
                return type;
            }
            return (Type) eVar.a(type);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> boolean l(e<MessageType, Type> eVar) {
            p(eVar);
            f<d> fVar = this.f16859u;
            fVar.getClass();
            d dVar = eVar.f16870d;
            if (!dVar.f16865w) {
                if (fVar.f16853a.get(dVar) != null) {
                    return true;
                }
                return false;
            }
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }

        public final void m() {
            this.f16859u.g();
        }

        public final c<MessageType>.a n() {
            return new a(this);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean o(gu.d dVar, CodedOutputStream codedOutputStream, gu.e eVar, int i6) {
            boolean z10;
            boolean z11;
            n.a aVar;
            Object build;
            n nVar;
            n e10 = e();
            int i10 = i6 & 7;
            eVar.getClass();
            e<?, ?> eVar2 = eVar.f16849a.get(new e.a(i6 >>> 3, e10));
            if (eVar2 != null) {
                d dVar2 = eVar2.f16870d;
                u uVar = dVar2.f16864v;
                f fVar = f.f16852d;
                if (i10 == uVar.f16919v) {
                    z10 = false;
                    z11 = false;
                    if (z10) {
                        return dVar.q(i6, codedOutputStream);
                    }
                    f<d> fVar2 = this.f16859u;
                    if (z11) {
                        int d10 = dVar.d(dVar.k());
                        d dVar3 = eVar2.f16870d;
                        if (dVar3.f16864v == u.A) {
                            if (dVar.b() > 0) {
                                dVar.k();
                                dVar3.getClass();
                                throw null;
                            }
                        } else {
                            while (dVar.b() > 0) {
                                fVar2.a(dVar3, f.i(dVar, dVar3.f16864v));
                            }
                        }
                        dVar.c(d10);
                        return true;
                    }
                    int ordinal = eVar2.f16870d.f16864v.f16918u.ordinal();
                    d dVar4 = eVar2.f16870d;
                    if (ordinal != 7) {
                        if (ordinal != 8) {
                            build = f.i(dVar, dVar4.f16864v);
                        } else {
                            if (!dVar4.f16865w && (nVar = (n) fVar2.e(dVar4)) != null) {
                                aVar = nVar.a();
                            } else {
                                aVar = null;
                            }
                            if (aVar == null) {
                                aVar = eVar2.f16869c.c();
                            }
                            if (dVar4.f16864v == u.f16916y) {
                                int i11 = dVar.f16847i;
                                if (i11 < 64) {
                                    dVar.f16847i = i11 + 1;
                                    aVar.R(dVar, eVar);
                                    dVar.a((dVar4.f16863u << 3) | 4);
                                    dVar.f16847i--;
                                } else {
                                    throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
                                }
                            } else {
                                int k10 = dVar.k();
                                if (dVar.f16847i < 64) {
                                    int d11 = dVar.d(k10);
                                    dVar.f16847i++;
                                    aVar.R(dVar, eVar);
                                    dVar.a(0);
                                    dVar.f16847i--;
                                    dVar.c(d11);
                                } else {
                                    throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
                                }
                            }
                            build = aVar.build();
                        }
                        if (dVar4.f16865w) {
                            fVar2.a(dVar4, eVar2.b(build));
                            return true;
                        }
                        fVar2.j(dVar4, eVar2.b(build));
                        return true;
                    }
                    dVar.k();
                    dVar4.getClass();
                    throw null;
                } else if (dVar2.f16865w && uVar.d() && i10 == 2) {
                    z10 = false;
                    z11 = true;
                    if (z10) {
                    }
                }
            }
            z10 = true;
            z11 = false;
            if (z10) {
            }
        }

        public final void p(e<MessageType, ?> eVar) {
            if (eVar.f16867a == e()) {
                return;
            }
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }

        public c(b<MessageType, ?> bVar) {
            bVar.f16857v.g();
            bVar.f16858w = false;
            this.f16859u = bVar.f16857v;
        }
    }
}
