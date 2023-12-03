package tl;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.expertCare.activity.ExpertCareInfoActivity;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.network.model.CrossProviderRecommendationNotificationModel;
import com.theinnerhour.b2b.network.model.OfflineClinicDetail;
import com.theinnerhour.b2b.network.model.UpcomingBooking;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import is.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import t0.d0;
import t0.o0;
/* compiled from: ExpertCareDashboardFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltl/d;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class d extends rr.b {
    public static final /* synthetic */ int R = 0;
    public String A;
    public String B;
    public Chip C;
    public boolean D;
    public boolean E;
    public boolean J;
    public final androidx.activity.result.c<Intent> M;
    public final androidx.activity.result.c<Intent> N;
    public final androidx.activity.result.c<Intent> O;
    public final androidx.activity.result.c<Intent> P;

    /* renamed from: u  reason: collision with root package name */
    public ul.a f33234u;

    /* renamed from: v  reason: collision with root package name */
    public zl.o f33235v;

    /* renamed from: x  reason: collision with root package name */
    public sl.h f33237x;
    public final LinkedHashMap Q = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList<vl.f> f33236w = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public String f33238y = "";

    /* renamed from: z  reason: collision with root package name */
    public String f33239z = "";
    public zl.a F = zl.a.ALL;
    public boolean G = true;
    public boolean H = true;
    public boolean I = true;
    public List<hs.f<Boolean, String>> K = w.f20676u;
    public final String L = LogHelper.INSTANCE.makeLogTag("ExpertCareDashboardFragment");

    /* compiled from: ExpertCareDashboardFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f33240a;

        static {
            int[] iArr = new int[zl.a.values().length];
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f33240a = iArr;
            int[] iArr2 = new int[v.h.e(3).length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[zl.b.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[5] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[7] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[6] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[2] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[3] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[4] = 8;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* compiled from: ExpertCareDashboardFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends ArrayList<hs.f<? extends Boolean, ? extends String>>>, hs.k> {
        public b() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends ArrayList<hs.f<? extends Boolean, ? extends String>>> singleUseEvent) {
            ArrayList<hs.f<? extends Boolean, ? extends String>> contentIfNotHandled;
            SingleUseEvent<? extends ArrayList<hs.f<? extends Boolean, ? extends String>>> singleUseEvent2 = singleUseEvent;
            if (singleUseEvent2 != null && (contentIfNotHandled = singleUseEvent2.getContentIfNotHandled()) != null) {
                d dVar = d.this;
                dVar.K = contentIfNotHandled;
                Chip chip = dVar.C;
                if (chip != null) {
                    dVar.O(String.valueOf(chip.getText()));
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExpertCareDashboardFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends hs.f<? extends TherapistPackagesModel, ? extends TherapistPackagesModel>>, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ d f33242u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(zl.o oVar, d dVar) {
            super(1);
            this.f33242u = dVar;
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends hs.f<? extends TherapistPackagesModel, ? extends TherapistPackagesModel>> singleUseEvent) {
            hs.f<? extends TherapistPackagesModel, ? extends TherapistPackagesModel> fVar;
            hs.k kVar;
            hs.k kVar2;
            TherapistPackagesModel therapistPackagesModel;
            RecyclerView.e eVar;
            sl.a aVar;
            TherapistPackagesModel therapistPackagesModel2;
            RecyclerView.e eVar2;
            sl.a aVar2;
            SingleUseEvent<? extends hs.f<? extends TherapistPackagesModel, ? extends TherapistPackagesModel>> singleUseEvent2 = singleUseEvent;
            if (singleUseEvent2 != null) {
                fVar = singleUseEvent2.getContentIfNotHandled();
            } else {
                fVar = null;
            }
            d dVar = this.f33242u;
            if (fVar != null && (therapistPackagesModel2 = (TherapistPackagesModel) fVar.f19464u) != null) {
                String stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_MYTHERAPIST);
                if (stringValue == null || kotlin.jvm.internal.i.b(stringValue, "null") || kotlin.jvm.internal.i.b(stringValue, "")) {
                    SessionManager.getInstance().setStringValue(SessionManager.KEY_MYTHERAPIST, String.valueOf(therapistPackagesModel2.getId()));
                }
                dVar.A = therapistPackagesModel2.getUuid();
                RecyclerView recyclerView = (RecyclerView) dVar._$_findCachedViewById(R.id.llSessionsContainer);
                if (recyclerView != null) {
                    eVar2 = recyclerView.getAdapter();
                } else {
                    eVar2 = null;
                }
                if (eVar2 instanceof sl.a) {
                    aVar2 = (sl.a) eVar2;
                } else {
                    aVar2 = null;
                }
                if (aVar2 != null) {
                    String name = d.Z(therapistPackagesModel2);
                    String image = therapistPackagesModel2.getImage();
                    kotlin.jvm.internal.i.f(image, "therapist.image");
                    kotlin.jvm.internal.i.g(name, "name");
                    try {
                        if (gv.n.B0(aVar2.f31646y) || gv.n.B0(aVar2.f31647z)) {
                            aVar2.f31646y = name;
                            aVar2.f31647z = "https:".concat(image);
                        }
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(aVar2.G, e10);
                    }
                }
                String string = dVar.getString(R.string.profileNewSessionsName, therapistPackagesModel2.getFirstname(), therapistPackagesModel2.getLastname());
                kotlin.jvm.internal.i.f(string, "getString(R.string.profi…name, therapist.lastname)");
                String image2 = therapistPackagesModel2.getImage();
                kotlin.jvm.internal.i.f(image2, "therapist.image");
                dVar.M(1, false, string, image2);
                kVar = hs.k.f19476a;
            } else {
                kVar = null;
            }
            if (kVar == null) {
                dVar.M(1, true, "", "");
            }
            if (fVar != null && (therapistPackagesModel = (TherapistPackagesModel) fVar.f19465v) != null) {
                String stringValue2 = SessionManager.getInstance().getStringValue(SessionManager.KEY_MYCOUPLESTHERAPIST);
                if (stringValue2 == null || kotlin.jvm.internal.i.b(stringValue2, "null") || kotlin.jvm.internal.i.b(stringValue2, "")) {
                    SessionManager.getInstance().setStringValue(SessionManager.KEY_MYCOUPLESTHERAPIST, String.valueOf(therapistPackagesModel.getId()));
                }
                RecyclerView recyclerView2 = (RecyclerView) dVar._$_findCachedViewById(R.id.llSessionsContainer);
                if (recyclerView2 != null) {
                    eVar = recyclerView2.getAdapter();
                } else {
                    eVar = null;
                }
                if (eVar instanceof sl.a) {
                    aVar = (sl.a) eVar;
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    String name2 = d.Z(therapistPackagesModel);
                    String image3 = therapistPackagesModel.getImage();
                    kotlin.jvm.internal.i.f(image3, "couplesTherapist.image");
                    kotlin.jvm.internal.i.g(name2, "name");
                    try {
                        if (gv.n.B0(aVar.C) || gv.n.B0(aVar.D)) {
                            aVar.C = name2;
                            aVar.D = "https:".concat(image3);
                        }
                    } catch (Exception e11) {
                        LogHelper.INSTANCE.e(aVar.G, e11);
                    }
                }
                String string2 = dVar.getString(R.string.profileNewSessionsName, therapistPackagesModel.getFirstname(), therapistPackagesModel.getLastname());
                kotlin.jvm.internal.i.f(string2, "getString(R.string.profi…ouplesTherapist.lastname)");
                String image4 = therapistPackagesModel.getImage();
                kotlin.jvm.internal.i.f(image4, "couplesTherapist.image");
                dVar.M(3, false, string2, image4);
                kVar2 = hs.k.f19476a;
            } else {
                kVar2 = null;
            }
            if (kVar2 == null) {
                dVar.M(3, true, "", "");
            }
            dVar.D = true;
            d.J(dVar);
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExpertCareDashboardFragment.kt */
    /* renamed from: tl.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0550d extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends TherapistPackagesModel>, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ d f33243u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0550d(zl.o oVar, d dVar) {
            super(1);
            this.f33243u = dVar;
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends TherapistPackagesModel> singleUseEvent) {
            TherapistPackagesModel therapistPackagesModel;
            RecyclerView.e eVar;
            SingleUseEvent<? extends TherapistPackagesModel> singleUseEvent2 = singleUseEvent;
            hs.k kVar = null;
            sl.a aVar = null;
            if (singleUseEvent2 != null) {
                therapistPackagesModel = singleUseEvent2.getContentIfNotHandled();
            } else {
                therapistPackagesModel = null;
            }
            d dVar = this.f33243u;
            if (therapistPackagesModel != null) {
                String stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_MYPSYCHIATRIST);
                if (stringValue == null || kotlin.jvm.internal.i.b(stringValue, "null") || kotlin.jvm.internal.i.b(stringValue, "")) {
                    SessionManager.getInstance().setStringValue(SessionManager.KEY_MYPSYCHIATRIST, String.valueOf(therapistPackagesModel.getId()));
                }
                dVar.B = therapistPackagesModel.getUuid();
                RecyclerView recyclerView = (RecyclerView) dVar._$_findCachedViewById(R.id.llSessionsContainer);
                if (recyclerView != null) {
                    eVar = recyclerView.getAdapter();
                } else {
                    eVar = null;
                }
                if (eVar instanceof sl.a) {
                    aVar = (sl.a) eVar;
                }
                if (aVar != null) {
                    String name = d.Z(therapistPackagesModel);
                    String image = therapistPackagesModel.getImage();
                    kotlin.jvm.internal.i.f(image, "psychiatrist.image");
                    kotlin.jvm.internal.i.g(name, "name");
                    try {
                        if (gv.n.B0(aVar.A) || gv.n.B0(aVar.B)) {
                            aVar.A = name;
                            aVar.B = "https:".concat(image);
                        }
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(aVar.G, e10);
                    }
                }
                String string = dVar.getString(R.string.profileNewSessionsName, therapistPackagesModel.getFirstname(), therapistPackagesModel.getLastname());
                kotlin.jvm.internal.i.f(string, "getString(R.string.profi…e, psychiatrist.lastname)");
                String image2 = therapistPackagesModel.getImage();
                kotlin.jvm.internal.i.f(image2, "psychiatrist.image");
                dVar.M(2, false, string, image2);
                kVar = hs.k.f19476a;
            }
            if (kVar == null) {
                dVar.M(2, true, "", "");
            }
            dVar.E = true;
            d.J(dVar);
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExpertCareDashboardFragment.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends List<? extends hs.f<? extends zl.b, ? extends Object>>>, hs.k> {
        public e() {
            super(1);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(13:5|(10:6|7|(1:9)(1:178)|10|(3:173|(1:175)(1:177)|176)(1:12)|13|(1:15)(1:172)|16|(2:18|19)(1:171)|(3:165|166|167)(1:21))|(4:23|(3:84|(1:86)(1:88)|87)(1:25)|26|(3:78|(1:82)|83))(4:89|(1:91)(1:164)|92|(1:94)(25:95|(1:163)(1:103)|104|(1:162)(1:114)|115|(1:161)(1:121)|122|(1:160)(1:130)|131|(1:159)(1:139)|140|(1:158)(1:150)|151|152|153|154|29|30|(5:36|(1:38)(1:44)|39|(1:41)(1:43)|42)|45|(5:51|(1:53)(1:60)|54|(1:56)(1:59)|57)|61|62|(1:64)(2:69|(1:71)(2:72|73))|65))|28|29|30|(7:32|34|36|(0)(0)|39|(0)(0)|42)|45|(7:47|49|51|(0)(0)|54|(0)(0)|57)|61|62|(0)(0)|65) */
        /* JADX WARN: Code restructure failed: missing block: B:162:0x02fb, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:163:0x02fc, code lost:
            com.theinnerhour.b2b.utils.LogHelper.INSTANCE.e(r13, r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:172:0x034e, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:173:0x034f, code lost:
            com.theinnerhour.b2b.utils.LogHelper.INSTANCE.e(r13, r0);
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:133:0x01e6 A[Catch: Exception -> 0x02fb, TryCatch #2 {Exception -> 0x02fb, blocks: (B:131:0x01d9, B:133:0x01e6, B:135:0x01ea, B:137:0x01fe, B:141:0x0242, B:145:0x0255, B:144:0x024b, B:140:0x0238, B:146:0x026e, B:148:0x0272, B:150:0x0276, B:152:0x028a, B:156:0x02ce, B:160:0x02e1, B:159:0x02d7, B:155:0x02c4), top: B:181:0x01d9 }] */
        /* JADX WARN: Removed duplicated region for block: B:139:0x0237  */
        /* JADX WARN: Removed duplicated region for block: B:140:0x0238 A[Catch: Exception -> 0x02fb, TryCatch #2 {Exception -> 0x02fb, blocks: (B:131:0x01d9, B:133:0x01e6, B:135:0x01ea, B:137:0x01fe, B:141:0x0242, B:145:0x0255, B:144:0x024b, B:140:0x0238, B:146:0x026e, B:148:0x0272, B:150:0x0276, B:152:0x028a, B:156:0x02ce, B:160:0x02e1, B:159:0x02d7, B:155:0x02c4), top: B:181:0x01d9 }] */
        /* JADX WARN: Removed duplicated region for block: B:143:0x024a  */
        /* JADX WARN: Removed duplicated region for block: B:144:0x024b A[Catch: Exception -> 0x02fb, TryCatch #2 {Exception -> 0x02fb, blocks: (B:131:0x01d9, B:133:0x01e6, B:135:0x01ea, B:137:0x01fe, B:141:0x0242, B:145:0x0255, B:144:0x024b, B:140:0x0238, B:146:0x026e, B:148:0x0272, B:150:0x0276, B:152:0x028a, B:156:0x02ce, B:160:0x02e1, B:159:0x02d7, B:155:0x02c4), top: B:181:0x01d9 }] */
        /* JADX WARN: Removed duplicated region for block: B:148:0x0272 A[Catch: Exception -> 0x02fb, TryCatch #2 {Exception -> 0x02fb, blocks: (B:131:0x01d9, B:133:0x01e6, B:135:0x01ea, B:137:0x01fe, B:141:0x0242, B:145:0x0255, B:144:0x024b, B:140:0x0238, B:146:0x026e, B:148:0x0272, B:150:0x0276, B:152:0x028a, B:156:0x02ce, B:160:0x02e1, B:159:0x02d7, B:155:0x02c4), top: B:181:0x01d9 }] */
        /* JADX WARN: Removed duplicated region for block: B:154:0x02c3  */
        /* JADX WARN: Removed duplicated region for block: B:155:0x02c4 A[Catch: Exception -> 0x02fb, TryCatch #2 {Exception -> 0x02fb, blocks: (B:131:0x01d9, B:133:0x01e6, B:135:0x01ea, B:137:0x01fe, B:141:0x0242, B:145:0x0255, B:144:0x024b, B:140:0x0238, B:146:0x026e, B:148:0x0272, B:150:0x0276, B:152:0x028a, B:156:0x02ce, B:160:0x02e1, B:159:0x02d7, B:155:0x02c4), top: B:181:0x01d9 }] */
        /* JADX WARN: Removed duplicated region for block: B:158:0x02d6  */
        /* JADX WARN: Removed duplicated region for block: B:159:0x02d7 A[Catch: Exception -> 0x02fb, TryCatch #2 {Exception -> 0x02fb, blocks: (B:131:0x01d9, B:133:0x01e6, B:135:0x01ea, B:137:0x01fe, B:141:0x0242, B:145:0x0255, B:144:0x024b, B:140:0x0238, B:146:0x026e, B:148:0x0272, B:150:0x0276, B:152:0x028a, B:156:0x02ce, B:160:0x02e1, B:159:0x02d7, B:155:0x02c4), top: B:181:0x01d9 }] */
        /* JADX WARN: Removed duplicated region for block: B:166:0x0305 A[Catch: Exception -> 0x034e, TryCatch #1 {Exception -> 0x034e, blocks: (B:164:0x0301, B:166:0x0305, B:167:0x0309, B:169:0x0340, B:170:0x0347, B:171:0x034d), top: B:180:0x0301 }] */
        /* JADX WARN: Removed duplicated region for block: B:167:0x0309 A[Catch: Exception -> 0x034e, TryCatch #1 {Exception -> 0x034e, blocks: (B:164:0x0301, B:166:0x0305, B:167:0x0309, B:169:0x0340, B:170:0x0347, B:171:0x034d), top: B:180:0x0301 }] */
        /* JADX WARN: Type inference failed for: r14v3, types: [int, boolean] */
        /* JADX WARN: Type inference failed for: r14v5 */
        /* JADX WARN: Type inference failed for: r14v6 */
        /* JADX WARN: Type inference failed for: r14v7 */
        @Override // ss.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final hs.k invoke(SingleUseEvent<? extends List<? extends hs.f<? extends zl.b, ? extends Object>>> singleUseEvent) {
            List<? extends hs.f<? extends zl.b, ? extends Object>> contentIfNotHandled;
            boolean z10;
            ?? r14;
            zl.o oVar;
            zl.o oVar2;
            CrossProviderRecommendationNotificationModel crossProviderRecommendationNotificationModel;
            RobertoTextView robertoTextView;
            RobertoTextView robertoTextView2;
            CrossProviderRecommendationNotificationModel crossProviderRecommendationNotificationModel2;
            RobertoTextView robertoTextView3;
            RobertoTextView robertoTextView4;
            int i6;
            int i10;
            RecyclerView.e eVar;
            sl.a aVar;
            int i11;
            Integer valueOf;
            TherapistPackagesModel therapistPackagesModel;
            String str;
            TherapistPackagesModel therapistPackagesModel2;
            String str2;
            TherapistPackagesModel therapistPackagesModel3;
            String str3;
            androidx.lifecycle.w<SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>>> wVar;
            SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>> d10;
            hs.f<TherapistPackagesModel, TherapistPackagesModel> peekContent;
            TherapistPackagesModel therapistPackagesModel4;
            androidx.lifecycle.w<SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>>> wVar2;
            SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>> d11;
            hs.f<TherapistPackagesModel, TherapistPackagesModel> peekContent2;
            androidx.lifecycle.w<SingleUseEvent<TherapistPackagesModel>> wVar3;
            SingleUseEvent<TherapistPackagesModel> d12;
            TherapistPackagesModel peekContent3;
            androidx.lifecycle.w<SingleUseEvent<TherapistPackagesModel>> wVar4;
            SingleUseEvent<TherapistPackagesModel> d13;
            androidx.lifecycle.w<SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>>> wVar5;
            SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>> d14;
            hs.f<TherapistPackagesModel, TherapistPackagesModel> peekContent4;
            TherapistPackagesModel therapistPackagesModel5;
            androidx.lifecycle.w<SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>>> wVar6;
            SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>> d15;
            hs.f<TherapistPackagesModel, TherapistPackagesModel> peekContent5;
            int i12;
            SingleUseEvent<? extends List<? extends hs.f<? extends zl.b, ? extends Object>>> singleUseEvent2 = singleUseEvent;
            if (singleUseEvent2 != null && (contentIfNotHandled = singleUseEvent2.getContentIfNotHandled()) != null) {
                int i13 = d.R;
                d dVar = d.this;
                dVar.getClass();
                String str4 = dVar.L;
                try {
                    RecyclerView recyclerView = (RecyclerView) dVar._$_findCachedViewById(R.id.llSessionsContainer);
                    if (recyclerView != null) {
                        recyclerView.setVisibility(0);
                    }
                    RobertoTextView robertoTextView5 = (RobertoTextView) dVar._$_findCachedViewById(R.id.ctaProviderAllSessions);
                    i6 = 8;
                    if (robertoTextView5 != null) {
                        if (!contentIfNotHandled.isEmpty()) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        robertoTextView5.setVisibility(i10);
                    }
                    RecyclerView recyclerView2 = (RecyclerView) dVar._$_findCachedViewById(R.id.llSessionsContainer);
                    if (recyclerView2 != null) {
                        eVar = recyclerView2.getAdapter();
                    } else {
                        eVar = null;
                    }
                    if (eVar instanceof sl.a) {
                        aVar = (sl.a) eVar;
                    } else {
                        aVar = null;
                    }
                    if (aVar != null) {
                        try {
                            aVar.f31645x = contentIfNotHandled;
                            i11 = aVar.z(null);
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(aVar.G, e10);
                            i11 = 0;
                        }
                        valueOf = Integer.valueOf(i11);
                    } else {
                        valueOf = null;
                    }
                } catch (Exception e11) {
                    e = e11;
                    z10 = false;
                    LogHelper.INSTANCE.e(str4, e);
                    r14 = z10;
                    oVar = dVar.f33235v;
                    if (oVar != null) {
                    }
                    oVar2 = dVar.f33235v;
                    if (oVar2 != null) {
                    }
                    if (dVar.f33237x == null) {
                    }
                    dVar.P();
                    return hs.k.f19476a;
                }
                if (valueOf != null) {
                    RobertoTextView robertoTextView6 = (RobertoTextView) dVar._$_findCachedViewById(R.id.ctaProviderAllSessions);
                    if (robertoTextView6 != null) {
                        if (valueOf.intValue() > 0) {
                            i12 = 0;
                        } else {
                            i12 = 8;
                        }
                        robertoTextView6.setVisibility(i12);
                    }
                    View _$_findCachedViewById = dVar._$_findCachedViewById(R.id.nullStateContainer);
                    if (_$_findCachedViewById != null) {
                        if (valueOf.intValue() == 0 && dVar.F != zl.a.ALL) {
                            i6 = 0;
                        }
                        _$_findCachedViewById.setVisibility(i6);
                    }
                } else {
                    RecyclerView recyclerView3 = (RecyclerView) dVar._$_findCachedViewById(R.id.llSessionsContainer);
                    if (recyclerView3 != null) {
                        recyclerView3.setLayoutManager(new LinearLayoutManager(dVar.requireActivity(), 1, false));
                    }
                    RecyclerView recyclerView4 = (RecyclerView) dVar._$_findCachedViewById(R.id.llSessionsContainer);
                    if (recyclerView4 != null) {
                        zl.o oVar3 = dVar.f33235v;
                        if (oVar3 != null && (wVar6 = oVar3.f39567z) != null && (d15 = wVar6.d()) != null && (peekContent5 = d15.peekContent()) != null) {
                            therapistPackagesModel = peekContent5.f19464u;
                        } else {
                            therapistPackagesModel = null;
                        }
                        String Z = d.Z(therapistPackagesModel);
                        StringBuilder sb2 = new StringBuilder("https:");
                        zl.o oVar4 = dVar.f33235v;
                        if (oVar4 != null && (wVar5 = oVar4.f39567z) != null && (d14 = wVar5.d()) != null && (peekContent4 = d14.peekContent()) != null && (therapistPackagesModel5 = peekContent4.f19464u) != null) {
                            str = therapistPackagesModel5.getImage();
                        } else {
                            str = null;
                        }
                        sb2.append(str);
                        String sb3 = sb2.toString();
                        zl.o oVar5 = dVar.f33235v;
                        if (oVar5 != null && (wVar4 = oVar5.A) != null && (d13 = wVar4.d()) != null) {
                            therapistPackagesModel2 = d13.peekContent();
                        } else {
                            therapistPackagesModel2 = null;
                        }
                        String Z2 = d.Z(therapistPackagesModel2);
                        StringBuilder sb4 = new StringBuilder("https:");
                        zl.o oVar6 = dVar.f33235v;
                        if (oVar6 != null && (wVar3 = oVar6.A) != null && (d12 = wVar3.d()) != null && (peekContent3 = d12.peekContent()) != null) {
                            str2 = peekContent3.getImage();
                        } else {
                            str2 = null;
                        }
                        sb4.append(str2);
                        String sb5 = sb4.toString();
                        zl.o oVar7 = dVar.f33235v;
                        if (oVar7 != null && (wVar2 = oVar7.f39567z) != null && (d11 = wVar2.d()) != null && (peekContent2 = d11.peekContent()) != null) {
                            therapistPackagesModel3 = peekContent2.f19465v;
                        } else {
                            therapistPackagesModel3 = null;
                        }
                        String Z3 = d.Z(therapistPackagesModel3);
                        StringBuilder sb6 = new StringBuilder("https:");
                        zl.o oVar8 = dVar.f33235v;
                        if (oVar8 != null && (wVar = oVar8.f39567z) != null && (d10 = wVar.d()) != null && (peekContent = d10.peekContent()) != null && (therapistPackagesModel4 = peekContent.f19465v) != null) {
                            str3 = therapistPackagesModel4.getImage();
                        } else {
                            str3 = null;
                        }
                        sb6.append(str3);
                        z10 = false;
                        r14 = 0;
                        try {
                            recyclerView4.setAdapter(new sl.a(contentIfNotHandled, Z, sb3, Z2, sb5, Z3, sb6.toString(), new k(dVar), new l(dVar)));
                        } catch (Exception e12) {
                            e = e12;
                            LogHelper.INSTANCE.e(str4, e);
                            r14 = z10;
                            oVar = dVar.f33235v;
                            if (oVar != null) {
                            }
                            oVar2 = dVar.f33235v;
                            if (oVar2 != null) {
                            }
                            if (dVar.f33237x == null) {
                            }
                            dVar.P();
                            return hs.k.f19476a;
                        }
                        oVar = dVar.f33235v;
                        if (oVar != null && (crossProviderRecommendationNotificationModel2 = oVar.C) != null && !kotlin.jvm.internal.i.b(ApplicationPersistence.getInstance().getStringValue("db_integrated_cross_psychiatry"), crossProviderRecommendationNotificationModel2.getId())) {
                            dVar.f33238y = String.valueOf(crossProviderRecommendationNotificationModel2.getId());
                            ((LinearLayoutCompat) dVar._$_findCachedViewById(R.id.llBookAPsychiatristSession)).removeAllViews();
                            ((LinearLayoutCompat) dVar._$_findCachedViewById(R.id.llBookAPsychiatristSession)).setVisibility(r14);
                            View inflate = dVar.requireActivity().getLayoutInflater().inflate(R.layout.layout_expert_cross_recommendation, (LinearLayoutCompat) dVar._$_findCachedViewById(R.id.llBookAPsychiatristSession), (boolean) r14);
                            robertoTextView3 = (RobertoTextView) inflate.findViewById(R.id.tvExpertType);
                            if (robertoTextView3 == null) {
                                robertoTextView3.setText(dVar.getString(R.string.recommend_psychiatry_header));
                            }
                            robertoTextView4 = (RobertoTextView) inflate.findViewById(R.id.tvExpertName);
                            if (robertoTextView4 == null) {
                                robertoTextView4.setText(dVar.getString(R.string.recommend_psychiatry_subheader));
                            }
                            ((LinearLayoutCompat) dVar._$_findCachedViewById(R.id.llBookAPsychiatristSession)).setOnClickListener(new tl.b(dVar, 10));
                            ((LinearLayoutCompat) dVar._$_findCachedViewById(R.id.llBookAPsychiatristSession)).addView(inflate);
                        }
                        oVar2 = dVar.f33235v;
                        if (oVar2 != null && (crossProviderRecommendationNotificationModel = oVar2.D) != null && !kotlin.jvm.internal.i.b(ApplicationPersistence.getInstance().getStringValue("db_integrated_cross_therapy"), crossProviderRecommendationNotificationModel.getId())) {
                            dVar.f33239z = String.valueOf(crossProviderRecommendationNotificationModel.getId());
                            ((LinearLayoutCompat) dVar._$_findCachedViewById(R.id.llBookATherapySession)).removeAllViews();
                            ((LinearLayoutCompat) dVar._$_findCachedViewById(R.id.llBookATherapySession)).setVisibility(r14);
                            View inflate2 = dVar.requireActivity().getLayoutInflater().inflate(R.layout.layout_expert_cross_recommendation, (LinearLayoutCompat) dVar._$_findCachedViewById(R.id.llBookATherapySession), (boolean) r14);
                            robertoTextView = (RobertoTextView) inflate2.findViewById(R.id.tvExpertType);
                            if (robertoTextView == null) {
                                robertoTextView.setText(dVar.getString(R.string.recommend_therapy_header));
                            }
                            robertoTextView2 = (RobertoTextView) inflate2.findViewById(R.id.tvExpertName);
                            if (robertoTextView2 == null) {
                                robertoTextView2.setText(dVar.getString(R.string.recommend_therapy_subheader));
                            }
                            ((LinearLayoutCompat) dVar._$_findCachedViewById(R.id.llBookATherapySession)).setOnClickListener(new tl.b(dVar, 11));
                            ((LinearLayoutCompat) dVar._$_findCachedViewById(R.id.llBookATherapySession)).addView(inflate2);
                        }
                        if (dVar.f33237x == null) {
                            dVar.S();
                        } else {
                            ((RecyclerView) dVar._$_findCachedViewById(R.id.rvtools)).setLayoutManager(new LinearLayoutManager(dVar.requireActivity(), 1, r14));
                            Context requireContext = dVar.requireContext();
                            kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                            dVar.f33237x = new sl.h(requireContext, dVar.f33236w, new j(dVar));
                            RecyclerView recyclerView5 = (RecyclerView) dVar._$_findCachedViewById(R.id.rvtools);
                            sl.h hVar = dVar.f33237x;
                            if (hVar != null) {
                                recyclerView5.setAdapter(hVar);
                                dVar.S();
                            } else {
                                kotlin.jvm.internal.i.q("adapter");
                                throw null;
                            }
                        }
                        dVar.P();
                    }
                }
                r14 = 0;
                oVar = dVar.f33235v;
                if (oVar != null) {
                    dVar.f33238y = String.valueOf(crossProviderRecommendationNotificationModel2.getId());
                    ((LinearLayoutCompat) dVar._$_findCachedViewById(R.id.llBookAPsychiatristSession)).removeAllViews();
                    ((LinearLayoutCompat) dVar._$_findCachedViewById(R.id.llBookAPsychiatristSession)).setVisibility(r14);
                    View inflate3 = dVar.requireActivity().getLayoutInflater().inflate(R.layout.layout_expert_cross_recommendation, (LinearLayoutCompat) dVar._$_findCachedViewById(R.id.llBookAPsychiatristSession), (boolean) r14);
                    robertoTextView3 = (RobertoTextView) inflate3.findViewById(R.id.tvExpertType);
                    if (robertoTextView3 == null) {
                    }
                    robertoTextView4 = (RobertoTextView) inflate3.findViewById(R.id.tvExpertName);
                    if (robertoTextView4 == null) {
                    }
                    ((LinearLayoutCompat) dVar._$_findCachedViewById(R.id.llBookAPsychiatristSession)).setOnClickListener(new tl.b(dVar, 10));
                    ((LinearLayoutCompat) dVar._$_findCachedViewById(R.id.llBookAPsychiatristSession)).addView(inflate3);
                }
                oVar2 = dVar.f33235v;
                if (oVar2 != null) {
                    dVar.f33239z = String.valueOf(crossProviderRecommendationNotificationModel.getId());
                    ((LinearLayoutCompat) dVar._$_findCachedViewById(R.id.llBookATherapySession)).removeAllViews();
                    ((LinearLayoutCompat) dVar._$_findCachedViewById(R.id.llBookATherapySession)).setVisibility(r14);
                    View inflate22 = dVar.requireActivity().getLayoutInflater().inflate(R.layout.layout_expert_cross_recommendation, (LinearLayoutCompat) dVar._$_findCachedViewById(R.id.llBookATherapySession), (boolean) r14);
                    robertoTextView = (RobertoTextView) inflate22.findViewById(R.id.tvExpertType);
                    if (robertoTextView == null) {
                    }
                    robertoTextView2 = (RobertoTextView) inflate22.findViewById(R.id.tvExpertName);
                    if (robertoTextView2 == null) {
                    }
                    ((LinearLayoutCompat) dVar._$_findCachedViewById(R.id.llBookATherapySession)).setOnClickListener(new tl.b(dVar, 11));
                    ((LinearLayoutCompat) dVar._$_findCachedViewById(R.id.llBookATherapySession)).addView(inflate22);
                }
                if (dVar.f33237x == null) {
                }
                dVar.P();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExpertCareDashboardFragment.kt */
    /* loaded from: classes2.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends ArrayList<vl.f>>, hs.k> {
        public f() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends ArrayList<vl.f>> singleUseEvent) {
            ArrayList<vl.f> contentIfNotHandled;
            int i6;
            SingleUseEvent<? extends ArrayList<vl.f>> singleUseEvent2 = singleUseEvent;
            if (singleUseEvent2 != null && (contentIfNotHandled = singleUseEvent2.getContentIfNotHandled()) != null) {
                d dVar = d.this;
                dVar.f33236w.clear();
                boolean z10 = !contentIfNotHandled.isEmpty();
                ArrayList<vl.f> arrayList = dVar.f33236w;
                if (z10) {
                    List D2 = is.u.D2(contentIfNotHandled, new tl.e());
                    ArrayList arrayList2 = new ArrayList();
                    is.u.F2(D2, arrayList2);
                    arrayList.addAll(arrayList2);
                }
                sl.h hVar = dVar.f33237x;
                if (hVar != null) {
                    int w10 = hVar.w(arrayList);
                    RobertoTextView robertoTextView = (RobertoTextView) dVar._$_findCachedViewById(R.id.tvToolsTitle);
                    if (robertoTextView != null) {
                        if (w10 == 0) {
                            i6 = 8;
                        } else {
                            i6 = 0;
                        }
                        robertoTextView.setVisibility(i6);
                    }
                } else {
                    kotlin.jvm.internal.i.q("adapter");
                    throw null;
                }
            }
            return hs.k.f19476a;
        }
    }

    public d() {
        androidx.activity.result.c<Intent> registerForActivityResult = registerForActivityResult(new e.d(), new androidx.activity.result.b(this) { // from class: tl.a

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ d f33228v;

            {
                this.f33228v = this;
            }

            @Override // androidx.activity.result.b
            public final void b(Object obj) {
                int i6;
                int i10 = r2;
                d this$0 = this.f33228v;
                switch (i10) {
                    case 0:
                        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                        int i11 = d.R;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.m0();
                        return;
                    case 1:
                        androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                        int i12 = d.R;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.S();
                        return;
                    case 2:
                        androidx.activity.result.a aVar3 = (androidx.activity.result.a) obj;
                        int i13 = d.R;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            sl.h hVar = this$0.f33237x;
                            if (hVar != null) {
                                int w10 = hVar.w(this$0.f33236w);
                                RobertoTextView robertoTextView = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvToolsTitle);
                                if (robertoTextView != null) {
                                    if (w10 == 0) {
                                        i6 = 8;
                                    } else {
                                        i6 = 0;
                                    }
                                    robertoTextView.setVisibility(i6);
                                    return;
                                }
                                return;
                            }
                            kotlin.jvm.internal.i.q("adapter");
                            throw null;
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this$0.L, e10);
                            return;
                        }
                    default:
                        androidx.activity.result.a aVar4 = (androidx.activity.result.a) obj;
                        int i14 = d.R;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.P();
                        return;
                }
            }
        });
        kotlin.jvm.internal.i.f(registerForActivityResult, "registerForActivityResul…     refreshState()\n    }");
        this.M = registerForActivityResult;
        androidx.activity.result.c<Intent> registerForActivityResult2 = registerForActivityResult(new e.d(), new androidx.activity.result.b(this) { // from class: tl.a

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ d f33228v;

            {
                this.f33228v = this;
            }

            @Override // androidx.activity.result.b
            public final void b(Object obj) {
                int i6;
                int i10 = r2;
                d this$0 = this.f33228v;
                switch (i10) {
                    case 0:
                        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                        int i11 = d.R;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.m0();
                        return;
                    case 1:
                        androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                        int i12 = d.R;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.S();
                        return;
                    case 2:
                        androidx.activity.result.a aVar3 = (androidx.activity.result.a) obj;
                        int i13 = d.R;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            sl.h hVar = this$0.f33237x;
                            if (hVar != null) {
                                int w10 = hVar.w(this$0.f33236w);
                                RobertoTextView robertoTextView = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvToolsTitle);
                                if (robertoTextView != null) {
                                    if (w10 == 0) {
                                        i6 = 8;
                                    } else {
                                        i6 = 0;
                                    }
                                    robertoTextView.setVisibility(i6);
                                    return;
                                }
                                return;
                            }
                            kotlin.jvm.internal.i.q("adapter");
                            throw null;
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this$0.L, e10);
                            return;
                        }
                    default:
                        androidx.activity.result.a aVar4 = (androidx.activity.result.a) obj;
                        int i14 = d.R;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.P();
                        return;
                }
            }
        });
        kotlin.jvm.internal.i.f(registerForActivityResult2, "registerForActivityResul…       fetchTools()\n    }");
        this.N = registerForActivityResult2;
        androidx.activity.result.c<Intent> registerForActivityResult3 = registerForActivityResult(new e.d(), new androidx.activity.result.b(this) { // from class: tl.a

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ d f33228v;

            {
                this.f33228v = this;
            }

            @Override // androidx.activity.result.b
            public final void b(Object obj) {
                int i6;
                int i10 = r2;
                d this$0 = this.f33228v;
                switch (i10) {
                    case 0:
                        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                        int i11 = d.R;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.m0();
                        return;
                    case 1:
                        androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                        int i12 = d.R;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.S();
                        return;
                    case 2:
                        androidx.activity.result.a aVar3 = (androidx.activity.result.a) obj;
                        int i13 = d.R;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            sl.h hVar = this$0.f33237x;
                            if (hVar != null) {
                                int w10 = hVar.w(this$0.f33236w);
                                RobertoTextView robertoTextView = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvToolsTitle);
                                if (robertoTextView != null) {
                                    if (w10 == 0) {
                                        i6 = 8;
                                    } else {
                                        i6 = 0;
                                    }
                                    robertoTextView.setVisibility(i6);
                                    return;
                                }
                                return;
                            }
                            kotlin.jvm.internal.i.q("adapter");
                            throw null;
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this$0.L, e10);
                            return;
                        }
                    default:
                        androidx.activity.result.a aVar4 = (androidx.activity.result.a) obj;
                        int i14 = d.R;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.P();
                        return;
                }
            }
        });
        kotlin.jvm.internal.i.f(registerForActivityResult3, "registerForActivityResul…e(TAG, e)\n        }\n    }");
        this.O = registerForActivityResult3;
        androidx.activity.result.c<Intent> registerForActivityResult4 = registerForActivityResult(new e.d(), new androidx.activity.result.b(this) { // from class: tl.a

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ d f33228v;

            {
                this.f33228v = this;
            }

            @Override // androidx.activity.result.b
            public final void b(Object obj) {
                int i6;
                int i10 = r2;
                d this$0 = this.f33228v;
                switch (i10) {
                    case 0:
                        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                        int i11 = d.R;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.m0();
                        return;
                    case 1:
                        androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                        int i12 = d.R;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.S();
                        return;
                    case 2:
                        androidx.activity.result.a aVar3 = (androidx.activity.result.a) obj;
                        int i13 = d.R;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            sl.h hVar = this$0.f33237x;
                            if (hVar != null) {
                                int w10 = hVar.w(this$0.f33236w);
                                RobertoTextView robertoTextView = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvToolsTitle);
                                if (robertoTextView != null) {
                                    if (w10 == 0) {
                                        i6 = 8;
                                    } else {
                                        i6 = 0;
                                    }
                                    robertoTextView.setVisibility(i6);
                                    return;
                                }
                                return;
                            }
                            kotlin.jvm.internal.i.q("adapter");
                            throw null;
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this$0.L, e10);
                            return;
                        }
                    default:
                        androidx.activity.result.a aVar4 = (androidx.activity.result.a) obj;
                        int i14 = d.R;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.P();
                        return;
                }
            }
        });
        kotlin.jvm.internal.i.f(registerForActivityResult4, "registerForActivityResul…rapyAndPsychiatry()\n    }");
        this.P = registerForActivityResult4;
    }

    public static final void J(final d dVar) {
        TherapistPackagesModel therapistPackagesModel;
        TherapistPackagesModel therapistPackagesModel2;
        TherapistPackagesModel therapistPackagesModel3;
        androidx.lifecycle.w<SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>>> wVar;
        SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>> d10;
        hs.f<TherapistPackagesModel, TherapistPackagesModel> peekContent;
        TherapistPackagesModel therapistPackagesModel4;
        SingleUseEvent<TherapistPackagesModel> singleUseEvent;
        View findViewById;
        View findViewById2;
        androidx.lifecycle.w<SingleUseEvent<TherapistPackagesModel>> wVar2;
        androidx.lifecycle.w<SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>>> wVar3;
        SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>> d11;
        hs.f<TherapistPackagesModel, TherapistPackagesModel> peekContent2;
        androidx.lifecycle.w<SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>>> wVar4;
        SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>> d12;
        hs.f<TherapistPackagesModel, TherapistPackagesModel> peekContent3;
        String str = dVar.L;
        try {
            if (dVar.D && dVar.E) {
                zl.o oVar = dVar.f33235v;
                if (oVar != null && (wVar4 = oVar.f39567z) != null && (d12 = wVar4.d()) != null && (peekContent3 = d12.peekContent()) != null) {
                    therapistPackagesModel = peekContent3.f19464u;
                } else {
                    therapistPackagesModel = null;
                }
                if (therapistPackagesModel == null) {
                    zl.o oVar2 = dVar.f33235v;
                    if (oVar2 != null && (wVar3 = oVar2.f39567z) != null && (d11 = wVar3.d()) != null && (peekContent2 = d11.peekContent()) != null) {
                        therapistPackagesModel4 = peekContent2.f19465v;
                    } else {
                        therapistPackagesModel4 = null;
                    }
                    if (therapistPackagesModel4 == null) {
                        zl.o oVar3 = dVar.f33235v;
                        if (oVar3 != null && (wVar2 = oVar3.A) != null) {
                            singleUseEvent = wVar2.d();
                        } else {
                            singleUseEvent = null;
                        }
                        if (singleUseEvent == null) {
                            View _$_findCachedViewById = dVar._$_findCachedViewById(R.id.nullStateContainer);
                            if (_$_findCachedViewById != null) {
                                _$_findCachedViewById.setVisibility(0);
                            }
                            RobertoTextView robertoTextView = (RobertoTextView) dVar._$_findCachedViewById(R.id.tvBookASessionTitle);
                            if (robertoTextView != null) {
                                robertoTextView.setText("Therapy & Psychiatry");
                            }
                            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) dVar._$_findCachedViewById(R.id.hsvFilterContainer);
                            if (horizontalScrollView != null) {
                                horizontalScrollView.setVisibility(8);
                            }
                            RecyclerView recyclerView = (RecyclerView) dVar._$_findCachedViewById(R.id.llSessionsContainer);
                            if (recyclerView != null) {
                                recyclerView.setVisibility(8);
                            }
                            RobertoTextView robertoTextView2 = (RobertoTextView) dVar._$_findCachedViewById(R.id.ctaProviderAllSessions);
                            if (robertoTextView2 != null) {
                                robertoTextView2.setVisibility(8);
                            }
                            RobertoTextView robertoTextView3 = (RobertoTextView) dVar._$_findCachedViewById(R.id.tvProviderInfoHeader);
                            if (robertoTextView3 != null) {
                                robertoTextView3.setVisibility(8);
                            }
                            ConstraintLayout constraintLayout = (ConstraintLayout) dVar._$_findCachedViewById(R.id.clProviderInfoContainer);
                            if (constraintLayout != null) {
                                constraintLayout.setVisibility(8);
                            }
                            RobertoTextView robertoTextView4 = (RobertoTextView) dVar._$_findCachedViewById(R.id.tvToolsTitle);
                            if (robertoTextView4 != null) {
                                robertoTextView4.setVisibility(8);
                            }
                            RecyclerView recyclerView2 = (RecyclerView) dVar._$_findCachedViewById(R.id.rvtools);
                            if (recyclerView2 != null) {
                                recyclerView2.setVisibility(8);
                            }
                            if (!dVar.J) {
                                int intValue = ApplicationPersistence.getInstance().getIntValue("ecd_matching_day_count") + 1;
                                if (intValue > 3) {
                                    ApplicationPersistence.getInstance().deleteKey("show_fy_matching");
                                    ApplicationPersistence.getInstance().deleteKey("ecd_matching_day_count");
                                } else {
                                    ApplicationPersistence.getInstance().setIntValue("ecd_matching_day_count", intValue);
                                }
                                dVar.J = true;
                            }
                            final kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
                            if (ApplicationPersistence.getInstance().getBooleanValue("show_fy_matching", false)) {
                                uVar.f23466u = true;
                                View _$_findCachedViewById2 = dVar._$_findCachedViewById(R.id.nullStateContainer);
                                if (_$_findCachedViewById2 != null) {
                                    View findViewById3 = _$_findCachedViewById2.findViewById(R.id.ivForYouTeleConsultationNullImage);
                                    if (findViewById3 != null) {
                                        findViewById3.setVisibility(8);
                                    }
                                    View findViewById4 = _$_findCachedViewById2.findViewById(R.id.ivForYouTeleConsultationNullFooter);
                                    if (findViewById4 != null) {
                                        findViewById4.setVisibility(8);
                                    }
                                    View findViewById5 = _$_findCachedViewById2.findViewById(R.id.ivForYouTeleConsultationMatchingPrompt);
                                    if (findViewById5 != null) {
                                        findViewById5.setVisibility(0);
                                    }
                                    View findViewById6 = _$_findCachedViewById2.findViewById(R.id.tvForYouTeleConsultationMatchingPromptHeader);
                                    if (findViewById6 != null) {
                                        findViewById6.setVisibility(0);
                                    }
                                    View findViewById7 = _$_findCachedViewById2.findViewById(R.id.tvForYouTeleConsultationMatchingPromptSubHeader);
                                    if (findViewById7 != null) {
                                        findViewById7.setVisibility(0);
                                    }
                                    View findViewById8 = _$_findCachedViewById2.findViewById(R.id.tvForYouTeleConsultationMatchingPromptCta);
                                    if (findViewById8 != null) {
                                        findViewById8.setVisibility(0);
                                    }
                                    View findViewById9 = _$_findCachedViewById2.findViewById(R.id.tvForYouTeleConsultationMatchingPromptCta);
                                    if (findViewById9 != null) {
                                        findViewById9.setOnClickListener(new tl.b(dVar, 7));
                                    }
                                }
                            } else {
                                View _$_findCachedViewById3 = dVar._$_findCachedViewById(R.id.nullStateContainer);
                                if (_$_findCachedViewById3 != null) {
                                    View findViewById10 = _$_findCachedViewById3.findViewById(R.id.ivForYouTeleConsultationNullImage);
                                    if (findViewById10 != null) {
                                        findViewById10.setVisibility(0);
                                    }
                                    View findViewById11 = _$_findCachedViewById3.findViewById(R.id.ivForYouTeleConsultationNullFooter);
                                    if (findViewById11 != null) {
                                        findViewById11.setVisibility(0);
                                    }
                                    View findViewById12 = _$_findCachedViewById3.findViewById(R.id.ivForYouTeleConsultationMatchingPrompt);
                                    if (findViewById12 != null) {
                                        findViewById12.setVisibility(8);
                                    }
                                    View findViewById13 = _$_findCachedViewById3.findViewById(R.id.tvForYouTeleConsultationMatchingPromptHeader);
                                    if (findViewById13 != null) {
                                        findViewById13.setVisibility(8);
                                    }
                                    View findViewById14 = _$_findCachedViewById3.findViewById(R.id.tvForYouTeleConsultationMatchingPromptSubHeader);
                                    if (findViewById14 != null) {
                                        findViewById14.setVisibility(8);
                                    }
                                    View findViewById15 = _$_findCachedViewById3.findViewById(R.id.tvForYouTeleConsultationMatchingPromptCta);
                                    if (findViewById15 != null) {
                                        findViewById15.setVisibility(8);
                                    }
                                }
                            }
                            View _$_findCachedViewById4 = dVar._$_findCachedViewById(R.id.nullStateContainer);
                            if (_$_findCachedViewById4 != null && (findViewById2 = _$_findCachedViewById4.findViewById(R.id.clForYouTeleConsultationInfoTherapy)) != null) {
                                findViewById2.setOnClickListener(new View.OnClickListener(dVar) { // from class: tl.c

                                    /* renamed from: v  reason: collision with root package name */
                                    public final /* synthetic */ d f33232v;

                                    {
                                        this.f33232v = dVar;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i6 = r3;
                                        kotlin.jvm.internal.u isMatchingShown = uVar;
                                        d this$0 = this.f33232v;
                                        switch (i6) {
                                            case 0:
                                                int i10 = d.R;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                kotlin.jvm.internal.i.g(isMatchingShown, "$isMatchingShown");
                                                this$0.M.a(new Intent(this$0.requireActivity(), ExpertCareInfoActivity.class).putExtra("isPsychiatryFlow", false).putExtra("source", "homescreen"));
                                                String str2 = gk.a.f16573a;
                                                Bundle f2 = defpackage.e.f("flow", "therapy", "variant", "f");
                                                f2.putBoolean("matching_shown", isMatchingShown.f23466u);
                                                hs.k kVar = hs.k.f19476a;
                                                gk.a.b(f2, "therapy_psychiatry_dashboard_click");
                                                ApplicationPersistence.getInstance().setBooleanValue("show_fy_matching", true);
                                                return;
                                            default:
                                                int i11 = d.R;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                kotlin.jvm.internal.i.g(isMatchingShown, "$isMatchingShown");
                                                this$0.M.a(new Intent(this$0.requireActivity(), ExpertCareInfoActivity.class).putExtra("isPsychiatryFlow", true).putExtra("source", "homescreen"));
                                                String str3 = gk.a.f16573a;
                                                Bundle f10 = defpackage.e.f("flow", "psychiatry", "variant", "f");
                                                f10.putBoolean("matching_shown", isMatchingShown.f23466u);
                                                hs.k kVar2 = hs.k.f19476a;
                                                gk.a.b(f10, "therapy_psychiatry_dashboard_click");
                                                ApplicationPersistence.getInstance().setBooleanValue("show_fy_matching", true);
                                                return;
                                        }
                                    }
                                });
                            }
                            View _$_findCachedViewById5 = dVar._$_findCachedViewById(R.id.nullStateContainer);
                            if (_$_findCachedViewById5 != null && (findViewById = _$_findCachedViewById5.findViewById(R.id.clForYouTeleConsultationInfoPsychiatry)) != null) {
                                findViewById.setOnClickListener(new View.OnClickListener(dVar) { // from class: tl.c

                                    /* renamed from: v  reason: collision with root package name */
                                    public final /* synthetic */ d f33232v;

                                    {
                                        this.f33232v = dVar;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i6 = r3;
                                        kotlin.jvm.internal.u isMatchingShown = uVar;
                                        d this$0 = this.f33232v;
                                        switch (i6) {
                                            case 0:
                                                int i10 = d.R;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                kotlin.jvm.internal.i.g(isMatchingShown, "$isMatchingShown");
                                                this$0.M.a(new Intent(this$0.requireActivity(), ExpertCareInfoActivity.class).putExtra("isPsychiatryFlow", false).putExtra("source", "homescreen"));
                                                String str2 = gk.a.f16573a;
                                                Bundle f2 = defpackage.e.f("flow", "therapy", "variant", "f");
                                                f2.putBoolean("matching_shown", isMatchingShown.f23466u);
                                                hs.k kVar = hs.k.f19476a;
                                                gk.a.b(f2, "therapy_psychiatry_dashboard_click");
                                                ApplicationPersistence.getInstance().setBooleanValue("show_fy_matching", true);
                                                return;
                                            default:
                                                int i11 = d.R;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                kotlin.jvm.internal.i.g(isMatchingShown, "$isMatchingShown");
                                                this$0.M.a(new Intent(this$0.requireActivity(), ExpertCareInfoActivity.class).putExtra("isPsychiatryFlow", true).putExtra("source", "homescreen"));
                                                String str3 = gk.a.f16573a;
                                                Bundle f10 = defpackage.e.f("flow", "psychiatry", "variant", "f");
                                                f10.putBoolean("matching_shown", isMatchingShown.f23466u);
                                                hs.k kVar2 = hs.k.f19476a;
                                                gk.a.b(f10, "therapy_psychiatry_dashboard_click");
                                                ApplicationPersistence.getInstance().setBooleanValue("show_fy_matching", true);
                                                return;
                                        }
                                    }
                                });
                            }
                            ul.a aVar = dVar.f33234u;
                            if (aVar != null) {
                                aVar.j(false);
                            }
                        }
                    }
                }
                View _$_findCachedViewById6 = dVar._$_findCachedViewById(R.id.nullStateContainer);
                if (_$_findCachedViewById6 != null) {
                    _$_findCachedViewById6.setVisibility(8);
                    View findViewById16 = _$_findCachedViewById6.findViewById(R.id.ivForYouTeleConsultationNullImage);
                    if (findViewById16 != null) {
                        findViewById16.setVisibility(0);
                    }
                    View findViewById17 = _$_findCachedViewById6.findViewById(R.id.ivForYouTeleConsultationNullFooter);
                    if (findViewById17 != null) {
                        findViewById17.setVisibility(0);
                    }
                    View findViewById18 = _$_findCachedViewById6.findViewById(R.id.tvForYouTeleConsultationInfoHeader);
                    if (findViewById18 != null) {
                        findViewById18.setVisibility(8);
                    }
                    View findViewById19 = _$_findCachedViewById6.findViewById(R.id.clForYouTeleConsultationInfoTherapy);
                    if (findViewById19 != null) {
                        findViewById19.setVisibility(8);
                    }
                    View findViewById20 = _$_findCachedViewById6.findViewById(R.id.clForYouTeleConsultationInfoPsychiatry);
                    if (findViewById20 != null) {
                        findViewById20.setVisibility(8);
                    }
                    View findViewById21 = _$_findCachedViewById6.findViewById(R.id.ivForYouTeleConsultationMatchingPrompt);
                    if (findViewById21 != null) {
                        findViewById21.setVisibility(8);
                    }
                    View findViewById22 = _$_findCachedViewById6.findViewById(R.id.tvForYouTeleConsultationMatchingPromptHeader);
                    if (findViewById22 != null) {
                        findViewById22.setVisibility(8);
                    }
                    View findViewById23 = _$_findCachedViewById6.findViewById(R.id.tvForYouTeleConsultationMatchingPromptSubHeader);
                    if (findViewById23 != null) {
                        findViewById23.setVisibility(8);
                    }
                    View findViewById24 = _$_findCachedViewById6.findViewById(R.id.tvForYouTeleConsultationMatchingPromptCta);
                    if (findViewById24 != null) {
                        findViewById24.setVisibility(8);
                    }
                }
                HorizontalScrollView horizontalScrollView2 = (HorizontalScrollView) dVar._$_findCachedViewById(R.id.hsvFilterContainer);
                if (horizontalScrollView2 != null) {
                    horizontalScrollView2.setVisibility(0);
                }
                RecyclerView recyclerView3 = (RecyclerView) dVar._$_findCachedViewById(R.id.llSessionsContainer);
                if (recyclerView3 != null) {
                    recyclerView3.setVisibility(0);
                }
                RobertoTextView robertoTextView5 = (RobertoTextView) dVar._$_findCachedViewById(R.id.tvBookASessionTitle);
                if (robertoTextView5 != null) {
                    robertoTextView5.setText("Upcoming Sessions");
                }
                ConstraintLayout constraintLayout2 = (ConstraintLayout) dVar._$_findCachedViewById(R.id.clProviderInfoContainer);
                if (constraintLayout2 != null) {
                    constraintLayout2.setVisibility(0);
                }
                RobertoTextView robertoTextView6 = (RobertoTextView) dVar._$_findCachedViewById(R.id.tvToolsTitle);
                if (robertoTextView6 != null) {
                    robertoTextView6.setVisibility(0);
                }
                RecyclerView recyclerView4 = (RecyclerView) dVar._$_findCachedViewById(R.id.rvtools);
                if (recyclerView4 != null) {
                    recyclerView4.setVisibility(0);
                }
                RobertoTextView robertoTextView7 = (RobertoTextView) dVar._$_findCachedViewById(R.id.tvProviderInfoHeader);
                if (robertoTextView7 != null) {
                    robertoTextView7.setVisibility(0);
                }
                zl.o oVar4 = dVar.f33235v;
                if (oVar4 != null) {
                    therapistPackagesModel2 = null;
                    ta.v.H(kc.f.H(oVar4), null, 0, new zl.e(oVar4, null), 3);
                } else {
                    therapistPackagesModel2 = null;
                }
                if (dVar.G) {
                    dVar.k0();
                    try {
                        ChipGroup chipGroup = (ChipGroup) dVar._$_findCachedViewById(R.id.cgFilter);
                        if (chipGroup != null) {
                            chipGroup.setOnCheckedStateChangeListener(new fq.s(dVar, 0));
                        }
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(str, e10);
                    }
                    dVar.G = false;
                } else if (dVar.I) {
                    zl.o oVar5 = dVar.f33235v;
                    if (oVar5 != null && (wVar = oVar5.f39567z) != null && (d10 = wVar.d()) != null && (peekContent = d10.peekContent()) != null) {
                        therapistPackagesModel3 = peekContent.f19465v;
                    } else {
                        therapistPackagesModel3 = therapistPackagesModel2;
                    }
                    if (therapistPackagesModel3 != null) {
                        dVar.j0();
                        dVar.I = false;
                    }
                }
                ul.a aVar2 = dVar.f33234u;
                if (aVar2 != null) {
                    aVar2.j(true);
                }
            }
            ConstraintLayout constraintLayout3 = (ConstraintLayout) dVar._$_findCachedViewById(R.id.clExpertCareLoadingState);
            if (constraintLayout3 != null) {
                constraintLayout3.setVisibility(8);
            }
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str, e11);
        }
    }

    public static String X(d dVar, zl.b bVar, zl.a aVar, int i6) {
        int i10;
        if ((i6 & 1) != 0) {
            bVar = null;
        }
        if ((i6 & 2) != 0) {
            aVar = null;
        }
        String str = "";
        try {
            if (is.k.Q1(bVar, new zl.b[]{zl.b.UPCOMING_COUPLES, zl.b.UPCOMING_IMMEDIATE_COUPLES})) {
                str = "couples";
            } else if (is.k.Q1(bVar, new zl.b[]{zl.b.SUGGESTED_THERAPY, zl.b.UPCOMING_THERAPY, zl.b.UPCOMING_IMMEDIATE_THERAPY})) {
                str = "therapy";
            } else if (is.k.Q1(bVar, new zl.b[]{zl.b.SUGGESTED_PSYCHIATRY, zl.b.UPCOMING_PSYCHIATRY, zl.b.UPCOMING_IMMEDIATE_PSYCHIATRY})) {
                str = "psychiatry";
            }
            if (aVar == null) {
                i10 = -1;
            } else {
                i10 = a.f33240a[aVar.ordinal()];
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(dVar.L, e10);
        }
        if (i10 == 2) {
            return "couples";
        }
        if (i10 == 3) {
            return "therapy";
        }
        if (i10 == 4) {
            return "psychiatry";
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x015f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0217 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static hs.f Y(d dVar, zl.b bVar, zl.a aVar, int i6) {
        zl.b bVar2;
        zl.a aVar2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        TherapistPackagesModel therapistPackagesModel;
        String Z;
        String str8;
        String str9;
        String str10;
        androidx.lifecycle.w<SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>>> wVar;
        SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>> d10;
        hs.f<TherapistPackagesModel, TherapistPackagesModel> peekContent;
        TherapistPackagesModel therapistPackagesModel2;
        androidx.lifecycle.w<SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>>> wVar2;
        SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>> d11;
        hs.f<TherapistPackagesModel, TherapistPackagesModel> peekContent2;
        String str11;
        String str12;
        int i10;
        TherapistPackagesModel therapistPackagesModel3;
        androidx.lifecycle.w<SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>>> wVar3;
        SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>> d12;
        hs.f<TherapistPackagesModel, TherapistPackagesModel> peekContent3;
        TherapistPackagesModel therapistPackagesModel4;
        androidx.lifecycle.w<SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>>> wVar4;
        SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>> d13;
        hs.f<TherapistPackagesModel, TherapistPackagesModel> peekContent4;
        TherapistPackagesModel therapistPackagesModel5;
        androidx.lifecycle.w<SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>>> wVar5;
        SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>> d14;
        hs.f<TherapistPackagesModel, TherapistPackagesModel> peekContent5;
        TherapistPackagesModel therapistPackagesModel6;
        androidx.lifecycle.w<SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>>> wVar6;
        SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>> d15;
        hs.f<TherapistPackagesModel, TherapistPackagesModel> peekContent6;
        TherapistPackagesModel therapistPackagesModel7;
        androidx.lifecycle.w<SingleUseEvent<TherapistPackagesModel>> wVar7;
        SingleUseEvent<TherapistPackagesModel> d16;
        TherapistPackagesModel peekContent7;
        androidx.lifecycle.w<SingleUseEvent<TherapistPackagesModel>> wVar8;
        SingleUseEvent<TherapistPackagesModel> d17;
        TherapistPackagesModel therapistPackagesModel8;
        androidx.lifecycle.w<SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>>> wVar9;
        SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>> d18;
        hs.f<TherapistPackagesModel, TherapistPackagesModel> peekContent8;
        TherapistPackagesModel therapistPackagesModel9;
        androidx.lifecycle.w<SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>>> wVar10;
        SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>> d19;
        hs.f<TherapistPackagesModel, TherapistPackagesModel> peekContent9;
        TherapistPackagesModel therapistPackagesModel10;
        androidx.lifecycle.w<SingleUseEvent<TherapistPackagesModel>> wVar11;
        SingleUseEvent<TherapistPackagesModel> d20;
        TherapistPackagesModel peekContent10;
        androidx.lifecycle.w<SingleUseEvent<TherapistPackagesModel>> wVar12;
        SingleUseEvent<TherapistPackagesModel> d21;
        String str13 = null;
        if ((i6 & 1) != 0) {
            bVar2 = null;
        } else {
            bVar2 = bVar;
        }
        if ((i6 & 2) != 0) {
            aVar2 = null;
        } else {
            aVar2 = aVar;
        }
        String str14 = "";
        try {
            str5 = "psychiatrist_uuid";
            str4 = "psychiatrist_name";
            str6 = "therapist_uuid";
            str3 = "couple_therapist_uuid";
        } catch (Exception e10) {
            e = e10;
            str = "";
            str2 = str;
            str3 = str2;
        }
        if (is.k.Q1(bVar2, new zl.b[]{zl.b.UPCOMING_COUPLES, zl.b.UPCOMING_IMMEDIATE_COUPLES})) {
            try {
                zl.o oVar = dVar.f33235v;
                if (oVar != null && (wVar2 = oVar.f39567z) != null && (d11 = wVar2.d()) != null && (peekContent2 = d11.peekContent()) != null) {
                    therapistPackagesModel = peekContent2.f19465v;
                } else {
                    therapistPackagesModel = null;
                }
                Z = Z(therapistPackagesModel);
            } catch (Exception e11) {
                e = e11;
                str7 = "";
                str3 = str7;
            }
            try {
                zl.o oVar2 = dVar.f33235v;
                if (oVar2 != null && (wVar = oVar2.f39567z) != null && (d10 = wVar.d()) != null && (peekContent = d10.peekContent()) != null && (therapistPackagesModel2 = peekContent.f19465v) != null) {
                    str8 = therapistPackagesModel2.getUuid();
                } else {
                    str8 = null;
                }
                if (str8 == null) {
                    str8 = "";
                }
                str9 = "couple_therapist_uuid";
                str10 = "couple_therapist_name";
            } catch (Exception e12) {
                e = e12;
                str7 = Z;
                str2 = str14;
                str = str7;
                str14 = "couple_therapist_name";
                LogHelper.INSTANCE.e(dVar.L, e);
                str4 = str14;
                str14 = str2;
                str5 = str3;
                return new hs.f(new hs.f(str4, str), new hs.f(str5, str14));
            }
        } else if (is.k.Q1(bVar2, new zl.b[]{zl.b.SUGGESTED_THERAPY, zl.b.UPCOMING_THERAPY, zl.b.UPCOMING_IMMEDIATE_THERAPY})) {
            try {
                zl.o oVar3 = dVar.f33235v;
                if (oVar3 != null && (wVar10 = oVar3.f39567z) != null && (d19 = wVar10.d()) != null && (peekContent9 = d19.peekContent()) != null) {
                    therapistPackagesModel8 = peekContent9.f19464u;
                } else {
                    therapistPackagesModel8 = null;
                }
                Z = Z(therapistPackagesModel8);
            } catch (Exception e13) {
                e = e13;
                str = "";
                str6 = str;
            }
            try {
                zl.o oVar4 = dVar.f33235v;
                if (oVar4 != null && (wVar9 = oVar4.f39567z) != null && (d18 = wVar9.d()) != null && (peekContent8 = d18.peekContent()) != null && (therapistPackagesModel9 = peekContent8.f19464u) != null) {
                    str8 = therapistPackagesModel9.getUuid();
                } else {
                    str8 = null;
                }
                if (str8 == null) {
                    str8 = "";
                }
                str9 = "therapist_uuid";
                str10 = "therapist_name";
            } catch (Exception e14) {
                e = e14;
                str = Z;
                str2 = str14;
                str3 = str6;
                str14 = "therapist_name";
                LogHelper.INSTANCE.e(dVar.L, e);
                str4 = str14;
                str14 = str2;
                str5 = str3;
                return new hs.f(new hs.f(str4, str), new hs.f(str5, str14));
            }
        } else if (!is.k.Q1(bVar2, new zl.b[]{zl.b.SUGGESTED_PSYCHIATRY, zl.b.UPCOMING_PSYCHIATRY, zl.b.UPCOMING_IMMEDIATE_PSYCHIATRY})) {
            str2 = "";
            str7 = str2;
            str12 = str7;
            str11 = str12;
            if (aVar2 != null) {
                i10 = -1;
            } else {
                try {
                    i10 = a.f33240a[aVar2.ordinal()];
                } catch (Exception e15) {
                    e = e15;
                    str = str7;
                    str3 = str12;
                    str14 = str11;
                    LogHelper.INSTANCE.e(dVar.L, e);
                    str4 = str14;
                    str14 = str2;
                    str5 = str3;
                    return new hs.f(new hs.f(str4, str), new hs.f(str5, str14));
                }
            }
            if (i10 == 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        str14 = str2;
                        str5 = str12;
                        str4 = str11;
                    } else {
                        try {
                            zl.o oVar5 = dVar.f33235v;
                            if (oVar5 != null && (wVar8 = oVar5.A) != null && (d17 = wVar8.d()) != null) {
                                therapistPackagesModel7 = d17.peekContent();
                            } else {
                                therapistPackagesModel7 = null;
                            }
                            str = Z(therapistPackagesModel7);
                        } catch (Exception e16) {
                            e = e16;
                            str14 = str2;
                            str = str7;
                            str5 = str12;
                        }
                        try {
                            zl.o oVar6 = dVar.f33235v;
                            if (oVar6 != null && (wVar7 = oVar6.A) != null && (d16 = wVar7.d()) != null && (peekContent7 = d16.peekContent()) != null) {
                                str13 = peekContent7.getUuid();
                            }
                            if (str13 != null) {
                                str14 = str13;
                            }
                        } catch (Exception e17) {
                            e = e17;
                            str14 = str2;
                            str2 = str14;
                            str3 = str5;
                            str14 = "psychiatrist_name";
                            LogHelper.INSTANCE.e(dVar.L, e);
                            str4 = str14;
                            str14 = str2;
                            str5 = str3;
                            return new hs.f(new hs.f(str4, str), new hs.f(str5, str14));
                        }
                    }
                } else {
                    try {
                        zl.o oVar7 = dVar.f33235v;
                        if (oVar7 != null && (wVar6 = oVar7.f39567z) != null && (d15 = wVar6.d()) != null && (peekContent6 = d15.peekContent()) != null) {
                            therapistPackagesModel5 = peekContent6.f19464u;
                        } else {
                            therapistPackagesModel5 = null;
                        }
                        str = Z(therapistPackagesModel5);
                    } catch (Exception e18) {
                        e = e18;
                        str14 = str2;
                        str = str7;
                        str6 = str12;
                    }
                    try {
                        zl.o oVar8 = dVar.f33235v;
                        if (oVar8 != null && (wVar5 = oVar8.f39567z) != null && (d14 = wVar5.d()) != null && (peekContent5 = d14.peekContent()) != null && (therapistPackagesModel6 = peekContent5.f19464u) != null) {
                            str13 = therapistPackagesModel6.getUuid();
                        }
                        if (str13 != null) {
                            str14 = str13;
                        }
                        str5 = "therapist_uuid";
                        str4 = "therapist_name";
                    } catch (Exception e19) {
                        e = e19;
                        str14 = str2;
                        str2 = str14;
                        str3 = str6;
                        str14 = "therapist_name";
                        LogHelper.INSTANCE.e(dVar.L, e);
                        str4 = str14;
                        str14 = str2;
                        str5 = str3;
                        return new hs.f(new hs.f(str4, str), new hs.f(str5, str14));
                    }
                }
                return new hs.f(new hs.f(str4, str), new hs.f(str5, str14));
            }
            try {
                zl.o oVar9 = dVar.f33235v;
                if (oVar9 != null && (wVar4 = oVar9.f39567z) != null && (d13 = wVar4.d()) != null && (peekContent4 = d13.peekContent()) != null) {
                    therapistPackagesModel3 = peekContent4.f19465v;
                } else {
                    therapistPackagesModel3 = null;
                }
                str7 = Z(therapistPackagesModel3);
            } catch (Exception e20) {
                e = e20;
                str14 = str2;
                str3 = str12;
            }
            try {
                zl.o oVar10 = dVar.f33235v;
                if (oVar10 != null && (wVar3 = oVar10.f39567z) != null && (d12 = wVar3.d()) != null && (peekContent3 = d12.peekContent()) != null && (therapistPackagesModel4 = peekContent3.f19465v) != null) {
                    str13 = therapistPackagesModel4.getUuid();
                }
                if (str13 != null) {
                    str14 = str13;
                }
                str5 = "couple_therapist_uuid";
                str4 = "couple_therapist_name";
            } catch (Exception e21) {
                e = e21;
                str14 = str2;
                str2 = str14;
                str = str7;
                str14 = "couple_therapist_name";
                LogHelper.INSTANCE.e(dVar.L, e);
                str4 = str14;
                str14 = str2;
                str5 = str3;
                return new hs.f(new hs.f(str4, str), new hs.f(str5, str14));
            }
            str = str7;
            return new hs.f(new hs.f(str4, str), new hs.f(str5, str14));
        } else {
            try {
                zl.o oVar11 = dVar.f33235v;
                if (oVar11 != null && (wVar12 = oVar11.A) != null && (d21 = wVar12.d()) != null) {
                    therapistPackagesModel10 = d21.peekContent();
                } else {
                    therapistPackagesModel10 = null;
                }
                Z = Z(therapistPackagesModel10);
                try {
                    zl.o oVar12 = dVar.f33235v;
                    if (oVar12 != null && (wVar11 = oVar12.A) != null && (d20 = wVar11.d()) != null && (peekContent10 = d20.peekContent()) != null) {
                        str8 = peekContent10.getUuid();
                    } else {
                        str8 = null;
                    }
                    if (str8 == null) {
                        str8 = "";
                    }
                    str9 = "psychiatrist_uuid";
                    str10 = "psychiatrist_name";
                } catch (Exception e22) {
                    e = e22;
                    str = Z;
                    str2 = str14;
                    str3 = str5;
                    str14 = "psychiatrist_name";
                    LogHelper.INSTANCE.e(dVar.L, e);
                    str4 = str14;
                    str14 = str2;
                    str5 = str3;
                    return new hs.f(new hs.f(str4, str), new hs.f(str5, str14));
                }
            } catch (Exception e23) {
                e = e23;
                str = "";
                str5 = str;
            }
        }
        str11 = str10;
        str12 = str9;
        str7 = Z;
        str2 = str8;
        if (aVar2 != null) {
        }
        if (i10 == 2) {
        }
        str = str7;
        return new hs.f(new hs.f(str4, str), new hs.f(str5, str14));
    }

    public static String Z(TherapistPackagesModel therapistPackagesModel) {
        String str;
        String str2 = "";
        StringBuilder sb2 = new StringBuilder("");
        String str3 = null;
        if (therapistPackagesModel != null) {
            str = therapistPackagesModel.getFirstname();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        sb2.append(str);
        sb2.append(' ');
        if (therapistPackagesModel != null) {
            str3 = therapistPackagesModel.getLastname();
        }
        if (str3 != null) {
            str2 = str3;
        }
        sb2.append(str2);
        return sb2.toString();
    }

    public final void M(int i6, boolean z10, String str, String str2) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        zl.a aVar = zl.a.PSYCHIATRY;
        zl.a aVar2 = zl.a.THERAPY;
        try {
            if (z10) {
                if (i6 != 0) {
                    int i15 = i6 - 1;
                    if (i15 != 0) {
                        if (i15 != 1) {
                            if (i15 == 2) {
                                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) _$_findCachedViewById(R.id.llBookACoupleTherapistSession);
                                if (linearLayoutCompat != null) {
                                    linearLayoutCompat.removeAllViews();
                                }
                                View inflate = requireActivity().getLayoutInflater().inflate(R.layout.layout_expert_not_booked_view, (ViewGroup) ((LinearLayoutCompat) _$_findCachedViewById(R.id.llBookACoupleTherapistSession)), false);
                                RobertoTextView robertoTextView = (RobertoTextView) inflate.findViewById(R.id.tvAddExpertTitle);
                                if (robertoTextView != null) {
                                    robertoTextView.setText(getString(R.string.expert_care_add_a_couples_therapist));
                                }
                                RobertoTextView robertoTextView2 = (RobertoTextView) inflate.findViewById(R.id.tvAddExpertSubTitle);
                                if (robertoTextView2 != null) {
                                    robertoTextView2.setText(getString(R.string.expert_care_do_not_have_couples_therapist));
                                }
                                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) _$_findCachedViewById(R.id.llBookACoupleTherapistSession);
                                if (linearLayoutCompat2 != null) {
                                    linearLayoutCompat2.setOnClickListener(new tl.b(this, 3));
                                }
                                LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) _$_findCachedViewById(R.id.llBookACoupleTherapistSession);
                                if (linearLayoutCompat3 != null) {
                                    linearLayoutCompat3.addView(inflate);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        LinearLayoutCompat linearLayoutCompat4 = (LinearLayoutCompat) _$_findCachedViewById(R.id.llBookAPsychiatristSession);
                        if (linearLayoutCompat4 != null) {
                            linearLayoutCompat4.removeAllViews();
                        }
                        LinearLayoutCompat linearLayoutCompat5 = (LinearLayoutCompat) _$_findCachedViewById(R.id.llBookAPsychiatristSession);
                        if (linearLayoutCompat5 != null) {
                            if (this.F == aVar) {
                                i14 = 0;
                            } else {
                                i14 = 8;
                            }
                            linearLayoutCompat5.setVisibility(i14);
                        }
                        View inflate2 = requireActivity().getLayoutInflater().inflate(R.layout.layout_expert_not_booked_view, (ViewGroup) ((LinearLayoutCompat) _$_findCachedViewById(R.id.llBookAPsychiatristSession)), false);
                        RobertoTextView robertoTextView3 = (RobertoTextView) inflate2.findViewById(R.id.tvAddExpertTitle);
                        if (robertoTextView3 != null) {
                            robertoTextView3.setText(getString(R.string.expert_care_add_a_psychiatrist));
                        }
                        RobertoTextView robertoTextView4 = (RobertoTextView) inflate2.findViewById(R.id.tvAddExpertSubTitle);
                        if (robertoTextView4 != null) {
                            robertoTextView4.setText(getString(R.string.expert_care_do_not_have_psychiatrist));
                        }
                        LinearLayoutCompat linearLayoutCompat6 = (LinearLayoutCompat) _$_findCachedViewById(R.id.llBookAPsychiatristSession);
                        if (linearLayoutCompat6 != null) {
                            linearLayoutCompat6.setOnClickListener(new tl.b(this, 2));
                        }
                        LinearLayoutCompat linearLayoutCompat7 = (LinearLayoutCompat) _$_findCachedViewById(R.id.llBookAPsychiatristSession);
                        if (linearLayoutCompat7 != null) {
                            linearLayoutCompat7.addView(inflate2);
                            return;
                        }
                        return;
                    }
                    LinearLayoutCompat linearLayoutCompat8 = (LinearLayoutCompat) _$_findCachedViewById(R.id.llBookATherapySession);
                    if (linearLayoutCompat8 != null) {
                        linearLayoutCompat8.removeAllViews();
                    }
                    LinearLayoutCompat linearLayoutCompat9 = (LinearLayoutCompat) _$_findCachedViewById(R.id.llBookATherapySession);
                    if (linearLayoutCompat9 != null) {
                        if (this.F == aVar2) {
                            i13 = 0;
                        } else {
                            i13 = 8;
                        }
                        linearLayoutCompat9.setVisibility(i13);
                    }
                    View inflate3 = requireActivity().getLayoutInflater().inflate(R.layout.layout_expert_not_booked_view, (ViewGroup) ((LinearLayoutCompat) _$_findCachedViewById(R.id.llBookATherapySession)), false);
                    RobertoTextView robertoTextView5 = (RobertoTextView) inflate3.findViewById(R.id.tvAddExpertTitle);
                    if (robertoTextView5 != null) {
                        robertoTextView5.setText(getString(R.string.expert_care_add_a_therapist));
                    }
                    RobertoTextView robertoTextView6 = (RobertoTextView) inflate3.findViewById(R.id.tvAddExpertSubTitle);
                    if (robertoTextView6 != null) {
                        robertoTextView6.setText(getString(R.string.expert_care_do_not_have_therapist));
                    }
                    LinearLayoutCompat linearLayoutCompat10 = (LinearLayoutCompat) _$_findCachedViewById(R.id.llBookATherapySession);
                    if (linearLayoutCompat10 != null) {
                        linearLayoutCompat10.setOnClickListener(new tl.b(this, 1));
                    }
                    LinearLayoutCompat linearLayoutCompat11 = (LinearLayoutCompat) _$_findCachedViewById(R.id.llBookATherapySession);
                    if (linearLayoutCompat11 != null) {
                        linearLayoutCompat11.addView(inflate3);
                        return;
                    }
                    return;
                }
                throw null;
            } else if (i6 != 0) {
                int i16 = i6 - 1;
                zl.a aVar3 = zl.a.ALL;
                if (i16 != 0) {
                    if (i16 != 1) {
                        if (i16 == 2) {
                            LinearLayoutCompat linearLayoutCompat12 = (LinearLayoutCompat) _$_findCachedViewById(R.id.llBookACoupleTherapistSession);
                            if (linearLayoutCompat12 != null) {
                                linearLayoutCompat12.removeAllViews();
                            }
                            LinearLayoutCompat linearLayoutCompat13 = (LinearLayoutCompat) _$_findCachedViewById(R.id.llBookACoupleTherapistSession);
                            if (linearLayoutCompat13 != null) {
                                if (is.k.Q1(this.F, new zl.a[]{aVar3, zl.a.COUPLES_THERAPY})) {
                                    i12 = 0;
                                } else {
                                    i12 = 8;
                                }
                                linearLayoutCompat13.setVisibility(i12);
                            }
                            View inflate4 = requireActivity().getLayoutInflater().inflate(R.layout.layout_expert_booked_view, (ViewGroup) ((LinearLayoutCompat) _$_findCachedViewById(R.id.llBookACoupleTherapistSession)), false);
                            Glide.i(requireActivity()).p("https:" + str2).B((ImageView) inflate4.findViewById(R.id.ivExpertImage));
                            RobertoTextView robertoTextView7 = (RobertoTextView) inflate4.findViewById(R.id.tvExpertType);
                            if (robertoTextView7 != null) {
                                robertoTextView7.setText(getString(R.string.expert_care_your_couple_therapist));
                            }
                            RobertoTextView robertoTextView8 = (RobertoTextView) inflate4.findViewById(R.id.tvExpertName);
                            if (robertoTextView8 != null) {
                                robertoTextView8.setText(str);
                            }
                            LinearLayoutCompat linearLayoutCompat14 = (LinearLayoutCompat) _$_findCachedViewById(R.id.llBookACoupleTherapistSession);
                            if (linearLayoutCompat14 != null) {
                                linearLayoutCompat14.setOnClickListener(new tl.b(this, 6));
                            }
                            LinearLayoutCompat linearLayoutCompat15 = (LinearLayoutCompat) _$_findCachedViewById(R.id.llBookACoupleTherapistSession);
                            if (linearLayoutCompat15 != null) {
                                linearLayoutCompat15.addView(inflate4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    LinearLayoutCompat linearLayoutCompat16 = (LinearLayoutCompat) _$_findCachedViewById(R.id.llBookAPsychiatristSession);
                    if (linearLayoutCompat16 != null) {
                        linearLayoutCompat16.removeAllViews();
                    }
                    LinearLayoutCompat linearLayoutCompat17 = (LinearLayoutCompat) _$_findCachedViewById(R.id.llBookAPsychiatristSession);
                    if (linearLayoutCompat17 != null) {
                        if (is.k.Q1(this.F, new zl.a[]{aVar3, aVar})) {
                            i11 = 0;
                        } else {
                            i11 = 8;
                        }
                        linearLayoutCompat17.setVisibility(i11);
                    }
                    View inflate5 = requireActivity().getLayoutInflater().inflate(R.layout.layout_expert_booked_view, (ViewGroup) ((LinearLayoutCompat) _$_findCachedViewById(R.id.llBookAPsychiatristSession)), false);
                    Glide.i(requireActivity()).p("https:" + str2).B((ImageView) inflate5.findViewById(R.id.ivExpertImage));
                    RobertoTextView robertoTextView9 = (RobertoTextView) inflate5.findViewById(R.id.tvExpertType);
                    if (robertoTextView9 != null) {
                        robertoTextView9.setText(getString(R.string.expert_care_your_psychiatrist));
                    }
                    RobertoTextView robertoTextView10 = (RobertoTextView) inflate5.findViewById(R.id.tvExpertName);
                    if (robertoTextView10 != null) {
                        robertoTextView10.setText(str);
                    }
                    LinearLayoutCompat linearLayoutCompat18 = (LinearLayoutCompat) _$_findCachedViewById(R.id.llBookAPsychiatristSession);
                    if (linearLayoutCompat18 != null) {
                        linearLayoutCompat18.setOnClickListener(new tl.b(this, 5));
                    }
                    LinearLayoutCompat linearLayoutCompat19 = (LinearLayoutCompat) _$_findCachedViewById(R.id.llBookAPsychiatristSession);
                    if (linearLayoutCompat19 != null) {
                        linearLayoutCompat19.addView(inflate5);
                        return;
                    }
                    return;
                }
                LinearLayoutCompat linearLayoutCompat20 = (LinearLayoutCompat) _$_findCachedViewById(R.id.llBookATherapySession);
                if (linearLayoutCompat20 != null) {
                    linearLayoutCompat20.removeAllViews();
                }
                LinearLayoutCompat linearLayoutCompat21 = (LinearLayoutCompat) _$_findCachedViewById(R.id.llBookATherapySession);
                if (linearLayoutCompat21 != null) {
                    if (is.k.Q1(this.F, new zl.a[]{aVar3, aVar2})) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    linearLayoutCompat21.setVisibility(i10);
                }
                View inflate6 = requireActivity().getLayoutInflater().inflate(R.layout.layout_expert_booked_view, (ViewGroup) ((LinearLayoutCompat) _$_findCachedViewById(R.id.llBookATherapySession)), false);
                Glide.i(requireActivity()).p("https:" + str2).B((ImageView) inflate6.findViewById(R.id.ivExpertImage));
                RobertoTextView robertoTextView11 = (RobertoTextView) inflate6.findViewById(R.id.tvExpertType);
                if (robertoTextView11 != null) {
                    robertoTextView11.setText(getString(R.string.expert_care_your_therapist));
                }
                RobertoTextView robertoTextView12 = (RobertoTextView) inflate6.findViewById(R.id.tvExpertName);
                if (robertoTextView12 != null) {
                    robertoTextView12.setText(str);
                }
                LinearLayoutCompat linearLayoutCompat22 = (LinearLayoutCompat) _$_findCachedViewById(R.id.llBookATherapySession);
                if (linearLayoutCompat22 != null) {
                    linearLayoutCompat22.setOnClickListener(new tl.b(this, 4));
                }
                LinearLayoutCompat linearLayoutCompat23 = (LinearLayoutCompat) _$_findCachedViewById(R.id.llBookATherapySession);
                if (linearLayoutCompat23 != null) {
                    linearLayoutCompat23.addView(inflate6);
                }
            } else {
                throw null;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.L, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x0287 A[Catch: Exception -> 0x0227, TryCatch #0 {Exception -> 0x0227, blocks: (B:4:0x001a, B:11:0x0039, B:14:0x0043, B:18:0x004f, B:22:0x005b, B:26:0x0067, B:30:0x0073, B:34:0x007f, B:36:0x0085, B:41:0x0095, B:43:0x009b, B:53:0x00c1, B:55:0x00fb, B:160:0x027a, B:162:0x0287, B:164:0x028d, B:166:0x0291, B:169:0x0297, B:171:0x029f, B:178:0x02b4, B:187:0x02c8, B:190:0x02ce, B:195:0x02ed, B:198:0x02f9, B:194:0x02e5, B:199:0x02fd, B:200:0x0303, B:182:0x02bd, B:186:0x02c5, B:177:0x02b1, B:54:0x00f4, B:46:0x00a3, B:47:0x00a7, B:49:0x00ad, B:40:0x0090, B:33:0x007c, B:29:0x0070, B:25:0x0064, B:21:0x0058, B:17:0x004c, B:56:0x00ff, B:59:0x0109, B:63:0x0115, B:67:0x0121, B:71:0x012d, B:75:0x0139, B:79:0x0145, B:81:0x014b, B:86:0x015b, B:88:0x0161, B:98:0x0186, B:100:0x01be, B:99:0x01b7, B:91:0x0169, B:92:0x016d, B:94:0x0173, B:85:0x0156, B:78:0x0142, B:74:0x0136, B:70:0x012a, B:66:0x011e, B:62:0x0112, B:101:0x01c2, B:104:0x01cb, B:108:0x01d7, B:112:0x01e3, B:116:0x01ef, B:120:0x01fb, B:124:0x0207, B:126:0x020d, B:131:0x021d, B:130:0x0218, B:123:0x0204, B:119:0x01f8, B:115:0x01ec, B:111:0x01e0, B:107:0x01d4, B:134:0x022a, B:138:0x0236, B:142:0x0242, B:159:0x0272, B:145:0x024b, B:147:0x024f, B:149:0x0253, B:151:0x025b, B:153:0x0263, B:158:0x026f, B:141:0x023f, B:137:0x0233, B:191:0x02d5), top: B:203:0x001a, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0291 A[Catch: Exception -> 0x0227, TryCatch #0 {Exception -> 0x0227, blocks: (B:4:0x001a, B:11:0x0039, B:14:0x0043, B:18:0x004f, B:22:0x005b, B:26:0x0067, B:30:0x0073, B:34:0x007f, B:36:0x0085, B:41:0x0095, B:43:0x009b, B:53:0x00c1, B:55:0x00fb, B:160:0x027a, B:162:0x0287, B:164:0x028d, B:166:0x0291, B:169:0x0297, B:171:0x029f, B:178:0x02b4, B:187:0x02c8, B:190:0x02ce, B:195:0x02ed, B:198:0x02f9, B:194:0x02e5, B:199:0x02fd, B:200:0x0303, B:182:0x02bd, B:186:0x02c5, B:177:0x02b1, B:54:0x00f4, B:46:0x00a3, B:47:0x00a7, B:49:0x00ad, B:40:0x0090, B:33:0x007c, B:29:0x0070, B:25:0x0064, B:21:0x0058, B:17:0x004c, B:56:0x00ff, B:59:0x0109, B:63:0x0115, B:67:0x0121, B:71:0x012d, B:75:0x0139, B:79:0x0145, B:81:0x014b, B:86:0x015b, B:88:0x0161, B:98:0x0186, B:100:0x01be, B:99:0x01b7, B:91:0x0169, B:92:0x016d, B:94:0x0173, B:85:0x0156, B:78:0x0142, B:74:0x0136, B:70:0x012a, B:66:0x011e, B:62:0x0112, B:101:0x01c2, B:104:0x01cb, B:108:0x01d7, B:112:0x01e3, B:116:0x01ef, B:120:0x01fb, B:124:0x0207, B:126:0x020d, B:131:0x021d, B:130:0x0218, B:123:0x0204, B:119:0x01f8, B:115:0x01ec, B:111:0x01e0, B:107:0x01d4, B:134:0x022a, B:138:0x0236, B:142:0x0242, B:159:0x0272, B:145:0x024b, B:147:0x024f, B:149:0x0253, B:151:0x025b, B:153:0x0263, B:158:0x026f, B:141:0x023f, B:137:0x0233, B:191:0x02d5), top: B:203:0x001a, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0297 A[Catch: Exception -> 0x0227, TryCatch #0 {Exception -> 0x0227, blocks: (B:4:0x001a, B:11:0x0039, B:14:0x0043, B:18:0x004f, B:22:0x005b, B:26:0x0067, B:30:0x0073, B:34:0x007f, B:36:0x0085, B:41:0x0095, B:43:0x009b, B:53:0x00c1, B:55:0x00fb, B:160:0x027a, B:162:0x0287, B:164:0x028d, B:166:0x0291, B:169:0x0297, B:171:0x029f, B:178:0x02b4, B:187:0x02c8, B:190:0x02ce, B:195:0x02ed, B:198:0x02f9, B:194:0x02e5, B:199:0x02fd, B:200:0x0303, B:182:0x02bd, B:186:0x02c5, B:177:0x02b1, B:54:0x00f4, B:46:0x00a3, B:47:0x00a7, B:49:0x00ad, B:40:0x0090, B:33:0x007c, B:29:0x0070, B:25:0x0064, B:21:0x0058, B:17:0x004c, B:56:0x00ff, B:59:0x0109, B:63:0x0115, B:67:0x0121, B:71:0x012d, B:75:0x0139, B:79:0x0145, B:81:0x014b, B:86:0x015b, B:88:0x0161, B:98:0x0186, B:100:0x01be, B:99:0x01b7, B:91:0x0169, B:92:0x016d, B:94:0x0173, B:85:0x0156, B:78:0x0142, B:74:0x0136, B:70:0x012a, B:66:0x011e, B:62:0x0112, B:101:0x01c2, B:104:0x01cb, B:108:0x01d7, B:112:0x01e3, B:116:0x01ef, B:120:0x01fb, B:124:0x0207, B:126:0x020d, B:131:0x021d, B:130:0x0218, B:123:0x0204, B:119:0x01f8, B:115:0x01ec, B:111:0x01e0, B:107:0x01d4, B:134:0x022a, B:138:0x0236, B:142:0x0242, B:159:0x0272, B:145:0x024b, B:147:0x024f, B:149:0x0253, B:151:0x025b, B:153:0x0263, B:158:0x026f, B:141:0x023f, B:137:0x0233, B:191:0x02d5), top: B:203:0x001a, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:210:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O(String str) {
        TextView textView;
        zl.a aVar;
        TextView textView2;
        boolean z10;
        TextView textView3;
        boolean z11;
        RecyclerView recyclerView;
        RecyclerView.e eVar;
        sl.a aVar2;
        int i6;
        RobertoTextView robertoTextView;
        int i10;
        View _$_findCachedViewById;
        int i11;
        sl.h hVar;
        int i12;
        TherapistPackagesModel therapistPackagesModel;
        int i13;
        androidx.lifecycle.w<SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>>> wVar;
        SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>> d10;
        hs.f<TherapistPackagesModel, TherapistPackagesModel> peekContent;
        zl.a aVar3 = zl.a.ALL;
        int i14 = 8;
        if (str != null) {
            try {
                int hashCode = str.hashCode();
                if (hashCode != -985399876) {
                    if (hashCode != -631572407) {
                        if (hashCode == -575806264 && str.equals("PSYCHIATRY")) {
                            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvProviderInfoHeader);
                            if (robertoTextView2 != null) {
                                robertoTextView2.setVisibility(0);
                            }
                            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.clProviderInfoContainer);
                            if (constraintLayout != null) {
                                constraintLayout.setVisibility(0);
                            }
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) _$_findCachedViewById(R.id.llBookATherapySession);
                            if (linearLayoutCompat != null) {
                                linearLayoutCompat.setVisibility(8);
                            }
                            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) _$_findCachedViewById(R.id.llBookAPsychiatristSession);
                            if (linearLayoutCompat2 != null) {
                                linearLayoutCompat2.setVisibility(0);
                            }
                            LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) _$_findCachedViewById(R.id.llBookACoupleTherapistSession);
                            if (linearLayoutCompat3 != null) {
                                linearLayoutCompat3.setVisibility(8);
                            }
                            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.nullStateContainer);
                            if (_$_findCachedViewById2 != null) {
                                textView3 = (TextView) _$_findCachedViewById2.findViewById(R.id.ivForYouTeleConsultationNullFooter);
                            } else {
                                textView3 = null;
                            }
                            if (textView3 != null) {
                                textView3.setText("You have no upcoming sessions with your psychiatrist.");
                            }
                            List<hs.f<Boolean, String>> list = this.K;
                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    if (!((Boolean) ((hs.f) it.next()).f19464u).booleanValue()) {
                                        z11 = true;
                                        break;
                                    }
                                }
                            }
                            z11 = false;
                            if (z11) {
                                _$_findCachedViewById(R.id.expertCareFeedbackContainer).setVisibility(0);
                                ((RobertoTextView) _$_findCachedViewById(R.id.expertCareFeedbackContainer).findViewById(R.id.tvTitle)).setText(getString(R.string.expert_tool_feedback, "psychiatrist"));
                                _$_findCachedViewById(R.id.expertCareFeedbackContainer).setOnClickListener(new tl.b(this, 9));
                            } else {
                                _$_findCachedViewById(R.id.expertCareFeedbackContainer).setVisibility(8);
                            }
                            aVar = zl.a.PSYCHIATRY;
                            this.F = aVar;
                            recyclerView = (RecyclerView) _$_findCachedViewById(R.id.llSessionsContainer);
                            if (recyclerView == null) {
                                eVar = recyclerView.getAdapter();
                            } else {
                                eVar = null;
                            }
                            if (!(eVar instanceof sl.a)) {
                                aVar2 = (sl.a) eVar;
                            } else {
                                aVar2 = null;
                            }
                            if (aVar2 == null) {
                                i6 = aVar2.z(this.F);
                            } else {
                                i6 = 0;
                            }
                            robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.ctaProviderAllSessions);
                            if (robertoTextView != null) {
                                if (i6 > 0) {
                                    i10 = 0;
                                } else {
                                    i10 = 8;
                                }
                                robertoTextView.setVisibility(i10);
                            }
                            _$_findCachedViewById = _$_findCachedViewById(R.id.nullStateContainer);
                            if (_$_findCachedViewById != null) {
                                if (i6 == 0 && this.F != aVar3) {
                                    i11 = 0;
                                } else {
                                    i11 = 8;
                                }
                                _$_findCachedViewById.setVisibility(i11);
                            }
                            hVar = this.f33237x;
                            if (hVar == null) {
                                if (hVar != null) {
                                    zl.a filter = this.F;
                                    kotlin.jvm.internal.i.g(filter, "filter");
                                    try {
                                        hVar.C = filter;
                                        hVar.v();
                                        hVar.i();
                                        i12 = hVar.D.size();
                                    } catch (Exception e10) {
                                        LogHelper.INSTANCE.e(hVar.E, e10);
                                        i12 = 0;
                                    }
                                    RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvToolsTitle);
                                    if (i12 > 0) {
                                        i14 = 0;
                                    }
                                    robertoTextView3.setVisibility(i14);
                                    return;
                                }
                                kotlin.jvm.internal.i.q("adapter");
                                throw null;
                            }
                            return;
                        }
                    } else if (str.equals("THERAPY")) {
                        RobertoTextView robertoTextView4 = (RobertoTextView) _$_findCachedViewById(R.id.tvProviderInfoHeader);
                        if (robertoTextView4 != null) {
                            robertoTextView4.setVisibility(0);
                        }
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(R.id.clProviderInfoContainer);
                        if (constraintLayout2 != null) {
                            constraintLayout2.setVisibility(0);
                        }
                        LinearLayoutCompat linearLayoutCompat4 = (LinearLayoutCompat) _$_findCachedViewById(R.id.llBookATherapySession);
                        if (linearLayoutCompat4 != null) {
                            linearLayoutCompat4.setVisibility(0);
                        }
                        LinearLayoutCompat linearLayoutCompat5 = (LinearLayoutCompat) _$_findCachedViewById(R.id.llBookAPsychiatristSession);
                        if (linearLayoutCompat5 != null) {
                            linearLayoutCompat5.setVisibility(8);
                        }
                        LinearLayoutCompat linearLayoutCompat6 = (LinearLayoutCompat) _$_findCachedViewById(R.id.llBookACoupleTherapistSession);
                        if (linearLayoutCompat6 != null) {
                            linearLayoutCompat6.setVisibility(8);
                        }
                        View _$_findCachedViewById3 = _$_findCachedViewById(R.id.nullStateContainer);
                        if (_$_findCachedViewById3 != null) {
                            textView2 = (TextView) _$_findCachedViewById3.findViewById(R.id.ivForYouTeleConsultationNullFooter);
                        } else {
                            textView2 = null;
                        }
                        if (textView2 != null) {
                            textView2.setText("You have no upcoming sessions with your therapist.");
                        }
                        List<hs.f<Boolean, String>> list2 = this.K;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator<T> it2 = list2.iterator();
                            while (it2.hasNext()) {
                                if (((Boolean) ((hs.f) it2.next()).f19464u).booleanValue()) {
                                    z10 = true;
                                    break;
                                }
                            }
                        }
                        z10 = false;
                        if (z10) {
                            _$_findCachedViewById(R.id.expertCareFeedbackContainer).setVisibility(0);
                            _$_findCachedViewById(R.id.expertCareFeedbackContainer).setOnClickListener(new tl.b(this, 8));
                            ((RobertoTextView) _$_findCachedViewById(R.id.expertCareFeedbackContainer).findViewById(R.id.tvTitle)).setText(getString(R.string.expert_tool_feedback, "therapy"));
                        } else {
                            _$_findCachedViewById(R.id.expertCareFeedbackContainer).setVisibility(8);
                        }
                        aVar = zl.a.THERAPY;
                        this.F = aVar;
                        recyclerView = (RecyclerView) _$_findCachedViewById(R.id.llSessionsContainer);
                        if (recyclerView == null) {
                        }
                        if (!(eVar instanceof sl.a)) {
                        }
                        if (aVar2 == null) {
                        }
                        robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.ctaProviderAllSessions);
                        if (robertoTextView != null) {
                        }
                        _$_findCachedViewById = _$_findCachedViewById(R.id.nullStateContainer);
                        if (_$_findCachedViewById != null) {
                        }
                        hVar = this.f33237x;
                        if (hVar == null) {
                        }
                    }
                } else if (str.equals("COUPLES THERAPY")) {
                    RobertoTextView robertoTextView5 = (RobertoTextView) _$_findCachedViewById(R.id.tvProviderInfoHeader);
                    if (robertoTextView5 != null) {
                        robertoTextView5.setVisibility(0);
                    }
                    ConstraintLayout constraintLayout3 = (ConstraintLayout) _$_findCachedViewById(R.id.clProviderInfoContainer);
                    if (constraintLayout3 != null) {
                        constraintLayout3.setVisibility(0);
                    }
                    LinearLayoutCompat linearLayoutCompat7 = (LinearLayoutCompat) _$_findCachedViewById(R.id.llBookATherapySession);
                    if (linearLayoutCompat7 != null) {
                        linearLayoutCompat7.setVisibility(8);
                    }
                    LinearLayoutCompat linearLayoutCompat8 = (LinearLayoutCompat) _$_findCachedViewById(R.id.llBookAPsychiatristSession);
                    if (linearLayoutCompat8 != null) {
                        linearLayoutCompat8.setVisibility(8);
                    }
                    LinearLayoutCompat linearLayoutCompat9 = (LinearLayoutCompat) _$_findCachedViewById(R.id.llBookACoupleTherapistSession);
                    if (linearLayoutCompat9 != null) {
                        linearLayoutCompat9.setVisibility(0);
                    }
                    View _$_findCachedViewById4 = _$_findCachedViewById(R.id.nullStateContainer);
                    if (_$_findCachedViewById4 != null) {
                        textView = (TextView) _$_findCachedViewById4.findViewById(R.id.ivForYouTeleConsultationNullFooter);
                    } else {
                        textView = null;
                    }
                    if (textView != null) {
                        textView.setText("You have no upcoming sessions with your couples therapist.");
                    }
                    _$_findCachedViewById(R.id.expertCareFeedbackContainer).setVisibility(8);
                    aVar = zl.a.COUPLES_THERAPY;
                    this.F = aVar;
                    recyclerView = (RecyclerView) _$_findCachedViewById(R.id.llSessionsContainer);
                    if (recyclerView == null) {
                    }
                    if (!(eVar instanceof sl.a)) {
                    }
                    if (aVar2 == null) {
                    }
                    robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.ctaProviderAllSessions);
                    if (robertoTextView != null) {
                    }
                    _$_findCachedViewById = _$_findCachedViewById(R.id.nullStateContainer);
                    if (_$_findCachedViewById != null) {
                    }
                    hVar = this.f33237x;
                    if (hVar == null) {
                    }
                }
            } catch (Exception e11) {
                LogHelper.INSTANCE.e(this.L, e11);
                return;
            }
            LogHelper.INSTANCE.e(this.L, e11);
            return;
        }
        LinearLayoutCompat linearLayoutCompat10 = (LinearLayoutCompat) _$_findCachedViewById(R.id.llBookATherapySession);
        if (linearLayoutCompat10 != null) {
            linearLayoutCompat10.setVisibility(0);
        }
        LinearLayoutCompat linearLayoutCompat11 = (LinearLayoutCompat) _$_findCachedViewById(R.id.llBookAPsychiatristSession);
        if (linearLayoutCompat11 != null) {
            linearLayoutCompat11.setVisibility(0);
        }
        LinearLayoutCompat linearLayoutCompat12 = (LinearLayoutCompat) _$_findCachedViewById(R.id.llBookACoupleTherapistSession);
        if (linearLayoutCompat12 != null) {
            zl.o oVar = this.f33235v;
            if (oVar != null && (wVar = oVar.f39567z) != null && (d10 = wVar.d()) != null && (peekContent = d10.peekContent()) != null) {
                therapistPackagesModel = peekContent.f19465v;
            } else {
                therapistPackagesModel = null;
            }
            if (therapistPackagesModel != null) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            linearLayoutCompat12.setVisibility(i13);
        }
        _$_findCachedViewById(R.id.expertCareFeedbackContainer).setVisibility(8);
        aVar = aVar3;
        this.F = aVar;
        recyclerView = (RecyclerView) _$_findCachedViewById(R.id.llSessionsContainer);
        if (recyclerView == null) {
        }
        if (!(eVar instanceof sl.a)) {
        }
        if (aVar2 == null) {
        }
        robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.ctaProviderAllSessions);
        if (robertoTextView != null) {
        }
        _$_findCachedViewById = _$_findCachedViewById(R.id.nullStateContainer);
        if (_$_findCachedViewById != null) {
        }
        hVar = this.f33237x;
        if (hVar == null) {
        }
    }

    public final void P() {
        zl.o oVar = this.f33235v;
        if (oVar != null) {
            oVar.Q.e(getViewLifecycleOwner(), new hl.p(28, new b()));
            ta.v.H(kc.f.H(oVar), null, 0, new zl.i(oVar, null), 3);
        }
    }

    public final void Q() {
        try {
            zl.o oVar = this.f33235v;
            if (oVar != null) {
                ta.v.H(kc.f.H(oVar), null, 0, new zl.h(oVar, null), 3);
                oVar.f39567z.e(requireActivity(), new hl.p(24, new c(oVar, this)));
                oVar.A.e(requireActivity(), new hl.p(25, new C0550d(oVar, this)));
                oVar.J.e(getViewLifecycleOwner(), new hl.p(26, new e()));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.L, e10);
        }
    }

    public final void S() {
        try {
            if (this.H) {
                this.H = false;
                zl.o oVar = this.f33235v;
                if (oVar != null) {
                    oVar.B.e(requireActivity(), new hl.p(27, new f()));
                }
            }
            zl.o oVar2 = this.f33235v;
            if (oVar2 != null) {
                ta.v.H(kc.f.H(oVar2), null, 0, new zl.m(oVar2, null), 3);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.L, e10);
        }
    }

    public final String U() {
        int ordinal = this.F.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    return "app_homescreen_all";
                }
                return "app_homescreen_couples";
            }
            return "app_homescreen_psychiatry";
        }
        return "app_homescreen_therapy";
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.Q;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(i6)) != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    public final void a0() {
        try {
            if (Utils.INSTANCE.checkConnectivity(requireActivity())) {
                this.M.a(new Intent(requireActivity(), TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.FLOW_THERAPY_COUPLES).putExtra("override_source_value", U()));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.L, e10);
        }
    }

    public final void b0() {
        try {
            if (Utils.INSTANCE.checkConnectivity(requireActivity())) {
                this.M.a(new Intent(getContext(), TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.PSYCHIATRIST_LISTING).putExtra("override_source_value", U()));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.L, e10);
        }
    }

    public final void c0() {
        try {
            if (Utils.INSTANCE.checkConnectivity(requireActivity())) {
                this.M.a(new Intent(requireActivity(), TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.FLOW_PSYCHIATRY).putExtra("override_source_value", U()));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.L, e10);
        }
    }

    public final void g0() {
        try {
            if (Utils.INSTANCE.checkConnectivity(requireActivity())) {
                this.M.a(new Intent(getContext(), TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.THERAPIST_LISTING).putExtra("override_source_value", U()));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.L, e10);
        }
    }

    public final void h0() {
        try {
            if (Utils.INSTANCE.checkConnectivity(requireActivity())) {
                this.M.a(new Intent(requireActivity(), TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.FLOW_THERAPY).putExtra("override_source_value", U()));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.L, e10);
        }
    }

    public final void j0() {
        try {
            int i6 = bn.a.f4534a;
            Context requireContext = requireContext();
            kotlin.jvm.internal.i.f(requireContext, "requireContext()");
            ChipGroup cgFilter = (ChipGroup) _$_findCachedViewById(R.id.cgFilter);
            kotlin.jvm.internal.i.f(cgFilter, "cgFilter");
            Chip c10 = bn.a.c(requireContext, cgFilter, "COUPLES THERAPY");
            if (c10 != null) {
                WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                c10.setId(d0.e.a());
            } else {
                c10 = null;
            }
            ((ChipGroup) _$_findCachedViewById(R.id.cgFilter)).addView(c10);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.L, e10);
        }
    }

    public final void k0() {
        TherapistPackagesModel therapistPackagesModel;
        List<String> P0;
        boolean z10;
        androidx.lifecycle.w<SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>>> wVar;
        SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>> d10;
        hs.f<TherapistPackagesModel, TherapistPackagesModel> peekContent;
        try {
            zl.o oVar = this.f33235v;
            if (oVar != null && (wVar = oVar.f39567z) != null && (d10 = wVar.d()) != null && (peekContent = d10.peekContent()) != null) {
                therapistPackagesModel = peekContent.f19465v;
            } else {
                therapistPackagesModel = null;
            }
            if (therapistPackagesModel != null) {
                P0 = ca.a.P0("ALL", "THERAPY", "PSYCHIATRY", "COUPLES THERAPY");
            } else {
                P0 = ca.a.P0("ALL", "THERAPY", "PSYCHIATRY");
            }
            if (P0.size() < 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.I = z10;
            for (String str : P0) {
                int i6 = bn.a.f4534a;
                Context requireContext = requireContext();
                kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                ChipGroup cgFilter = (ChipGroup) _$_findCachedViewById(R.id.cgFilter);
                kotlin.jvm.internal.i.f(cgFilter, "cgFilter");
                Chip c10 = bn.a.c(requireContext, cgFilter, str);
                if (c10 != null) {
                    WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                    c10.setId(d0.e.a());
                } else {
                    c10 = null;
                }
                ((ChipGroup) _$_findCachedViewById(R.id.cgFilter)).addView(c10);
                if (kotlin.jvm.internal.i.b(str, "ALL")) {
                    if (c10 != null) {
                        c10.setChecked(true);
                    }
                    if (c10 != null) {
                        c10.setChipBackgroundColorResource(R.color.newTemplateDarkGrey);
                    }
                    if (c10 != null) {
                        c10.setChipStrokeColorResource(R.color.newTemplateDarkGrey);
                    }
                    if (c10 != null) {
                        c10.setTextColor(g0.a.b(requireActivity(), R.color.white));
                    }
                    this.C = c10;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.L, e10);
        }
    }

    public final void m0() {
        try {
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.clExpertCareLoadingState);
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
            }
            View _$_findCachedViewById = _$_findCachedViewById(R.id.nullStateContainer);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.setVisibility(8);
            }
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.llSessionsContainer);
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.ctaProviderAllSessions);
            if (robertoTextView != null) {
                robertoTextView.setVisibility(8);
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvProviderInfoHeader);
            if (robertoTextView2 != null) {
                robertoTextView2.setVisibility(8);
            }
            ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(R.id.clProviderInfoContainer);
            if (constraintLayout2 != null) {
                constraintLayout2.setVisibility(8);
            }
            RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvToolsTitle);
            if (robertoTextView3 != null) {
                robertoTextView3.setVisibility(8);
            }
            RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.rvtools);
            if (recyclerView2 != null) {
                recyclerView2.setVisibility(8);
            }
            this.D = false;
            this.E = false;
            zl.o oVar = this.f33235v;
            if (oVar != null) {
                ta.v.H(kc.f.H(oVar), null, 0, new zl.h(oVar, null), 3);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.L, e10);
        }
    }

    public final void n0(String str) {
        try {
            androidx.activity.result.c<Intent> cVar = this.P;
            Intent intent = new Intent(requireActivity(), TelecommunicationsPWAActivity.class);
            intent.putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.THERAPIST_PSYCHIATRIST_FEEDBACK);
            intent.putExtra(Constants.NOTIFICATION_URL, str);
            cVar.a(intent);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.L, e10);
        }
    }

    public final void o0(UpcomingBooking upcomingBooking, zl.b bVar) {
        WindowManager.LayoutParams layoutParams;
        String str;
        String str2;
        if (upcomingBooking != null) {
            try {
                Dialog dialog = UiUtils.Companion.getDialog(R.layout.dialog_offline_session_info, requireActivity());
                Window window = dialog.getWindow();
                String str3 = null;
                if (window != null) {
                    layoutParams = window.getAttributes();
                } else {
                    layoutParams = null;
                }
                if (layoutParams != null) {
                    layoutParams.windowAnimations = R.style.DialogGrowInAndSlideOut;
                }
                TextView textView = (TextView) dialog.findViewById(R.id.tvOfflineInfoName);
                if (textView != null) {
                    OfflineClinicDetail clinicDetails = upcomingBooking.getClinicDetails();
                    if (clinicDetails != null) {
                        str = clinicDetails.getName();
                    } else {
                        str = null;
                    }
                    textView.setText(str);
                }
                TextView textView2 = (TextView) dialog.findViewById(R.id.tvOfflineInfoAddress);
                if (textView2 != null) {
                    StringBuilder sb2 = new StringBuilder();
                    OfflineClinicDetail clinicDetails2 = upcomingBooking.getClinicDetails();
                    sb2.append((clinicDetails2 == null || (r4 = clinicDetails2.getAddressLine1()) == null) ? " " : " ");
                    OfflineClinicDetail clinicDetails3 = upcomingBooking.getClinicDetails();
                    if (clinicDetails3 != null) {
                        str2 = clinicDetails3.getAddressLine2();
                    } else {
                        str2 = null;
                    }
                    sb2.append(str2);
                    textView2.setText(sb2.toString());
                }
                TextView textView3 = (TextView) dialog.findViewById(R.id.tvOfflineInfoPhone);
                if (textView3 != null) {
                    OfflineClinicDetail clinicDetails4 = upcomingBooking.getClinicDetails();
                    if (clinicDetails4 != null) {
                        str3 = clinicDetails4.getMobileNumber();
                    }
                    textView3.setText(str3);
                }
                View findViewById = dialog.findViewById(R.id.ivOfflineInfoCta);
                if (findViewById != null) {
                    findViewById.setOnClickListener(new dk.t(22, upcomingBooking, this, bVar));
                }
                View findViewById2 = dialog.findViewById(R.id.ivOfflineClose);
                if (findViewById2 != null) {
                    findViewById2.setOnClickListener(new tk.q((Object) dialog, (Object) this, (Object) bVar, (Object) upcomingBooking, 4));
                }
                dialog.show();
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.L, e10);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        kotlin.jvm.internal.i.g(context, "context");
        super.onAttach(context);
        if (context instanceof ul.a) {
            this.f33234u = (ul.a) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_expert_care_dashboard, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.Q.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            this.f33235v = (zl.o) new androidx.lifecycle.o0(this, new ok.c(new rp.a(0))).a(zl.o.class);
            Q();
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.ctaProviderAllSessions);
            if (robertoTextView != null) {
                robertoTextView.setOnClickListener(new tl.b(this, 0));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.L, e10);
        }
    }
}
