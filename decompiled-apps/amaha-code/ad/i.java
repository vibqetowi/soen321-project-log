package ad;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.firebase.FirebaseException;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;
import v9.o;
/* compiled from: NetworkClient.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final Context f506a;

    /* renamed from: b  reason: collision with root package name */
    public final String f507b;

    /* renamed from: c  reason: collision with root package name */
    public final String f508c;

    /* renamed from: d  reason: collision with root package name */
    public final String f509d;

    /* renamed from: e  reason: collision with root package name */
    public final re.b<pe.f> f510e;

    public i(sc.e eVar) {
        eVar.b();
        eVar.b();
        re.b<pe.f> bVar = ((d) ((zc.d) eVar.c(zc.d.class))).f484b;
        Context context = eVar.f31432a;
        o.h(context);
        sc.f fVar = eVar.f31434c;
        o.h(fVar);
        o.h(bVar);
        this.f506a = context;
        this.f507b = fVar.f31444a;
        this.f508c = fVar.f31445b;
        String str = fVar.f31449g;
        this.f509d = str;
        if (str != null) {
            this.f510e = bVar;
            return;
        }
        throw new IllegalArgumentException("FirebaseOptions#getProjectId cannot be null.");
    }

    public final String a() {
        Context context = this.f506a;
        try {
            byte[] a10 = aa.a.a(context, context.getPackageName());
            if (a10 == null) {
                Log.e("ad.i", "Could not get fingerprint hash for package: " + context.getPackageName());
                return null;
            }
            return f6.b.r0(a10);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("ad.i", "No such package: " + context.getPackageName(), e10);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034 A[Catch: all -> 0x0101, TryCatch #3 {all -> 0x0101, blocks: (B:3:0x0007, B:5:0x001f, B:10:0x0034, B:11:0x0039, B:13:0x005c, B:19:0x0070, B:21:0x0079, B:26:0x0094, B:32:0x00a3, B:35:0x00af, B:36:0x00ec, B:20:0x0075, B:7:0x002a, B:12:0x0057, B:22:0x008a, B:24:0x0090), top: B:54:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070 A[Catch: all -> 0x0101, TryCatch #3 {all -> 0x0101, blocks: (B:3:0x0007, B:5:0x001f, B:10:0x0034, B:11:0x0039, B:13:0x005c, B:19:0x0070, B:21:0x0079, B:26:0x0094, B:32:0x00a3, B:35:0x00af, B:36:0x00ec, B:20:0x0075, B:7:0x002a, B:12:0x0057, B:22:0x008a, B:24:0x0090), top: B:54:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075 A[Catch: all -> 0x0101, TryCatch #3 {all -> 0x0101, blocks: (B:3:0x0007, B:5:0x001f, B:10:0x0034, B:11:0x0039, B:13:0x005c, B:19:0x0070, B:21:0x0079, B:26:0x0094, B:32:0x00a3, B:35:0x00af, B:36:0x00ec, B:20:0x0075, B:7:0x002a, B:12:0x0057, B:22:0x008a, B:24:0x0090), top: B:54:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090 A[Catch: all -> 0x00ed, LOOP:0: B:22:0x008a->B:24:0x0090, LOOP_END, TRY_LEAVE, TryCatch #3 {all -> 0x0101, blocks: (B:3:0x0007, B:5:0x001f, B:10:0x0034, B:11:0x0039, B:13:0x005c, B:19:0x0070, B:21:0x0079, B:26:0x0094, B:32:0x00a3, B:35:0x00af, B:36:0x00ec, B:20:0x0075, B:7:0x002a, B:12:0x0057, B:22:0x008a, B:24:0x0090), top: B:54:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3 A[Catch: all -> 0x0101, TRY_LEAVE, TryCatch #3 {all -> 0x0101, blocks: (B:3:0x0007, B:5:0x001f, B:10:0x0034, B:11:0x0039, B:13:0x005c, B:19:0x0070, B:21:0x0079, B:26:0x0094, B:32:0x00a3, B:35:0x00af, B:36:0x00ec, B:20:0x0075, B:7:0x002a, B:12:0x0057, B:22:0x008a, B:24:0x0090), top: B:54:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af A[Catch: all -> 0x0101, TRY_ENTER, TryCatch #3 {all -> 0x0101, blocks: (B:3:0x0007, B:5:0x001f, B:10:0x0034, B:11:0x0039, B:13:0x005c, B:19:0x0070, B:21:0x0079, B:26:0x0094, B:32:0x00a3, B:35:0x00af, B:36:0x00ec, B:20:0x0075, B:7:0x002a, B:12:0x0057, B:22:0x008a, B:24:0x0090), top: B:54:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094 A[EDGE_INSN: B:55:0x0094->B:26:0x0094 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String b(URL url, byte[] bArr, j jVar) {
        String str;
        int responseCode;
        boolean z10;
        InputStream errorStream;
        StringBuilder sb2;
        BufferedReader bufferedReader;
        String readLine;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        boolean z11 = true;
        try {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            pe.f fVar = this.f510e.get();
            if (fVar != null) {
                try {
                    str = (String) ya.k.a(fVar.a());
                } catch (Exception unused) {
                    Log.w("ad.i", "Unable to get heartbeats!");
                }
                if (str != null) {
                    httpURLConnection.setRequestProperty("X-Firebase-Client", str);
                }
                httpURLConnection.setRequestProperty("X-Android-Package", this.f506a.getPackageName());
                httpURLConnection.setRequestProperty("X-Android-Cert", a());
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), bArr.length);
                bufferedOutputStream.write(bArr, 0, bArr.length);
                bufferedOutputStream.close();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 && responseCode < 300) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    errorStream = httpURLConnection.getInputStream();
                } else {
                    errorStream = httpURLConnection.getErrorStream();
                }
                sb2 = new StringBuilder();
                bufferedReader = new BufferedReader(new InputStreamReader(errorStream, "UTF-8"));
                while (true) {
                    readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        break;
                    }
                    sb2.append(readLine);
                }
                bufferedReader.close();
                String sb3 = sb2.toString();
                if (responseCode >= 200 || responseCode >= 300) {
                    z11 = false;
                }
                if (!z11) {
                    jVar.f512b = 0L;
                    jVar.f513c = -1L;
                    return sb3;
                }
                jVar.a(responseCode);
                JSONObject jSONObject = new JSONObject(new JSONObject(sb3).optString("error"));
                int optInt = jSONObject.optInt("code");
                String optString = jSONObject.optString("message");
                throw new FirebaseException("Error returned from API. code: " + optInt + " body: " + optString);
            }
            str = null;
            if (str != null) {
            }
            httpURLConnection.setRequestProperty("X-Android-Package", this.f506a.getPackageName());
            httpURLConnection.setRequestProperty("X-Android-Cert", a());
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream(), bArr.length);
            bufferedOutputStream2.write(bArr, 0, bArr.length);
            bufferedOutputStream2.close();
            responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200) {
            }
            z10 = false;
            if (!z10) {
            }
            sb2 = new StringBuilder();
            bufferedReader = new BufferedReader(new InputStreamReader(errorStream, "UTF-8"));
            while (true) {
                readLine = bufferedReader.readLine();
                if (readLine != null) {
                }
                sb2.append(readLine);
            }
            bufferedReader.close();
            String sb32 = sb2.toString();
            if (responseCode >= 200) {
            }
            z11 = false;
            if (!z11) {
            }
        } finally {
            httpURLConnection.disconnect();
        }
    }
}
