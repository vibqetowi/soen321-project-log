package xt;

import is.a0;
import is.b0;
import is.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
/* compiled from: predefinedEnhancementInfo.kt */
/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f38078a = new LinkedHashMap();

    /* compiled from: predefinedEnhancementInfo.kt */
    /* loaded from: classes2.dex */
    public final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f38079a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ t f38080b;

        /* compiled from: predefinedEnhancementInfo.kt */
        /* renamed from: xt.t$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public final class C0644a {

            /* renamed from: a  reason: collision with root package name */
            public final String f38081a;

            /* renamed from: b  reason: collision with root package name */
            public final ArrayList f38082b = new ArrayList();

            /* renamed from: c  reason: collision with root package name */
            public hs.f<String, v> f38083c = new hs.f<>("V", null);

            public C0644a(a aVar, String str) {
                this.f38081a = str;
            }

            public final void a(String type, g... gVarArr) {
                boolean z10;
                v vVar;
                kotlin.jvm.internal.i.g(type, "type");
                ArrayList arrayList = this.f38082b;
                if (gVarArr.length == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    vVar = null;
                } else {
                    a0 l2 = is.k.l2(gVarArr);
                    int P = sp.b.P(is.i.H1(l2, 10));
                    if (P < 16) {
                        P = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(P);
                    Iterator it = l2.iterator();
                    while (true) {
                        b0 b0Var = (b0) it;
                        if (!b0Var.hasNext()) {
                            break;
                        }
                        z zVar = (z) b0Var.next();
                        linkedHashMap.put(Integer.valueOf(zVar.f20679a), (g) zVar.f20680b);
                    }
                    vVar = new v(linkedHashMap);
                }
                arrayList.add(new hs.f(type, vVar));
            }

            public final void b(String type, g... gVarArr) {
                kotlin.jvm.internal.i.g(type, "type");
                a0 l2 = is.k.l2(gVarArr);
                int P = sp.b.P(is.i.H1(l2, 10));
                if (P < 16) {
                    P = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(P);
                Iterator it = l2.iterator();
                while (true) {
                    b0 b0Var = (b0) it;
                    if (b0Var.hasNext()) {
                        z zVar = (z) b0Var.next();
                        linkedHashMap.put(Integer.valueOf(zVar.f20679a), (g) zVar.f20680b);
                    } else {
                        this.f38083c = new hs.f<>(type, new v(linkedHashMap));
                        return;
                    }
                }
            }

            public final void c(nu.c type) {
                kotlin.jvm.internal.i.g(type, "type");
                String h10 = type.h();
                kotlin.jvm.internal.i.f(h10, "type.desc");
                this.f38083c = new hs.f<>(h10, null);
            }
        }

        public a(t tVar, String className) {
            kotlin.jvm.internal.i.g(className, "className");
            this.f38080b = tVar;
            this.f38079a = className;
        }

        public final void a(String str, ss.l<? super C0644a, hs.k> lVar) {
            LinkedHashMap linkedHashMap = this.f38080b.f38078a;
            C0644a c0644a = new C0644a(this, str);
            lVar.invoke(c0644a);
            ArrayList arrayList = c0644a.f38082b;
            ArrayList arrayList2 = new ArrayList(is.i.H1(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((String) ((hs.f) it.next()).f19464u);
            }
            String ret = c0644a.f38083c.f19464u;
            String name = c0644a.f38081a;
            kotlin.jvm.internal.i.g(name, "name");
            kotlin.jvm.internal.i.g(ret, "ret");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(name);
            sb2.append('(');
            sb2.append(is.u.m2(arrayList2, "", null, null, yt.t.f39058u, 30));
            sb2.append(')');
            if (ret.length() > 1) {
                ret = "L" + ret + ';';
            }
            sb2.append(ret);
            String jvmDescriptor = sb2.toString();
            String internalName = this.f38079a;
            kotlin.jvm.internal.i.g(internalName, "internalName");
            kotlin.jvm.internal.i.g(jvmDescriptor, "jvmDescriptor");
            String str2 = internalName + '.' + jvmDescriptor;
            v vVar = c0644a.f38083c.f19465v;
            ArrayList arrayList3 = new ArrayList(is.i.H1(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add((v) ((hs.f) it2.next()).f19465v);
            }
            linkedHashMap.put(str2, new m(vVar, arrayList3));
        }
    }
}
