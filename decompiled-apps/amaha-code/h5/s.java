package h5;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import h5.q;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: GraphRequestAsyncTask.kt */
/* loaded from: classes.dex */
public final class s extends AsyncTask<Void, Void, List<? extends u>> {

    /* renamed from: a  reason: collision with root package name */
    public final HttpURLConnection f17307a;

    /* renamed from: b  reason: collision with root package name */
    public final t f17308b;

    /* renamed from: c  reason: collision with root package name */
    public Exception f17309c;

    public s(t requests) {
        kotlin.jvm.internal.i.g(requests, "requests");
        this.f17307a = null;
        this.f17308b = requests;
    }

    public final void a(List<u> result) {
        if (b6.a.b(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.i.g(result, "result");
            super.onPostExecute(result);
            Exception exc = this.f17309c;
            if (exc != null) {
                w5.e0 e0Var = w5.e0.f36453a;
                kotlin.jvm.internal.i.f(String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1)), "java.lang.String.format(format, *args)");
                p pVar = p.f17269a;
            }
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }

    @Override // android.os.AsyncTask
    public final List<? extends u> doInBackground(Void[] voidArr) {
        ArrayList d10;
        if (b6.a.b(this)) {
            return null;
        }
        try {
            Void[] params = voidArr;
            if (b6.a.b(this)) {
                return null;
            }
            kotlin.jvm.internal.i.g(params, "params");
            try {
                HttpURLConnection httpURLConnection = this.f17307a;
                t tVar = this.f17308b;
                if (httpURLConnection == null) {
                    tVar.getClass();
                    String str = q.f17287j;
                    d10 = q.c.c(tVar);
                } else {
                    String str2 = q.f17287j;
                    d10 = q.c.d(tVar, httpURLConnection);
                }
                return d10;
            } catch (Exception e10) {
                this.f17309c = e10;
                return null;
            }
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(List<? extends u> list) {
        if (b6.a.b(this)) {
            return;
        }
        try {
            a(list);
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        Handler handler;
        t tVar = this.f17308b;
        if (b6.a.b(this)) {
            return;
        }
        try {
            super.onPreExecute();
            p pVar = p.f17269a;
            if (tVar.f17311u == null) {
                if (Thread.currentThread() instanceof HandlerThread) {
                    handler = new Handler();
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                tVar.f17311u = handler;
            }
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }

    public final String toString() {
        String str = "{RequestAsyncTask:  connection: " + this.f17307a + ", requests: " + this.f17308b + "}";
        kotlin.jvm.internal.i.f(str, "StringBuilder()\n        .append(\"{RequestAsyncTask: \")\n        .append(\" connection: \")\n        .append(connection)\n        .append(\", requests: \")\n        .append(requests)\n        .append(\"}\")\n        .toString()");
        return str;
    }
}
