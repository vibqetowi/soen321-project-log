package ml;

import android.app.Application;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.appsflyer.R;
import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.model.UpcomingSessionModel;
import com.theinnerhour.b2b.network.model.CrossProviderRecommendationNotificationModel;
import com.theinnerhour.b2b.network.model.SuggestedBooking;
import com.theinnerhour.b2b.network.model.TelecommunicationHomeworkNotification;
import com.theinnerhour.b2b.network.model.TelecommunicationsHomeworkResponseModel;
import com.theinnerhour.b2b.network.model.UpcomingBooking;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;
/* compiled from: DashboardTelecommunicationsViewModel.kt */
/* loaded from: classes2.dex */
public final class p extends androidx.lifecycle.b {
    public final androidx.lifecycle.w<hs.f<TherapistPackagesModel, TherapistPackagesModel>> A;
    public final androidx.lifecycle.w<TherapistPackagesModel> B;
    public final androidx.lifecycle.w<ArrayList<UpcomingSessionModel>> C;
    public ArrayList<TelecommunicationHomeworkNotification> D;
    public ArrayList<TelecommunicationHomeworkNotification> E;
    public CrossProviderRecommendationNotificationModel F;
    public CrossProviderRecommendationNotificationModel G;
    public ArrayList<SuggestedBooking> H;
    public List<UpcomingBooking> I;
    public List<UpcomingBooking> J;
    public UpcomingBooking K;
    public UpcomingBooking L;
    public TelecommunicationsHomeworkResponseModel.HomeworkModel M;
    public TelecommunicationsHomeworkResponseModel.HomeworkModel N;
    public String O;
    public String P;
    public hs.f<Boolean, Boolean> Q;
    public hs.f<Boolean, Boolean> R;
    public final androidx.lifecycle.w<Boolean> S;
    public boolean T;
    public boolean U;
    public boolean V;
    public String W;

    /* renamed from: y  reason: collision with root package name */
    public final rp.a f25558y;

    /* renamed from: z  reason: collision with root package name */
    public final String f25559z;

    /* compiled from: DashboardTelecommunicationsViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.DashboardTelecommunicationsViewModel$setUnreadMessagesListener$1$1", f = "DashboardTelecommunicationsViewModel.kt", l = {626}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f25560u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f25562w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ fd.f f25563x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f25564y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f25565z;

        /* compiled from: DashboardTelecommunicationsViewModel.kt */
        /* renamed from: ml.p$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0416a<T> implements kotlinx.coroutines.flow.e {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ boolean f25566u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ p f25567v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ boolean f25568w;

            public C0416a(boolean z10, p pVar, boolean z11) {
                this.f25566u = z10;
                this.f25567v = pVar;
                this.f25568w = z11;
            }

            @Override // kotlinx.coroutines.flow.e
            public final Object b(Object obj, ls.d dVar) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean z10 = false;
                boolean z11 = this.f25566u;
                p pVar = this.f25567v;
                if (z11) {
                    pVar.V = (pVar.V || booleanValue) ? true : true;
                } else if (this.f25568w) {
                    pVar.T = (pVar.T || booleanValue) ? true : true;
                } else {
                    pVar.U = (pVar.U || booleanValue) ? true : true;
                }
                return hs.k.f19476a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, fd.f fVar, boolean z10, boolean z11, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f25562w = str;
            this.f25563x = fVar;
            this.f25564y = z10;
            this.f25565z = z11;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f25562w, this.f25563x, this.f25564y, this.f25565z, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f25560u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                p pVar = p.this;
                rp.a aVar2 = pVar.f25558y;
                String j02 = this.f25563x.j0();
                kotlin.jvm.internal.i.f(j02, "it.uid");
                aVar2.getClass();
                String friendKey = this.f25562w;
                kotlin.jvm.internal.i.g(friendKey, "friendKey");
                kotlinx.coroutines.flow.b k10 = ta.v.k(new rp.p(j02, friendKey, null));
                C0416a c0416a = new C0416a(this.f25564y, pVar, this.f25565z);
                this.f25560u = 1;
                if (k10.a(c0416a, this) == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(rp.a providerAssignedRepository, Application application) {
        super(application);
        kotlin.jvm.internal.i.g(providerAssignedRepository, "providerAssignedRepository");
        kotlin.jvm.internal.i.g(application, "application");
        this.f25558y = providerAssignedRepository;
        this.f25559z = LogHelper.INSTANCE.makeLogTag("TelecommunicationsOptionsViewModel");
        this.A = new androidx.lifecycle.w<>();
        this.B = new androidx.lifecycle.w<>();
        this.C = new androidx.lifecycle.w<>();
        this.H = new ArrayList<>();
        this.S = new androidx.lifecycle.w<>();
        new sf.i();
    }

    public static final void e(p pVar) {
        String firebaseid;
        TherapistPackagesModel therapistPackagesModel;
        String firebaseid2;
        TherapistPackagesModel therapistPackagesModel2;
        String firebaseid3;
        androidx.lifecycle.w<hs.f<TherapistPackagesModel, TherapistPackagesModel>> wVar = pVar.A;
        hs.f<TherapistPackagesModel, TherapistPackagesModel> d10 = wVar.d();
        if (d10 != null && (therapistPackagesModel2 = d10.f19464u) != null && (firebaseid3 = therapistPackagesModel2.getFirebaseid()) != null) {
            pVar.H(firebaseid3, true, false);
        }
        hs.f<TherapistPackagesModel, TherapistPackagesModel> d11 = wVar.d();
        if (d11 != null && (therapistPackagesModel = d11.f19465v) != null && (firebaseid2 = therapistPackagesModel.getFirebaseid()) != null) {
            pVar.H(firebaseid2, true, true);
        }
        TherapistPackagesModel d12 = pVar.B.d();
        if (d12 != null && (firebaseid = d12.getFirebaseid()) != null) {
            pVar.H(firebaseid, false, false);
        }
    }

    public static final Object f(p pVar, boolean z10, ls.d dVar) {
        pVar.getClass();
        ls.h hVar = new ls.h(ca.a.G0(dVar));
        try {
            ta.v.H(kc.f.H(pVar), null, 0, new e(pVar, z10, hVar, null), 3);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(pVar.f25559z, e10);
            hVar.resumeWith(Boolean.FALSE);
        }
        return hVar.b();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(5:19|20|(1:22)(1:26)|23|(1:25))|12|13|14))|29|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
        com.theinnerhour.b2b.utils.LogHelper.INSTANCE.e(r5.f25559z, r6);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(p pVar, boolean z10, ls.d dVar) {
        h hVar;
        int i6;
        boolean z11;
        pVar.getClass();
        if (dVar instanceof h) {
            hVar = (h) dVar;
            int i10 = hVar.f25470x;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                hVar.f25470x = i10 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = hVar.f25468v;
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                i6 = hVar.f25470x;
                if (i6 == 0) {
                    if (i6 == 1) {
                        p pVar2 = hVar.f25467u;
                        sp.b.d0(obj);
                        pVar = pVar2;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
                    if (z10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i iVar = new i(pVar, z11, null);
                    hVar.f25467u = pVar;
                    hVar.f25470x = 1;
                    Object S = ta.v.S(bVar, iVar, hVar);
                    pVar = S;
                    if (S == aVar) {
                        return aVar;
                    }
                }
                return hs.k.f19476a;
            }
        }
        hVar = new h(pVar, dVar);
        Object obj2 = hVar.f25468v;
        ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
        i6 = hVar.f25470x;
        if (i6 == 0) {
        }
        return hs.k.f19476a;
    }

    public static final Object h(p pVar, boolean z10, ls.d dVar) {
        pVar.getClass();
        kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(dVar));
        kVar.u();
        ta.v.H(kc.f.H(pVar), null, 0, new j(pVar, null, kVar, z10), 3);
        return kVar.s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r2 != null) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
        if (r2 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
        r0.resumeWith(java.lang.Boolean.FALSE);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(p pVar, boolean z10, ls.d dVar) {
        Integer num;
        TherapistPackagesModel therapistPackagesModel;
        Integer num2;
        pVar.getClass();
        ls.h hVar = new ls.h(ca.a.G0(dVar));
        if (z10) {
            try {
                hs.f<TherapistPackagesModel, TherapistPackagesModel> d10 = pVar.A.d();
                if (d10 != null && (therapistPackagesModel = d10.f19464u) != null) {
                    num = new Integer(therapistPackagesModel.getId());
                } else {
                    num = null;
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(pVar.f25559z, e10);
            }
        }
        if (!z10) {
            TherapistPackagesModel d11 = pVar.B.d();
            if (d11 != null) {
                num2 = new Integer(d11.getId());
            } else {
                num2 = null;
            }
        }
        ta.v.H(kc.f.H(pVar), kotlinx.coroutines.o0.f23642c, 0, new m(pVar, z10, hVar, null), 2);
        return hVar.b();
    }

    public static final Object j(p pVar, Integer num, String str, ls.d dVar) {
        pVar.getClass();
        ls.h hVar = new ls.h(ca.a.G0(dVar));
        try {
            if (num != null) {
                ta.v.H(kc.f.H(pVar), null, 0, new o(pVar, num, str, hVar, null), 3);
            } else {
                hVar.resumeWith(Boolean.FALSE);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(pVar.f25559z, e10);
            hVar.resumeWith(Boolean.FALSE);
        }
        return hVar.b();
    }

    public static final void k(p pVar, JSONObject jSONObject) {
        boolean z10;
        androidx.lifecycle.w<TherapistPackagesModel> wVar = pVar.B;
        if (jSONObject != null) {
            TherapistPackagesModel therapistPackagesModel = new TherapistPackagesModel();
            if (jSONObject.has("psychiatrist")) {
                String optString = jSONObject.optString("psychiatrist", "");
                if (optString != null && !gv.n.B0(optString)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10 && !kotlin.jvm.internal.i.b(jSONObject.getString("psychiatrist"), "null")) {
                    Utils utils = Utils.INSTANCE;
                    JSONObject jSONObject2 = jSONObject.getJSONObject("psychiatrist");
                    kotlin.jvm.internal.i.f(jSONObject2, "obj.getJSONObject(\"psychiatrist\")");
                    utils.parseTherapistObject(therapistPackagesModel, jSONObject2);
                    wVar.i(therapistPackagesModel);
                    return;
                }
            }
            wVar.i(null);
            return;
        }
        wVar.i(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void l(p pVar, JSONObject jSONObject) {
        boolean z10;
        boolean z11;
        boolean z12;
        androidx.lifecycle.w<hs.f<TherapistPackagesModel, TherapistPackagesModel>> wVar = pVar.A;
        TherapistPackagesModel therapistPackagesModel = null;
        if (jSONObject != null) {
            TherapistPackagesModel therapistPackagesModel2 = new TherapistPackagesModel();
            TherapistPackagesModel therapistPackagesModel3 = new TherapistPackagesModel();
            boolean z13 = false;
            if (jSONObject.has("therapist")) {
                String optString = jSONObject.optString("therapist", "");
                if (optString != null && !gv.n.B0(optString)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (!z12 && !kotlin.jvm.internal.i.b(jSONObject.optString("therapist", ""), "null")) {
                    Utils utils = Utils.INSTANCE;
                    JSONObject jSONObject2 = jSONObject.getJSONObject("therapist");
                    kotlin.jvm.internal.i.f(jSONObject2, "obj.getJSONObject(\"therapist\")");
                    utils.parseTherapistObject(therapistPackagesModel2, jSONObject2);
                    z10 = true;
                    if (jSONObject.has("couplestherapist")) {
                        String optString2 = jSONObject.optString("couplestherapist", "");
                        if (optString2 != null && !gv.n.B0(optString2)) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (!z11 && !kotlin.jvm.internal.i.b(jSONObject.optString("couplestherapist", ""), "null")) {
                            Utils utils2 = Utils.INSTANCE;
                            JSONObject jSONObject3 = jSONObject.getJSONObject("couplestherapist");
                            kotlin.jvm.internal.i.f(jSONObject3, "obj.getJSONObject(\"couplestherapist\")");
                            utils2.parseTherapistObject(therapistPackagesModel3, jSONObject3);
                            z13 = true;
                        }
                    }
                    if (!z10) {
                        therapistPackagesModel2 = null;
                    }
                    if (z13) {
                        therapistPackagesModel = therapistPackagesModel3;
                    }
                    wVar.i(new hs.f<>(therapistPackagesModel2, therapistPackagesModel));
                    return;
                }
            }
            z10 = false;
            if (jSONObject.has("couplestherapist")) {
            }
            if (!z10) {
            }
            if (z13) {
            }
            wVar.i(new hs.f<>(therapistPackagesModel2, therapistPackagesModel));
            return;
        }
        wVar.i(null);
    }

    public final boolean A() {
        return this.T;
    }

    public final ArrayList<SuggestedBooking> B() {
        return this.H;
    }

    public final CrossProviderRecommendationNotificationModel C() {
        return this.F;
    }

    public final ArrayList<TelecommunicationHomeworkNotification> D() {
        return this.D;
    }

    public final androidx.lifecycle.w<hs.f<TherapistPackagesModel, TherapistPackagesModel>> E() {
        return this.A;
    }

    public final TelecommunicationsHomeworkResponseModel.HomeworkModel F() {
        return this.M;
    }

    public final hs.f<Boolean, Boolean> G() {
        return this.Q;
    }

    public final void H(String str, boolean z10, boolean z11) {
        try {
            fd.f fVar = FirebaseAuth.getInstance().f;
            if (fVar != null) {
                ta.v.H(kc.f.H(this), null, 0, new a(str, fVar, z11, z10, null), 3);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f25559z, e10);
        }
    }

    public final String m(String timeString) {
        String str;
        kotlin.jvm.internal.i.g(timeString, "timeString");
        try {
            String substring = timeString.substring(0, 2);
            kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int parseInt = Integer.parseInt(substring);
            if (parseInt >= 12) {
                if (parseInt != 12) {
                    parseInt -= 12;
                }
                str = "PM";
            } else {
                if (parseInt == 0) {
                    parseInt = 12;
                }
                str = "AM";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(parseInt);
            String substring2 = timeString.substring(2);
            kotlin.jvm.internal.i.f(substring2, "this as java.lang.String).substring(startIndex)");
            sb2.append(substring2);
            sb2.append(' ');
            sb2.append(str);
            return sb2.toString();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f25559z, e10);
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014e A[Catch: Exception -> 0x017f, TryCatch #0 {Exception -> 0x017f, blocks: (B:3:0x0005, B:14:0x0062, B:18:0x006e, B:19:0x0071, B:92:0x015b, B:48:0x00d0, B:52:0x00de, B:56:0x00ec, B:60:0x00fa, B:64:0x0106, B:68:0x0112, B:72:0x011e, B:76:0x012a, B:80:0x0136, B:21:0x0076, B:24:0x0080, B:27:0x008a, B:30:0x0094, B:33:0x009e, B:36:0x00a8, B:39:0x00b2, B:42:0x00bc, B:45:0x00c6, B:84:0x0142, B:88:0x014e, B:6:0x004b), top: B:97:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String n(String date) {
        String str;
        String str2;
        String str3;
        String str4;
        int hashCode;
        String str5;
        kotlin.jvm.internal.i.g(date, "date");
        try {
            String[] strArr = (String[]) gv.r.a1(date, new String[]{"-"}, 0, 6).toArray(new String[0]);
            str = strArr[0];
            str2 = strArr[1];
            str3 = strArr[2];
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f25559z, e10);
            return date;
        }
        if (!is.k.Q1(Integer.valueOf(Integer.parseInt(str3)), new Integer[]{11, 12, 13})) {
            int parseInt = Integer.parseInt(str3) % 10;
            if (parseInt != 1) {
                if (parseInt != 2) {
                    if (parseInt == 3) {
                        str4 = "rd";
                    }
                } else {
                    str4 = "nd";
                }
            } else {
                str4 = "st";
            }
            hashCode = str2.hashCode();
            if (hashCode == 1567) {
                if (hashCode != 1568) {
                    switch (hashCode) {
                        case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                            if (!str2.equals("1")) {
                                str5 = "Dec";
                                break;
                            }
                            str5 = "Jan";
                            break;
                        case 50:
                            if (!str2.equals("2")) {
                                str5 = "Dec";
                                break;
                            }
                            str5 = "Feb";
                            break;
                        case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                            if (!str2.equals("3")) {
                                str5 = "Dec";
                                break;
                            }
                            str5 = "Mar";
                            break;
                        case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                            if (!str2.equals("4")) {
                                str5 = "Dec";
                                break;
                            }
                            str5 = "Apr";
                            break;
                        case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                            if (!str2.equals("5")) {
                                str5 = "Dec";
                                break;
                            }
                            str5 = "May";
                            break;
                        case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                            if (!str2.equals("6")) {
                                str5 = "Dec";
                                break;
                            }
                            str5 = "Jun";
                            break;
                        case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                            if (!str2.equals("7")) {
                                str5 = "Dec";
                                break;
                            }
                            str5 = "Jul";
                            break;
                        case R.styleable.AppCompatTheme_colorError /* 56 */:
                            if (!str2.equals("8")) {
                                str5 = "Dec";
                                break;
                            }
                            str5 = "Aug";
                            break;
                        case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                            if (!str2.equals("9")) {
                                str5 = "Dec";
                                break;
                            }
                            str5 = "Sep";
                            break;
                        default:
                            switch (hashCode) {
                                case 1537:
                                    if (!str2.equals("01")) {
                                        str5 = "Dec";
                                        break;
                                    }
                                    str5 = "Jan";
                                    break;
                                case 1538:
                                    if (!str2.equals("02")) {
                                        str5 = "Dec";
                                        break;
                                    }
                                    str5 = "Feb";
                                    break;
                                case 1539:
                                    if (!str2.equals("03")) {
                                        str5 = "Dec";
                                        break;
                                    }
                                    str5 = "Mar";
                                    break;
                                case 1540:
                                    if (!str2.equals("04")) {
                                        str5 = "Dec";
                                        break;
                                    }
                                    str5 = "Apr";
                                    break;
                                case 1541:
                                    if (!str2.equals("05")) {
                                        str5 = "Dec";
                                        break;
                                    }
                                    str5 = "May";
                                    break;
                                case 1542:
                                    if (!str2.equals("06")) {
                                        str5 = "Dec";
                                        break;
                                    }
                                    str5 = "Jun";
                                    break;
                                case 1543:
                                    if (!str2.equals("07")) {
                                        str5 = "Dec";
                                        break;
                                    }
                                    str5 = "Jul";
                                    break;
                                case 1544:
                                    if (!str2.equals("08")) {
                                        str5 = "Dec";
                                        break;
                                    }
                                    str5 = "Aug";
                                    break;
                                case 1545:
                                    if (!str2.equals("09")) {
                                        str5 = "Dec";
                                        break;
                                    }
                                    str5 = "Sep";
                                    break;
                                default:
                                    str5 = "Dec";
                                    break;
                            }
                    }
                    return Integer.parseInt(str3) + str4 + ' ' + str5 + ", " + str;
                } else if (str2.equals("11")) {
                    str5 = "Nov";
                    return Integer.parseInt(str3) + str4 + ' ' + str5 + ", " + str;
                } else {
                    str5 = "Dec";
                    return Integer.parseInt(str3) + str4 + ' ' + str5 + ", " + str;
                }
            }
            if (str2.equals("10")) {
                str5 = "Oct";
                return Integer.parseInt(str3) + str4 + ' ' + str5 + ", " + str;
            }
            str5 = "Dec";
            return Integer.parseInt(str3) + str4 + ' ' + str5 + ", " + str;
            LogHelper.INSTANCE.e(this.f25559z, e10);
            return date;
        }
        str4 = "th";
        hashCode = str2.hashCode();
        if (hashCode == 1567) {
        }
        LogHelper.INSTANCE.e(this.f25559z, e10);
        return date;
    }

    public final hs.f<String, String> o(String str) {
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        Locale locale = Locale.ENGLISH;
        DateTimeFormatter withLocale = ofPattern.withLocale(locale);
        DateTimeFormatter withLocale2 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS+05:30").withLocale(locale);
        LocalDateTime parse = LocalDateTime.parse(str, withLocale);
        kotlin.jvm.internal.i.f(parse, "parse(dateTimeString, dateFormat)");
        String format = parse.format(withLocale2);
        kotlin.jvm.internal.i.f(format, "bookingDate.format(requiredFormat)");
        String format2 = parse.D(ZoneId.systemDefault()).v(ZoneOffset.UTC).s().format(withLocale2);
        kotlin.jvm.internal.i.f(format2, "bookingDate.atZone(ZoneI…().format(requiredFormat)");
        return new hs.f<>(format2, format);
    }

    public final String p() {
        return this.P;
    }

    public final String q() {
        return this.O;
    }

    public final UpcomingBooking r() {
        return this.L;
    }

    public final UpcomingBooking s() {
        return this.K;
    }

    public final CrossProviderRecommendationNotificationModel t() {
        return this.G;
    }

    public final ArrayList<TelecommunicationHomeworkNotification> u() {
        return this.E;
    }

    public final androidx.lifecycle.w<TherapistPackagesModel> v() {
        return this.B;
    }

    public final TelecommunicationsHomeworkResponseModel.HomeworkModel w() {
        return this.N;
    }

    public final hs.f<Boolean, Boolean> x() {
        return this.R;
    }

    public final boolean y() {
        return this.V;
    }

    public final boolean z() {
        return this.U;
    }
}
