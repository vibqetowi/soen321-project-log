package com.theinnerhour.b2b.components.assetDownloader;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import androidx.work.y;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.utils.ConnectionStatusReceiver;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import g.x;
import gv.r;
import hs.k;
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
import kotlin.jvm.internal.h;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.q1;
import ls.d;
import ns.e;
import ns.i;
import sp.b;
import ss.p;
import ta.v;
/* compiled from: DynamicActivityAssetDownloadJobScheduler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/assetDownloader/DynamicActivityAssetDownloadJobScheduler;", "Landroid/app/job/JobService;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class DynamicActivityAssetDownloadJobScheduler extends JobService {

    /* renamed from: u  reason: collision with root package name */
    public q1 f10613u;

    /* compiled from: DynamicActivityAssetDownloadJobScheduler.kt */
    @e(c = "com.theinnerhour.b2b.components.assetDownloader.DynamicActivityAssetDownloadJobScheduler$onStartJob$1$1", f = "DynamicActivityAssetDownloadJobScheduler.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<d0, d<? super k>, Object> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ Object[] f10615v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object[] objArr, d<? super a> dVar) {
            super(2, dVar);
            this.f10615v = objArr;
        }

        @Override // ns.a
        public final d<k> create(Object obj, d<?> dVar) {
            return new a(this.f10615v, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, d<? super k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        /* JADX WARN: Removed duplicated region for block: B:111:0x00dc A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:116:0x0033 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0129 A[Catch: Exception -> 0x00e1, TRY_ENTER, TryCatch #9 {Exception -> 0x00e1, blocks: (B:31:0x00d4, B:33:0x00dc, B:63:0x0129, B:65:0x012e), top: B:95:0x00d4, outer: #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x012e A[Catch: Exception -> 0x00e1, TRY_LEAVE, TryCatch #9 {Exception -> 0x00e1, blocks: (B:31:0x00d4, B:33:0x00dc, B:63:0x0129, B:65:0x012e), top: B:95:0x00d4, outer: #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x014b A[Catch: Exception -> 0x0147, TryCatch #5 {Exception -> 0x0147, blocks: (B:75:0x0143, B:79:0x014b, B:81:0x0150), top: B:91:0x0143, outer: #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0150 A[Catch: Exception -> 0x0147, TRY_LEAVE, TryCatch #5 {Exception -> 0x0147, blocks: (B:75:0x0143, B:79:0x014b, B:81:0x0150), top: B:91:0x0143, outer: #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0143 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // ns.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object[] objArr;
            Object remove;
            InputStream inputStream;
            FileOutputStream fileOutputStream;
            Exception e10;
            InputStream inputStream2;
            b.d0(obj);
            Context applicationContext = DynamicActivityAssetDownloadJobScheduler.this.getApplicationContext();
            kotlin.jvm.internal.i.f(applicationContext, "applicationContext");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : this.f10615v) {
                if (obj2 instanceof String) {
                    arrayList.add(obj2);
                }
            }
            lk.d dVar = new lk.d(applicationContext, arrayList);
            try {
                if (ConnectionStatusReceiver.isConnected()) {
                    while (!arrayList.isEmpty()) {
                        HttpURLConnection httpURLConnection = null;
                        r5 = null;
                        InputStream inputStream3 = null;
                        HttpURLConnection httpURLConnection2 = null;
                        if (arrayList.isEmpty()) {
                            remove = null;
                        } else {
                            remove = arrayList.remove(0);
                        }
                        String str = (String) remove;
                        if (str == null) {
                            break;
                        }
                        String[] strArr = (String[]) r.a1(str, new String[]{"/"}, 0, 6).toArray(new String[0]);
                        String str2 = strArr[strArr.length - 1];
                        if (!r.J0(str, "https:")) {
                            str = "https:" + str;
                        }
                        try {
                            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection());
                            kotlin.jvm.internal.i.e(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                            HttpURLConnection httpURLConnection3 = (HttpURLConnection) uRLConnection;
                            try {
                                httpURLConnection3.setRequestMethod("GET");
                                httpURLConnection3.setConnectTimeout(5000);
                                httpURLConnection3.connect();
                                fileOutputStream = dVar.f24402a.openFileOutput(str2, 0);
                            } catch (Exception e11) {
                                e10 = e11;
                                fileOutputStream = null;
                                httpURLConnection2 = httpURLConnection3;
                                inputStream2 = null;
                            } catch (Throwable th2) {
                                th = th2;
                                inputStream = null;
                                fileOutputStream = null;
                                httpURLConnection = httpURLConnection3;
                                if (httpURLConnection != null) {
                                }
                                if (inputStream != null) {
                                }
                                if (fileOutputStream != null) {
                                }
                                throw th;
                            }
                            try {
                                inputStream3 = httpURLConnection3.getInputStream();
                                byte[] bArr = new byte[Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID];
                                while (true) {
                                    int read = inputStream3.read(bArr);
                                    if (read <= 0) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, read);
                                }
                                Intent intent = new Intent("com.theinnerhour.b2b.assetFileDownloadBroadcast");
                                intent.putExtra("asset_file_name", str2);
                                intent.putExtra("asset_file_download_status", true);
                                n1.a.a(MyApplication.V.a()).c(intent);
                                try {
                                    httpURLConnection3.disconnect();
                                    inputStream3.close();
                                } catch (Exception e12) {
                                    LogHelper.INSTANCE.e(e12);
                                }
                            } catch (Exception e13) {
                                e10 = e13;
                                InputStream inputStream4 = inputStream3;
                                httpURLConnection2 = httpURLConnection3;
                                inputStream2 = inputStream4;
                                try {
                                    boolean z10 = e10 instanceof InterruptedIOException;
                                    String str3 = dVar.f24403b;
                                    if (!z10 && !(e10 instanceof UnknownHostException) && !(e10 instanceof ConnectException) && !(e10 instanceof SSLException)) {
                                        LogHelper.INSTANCE.e(str3, e10);
                                        dVar.a(fileOutputStream, str2);
                                        if (httpURLConnection2 != null) {
                                            httpURLConnection2.disconnect();
                                        }
                                        if (inputStream2 != null) {
                                            inputStream2.close();
                                        }
                                        if (fileOutputStream == null) {
                                            fileOutputStream.close();
                                        }
                                    }
                                    LogHelper.INSTANCE.w(str3, e10.toString());
                                    dVar.a(fileOutputStream, str2);
                                    if (httpURLConnection2 != null) {
                                    }
                                    if (inputStream2 != null) {
                                    }
                                    if (fileOutputStream == null) {
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    HttpURLConnection httpURLConnection4 = httpURLConnection2;
                                    inputStream3 = inputStream2;
                                    httpURLConnection3 = httpURLConnection4;
                                    inputStream = inputStream3;
                                    httpURLConnection = httpURLConnection3;
                                    if (httpURLConnection != null) {
                                        try {
                                            httpURLConnection.disconnect();
                                        } catch (Exception e14) {
                                            LogHelper.INSTANCE.e(e14);
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
                            } catch (Throwable th4) {
                                th = th4;
                                inputStream = inputStream3;
                                httpURLConnection = httpURLConnection3;
                                if (httpURLConnection != null) {
                                }
                                if (inputStream != null) {
                                }
                                if (fileOutputStream != null) {
                                }
                                throw th;
                            }
                        } catch (Exception e15) {
                            e10 = e15;
                            inputStream2 = null;
                            fileOutputStream = null;
                        } catch (Throwable th5) {
                            th = th5;
                            inputStream = null;
                            fileOutputStream = null;
                            if (httpURLConnection != null) {
                            }
                            if (inputStream != null) {
                            }
                            if (fileOutputStream != null) {
                            }
                            throw th;
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                    }
                }
            } catch (Exception e16) {
                LogHelper.INSTANCE.e(e16);
            }
            return k.f19476a;
        }
    }

    public DynamicActivityAssetDownloadJobScheduler() {
        androidx.work.b.a(false);
        androidx.work.b.a(true);
        String str = y.f3357a;
        new x(3);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        Object[] objArr;
        kotlin.jvm.internal.i.g(jobParameters, "jobParameters");
        try {
            Object obj = jobParameters.getExtras().get("asset_list");
            if (obj instanceof Object[]) {
                objArr = (Object[]) obj;
            } else {
                objArr = null;
            }
            if (objArr != null) {
                this.f10613u = v.H(h.c(o0.f23642c), null, 0, new a(objArr, null), 3);
                return true;
            }
            return true;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
            return true;
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        kotlin.jvm.internal.i.g(jobParameters, "jobParameters");
        q1 q1Var = this.f10613u;
        if (q1Var != null) {
            q1Var.g(null);
            return true;
        }
        return true;
    }
}
