package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import androidx.activity.ComponentActivity;
/* compiled from: ComponentActivity.java */
/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f962u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ IntentSender.SendIntentException f963v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity.b f964w;

    public f(ComponentActivity.b bVar, int i6, IntentSender.SendIntentException sendIntentException) {
        this.f964w = bVar;
        this.f962u = i6;
        this.f963v = sendIntentException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f964w.a(this.f962u, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f963v));
    }
}
