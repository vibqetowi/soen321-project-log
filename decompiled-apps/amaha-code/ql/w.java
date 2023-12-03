package ql;

import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.components.dynamicActivities.data.NewDynamicActivityScreenDataClass;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.ScreenModel;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.FireStoreUtilsKt;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: NewDynamicActivityViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dynamicActivities.utils.NewDynamicActivityViewModel$fetchActivityInfoForId$1", f = "NewDynamicActivityViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class w extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ String f29839u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ t f29840v;

    /* compiled from: NewDynamicActivityViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.p<Boolean, TemplateModel, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ t f29841u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f29842v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t tVar, String str) {
            super(2);
            this.f29841u = tVar;
            this.f29842v = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x008a, code lost:
            if (r9 != false) goto L34;
         */
        /* JADX WARN: Removed duplicated region for block: B:112:0x0191 A[Catch: Exception -> 0x01be, TryCatch #0 {Exception -> 0x01be, blocks: (B:4:0x0014, B:6:0x001a, B:9:0x0022, B:11:0x0028, B:13:0x0031, B:16:0x0039, B:18:0x003f, B:20:0x0047, B:22:0x004d, B:23:0x0057, B:25:0x005d, B:27:0x0065, B:30:0x006d, B:32:0x007b, B:34:0x0081, B:79:0x0114, B:40:0x008f, B:42:0x0097, B:44:0x00a1, B:46:0x00a5, B:48:0x00ad, B:49:0x00b3, B:51:0x00bf, B:55:0x00c7, B:57:0x00d8, B:61:0x00e0, B:63:0x00e9, B:68:0x00f4, B:69:0x00f7, B:71:0x00fd, B:77:0x010b, B:81:0x011a, B:82:0x011e, B:83:0x011f, B:85:0x012a, B:88:0x0132, B:90:0x013a, B:93:0x0142, B:94:0x0153, B:95:0x015c, B:97:0x0164, B:102:0x016e, B:104:0x017a, B:106:0x0180, B:109:0x0187, B:110:0x018b, B:112:0x0191, B:114:0x019f, B:116:0x01a5, B:120:0x01ae, B:84:0x0125, B:121:0x01b6), top: B:127:0x0012 }] */
        /* JADX WARN: Removed duplicated region for block: B:131:0x0117 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0114 A[Catch: Exception -> 0x01be, TryCatch #0 {Exception -> 0x01be, blocks: (B:4:0x0014, B:6:0x001a, B:9:0x0022, B:11:0x0028, B:13:0x0031, B:16:0x0039, B:18:0x003f, B:20:0x0047, B:22:0x004d, B:23:0x0057, B:25:0x005d, B:27:0x0065, B:30:0x006d, B:32:0x007b, B:34:0x0081, B:79:0x0114, B:40:0x008f, B:42:0x0097, B:44:0x00a1, B:46:0x00a5, B:48:0x00ad, B:49:0x00b3, B:51:0x00bf, B:55:0x00c7, B:57:0x00d8, B:61:0x00e0, B:63:0x00e9, B:68:0x00f4, B:69:0x00f7, B:71:0x00fd, B:77:0x010b, B:81:0x011a, B:82:0x011e, B:83:0x011f, B:85:0x012a, B:88:0x0132, B:90:0x013a, B:93:0x0142, B:94:0x0153, B:95:0x015c, B:97:0x0164, B:102:0x016e, B:104:0x017a, B:106:0x0180, B:109:0x0187, B:110:0x018b, B:112:0x0191, B:114:0x019f, B:116:0x01a5, B:120:0x01ae, B:84:0x0125, B:121:0x01b6), top: B:127:0x0012 }] */
        @Override // ss.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final hs.k invoke(Boolean bool, TemplateModel templateModel) {
            String str;
            String str2;
            String str3;
            String str4;
            ArrayList<NewDynamicActivityScreenDataClass> arrayList;
            boolean z10;
            User user;
            boolean z11;
            ArrayList<Goal> userGoals;
            String str5;
            String str6;
            ArrayList<ScreenModel> template;
            String str7;
            String str8;
            boolean z12;
            boolean z13;
            Boolean bool2;
            boolean z14;
            boolean booleanValue = bool.booleanValue();
            TemplateModel templateModel2 = templateModel;
            String str9 = this.f29842v;
            t tVar = this.f29841u;
            try {
                if (booleanValue) {
                    tVar.G = str9;
                    if (templateModel2 != null) {
                        str = templateModel2.getReminderTitle();
                    } else {
                        str = null;
                    }
                    if (templateModel2 != null) {
                        str2 = templateModel2.getReminderBody();
                    } else {
                        str2 = null;
                    }
                    tVar.X = new hs.f<>(str, str2);
                    if (templateModel2 != null) {
                        str3 = templateModel2.getGoalName();
                    } else {
                        str3 = null;
                    }
                    if (templateModel2 != null) {
                        str4 = templateModel2.getGoal_type();
                    } else {
                        str4 = null;
                    }
                    tVar.O = new hs.j<>(str9, str3, str4);
                    if (templateModel2 != null && (template = templateModel2.getTemplate()) != null) {
                        ArrayList arrayList2 = new ArrayList();
                        int i6 = 0;
                        for (Object obj : template) {
                            int i10 = i6 + 1;
                            if (i6 >= 0) {
                                ScreenModel screenModel = (ScreenModel) obj;
                                if (tVar.W && !templateModel2.getGoalScreens().contains(Integer.valueOf(i6))) {
                                    String slug = screenModel.getSlug();
                                    if (slug != null && !gv.r.J0(slug, "n7")) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                }
                                HashMap<String, Object> params = screenModel.getParams();
                                if (tVar.D == null) {
                                    Object obj2 = params.get("edit_flow_begin");
                                    if (obj2 instanceof Boolean) {
                                        bool2 = (Boolean) obj2;
                                    } else {
                                        bool2 = null;
                                    }
                                    if (kotlin.jvm.internal.i.b(bool2, Boolean.TRUE)) {
                                        tVar.D = screenModel.getSlug();
                                    }
                                }
                                Object obj3 = params.get("id");
                                if (obj3 instanceof String) {
                                    str7 = (String) obj3;
                                } else {
                                    str7 = null;
                                }
                                if (str7 == null) {
                                    str7 = "";
                                }
                                String slug2 = screenModel.getSlug();
                                kotlin.jvm.internal.i.d(slug2);
                                Object obj4 = params.get("cta_slug");
                                if (obj4 instanceof String) {
                                    str8 = (String) obj4;
                                } else {
                                    str8 = null;
                                }
                                if (str8 == null) {
                                    str8 = "cta1";
                                }
                                NewDynamicActivityScreenDataClass newDynamicActivityScreenDataClass = new NewDynamicActivityScreenDataClass(str7, slug2, str8, params);
                                String slug3 = screenModel.getSlug();
                                if (slug3 != null && gv.r.J0(slug3, "n7")) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    tVar.N = newDynamicActivityScreenDataClass;
                                } else {
                                    String slug4 = screenModel.getSlug();
                                    if (slug4 != null && gv.r.J0(slug4, "n30")) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (!z13) {
                                        t.e(tVar, newDynamicActivityScreenDataClass, screenModel.getSlug());
                                        if (newDynamicActivityScreenDataClass == null) {
                                            arrayList2.add(newDynamicActivityScreenDataClass);
                                        }
                                        i6 = i10;
                                    }
                                }
                                newDynamicActivityScreenDataClass = null;
                                if (newDynamicActivityScreenDataClass == null) {
                                }
                                i6 = i10;
                            } else {
                                ca.a.t1();
                                throw null;
                            }
                        }
                        arrayList = new ArrayList<>(arrayList2);
                    } else {
                        arrayList = new ArrayList<>();
                    }
                    tVar.P = arrayList;
                    boolean z15 = tVar.f29781d0;
                    androidx.lifecycle.w<Boolean> wVar = tVar.L;
                    if (z15) {
                        fd.f fVar = FirebaseAuth.getInstance().f;
                        if (fVar != null) {
                            str6 = fVar.j0();
                        } else {
                            str6 = null;
                        }
                        if (str6 != null) {
                            ta.v.H(kc.f.H(tVar), null, 0, new v(tVar, str6, str9, null), 3);
                        } else {
                            tVar.B = true;
                            wVar.i(Boolean.TRUE);
                        }
                    } else {
                        ArrayList<?> p10 = tVar.p();
                        if (p10 != null && !p10.isEmpty()) {
                            z10 = false;
                            tVar.B = z10;
                            user = FirebasePersistence.getInstance().getUser();
                            if (user != null && (userGoals = user.getUserGoals()) != null && !userGoals.isEmpty()) {
                                for (Goal goal : userGoals) {
                                    String goalId = goal.getGoalId();
                                    hs.j<String, String, String> jVar = tVar.O;
                                    if (jVar != null) {
                                        str5 = jVar.f19473u;
                                    } else {
                                        str5 = null;
                                    }
                                    if (kotlin.jvm.internal.i.b(goalId, str5)) {
                                        z11 = true;
                                        break;
                                    }
                                }
                            }
                            z11 = false;
                            tVar.C = z11;
                            wVar.i(Boolean.TRUE);
                        }
                        z10 = true;
                        tVar.B = z10;
                        user = FirebasePersistence.getInstance().getUser();
                        if (user != null) {
                            while (r0.hasNext()) {
                            }
                        }
                        z11 = false;
                        tVar.C = z11;
                        wVar.i(Boolean.TRUE);
                    }
                } else {
                    tVar.L.i(Boolean.FALSE);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(tVar.f29789y, e10);
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(String str, t tVar, ls.d<? super w> dVar) {
        super(2, dVar);
        this.f29839u = str;
        this.f29840v = tVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new w(this.f29839u, this.f29840v, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((w) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        sp.b.d0(obj);
        t tVar = this.f29840v;
        String str = this.f29839u;
        FireStoreUtilsKt.fetchCourseContentV3("en", str, new a(tVar, str));
        return hs.k.f19476a;
    }
}
