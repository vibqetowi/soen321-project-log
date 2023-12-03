package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.RemoteException;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.l;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.measurement.z3;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import fd.x;
import gs.a;
import hc.d;
import hc.f;
import hc.h;
import java.util.List;
import re.b;
import s1.s;
import sc.e;
import ze.c;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.qd  reason: invalid package */
/* loaded from: classes.dex */
public final class qd implements se, a {
    public final Object A;
    public final Object B;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f8087u;

    /* renamed from: v  reason: collision with root package name */
    public final Object f8088v;

    /* renamed from: w  reason: collision with root package name */
    public final Object f8089w;

    /* renamed from: x  reason: collision with root package name */
    public final Object f8090x;

    /* renamed from: y  reason: collision with root package name */
    public final Object f8091y;

    /* renamed from: z  reason: collision with root package name */
    public final Object f8092z;

    public qd(p2 p2Var, se seVar, jf jfVar, x xVar, Boolean bool, String str, String str2) {
        this.f8087u = 0;
        this.f8088v = seVar;
        this.f8089w = str;
        this.f8090x = str2;
        this.f8091y = bool;
        this.f8092z = xVar;
        this.A = p2Var;
        this.B = jfVar;
    }

    public static qd b(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.activity_not_v4_recent, (ViewGroup) null, false);
        int i6 = R.id.ivNotV4RecentBack;
        AppCompatImageView appCompatImageView = (AppCompatImageView) d.w(R.id.ivNotV4RecentBack, inflate);
        if (appCompatImageView != null) {
            i6 = R.id.progressBarNotV4Recent;
            ProgressBar progressBar = (ProgressBar) d.w(R.id.progressBarNotV4Recent, inflate);
            if (progressBar != null) {
                i6 = R.id.rvNotV4RecentRecycler;
                RecyclerView recyclerView = (RecyclerView) d.w(R.id.rvNotV4RecentRecycler, inflate);
                if (recyclerView != null) {
                    i6 = R.id.tvNotV4RecentHeader;
                    RobertoTextView robertoTextView = (RobertoTextView) d.w(R.id.tvNotV4RecentHeader, inflate);
                    if (robertoTextView != null) {
                        i6 = R.id.viewNotV4RecentHeaderBackground;
                        View w10 = d.w(R.id.viewNotV4RecentHeaderBackground, inflate);
                        if (w10 != null) {
                            i6 = R.id.viewNotV4RecentHeaderBottom;
                            View w11 = d.w(R.id.viewNotV4RecentHeaderBottom, inflate);
                            if (w11 != null) {
                                return new qd((ConstraintLayout) inflate, appCompatImageView, progressBar, recyclerView, robertoTextView, w10, w11, 3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
    }

    public final ConstraintLayout a() {
        int i6 = this.f8087u;
        Object obj = this.f8088v;
        switch (i6) {
            case 3:
                return (ConstraintLayout) obj;
            case 4:
            default:
                return (ConstraintLayout) obj;
            case 5:
                return (ConstraintLayout) obj;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.se
    public final void e(String str) {
        ((se) this.f8088v).e(str);
    }

    @Override // gs.a
    public final Object get() {
        return new c((e) ((a) this.f8088v).get(), (b) ((a) this.f8089w).get(), (se.d) ((a) this.f8090x).get(), (b) ((a) this.f8091y).get(), (RemoteConfigManager) ((a) this.f8092z).get(), (bf.a) ((a) this.A).get(), (SessionManager) ((a) this.B).get());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.se
    public final void j(ke keVar) {
        List list;
        List list2 = ((cf) keVar).f7767u.f7866u;
        if (list2 != null && !list2.isEmpty()) {
            ef efVar = (ef) list2.get(0);
            e eVar = efVar.f7831z;
            if (eVar != null) {
                list = eVar.f7795u;
            } else {
                list = null;
            }
            if (list != null && !list.isEmpty()) {
                String str = (String) this.f8089w;
                boolean isEmpty = TextUtils.isEmpty(str);
                Object obj = this.f8090x;
                if (!isEmpty) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= list.size()) {
                            break;
                        } else if (((c) list.get(i6)).f7743x.equals(str)) {
                            ((c) list.get(i6)).f7744y = (String) obj;
                            break;
                        } else {
                            i6++;
                        }
                    }
                } else {
                    ((c) list.get(0)).f7744y = (String) obj;
                }
            }
            efVar.E = ((Boolean) this.f8091y).booleanValue();
            efVar.F = (x) this.f8092z;
            p2 p2Var = (p2) this.A;
            jf jfVar = (jf) this.B;
            p2Var.getClass();
            try {
                ((yd) p2Var.f8038v).b(jfVar, efVar);
                return;
            } catch (RemoteException e10) {
                ((y9.a) p2Var.f8039w).b("RemoteException when sending get token and account info user response", e10, new Object[0]);
                return;
            }
        }
        ((se) this.f8088v).e("No users.");
    }

    public /* synthetic */ qd(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i6) {
        this.f8087u = i6;
        this.f8088v = obj;
        this.f8089w = obj2;
        this.f8090x = obj3;
        this.f8091y = obj4;
        this.f8092z = obj5;
        this.A = obj6;
        this.B = obj7;
    }

    public /* synthetic */ qd(z3 z3Var) {
        this.f8087u = 1;
        this.f8088v = this;
        h hVar = new h(z3Var);
        this.f8089w = hVar;
        ic.c b10 = ic.b.b(new f(hVar, 2));
        this.f8090x = b10;
        ic.c b11 = ic.b.b(new l(hVar, 28, b10));
        this.f8091y = b11;
        ic.c b12 = ic.b.b(new f(hVar, 0));
        this.f8092z = b12;
        ic.c b13 = ic.b.b(new s(13, b11, b12, hVar));
        this.A = b13;
        this.B = ic.b.b(new f(b13, 1));
    }
}
