package kt;

import com.google.android.gms.internal.p000firebaseauthapi.s5;
/* compiled from: PackageViewDescriptorFactory.kt */
/* loaded from: classes2.dex */
public interface j0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f23852a = a.f23853a;

    /* compiled from: PackageViewDescriptorFactory.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f23853a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final s5 f23854b = new s5("PackageViewDescriptorFactory", 16);
    }

    /* compiled from: PackageViewDescriptorFactory.kt */
    /* loaded from: classes2.dex */
    public static final class b implements j0 {

        /* renamed from: b  reason: collision with root package name */
        public static final b f23855b = new b();

        @Override // kt.j0
        public final z a(g0 module, fu.c fqName, vu.l storageManager) {
            kotlin.jvm.internal.i.g(module, "module");
            kotlin.jvm.internal.i.g(fqName, "fqName");
            kotlin.jvm.internal.i.g(storageManager, "storageManager");
            return new z(module, fqName, storageManager);
        }
    }

    z a(g0 g0Var, fu.c cVar, vu.l lVar);
}
