package jv;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.appsflyer.R;
import kotlin.jvm.internal.x;
import kotlinx.coroutines.c1;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import ta.v;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: Merge.kt */
/* loaded from: classes2.dex */
public final class h<T, R> extends g<T, R> {

    /* renamed from: y  reason: collision with root package name */
    public final ss.q<kotlinx.coroutines.flow.e<? super R>, T, ls.d<? super hs.k>, Object> f22653y;

    /* compiled from: Merge.kt */
    @ns.e(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", l = {27}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f22654u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f22655v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ h<T, R> f22656w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.e<R> f22657x;

        /* compiled from: Merge.kt */
        /* renamed from: jv.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0346a<T> implements kotlinx.coroutines.flow.e {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ x<c1> f22658u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ d0 f22659v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ h<T, R> f22660w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.e<R> f22661x;

            /* compiled from: Merge.kt */
            @ns.e(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", l = {R.styleable.AppCompatTheme_activityChooserViewStyle}, m = "invokeSuspend")
            /* renamed from: jv.h$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0347a extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

                /* renamed from: u  reason: collision with root package name */
                public int f22662u;

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ h<T, R> f22663v;

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.e<R> f22664w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ T f22665x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0347a(h<T, R> hVar, kotlinx.coroutines.flow.e<? super R> eVar, T t3, ls.d<? super C0347a> dVar) {
                    super(2, dVar);
                    this.f22663v = hVar;
                    this.f22664w = eVar;
                    this.f22665x = t3;
                }

                @Override // ns.a
                public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                    return new C0347a(this.f22663v, this.f22664w, this.f22665x, dVar);
                }

                @Override // ss.p
                public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
                    return ((C0347a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
                }

                @Override // ns.a
                public final Object invokeSuspend(Object obj) {
                    ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                    int i6 = this.f22662u;
                    if (i6 != 0) {
                        if (i6 == 1) {
                            sp.b.d0(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        sp.b.d0(obj);
                        this.f22662u = 1;
                        if (this.f22663v.f22653y.invoke(this.f22664w, this.f22665x, this) == aVar) {
                            return aVar;
                        }
                    }
                    return hs.k.f19476a;
                }
            }

            /* compiled from: Merge.kt */
            @ns.e(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", l = {R.styleable.AppCompatTheme_actionModeTheme}, m = "emit")
            /* renamed from: jv.h$a$a$b */
            /* loaded from: classes2.dex */
            public static final class b extends ns.c {

                /* renamed from: u  reason: collision with root package name */
                public C0346a f22666u;

                /* renamed from: v  reason: collision with root package name */
                public Object f22667v;

                /* renamed from: w  reason: collision with root package name */
                public c1 f22668w;

                /* renamed from: x  reason: collision with root package name */
                public /* synthetic */ Object f22669x;

                /* renamed from: y  reason: collision with root package name */
                public final /* synthetic */ C0346a<T> f22670y;

                /* renamed from: z  reason: collision with root package name */
                public int f22671z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(C0346a<? super T> c0346a, ls.d<? super b> dVar) {
                    super(dVar);
                    this.f22670y = c0346a;
                }

                @Override // ns.a
                public final Object invokeSuspend(Object obj) {
                    this.f22669x = obj;
                    this.f22671z |= LinearLayoutManager.INVALID_OFFSET;
                    return this.f22670y.b(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0346a(x<c1> xVar, d0 d0Var, h<T, R> hVar, kotlinx.coroutines.flow.e<? super R> eVar) {
                this.f22658u = xVar;
                this.f22659v = d0Var;
                this.f22660w = hVar;
                this.f22661x = eVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
            @Override // kotlinx.coroutines.flow.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object b(T t3, ls.d<? super hs.k> dVar) {
                b bVar;
                int i6;
                C0346a<T> c0346a;
                if (dVar instanceof b) {
                    bVar = (b) dVar;
                    int i10 = bVar.f22671z;
                    if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        bVar.f22671z = i10 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj = bVar.f22669x;
                        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                        i6 = bVar.f22671z;
                        if (i6 == 0) {
                            if (i6 == 1) {
                                t3 = (T) bVar.f22667v;
                                c0346a = bVar.f22666u;
                                sp.b.d0(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            sp.b.d0(obj);
                            c1 c1Var = this.f22658u.f23469u;
                            if (c1Var != null) {
                                c1Var.g(new ChildCancelledException());
                                bVar.f22666u = this;
                                bVar.f22667v = t3;
                                bVar.f22668w = c1Var;
                                bVar.f22671z = 1;
                                if (c1Var.j(bVar) == aVar) {
                                    return aVar;
                                }
                            }
                            c0346a = this;
                        }
                        c0346a.f22658u.f23469u = (T) v.H(c0346a.f22659v, null, 4, new C0347a(c0346a.f22660w, c0346a.f22661x, t3, null), 1);
                        return hs.k.f19476a;
                    }
                }
                bVar = new b(this, dVar);
                Object obj2 = bVar.f22669x;
                ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
                i6 = bVar.f22671z;
                if (i6 == 0) {
                }
                c0346a.f22658u.f23469u = (T) v.H(c0346a.f22659v, null, 4, new C0347a(c0346a.f22660w, c0346a.f22661x, t3, null), 1);
                return hs.k.f19476a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(h<T, R> hVar, kotlinx.coroutines.flow.e<? super R> eVar, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f22656w = hVar;
            this.f22657x = eVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f22656w, this.f22657x, dVar);
            aVar.f22655v = obj;
            return aVar;
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f22654u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                x xVar = new x();
                h<T, R> hVar = this.f22656w;
                kotlinx.coroutines.flow.d<S> dVar = hVar.f22652x;
                C0346a c0346a = new C0346a(xVar, (d0) this.f22655v, hVar, this.f22657x);
                this.f22654u = 1;
                if (dVar.a(c0346a, this) == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(ss.q<? super kotlinx.coroutines.flow.e<? super R>, ? super T, ? super ls.d<? super hs.k>, ? extends Object> qVar, kotlinx.coroutines.flow.d<? extends T> dVar, ls.f fVar, int i6, iv.e eVar) {
        super(dVar, fVar, i6, eVar);
        this.f22653y = qVar;
    }

    @Override // jv.e
    public final e<R> d(ls.f fVar, int i6, iv.e eVar) {
        return new h(this.f22653y, this.f22652x, fVar, i6, eVar);
    }

    @Override // jv.g
    public final Object f(kotlinx.coroutines.flow.e<? super R> eVar, ls.d<? super hs.k> dVar) {
        a aVar = new a(this, eVar, null);
        kotlinx.coroutines.internal.p pVar = new kotlinx.coroutines.internal.p(dVar, dVar.getContext());
        Object Z = sp.b.Z(pVar, pVar, aVar);
        if (Z == ms.a.COROUTINE_SUSPENDED) {
            return Z;
        }
        return hs.k.f19476a;
    }
}
