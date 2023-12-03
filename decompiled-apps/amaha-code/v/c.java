package v;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.l;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.internal.measurement.o;
import com.google.android.gms.internal.p000firebaseauthapi.bc;
import com.google.android.gms.internal.p000firebaseauthapi.jf;
import com.google.android.gms.internal.p000firebaseauthapi.ke;
import com.google.android.gms.internal.p000firebaseauthapi.p2;
import com.google.android.gms.internal.p000firebaseauthapi.p3;
import com.google.android.gms.internal.p000firebaseauthapi.p5;
import com.google.android.gms.internal.p000firebaseauthapi.s5;
import com.google.android.gms.internal.p000firebaseauthapi.s7;
import com.google.android.gms.internal.p000firebaseauthapi.se;
import com.google.android.gms.internal.p000firebaseauthapi.t5;
import com.google.android.gms.internal.p000firebaseauthapi.t7;
import com.google.android.gms.internal.p000firebaseauthapi.u7;
import com.google.android.gms.internal.p000firebaseauthapi.w5;
import com.google.android.gms.internal.p000firebaseauthapi.wa;
import com.google.android.material.navigation.NavigationView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g.x;
import hh.g;
import ih.p;
import j7.k;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.interfaces.ECPublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import k9.f0;
import k9.x0;
import nd.z;
import p9.n;
import s1.s;
import t2.j;
/* compiled from: Cache.java */
/* loaded from: classes.dex */
public class c implements p3, se {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f34630u;

    /* renamed from: v  reason: collision with root package name */
    public Object f34631v;

    /* renamed from: w  reason: collision with root package name */
    public Object f34632w;

    /* renamed from: x  reason: collision with root package name */
    public Object f34633x;

    /* renamed from: y  reason: collision with root package name */
    public Object f34634y;

    public c(Context context, p sdkInstance) {
        this.f34630u = 14;
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        this.f34631v = context;
        this.f34632w = sdkInstance;
        Context context2 = (Context) this.f34631v;
        c9.d dVar = ((p) this.f34632w).f20102a;
        bi.p pVar = new bi.p(context2, (p) this.f34632w, dVar.f5132b ? "MOEInteractions" : kotlin.jvm.internal.i.n((String) dVar.f5133c, "MOEInteractions_"));
        this.f34633x = pVar;
        this.f34634y = new bi.c(pVar);
    }

    public static c d(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.activity_not_v4, (ViewGroup) null, false);
        DrawerLayout drawerLayout = (DrawerLayout) inflate;
        int i6 = R.id.notV4DbContentView;
        View w10 = hc.d.w(R.id.notV4DbContentView, inflate);
        if (w10 != null) {
            int i10 = R.id.clNPSBottomSheet;
            ConstraintLayout constraintLayout = (ConstraintLayout) hc.d.w(R.id.clNPSBottomSheet, w10);
            if (constraintLayout != null) {
                i10 = R.id.clNPSBottomSheetView1;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) hc.d.w(R.id.clNPSBottomSheetView1, w10);
                if (constraintLayout2 != null) {
                    i10 = R.id.clNPSBottomSheetView2;
                    ConstraintLayout constraintLayout3 = (ConstraintLayout) hc.d.w(R.id.clNPSBottomSheetView2, w10);
                    if (constraintLayout3 != null) {
                        i10 = R.id.cvNPSRatingImage;
                        if (((CardView) hc.d.w(R.id.cvNPSRatingImage, w10)) != null) {
                            i10 = R.id.etNPSBottomSheetFeedback;
                            RobertoEditText robertoEditText = (RobertoEditText) hc.d.w(R.id.etNPSBottomSheetFeedback, w10);
                            if (robertoEditText != null) {
                                i10 = R.id.flNotV4DashboardMain;
                                if (((FrameLayout) hc.d.w(R.id.flNotV4DashboardMain, w10)) != null) {
                                    i10 = R.id.ivNPSBottomSheetClose;
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) hc.d.w(R.id.ivNPSBottomSheetClose, w10);
                                    if (appCompatImageView != null) {
                                        i10 = R.id.ivNPSBottomSheetFeedbackClose;
                                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) hc.d.w(R.id.ivNPSBottomSheetFeedbackClose, w10);
                                        if (appCompatImageView2 != null) {
                                            i10 = R.id.ivNPSRatingImage;
                                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) hc.d.w(R.id.ivNPSRatingImage, w10);
                                            if (appCompatImageView3 != null) {
                                                i10 = R.id.ivNPSSeekSelector;
                                                AppCompatImageView appCompatImageView4 = (AppCompatImageView) hc.d.w(R.id.ivNPSSeekSelector, w10);
                                                if (appCompatImageView4 != null) {
                                                    i10 = R.id.rbNPSSubmit1;
                                                    RobertoButton robertoButton = (RobertoButton) hc.d.w(R.id.rbNPSSubmit1, w10);
                                                    if (robertoButton != null) {
                                                        i10 = R.id.rbNPSSubmit2;
                                                        RobertoButton robertoButton2 = (RobertoButton) hc.d.w(R.id.rbNPSSubmit2, w10);
                                                        if (robertoButton2 != null) {
                                                            i10 = R.id.sbNPSSelector;
                                                            AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) hc.d.w(R.id.sbNPSSelector, w10);
                                                            if (appCompatSeekBar != null) {
                                                                i10 = R.id.tvNPSBottomSheetFeedbackQuestion;
                                                                if (((RobertoTextView) hc.d.w(R.id.tvNPSBottomSheetFeedbackQuestion, w10)) != null) {
                                                                    i10 = R.id.tvNPSBottomSheetFeedbackQuestionSubtext;
                                                                    if (((RobertoTextView) hc.d.w(R.id.tvNPSBottomSheetFeedbackQuestionSubtext, w10)) != null) {
                                                                        i10 = R.id.tvNPSBottomSheetQuestion;
                                                                        if (((RobertoTextView) hc.d.w(R.id.tvNPSBottomSheetQuestion, w10)) != null) {
                                                                            i10 = R.id.tvNPSBottomSheetQuestionSubtext;
                                                                            if (((RobertoTextView) hc.d.w(R.id.tvNPSBottomSheetQuestionSubtext, w10)) != null) {
                                                                                i10 = R.id.tvNPSFooterPrompt;
                                                                                RobertoTextView robertoTextView = (RobertoTextView) hc.d.w(R.id.tvNPSFooterPrompt, w10);
                                                                                if (robertoTextView != null) {
                                                                                    i10 = R.id.tvNPSHighIndicator;
                                                                                    if (((RobertoTextView) hc.d.w(R.id.tvNPSHighIndicator, w10)) != null) {
                                                                                        i10 = R.id.tvNPSLowIndicator;
                                                                                        if (((RobertoTextView) hc.d.w(R.id.tvNPSLowIndicator, w10)) != null) {
                                                                                            i10 = R.id.tvNPSSeekLevel0;
                                                                                            RobertoTextView robertoTextView2 = (RobertoTextView) hc.d.w(R.id.tvNPSSeekLevel0, w10);
                                                                                            if (robertoTextView2 != null) {
                                                                                                i10 = R.id.tvNPSSeekLevel1;
                                                                                                RobertoTextView robertoTextView3 = (RobertoTextView) hc.d.w(R.id.tvNPSSeekLevel1, w10);
                                                                                                if (robertoTextView3 != null) {
                                                                                                    i10 = R.id.tvNPSSeekLevel10;
                                                                                                    RobertoTextView robertoTextView4 = (RobertoTextView) hc.d.w(R.id.tvNPSSeekLevel10, w10);
                                                                                                    if (robertoTextView4 != null) {
                                                                                                        i10 = R.id.tvNPSSeekLevel2;
                                                                                                        RobertoTextView robertoTextView5 = (RobertoTextView) hc.d.w(R.id.tvNPSSeekLevel2, w10);
                                                                                                        if (robertoTextView5 != null) {
                                                                                                            i10 = R.id.tvNPSSeekLevel3;
                                                                                                            RobertoTextView robertoTextView6 = (RobertoTextView) hc.d.w(R.id.tvNPSSeekLevel3, w10);
                                                                                                            if (robertoTextView6 != null) {
                                                                                                                i10 = R.id.tvNPSSeekLevel4;
                                                                                                                RobertoTextView robertoTextView7 = (RobertoTextView) hc.d.w(R.id.tvNPSSeekLevel4, w10);
                                                                                                                if (robertoTextView7 != null) {
                                                                                                                    i10 = R.id.tvNPSSeekLevel5;
                                                                                                                    RobertoTextView robertoTextView8 = (RobertoTextView) hc.d.w(R.id.tvNPSSeekLevel5, w10);
                                                                                                                    if (robertoTextView8 != null) {
                                                                                                                        i10 = R.id.tvNPSSeekLevel6;
                                                                                                                        RobertoTextView robertoTextView9 = (RobertoTextView) hc.d.w(R.id.tvNPSSeekLevel6, w10);
                                                                                                                        if (robertoTextView9 != null) {
                                                                                                                            i10 = R.id.tvNPSSeekLevel7;
                                                                                                                            RobertoTextView robertoTextView10 = (RobertoTextView) hc.d.w(R.id.tvNPSSeekLevel7, w10);
                                                                                                                            if (robertoTextView10 != null) {
                                                                                                                                i10 = R.id.tvNPSSeekLevel8;
                                                                                                                                RobertoTextView robertoTextView11 = (RobertoTextView) hc.d.w(R.id.tvNPSSeekLevel8, w10);
                                                                                                                                if (robertoTextView11 != null) {
                                                                                                                                    i10 = R.id.tvNPSSeekLevel9;
                                                                                                                                    RobertoTextView robertoTextView12 = (RobertoTextView) hc.d.w(R.id.tvNPSSeekLevel9, w10);
                                                                                                                                    if (robertoTextView12 != null) {
                                                                                                                                        i10 = R.id.viewDashboardBlanketForeground;
                                                                                                                                        View w11 = hc.d.w(R.id.viewDashboardBlanketForeground, w10);
                                                                                                                                        if (w11 != null) {
                                                                                                                                            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) w10;
                                                                                                                                            yp.c cVar = new yp.c(constraintLayout, constraintLayout2, constraintLayout3, robertoEditText, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, robertoButton, robertoButton2, appCompatSeekBar, robertoTextView, robertoTextView2, robertoTextView3, robertoTextView4, robertoTextView5, robertoTextView6, robertoTextView7, robertoTextView8, robertoTextView9, robertoTextView10, robertoTextView11, robertoTextView12, w11);
                                                                                                                                            i6 = R.id.notV4DbNavView;
                                                                                                                                            NavigationView navigationView = (NavigationView) hc.d.w(R.id.notV4DbNavView, inflate);
                                                                                                                                            if (navigationView != null) {
                                                                                                                                                return new c(drawerLayout, drawerLayout, cVar, navigationView, 16);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(w10.getResources().getResourceName(i10)));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
    }

    public final void a(ArrayList arrayList) {
        bi.c cVar = (bi.c) this.f34634y;
        cVar.getClass();
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                cVar.a("INAPP_V3", (ContentValues) it.next());
            }
        } catch (Exception e10) {
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, e10, new bi.a(cVar));
        }
    }

    public final int b(String str) {
        bi.c cVar = (bi.c) this.f34634y;
        cVar.getClass();
        try {
            return cVar.f4302a.getWritableDatabase().delete(str, null, null);
        } catch (Exception e10) {
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, e10, new bi.b(cVar));
            return -1;
        }
    }

    public final void c(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (!hashSet.contains(obj)) {
            hashSet.add(obj);
            ArrayList arrayList2 = (ArrayList) ((t.h) this.f34632w).getOrDefault(obj, null);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i6 = 0; i6 < size; i6++) {
                    c(arrayList2.get(i6), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.se
    public final void e(String str) {
        ((p2) this.f34633x).g(gd.i.a(str));
    }

    public final long f(String str, ContentValues contentValues) {
        return ((bi.c) this.f34634y).a(str, contentValues);
    }

    public final Cursor g(String str, p0.f fVar) {
        String str2;
        String[] strArr;
        String str3;
        bi.c cVar = (bi.c) this.f34634y;
        cVar.getClass();
        try {
            SQLiteDatabase readableDatabase = cVar.f4302a.getReadableDatabase();
            String[] strArr2 = (String[]) fVar.f;
            Object obj = fVar.f27835g;
            z zVar = (z) obj;
            if (zVar == null) {
                str2 = null;
            } else {
                str2 = (String) zVar.f26148b;
            }
            z zVar2 = (z) obj;
            if (zVar2 == null) {
                strArr = null;
            } else {
                strArr = (String[]) zVar2.f26149c;
            }
            String str4 = fVar.f27831b;
            String str5 = fVar.f27832c;
            String str6 = fVar.f27833d;
            int i6 = fVar.f27834e;
            if (i6 != -1) {
                str3 = String.valueOf(i6);
            } else {
                str3 = null;
            }
            return readableDatabase.query(str, strArr2, str2, strArr, str4, str5, str6, str3);
        } catch (Exception e10) {
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, e10, new bi.d(cVar));
            return null;
        }
    }

    public final c h() {
        return new c(this, (l) this.f34632w);
    }

    public final o i(o oVar) {
        return ((l) this.f34632w).z(this, oVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.se
    public final void j(ke keVar) {
        jf jfVar = (jf) keVar;
        k kVar = new k();
        String str = jfVar.f7923v;
        v9.o.e(str);
        kVar.f21732u = str;
        String str2 = (String) this.f34631v;
        Object obj = kVar.A;
        if (str2 == null) {
            ((com.google.android.gms.internal.p000firebaseauthapi.h) obj).f7868v.add("EMAIL");
        } else {
            kVar.f21734w = str2;
        }
        String str3 = (String) this.f34632w;
        if (str3 == null) {
            ((com.google.android.gms.internal.p000firebaseauthapi.h) obj).f7868v.add("PASSWORD");
        } else {
            kVar.f21735x = str3;
        }
        x.E((x) this.f34634y, kVar, (p2) this.f34633x, this, jfVar);
    }

    public final o k(com.google.android.gms.internal.measurement.e eVar) {
        o oVar = o.f8520d;
        Iterator C = eVar.C();
        while (C.hasNext()) {
            oVar = ((l) this.f34632w).z(this, eVar.v(((Integer) C.next()).intValue()));
            if (oVar instanceof com.google.android.gms.internal.measurement.g) {
                break;
            }
        }
        return oVar;
    }

    public final void l(n nVar) {
        ((List) this.f34634y).add(nVar);
    }

    public final o m(String str) {
        if (((Map) this.f34633x).containsKey(str)) {
            return (o) ((Map) this.f34633x).get(str);
        }
        c cVar = (c) this.f34631v;
        if (cVar != null) {
            return cVar.m(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }

    public final u7 n() {
        Integer num = (Integer) this.f34631v;
        if (num != null) {
            if (((Integer) this.f34632w) != null) {
                if (((s7) this.f34633x) != null) {
                    if (num.intValue() >= 16) {
                        int intValue = ((Integer) this.f34632w).intValue();
                        s7 s7Var = (s7) this.f34633x;
                        if (intValue >= 10) {
                            if (s7Var == s7.f8128b) {
                                if (intValue > 20) {
                                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(intValue)));
                                }
                            } else if (s7Var == s7.f8129c) {
                                if (intValue > 28) {
                                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(intValue)));
                                }
                            } else if (s7Var == s7.f8130d) {
                                if (intValue > 32) {
                                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(intValue)));
                                }
                            } else if (s7Var == s7.f8131e) {
                                if (intValue > 48) {
                                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(intValue)));
                                }
                            } else if (s7Var == s7.f) {
                                if (intValue > 64) {
                                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(intValue)));
                                }
                            } else {
                                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                            }
                            return new u7(((Integer) this.f34631v).intValue(), ((Integer) this.f34632w).intValue(), (t7) this.f34634y, (s7) this.f34633x);
                        }
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(intValue)));
                    }
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.f34631v));
                }
                throw new GeneralSecurityException("hash type is not set");
            }
            throw new GeneralSecurityException("tag size is not set");
        }
        throw new GeneralSecurityException("key size is not set");
    }

    public final void o(String str, o oVar) {
        if (((Map) this.f34634y).containsKey(str)) {
            return;
        }
        if (oVar == null) {
            ((Map) this.f34633x).remove(str);
        } else {
            ((Map) this.f34633x).put(str, oVar);
        }
    }

    public final void p(final long j10, String str) {
        final s sVar = (s) this.f34633x;
        if (sVar == null) {
            ((p9.b) this.f34631v).d("Attempt to send text message without a sink", new Object[0]);
            return;
        }
        String str2 = (String) this.f34632w;
        x0 x0Var = (x0) sVar.f31224v;
        if (x0Var != null) {
            f0 f0Var = (f0) x0Var;
            p9.a.d(str2);
            if (!TextUtils.isEmpty(str)) {
                if (str.length() <= 524288) {
                    p.a aVar = new p.a();
                    aVar.f7418a = new k9.z(f0Var, str2, str);
                    aVar.f7421d = 8405;
                    f0Var.b(1, aVar.a()).addOnFailureListener(new ya.e(sVar, j10) { // from class: m9.n

                        /* renamed from: a  reason: collision with root package name */
                        public final s1.s f25000a;

                        /* renamed from: b  reason: collision with root package name */
                        public final long f25001b;

                        {
                            this.f25000a = sVar;
                            this.f25001b = j10;
                        }

                        @Override // ya.e
                        public final void onFailure(Exception exc) {
                            int i6;
                            if (exc instanceof ApiException) {
                                i6 = ((ApiException) exc).f7291u.f7298v;
                            } else {
                                i6 = 13;
                            }
                            for (p9.n nVar : (List) ((g) this.f25000a.f31226x).f24986c.f34634y) {
                                nVar.d(i6, this.f25001b, null);
                            }
                        }
                    });
                    return;
                }
                f0.G.e("Message send failed. Message exceeds maximum size", new Object[0]);
                throw new IllegalArgumentException("Message exceeds maximum size524288");
            }
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        }
        throw new IllegalStateException("Device is not connected");
    }

    public final long q() {
        s sVar = (s) this.f34633x;
        if (sVar == null) {
            ((p9.b) this.f34631v).d("Attempt to generate requestId without a sink", new Object[0]);
            return 0L;
        }
        return ((AtomicLong) sVar.f31225w).getAndIncrement();
    }

    public final void r(String str, o oVar) {
        c cVar;
        if (!((Map) this.f34633x).containsKey(str) && (cVar = (c) this.f34631v) != null && cVar.s(str)) {
            ((c) this.f34631v).r(str, oVar);
        } else if (((Map) this.f34634y).containsKey(str)) {
        } else {
            if (oVar == null) {
                ((Map) this.f34633x).remove(str);
            } else {
                ((Map) this.f34633x).put(str, oVar);
            }
        }
    }

    public final boolean s(String str) {
        if (((Map) this.f34633x).containsKey(str)) {
            return true;
        }
        c cVar = (c) this.f34631v;
        if (cVar != null) {
            return cVar.s(str);
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(Context context, y2.b bVar, int i6) {
        this(context, bVar);
        this.f34630u = 3;
        kotlin.jvm.internal.i.g(context, "context");
    }

    public c(Context context, y2.b bVar, t2.g batteryChargingTracker, t2.a batteryNotLowTracker, t2.g networkStateTracker, t2.g storageNotLowTracker) {
        this.f34630u = 3;
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(batteryChargingTracker, "batteryChargingTracker");
        kotlin.jvm.internal.i.g(batteryNotLowTracker, "batteryNotLowTracker");
        kotlin.jvm.internal.i.g(networkStateTracker, "networkStateTracker");
        kotlin.jvm.internal.i.g(storageNotLowTracker, "storageNotLowTracker");
        this.f34631v = batteryChargingTracker;
        this.f34632w = batteryNotLowTracker;
        this.f34633x = networkStateTracker;
        this.f34634y = storageNotLowTracker;
    }

    public c(wa waVar, w5 w5Var, s5 s5Var, t5 t5Var) {
        this.f34630u = 7;
        this.f34631v = waVar;
        this.f34632w = w5Var;
        this.f34634y = s5Var;
        this.f34633x = t5Var;
    }

    public c(x xVar, String str, String str2, p2 p2Var) {
        this.f34630u = 10;
        this.f34634y = xVar;
        this.f34631v = str;
        this.f34632w = str2;
        this.f34633x = p2Var;
    }

    public c(ih.g devicePreferences, String batchId, String str, ArrayList integrations) {
        this.f34630u = 13;
        kotlin.jvm.internal.i.g(batchId, "batchId");
        kotlin.jvm.internal.i.g(devicePreferences, "devicePreferences");
        kotlin.jvm.internal.i.g(integrations, "integrations");
        this.f34631v = batchId;
        this.f34632w = str;
        this.f34633x = devicePreferences;
        this.f34634y = integrations;
    }

    public /* synthetic */ c(Object obj) {
        this.f34630u = 8;
        this.f34631v = null;
        this.f34632w = null;
        this.f34633x = null;
        this.f34634y = t7.f8154e;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, int i6) {
        this.f34630u = i6;
        this.f34631v = obj;
        this.f34632w = obj2;
        this.f34633x = obj3;
        this.f34634y = obj4;
    }

    public c(String str) {
        this.f34630u = 6;
        p9.a.d(str);
        this.f34632w = str;
        this.f34631v = new p9.b("MediaControlChannel");
        if (!TextUtils.isEmpty(null)) {
            p9.b bVar = (p9.b) this.f34631v;
            bVar.getClass();
            bVar.f28037c = TextUtils.isEmpty(null) ? null : String.format("[%s] ", null);
        }
        this.f34634y = Collections.synchronizedList(new ArrayList());
    }

    public c(ECPublicKey eCPublicKey, byte[] bArr, String str, p5 p5Var) {
        this.f34630u = 9;
        bc.d(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f34631v = new x(19, eCPublicKey);
        this.f34633x = bArr;
        this.f34632w = str;
        this.f34634y = p5Var;
    }

    public c(c cVar, l lVar) {
        this.f34630u = 11;
        this.f34633x = new HashMap();
        this.f34634y = new HashMap();
        this.f34631v = cVar;
        this.f34632w = lVar;
    }

    public c(int i6) {
        this.f34630u = i6;
        if (i6 == 1) {
            this.f34631v = new e(10, 1);
            this.f34632w = new t.h();
            this.f34633x = new ArrayList();
            this.f34634y = new HashSet();
        } else if (i6 != 2) {
            this.f34631v = new e(256, 0);
            this.f34632w = new e(256, 0);
            this.f34633x = new e(256, 0);
            this.f34634y = new i[32];
        } else {
            this.f34631v = new t.b();
            this.f34632w = new SparseArray();
            this.f34633x = new t.e();
            this.f34634y = new t.b();
        }
    }

    public c(Throwable th2, vd.b bVar) {
        this.f34630u = 12;
        this.f34631v = th2.getLocalizedMessage();
        this.f34632w = th2.getClass().getName();
        this.f34633x = bVar.a(th2.getStackTrace());
        Throwable cause = th2.getCause();
        this.f34634y = cause != null ? new c(cause, bVar) : null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(Context context, y2.b bVar) {
        this(context, bVar, r4, r5, r2, new t2.a(r0, bVar, 2));
        t2.g lVar;
        this.f34630u = 3;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.i.f(applicationContext, "context.applicationContext");
        t2.a aVar = new t2.a(applicationContext, bVar, 0);
        Context applicationContext2 = context.getApplicationContext();
        kotlin.jvm.internal.i.f(applicationContext2, "context.applicationContext");
        t2.a aVar2 = new t2.a(applicationContext2, bVar, 1);
        Context applicationContext3 = context.getApplicationContext();
        kotlin.jvm.internal.i.f(applicationContext3, "context.applicationContext");
        String str = t2.k.f32402a;
        if (Build.VERSION.SDK_INT >= 24) {
            lVar = new j(applicationContext3, bVar);
        } else {
            lVar = new t2.l(applicationContext3, bVar);
        }
        Context applicationContext4 = context.getApplicationContext();
        kotlin.jvm.internal.i.f(applicationContext4, "context.applicationContext");
    }
}
