package kotlinx.coroutines.flow;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.c1;
/* compiled from: StateFlow.kt */
/* loaded from: classes2.dex */
public final class x<T> extends jv.a<y> implements p<T>, d {
    private volatile /* synthetic */ Object _state;

    /* renamed from: x  reason: collision with root package name */
    public int f23562x;

    /* compiled from: StateFlow.kt */
    @ns.e(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {386, 398, 403}, m = "collect")
    /* loaded from: classes2.dex */
    public static final class a extends ns.c {
        public final /* synthetic */ x<T> A;
        public int B;

        /* renamed from: u  reason: collision with root package name */
        public x f23563u;

        /* renamed from: v  reason: collision with root package name */
        public e f23564v;

        /* renamed from: w  reason: collision with root package name */
        public y f23565w;

        /* renamed from: x  reason: collision with root package name */
        public c1 f23566x;

        /* renamed from: y  reason: collision with root package name */
        public Object f23567y;

        /* renamed from: z  reason: collision with root package name */
        public /* synthetic */ Object f23568z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x<T> xVar, ls.d<? super a> dVar) {
            super(dVar);
            this.A = xVar;
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            this.f23568z = obj;
            this.B |= LinearLayoutManager.INVALID_OFFSET;
            return this.A.a(null, this);
        }
    }

    public x(Object obj) {
        this._state = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a7, code lost:
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ab, code lost:
        if (kotlin.jvm.internal.i.b(r0, r13) != false) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:14:0x003a, B:34:0x0095, B:36:0x0099, B:39:0x00a0, B:40:0x00a4, B:42:0x00a7, B:52:0x00c8, B:57:0x00e1, B:58:0x00f9, B:64:0x010c, B:65:0x0111, B:68:0x0118, B:61:0x0104, B:44:0x00ad, B:48:0x00b4, B:19:0x0051, B:22:0x005d, B:33:0x0085), top: B:76:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e1 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:14:0x003a, B:34:0x0095, B:36:0x0099, B:39:0x00a0, B:40:0x00a4, B:42:0x00a7, B:52:0x00c8, B:57:0x00e1, B:58:0x00f9, B:64:0x010c, B:65:0x0111, B:68:0x0118, B:61:0x0104, B:44:0x00ad, B:48:0x00b4, B:19:0x0051, B:22:0x005d, B:33:0x0085), top: B:76:0x0028 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00df -> B:34:0x0095). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x011a -> B:34:0x0095). Please submit an issue!!! */
    @Override // kotlinx.coroutines.flow.s, kotlinx.coroutines.flow.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(e<? super T> eVar, ls.d<?> dVar) {
        a aVar;
        ms.a aVar2;
        int i6;
        y yVar;
        x<T> xVar;
        y yVar2;
        c1 c1Var;
        e eVar2;
        ms.a aVar3;
        Object obj;
        Object andSet;
        boolean z10;
        Object obj2;
        Object obj3;
        e<? super T> eVar3 = eVar;
        try {
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i10 = aVar.B;
                if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    aVar.B = i10 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj4 = aVar.f23568z;
                    aVar2 = ms.a.COROUTINE_SUSPENDED;
                    i6 = aVar.B;
                    if (i6 == 0) {
                        if (i6 != 1) {
                            if (i6 != 2) {
                                if (i6 == 3) {
                                    obj = aVar.f23567y;
                                    c1Var = aVar.f23566x;
                                    yVar2 = aVar.f23565w;
                                    eVar2 = aVar.f23564v;
                                    xVar = aVar.f23563u;
                                    sp.b.d0(obj4);
                                    aVar3 = aVar2;
                                    obj2 = xVar._state;
                                    if (c1Var != null && !c1Var.a()) {
                                        throw c1Var.I();
                                    }
                                    if (obj2 == kotlin.jvm.internal.b0.K) {
                                        obj3 = null;
                                    } else {
                                        obj3 = obj2;
                                    }
                                    aVar.f23563u = xVar;
                                    aVar.f23564v = eVar2;
                                    aVar.f23565w = yVar2;
                                    aVar.f23566x = c1Var;
                                    aVar.f23567y = obj2;
                                    aVar.B = 2;
                                    if (eVar2.b(obj3, aVar) == aVar2) {
                                        return aVar2;
                                    }
                                    obj = obj2;
                                    eVar2 = eVar2;
                                    yVar2.getClass();
                                    kotlinx.coroutines.internal.r rVar = tr.r.f33553l0;
                                    andSet = y.f23569a.getAndSet(yVar2, rVar);
                                    kotlin.jvm.internal.i.d(andSet);
                                    boolean z11 = false;
                                    if (andSet != tr.r.f33554m0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (!z10) {
                                        aVar.f23563u = xVar;
                                        aVar.f23564v = eVar2;
                                        aVar.f23565w = yVar2;
                                        aVar.f23566x = c1Var;
                                        aVar.f23567y = obj;
                                        aVar.B = 3;
                                        kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(aVar));
                                        kVar.u();
                                        while (true) {
                                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y.f23569a;
                                            if (atomicReferenceFieldUpdater.compareAndSet(yVar2, rVar, kVar)) {
                                                z11 = true;
                                                break;
                                            } else if (atomicReferenceFieldUpdater.get(yVar2) != rVar) {
                                                break;
                                            }
                                        }
                                        if (!z11) {
                                            kVar.resumeWith(hs.k.f19476a);
                                        }
                                        Object s10 = kVar.s();
                                        if (s10 != aVar3) {
                                            s10 = hs.k.f19476a;
                                        }
                                        if (s10 == aVar2) {
                                            return aVar2;
                                        }
                                    }
                                    obj2 = xVar._state;
                                    if (c1Var != null) {
                                        throw c1Var.I();
                                    }
                                    if (obj2 == kotlin.jvm.internal.b0.K) {
                                    }
                                    aVar.f23563u = xVar;
                                    aVar.f23564v = eVar2;
                                    aVar.f23565w = yVar2;
                                    aVar.f23566x = c1Var;
                                    aVar.f23567y = obj2;
                                    aVar.B = 2;
                                    if (eVar2.b(obj3, aVar) == aVar2) {
                                    }
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                obj = aVar.f23567y;
                                c1Var = aVar.f23566x;
                                yVar2 = aVar.f23565w;
                                e eVar4 = aVar.f23564v;
                                xVar = aVar.f23563u;
                                sp.b.d0(obj4);
                                aVar3 = aVar2;
                                eVar2 = eVar4;
                                yVar2.getClass();
                                kotlinx.coroutines.internal.r rVar2 = tr.r.f33553l0;
                                andSet = y.f23569a.getAndSet(yVar2, rVar2);
                                kotlin.jvm.internal.i.d(andSet);
                                boolean z112 = false;
                                if (andSet != tr.r.f33554m0) {
                                }
                                if (!z10) {
                                }
                                obj2 = xVar._state;
                                if (c1Var != null) {
                                }
                                if (obj2 == kotlin.jvm.internal.b0.K) {
                                }
                                aVar.f23563u = xVar;
                                aVar.f23564v = eVar2;
                                aVar.f23565w = yVar2;
                                aVar.f23566x = c1Var;
                                aVar.f23567y = obj2;
                                aVar.B = 2;
                                if (eVar2.b(obj3, aVar) == aVar2) {
                                }
                            }
                        } else {
                            yVar2 = aVar.f23565w;
                            eVar3 = aVar.f23564v;
                            xVar = aVar.f23563u;
                            sp.b.d0(obj4);
                        }
                    } else {
                        sp.b.d0(obj4);
                        yVar = c();
                        try {
                            if (eVar3 instanceof a0) {
                                aVar.f23563u = this;
                                aVar.f23564v = eVar3;
                                aVar.f23565w = yVar;
                                aVar.B = 1;
                                if (((a0) eVar3).a(aVar) == aVar2) {
                                    return aVar2;
                                }
                            }
                            xVar = this;
                            yVar2 = yVar;
                        } catch (Throwable th2) {
                            th = th2;
                            xVar = this;
                            xVar.f(yVar);
                            throw th;
                        }
                    }
                    c1Var = (c1) aVar.getContext().e(c1.b.f23496u);
                    eVar2 = eVar3;
                    aVar3 = aVar2;
                    obj = null;
                    obj2 = xVar._state;
                    if (c1Var != null) {
                    }
                    if (obj2 == kotlin.jvm.internal.b0.K) {
                    }
                    aVar.f23563u = xVar;
                    aVar.f23564v = eVar2;
                    aVar.f23565w = yVar2;
                    aVar.f23566x = c1Var;
                    aVar.f23567y = obj2;
                    aVar.B = 2;
                    if (eVar2.b(obj3, aVar) == aVar2) {
                    }
                }
            }
            if (i6 == 0) {
            }
            c1Var = (c1) aVar.getContext().e(c1.b.f23496u);
            eVar2 = eVar3;
            aVar3 = aVar2;
            obj = null;
            obj2 = xVar._state;
            if (c1Var != null) {
            }
            if (obj2 == kotlin.jvm.internal.b0.K) {
            }
            aVar.f23563u = xVar;
            aVar.f23564v = eVar2;
            aVar.f23565w = yVar2;
            aVar.f23566x = c1Var;
            aVar.f23567y = obj2;
            aVar.B = 2;
            if (eVar2.b(obj3, aVar) == aVar2) {
            }
        } catch (Throwable th3) {
            th = th3;
            yVar = yVar2;
        }
        aVar = new a(this, dVar);
        Object obj42 = aVar.f23568z;
        aVar2 = ms.a.COROUTINE_SUSPENDED;
        i6 = aVar.B;
    }

    @Override // kotlinx.coroutines.flow.o, kotlinx.coroutines.flow.e
    public final Object b(T t3, ls.d<? super hs.k> dVar) {
        setValue(t3);
        return hs.k.f19476a;
    }

    @Override // jv.a
    public final y d() {
        return new y();
    }

    @Override // jv.a
    public final jv.b[] e() {
        return new y[2];
    }

    @Override // kotlinx.coroutines.flow.w
    public final T getValue() {
        kotlinx.coroutines.internal.r rVar = kotlin.jvm.internal.b0.K;
        T t3 = (T) this._state;
        if (t3 == rVar) {
            return null;
        }
        return t3;
    }

    @Override // kotlinx.coroutines.flow.p
    public final void setValue(T t3) {
        int i6;
        Object obj;
        kotlinx.coroutines.internal.r rVar;
        boolean z10;
        boolean z11;
        if (t3 == null) {
            t3 = (T) kotlin.jvm.internal.b0.K;
        }
        synchronized (this) {
            if (!kotlin.jvm.internal.i.b(this._state, t3)) {
                this._state = t3;
                int i10 = this.f23562x;
                if ((i10 & 1) == 0) {
                    int i11 = i10 + 1;
                    this.f23562x = i11;
                    Object obj2 = this.f22636u;
                    hs.k kVar = hs.k.f19476a;
                    while (true) {
                        y[] yVarArr = (y[]) obj2;
                        if (yVarArr != null) {
                            for (y yVar : yVarArr) {
                                if (yVar != null) {
                                    while (true) {
                                        Object obj3 = yVar._state;
                                        if (obj3 != null && obj3 != (rVar = tr.r.f33554m0)) {
                                            kotlinx.coroutines.internal.r rVar2 = tr.r.f33553l0;
                                            if (obj3 == rVar2) {
                                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y.f23569a;
                                                while (true) {
                                                    if (atomicReferenceFieldUpdater.compareAndSet(yVar, obj3, rVar)) {
                                                        z10 = true;
                                                        break;
                                                    } else if (atomicReferenceFieldUpdater.get(yVar) != obj3) {
                                                        z10 = false;
                                                        break;
                                                    }
                                                }
                                                if (z10) {
                                                    break;
                                                }
                                            } else {
                                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = y.f23569a;
                                                while (true) {
                                                    if (atomicReferenceFieldUpdater2.compareAndSet(yVar, obj3, rVar2)) {
                                                        z11 = true;
                                                        break;
                                                    } else if (atomicReferenceFieldUpdater2.get(yVar) != obj3) {
                                                        z11 = false;
                                                        break;
                                                    }
                                                }
                                                if (z11) {
                                                    ((kotlinx.coroutines.k) obj3).resumeWith(hs.k.f19476a);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        synchronized (this) {
                            i6 = this.f23562x;
                            if (i6 == i11) {
                                this.f23562x = i11 + 1;
                                return;
                            } else {
                                obj = this.f22636u;
                                hs.k kVar2 = hs.k.f19476a;
                            }
                        }
                        obj2 = obj;
                        i11 = i6;
                    }
                } else {
                    this.f23562x = i10 + 2;
                }
            }
        }
    }
}
