package w3;

import com.appsflyer.R;
import iv.a;
import iv.s;
import java.io.FileNotFoundException;
import java.util.Iterator;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.d0;
import ss.p;
import ta.v;
import y3.l;
/* compiled from: EventPipeline.kt */
@ns.e(c = "com.amplitude.core.platform.EventPipeline$upload$1", f = "EventPipeline.kt", l = {182, R.styleable.AppCompatTheme_switchStyle, R.styleable.AppCompatTheme_textAppearanceSearchResultTitle}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class d extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {
    public final /* synthetic */ f A;

    /* renamed from: u  reason: collision with root package name */
    public f f36363u;

    /* renamed from: v  reason: collision with root package name */
    public s f36364v;

    /* renamed from: w  reason: collision with root package name */
    public iv.h f36365w;

    /* renamed from: x  reason: collision with root package name */
    public Iterator f36366x;

    /* renamed from: y  reason: collision with root package name */
    public Object f36367y;

    /* renamed from: z  reason: collision with root package name */
    public int f36368z;

    /* compiled from: EventPipeline.kt */
    @ns.e(c = "com.amplitude.core.platform.EventPipeline$upload$1$1$1", f = "EventPipeline.kt", l = {R.styleable.AppCompatTheme_textAppearanceLargePopupMenu}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f36369u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ f f36370v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f36370v = fVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f36370v, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f36369u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                u3.g d10 = this.f36370v.f36375a.d();
                this.f36369u = 1;
                if (d10.f(this) == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, ls.d<? super d> dVar) {
        super(2, dVar);
        this.A = fVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new d(this.A, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((d) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:7|(3:8|9|10)|11|12|(1:14)(1:68)|(1:16)(6:56|57|58|(1:60)(1:67)|61|(1:63)(2:64|65))|17|18|(4:20|21|22|(1:24)(8:26|11|12|(0)(0)|(0)(0)|17|18|(3:40|41|(1:43)(3:44|45|(6:47|(1:49)|50|51|18|(0)(0))(3:52|53|54)))(0)))(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0123, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0125, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0138, code lost:
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0139, code lost:
        r10.f36375a.f33774j.c(kotlin.jvm.internal.i.n(r0, "Error when upload event: "));
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0152, code lost:
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0153, code lost:
        r10.f36375a.f33774j.f(kotlin.jvm.internal.i.n(r0, "Event storage file not found: "));
        r8 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:8:0x001c, B:26:0x0064, B:30:0x007c, B:32:0x0084, B:35:0x00a2, B:84:0x0170, B:17:0x003f, B:20:0x004a, B:25:0x005b), top: B:92:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9 A[Catch: all -> 0x0127, TRY_LEAVE, TryCatch #3 {all -> 0x0127, blocks: (B:44:0x00dd, B:37:0x00b3, B:39:0x00b9, B:40:0x00bd, B:72:0x0132, B:75:0x0139, B:77:0x014c, B:80:0x0153, B:50:0x00ed, B:52:0x00f1, B:56:0x00ff, B:58:0x0119, B:59:0x011d, B:60:0x0122, B:55:0x00fa), top: B:92:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ed A[Catch: Exception -> 0x0123, FileNotFoundException -> 0x0125, all -> 0x0127, TRY_LEAVE, TryCatch #3 {all -> 0x0127, blocks: (B:44:0x00dd, B:37:0x00b3, B:39:0x00b9, B:40:0x00bd, B:72:0x0132, B:75:0x0139, B:77:0x014c, B:80:0x0153, B:50:0x00ed, B:52:0x00f1, B:56:0x00ff, B:58:0x0119, B:59:0x011d, B:60:0x0122, B:55:0x00fa), top: B:92:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0139 A[Catch: all -> 0x0127, TryCatch #3 {all -> 0x0127, blocks: (B:44:0x00dd, B:37:0x00b3, B:39:0x00b9, B:40:0x00bd, B:72:0x0132, B:75:0x0139, B:77:0x014c, B:80:0x0153, B:50:0x00ed, B:52:0x00f1, B:56:0x00ff, B:58:0x0119, B:59:0x011d, B:60:0x0122, B:55:0x00fa), top: B:92:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0153 A[Catch: all -> 0x0127, TRY_LEAVE, TryCatch #3 {all -> 0x0127, blocks: (B:44:0x00dd, B:37:0x00b3, B:39:0x00b9, B:40:0x00bd, B:72:0x0132, B:75:0x0139, B:77:0x014c, B:80:0x0153, B:50:0x00ed, B:52:0x00f1, B:56:0x00ff, B:58:0x0119, B:59:0x011d, B:60:0x0122, B:55:0x00fa), top: B:92:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0170 A[Catch: all -> 0x0051, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:8:0x001c, B:26:0x0064, B:30:0x007c, B:32:0x0084, B:35:0x00a2, B:84:0x0170, B:17:0x003f, B:20:0x004a, B:25:0x005b), top: B:92:0x000a }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00b0 -> B:37:0x00b3). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00d6 -> B:97:0x00dd). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0138 -> B:81:0x0160). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0139 -> B:81:0x0160). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0152 -> B:81:0x0160). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0153 -> B:81:0x0160). Please submit an issue!!! */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        iv.a aVar;
        f fVar;
        iv.h c0319a;
        d dVar;
        iv.a aVar2;
        f fVar2;
        iv.h hVar;
        Iterator it;
        d dVar2;
        iv.h hVar2;
        Object obj2;
        iv.a aVar3;
        iv.a aVar4;
        Exception e10;
        String message;
        FileNotFoundException e11;
        String message2;
        Object g5;
        Object obj3;
        iv.h hVar3;
        boolean z10;
        Object obj4 = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f36368z;
        int i10 = 3;
        try {
            try {
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 == 3) {
                                Object obj5 = this.f36367y;
                                Iterator it2 = this.f36366x;
                                hVar2 = this.f36365w;
                                s sVar = this.f36364v;
                                f fVar3 = this.f36363u;
                                try {
                                    sp.b.d0(obj);
                                    g5 = obj;
                                    obj3 = obj5;
                                    aVar = sVar;
                                    dVar2 = this;
                                    hVar2 = hVar2;
                                } catch (FileNotFoundException e12) {
                                    e11 = e12;
                                    aVar = sVar;
                                    dVar2 = this;
                                    message2 = e11.getMessage();
                                    if (message2 == null) {
                                    }
                                    f fVar4 = fVar3;
                                    it = it2;
                                    fVar2 = fVar4;
                                    i10 = 3;
                                    hVar2 = hVar3;
                                    if (!it.hasNext()) {
                                    }
                                } catch (Exception e13) {
                                    e10 = e13;
                                    aVar = sVar;
                                    dVar2 = this;
                                    message = e10.getMessage();
                                    if (message == null) {
                                    }
                                    f fVar42 = fVar3;
                                    it = it2;
                                    fVar2 = fVar42;
                                    i10 = 3;
                                    hVar2 = hVar3;
                                    if (!it.hasNext()) {
                                    }
                                }
                                String str = (String) g5;
                                if (str.length() != 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    y3.j jVar = fVar3.f36379e;
                                    u3.b bVar = fVar3.f36375a;
                                    y3.i b10 = jVar.b();
                                    if (b10.f38199v != null) {
                                        b10.f38201x = str;
                                        b10.close();
                                    }
                                    y3.h c10 = bVar.d().c(fVar3, bVar.f33766a, bVar.f33768c, bVar.f33771g, obj3, str);
                                    l lVar = b10.f38203z;
                                    if (lVar != null) {
                                        c10.a(lVar);
                                        hVar3 = hVar2;
                                    } else {
                                        kotlin.jvm.internal.i.q("response");
                                        throw null;
                                    }
                                } else {
                                    hVar3 = hVar2;
                                }
                                f fVar422 = fVar3;
                                it = it2;
                                fVar2 = fVar422;
                                i10 = 3;
                                hVar2 = hVar3;
                                if (!it.hasNext()) {
                                    Object next = it.next();
                                    try {
                                    } catch (FileNotFoundException e14) {
                                        e11 = e14;
                                        Iterator it3 = it;
                                        fVar3 = fVar2;
                                        it2 = it3;
                                        message2 = e11.getMessage();
                                        if (message2 == null) {
                                        }
                                        f fVar4222 = fVar3;
                                        it = it2;
                                        fVar2 = fVar4222;
                                        i10 = 3;
                                        hVar2 = hVar3;
                                        if (!it.hasNext()) {
                                        }
                                    } catch (Exception e15) {
                                        e10 = e15;
                                        Iterator it4 = it;
                                        fVar3 = fVar2;
                                        it2 = it4;
                                        message = e10.getMessage();
                                        if (message == null) {
                                        }
                                        f fVar42222 = fVar3;
                                        it = it2;
                                        fVar2 = fVar42222;
                                        i10 = 3;
                                        hVar2 = hVar3;
                                        if (!it.hasNext()) {
                                        }
                                    }
                                    u3.g d10 = fVar2.f36375a.d();
                                    dVar2.f36363u = fVar2;
                                    dVar2.f36364v = aVar;
                                    dVar2.f36365w = hVar2;
                                    dVar2.f36366x = it;
                                    dVar2.f36367y = next;
                                    dVar2.f36368z = i10;
                                    g5 = d10.g(next, dVar2);
                                    if (g5 == obj4) {
                                        return obj4;
                                    }
                                    obj3 = next;
                                    Iterator it5 = it;
                                    fVar3 = fVar2;
                                    it2 = it5;
                                    hVar2 = hVar2;
                                    String str2 = (String) g5;
                                    if (str2.length() != 0) {
                                    }
                                    if (z10) {
                                    }
                                    f fVar422222 = fVar3;
                                    it = it2;
                                    fVar2 = fVar422222;
                                    i10 = 3;
                                    hVar2 = hVar3;
                                    if (!it.hasNext()) {
                                        fVar = fVar2;
                                        c0319a = hVar2;
                                        dVar = dVar2;
                                        aVar4 = aVar;
                                        dVar.f36363u = fVar;
                                        dVar.f36364v = aVar4;
                                        dVar.f36365w = c0319a;
                                        dVar.f36366x = null;
                                        dVar.f36367y = null;
                                        dVar.f36368z = 1;
                                        obj2 = c0319a.a(dVar);
                                        if (obj2 != obj4) {
                                            return obj4;
                                        }
                                        iv.h hVar4 = c0319a;
                                        fVar2 = fVar;
                                        hVar = hVar4;
                                        aVar3 = aVar4;
                                        if (!((Boolean) obj2).booleanValue()) {
                                            String str3 = (String) hVar.next();
                                            a0 a0Var = fVar2.f36375a.f;
                                            a aVar5 = new a(fVar2, null);
                                            dVar.f36363u = fVar2;
                                            dVar.f36364v = aVar3;
                                            dVar.f36365w = hVar;
                                            dVar.f36368z = 2;
                                            aVar2 = aVar3;
                                            if (v.S(a0Var, aVar5, dVar) == obj4) {
                                                return obj4;
                                            }
                                            it = fVar2.f36375a.d().a().iterator();
                                            aVar = aVar2;
                                            dVar2 = dVar;
                                            hVar2 = hVar;
                                            if (!it.hasNext()) {
                                            }
                                        } else {
                                            hs.k kVar = hs.k.f19476a;
                                            sp.b.e(aVar3, null);
                                            return hs.k.f19476a;
                                        }
                                    }
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            hVar = this.f36365w;
                            s sVar2 = this.f36364v;
                            fVar2 = this.f36363u;
                            sp.b.d0(obj);
                            dVar = this;
                            aVar2 = sVar2;
                            it = fVar2.f36375a.d().a().iterator();
                            aVar = aVar2;
                            dVar2 = dVar;
                            hVar2 = hVar;
                            if (!it.hasNext()) {
                            }
                        }
                    } else {
                        hVar = this.f36365w;
                        s sVar3 = this.f36364v;
                        fVar2 = this.f36363u;
                        sp.b.d0(obj);
                        obj2 = obj;
                        dVar = this;
                        aVar3 = sVar3;
                        if (!((Boolean) obj2).booleanValue()) {
                        }
                    }
                } else {
                    sp.b.d0(obj);
                    fVar = this.A;
                    iv.a aVar6 = fVar.f36377c;
                    aVar6.getClass();
                    c0319a = new a.C0319a(aVar6);
                    dVar = this;
                    aVar4 = aVar6;
                    dVar.f36363u = fVar;
                    dVar.f36364v = aVar4;
                    dVar.f36365w = c0319a;
                    dVar.f36366x = null;
                    dVar.f36367y = null;
                    dVar.f36368z = 1;
                    obj2 = c0319a.a(dVar);
                    if (obj2 != obj4) {
                    }
                }
            } catch (Throwable th3) {
                th2 = th3;
                aVar = aVar3;
                try {
                    throw th2;
                } catch (Throwable th4) {
                    sp.b.e(aVar, th2);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            th2 = th5;
            throw th2;
        }
    }
}
