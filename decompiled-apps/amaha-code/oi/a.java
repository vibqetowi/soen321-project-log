package oi;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.widget.RelativeLayout;
import com.theinnerhour.b2b.utils.SessionManager;
import java.util.HashMap;
import java.util.Locale;
import mi.t1;
import org.json.JSONObject;
/* compiled from: HtmlJavaScriptInterface.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f27474a;

    /* renamed from: b  reason: collision with root package name */
    public final pi.h f27475b;

    /* renamed from: c  reason: collision with root package name */
    public final View f27476c;

    /* renamed from: d  reason: collision with root package name */
    public final ih.p f27477d;

    /* renamed from: e  reason: collision with root package name */
    public final String f27478e;
    public final tr.r f;

    /* renamed from: g  reason: collision with root package name */
    public final mi.a f27479g;

    /* renamed from: h  reason: collision with root package name */
    public final Context f27480h;

    /* renamed from: i  reason: collision with root package name */
    public final String f27481i;

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* renamed from: oi.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0455a extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f27483v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0455a(String str) {
            super(0);
            this.f27483v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f27478e + " call() : mobile number: " + ((Object) this.f27483v);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class a0 extends kotlin.jvm.internal.k implements ss.a<String> {
        public a0() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" setFirstName() : ", a.this.f27478e);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class a1 extends kotlin.jvm.internal.k implements ss.a<String> {
        public a1() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" trackDismiss() : ", a.this.f27478e);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" call() : ", a.this.f27478e);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class b0 extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f27488v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(String str) {
            super(0);
            this.f27488v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f27478e + " setGender() : gender: " + ((Object) this.f27488v);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class b1 extends kotlin.jvm.internal.k implements ss.a<String> {
        public b1() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" trackDismiss() : ", a.this.f27478e);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f27491v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f27492w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2) {
            super(0);
            this.f27491v = str;
            this.f27492w = str2;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f27478e + " copyText() : text to copy: " + ((Object) this.f27491v) + ", message: " + ((Object) this.f27492w);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class c0 extends kotlin.jvm.internal.k implements ss.a<String> {
        public c0() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" setGender() : ", a.this.f27478e);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class c1 extends kotlin.jvm.internal.k implements ss.a<String> {
        public final /* synthetic */ boolean A;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f27495v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f27496w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f27497x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f27498y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f27499z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c1(String str, String str2, String str3, String str4, boolean z10, boolean z11) {
            super(0);
            this.f27495v = str;
            this.f27496w = str2;
            this.f27497x = str3;
            this.f27498y = str4;
            this.f27499z = z10;
            this.A = z11;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f27478e + " trackEvent() : eventName: " + ((Object) this.f27495v) + ", generalAttrJson: " + ((Object) this.f27496w) + ", locationAttrJson: " + ((Object) this.f27497x) + ", dateAttrJson: " + ((Object) this.f27498y) + ", isNonInteractive: " + this.f27499z + ", shouldAttachCampaignMeta: " + this.A;
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<String> {
        public d() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" copyText() : ", a.this.f27478e);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class d0 extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f27502v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(String str) {
            super(0);
            this.f27502v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f27478e + " setLastName() : last name: " + ((Object) this.f27502v);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class d1 extends kotlin.jvm.internal.k implements ss.a<String> {
        public d1() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" trackEvent() : ", a.this.f27478e);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f27505v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.f27505v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f27478e + " customAction() : DataJson: " + ((Object) this.f27505v);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class e0 extends kotlin.jvm.internal.k implements ss.a<String> {
        public e0() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" setLastName() : ", a.this.f27478e);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class e1 extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f27508v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e1(String str) {
            super(0);
            this.f27508v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f27478e + " trackRating() : " + ((Object) this.f27508v);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.a<String> {
        public f() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" customAction() : ", a.this.f27478e);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class f0 extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f27511v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(String str) {
            super(0);
            this.f27511v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f27478e + " setMobileNumber() : mobile number: " + ((Object) this.f27511v);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class f1 extends kotlin.jvm.internal.k implements ss.a<String> {
        public f1() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" trackRating() : ", a.this.f27478e);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class g extends kotlin.jvm.internal.k implements ss.a<String> {
        public g() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" dismissMessage() : ", a.this.f27478e);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class g0 extends kotlin.jvm.internal.k implements ss.a<String> {
        public g0() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" setMobileNumber() : ", a.this.f27478e);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class h extends kotlin.jvm.internal.k implements ss.a<String> {
        public h() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" navigateToNotificationSettings() : ", a.this.f27478e);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class h0 extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f27517v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(String str) {
            super(0);
            this.f27517v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f27478e + " setUniqueId() : uniqueId: " + ((Object) this.f27517v);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class i extends kotlin.jvm.internal.k implements ss.a<String> {
        public i() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" navigateToNotificationSettings() : ", a.this.f27478e);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class i0 extends kotlin.jvm.internal.k implements ss.a<String> {
        public i0() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" setUniqueId() : ", a.this.f27478e);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class j extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f27521v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str) {
            super(0);
            this.f27521v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f27478e + " navigateToScreen() : screenName: " + ((Object) this.f27521v) + " is invalid. Not processing.";
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class j0 extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f27523v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(String str) {
            super(0);
            this.f27523v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f27478e + " setUserAttribute() : userAttrJson: " + ((Object) this.f27523v);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class k extends kotlin.jvm.internal.k implements ss.a<String> {
        public k() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" navigateToScreen() : ", a.this.f27478e);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class k0 extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f27526v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Object f27527w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(String str, Object obj) {
            super(0);
            this.f27526v = str;
            this.f27527w = obj;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f27478e + " setUserAttribute() : name: " + ((Object) this.f27526v) + " value: " + this.f27527w + ", unsupported data type.";
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class l extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f27529v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str) {
            super(0);
            this.f27529v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f27478e + " openDeepLink() : url: " + ((Object) this.f27529v) + " is invalid. Not processing.";
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class l0 extends kotlin.jvm.internal.k implements ss.a<String> {
        public l0() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" setUserAttribute() : ", a.this.f27478e);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class m extends kotlin.jvm.internal.k implements ss.a<String> {
        public m() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" openDeepLink() : ", a.this.f27478e);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class m0 extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f27533v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f27534w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m0(String str, String str2) {
            super(0);
            this.f27533v = str;
            this.f27534w = str2;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f27478e + " setUserAttributeDate() : name: " + ((Object) this.f27533v) + ", iso date: " + ((Object) this.f27534w);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class n extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f27536v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str) {
            super(0);
            this.f27536v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f27478e + " openRichLanding() : url: " + ((Object) this.f27536v) + " is invalid. Not processing.";
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class n0 extends kotlin.jvm.internal.k implements ss.a<String> {
        public n0() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" setUserAttributeDate() : ", a.this.f27478e);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class o extends kotlin.jvm.internal.k implements ss.a<String> {
        public o() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" openRichLanding() : ", a.this.f27478e);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class o0 extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f27540v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0(String str) {
            super(0);
            this.f27540v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f27478e + " setUserAttributeLocation() : " + ((Object) this.f27540v);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class p extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f27542v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str) {
            super(0);
            this.f27542v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f27478e + " openWebURL() : " + ((Object) this.f27542v) + " is invalid. Not processing.";
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class p0 extends kotlin.jvm.internal.k implements ss.a<String> {
        public p0() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" setUserAttributeLocation() : ", a.this.f27478e);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class q extends kotlin.jvm.internal.k implements ss.a<String> {
        public q() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" openWebURL() : ", a.this.f27478e);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class q0 extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f27546v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q0(String str) {
            super(0);
            this.f27546v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f27478e + " setUserLocation() : " + ((Object) this.f27546v);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class r extends kotlin.jvm.internal.k implements ss.a<String> {
        public r() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" requestNotificationPermission() : ", a.this.f27478e);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class r0 extends kotlin.jvm.internal.k implements ss.a<String> {
        public r0() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" setUserLocation() : ", a.this.f27478e);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class s extends kotlin.jvm.internal.k implements ss.a<String> {
        public s() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" requestNotificationPermission() : ", a.this.f27478e);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class s0 extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f27551v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s0(String str) {
            super(0);
            this.f27551v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f27478e + " setUserName() : username: " + ((Object) this.f27551v);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class t extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f27553v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(String str) {
            super(0);
            this.f27553v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f27478e + " setAlias() : alias " + ((Object) this.f27553v);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class t0 extends kotlin.jvm.internal.k implements ss.a<String> {
        public t0() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" setUserName() : ", a.this.f27478e);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class u extends kotlin.jvm.internal.k implements ss.a<String> {
        public u() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" setAlias() : ", a.this.f27478e);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class u0 extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f27557v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u0(String str) {
            super(0);
            this.f27557v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f27478e + " share() : content: " + ((Object) this.f27557v);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class v extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f27559v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(String str) {
            super(0);
            this.f27559v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f27478e + " setBirthDate() : birthdate: " + ((Object) this.f27559v);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class v0 extends kotlin.jvm.internal.k implements ss.a<String> {
        public v0() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" share() : ", a.this.f27478e);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class w extends kotlin.jvm.internal.k implements ss.a<String> {
        public w() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" setBirthDate() : ", a.this.f27478e);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class w0 extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f27563v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f27564w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w0(String str, String str2) {
            super(0);
            this.f27563v = str;
            this.f27564w = str2;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f27478e + " sms() : mobile number: " + ((Object) this.f27563v) + ", message: " + ((Object) this.f27564w);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class x extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f27566v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(String str) {
            super(0);
            this.f27566v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f27478e + " setEmailId() : emailId: " + ((Object) this.f27566v);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class x0 extends kotlin.jvm.internal.k implements ss.a<String> {
        public x0() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" sms() : ", a.this.f27478e);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class y extends kotlin.jvm.internal.k implements ss.a<String> {
        public y() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" setEmailId() : ", a.this.f27478e);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class y0 extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f27570v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y0(String str) {
            super(0);
            this.f27570v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f27478e + " trackClick() : payload: " + ((Object) this.f27570v);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class z extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f27572v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(String str) {
            super(0);
            this.f27572v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f27478e + " setFirstName() : first name: " + ((Object) this.f27572v);
        }
    }

    /* compiled from: HtmlJavaScriptInterface.kt */
    /* loaded from: classes.dex */
    public static final class z0 extends kotlin.jvm.internal.k implements ss.a<String> {
        public z0() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" trackClick() : ", a.this.f27478e);
        }
    }

    public a(Activity activity, pi.h payload, RelativeLayout relativeLayout, ih.p sdkInstance) {
        kotlin.jvm.internal.i.g(activity, "activity");
        kotlin.jvm.internal.i.g(payload, "payload");
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        this.f27474a = activity;
        this.f27475b = payload;
        this.f27476c = relativeLayout;
        this.f27477d = sdkInstance;
        this.f27478e = "InApp_6.5.0_HtmlJavaScriptInterface";
        this.f = new tr.r();
        this.f27479g = new mi.a(activity, sdkInstance);
        this.f27480h = activity.getApplicationContext();
        this.f27481i = (String) sdkInstance.f20102a.f5133c;
    }

    public static HashMap b(String str) {
        boolean z10;
        if (t1.h(str)) {
            if (str != null && !gv.n.B0(str)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                return di.n.e(new JSONObject(str));
            }
        }
        return null;
    }

    public final void a(bj.a aVar) {
        View view = this.f27476c;
        if (view == null) {
            return;
        }
        this.f27479g.K(view, this.f27475b, aVar);
    }

    @JavascriptInterface
    public final void call(String str) {
        ih.p pVar = this.f27477d;
        try {
            boolean z10 = false;
            hh.g.b(pVar.f20105d, 0, new C0455a(str), 3);
            if (!((str == null || gv.n.B0(str)) ? true : true) && t1.h(str)) {
                a(new qi.a(6, str));
            }
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new b());
        }
    }

    @JavascriptInterface
    public final void copyText(String str, String str2) {
        ih.p pVar = this.f27477d;
        try {
            boolean z10 = false;
            hh.g.b(pVar.f20105d, 0, new c(str, str2), 3);
            if (!((str == null || gv.n.B0(str)) ? true : true) && t1.h(str)) {
                if (!t1.h(str2)) {
                    str2 = null;
                }
                a(new qi.d(5, str2, str));
            }
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new d());
        }
    }

    @JavascriptInterface
    public final void customAction(String str) {
        ih.p pVar = this.f27477d;
        try {
            hh.g.b(pVar.f20105d, 0, new e(str), 3);
            if (!t1.h(str)) {
                return;
            }
            a(new bj.b(8, b(str)));
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new f());
        }
    }

    @JavascriptInterface
    public final void dismissMessage() {
        try {
            this.f27474a.runOnUiThread(new je.o(11, this));
        } catch (Exception e10) {
            this.f27477d.f20105d.a(1, e10, new g());
        }
    }

    @JavascriptInterface
    public final void navigateToNotificationSettings() {
        ih.p pVar = this.f27477d;
        try {
            hh.g.b(pVar.f20105d, 0, new h(), 3);
            a(new qi.f(12));
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new i());
        }
    }

    @JavascriptInterface
    public final void navigateToScreen(String str, String str2) {
        boolean z10;
        ih.p pVar = this.f27477d;
        if (str != null) {
            try {
                if (!gv.n.B0(str)) {
                    z10 = false;
                    if (!z10 && t1.h(str)) {
                        a(new bj.c(3, 1, str, b(str2)));
                        return;
                    }
                    hh.g.b(pVar.f20105d, 1, new j(str), 2);
                }
            } catch (Exception e10) {
                pVar.f20105d.a(1, e10, new k());
                return;
            }
        }
        z10 = true;
        if (!z10) {
            a(new bj.c(3, 1, str, b(str2)));
            return;
        }
        hh.g.b(pVar.f20105d, 1, new j(str), 2);
    }

    @JavascriptInterface
    public final void openDeepLink(String str, String str2) {
        boolean z10;
        ih.p pVar = this.f27477d;
        if (str != null) {
            try {
                if (!gv.n.B0(str)) {
                    z10 = false;
                    if (!z10 && t1.h(str)) {
                        a(new bj.c(3, 2, str, b(str2)));
                        return;
                    }
                    hh.g.b(pVar.f20105d, 1, new l(str), 2);
                }
            } catch (Exception e10) {
                pVar.f20105d.a(1, e10, new m());
                return;
            }
        }
        z10 = true;
        if (!z10) {
            a(new bj.c(3, 2, str, b(str2)));
            return;
        }
        hh.g.b(pVar.f20105d, 1, new l(str), 2);
    }

    @JavascriptInterface
    public final void openRichLanding(String str, String str2) {
        boolean z10;
        ih.p pVar = this.f27477d;
        if (str != null) {
            try {
                if (!gv.n.B0(str)) {
                    z10 = false;
                    if (!z10 && t1.h(str)) {
                        a(new bj.c(3, 3, str, b(str2)));
                        return;
                    }
                    hh.g.b(pVar.f20105d, 1, new n(str), 2);
                }
            } catch (Exception e10) {
                pVar.f20105d.a(1, e10, new o());
                return;
            }
        }
        z10 = true;
        if (!z10) {
            a(new bj.c(3, 3, str, b(str2)));
            return;
        }
        hh.g.b(pVar.f20105d, 1, new n(str), 2);
    }

    @JavascriptInterface
    public final void openWebURL(String str, String str2) {
        boolean z10;
        ih.p pVar = this.f27477d;
        if (str != null) {
            try {
                if (!gv.n.B0(str)) {
                    z10 = false;
                    if (!z10 && t1.h(str)) {
                        a(new bj.c(3, 2, str, b(str2)));
                        return;
                    }
                    hh.g.b(pVar.f20105d, 1, new p(str), 2);
                }
            } catch (Exception e10) {
                pVar.f20105d.a(1, e10, new q());
                return;
            }
        }
        z10 = true;
        if (!z10) {
            a(new bj.c(3, 2, str, b(str2)));
            return;
        }
        hh.g.b(pVar.f20105d, 1, new p(str), 2);
    }

    @JavascriptInterface
    public final void requestNotificationPermission() {
        ih.p pVar = this.f27477d;
        try {
            hh.g.b(pVar.f20105d, 0, new r(), 3);
            a(new bj.d(11, -1));
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new s());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e A[Catch: Exception -> 0x007a, TRY_LEAVE, TryCatch #2 {Exception -> 0x007a, blocks: (B:3:0x0005, B:5:0x0013, B:11:0x001f, B:14:0x0026, B:17:0x003e, B:18:0x0052), top: B:27:0x0005 }] */
    @JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setAlias(String alias) {
        boolean z10;
        ih.p b10;
        ih.p pVar = this.f27477d;
        try {
            hh.g.b(pVar.f20105d, 0, new t(alias), 3);
            if (alias != null && !gv.n.B0(alias)) {
                z10 = false;
                if (!z10 && t1.h(alias)) {
                    Context context = this.f27480h;
                    kotlin.jvm.internal.i.f(context, "context");
                    String appId = this.f27481i;
                    kotlin.jvm.internal.i.g(alias, "alias");
                    kotlin.jvm.internal.i.g(appId, "appId");
                    b10 = qg.g0.b(appId);
                    if (b10 == null) {
                        qg.w.f29578a.getClass();
                        qg.g d10 = qg.w.d(b10);
                        ih.a aVar = new ih.a("USER_ATTRIBUTE_UNIQUE_ID", alias, ug.l.b(alias));
                        ug.b bVar = d10.f29548c;
                        bVar.getClass();
                        bVar.f34102a.f20106e.c(new ah.e("SET_ALIAS", false, new ug.a(bVar, context, aVar, 0)));
                        return;
                    }
                    return;
                }
                return;
            }
            z10 = true;
            if (!z10) {
                Context context2 = this.f27480h;
                kotlin.jvm.internal.i.f(context2, "context");
                String appId2 = this.f27481i;
                kotlin.jvm.internal.i.g(alias, "alias");
                kotlin.jvm.internal.i.g(appId2, "appId");
                b10 = qg.g0.b(appId2);
                if (b10 == null) {
                }
            }
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new u());
        }
    }

    @JavascriptInterface
    public final void setBirthDate(String str) {
        ih.p pVar = this.f27477d;
        try {
            boolean z10 = false;
            hh.g.b(pVar.f20105d, 0, new v(str), 3);
            if (!((str == null || gv.n.B0(str)) ? true : true) && t1.h(str)) {
                Context context = this.f27480h;
                kotlin.jvm.internal.i.f(context, "context");
                og.b.d(context, "USER_ATTRIBUTE_USER_BDAY", str, this.f27481i);
            }
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new w());
        }
    }

    @JavascriptInterface
    public final void setEmailId(String value) {
        ih.p pVar = this.f27477d;
        try {
            boolean z10 = false;
            hh.g.b(pVar.f20105d, 0, new x(value), 3);
            if (!((value == null || gv.n.B0(value)) ? true : true) && t1.h(value)) {
                Context context = this.f27480h;
                kotlin.jvm.internal.i.f(context, "context");
                String appId = this.f27481i;
                kotlin.jvm.internal.i.g(value, "value");
                kotlin.jvm.internal.i.g(appId, "appId");
                og.b.c(context, "USER_ATTRIBUTE_USER_EMAIL", value, appId);
            }
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new y());
        }
    }

    @JavascriptInterface
    public final void setFirstName(String value) {
        ih.p pVar = this.f27477d;
        try {
            boolean z10 = false;
            hh.g.b(pVar.f20105d, 0, new z(value), 3);
            if (!((value == null || gv.n.B0(value)) ? true : true) && t1.h(value)) {
                Context context = this.f27480h;
                kotlin.jvm.internal.i.f(context, "context");
                String appId = this.f27481i;
                kotlin.jvm.internal.i.g(value, "value");
                kotlin.jvm.internal.i.g(appId, "appId");
                og.b.c(context, "USER_ATTRIBUTE_USER_FIRST_NAME", value, appId);
            }
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new a0());
        }
    }

    @JavascriptInterface
    public final void setGender(String str) {
        ih.p pVar = this.f27477d;
        try {
            boolean z10 = false;
            hh.g.b(pVar.f20105d, 0, new b0(str), 3);
            if (str != null) {
                if (gv.n.B0(str)) {
                }
                if (!z10 && t1.h(str)) {
                    Context context = this.f27480h;
                    kotlin.jvm.internal.i.f(context, "context");
                    Locale locale = Locale.ROOT;
                    String upperCase = str.toUpperCase(locale);
                    kotlin.jvm.internal.i.f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    int G = defpackage.b.G(upperCase);
                    String appId = this.f27481i;
                    defpackage.d.j(G, "gender");
                    kotlin.jvm.internal.i.g(appId, "appId");
                    String lowerCase = defpackage.b.x(G).toLowerCase(locale);
                    kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    og.b.c(context, "USER_ATTRIBUTE_USER_GENDER", lowerCase, appId);
                }
                return;
            }
            z10 = true;
            if (!z10) {
                Context context2 = this.f27480h;
                kotlin.jvm.internal.i.f(context2, "context");
                Locale locale2 = Locale.ROOT;
                String upperCase2 = str.toUpperCase(locale2);
                kotlin.jvm.internal.i.f(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                int G2 = defpackage.b.G(upperCase2);
                String appId2 = this.f27481i;
                defpackage.d.j(G2, "gender");
                kotlin.jvm.internal.i.g(appId2, "appId");
                String lowerCase2 = defpackage.b.x(G2).toLowerCase(locale2);
                kotlin.jvm.internal.i.f(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                og.b.c(context2, "USER_ATTRIBUTE_USER_GENDER", lowerCase2, appId2);
            }
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new c0());
        }
    }

    @JavascriptInterface
    public final void setLastName(String value) {
        ih.p pVar = this.f27477d;
        try {
            boolean z10 = false;
            hh.g.b(pVar.f20105d, 0, new d0(value), 3);
            if (!((value == null || gv.n.B0(value)) ? true : true) && t1.h(value)) {
                Context context = this.f27480h;
                kotlin.jvm.internal.i.f(context, "context");
                String appId = this.f27481i;
                kotlin.jvm.internal.i.g(value, "value");
                kotlin.jvm.internal.i.g(appId, "appId");
                og.b.c(context, "USER_ATTRIBUTE_USER_LAST_NAME", value, appId);
            }
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new e0());
        }
    }

    @JavascriptInterface
    public final void setMobileNumber(String value) {
        ih.p pVar = this.f27477d;
        try {
            boolean z10 = false;
            hh.g.b(pVar.f20105d, 0, new f0(value), 3);
            if (!((value == null || gv.n.B0(value)) ? true : true) && t1.h(value)) {
                Context context = this.f27480h;
                kotlin.jvm.internal.i.f(context, "context");
                String appId = this.f27481i;
                kotlin.jvm.internal.i.g(value, "value");
                kotlin.jvm.internal.i.g(appId, "appId");
                if (!gv.n.B0(value)) {
                    og.b.c(context, "USER_ATTRIBUTE_USER_MOBILE", value, appId);
                }
            }
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new g0());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e A[Catch: Exception -> 0x007a, TRY_LEAVE, TryCatch #2 {Exception -> 0x007a, blocks: (B:3:0x0005, B:5:0x0013, B:11:0x001f, B:14:0x0026, B:17:0x003e, B:18:0x0052), top: B:27:0x0005 }] */
    @JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setUniqueId(String uniqueId) {
        boolean z10;
        ih.p b10;
        ih.p pVar = this.f27477d;
        try {
            hh.g.b(pVar.f20105d, 0, new h0(uniqueId), 3);
            if (uniqueId != null && !gv.n.B0(uniqueId)) {
                z10 = false;
                if (!z10 && t1.h(uniqueId)) {
                    Context context = this.f27480h;
                    kotlin.jvm.internal.i.f(context, "context");
                    String appId = this.f27481i;
                    kotlin.jvm.internal.i.g(uniqueId, "uniqueId");
                    kotlin.jvm.internal.i.g(appId, "appId");
                    b10 = qg.g0.b(appId);
                    if (b10 == null) {
                        qg.w.f29578a.getClass();
                        qg.g d10 = qg.w.d(b10);
                        ih.a aVar = new ih.a("USER_ATTRIBUTE_UNIQUE_ID", uniqueId, ug.l.b(uniqueId));
                        ug.b bVar = d10.f29548c;
                        bVar.getClass();
                        bVar.f34102a.f20106e.c(new ah.e("SET_UNIQUE_ID", false, new ug.a(bVar, context, aVar, 3)));
                        return;
                    }
                    return;
                }
                return;
            }
            z10 = true;
            if (!z10) {
                Context context2 = this.f27480h;
                kotlin.jvm.internal.i.f(context2, "context");
                String appId2 = this.f27481i;
                kotlin.jvm.internal.i.g(uniqueId, "uniqueId");
                kotlin.jvm.internal.i.g(appId2, "appId");
                b10 = qg.g0.b(appId2);
                if (b10 == null) {
                }
            }
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new i0());
        }
    }

    @JavascriptInterface
    public final void setUserAttribute(String str) {
        ih.p pVar = this.f27477d;
        try {
            boolean z10 = false;
            hh.g.b(pVar.f20105d, 0, new j0(str), 3);
            if (!((str == null || gv.n.B0(str)) ? true : true) && t1.h(str) && t1.i(str)) {
                JSONObject jSONObject = new JSONObject(str);
                String name = jSONObject.getString(SessionManager.KEY_NAME);
                Object obj = jSONObject.get("value");
                boolean z11 = obj instanceof Integer;
                Context context = this.f27480h;
                if (z11) {
                    kotlin.jvm.internal.i.f(context, "context");
                    kotlin.jvm.internal.i.f(name, "name");
                    og.b.c(context, name, obj, (String) pVar.f20102a.f5133c);
                    return;
                }
                boolean z12 = obj instanceof Boolean;
                String str2 = this.f27481i;
                if (z12) {
                    kotlin.jvm.internal.i.f(context, "context");
                    kotlin.jvm.internal.i.f(name, "name");
                    og.b.c(context, name, obj, str2);
                } else if (obj instanceof Double) {
                    kotlin.jvm.internal.i.f(context, "context");
                    kotlin.jvm.internal.i.f(name, "name");
                    og.b.c(context, name, obj, str2);
                } else if (obj instanceof Float) {
                    kotlin.jvm.internal.i.f(context, "context");
                    kotlin.jvm.internal.i.f(name, "name");
                    og.b.c(context, name, obj, str2);
                } else if (obj instanceof Long) {
                    kotlin.jvm.internal.i.f(context, "context");
                    kotlin.jvm.internal.i.f(name, "name");
                    og.b.c(context, name, obj, str2);
                } else if (obj instanceof String) {
                    kotlin.jvm.internal.i.f(context, "context");
                    kotlin.jvm.internal.i.f(name, "name");
                    og.b.c(context, name, obj, str2);
                } else {
                    hh.g.b(pVar.f20105d, 1, new k0(name, obj), 2);
                }
            }
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new l0());
        }
    }

    @JavascriptInterface
    public final void setUserAttributeDate(String str, String str2) {
        boolean z10;
        ih.p pVar = this.f27477d;
        try {
            boolean z11 = false;
            hh.g.b(pVar.f20105d, 0, new m0(str, str2), 3);
            if (str != null && !gv.n.B0(str)) {
                z10 = false;
                if (z10 && t1.h(str)) {
                    if (!((str2 == null || gv.n.B0(str2)) ? true : true) && t1.h(str2)) {
                        Context context = this.f27480h;
                        kotlin.jvm.internal.i.f(context, "context");
                        og.b.d(context, str, str2, this.f27481i);
                        return;
                    }
                    return;
                }
            }
            z10 = true;
            if (z10) {
            }
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new n0());
        }
    }

    @JavascriptInterface
    public final void setUserAttributeLocation(String str) {
        boolean z10;
        JSONObject jSONObject;
        String name;
        ih.p pVar = this.f27477d;
        try {
            boolean z11 = false;
            hh.g.b(pVar.f20105d, 0, new o0(str), 3);
            if (str != null && !gv.n.B0(str)) {
                z10 = false;
                if (!z10 && t1.h(str)) {
                    jSONObject = new JSONObject(str);
                    name = jSONObject.getString(SessionManager.KEY_NAME);
                    if (!((name != null || gv.n.B0(name)) ? true : true) && t1.h(name)) {
                        Context context = this.f27480h;
                        kotlin.jvm.internal.i.f(context, "context");
                        kotlin.jvm.internal.i.f(name, "name");
                        og.b.c(context, name, new fi.c(jSONObject.getDouble("latitude"), jSONObject.getDouble("longitude")), this.f27481i);
                    }
                    return;
                }
                return;
            }
            z10 = true;
            if (!z10) {
                jSONObject = new JSONObject(str);
                name = jSONObject.getString(SessionManager.KEY_NAME);
                if (!((name != null || gv.n.B0(name)) ? true : true)) {
                    Context context2 = this.f27480h;
                    kotlin.jvm.internal.i.f(context2, "context");
                    kotlin.jvm.internal.i.f(name, "name");
                    og.b.c(context2, name, new fi.c(jSONObject.getDouble("latitude"), jSONObject.getDouble("longitude")), this.f27481i);
                }
            }
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new p0());
        }
    }

    @JavascriptInterface
    public final void setUserLocation(String str) {
        ih.p pVar = this.f27477d;
        try {
            boolean z10 = false;
            hh.g.b(pVar.f20105d, 0, new q0(str), 3);
            if (!((str == null || gv.n.B0(str)) ? true : true) && t1.h(str) && t1.i(str)) {
                JSONObject jSONObject = new JSONObject(str);
                Context context = this.f27480h;
                kotlin.jvm.internal.i.f(context, "context");
                double d10 = jSONObject.getDouble("latitude");
                double d11 = jSONObject.getDouble("longitude");
                String appId = this.f27481i;
                kotlin.jvm.internal.i.g(appId, "appId");
                og.b.c(context, "last_known_location", new fi.c(d10, d11), appId);
            }
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new r0());
        }
    }

    @JavascriptInterface
    public final void setUserName(String value) {
        ih.p pVar = this.f27477d;
        try {
            boolean z10 = false;
            hh.g.b(pVar.f20105d, 0, new s0(value), 3);
            if (!((value == null || gv.n.B0(value)) ? true : true) && t1.h(value)) {
                Context context = this.f27480h;
                kotlin.jvm.internal.i.f(context, "context");
                String appId = this.f27481i;
                kotlin.jvm.internal.i.g(value, "value");
                kotlin.jvm.internal.i.g(appId, "appId");
                og.b.c(context, "USER_ATTRIBUTE_USER_NAME", value, appId);
            }
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new t0());
        }
    }

    @JavascriptInterface
    public final void share(String str) {
        ih.p pVar = this.f27477d;
        try {
            boolean z10 = false;
            hh.g.b(pVar.f20105d, 0, new u0(str), 3);
            if (!((str == null || gv.n.B0(str)) ? true : true) && t1.h(str)) {
                a(new qi.g(4, str));
            }
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new v0());
        }
    }

    @JavascriptInterface
    public final void sms(String str, String str2) {
        boolean z10;
        ih.p pVar = this.f27477d;
        try {
            boolean z11 = false;
            hh.g.b(pVar.f20105d, 0, new w0(str, str2), 3);
            if (str != null && !gv.n.B0(str)) {
                z10 = false;
                if (z10 && t1.h(str)) {
                    if (!((str2 == null || gv.n.B0(str2)) ? true : true) && t1.h(str2)) {
                        a(new qi.h(7, str, str2));
                        return;
                    }
                    return;
                }
            }
            z10 = true;
            if (z10) {
            }
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new x0());
        }
    }

    @JavascriptInterface
    public final void trackClick(String str) {
        Object obj;
        ih.p pVar = this.f27477d;
        try {
            boolean z10 = false;
            hh.g.b(pVar.f20105d, 0, new y0(str), 3);
            if (!t1.i(str)) {
                return;
            }
            if (!((str == null || gv.n.B0(str)) ? true : true)) {
                obj = new JSONObject(str).opt("widgetId");
            } else {
                obj = null;
            }
            Context context = this.f27480h;
            kotlin.jvm.internal.i.f(context, "context");
            pi.h hVar = this.f27475b;
            sp.b.h0(context, pVar, new s1.s(hVar.f28475m, hVar.f28470h, hVar.f28471i), obj);
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new z0());
        }
    }

    @JavascriptInterface
    public final void trackDismiss() {
        ih.p pVar = this.f27477d;
        try {
            hh.g.b(pVar.f20105d, 0, new a1(), 3);
            Context context = this.f27480h;
            kotlin.jvm.internal.i.f(context, "context");
            pi.h hVar = this.f27475b;
            sp.b.i0(context, new s1.s(hVar.f28475m, hVar.f28470h, hVar.f28471i), pVar);
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new b1());
        }
    }

    @JavascriptInterface
    public final void trackEvent(String eventName, String str, String str2, String str3, boolean z10, boolean z11) {
        ih.p pVar = this.f27477d;
        try {
            boolean z12 = false;
            hh.g.b(pVar.f20105d, 0, new c1(eventName, str, str2, str3, z10, z11), 3);
            if (!((eventName == null || gv.n.B0(eventName)) ? true : true) && t1.h(eventName)) {
                this.f.getClass();
                ng.c w10 = tr.r.w(str, str2, str3, z10);
                if (z11) {
                    pi.h hVar = this.f27475b;
                    t1.a(w10, hVar.f28470h, hVar.f28471i, hVar.f28475m);
                }
                Context context = this.f27480h;
                kotlin.jvm.internal.i.f(context, "context");
                String appId = this.f27481i;
                kotlin.jvm.internal.i.g(eventName, "eventName");
                kotlin.jvm.internal.i.g(appId, "appId");
                ih.p b10 = qg.g0.b(appId);
                if (b10 != null) {
                    qg.w.f29578a.getClass();
                    qg.w.d(b10).c(context, eventName, w10);
                }
            }
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new d1());
        }
    }

    @JavascriptInterface
    public final void trackRating(String str) {
        ih.p pVar = this.f27477d;
        try {
            boolean z10 = false;
            hh.g.b(pVar.f20105d, 0, new e1(str), 3);
            if (!((str == null || gv.n.B0(str)) ? true : true) && t1.h(str) && t1.i(str)) {
                double d10 = new JSONObject(str).getDouble("rating");
                ng.c cVar = new ng.c();
                cVar.a(Double.valueOf(d10), "rating");
                pi.h hVar = this.f27475b;
                t1.a(cVar, hVar.f28470h, hVar.f28471i, hVar.f28475m);
                Context context = this.f27480h;
                kotlin.jvm.internal.i.f(context, "context");
                String appId = this.f27481i;
                kotlin.jvm.internal.i.g(appId, "appId");
                ih.p b10 = qg.g0.b(appId);
                if (b10 != null) {
                    qg.w.f29578a.getClass();
                    qg.w.d(b10).c(context, "MOE_APP_RATED", cVar);
                }
            }
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new f1());
        }
    }
}
