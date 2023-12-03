package at;

import au.h;
import gt.z0;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
/* compiled from: ReflectionFactoryImpl.java */
/* loaded from: classes2.dex */
public class o0 extends kotlin.jvm.internal.z {
    public static o i(kotlin.jvm.internal.a aVar) {
        ys.f owner = aVar.getOwner();
        if (owner instanceof o) {
            return (o) owner;
        }
        return b.f3466v;
    }

    @Override // kotlin.jvm.internal.z
    public final ys.g a(kotlin.jvm.internal.f fVar) {
        o container = i(fVar);
        String name = fVar.getName();
        String signature = fVar.getSignature();
        Object boundReceiver = fVar.getBoundReceiver();
        kotlin.jvm.internal.i.g(container, "container");
        kotlin.jvm.internal.i.g(name, "name");
        kotlin.jvm.internal.i.g(signature, "signature");
        return new t(container, name, signature, null, boundReceiver);
    }

    @Override // kotlin.jvm.internal.z
    public final ys.d b(Class jClass) {
        Object obj;
        Object obj2;
        Object obj3;
        ev.b<String, Object> bVar = k.f3534a;
        kotlin.jvm.internal.i.g(jClass, "jClass");
        String name = jClass.getName();
        ev.b<String, Object> bVar2 = k.f3534a;
        bVar2.getClass();
        ev.a<ev.e<String, Object>> a10 = bVar2.f14575a.f14583a.a(name.hashCode());
        if (a10 == null) {
            a10 = ev.a.f14569x;
        }
        while (true) {
            obj = null;
            if (a10 == null || a10.f14572w <= 0) {
                break;
            }
            ev.e eVar = (ev.e) a10.f14570u;
            if (eVar.f14584u.equals(name)) {
                obj2 = eVar.f14585v;
                break;
            }
            a10 = a10.f14571v;
        }
        obj2 = null;
        if (obj2 instanceof WeakReference) {
            l lVar = (l) ((WeakReference) obj2).get();
            if (lVar != null) {
                obj = lVar.f3541v;
            }
            if (kotlin.jvm.internal.i.b(obj, jClass)) {
                return lVar;
            }
        } else if (obj2 != null) {
            for (WeakReference weakReference : (WeakReference[]) obj2) {
                l lVar2 = (l) weakReference.get();
                if (lVar2 != null) {
                    obj3 = lVar2.f3541v;
                } else {
                    obj3 = null;
                }
                if (kotlin.jvm.internal.i.b(obj3, jClass)) {
                    return lVar2;
                }
            }
            int length = ((Object[]) obj2).length;
            WeakReference[] weakReferenceArr = new WeakReference[length + 1];
            System.arraycopy(obj2, 0, weakReferenceArr, 0, length);
            l lVar3 = new l(jClass);
            weakReferenceArr[length] = new WeakReference(lVar3);
            k.f3534a = k.f3534a.a(name, weakReferenceArr);
            return lVar3;
        }
        l lVar4 = new l(jClass);
        k.f3534a = k.f3534a.a(name, new WeakReference(lVar4));
        return lVar4;
    }

    @Override // kotlin.jvm.internal.z
    public final ys.f c(Class cls, String str) {
        return new x(cls);
    }

    @Override // kotlin.jvm.internal.z
    public final ys.i d(kotlin.jvm.internal.l lVar) {
        return new v(i(lVar), lVar.getName(), lVar.getSignature(), lVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.z
    public final ys.k e(kotlin.jvm.internal.p pVar) {
        return new c0(i(pVar), pVar.getName(), pVar.getSignature(), pVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.z
    public final ys.l f(kotlin.jvm.internal.r rVar) {
        return new d0(i(rVar), rVar.getName(), rVar.getSignature(), rVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.z
    public final String g(kotlin.jvm.internal.e eVar) {
        t b10;
        boolean z10;
        kotlin.jvm.internal.i.g(eVar, "<this>");
        Metadata metadata = (Metadata) eVar.getClass().getAnnotation(Metadata.class);
        t tVar = null;
        if (metadata != null) {
            String[] d12 = metadata.d1();
            boolean z11 = true;
            if (d12.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                d12 = null;
            }
            if (d12 != null) {
                String[] strings = metadata.d2();
                gu.e eVar2 = eu.h.f14568a;
                kotlin.jvm.internal.i.g(strings, "strings");
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(eu.a.b(d12));
                eu.f g5 = eu.h.g(byteArrayInputStream, strings);
                h.a aVar = au.h.P;
                gu.e eVar3 = eu.h.f14568a;
                aVar.getClass();
                gu.d dVar = new gu.d(byteArrayInputStream);
                gu.n nVar = (gu.n) aVar.a(dVar, eVar3);
                try {
                    dVar.a(0);
                    gu.b.b(nVar);
                    au.h hVar = (au.h) nVar;
                    int[] mv2 = metadata.mv();
                    if ((metadata.xi() & 8) == 0) {
                        z11 = false;
                    }
                    eu.e eVar4 = new eu.e(mv2, z11);
                    Class<?> cls = eVar.getClass();
                    au.s sVar = hVar.J;
                    kotlin.jvm.internal.i.f(sVar, "proto.typeTable");
                    tVar = new t(b.f3466v, (gt.p0) t0.f(cls, hVar, g5, new cu.e(sVar), eVar4, zs.a.f39837u));
                } catch (InvalidProtocolBufferException e10) {
                    e10.f23476u = nVar;
                    throw e10;
                }
            }
        }
        if (tVar != null && (b10 = t0.b(tVar)) != null) {
            hu.d dVar2 = p0.f3592a;
            gt.u t3 = b10.t();
            StringBuilder sb2 = new StringBuilder();
            p0.a(sb2, t3);
            List<z0> i6 = t3.i();
            kotlin.jvm.internal.i.f(i6, "invoke.valueParameters");
            is.u.l2(i6, sb2, ", ", "(", ")", q0.f3595u, 48);
            sb2.append(" -> ");
            wu.b0 returnType = t3.getReturnType();
            kotlin.jvm.internal.i.d(returnType);
            sb2.append(p0.d(returnType));
            String sb3 = sb2.toString();
            kotlin.jvm.internal.i.f(sb3, "StringBuilder().apply(builderAction).toString()");
            return sb3;
        }
        return super.g(eVar);
    }

    @Override // kotlin.jvm.internal.z
    public final String h(kotlin.jvm.internal.k kVar) {
        return g(kVar);
    }
}
