package y3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import org.json.JSONObject;
/* compiled from: HttpClient.kt */
/* loaded from: classes.dex */
public final class i extends c {
    public final /* synthetic */ j A;
    public final /* synthetic */ HttpURLConnection B;
    public final /* synthetic */ OutputStream C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, HttpURLConnection httpURLConnection, OutputStream outputStream) {
        super(httpURLConnection, outputStream);
        this.A = jVar;
        this.B = httpURLConnection;
        this.C = outputStream;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00ac A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    @Override // y3.c, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        InputStream inputStream;
        BufferedReader bufferedReader;
        l gVar;
        OutputStream outputStream = this.f38199v;
        j jVar = this.A;
        try {
            String apiKey = jVar.f38240a.f33786a;
            kotlin.jvm.internal.i.g(apiKey, "apiKey");
            this.f38200w = apiKey;
            this.f38202y = jVar.f38240a.g();
            a();
            if (outputStream != null) {
                outputStream.close();
            }
            int responseCode = this.B.getResponseCode();
            InputStream inputStream2 = null;
            try {
                try {
                    inputStream = j.a(this.f38198u);
                } catch (IOException unused) {
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = inputStream2;
            }
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream, gv.a.f16927b);
                if (inputStreamReader instanceof BufferedReader) {
                    bufferedReader = (BufferedReader) inputStreamReader;
                } else {
                    bufferedReader = new BufferedReader(inputStreamReader, 8192);
                }
                String c12 = ca.a.c1(bufferedReader);
                ca.a.z(bufferedReader, null);
                JSONObject jSONObject = new JSONObject(c12);
                if (responseCode == 200) {
                    gVar = new m();
                } else if (responseCode == 400) {
                    gVar = new b(jSONObject);
                } else if (responseCode == 413) {
                    gVar = new k(jSONObject);
                } else if (responseCode == 429) {
                    gVar = new o(jSONObject);
                } else if (responseCode == 408) {
                    gVar = new n();
                } else {
                    gVar = new g(jSONObject);
                }
                this.f38203z = gVar;
                inputStream.close();
            } catch (IOException unused2) {
                inputStream2 = inputStream;
                this.f38203z = new n();
                if (inputStream2 != null) {
                    inputStream2.close();
                }
            } catch (Throwable th3) {
                th = th3;
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } finally {
            super.close();
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
