package com.moengage.richnotification.internal;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import fj.e;
import hh.g;
import ih.p;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.v;
/* compiled from: MoERichPushIntentService.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/moengage/richnotification/internal/MoERichPushIntentService;", "Landroid/app/IntentService;", "<init>", "()V", "rich-notification_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class MoERichPushIntentService extends IntentService {

    /* renamed from: u  reason: collision with root package name */
    public final String f10246u;

    /* compiled from: MoERichPushIntentService.kt */
    /* loaded from: classes.dex */
    public static final class a extends k implements ss.a<String> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" onHandleIntent() : Will attempt to process intent", MoERichPushIntentService.this.f10246u);
        }
    }

    /* compiled from: MoERichPushIntentService.kt */
    /* loaded from: classes.dex */
    public static final class b extends k implements ss.a<String> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" onHandleIntent() : couldn't find SDK Instance.", MoERichPushIntentService.this.f10246u);
        }
    }

    /* compiled from: MoERichPushIntentService.kt */
    /* loaded from: classes.dex */
    public static final class c extends k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f10250v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ v f10251w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f10252x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, v vVar, int i6) {
            super(0);
            this.f10250v = str;
            this.f10251w = vVar;
            this.f10252x = i6;
        }

        @Override // ss.a
        public final String invoke() {
            return MoERichPushIntentService.this.f10246u + " onHandleIntent() : Navigation Direction: " + ((Object) this.f10250v) + ", current index: " + this.f10251w.f23467u + ", Total image count: " + this.f10252x;
        }
    }

    /* compiled from: MoERichPushIntentService.kt */
    /* loaded from: classes.dex */
    public static final class d extends k implements ss.a<String> {
        public d() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" onHandleIntent() : Current index is -1 resetting to starting position.", MoERichPushIntentService.this.f10246u);
        }
    }

    /* compiled from: MoERichPushIntentService.kt */
    /* loaded from: classes.dex */
    public static final class e extends k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ v f10255v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(v vVar) {
            super(0);
            this.f10255v = vVar;
        }

        @Override // ss.a
        public final String invoke() {
            return MoERichPushIntentService.this.f10246u + " onHandleIntent() : Next index: " + this.f10255v.f23467u;
        }
    }

    /* compiled from: MoERichPushIntentService.kt */
    /* loaded from: classes.dex */
    public static final class f extends k implements ss.a<String> {
        public f() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" onHandleIntent() : ", MoERichPushIntentService.this.f10246u);
        }
    }

    public MoERichPushIntentService() {
        super("RichPushIntentService");
        this.f10246u = "RichPush_4.3.2_MoERichPushIntentService";
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        Bundle extras;
        try {
            hh.a aVar = g.f17610d;
            g.a.b(0, new a(), 3);
            if (intent == null || (extras = intent.getExtras()) == null) {
                return;
            }
            di.b.v(extras, this.f10246u);
            ca.a.Z0(extras);
            e.a.a();
            p c10 = fj.e.c(extras);
            if (c10 == null) {
                g.a.b(0, new b(), 3);
                return;
            }
            g gVar = c10.f20105d;
            v vVar = new v();
            vVar.f23467u = extras.getInt("image_index", -1);
            int i6 = extras.getInt("image_count", -1);
            String string = extras.getString("nav_dir", "next");
            g.b(gVar, 0, new c(string, vVar, i6), 3);
            if (i6 == -1) {
                return;
            }
            extras.putBoolean("moe_re_notify", true);
            if (vVar.f23467u == -1) {
                g.b(gVar, 0, new d(), 3);
                extras.putInt("image_index", 0);
                fj.e a10 = e.a.a();
                Context applicationContext = getApplicationContext();
                i.f(applicationContext, "applicationContext");
                a10.d(applicationContext, extras);
                return;
            }
            if (i.b(string, "next")) {
                int i10 = vVar.f23467u + 1;
                vVar.f23467u = i10;
                if (i10 >= i6) {
                    vVar.f23467u = 0;
                }
            } else if (i.b(string, "previous")) {
                int i11 = vVar.f23467u - 1;
                vVar.f23467u = i11;
                if (i11 < 0) {
                    vVar.f23467u = i6 - 1;
                }
            } else {
                throw new IllegalStateException("Not a valid direction");
            }
            g.b(gVar, 0, new e(vVar), 3);
            extras.putInt("image_index", vVar.f23467u);
            fj.e a11 = e.a.a();
            Context applicationContext2 = getApplicationContext();
            i.f(applicationContext2, "applicationContext");
            a11.d(applicationContext2, extras);
        } catch (Throwable th2) {
            hh.a aVar2 = g.f17610d;
            g.a.a(1, th2, new f());
        }
    }
}
