package mi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.moe.pushlibrary.activities.MoEActivity;
import com.moengage.core.internal.push.PushManager;
import com.moengage.core.internal.push.base.PushBaseHandler;
import com.moengage.widgets.MoERatingBar;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ActionHandler.kt */
/* loaded from: classes.dex */
public final class a extends df.b {
    public final Activity B;
    public final ih.p C;
    public final String D;

    /* compiled from: ActionHandler.kt */
    /* renamed from: mi.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class C0407a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f25073a;

        static {
            int[] iArr = new int[defpackage.b._values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            iArr[3] = 4;
            iArr[4] = 5;
            iArr[5] = 6;
            iArr[6] = 7;
            iArr[7] = 8;
            iArr[8] = 9;
            iArr[9] = 10;
            iArr[10] = 11;
            iArr[11] = 12;
            int[] iArr2 = new int[v.h.e(2).length];
            iArr2[0] = 1;
            iArr2[1] = 2;
            int[] iArr3 = new int[v.h.e(3).length];
            iArr3[0] = 1;
            iArr3[1] = 2;
            iArr3[2] = 3;
            int[] iArr4 = new int[v.h.e(1).length];
            iArr4[0] = 1;
            f25073a = iArr4;
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class a0 extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ bj.a f25075v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(bj.a aVar) {
            super(0);
            this.f25075v = aVar;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.D + " shareAction() : " + this.f25075v;
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" callAction() : Will try to trigger call intent", a.this.D);
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class b0 extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f25078v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(String str) {
            super(0);
            this.f25078v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.D + " shareAction() : Text empty, aborting. " + this.f25078v;
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f25080v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.f25080v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.D + " callAction() : Not a valid call action. " + this.f25080v;
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class c0 extends kotlin.jvm.internal.k implements ss.a<String> {
        public c0() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" smsAction() : will try to trigger sms intent", a.this.D);
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ bj.a f25083v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(bj.a aVar) {
            super(0);
            this.f25083v = aVar;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.D + " callAction() : " + this.f25083v;
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class d0 extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f25085v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(String str) {
            super(0);
            this.f25085v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.D + " smsAction() : Not a valid sms action. " + this.f25085v;
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f25087v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.f25087v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.D + " callAction() : Empty/Invalid number. " + this.f25087v;
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class e0 extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ bj.a f25089v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(bj.a aVar) {
            super(0);
            this.f25089v = aVar;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.D + " smsAction() : Sms Action: " + this.f25089v;
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.a<String> {
        public f() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" copyAction() : ", a.this.D);
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class f0 extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f25092v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(String str) {
            super(0);
            this.f25092v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.D + " smsAction() : Number or message is null, " + this.f25092v;
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class g extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f25094v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(0);
            this.f25094v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.D + " copyAction() : Not a valid copy action, " + this.f25094v;
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class g0 extends kotlin.jvm.internal.k implements ss.a<String> {
        public g0() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" trackAction() : ", a.this.D);
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class h extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ bj.a f25097v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(bj.a aVar) {
            super(0);
            this.f25097v = aVar;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.D + " copyAction() : " + this.f25097v;
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class h0 extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f25099v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(String str) {
            super(0);
            this.f25099v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.D + " trackAction() : Not a valid track action. " + this.f25099v;
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class i extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f25101v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str) {
            super(0);
            this.f25101v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.D + " copyAction() : Text to copy is blank, aborting " + this.f25101v;
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class i0 extends kotlin.jvm.internal.k implements ss.a<String> {
        public i0() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" trackEvent() : ", a.this.D);
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class j extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ pi.d f25104v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(pi.d dVar) {
            super(0);
            this.f25104v = dVar;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.D + " customAction() : Not a custom Action, " + this.f25104v.b();
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class j0 extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f25106v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(String str) {
            super(0);
            this.f25106v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.D + " trackEvent() : Event name is blank, cannot track. " + this.f25106v;
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class k extends kotlin.jvm.internal.k implements ss.a<String> {
        public k() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" navigateAction() : ", a.this.D);
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class l extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ pi.d f25109v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(pi.d dVar) {
            super(0);
            this.f25109v = dVar;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.D + " navigateAction() : Not a navigation action, " + this.f25109v.b();
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class m extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ bj.a f25111v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(bj.a aVar) {
            super(0);
            this.f25111v = aVar;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.D + " navigateAction() : " + this.f25111v;
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class n extends kotlin.jvm.internal.k implements ss.a<String> {
        public n() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" navigateAction() : Navigation handled by client.", a.this.D);
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class o extends kotlin.jvm.internal.k implements ss.a<String> {
        public o() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" navigateAction() : Web View Disabled.", a.this.D);
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class p extends kotlin.jvm.internal.k implements ss.a<String> {
        public p() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" navigateToNotificationSettingsAction() : ", a.this.D);
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class q extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ pi.d f25116v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(pi.d dVar) {
            super(0);
            this.f25116v = dVar;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.D + " navigateToNotificationSettingsAction() : Not a NavigateToSettingsAction, " + this.f25116v.b();
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class r extends kotlin.jvm.internal.k implements ss.a<String> {
        public r() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" navigateToNotificationSettingsAction() : ", a.this.D);
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class s extends kotlin.jvm.internal.k implements ss.a<String> {
        public s() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" requestNotificationPermissionAction() : ", a.this.D);
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class t extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ pi.d f25120v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(pi.d dVar) {
            super(0);
            this.f25120v = dVar;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.D + " requestNotificationPermissionAction() : Not a RequestNotificationAction, " + this.f25120v.b();
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class u extends kotlin.jvm.internal.k implements ss.a<String> {
        public u() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" requestNotificationPermissionAction() : Request Notification handled by client.", a.this.D);
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class v extends kotlin.jvm.internal.k implements ss.a<String> {
        public v() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" requestNotificationPermissionAction() : SDK version is < 33, redirecting to Notification Settings page.", a.this.D);
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class w extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ int f25124v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(int i6) {
            super(0);
            this.f25124v = i6;
        }

        @Override // ss.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.this.D);
            sb2.append(" requestNotificationPermissionAction() : requestCount:  ");
            return pl.a.g(sb2, this.f25124v, " >= 2, redirecting user to Notification Settings page.");
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class x extends kotlin.jvm.internal.k implements ss.a<String> {
        public x() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" requestNotificationPermissionAction() : ", a.this.D);
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class y extends kotlin.jvm.internal.k implements ss.a<String> {
        public y() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" shareAction() : Will try to share text", a.this.D);
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class z extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f25128v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(String str) {
            super(0);
            this.f25128v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.D + " shareAction() : Not a valid share action. " + this.f25128v;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Activity context, ih.p sdkInstance) {
        super(22);
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        this.B = context;
        this.C = sdkInstance;
        this.D = "InApp_6.5.0_ActionHandler";
    }

    public final void E(bj.a aVar, String str) {
        ih.p pVar = this.C;
        hh.g.b(pVar.f20105d, 0, new b(), 3);
        boolean z10 = aVar instanceof qi.a;
        hh.g gVar = pVar.f20105d;
        if (!z10) {
            hh.g.b(gVar, 0, new c(str), 3);
            return;
        }
        hh.g.b(gVar, 0, new d(aVar), 3);
        qi.a aVar2 = (qi.a) aVar;
        String str2 = aVar2.f29593b;
        kotlin.jvm.internal.i.f(str2, "action.phoneNumber");
        if (!gv.n.B0(str2)) {
            String str3 = aVar2.f29593b;
            kotlin.jvm.internal.i.f(str3, "action.phoneNumber");
            if (df.b.u(str3)) {
                kotlin.jvm.internal.i.f(str3, "action.phoneNumber");
                df.b.B(this.B, str3);
                return;
            }
        }
        hh.g.b(gVar, 0, new e(str), 3);
    }

    public final void F(View view, pi.d dVar, bj.a aVar) {
        ih.p pVar = this.C;
        try {
            hh.g.b(pVar.f20105d, 0, new mi.b(this), 3);
            boolean z10 = aVar instanceof qi.c;
            hh.g gVar = pVar.f20105d;
            if (!z10) {
                hh.g.b(gVar, 1, new mi.c(this, dVar), 2);
                return;
            }
            hh.g.b(gVar, 0, new mi.d(this, aVar), 3);
            View findViewById = view.findViewById(((qi.c) aVar).f29597c + 30000);
            if (findViewById == null) {
                hh.g.b(gVar, 1, new mi.e(this, dVar), 2);
            } else if (!(findViewById instanceof MoERatingBar)) {
                hh.g.b(gVar, 1, new mi.f(this, dVar), 2);
            } else {
                float rating = ((MoERatingBar) findViewById).getRating();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("rating", rating);
                for (qi.b bVar : ((qi.c) aVar).f29596b) {
                    kotlin.jvm.internal.i.f(bVar, "action.conditions");
                    qi.b bVar2 = bVar;
                    JSONObject jSONObject2 = bVar2.f29594a;
                    kotlin.jvm.internal.i.f(jSONObject2, "condition.conditionAttribute");
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("filter_operator", "and");
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObject2);
                    jSONObject3.put("filters", jSONArray);
                    if (new ih.k(jSONObject3, jSONObject).a()) {
                        for (bj.a aVar2 : bVar2.f29595b) {
                            kotlin.jvm.internal.i.f(aVar2, "condition.actions");
                            K(view, dVar, aVar2);
                        }
                    }
                }
            }
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new mi.g(this));
        }
    }

    public final void G(bj.a aVar, String str) {
        ih.p pVar = this.C;
        hh.g.b(pVar.f20105d, 0, new f(), 3);
        boolean z10 = aVar instanceof qi.d;
        hh.g gVar = pVar.f20105d;
        if (!z10) {
            hh.g.b(gVar, 1, new g(str), 2);
            return;
        }
        hh.g.b(gVar, 0, new h(aVar), 3);
        qi.d dVar = (qi.d) aVar;
        String str2 = dVar.f29599c;
        kotlin.jvm.internal.i.f(str2, "action.textToCopy");
        if (gv.n.B0(str2)) {
            hh.g.b(gVar, 1, new i(str), 2);
            return;
        }
        String str3 = dVar.f29599c;
        kotlin.jvm.internal.i.f(str3, "action.textToCopy");
        String str4 = dVar.f29598b;
        if (str4 == null) {
            str4 = "";
        }
        Activity context = this.B;
        kotlin.jvm.internal.i.g(context, "context");
        di.b.d(context, str3);
        di.b.x(context, str4);
    }

    public final void H(bj.a aVar, pi.d dVar) {
        boolean z10 = aVar instanceof bj.b;
        ih.p pVar = this.C;
        if (!z10) {
            hh.g.b(pVar.f20105d, 1, new j(dVar), 2);
            return;
        }
        i1.f25206a.getClass();
        zi.b bVar = i1.a(pVar).f35171c;
        if (bVar == null) {
            return;
        }
        bh.b.f4298b.post(new androidx.emoji2.text.g(27, bVar, new aj.b(new aj.c(new s1.s(dVar.a(), dVar.b(), dVar.c()), di.b.a(pVar)), aVar), this));
    }

    public final void I(bj.a aVar, pi.d dVar) {
        Intent intent;
        ih.p pVar = this.C;
        hh.g.b(pVar.f20105d, 0, new k(), 3);
        boolean z10 = aVar instanceof bj.c;
        hh.g gVar = pVar.f20105d;
        if (!z10) {
            hh.g.b(gVar, 1, new l(dVar), 2);
            return;
        }
        hh.g.b(gVar, 0, new m(aVar), 3);
        i1.f25206a.getClass();
        zi.b bVar = i1.a(pVar).f35171c;
        aj.b bVar2 = new aj.b(new aj.c(new s1.s(dVar.a(), dVar.b(), dVar.c()), di.b.a(pVar)), aVar);
        if (bVar != null && ((bj.c) aVar).f4325b != 3) {
            bVar.a(bVar2);
            hh.g.b(gVar, 0, new n(), 3);
            return;
        }
        bj.c cVar = (bj.c) aVar;
        int d10 = v.h.d(cVar.f4325b);
        Activity activity = this.B;
        Map<String, Object> map = cVar.f4327d;
        String urlString = cVar.f4326c;
        if (d10 != 0) {
            is.x xVar = is.x.f20677u;
            if (d10 != 1) {
                if (d10 == 2) {
                    if (di.b.c(activity)) {
                        intent = new Intent(activity, MoEActivity.class);
                        if (map == null) {
                            map = xVar;
                        }
                        intent.putExtra("gcm_webUrl", di.b.b(urlString, map).toString());
                        intent.putExtra("isEmbeddedWebView", true);
                    } else {
                        hh.g.b(gVar, 0, new o(), 3);
                        intent = null;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                if (map == null) {
                    map = xVar;
                }
                kotlin.jvm.internal.i.g(urlString, "urlString");
                intent = new Intent("android.intent.action.VIEW", di.b.b(di.b.h(urlString), map));
            }
        } else {
            intent = new Intent(activity, Class.forName(urlString));
            Bundle bundle = new Bundle();
            if (map != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    bundle.putString(entry.getKey(), entry.getValue().toString());
                }
                if (!bundle.isEmpty()) {
                    intent.putExtras(bundle);
                }
            }
        }
        if (intent != null) {
            activity.startActivity(intent);
        }
    }

    public final void J(bj.a aVar, pi.d dVar) {
        ih.p pVar = this.C;
        try {
            hh.g.b(pVar.f20105d, 0, new p(), 3);
            if (!(aVar instanceof qi.f)) {
                hh.g.b(pVar.f20105d, 1, new q(dVar), 2);
                return;
            }
            Activity context = this.B;
            kotlin.jvm.internal.i.g(context, "context");
            PushManager.f10185a.getClass();
            PushBaseHandler pushBaseHandler = PushManager.f10186b;
            if (pushBaseHandler != null) {
                pushBaseHandler.navigateToSettings(context);
            }
        } catch (Throwable th2) {
            pVar.f20105d.a(1, th2, new r());
        }
    }

    public final void K(View inAppView, pi.d payload, bj.a action) {
        ih.p pVar = this.C;
        kotlin.jvm.internal.i.g(inAppView, "inAppView");
        kotlin.jvm.internal.i.g(action, "action");
        kotlin.jvm.internal.i.g(payload, "payload");
        try {
            switch (v.h.d(action.f4323a)) {
                case 0:
                    hh.g.b(pVar.f20105d, 0, new mi.i(this), 3);
                    i1.f25206a.getClass();
                    h1 b10 = i1.b(pVar);
                    Context applicationContext = this.B.getApplicationContext();
                    kotlin.jvm.internal.i.f(applicationContext, "context.applicationContext");
                    e2 e2Var = b10.f25200d;
                    e2Var.e(applicationContext, inAppView, payload);
                    e2Var.d(payload);
                    break;
                case 1:
                    P(action, payload.b());
                    break;
                case 2:
                    I(action, payload);
                    break;
                case 3:
                    M(action, payload.b());
                    break;
                case 4:
                    G(action, payload.b());
                    break;
                case 5:
                    E(action, payload.b());
                    break;
                case 6:
                    N(action, payload.b());
                    break;
                case 7:
                    H(action, payload);
                    break;
                case 8:
                    F(inAppView, payload, action);
                    break;
                case 9:
                    R(inAppView, payload, action);
                    break;
                case 10:
                    L(action, payload);
                    break;
                case 11:
                    J(action, payload);
                    break;
            }
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new mi.j(this));
        }
    }

    public final void L(bj.a aVar, pi.d dVar) {
        Activity activity = this.B;
        ih.p pVar = this.C;
        try {
            hh.g.b(pVar.f20105d, 0, new s(), 3);
            boolean z10 = aVar instanceof bj.d;
            hh.g gVar = pVar.f20105d;
            if (!z10) {
                hh.g.b(gVar, 1, new t(dVar), 2);
                return;
            }
            i1.f25206a.getClass();
            int i6 = i1.d(activity, pVar).i();
            zi.b bVar = i1.a(pVar).f35171c;
            if (bVar != null) {
                bVar.a(new aj.b(new aj.c(new s1.s(dVar.a(), dVar.b(), dVar.c()), di.b.a(pVar)), new bj.d(aVar.f4323a, i6)));
                hh.g.b(gVar, 0, new u(), 3);
            } else if (Build.VERSION.SDK_INT < 33) {
                hh.g.b(gVar, 0, new v(), 3);
                PushManager.f10185a.getClass();
                PushBaseHandler pushBaseHandler = PushManager.f10186b;
                if (pushBaseHandler != null) {
                    pushBaseHandler.navigateToSettings(activity);
                }
            } else if (i6 >= 2) {
                hh.g.b(gVar, 0, new w(i6), 3);
                PushManager.f10185a.getClass();
                PushBaseHandler pushBaseHandler2 = PushManager.f10186b;
                if (pushBaseHandler2 != null) {
                    pushBaseHandler2.navigateToSettings(activity);
                }
            } else {
                Map<String, String> u02 = is.e0.u0(new hs.f("campaign_name", dVar.c()), new hs.f("flow", "two step opt-in"));
                PushManager.f10185a.getClass();
                PushBaseHandler pushBaseHandler3 = PushManager.f10186b;
                if (pushBaseHandler3 != null) {
                    pushBaseHandler3.requestPushPermission(activity, u02);
                }
            }
        } catch (Throwable th2) {
            pVar.f20105d.a(1, th2, new x());
        }
    }

    public final void M(bj.a aVar, String str) {
        ih.p pVar = this.C;
        hh.g.b(pVar.f20105d, 0, new y(), 3);
        boolean z10 = aVar instanceof qi.g;
        hh.g gVar = pVar.f20105d;
        if (!z10) {
            hh.g.b(gVar, 0, new z(str), 3);
            return;
        }
        hh.g.b(gVar, 0, new a0(aVar), 3);
        qi.g gVar2 = (qi.g) aVar;
        String str2 = gVar2.f29600b;
        kotlin.jvm.internal.i.f(str2, "action.shareText");
        if (gv.n.B0(str2)) {
            hh.g.b(gVar, 1, new b0(str), 2);
            return;
        }
        String str3 = gVar2.f29600b;
        kotlin.jvm.internal.i.f(str3, "action.shareText");
        df.b.C(this.B, str3);
    }

    public final void N(bj.a aVar, String str) {
        ih.p pVar = this.C;
        hh.g.b(pVar.f20105d, 0, new c0(), 3);
        boolean z10 = aVar instanceof qi.h;
        hh.g gVar = pVar.f20105d;
        if (!z10) {
            hh.g.b(gVar, 0, new d0(str), 3);
            return;
        }
        hh.g.b(gVar, 0, new e0(aVar), 3);
        qi.h hVar = (qi.h) aVar;
        String str2 = hVar.f29601b;
        kotlin.jvm.internal.i.f(str2, "action.phoneNumber");
        if (!gv.n.B0(str2)) {
            String str3 = hVar.f29602c;
            kotlin.jvm.internal.i.f(str3, "action.message");
            if (!gv.n.B0(str3)) {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse(kotlin.jvm.internal.i.n(hVar.f29601b, "smsto:")));
                intent.putExtra("sms_body", str3);
                this.B.startActivity(intent);
                return;
            }
        }
        hh.g.b(gVar, 1, new f0(str), 2);
    }

    public final void P(bj.a aVar, String str) {
        ih.p pVar = this.C;
        hh.g.b(pVar.f20105d, 0, new g0(), 3);
        boolean z10 = aVar instanceof qi.i;
        hh.g gVar = pVar.f20105d;
        if (!z10) {
            hh.g.b(gVar, 0, new h0(str), 3);
            return;
        }
        qi.i iVar = (qi.i) aVar;
        int d10 = v.h.d(iVar.f29603b);
        if (d10 != 0) {
            if (d10 == 1) {
                hh.g.b(gVar, 0, new mi.k(this), 3);
                String str2 = iVar.f29605d;
                kotlin.jvm.internal.i.f(str2, "action.name");
                if (gv.n.B0(str2)) {
                    hh.g.b(gVar, 0, new mi.l(this, str), 3);
                    return;
                }
                kotlin.jvm.internal.i.f(str2, "action.name");
                String obj = gv.r.i1(str2).toString();
                String str3 = iVar.f29604c;
                kotlin.jvm.internal.i.f(str3, "action.value");
                og.b.c(this.B, obj, str3, (String) pVar.f20102a.f5133c);
                return;
            }
            return;
        }
        Q(iVar, str);
    }

    public final void Q(qi.i iVar, String str) {
        ih.p pVar = this.C;
        hh.g.b(pVar.f20105d, 0, new i0(), 3);
        String str2 = iVar.f29605d;
        kotlin.jvm.internal.i.f(str2, "action.name");
        if (gv.n.B0(str2)) {
            hh.g.b(pVar.f20105d, 0, new j0(str), 3);
            return;
        }
        ng.c cVar = new ng.c();
        Map<String, Object> map = iVar.f29606e;
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                kotlin.jvm.internal.i.f(key, "key");
                cVar.a(value, key);
            }
        }
        String str3 = iVar.f29605d;
        kotlin.jvm.internal.i.f(str3, "action.name");
        String eventName = gv.r.i1(str3).toString();
        String appId = (String) pVar.f20102a.f5133c;
        Activity context = this.B;
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(eventName, "eventName");
        kotlin.jvm.internal.i.g(appId, "appId");
        ih.p b10 = qg.g0.b(appId);
        if (b10 != null) {
            qg.w.f29578a.getClass();
            qg.w.d(b10).c(context, eventName, cVar);
        }
    }

    public final void R(View view, pi.d dVar, bj.a aVar) {
        ih.p pVar = this.C;
        hh.g.b(pVar.f20105d, 0, new mi.m(this), 3);
        boolean z10 = aVar instanceof qi.j;
        hh.g gVar = pVar.f20105d;
        if (!z10) {
            hh.g.b(gVar, 1, new mi.n(this, dVar), 2);
            return;
        }
        hh.g.b(gVar, 0, new mi.o(this, aVar), 3);
        qi.j jVar = (qi.j) aVar;
        if (C0407a.f25073a[v.h.d(jVar.f29607b)] == 1) {
            View findViewById = view.findViewById(jVar.f29608c + 30000);
            if (findViewById == null) {
                hh.g.b(gVar, 1, new mi.p(this), 2);
            } else if (!(findViewById instanceof MoERatingBar)) {
                hh.g.b(gVar, 1, new mi.q(this, dVar), 2);
            } else {
                float rating = ((MoERatingBar) findViewById).getRating();
                for (bj.a aVar2 : jVar.f29609d) {
                    if (aVar2.f4323a == 2) {
                        qi.i iVar = (qi.i) aVar2;
                        int d10 = v.h.d(iVar.f29603b);
                        if (d10 != 0) {
                            if (d10 == 1) {
                                String str = iVar.f29605d;
                                kotlin.jvm.internal.i.f(str, "trackAction.name");
                                og.b.c(this.B, gv.r.i1(str).toString(), Float.valueOf(rating), (String) pVar.f20102a.f5133c);
                            }
                        } else {
                            Map<String, Object> map = iVar.f29606e;
                            kotlin.jvm.internal.i.f(map, "trackAction.attributes");
                            map.put("rating", Float.valueOf(rating));
                            Q(iVar, dVar.b());
                        }
                    } else {
                        K(view, dVar, aVar2);
                    }
                }
            }
        }
    }
}
