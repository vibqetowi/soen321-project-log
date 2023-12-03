package kotlinx.coroutines.flow;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlinx.coroutines.flow.internal.AbortFlowException;
/* compiled from: Limit.kt */
/* loaded from: classes2.dex */
public final class j implements e<Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ss.p f23525u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f23526v;

    /* compiled from: Limit.kt */
    @ns.e(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", l = {142}, m = "emit")
    /* loaded from: classes2.dex */
    public static final class a extends ns.c {

        /* renamed from: u  reason: collision with root package name */
        public j f23527u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f23528v;

        /* renamed from: w  reason: collision with root package name */
        public int f23529w;

        /* renamed from: y  reason: collision with root package name */
        public Object f23531y;

        public a(ls.d dVar) {
            super(dVar);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            this.f23528v = obj;
            this.f23529w |= LinearLayoutManager.INVALID_OFFSET;
            return j.this.b(null, this);
        }
    }

    public j(ss.p pVar, kotlin.jvm.internal.x xVar) {
        this.f23525u = pVar;
        this.f23526v = xVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    @Override // kotlinx.coroutines.flow.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, ls.d<? super hs.k> dVar) {
        a aVar;
        Object obj2;
        int i6;
        boolean z10;
        j jVar;
        T t3;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f23529w;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f23529w = i10 - LinearLayoutManager.INVALID_OFFSET;
                obj2 = aVar.f23528v;
                ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
                i6 = aVar.f23529w;
                z10 = true;
                if (i6 == 0) {
                    if (i6 == 1) {
                        Object obj3 = aVar.f23531y;
                        jVar = aVar.f23527u;
                        sp.b.d0(obj2);
                        t3 = obj3;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj2);
                    aVar.f23527u = this;
                    aVar.f23531y = obj;
                    aVar.f23529w = 1;
                    obj2 = this.f23525u.invoke(obj, aVar);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                    jVar = this;
                    t3 = obj;
                }
                if (((Boolean) obj2).booleanValue()) {
                    jVar.f23526v.f23469u = t3;
                    z10 = false;
                }
                if (!z10) {
                    return hs.k.f19476a;
                }
                throw new AbortFlowException(jVar);
            }
        }
        aVar = new a(dVar);
        obj2 = aVar.f23528v;
        ms.a aVar22 = ms.a.COROUTINE_SUSPENDED;
        i6 = aVar.f23529w;
        z10 = true;
        if (i6 == 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
        if (!z10) {
        }
    }
}
