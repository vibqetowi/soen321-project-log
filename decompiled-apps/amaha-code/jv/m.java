package jv;

import kotlin.jvm.internal.c0;
/* compiled from: SafeCollector.kt */
/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final ss.q<kotlinx.coroutines.flow.e<Object>, Object, ls.d<? super hs.k>, Object> f22682a;

    /* compiled from: SafeCollector.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends kotlin.jvm.internal.g implements ss.q<kotlinx.coroutines.flow.e<? super Object>, Object, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f22683u = new a();

        public a() {
            super(3, kotlinx.coroutines.flow.e.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // ss.q
        public final Object invoke(kotlinx.coroutines.flow.e<? super Object> eVar, Object obj, ls.d<? super hs.k> dVar) {
            return eVar.b(obj, dVar);
        }
    }

    static {
        a aVar = a.f22683u;
        c0.e(3, aVar);
        f22682a = aVar;
    }
}
