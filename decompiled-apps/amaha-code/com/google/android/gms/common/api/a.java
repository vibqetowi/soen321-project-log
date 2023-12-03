package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.internal.a0;
import com.google.android.gms.common.api.internal.k;
import java.util.Set;
import v9.b;
import v9.i;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class a<O extends c> {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0142a<?, O> f7303a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7304b;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* renamed from: com.google.android.gms.common.api.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0142a<T extends e, O> extends d<T, O> {
        @Deprecated
        public e a(Context context, Looper looper, v9.c cVar, c cVar2, c.a aVar, c.b bVar) {
            return b(context, looper, cVar, cVar2, aVar, bVar);
        }

        public e b(Context context, Looper looper, v9.c cVar, c cVar2, com.google.android.gms.common.api.internal.e eVar, k kVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* loaded from: classes.dex */
    public static class b<C> {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* loaded from: classes.dex */
    public interface c {

        /* renamed from: b  reason: collision with root package name */
        public static final C0144c f7305b = new C0144c(0);

        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        /* renamed from: com.google.android.gms.common.api.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public interface InterfaceC0143a extends c {
            Account M();
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        /* loaded from: classes.dex */
        public interface b extends c {
            GoogleSignInAccount K();
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        /* renamed from: com.google.android.gms.common.api.a$c$c  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0144c implements c {
            public C0144c() {
            }

            public /* synthetic */ C0144c(int i6) {
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* loaded from: classes.dex */
    public static abstract class d<T, O> {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* loaded from: classes.dex */
    public interface e {
        Set<Scope> a();

        void b(String str);

        void c(a0 a0Var);

        boolean d();

        String e();

        void f(i iVar, Set<Scope> set);

        void h();

        void i(b.c cVar);

        boolean j();

        boolean k();

        int l();

        s9.d[] m();

        String n();

        boolean o();
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* loaded from: classes.dex */
    public static final class f<C extends e> extends b<C> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <C extends e> a(String str, AbstractC0142a<C, O> abstractC0142a, f<C> fVar) {
        this.f7304b = str;
        this.f7303a = abstractC0142a;
    }
}
