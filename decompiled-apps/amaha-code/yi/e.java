package yi;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.widget.RelativeLayout;
import i5.n;
import ih.p;
import je.o;
import mi.e2;
import mi.h1;
import mi.i1;
import mi.j1;
import mi.t1;
/* compiled from: ShowTestInApp.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final Context f38637a;

    /* renamed from: b  reason: collision with root package name */
    public final p f38638b;

    /* renamed from: c  reason: collision with root package name */
    public final String f38639c;

    /* renamed from: d  reason: collision with root package name */
    public final String f38640d = "InApp_6.5.0_ShowTestInApp";

    /* compiled from: ShowTestInApp.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" displayTestInAppIfPossible() : Cannot show in-app. View creation failed.", e.this.f38640d);
        }
    }

    /* compiled from: ShowTestInApp.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" displayTestInAppIfPossible() : Cannot show in-app in the current orientation.", e.this.f38640d);
        }
    }

    public e(Context context, p pVar, String str) {
        this.f38637a = context;
        this.f38638b = pVar;
        this.f38639c = str;
    }

    public static void b(String str) {
        Activity b10 = j1.b();
        if (b10 == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(b10);
        builder.setMessage(str).setTitle("Test in-app error").setPositiveButton("OK", new d(0));
        b10.runOnUiThread(new o(12, builder));
    }

    public final void a(pi.d dVar) {
        i1.f25206a.getClass();
        p pVar = this.f38638b;
        h1 b10 = i1.b(pVar);
        if (kotlin.jvm.internal.i.b("SELF_HANDLED", dVar.g())) {
            pi.m mVar = (pi.m) dVar;
            i1.a(pVar);
            return;
        }
        Context context = this.f38637a;
        n e10 = t1.e(context);
        e2 e2Var = b10.f25200d;
        RelativeLayout c10 = e2Var.c(dVar, e10);
        hh.g gVar = pVar.f20105d;
        if (c10 == null) {
            hh.g.b(gVar, 0, new a(), 3);
            b(kotlin.jvm.internal.i.n(this.f38639c, "Something went wrong in creating the in-app view. Cannot show in-app.\n    Try again or Contact MoEngage Support. Draft-id: "));
        } else if (t1.f(context, c10)) {
            b("Created in-app exceeds screen dimensions.\n Cannot show in-app, please check and edit the in-app template on MoEngage Dashboard.");
        } else if (!t1.c(t1.d(context), dVar.f())) {
            hh.g.b(gVar, 0, new b(), 3);
            b("Cannot show in-app in the current orientation");
        } else {
            Activity b11 = j1.b();
            if (b11 == null) {
                return;
            }
            e2Var.a(b11, c10, dVar, false);
        }
    }
}
