package rr;

import android.content.Intent;
import androidx.appcompat.app.b;
import g6.g;
/* compiled from: CustomActivity.java */
/* loaded from: classes2.dex */
public class a extends androidx.appcompat.app.c {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ int f30996v = 0;

    public static String q0() {
        return defpackage.b.g();
    }

    public void n0() {
        setResult(-1, new Intent());
        finish();
    }

    public void o0() {
        b.a aVar = new b.a(this);
        aVar.f1046a.f1031g = "Are you sure you want to exit?";
        aVar.b("Ok", new g(13, this));
        aVar.a("Cancel", new yi.d(18));
        aVar.create().show();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    public String p0() {
        return defpackage.c.n();
    }

    public void t0() {
    }

    public void r0(b bVar) {
    }

    public void s0(b bVar) {
    }
}
