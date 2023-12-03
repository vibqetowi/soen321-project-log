package w3;

import com.appsflyer.R;
import iv.a;
import kotlinx.coroutines.d0;
import ss.p;
import ta.v;
/* compiled from: EventPipeline.kt */
@ns.e(c = "com.amplitude.core.platform.EventPipeline$write$1", f = "EventPipeline.kt", l = {R.styleable.AppCompatTheme_listMenuViewStyle, R.styleable.AppCompatTheme_listPreferredItemHeightSmall}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class e extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public iv.h f36371u;

    /* renamed from: v  reason: collision with root package name */
    public int f36372v;

    /* renamed from: w  reason: collision with root package name */
    public int f36373w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ f f36374x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, ls.d<? super e> dVar) {
        super(2, dVar);
        this.f36374x = fVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new e(this.f36374x, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((e) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ed  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10, types: [iv.h] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0097 -> B:9:0x0016). Please submit an issue!!! */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a.C0319a c0319a;
        e eVar;
        int i6;
        iv.h hVar;
        ms.a aVar;
        e eVar2;
        Exception e10;
        String message;
        v3.a aVar2;
        Object a10;
        a.C0319a c0319a2;
        f fVar;
        int incrementAndGet;
        Integer valueOf;
        boolean z10;
        int intValue;
        ms.a aVar3 = ms.a.COROUTINE_SUSPENDED;
        int i10 = this.f36373w;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    int i11 = this.f36372v;
                    hVar = this.f36371u;
                    try {
                        sp.b.d0(obj);
                        eVar = this;
                        i6 = i11;
                        c0319a2 = hVar;
                    } catch (Exception e11) {
                        e10 = e11;
                        i6 = i11;
                        aVar = aVar3;
                        eVar2 = this;
                        message = e10.getMessage();
                        if (message != null) {
                        }
                        eVar = eVar2;
                        aVar3 = aVar;
                        c0319a2 = hVar;
                        c0319a = c0319a2;
                        fVar = eVar.f36374x;
                        incrementAndGet = fVar.f36378d.incrementAndGet();
                        u3.b bVar = fVar.f36375a;
                        valueOf = Integer.valueOf(bVar.f33766a.c() / fVar.f36381h.get());
                        if (valueOf.intValue() != 0) {
                        }
                        if (z10) {
                        }
                        if (valueOf != null) {
                        }
                        if (incrementAndGet >= intValue) {
                        }
                        fVar.f36378d.set(0);
                        fVar.f36377c.q("#!upload");
                        eVar.f36371u = c0319a;
                        eVar.f36373w = 1;
                        a10 = c0319a.a(eVar);
                        if (a10 == aVar3) {
                        }
                    }
                    c0319a = c0319a2;
                    fVar = eVar.f36374x;
                    incrementAndGet = fVar.f36378d.incrementAndGet();
                    u3.b bVar2 = fVar.f36375a;
                    valueOf = Integer.valueOf(bVar2.f33766a.c() / fVar.f36381h.get());
                    if (valueOf.intValue() != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        intValue = 1;
                    } else {
                        intValue = valueOf.intValue();
                    }
                    if (incrementAndGet >= intValue && i6 == 0) {
                        v.H(bVar2.f33768c, bVar2.f, 0, new c(fVar, null), 2);
                    } else {
                        fVar.f36378d.set(0);
                        fVar.f36377c.q("#!upload");
                    }
                    eVar.f36371u = c0319a;
                    eVar.f36373w = 1;
                    a10 = c0319a.a(eVar);
                    if (a10 == aVar3) {
                        return aVar3;
                    }
                    ms.a aVar4 = aVar3;
                    eVar2 = eVar;
                    obj = a10;
                    hVar = c0319a;
                    aVar = aVar4;
                    if (!((Boolean) obj).booleanValue()) {
                        k kVar = (k) hVar.next();
                        if (kVar.f36390a == 2) {
                            i6 = 1;
                        } else {
                            i6 = 0;
                        }
                        if (i6 == 0 && (aVar2 = kVar.f36391b) != null) {
                            try {
                            } catch (Exception e12) {
                                e10 = e12;
                                message = e10.getMessage();
                                if (message != null) {
                                    eVar2.f36374x.f36375a.f33774j.c(kotlin.jvm.internal.i.n(message, "Error when write event: "));
                                }
                                eVar = eVar2;
                                aVar3 = aVar;
                                c0319a2 = hVar;
                                c0319a = c0319a2;
                                fVar = eVar.f36374x;
                                incrementAndGet = fVar.f36378d.incrementAndGet();
                                u3.b bVar22 = fVar.f36375a;
                                valueOf = Integer.valueOf(bVar22.f33766a.c() / fVar.f36381h.get());
                                if (valueOf.intValue() != 0) {
                                }
                                if (z10) {
                                }
                                if (valueOf != null) {
                                }
                                if (incrementAndGet >= intValue) {
                                }
                                fVar.f36378d.set(0);
                                fVar.f36377c.q("#!upload");
                                eVar.f36371u = c0319a;
                                eVar.f36373w = 1;
                                a10 = c0319a.a(eVar);
                                if (a10 == aVar3) {
                                }
                            }
                            u3.g d10 = eVar2.f36374x.f36375a.d();
                            eVar2.f36371u = hVar;
                            eVar2.f36372v = i6;
                            eVar2.f36373w = 2;
                            if (d10.h(aVar2, eVar2) == aVar) {
                                return aVar;
                            }
                        }
                        eVar = eVar2;
                        aVar3 = aVar;
                        c0319a2 = hVar;
                        c0319a = c0319a2;
                        fVar = eVar.f36374x;
                        incrementAndGet = fVar.f36378d.incrementAndGet();
                        u3.b bVar222 = fVar.f36375a;
                        valueOf = Integer.valueOf(bVar222.f33766a.c() / fVar.f36381h.get());
                        if (valueOf.intValue() != 0) {
                        }
                        if (z10) {
                        }
                        if (valueOf != null) {
                        }
                        if (incrementAndGet >= intValue) {
                        }
                        fVar.f36378d.set(0);
                        fVar.f36377c.q("#!upload");
                        eVar.f36371u = c0319a;
                        eVar.f36373w = 1;
                        a10 = c0319a.a(eVar);
                        if (a10 == aVar3) {
                        }
                    } else {
                        return hs.k.f19476a;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                iv.h hVar2 = this.f36371u;
                sp.b.d0(obj);
                hVar = hVar2;
                aVar = aVar3;
                eVar2 = this;
                if (!((Boolean) obj).booleanValue()) {
                }
            }
        } else {
            sp.b.d0(obj);
            iv.a aVar5 = this.f36374x.f36376b;
            aVar5.getClass();
            c0319a = new a.C0319a(aVar5);
            eVar = this;
            eVar.f36371u = c0319a;
            eVar.f36373w = 1;
            a10 = c0319a.a(eVar);
            if (a10 == aVar3) {
            }
        }
    }
}
