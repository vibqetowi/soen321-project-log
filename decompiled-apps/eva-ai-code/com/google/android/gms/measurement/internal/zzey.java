package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzey implements Runnable {
    final /* synthetic */ zzez zza;
    private final URL zzb;
    private final byte[] zzc;
    private final zzev zzd;
    private final String zze;
    private final Map zzf;

    public zzey(zzez zzezVar, String str, URL url, byte[] bArr, Map map, zzev zzevVar) {
        this.zza = zzezVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzevVar);
        this.zzb = url;
        this.zzc = bArr;
        this.zzd = zzevVar;
        this.zze = str;
        this.zzf = map;
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0100: MOVE  (r12 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:45:0x00fe */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0106: MOVE  (r12 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:47:0x0103 */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Throwable th;
        int i;
        HttpURLConnection httpURLConnection;
        Map map;
        IOException e;
        int i2;
        Map map2;
        zzex zzexVar;
        zzga zzgaVar;
        IOException iOException;
        zzez zzezVar;
        URLConnection openConnection;
        int responseCode;
        Map map3;
        Map map4;
        InputStream inputStream;
        this.zza.zzaz();
        OutputStream outputStream = null;
        try {
            zzezVar = this.zza;
            openConnection = this.zzb.openConnection();
        } catch (IOException e2) {
            e = e2;
            i2 = 0;
            httpURLConnection = null;
            map2 = null;
        } catch (Throwable th2) {
            th = th2;
            i = 0;
            httpURLConnection = null;
            map = null;
        }
        if (!(openConnection instanceof HttpURLConnection)) {
            throw new IOException("Failed to obtain HTTP connection");
        }
        httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setDefaultUseCaches(false);
        zzezVar.zzt.zzf();
        httpURLConnection.setConnectTimeout(60000);
        zzezVar.zzt.zzf();
        httpURLConnection.setReadTimeout(61000);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setDoInput(true);
        try {
            Map map5 = this.zzf;
            if (map5 != null) {
                for (Map.Entry entry : map5.entrySet()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            if (this.zzc != null) {
                byte[] zzz = this.zza.zzf.zzu().zzz(this.zzc);
                zzer zzj = this.zza.zzt.zzaA().zzj();
                int length = zzz.length;
                zzj.zzb("Uploading data. size", Integer.valueOf(length));
                httpURLConnection.setDoOutput(true);
                httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                httpURLConnection.setFixedLengthStreamingMode(length);
                httpURLConnection.connect();
                OutputStream outputStream2 = httpURLConnection.getOutputStream();
                try {
                    outputStream2.write(zzz);
                    outputStream2.close();
                } catch (IOException e3) {
                    e = e3;
                    i2 = 0;
                    map2 = null;
                    outputStream = outputStream2;
                    iOException = e;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e4) {
                            this.zza.zzt.zzaA().zzd().zzc("Error closing HTTP compressed POST connection output stream. appId", zzet.zzn(this.zze), e4);
                        }
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    zzgaVar = this.zza.zzt.zzaB();
                    zzexVar = new zzex(this.zze, this.zzd, i2, iOException, null, map2, null);
                    zzgaVar.zzp(zzexVar);
                } catch (Throwable th3) {
                    th = th3;
                    i = 0;
                    map = null;
                    outputStream = outputStream2;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e5) {
                            this.zza.zzt.zzaA().zzd().zzc("Error closing HTTP compressed POST connection output stream. appId", zzet.zzn(this.zze), e5);
                        }
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    this.zza.zzt.zzaB().zzp(new zzex(this.zze, this.zzd, i, null, null, map, null));
                    throw th;
                }
            }
            responseCode = httpURLConnection.getResponseCode();
        } catch (IOException e6) {
            i2 = 0;
            map2 = null;
            iOException = e6;
        } catch (Throwable th4) {
            i = 0;
            map = null;
            th = th4;
        }
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
                        zzgaVar = this.zza.zzt.zzaB();
                        zzexVar = new zzex(this.zze, this.zzd, responseCode, null, byteArray, headerFields, null);
                    } catch (Throwable th5) {
                        th = th5;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    inputStream = null;
                }
            } catch (IOException e7) {
                map2 = null;
                iOException = e7;
                i2 = responseCode;
                if (outputStream != null) {
                }
                if (httpURLConnection != null) {
                }
                zzgaVar = this.zza.zzt.zzaB();
                zzexVar = new zzex(this.zze, this.zzd, i2, iOException, null, map2, null);
                zzgaVar.zzp(zzexVar);
            } catch (Throwable th7) {
                th = th7;
                map = null;
                i = responseCode;
                if (outputStream != null) {
                }
                if (httpURLConnection != null) {
                }
                this.zza.zzt.zzaB().zzp(new zzex(this.zze, this.zzd, i, null, null, map, null));
                throw th;
            }
        } catch (IOException e8) {
            iOException = e8;
            i2 = responseCode;
            map2 = map4;
            if (outputStream != null) {
            }
            if (httpURLConnection != null) {
            }
            zzgaVar = this.zza.zzt.zzaB();
            zzexVar = new zzex(this.zze, this.zzd, i2, iOException, null, map2, null);
            zzgaVar.zzp(zzexVar);
        } catch (Throwable th8) {
            th = th8;
            i = responseCode;
            map = map3;
            if (outputStream != null) {
            }
            if (httpURLConnection != null) {
            }
            this.zza.zzt.zzaB().zzp(new zzex(this.zze, this.zzd, i, null, null, map, null));
            throw th;
        }
        zzgaVar.zzp(zzexVar);
    }
}
