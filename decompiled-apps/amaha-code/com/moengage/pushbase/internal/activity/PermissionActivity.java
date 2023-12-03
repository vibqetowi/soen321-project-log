package com.moengage.pushbase.internal.activity;

import am.w;
import android.os.Bundle;
import hh.g;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
/* compiled from: PermissionActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/moengage/pushbase/internal/activity/PermissionActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "pushbase_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class PermissionActivity extends androidx.appcompat.app.c {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f10225x = 0;

    /* renamed from: v  reason: collision with root package name */
    public final String f10226v = "PushBase_6.6.0_PermissionActivity";

    /* renamed from: w  reason: collision with root package name */
    public final androidx.activity.result.c<String> f10227w;

    /* compiled from: PermissionActivity.kt */
    /* loaded from: classes.dex */
    public static final class a extends k implements ss.a<String> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" onCreate() : ", PermissionActivity.this.f10226v);
        }
    }

    /* compiled from: PermissionActivity.kt */
    /* loaded from: classes.dex */
    public static final class b extends k implements ss.a<String> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" onPause() : ", PermissionActivity.this.f10226v);
        }
    }

    /* compiled from: PermissionActivity.kt */
    /* loaded from: classes.dex */
    public static final class c extends k implements ss.a<String> {
        public c() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" onResume() : ", PermissionActivity.this.f10226v);
        }
    }

    /* compiled from: PermissionActivity.kt */
    /* loaded from: classes.dex */
    public static final class d extends k implements ss.a<String> {
        public d() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" onStart() : ", PermissionActivity.this.f10226v);
        }
    }

    /* compiled from: PermissionActivity.kt */
    /* loaded from: classes.dex */
    public static final class e extends k implements ss.a<String> {
        public e() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" onStop() : ", PermissionActivity.this.f10226v);
        }
    }

    public PermissionActivity() {
        androidx.activity.result.c<String> registerForActivityResult = registerForActivityResult(new e.c(), new w(10, this));
        i.f(registerForActivityResult, "registerForActivityResul…}\n            }\n        }");
        this.f10227w = registerForActivityResult;
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hh.a aVar = g.f17610d;
        g.a.b(0, new a(), 3);
        try {
            g.a.b(0, new hj.a(this), 3);
            this.f10227w.a("android.permission.POST_NOTIFICATIONS");
        } catch (Throwable th2) {
            hh.a aVar2 = g.f17610d;
            g.a.a(1, th2, new hj.b(this));
        }
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onPause() {
        super.onPause();
        hh.a aVar = g.f17610d;
        g.a.b(0, new b(), 3);
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onResume() {
        super.onResume();
        hh.a aVar = g.f17610d;
        g.a.b(0, new c(), 3);
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onStart() {
        super.onStart();
        hh.a aVar = g.f17610d;
        g.a.b(0, new d(), 3);
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onStop() {
        super.onStop();
        hh.a aVar = g.f17610d;
        g.a.b(0, new e(), 3);
    }
}
