package iv;

import com.appsflyer.R;
import hs.g;
import iv.i;
import kotlinx.coroutines.d0;
/* compiled from: Channels.kt */
@ns.e(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", l = {R.styleable.AppCompatTheme_autoCompleteTextViewStyle}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class j extends ns.i implements ss.p<d0, ls.d<? super i<? extends hs.k>>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f20748u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f20749v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ v<Object> f20750w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f20751x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(v<Object> vVar, Object obj, ls.d<? super j> dVar) {
        super(2, dVar);
        this.f20750w = vVar;
        this.f20751x = obj;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        j jVar = new j(this.f20750w, this.f20751x, dVar);
        jVar.f20749v = obj;
        return jVar;
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super i<? extends hs.k>> dVar) {
        return ((j) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        Object j10;
        Object aVar;
        ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f20748u;
        try {
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                d0 d0Var = (d0) this.f20749v;
                v<Object> vVar = this.f20750w;
                Object obj2 = this.f20751x;
                this.f20748u = 1;
                if (vVar.b(obj2, this) == aVar2) {
                    return aVar2;
                }
            }
            j10 = hs.k.f19476a;
        } catch (Throwable th2) {
            j10 = sp.b.j(th2);
        }
        if (!(j10 instanceof g.a)) {
            aVar = hs.k.f19476a;
        } else {
            aVar = new i.a(hs.g.a(j10));
        }
        return new i(aVar);
    }
}
