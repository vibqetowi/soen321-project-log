package o4;

import e5.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ModelLoaderRegistry.java */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final r f27082a;

    /* renamed from: b  reason: collision with root package name */
    public final a f27083b;

    /* compiled from: ModelLoaderRegistry.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final HashMap f27084a = new HashMap();

        /* compiled from: ModelLoaderRegistry.java */
        /* renamed from: o4.p$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0449a<Model> {

            /* renamed from: a  reason: collision with root package name */
            public final List<n<Model, ?>> f27085a;

            public C0449a(List<n<Model, ?>> list) {
                this.f27085a = list;
            }
        }
    }

    public p(a.c cVar) {
        r rVar = new r(cVar);
        this.f27083b = new a();
        this.f27082a = rVar;
    }

    public final synchronized ArrayList a(Class cls) {
        return this.f27082a.e(cls);
    }
}
