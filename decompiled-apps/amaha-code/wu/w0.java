package wu;

import java.util.ArrayDeque;
/* compiled from: AbstractTypeChecker.kt */
/* loaded from: classes2.dex */
public class w0 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f37302a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f37303b;

    /* renamed from: c  reason: collision with root package name */
    public final zu.n f37304c;

    /* renamed from: d  reason: collision with root package name */
    public final com.android.volley.toolbox.a f37305d;

    /* renamed from: e  reason: collision with root package name */
    public final androidx.work.k f37306e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayDeque<zu.i> f37307g;

    /* renamed from: h  reason: collision with root package name */
    public dv.e f37308h;

    /* compiled from: AbstractTypeChecker.kt */
    /* loaded from: classes2.dex */
    public interface a {

        /* compiled from: AbstractTypeChecker.kt */
        /* renamed from: wu.w0$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0625a implements a {

            /* renamed from: a  reason: collision with root package name */
            public boolean f37309a;

            @Override // wu.w0.a
            public final void a(d dVar) {
                if (this.f37309a) {
                    return;
                }
                this.f37309a = ((Boolean) dVar.invoke()).booleanValue();
            }
        }

        void a(d dVar);
    }

    /* compiled from: AbstractTypeChecker.kt */
    /* loaded from: classes2.dex */
    public static abstract class b {

        /* compiled from: AbstractTypeChecker.kt */
        /* loaded from: classes2.dex */
        public static abstract class a extends b {
        }

        /* compiled from: AbstractTypeChecker.kt */
        /* renamed from: wu.w0$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0626b extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C0626b f37310a = new C0626b();

            @Override // wu.w0.b
            public final zu.i a(w0 state, zu.h type) {
                kotlin.jvm.internal.i.g(state, "state");
                kotlin.jvm.internal.i.g(type, "type");
                return state.f37304c.o0(type);
            }
        }

        /* compiled from: AbstractTypeChecker.kt */
        /* loaded from: classes2.dex */
        public static final class c extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final c f37311a = new c();

            @Override // wu.w0.b
            public final zu.i a(w0 state, zu.h type) {
                kotlin.jvm.internal.i.g(state, "state");
                kotlin.jvm.internal.i.g(type, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        /* compiled from: AbstractTypeChecker.kt */
        /* loaded from: classes2.dex */
        public static final class d extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final d f37312a = new d();

            @Override // wu.w0.b
            public final zu.i a(w0 state, zu.h type) {
                kotlin.jvm.internal.i.g(state, "state");
                kotlin.jvm.internal.i.g(type, "type");
                return state.f37304c.q(type);
            }
        }

        public abstract zu.i a(w0 w0Var, zu.h hVar);
    }

    public w0(boolean z10, boolean z11, zu.n typeSystemContext, com.android.volley.toolbox.a kotlinTypePreparator, androidx.work.k kotlinTypeRefiner) {
        kotlin.jvm.internal.i.g(typeSystemContext, "typeSystemContext");
        kotlin.jvm.internal.i.g(kotlinTypePreparator, "kotlinTypePreparator");
        kotlin.jvm.internal.i.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.f37302a = z10;
        this.f37303b = z11;
        this.f37304c = typeSystemContext;
        this.f37305d = kotlinTypePreparator;
        this.f37306e = kotlinTypeRefiner;
    }

    public final void a() {
        ArrayDeque<zu.i> arrayDeque = this.f37307g;
        kotlin.jvm.internal.i.d(arrayDeque);
        arrayDeque.clear();
        dv.e eVar = this.f37308h;
        kotlin.jvm.internal.i.d(eVar);
        eVar.clear();
    }

    public boolean b(zu.h subType, zu.h superType) {
        kotlin.jvm.internal.i.g(subType, "subType");
        kotlin.jvm.internal.i.g(superType, "superType");
        return true;
    }

    public final void c() {
        if (this.f37307g == null) {
            this.f37307g = new ArrayDeque<>(4);
        }
        if (this.f37308h == null) {
            this.f37308h = new dv.e();
        }
    }

    public final zu.h d(zu.h type) {
        kotlin.jvm.internal.i.g(type, "type");
        return this.f37305d.p(type);
    }
}
