package f6;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import hh.g;
import hs.k;
import ih.p;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.x;
import mi.e2;
import mi.j2;
import mi.t1;
import ng.c;
import org.json.JSONObject;
import pi.d;
import qg.g0;
import qg.w;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f14860u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f14861v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f14862w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f14863x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ Object f14864y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Object f14865z;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i6) {
        this.f14860u = i6;
        this.f14861v = obj;
        this.f14862w = obj2;
        this.f14863x = obj3;
        this.f14864y = obj4;
        this.f14865z = obj5;
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [T, java.lang.String] */
    @Override // java.lang.Runnable
    public final void run() {
        BufferedReader bufferedReader;
        int i6 = this.f14860u;
        Object obj = this.f14865z;
        Object obj2 = this.f14864y;
        Object obj3 = this.f14863x;
        Object obj4 = this.f14862w;
        Object obj5 = this.f14861v;
        switch (i6) {
            case 0:
                URL openIdKeyUrl = (URL) obj5;
                x result = (x) obj4;
                String kid = (String) obj3;
                ReentrantLock lock = (ReentrantLock) obj2;
                Condition condition = (Condition) obj;
                i.g(openIdKeyUrl, "$openIdKeyUrl");
                i.g(result, "$result");
                i.g(kid, "$kid");
                i.g(lock, "$lock");
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(openIdKeyUrl.openConnection());
                if (uRLConnection != null) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                    try {
                        try {
                            InputStream inputStream = httpURLConnection.getInputStream();
                            i.f(inputStream, "connection.inputStream");
                            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, gv.a.f16927b);
                            if (inputStreamReader instanceof BufferedReader) {
                                bufferedReader = (BufferedReader) inputStreamReader;
                            } else {
                                bufferedReader = new BufferedReader(inputStreamReader, 8192);
                            }
                            String c12 = ca.a.c1(bufferedReader);
                            httpURLConnection.getInputStream().close();
                            result.f23469u = new JSONObject(c12).optString(kid);
                            httpURLConnection.disconnect();
                            lock.lock();
                        } catch (Throwable th2) {
                            httpURLConnection.disconnect();
                            lock.lock();
                            try {
                                condition.signal();
                                k kVar = k.f19476a;
                                throw th2;
                            } finally {
                            }
                        }
                    } catch (Exception e10) {
                        String name = b.class.getName();
                        String message = e10.getMessage();
                        if (message == null) {
                            message = "Error getting public key";
                        }
                        Log.d(name, message);
                        httpURLConnection.disconnect();
                        lock.lock();
                        try {
                            condition.signal();
                            k kVar2 = k.f19476a;
                        } finally {
                        }
                    }
                    try {
                        condition.signal();
                        k kVar3 = k.f19476a;
                        return;
                    } finally {
                    }
                }
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            default:
                FrameLayout root = (FrameLayout) obj5;
                View view = (View) obj4;
                e2 this$0 = (e2) obj3;
                Activity activity = (Activity) obj2;
                d payload = (d) obj;
                i.g(root, "$root");
                i.g(view, "$view");
                i.g(this$0, "this$0");
                i.g(activity, "$activity");
                i.g(payload, "$payload");
                int indexOfChild = root.indexOfChild(view);
                p sdkInstance = this$0.f25171a;
                if (indexOfChild == -1) {
                    g.b(sdkInstance.f20105d, 0, new j2(this$0), 3);
                    return;
                }
                this$0.e(activity, view, payload);
                Context applicationContext = activity.getApplicationContext();
                i.f(applicationContext, "activity.applicationContext");
                this$0.d(payload);
                i.g(sdkInstance, "sdkInstance");
                c cVar = new c();
                t1.a(cVar, payload.b(), payload.c(), payload.a());
                cVar.b();
                String appId = (String) sdkInstance.f20102a.f5133c;
                i.g(appId, "appId");
                p b10 = g0.b(appId);
                if (b10 != null) {
                    w.f29578a.getClass();
                    w.d(b10).c(applicationContext, "MOE_IN_APP_AUTO_DISMISS", cVar);
                    return;
                }
                return;
        }
    }
}
