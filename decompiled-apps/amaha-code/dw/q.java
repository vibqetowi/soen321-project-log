package dw;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.appsflyer.R;
import kotlinx.coroutines.o0;
/* compiled from: KotlinExtensions.kt */
/* loaded from: classes2.dex */
public final class q {

    /* compiled from: KotlinExtensions.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ls.d f13583u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ Exception f13584v;

        public a(Exception exc, b bVar) {
            this.f13583u = bVar;
            this.f13584v = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ca.a.G0(this.f13583u).resumeWith(sp.b.j(this.f13584v));
        }
    }

    /* compiled from: KotlinExtensions.kt */
    @ns.e(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {R.styleable.AppCompatTheme_toolbarStyle}, m = "suspendAndThrow")
    /* loaded from: classes2.dex */
    public static final class b extends ns.c {

        /* renamed from: u  reason: collision with root package name */
        public /* synthetic */ Object f13585u;

        /* renamed from: v  reason: collision with root package name */
        public int f13586v;

        public b(ls.d dVar) {
            super(dVar);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            this.f13585u = obj;
            this.f13586v |= LinearLayoutManager.INVALID_OFFSET;
            return q.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Exception exc, ls.d<?> dVar) {
        b bVar;
        int i6;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f13586v;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                bVar.f13586v = i10 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = bVar.f13585u;
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                i6 = bVar.f13586v;
                if (i6 == 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                        return hs.k.f19476a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sp.b.d0(obj);
                bVar.getClass();
                bVar.f13586v = 1;
                o0.f23640a.f0(bVar.getContext(), new a(exc, bVar));
                return aVar;
            }
        }
        bVar = new b(dVar);
        Object obj2 = bVar.f13585u;
        ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
        i6 = bVar.f13586v;
        if (i6 == 0) {
        }
    }
}
