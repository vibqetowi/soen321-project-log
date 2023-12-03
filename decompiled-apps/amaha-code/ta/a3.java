package ta;

import com.theinnerhour.b2b.utils.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class a3 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final URL f32460u;

    /* renamed from: v  reason: collision with root package name */
    public final byte[] f32461v;

    /* renamed from: w  reason: collision with root package name */
    public final y2 f32462w;

    /* renamed from: x  reason: collision with root package name */
    public final String f32463x;

    /* renamed from: y  reason: collision with root package name */
    public final Map f32464y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ b3 f32465z;

    public a3(b3 b3Var, String str, URL url, byte[] bArr, t.b bVar, y2 y2Var) {
        this.f32465z = b3Var;
        v9.o.e(str);
        this.f32460u = url;
        this.f32461v = bArr;
        this.f32462w = y2Var;
        this.f32463x = str;
        this.f32464y = bVar;
    }

    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00ec: MOVE  (r10 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:41:0x00eb */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0110 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0146 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        HttpURLConnection httpURLConnection;
        OutputStream outputStream;
        Map map;
        int i6;
        z2 z2Var;
        w3 w3Var;
        Map map2;
        IOException iOException;
        int i10;
        URLConnection openConnection;
        Map map3;
        InputStream inputStream;
        String str = this.f32463x;
        b3 b3Var = this.f32465z;
        w3 w3Var2 = b3Var.f32943u.D;
        y3.k(w3Var2);
        w3Var2.l();
        y3 y3Var = b3Var.f32943u;
        OutputStream outputStream2 = null;
        try {
            openConnection = this.f32460u.openConnection();
        } catch (IOException e10) {
            e = e10;
            httpURLConnection = null;
            outputStream = null;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
            outputStream = null;
        }
        if (openConnection instanceof HttpURLConnection) {
            httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            y3Var.getClass();
            httpURLConnection.setConnectTimeout(60000);
            y3Var.getClass();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                Map map4 = this.f32464y;
                if (map4 != null) {
                    for (Map.Entry entry : map4.entrySet()) {
                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                byte[] bArr = this.f32461v;
                if (bArr != null) {
                    f6 f6Var = b3Var.f32947v.A;
                    d6.H(f6Var);
                    byte[] J = f6Var.J(bArr);
                    w2 w2Var = y3Var.C;
                    y3.k(w2Var);
                    u2 u2Var = w2Var.H;
                    int length = J.length;
                    u2Var.c(Integer.valueOf(length), "Uploading data. size");
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                    httpURLConnection.setFixedLengthStreamingMode(length);
                    httpURLConnection.connect();
                    outputStream = httpURLConnection.getOutputStream();
                    try {
                        outputStream.write(J);
                        outputStream.close();
                    } catch (IOException e11) {
                        e = e11;
                        iOException = e;
                        map2 = null;
                        outputStream2 = outputStream;
                        i10 = 0;
                        if (outputStream2 != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        w3Var = y3Var.D;
                        y3.k(w3Var);
                        z2Var = new z2(this.f32463x, this.f32462w, i10, iOException, null, map2);
                        w3Var.p(z2Var);
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                        map = null;
                        outputStream2 = outputStream;
                        i6 = 0;
                        if (outputStream2 != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        w3 w3Var3 = y3Var.D;
                        y3.k(w3Var3);
                        w3Var3.p(new z2(this.f32463x, this.f32462w, i6, null, null, map));
                        throw th;
                    }
                }
                int responseCode = httpURLConnection.getResponseCode();
                try {
                    try {
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                byte[] bArr2 = new byte[Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID];
                                while (true) {
                                    int read = inputStream.read(bArr2);
                                    if (read <= 0) {
                                        break;
                                    }
                                    byteArrayOutputStream.write(bArr2, 0, read);
                                }
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                inputStream.close();
                                httpURLConnection.disconnect();
                                w3Var = y3Var.D;
                                y3.k(w3Var);
                                z2Var = new z2(this.f32463x, this.f32462w, responseCode, null, byteArray, headerFields);
                            } catch (Throwable th4) {
                                th = th4;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            inputStream = null;
                        }
                    } catch (IOException e12) {
                        e = e12;
                        iOException = e;
                        i10 = responseCode;
                        map2 = null;
                        if (outputStream2 != null) {
                            try {
                                outputStream2.close();
                            } catch (IOException e13) {
                                w2 w2Var2 = y3Var.C;
                                y3.k(w2Var2);
                                w2Var2.f32925z.d("Error closing HTTP compressed POST connection output stream. appId", w2.q(str), e13);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        w3Var = y3Var.D;
                        y3.k(w3Var);
                        z2Var = new z2(this.f32463x, this.f32462w, i10, iOException, null, map2);
                        w3Var.p(z2Var);
                        return;
                    } catch (Throwable th6) {
                        th = th6;
                        i6 = responseCode;
                        map = null;
                        if (outputStream2 != null) {
                            try {
                                outputStream2.close();
                            } catch (IOException e14) {
                                w2 w2Var3 = y3Var.C;
                                y3.k(w2Var3);
                                w2Var3.f32925z.d("Error closing HTTP compressed POST connection output stream. appId", w2.q(str), e14);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        w3 w3Var32 = y3Var.D;
                        y3.k(w3Var32);
                        w3Var32.p(new z2(this.f32463x, this.f32462w, i6, null, null, map));
                        throw th;
                    }
                } catch (IOException e15) {
                    e = e15;
                    iOException = e;
                    i10 = responseCode;
                    map2 = null;
                    if (outputStream2 != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    w3Var = y3Var.D;
                    y3.k(w3Var);
                    z2Var = new z2(this.f32463x, this.f32462w, i10, iOException, null, map2);
                    w3Var.p(z2Var);
                    return;
                } catch (Throwable th7) {
                    th = th7;
                    i6 = responseCode;
                    map = map3;
                    if (outputStream2 != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    w3 w3Var322 = y3Var.D;
                    y3.k(w3Var322);
                    w3Var322.p(new z2(this.f32463x, this.f32462w, i6, null, null, map));
                    throw th;
                }
            } catch (IOException e16) {
                e = e16;
                outputStream = null;
            } catch (Throwable th8) {
                th = th8;
                outputStream = null;
            }
            w3Var.p(z2Var);
            return;
        }
        throw new IOException("Failed to obtain HTTP connection");
    }
}
