package com.theinnerhour.b2b.utils;

import android.content.Context;
import android.content.Intent;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.p;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.theinnerhour.b2b.MyApplication;
import gv.r;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import javax.net.ssl.SSLException;
import kotlin.Metadata;
/* compiled from: RecommendedActivityAssetsWorkManager.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/theinnerhour/b2b/utils/RecommendedActivityAssetsWorkManager;", "Landroidx/work/Worker;", "Landroidx/work/p$a;", "doWork", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class RecommendedActivityAssetsWorkManager extends Worker {
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendedActivityAssetsWorkManager(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(workerParams, "workerParams");
        this.context = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0144 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0160 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013c A[Catch: all -> 0x015b, TryCatch #12 {all -> 0x015b, blocks: (B:57:0x0116, B:59:0x011a, B:61:0x011e, B:63:0x0122, B:66:0x0127, B:69:0x013c, B:70:0x013f, B:67:0x012d), top: B:119:0x0116 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014c A[Catch: Exception -> 0x0148, TryCatch #10 {Exception -> 0x0148, blocks: (B:72:0x0144, B:76:0x014c, B:78:0x0151), top: B:117:0x0144, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0151 A[Catch: Exception -> 0x0148, TRY_LEAVE, TryCatch #10 {Exception -> 0x0148, blocks: (B:72:0x0144, B:76:0x014c, B:78:0x0151), top: B:117:0x0144, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0168 A[Catch: Exception -> 0x0164, TryCatch #13 {Exception -> 0x0164, blocks: (B:86:0x0160, B:90:0x0168, B:92:0x016d), top: B:121:0x0160, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016d A[Catch: Exception -> 0x0164, TRY_LEAVE, TryCatch #13 {Exception -> 0x0164, blocks: (B:86:0x0160, B:90:0x0168, B:92:0x016d), top: B:121:0x0160, outer: #6 }] */
    @Override // androidx.work.Worker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p.a doWork() {
        String[] strArr;
        int i6;
        Object obj;
        String str;
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        HttpURLConnection httpURLConnection;
        InputStream inputStream2;
        Object obj2 = getInputData().f3236a.get("assets_array");
        HttpURLConnection httpURLConnection2 = null;
        InputStream inputStream3 = null;
        InputStream inputStream4 = null;
        r2 = null;
        FileOutputStream fileOutputStream2 = null;
        if (obj2 instanceof String[]) {
            strArr = (String[]) obj2;
        } else {
            strArr = null;
        }
        if (strArr != null) {
            Context context = this.context;
            ArrayList arrayList = new ArrayList();
            is.k.h2(arrayList, strArr);
            kotlin.jvm.internal.i.g(context, "context");
            String makeLogTag = LogHelper.INSTANCE.makeLogTag("RecommendedActivityAssetDownloader");
            boolean z10 = false;
            try {
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(e10);
            }
            if (ConnectionStatusReceiver.isConnected()) {
                while (arrayList.size() > 0) {
                    synchronized (arrayList) {
                        obj = arrayList.get(0);
                        kotlin.jvm.internal.i.f(obj, "downloadList[0]");
                        hs.k kVar = hs.k.f19476a;
                    }
                    String str2 = (String) is.k.a2(r.a1((CharSequence) obj, new String[]{"/"}, 0, 6).toArray(new String[0]));
                    if (r.J0((CharSequence) obj, "https:")) {
                        str = (String) obj;
                    } else {
                        str = "https:" + ((String) obj);
                    }
                    try {
                        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection());
                        kotlin.jvm.internal.i.e(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                        httpURLConnection = (HttpURLConnection) uRLConnection;
                        httpURLConnection.setRequestMethod("GET");
                        httpURLConnection.setConnectTimeout(5000);
                        httpURLConnection.connect();
                        try {
                            fileOutputStream = context.openFileOutput(str2, 0);
                            try {
                                inputStream2 = httpURLConnection.getInputStream();
                            } catch (Exception e11) {
                                e = e11;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            inputStream = null;
                        } catch (Throwable th3) {
                            th = th3;
                            inputStream = null;
                            fileOutputStream = null;
                        }
                    } catch (Exception e13) {
                        e = e13;
                        inputStream = null;
                        httpURLConnection = null;
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream = null;
                        fileOutputStream = null;
                        if (httpURLConnection2 != null) {
                        }
                        if (inputStream != null) {
                        }
                        if (fileOutputStream != null) {
                        }
                        throw th;
                    }
                    try {
                        byte[] bArr = new byte[Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID];
                        while (true) {
                            int read = inputStream2.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                        Intent intent = new Intent("com.theinnerhour.b2b.raAssetFileDownloadBroadcast");
                        intent.putExtra("ra_asset_file_url", (String) obj);
                        n1.a.a(MyApplication.V.a()).c(intent);
                        synchronized (arrayList) {
                            String str3 = (String) arrayList.remove(0);
                        }
                        try {
                            httpURLConnection.disconnect();
                            inputStream2.close();
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                        } catch (Exception e14) {
                            LogHelper.INSTANCE.e(e14);
                        }
                    } catch (Exception e15) {
                        e = e15;
                        inputStream3 = inputStream2;
                        inputStream = inputStream3;
                        fileOutputStream2 = fileOutputStream;
                        try {
                            if (!(e instanceof InterruptedIOException) && !(e instanceof UnknownHostException) && !(e instanceof ConnectException) && !(e instanceof SSLException)) {
                                LogHelper.INSTANCE.e(makeLogTag, e);
                                if (fileOutputStream2 != null) {
                                    fileOutputStream2.flush();
                                }
                                ConnectionStatusReceiver.isConnected();
                                if (httpURLConnection != null) {
                                    try {
                                        httpURLConnection.disconnect();
                                    } catch (Exception e16) {
                                        LogHelper.INSTANCE.e(e16);
                                    }
                                }
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (fileOutputStream2 != null) {
                                    fileOutputStream2.close();
                                }
                                if (arrayList.size() == 0) {
                                }
                                i6 = 2;
                                Intent intent2 = new Intent("com.theinnerhour.b2b.raAllAssetDownloadBroadcast");
                                intent2.putExtra("ra_asset_download_status", i6);
                                n1.a.a(MyApplication.V.a()).c(intent2);
                                z10 = true;
                                if (!z10) {
                                }
                            }
                            LogHelper.INSTANCE.w(makeLogTag, e.toString());
                            if (fileOutputStream2 != null) {
                            }
                            ConnectionStatusReceiver.isConnected();
                            if (httpURLConnection != null) {
                            }
                            if (inputStream != null) {
                            }
                            if (fileOutputStream2 != null) {
                            }
                            if (arrayList.size() == 0) {
                            }
                            i6 = 2;
                            Intent intent22 = new Intent("com.theinnerhour.b2b.raAllAssetDownloadBroadcast");
                            intent22.putExtra("ra_asset_download_status", i6);
                            n1.a.a(MyApplication.V.a()).c(intent22);
                            z10 = true;
                            if (!z10) {
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            fileOutputStream = fileOutputStream2;
                            httpURLConnection2 = httpURLConnection;
                            if (httpURLConnection2 != null) {
                                try {
                                    httpURLConnection2.disconnect();
                                } catch (Exception e17) {
                                    LogHelper.INSTANCE.e(e17);
                                    throw th;
                                }
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        inputStream4 = inputStream2;
                        inputStream = inputStream4;
                        httpURLConnection2 = httpURLConnection;
                        if (httpURLConnection2 != null) {
                        }
                        if (inputStream != null) {
                        }
                        if (fileOutputStream != null) {
                        }
                        throw th;
                    }
                }
                if (arrayList.size() == 0) {
                    i6 = 100;
                    Intent intent222 = new Intent("com.theinnerhour.b2b.raAllAssetDownloadBroadcast");
                    intent222.putExtra("ra_asset_download_status", i6);
                    n1.a.a(MyApplication.V.a()).c(intent222);
                    z10 = true;
                    if (!z10) {
                        return new p.a.c();
                    }
                    return new p.a.C0043a();
                }
            }
            i6 = 2;
            Intent intent2222 = new Intent("com.theinnerhour.b2b.raAllAssetDownloadBroadcast");
            intent2222.putExtra("ra_asset_download_status", i6);
            n1.a.a(MyApplication.V.a()).c(intent2222);
            z10 = true;
            if (!z10) {
            }
        } else {
            return new p.a.C0043a();
        }
    }

    public final Context getContext() {
        return this.context;
    }
}
