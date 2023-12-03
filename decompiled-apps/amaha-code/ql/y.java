package ql;

import android.graphics.Bitmap;
import com.theinnerhour.b2b.components.dynamicActivities.data.NewDynamicActivityUploadModel;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.o0;
/* compiled from: NewDynamicActivityViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dynamicActivities.utils.NewDynamicActivityViewModel$saveFilesForN12C$1", f = "NewDynamicActivityViewModel.kt", l = {754}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class y extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f29845u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ NewDynamicActivityUploadModel f29846v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ t f29847w;

    /* compiled from: NewDynamicActivityViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dynamicActivities.utils.NewDynamicActivityViewModel$saveFilesForN12C$1$1", f = "NewDynamicActivityViewModel.kt", l = {762}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f29848u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f29849v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ NewDynamicActivityUploadModel f29850w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ t f29851x;

        /* compiled from: NewDynamicActivityViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.dynamicActivities.utils.NewDynamicActivityViewModel$saveFilesForN12C$1$1$1$1", f = "NewDynamicActivityViewModel.kt", l = {757}, m = "invokeSuspend")
        /* renamed from: ql.y$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0505a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.f<? extends String, ? extends String>>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f29852u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ t f29853v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ hs.f<String, Bitmap> f29854w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ int f29855x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0505a(t tVar, hs.f<String, Bitmap> fVar, int i6, ls.d<? super C0505a> dVar) {
                super(2, dVar);
                this.f29853v = tVar;
                this.f29854w = fVar;
                this.f29855x = i6;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new C0505a(this.f29853v, this.f29854w, this.f29855x, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.f<? extends String, ? extends String>> dVar) {
                return ((C0505a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f29852u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    hs.f<String, Bitmap> fVar = this.f29854w;
                    int i10 = this.f29855x;
                    this.f29852u = 1;
                    t tVar = this.f29853v;
                    tVar.getClass();
                    ls.h hVar = new ls.h(ca.a.G0(this));
                    try {
                        ta.v.H(kc.f.H(tVar), null, 0, new a0(tVar, fVar, i10, hVar, null), 3);
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(tVar.f29789y, e10);
                        hVar.resumeWith(null);
                    }
                    obj = hVar.b();
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(NewDynamicActivityUploadModel newDynamicActivityUploadModel, t tVar, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f29850w = newDynamicActivityUploadModel;
            this.f29851x = tVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f29850w, this.f29851x, dVar);
            aVar.f29849v = obj;
            return aVar;
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            HashMap<String, Object> hashMap;
            Object obj2;
            List list;
            ArrayList arrayList;
            boolean z11;
            Object obj3;
            String str;
            pl.f fVar;
            boolean z12;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f29848u;
            t tVar = this.f29851x;
            NewDynamicActivityUploadModel newDynamicActivityUploadModel = this.f29850w;
            boolean z13 = false;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f29849v;
                List<hs.f<String, Bitmap>> bitmapList = newDynamicActivityUploadModel.getBitmapList();
                ArrayList arrayList2 = new ArrayList(is.i.H1(bitmapList, 10));
                int i10 = 0;
                for (Object obj4 : bitmapList) {
                    int i11 = i10 + 1;
                    if (i10 >= 0) {
                        arrayList2.add(ta.v.g(d0Var, null, new C0505a(tVar, (hs.f) obj4, i10, null), 3));
                        i10 = i11;
                    } else {
                        ca.a.t1();
                        throw null;
                    }
                }
                this.f29848u = 1;
                obj = ca.a.n(arrayList2, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            List<hs.f> list2 = (List) obj;
            boolean isEmpty = list2.isEmpty();
            h0 h0Var = h0.FAILURE;
            if (!isEmpty) {
                if (!list2.isEmpty()) {
                    for (hs.f fVar2 : list2) {
                        if (fVar2 != null && !gv.n.B0((CharSequence) fVar2.f19465v)) {
                            z12 = false;
                            continue;
                        } else {
                            z12 = true;
                            continue;
                        }
                        if (z12) {
                            z10 = true;
                            break;
                        }
                    }
                }
                z10 = false;
                if (!z10) {
                    HashMap<String, Object> hashMap2 = tVar.V.get(new hs.f(newDynamicActivityUploadModel.getScreenSlug(), newDynamicActivityUploadModel.getScreenId()));
                    if (hashMap2 instanceof HashMap) {
                        hashMap = hashMap2;
                    } else {
                        hashMap = null;
                    }
                    if (hashMap != null) {
                        obj2 = hashMap.get(newDynamicActivityUploadModel.getScreenDataKey());
                    } else {
                        obj2 = null;
                    }
                    if (obj2 instanceof List) {
                        list = (List) obj2;
                    } else {
                        list = null;
                    }
                    if (list != null) {
                        arrayList = new ArrayList();
                        for (Object obj5 : list) {
                            if (obj5 instanceof pl.f) {
                                fVar = (pl.f) obj5;
                            } else {
                                fVar = null;
                            }
                            if (fVar != null) {
                                arrayList.add(fVar);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    androidx.lifecycle.w<h0> wVar = tVar.f29779a0;
                    if (arrayList == null) {
                        wVar.i(h0Var);
                    } else {
                        for (hs.f fVar3 : list2) {
                            if (fVar3 != null) {
                                Iterator it = arrayList.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj3 = it.next();
                                        String str2 = ((pl.f) obj3).f28590c;
                                        if (str2 != null) {
                                            Locale locale = Locale.ENGLISH;
                                            str = ri.e.e(locale, "ENGLISH", str2, locale, "this as java.lang.String).toLowerCase(locale)");
                                        } else {
                                            str = null;
                                        }
                                        if (kotlin.jvm.internal.i.b(str, fVar3.f19464u)) {
                                            break;
                                        }
                                    } else {
                                        obj3 = null;
                                        break;
                                    }
                                }
                                pl.f fVar4 = (pl.f) obj3;
                                if (fVar4 != null) {
                                    fVar4.f28589b = (String) fVar3.f19465v;
                                }
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it2 = arrayList.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                String str3 = ((pl.f) it2.next()).f28589b;
                                if (str3 != null && !gv.n.B0(str3)) {
                                    z11 = false;
                                    continue;
                                } else {
                                    z11 = true;
                                    continue;
                                }
                                if (z11) {
                                    z13 = true;
                                    break;
                                }
                            }
                        }
                        if (z13) {
                            wVar.i(h0Var);
                        } else {
                            HashMap<String, Object> hashMap3 = tVar.V.get(new hs.f(newDynamicActivityUploadModel.getScreenSlug(), newDynamicActivityUploadModel.getScreenId()));
                            if (hashMap3 != null) {
                                hashMap3.put(newDynamicActivityUploadModel.getScreenDataKey(), arrayList);
                            }
                            wVar.i(h0.SUCCESS);
                        }
                    }
                    return hs.k.f19476a;
                }
            }
            tVar.f29779a0.i(h0Var);
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(NewDynamicActivityUploadModel newDynamicActivityUploadModel, t tVar, ls.d<? super y> dVar) {
        super(2, dVar);
        this.f29846v = newDynamicActivityUploadModel;
        this.f29847w = tVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new y(this.f29846v, this.f29847w, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((y) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f29845u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = o0.f23642c;
            a aVar2 = new a(this.f29846v, this.f29847w, null);
            this.f29845u = 1;
            if (ta.v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
