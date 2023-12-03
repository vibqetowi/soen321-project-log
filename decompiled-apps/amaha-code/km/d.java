package km;

import android.os.Bundle;
import androidx.lifecycle.l0;
import androidx.lifecycle.w;
import com.appsflyer.R;
import com.theinnerhour.b2b.components.inAppFunneling.model.PopupItemModel;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.network.model.ProviderAboutResponseModel;
import com.theinnerhour.b2b.network.model.ProviderDetailHolderModel;
import com.theinnerhour.b2b.network.model.ProviderDetailStripDetails;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.NpsPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import dw.a0;
import hs.i;
import hs.k;
import is.u;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.x;
import kotlinx.coroutines.d0;
import or.m;
import ss.p;
import ta.v;
/* compiled from: InAppPromptsViewModel.kt */
/* loaded from: classes2.dex */
public final class d extends l0 {
    public boolean H;
    public boolean I;
    public final boolean J;

    /* renamed from: x  reason: collision with root package name */
    public final String f23393x = LogHelper.INSTANCE.makeLogTag("InAppPromptsViewModel");

    /* renamed from: y  reason: collision with root package name */
    public final im.c f23394y = new im.c();

    /* renamed from: z  reason: collision with root package name */
    public final w<hs.f<String, ProviderDetailHolderModel>> f23395z = new w<>();
    public final w<ArrayList<String>> A = new w<>();
    public final w<hs.f<String, String>> B = new w<>();
    public final w<hs.f<String, ProviderDetailHolderModel>> C = new w<>();
    public final w<hs.f<String, ProviderDetailHolderModel>> D = new w<>();
    public final i E = sp.b.O(C0357d.f23417u);
    public final w<SingleUseEvent<ArrayList<TherapistPackagesModel>>> F = new w<>();
    public final w<ProviderAboutResponseModel> G = new w<>();

    /* compiled from: InAppPromptsViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.inAppFunneling.viewmodel.InAppPromptsViewModel$getMatchedCompletedTherapistsUsingUUIs$1", f = "InAppPromptsViewModel.kt", l = {360}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements p<d0, ls.d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public w f23396u;

        /* renamed from: v  reason: collision with root package name */
        public int f23397v;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ArrayList<String> f23399x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList<String> arrayList, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f23399x = arrayList;
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f23399x, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            w<SingleUseEvent<ArrayList<TherapistPackagesModel>>> wVar;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f23397v;
            d dVar = d.this;
            try {
                if (i6 != 0) {
                    if (i6 == 1) {
                        wVar = this.f23396u;
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    w<SingleUseEvent<ArrayList<TherapistPackagesModel>>> wVar2 = dVar.F;
                    im.c cVar = dVar.f23394y;
                    ArrayList<String> arrayList = this.f23399x;
                    this.f23396u = wVar2;
                    this.f23397v = 1;
                    Object b10 = cVar.b(arrayList, this);
                    if (b10 == aVar) {
                        return aVar;
                    }
                    wVar = wVar2;
                    obj = b10;
                }
                wVar.i(new SingleUseEvent<>(obj));
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(dVar.f23393x, e10);
            }
            return k.f19476a;
        }
    }

    /* compiled from: InAppPromptsViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.inAppFunneling.viewmodel.InAppPromptsViewModel$getProvidersInfo$1", f = "InAppPromptsViewModel.kt", l = {374}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends ns.i implements p<d0, ls.d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public d f23400u;

        /* renamed from: v  reason: collision with root package name */
        public Iterator f23401v;

        /* renamed from: w  reason: collision with root package name */
        public int f23402w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ArrayList<String> f23403x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ d f23404y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d dVar, ArrayList arrayList, ls.d dVar2) {
            super(2, dVar2);
            this.f23403x = arrayList;
            this.f23404y = dVar;
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            return new b(this.f23404y, this.f23403x, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
            return ((b) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0094  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0082 -> B:15:0x0088). Please submit an issue!!! */
        @Override // ns.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            d dVar;
            Iterator it;
            b bVar;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f23402w;
            if (i6 != 0) {
                if (i6 == 1) {
                    Iterator it2 = this.f23401v;
                    d dVar2 = this.f23400u;
                    sp.b.d0(obj);
                    d dVar3 = dVar2;
                    Iterator it3 = it2;
                    ms.a aVar2 = aVar;
                    b bVar2 = this;
                    dVar3.G.i((ProviderAboutResponseModel) obj);
                    bVar = bVar2;
                    aVar = aVar2;
                    it = it3;
                    dVar = dVar3;
                    if (it.hasNext()) {
                        im.c cVar = dVar.f23394y;
                        bVar.f23400u = dVar;
                        bVar.f23401v = it;
                        bVar.f23402w = 1;
                        cVar.getClass();
                        ls.h hVar = new ls.h(ca.a.G0(bVar));
                        ((m) ((a0) nr.b.f26769c.getValue()).b(m.class)).b("https://api.theinnerhour.com/v1/customers/providers/" + ((String) it.next()) + "/meta_info").I(new im.d(hVar));
                        Object b10 = hVar.b();
                        if (b10 == aVar) {
                            return aVar;
                        }
                        ms.a aVar3 = aVar;
                        bVar2 = bVar;
                        obj = b10;
                        dVar3 = dVar;
                        it3 = it;
                        aVar2 = aVar3;
                        dVar3.G.i((ProviderAboutResponseModel) obj);
                        bVar = bVar2;
                        aVar = aVar2;
                        it = it3;
                        dVar = dVar3;
                        if (it.hasNext()) {
                            return k.f19476a;
                        }
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                Iterator it4 = this.f23403x.iterator();
                dVar = this.f23404y;
                it = it4;
                bVar = this;
                if (it.hasNext()) {
                }
            }
        }
    }

    /* compiled from: InAppPromptsViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.inAppFunneling.viewmodel.InAppPromptsViewModel$processPopups$1", f = "InAppPromptsViewModel.kt", l = {R.styleable.AppCompatTheme_imageButtonStyle}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends ns.i implements p<d0, ls.d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f23405u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f23406v;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f23408x;

        /* compiled from: InAppPromptsViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.inAppFunneling.viewmodel.InAppPromptsViewModel$processPopups$1$1", f = "InAppPromptsViewModel.kt", l = {R.styleable.AppCompatTheme_editTextColor}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends ns.i implements p<d0, ls.d<? super hs.f<? extends PopupItemModel, ? extends ArrayList<hs.f<? extends String, ? extends String>>>>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f23409u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ d f23410v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ boolean f23411w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, boolean z10, ls.d<? super a> dVar2) {
                super(2, dVar2);
                this.f23410v = dVar;
                this.f23411w = z10;
            }

            @Override // ns.a
            public final ls.d<k> create(Object obj, ls.d<?> dVar) {
                return new a(this.f23410v, this.f23411w, dVar);
            }

            @Override // ss.p
            public final Object invoke(d0 d0Var, ls.d<? super hs.f<? extends PopupItemModel, ? extends ArrayList<hs.f<? extends String, ? extends String>>>> dVar) {
                return ((a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f23409u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    this.f23409u = 1;
                    d dVar = this.f23410v;
                    dVar.getClass();
                    ls.h hVar = new ls.h(ca.a.G0(this));
                    v.H(kc.f.H(dVar), null, 0, new f(dVar, hVar, this.f23411w, null), 3);
                    obj = hVar.b();
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* compiled from: InAppPromptsViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.inAppFunneling.viewmodel.InAppPromptsViewModel$processPopups$1$2", f = "InAppPromptsViewModel.kt", l = {R.styleable.AppCompatTheme_editTextStyle}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends ns.i implements p<d0, ls.d<? super PopupItemModel.NpsDayFive>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f23412u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ d f23413v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ boolean f23414w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(d dVar, boolean z10, ls.d<? super b> dVar2) {
                super(2, dVar2);
                this.f23413v = dVar;
                this.f23414w = z10;
            }

            @Override // ns.a
            public final ls.d<k> create(Object obj, ls.d<?> dVar) {
                return new b(this.f23413v, this.f23414w, dVar);
            }

            @Override // ss.p
            public final Object invoke(d0 d0Var, ls.d<? super PopupItemModel.NpsDayFive> dVar) {
                return ((b) create(d0Var, dVar)).invokeSuspend(k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f23412u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    this.f23412u = 1;
                    this.f23413v.getClass();
                    kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(this));
                    kVar.u();
                    if (this.f23414w) {
                        NpsPersistence.INSTANCE.initialise(new km.a(new x(), kVar));
                    } else if (kVar.a()) {
                        kVar.resumeWith(null);
                    }
                    obj = kVar.s();
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* compiled from: InAppPromptsViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.inAppFunneling.viewmodel.InAppPromptsViewModel$processPopups$1$3", f = "InAppPromptsViewModel.kt", l = {R.styleable.AppCompatTheme_homeAsUpIndicator}, m = "invokeSuspend")
        /* renamed from: km.d$c$c  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0355c extends ns.i implements p<d0, ls.d<? super List<? extends PopupItemModel>>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f23415u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ d f23416v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0355c(d dVar, ls.d<? super C0355c> dVar2) {
                super(2, dVar2);
                this.f23416v = dVar;
            }

            @Override // ns.a
            public final ls.d<k> create(Object obj, ls.d<?> dVar) {
                return new C0355c(this.f23416v, dVar);
            }

            @Override // ss.p
            public final Object invoke(d0 d0Var, ls.d<? super List<? extends PopupItemModel>> dVar) {
                return ((C0355c) create(d0Var, dVar)).invokeSuspend(k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f23415u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    this.f23415u = 1;
                    d dVar = this.f23416v;
                    dVar.getClass();
                    ls.h hVar = new ls.h(ca.a.G0(this));
                    v.H(kc.f.H(dVar), null, 0, new e(hVar, dVar, null), 3);
                    obj = hVar.b();
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* compiled from: Comparisons.kt */
        /* renamed from: km.d$c$d  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0356d<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t3, T t10) {
                return sp.b.g(Integer.valueOf(((PopupItemModel) t3).getRank()), Integer.valueOf(((PopupItemModel) t10).getRank()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z10, ls.d<? super c> dVar) {
            super(2, dVar);
            this.f23408x = z10;
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            c cVar = new c(this.f23408x, dVar);
            cVar.f23406v = obj;
            return cVar;
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
            return ((c) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            hs.f fVar;
            Object obj2;
            ArrayList arrayList;
            Object obj3;
            PopupItemModel popupItemModel;
            PopupItemModel popupItemModel2;
            List list;
            PopupItemModel popupItemModel3;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f23405u;
            d dVar = d.this;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                d0 d0Var = (d0) this.f23406v;
                boolean z10 = this.f23408x;
                List P0 = ca.a.P0(v.g(d0Var, null, new a(dVar, z10, null), 3), v.g(d0Var, null, new b(dVar, z10, null), 3), v.g(d0Var, null, new C0355c(dVar, null), 3));
                this.f23405u = 1;
                obj = ca.a.n(P0, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            List list2 = (List) obj;
            Object obj4 = list2.get(0);
            if (obj4 instanceof hs.f) {
                fVar = (hs.f) obj4;
            } else {
                fVar = null;
            }
            if (fVar != null) {
                obj2 = fVar.f19465v;
            } else {
                obj2 = null;
            }
            if (obj2 instanceof ArrayList) {
                arrayList = (ArrayList) obj2;
            } else {
                arrayList = null;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            ArrayList arrayList2 = new ArrayList();
            if (fVar != null) {
                obj3 = fVar.f19464u;
            } else {
                obj3 = null;
            }
            if (obj3 instanceof PopupItemModel) {
                popupItemModel = (PopupItemModel) obj3;
            } else {
                popupItemModel = null;
            }
            if (popupItemModel != null) {
                arrayList2.add(popupItemModel);
            }
            Object obj5 = list2.get(1);
            if (obj5 instanceof PopupItemModel) {
                popupItemModel2 = (PopupItemModel) obj5;
            } else {
                popupItemModel2 = null;
            }
            if (popupItemModel2 != null) {
                arrayList2.add(popupItemModel2);
            }
            Object obj6 = list2.get(2);
            if (obj6 instanceof List) {
                list = (List) obj6;
            } else {
                list = null;
            }
            if (list != null) {
                for (Object obj7 : list) {
                    if (obj7 instanceof PopupItemModel) {
                        popupItemModel3 = (PopupItemModel) obj7;
                    } else {
                        popupItemModel3 = null;
                    }
                    if (popupItemModel3 != null) {
                        arrayList2.add(popupItemModel3);
                    }
                }
            }
            if (arrayList2.size() > 1) {
                is.p.P1(arrayList2, new C0356d());
            }
            dVar.getClass();
            v.H(kc.f.H(dVar), null, 0, new g((PopupItemModel) u.i2(arrayList2), dVar, arrayList, null), 3);
            dVar.I = true;
            return k.f19476a;
        }
    }

    /* compiled from: InAppPromptsViewModel.kt */
    /* renamed from: km.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0357d extends kotlin.jvm.internal.k implements ss.a<w<SingleUseEvent<? extends String>>> {

        /* renamed from: u  reason: collision with root package name */
        public static final C0357d f23417u = new C0357d();

        public C0357d() {
            super(0);
        }

        @Override // ss.a
        public final w<SingleUseEvent<? extends String>> invoke() {
            return new w<>();
        }
    }

    public d() {
        boolean z10;
        HashMap<String, Object> appConfig;
        User user = FirebasePersistence.getInstance().getUser();
        if (user != null && (appConfig = user.getAppConfig()) != null && appConfig.containsKey(Constants.APP_PROMPTS_EXPERIMENT) && !kotlin.jvm.internal.i.b(appConfig.get(Constants.APP_PROMPTS_EXPERIMENT), "default")) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.J = z10;
        k(true);
    }

    public final hs.f<String, String> e(String dateTimeString) {
        kotlin.jvm.internal.i.g(dateTimeString, "dateTimeString");
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        Locale locale = Locale.ENGLISH;
        DateTimeFormatter withLocale = ofPattern.withLocale(locale);
        DateTimeFormatter withLocale2 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS+05:30").withLocale(locale);
        LocalDateTime parse = LocalDateTime.parse(dateTimeString, withLocale);
        kotlin.jvm.internal.i.f(parse, "parse(dateTimeString, dateFormat)");
        String format = parse.format(withLocale2);
        kotlin.jvm.internal.i.f(format, "bookingDate.format(requiredFormat)");
        String format2 = parse.D(ZoneId.systemDefault()).v(ZoneOffset.UTC).s().format(withLocale2);
        kotlin.jvm.internal.i.f(format2, "bookingDate.atZone(ZoneI…().format(requiredFormat)");
        return new hs.f<>(format2, format);
    }

    public final w<SingleUseEvent<ArrayList<TherapistPackagesModel>>> f() {
        return this.F;
    }

    public final void g(ArrayList<String> arrayList) {
        v.H(kc.f.H(this), null, 0, new a(arrayList, null), 3);
    }

    public final w<ProviderAboutResponseModel> h() {
        return this.G;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:
        if ((!gv.n.B0(r6)) == true) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle i(ProviderDetailHolderModel providerDetailHolderModel) {
        String providerType;
        String str;
        boolean z10;
        if (providerDetailHolderModel == null) {
            return new Bundle();
        }
        hs.f<String, String> e10 = e(providerDetailHolderModel.getEarliestAvailableDateTime());
        Bundle bundle = new Bundle();
        if (kotlin.jvm.internal.i.b(providerDetailHolderModel.getProviderType(), "couplestherapist")) {
            providerType = "couples_therapist";
        } else {
            providerType = providerDetailHolderModel.getProviderType();
        }
        bundle.putString("session_type", providerType);
        String providerType2 = providerDetailHolderModel.getProviderType();
        if (kotlin.jvm.internal.i.b(providerType2, "couplestherapist")) {
            str = "couples";
        } else if (kotlin.jvm.internal.i.b(providerType2, "therapist")) {
            str = "therapy";
        } else {
            str = "psychiatry";
        }
        bundle.putString("flow", str);
        if (kotlin.jvm.internal.i.b(providerDetailHolderModel.getProviderType(), "psychiatrist")) {
            bundle.putString("psychiatrist_name", providerDetailHolderModel.getName());
            bundle.putString("psychiatrist_uuid", providerDetailHolderModel.getUuid());
        } else {
            bundle.putString("therapist_name", providerDetailHolderModel.getName());
            bundle.putString("therapist_uuid", providerDetailHolderModel.getUuid());
        }
        bundle.putBoolean("provider_inhouse", providerDetailHolderModel.isInHouse());
        ProviderDetailStripDetails stripDetails = providerDetailHolderModel.getStripDetails();
        if (stripDetails != null && (r6 = stripDetails.getDiscountStrip()) != null) {
            z10 = true;
        }
        z10 = false;
        if (z10) {
            bundle.putInt("discount_percentage", 50);
        }
        defpackage.d.m(bundle, "domain");
        bundle.putString("next_available_slot_shown", e10.f19464u);
        bundle.putString("next_available_slot_shown_local", e10.f19465v);
        bundle.putString("source", "in_app_resume_booking");
        return bundle;
    }

    public final void j(ArrayList<String> arrayList) {
        v.H(kc.f.H(this), null, 0, new b(this, arrayList, null), 3);
    }

    public final void k(boolean z10) {
        if (!z10 && !this.I) {
            return;
        }
        v.H(kc.f.H(this), null, 0, new c(z10, null), 3);
    }
}
