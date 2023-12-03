package y3;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
/* compiled from: HttpClient.kt */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final u3.e f38240a;

    public j(u3.e configuration) {
        kotlin.jvm.internal.i.g(configuration, "configuration");
        this.f38240a = configuration;
    }

    public static InputStream a(HttpURLConnection connection) {
        kotlin.jvm.internal.i.g(connection, "connection");
        try {
            InputStream inputStream = connection.getInputStream();
            kotlin.jvm.internal.i.f(inputStream, "{\n            connection.inputStream\n        }");
            return inputStream;
        } catch (IOException unused) {
            InputStream errorStream = connection.getErrorStream();
            kotlin.jvm.internal.i.f(errorStream, "{\n            connection.errorStream\n        }");
            return errorStream;
        }
    }

    public final i b() {
        boolean z10;
        String str;
        u3.e eVar = this.f38240a;
        String k10 = eVar.k();
        if (k10 != null && k10.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            str = eVar.k();
            kotlin.jvm.internal.i.d(str);
        } else if (eVar.l() == 2) {
            if (eVar.n()) {
                str = "https://api.eu.amplitude.com/batch";
            } else {
                str = "https://api.eu.amplitude.com/2/httpapi";
            }
        } else if (eVar.n()) {
            str = "https://api2.amplitude.com/batch";
        } else {
            str = "https://api2.amplitude.com/2/httpapi";
        }
        try {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection());
            if (uRLConnection != null) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
                httpURLConnection.setRequestProperty("Accept", "application/json");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.setReadTimeout(201000);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                kotlin.jvm.internal.i.f(outputStream, "connection.outputStream");
                return new i(this, httpURLConnection, outputStream);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        } catch (MalformedURLException e10) {
            throw new IOException(kotlin.jvm.internal.i.n(str, "Attempted to use malformed url: "), e10);
        }
    }
}
