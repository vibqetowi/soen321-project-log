package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzin implements Runnable {
    final /* synthetic */ zzio zza;
    private final URL zzb;
    private final String zzc;
    private final zzgb zzd;

    public zzin(zzio zzioVar, String str, URL url, byte[] bArr, Map map, zzgb zzgbVar) {
        this.zza = zzioVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzgbVar);
        this.zzb = url;
        this.zzd = zzgbVar;
        this.zzc = str;
    }

    private final void zzb(final int i, final Exception exc, final byte[] bArr, final Map map) {
        this.zza.zzt.zzaB().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzim
            @Override // java.lang.Runnable
            public final void run() {
                zzin.this.zza(i, exc, bArr, map);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009f  */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.gms.measurement.internal.zzin] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        HttpURLConnection httpURLConnection;
        ?? r4;
        ?? r42;
        int i;
        Throwable th;
        IOException e;
        InputStream inputStream;
        this.zza.zzaz();
        try {
            zzio zzioVar = this.zza;
            URLConnection openConnection = this.zzb.openConnection();
            if (!(openConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            zzioVar.zzt.zzf();
            r4 = 60000;
            r42 = 60000;
            httpURLConnection.setConnectTimeout(60000);
            zzioVar.zzt.zzf();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                i = httpURLConnection.getResponseCode();
                try {
                    try {
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int read = inputStream.read(bArr);
                                    if (read <= 0) {
                                        break;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, read);
                                }
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                zzb(i, null, byteArray, headerFields);
                            } catch (Throwable th2) {
                                th = th2;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            inputStream = null;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzb(i, e, null, r42);
                    } catch (Throwable th4) {
                        th = th4;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzb(i, null, null, r4);
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                    r42 = 0;
                    if (httpURLConnection != null) {
                    }
                    zzb(i, e, null, r42);
                } catch (Throwable th5) {
                    th = th5;
                    r4 = 0;
                    if (httpURLConnection != null) {
                    }
                    zzb(i, null, null, r4);
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
                r42 = 0;
                IOException iOException = e;
                i = 0;
                e = iOException;
                if (httpURLConnection != null) {
                }
                zzb(i, e, null, r42);
            } catch (Throwable th6) {
                th = th6;
                r4 = 0;
                Throwable th7 = th;
                i = 0;
                th = th7;
                if (httpURLConnection != null) {
                }
                zzb(i, null, null, r4);
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            httpURLConnection = null;
            r42 = 0;
        } catch (Throwable th8) {
            th = th8;
            httpURLConnection = null;
            r4 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(int i, Exception exc, byte[] bArr, Map map) {
        zzgb zzgbVar = this.zzd;
        zzgbVar.zza.zzC(this.zzc, i, exc, bArr, map);
    }
}
