package xh;

import android.net.Uri;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.moengage.core.internal.exception.CryptographyFailedException;
import com.moengage.core.internal.exception.SecurityModuleMissingException;
import gv.n;
import hh.g;
import ih.p;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import nd.z;
import org.json.JSONObject;
import r1.b0;
/* compiled from: RestClient.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final b f37785a;

    /* renamed from: b  reason: collision with root package name */
    public final p f37786b;

    /* renamed from: c  reason: collision with root package name */
    public final String f37787c;

    /* compiled from: RestClient.kt */
    /* loaded from: classes.dex */
    public static final class a extends k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ String f37788u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.f37788u = str;
        }

        @Override // ss.a
        public final String invoke() {
            return this.f37788u;
        }
    }

    public e(b bVar, p sdkInstance) {
        i.g(sdkInstance, "sdkInstance");
        this.f37785a = bVar;
        this.f37786b = sdkInstance;
        this.f37787c = "Core_RestClient " + ((Object) bVar.f37778e.getEncodedPath()) + ' ' + b0.j(bVar.f37774a);
    }

    public static String c(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb2.append(readLine);
                } else {
                    hs.k kVar = hs.k.f19476a;
                    ca.a.z(inputStream, null);
                    String sb3 = sb2.toString();
                    i.f(sb3, "stringBuilder.toString()");
                    return sb3;
                }
            } finally {
            }
        }
    }

    public static String f(JSONObject jSONObject, String str) {
        z a10;
        String str2 = zh.d.f39405a;
        i.f(jSONObject.toString(), "requestBody.toString()");
        zh.a aVar = zh.d.f39406b;
        kh.a aVar2 = kh.a.MODULE_NOT_FOUND;
        if (aVar == null) {
            a10 = new z();
        } else {
            a10 = aVar.a();
        }
        kh.a aVar3 = (kh.a) a10.f26149c;
        if (aVar3 != aVar2) {
            if (aVar3 != kh.a.FAILURE) {
                String str3 = (String) a10.f26148b;
                if (str3 != null) {
                    return str3;
                }
                throw new CryptographyFailedException("Encryption failed");
            }
            throw new CryptographyFailedException("Cryptography failed");
        }
        throw new SecurityModuleMissingException();
    }

    public final void a(HttpURLConnection httpURLConnection, JSONObject jSONObject) {
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Accept-Charset", "UTF-8");
        httpURLConnection.setRequestProperty("Content-type", "application/json");
        OutputStream outputStream = httpURLConnection.getOutputStream();
        d(this.f37787c + " addBody(): Request Body: " + jSONObject);
        String jSONObject2 = jSONObject.toString();
        i.f(jSONObject2, "requestBody.toString()");
        Charset forName = Charset.forName("UTF-8");
        i.f(forName, "forName(charsetName)");
        byte[] bytes = jSONObject2.getBytes(forName);
        i.f(bytes, "this as java.lang.String).getBytes(charset)");
        outputStream.write(bytes);
        outputStream.close();
    }

    public final void b(HttpURLConnection httpURLConnection, Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            d(this.f37787c + " addHeaders() " + key + " : " + value);
            httpURLConnection.addRequestProperty(key, value);
        }
    }

    public final void d(String str) {
        if (this.f37785a.f37781i) {
            g.b(this.f37786b.f20105d, 4, new a(str), 2);
        }
    }

    public final xh.a e() {
        xh.a cVar;
        JSONObject jSONObject;
        HttpURLConnection httpURLConnection;
        String str = this.f37787c;
        b bVar = this.f37785a;
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                int i6 = bVar.f37774a;
                Uri uri = bVar.f37778e;
                if (i6 == 2 && bVar.f37780h) {
                    d(i.n(bVar.f37776c, " execute() : Request Body: "));
                    jSONObject = new JSONObject();
                    String str2 = bVar.f37779g;
                    i.f(str2, "request.encryptionKey");
                    JSONObject jSONObject2 = bVar.f37776c;
                    i.f(jSONObject2, "request.requestBody");
                    jSONObject.put("data", f(jSONObject2, str2));
                } else {
                    jSONObject = bVar.f37776c;
                }
                String uri2 = uri.toString();
                i.f(uri2, "request.uri.toString()");
                URL url = new URL(uri2);
                d(str + " execute(): Request url: " + uri2);
                if (i.b("https", uri.getScheme())) {
                    URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
                    if (uRLConnection != null) {
                        httpURLConnection = (HttpsURLConnection) uRLConnection;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                    }
                } else {
                    URLConnection uRLConnection2 = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
                    if (uRLConnection2 != null) {
                        httpURLConnection = (HttpURLConnection) uRLConnection2;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
                    }
                }
                httpURLConnection2 = httpURLConnection;
                Map<String, String> map = bVar.f37775b;
                i.f(map, "request.headersMap");
                b(httpURLConnection2, map);
                String str3 = bVar.f37777d;
                i.f(str3, "request.contentType");
                httpURLConnection2.setRequestProperty("Content-type", str3);
                int i10 = bVar.f37774a;
                defpackage.c.y(i10, "request.requestType");
                httpURLConnection2.setRequestMethod(b0.d(i10));
                int i11 = bVar.f * 1000;
                httpURLConnection2.setConnectTimeout(i11);
                httpURLConnection2.setReadTimeout(i11);
                if (jSONObject != null && jSONObject.length() > 0) {
                    a(httpURLConnection2, jSONObject);
                }
                cVar = g(httpURLConnection2);
            } catch (Exception e10) {
                if (e10 instanceof SecurityModuleMissingException) {
                    cVar = new c(-2, "Encryption failed!");
                    if (0 == 0) {
                        return cVar;
                    }
                } else if (e10 instanceof CryptographyFailedException) {
                    cVar = new c(-1, "Encryption failed!");
                    if (0 == 0) {
                        return cVar;
                    }
                } else {
                    String n10 = i.n(" execute() : ", str);
                    if (bVar.f37781i) {
                        this.f37786b.f20105d.a(1, e10, new f(n10));
                    }
                    if (0 != 0) {
                        httpURLConnection2.disconnect();
                    }
                    return new c(-100, "");
                }
            }
            httpURLConnection2.disconnect();
            return cVar;
        } catch (Throwable th2) {
            if (0 != 0) {
                httpURLConnection2.disconnect();
            }
            throw th2;
        }
    }

    public final xh.a g(HttpURLConnection httpURLConnection) {
        boolean z10;
        String c10;
        boolean z11;
        String key;
        int responseCode = httpURLConnection.getResponseCode();
        String encryptionKeyType = httpURLConnection.getHeaderField("MOE-PAYLOAD-ENC-KEY-TYPE");
        StringBuilder sb2 = new StringBuilder();
        String str = this.f37787c;
        sb2.append(str);
        sb2.append("  getResponse() : encryptionKeyType: ");
        sb2.append((Object) encryptionKeyType);
        d(sb2.toString());
        boolean z12 = false;
        if (responseCode == 200) {
            z10 = true;
        } else {
            z10 = false;
        }
        p pVar = this.f37786b;
        String str2 = null;
        if (z10) {
            InputStream inputStream = httpURLConnection.getInputStream();
            i.f(inputStream, "urlConnection.inputStream");
            c10 = c(inputStream);
            d(str + " getResponse() : Response: API Success: response code : " + responseCode + " response body : " + c10);
        } else {
            InputStream errorStream = httpURLConnection.getErrorStream();
            i.f(errorStream, "urlConnection.errorStream");
            c10 = c(errorStream);
            String str3 = str + " getResponse() : Response: API Failed: response code: " + responseCode + " reason: " + c10;
            if (this.f37785a.f37781i) {
                pVar.f20105d.a(1, null, new f(str3));
            }
        }
        if (encryptionKeyType != null && !n.B0(encryptionKeyType)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            if (z10) {
                return new d(c10);
            }
            return new c(responseCode, c10);
        }
        String encryptedResponse = new JSONObject(c10).getString("data");
        String str4 = zh.d.f39405a;
        i.f(encryptionKeyType, "encryptionKeyType");
        String upperCase = encryptionKeyType.toUpperCase(Locale.ROOT);
        i.f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        int f = v.g.f(upperCase);
        th.a remoteConfig = pVar.f20104c;
        defpackage.d.j(f, "secretKeyType");
        i.g(remoteConfig, "remoteConfig");
        if (f == 1) {
            key = "28caa46a6e9c77fbe291287e4fec061f";
        } else {
            key = remoteConfig.f33017i.f8126v;
        }
        i.f(encryptedResponse, "encryptedResponse");
        i.g(key, "key");
        zh.a aVar = zh.d.f39406b;
        if (aVar != null) {
            z a10 = aVar.a();
            hh.a aVar2 = g.f17610d;
            g.a.b(0, new zh.b(a10), 3);
            str2 = (String) a10.f26148b;
        }
        if (!((str2 == null || n.B0(str2)) ? true : true)) {
            d(str + " response code : " + responseCode + " decrypted response body : " + c10);
            if (z10) {
                return new d(str2);
            }
            return new c(responseCode, str2);
        }
        throw new CryptographyFailedException("Decryption failed");
    }
}
