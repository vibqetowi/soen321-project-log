package zt;

import com.theinnerhour.b2b.utils.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import pt.d0;
import yt.o;
import zt.a;
/* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
/* loaded from: classes2.dex */
public final class b implements o.c {

    /* renamed from: i  reason: collision with root package name */
    public static final boolean f39850i = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));

    /* renamed from: j  reason: collision with root package name */
    public static final HashMap f39851j;

    /* renamed from: a  reason: collision with root package name */
    public int[] f39852a = null;

    /* renamed from: b  reason: collision with root package name */
    public String f39853b = null;

    /* renamed from: c  reason: collision with root package name */
    public int f39854c = 0;

    /* renamed from: d  reason: collision with root package name */
    public String[] f39855d = null;

    /* renamed from: e  reason: collision with root package name */
    public String[] f39856e = null;
    public String[] f = null;

    /* renamed from: g  reason: collision with root package name */
    public a.EnumC0686a f39857g = null;

    /* renamed from: h  reason: collision with root package name */
    public String[] f39858h = null;

    static {
        HashMap hashMap = new HashMap();
        f39851j = hashMap;
        hashMap.put(fu.b.l(new fu.c("kotlin.jvm.internal.KotlinClass")), a.EnumC0686a.CLASS);
        hashMap.put(fu.b.l(new fu.c("kotlin.jvm.internal.KotlinFileFacade")), a.EnumC0686a.FILE_FACADE);
        hashMap.put(fu.b.l(new fu.c("kotlin.jvm.internal.KotlinMultifileClass")), a.EnumC0686a.MULTIFILE_CLASS);
        hashMap.put(fu.b.l(new fu.c("kotlin.jvm.internal.KotlinMultifileClassPart")), a.EnumC0686a.MULTIFILE_CLASS_PART);
        hashMap.put(fu.b.l(new fu.c("kotlin.jvm.internal.KotlinSyntheticClass")), a.EnumC0686a.SYNTHETIC_CLASS);
    }

    @Override // yt.o.c
    public final o.a b(fu.b bVar, mt.a aVar) {
        a.EnumC0686a enumC0686a;
        fu.c b10 = bVar.b();
        if (b10.equals(d0.f28870a)) {
            return new C0687b();
        }
        if (b10.equals(d0.f28883o)) {
            return new c();
        }
        if (f39850i || this.f39857g != null || (enumC0686a = (a.EnumC0686a) f39851j.get(bVar)) == null) {
            return null;
        }
        this.f39857g = enumC0686a;
        return new d();
    }

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    /* renamed from: zt.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0687b implements o.a {
        public C0687b() {
        }

        @Override // yt.o.a
        public final void b(Object obj, fu.e eVar) {
            String f = eVar.f();
            boolean equals = "k".equals(f);
            b bVar = b.this;
            if (equals) {
                if (obj instanceof Integer) {
                    a.EnumC0686a enumC0686a = (a.EnumC0686a) a.EnumC0686a.f39844v.get(Integer.valueOf(((Integer) obj).intValue()));
                    if (enumC0686a == null) {
                        enumC0686a = a.EnumC0686a.UNKNOWN;
                    }
                    bVar.f39857g = enumC0686a;
                }
            } else if ("mv".equals(f)) {
                if (obj instanceof int[]) {
                    bVar.f39852a = (int[]) obj;
                }
            } else if ("xs".equals(f)) {
                if (obj instanceof String) {
                    bVar.f39853b = (String) obj;
                }
            } else if ("xi".equals(f)) {
                if (obj instanceof Integer) {
                    bVar.f39854c = ((Integer) obj).intValue();
                }
            } else if ("pn".equals(f) && (obj instanceof String)) {
                String str = (String) obj;
                bVar.getClass();
            }
        }

        @Override // yt.o.a
        public final o.b c(fu.e eVar) {
            String f = eVar.f();
            if ("d1".equals(f)) {
                return new zt.c(this);
            }
            if ("d2".equals(f)) {
                return new zt.d(this);
            }
            return null;
        }

        @Override // yt.o.a
        public final o.a d(fu.b bVar, fu.e eVar) {
            return null;
        }

        @Override // yt.o.a
        public final void a() {
        }

        @Override // yt.o.a
        public final void e(fu.e eVar, ku.f fVar) {
        }

        @Override // yt.o.a
        public final void f(fu.e eVar, fu.b bVar, fu.e eVar2) {
        }
    }

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    /* loaded from: classes2.dex */
    public class c implements o.a {
        public c() {
        }

        @Override // yt.o.a
        public final o.b c(fu.e eVar) {
            if (Constants.ONBOARDING_VARIANT.equals(eVar.f())) {
                return new e(this);
            }
            return null;
        }

        @Override // yt.o.a
        public final o.a d(fu.b bVar, fu.e eVar) {
            return null;
        }

        @Override // yt.o.a
        public final void a() {
        }

        @Override // yt.o.a
        public final void b(Object obj, fu.e eVar) {
        }

        @Override // yt.o.a
        public final void e(fu.e eVar, ku.f fVar) {
        }

        @Override // yt.o.a
        public final void f(fu.e eVar, fu.b bVar, fu.e eVar2) {
        }
    }

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    /* loaded from: classes2.dex */
    public class d implements o.a {
        public d() {
        }

        @Override // yt.o.a
        public final void b(Object obj, fu.e eVar) {
            String str;
            String f = eVar.f();
            boolean equals = "version".equals(f);
            b bVar = b.this;
            if (equals) {
                if (obj instanceof int[]) {
                    bVar.f39852a = (int[]) obj;
                }
            } else if ("multifileClassName".equals(f)) {
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = null;
                }
                bVar.f39853b = str;
            }
        }

        @Override // yt.o.a
        public final o.b c(fu.e eVar) {
            String f = eVar.f();
            if (!"data".equals(f) && !"filePartClassNames".equals(f)) {
                if ("strings".equals(f)) {
                    return new g(this);
                }
                return null;
            }
            return new f(this);
        }

        @Override // yt.o.a
        public final o.a d(fu.b bVar, fu.e eVar) {
            return null;
        }

        @Override // yt.o.a
        public final void a() {
        }

        @Override // yt.o.a
        public final void e(fu.e eVar, ku.f fVar) {
        }

        @Override // yt.o.a
        public final void f(fu.e eVar, fu.b bVar, fu.e eVar2) {
        }
    }

    @Override // yt.o.c
    public final void a() {
    }

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    /* loaded from: classes2.dex */
    public static abstract class a implements o.b {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f39859a = new ArrayList();

        @Override // yt.o.b
        public final void a() {
            f((String[]) this.f39859a.toArray(new String[0]));
        }

        @Override // yt.o.b
        public final o.a c(fu.b bVar) {
            return null;
        }

        @Override // yt.o.b
        public final void d(Object obj) {
            if (obj instanceof String) {
                this.f39859a.add((String) obj);
            }
        }

        public abstract void f(String[] strArr);

        @Override // yt.o.b
        public final void b(ku.f fVar) {
        }

        @Override // yt.o.b
        public final void e(fu.b bVar, fu.e eVar) {
        }
    }
}
