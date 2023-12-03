package lk;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.model.OfflineAsset;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.ConnectionStatusReceiver;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import gv.r;
import hs.f;
import hs.k;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.net.ssl.SSLException;
import kotlin.jvm.internal.i;
/* compiled from: CampaignAssetDownloader.kt */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f24399a = LogHelper.INSTANCE.makeLogTag(c.class);

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<f<String, String>> f24400b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final Context f24401c;

    public c(Context context) {
        this.f24401c = context;
    }

    public static void a(String str) {
        Intent intent = new Intent("com.theinnerhour.b2b.campaignAssetFileDownloadBroadcast");
        intent.putExtra("asset_file_url", str);
        n1.a.a(MyApplication.V.a()).c(intent);
    }

    public static void d(String str) {
        Iterator<OfflineAsset> it = ApplicationPersistence.getInstance().getCampaignAssets().iterator();
        while (it.hasNext()) {
            OfflineAsset next = it.next();
            if (i.b(next.getFileUrl(), str)) {
                next.setDownloaded(true);
            }
        }
        ApplicationPersistence.getInstance().updateCampaignAssetsSP();
    }

    public final void b(FileOutputStream fileOutputStream, String str) {
        if (fileOutputStream != null) {
            try {
                fileOutputStream.flush();
            } catch (IOException e10) {
                LogHelper.INSTANCE.e(e10);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        Context context = this.f24401c;
        i.d(context);
        sb2.append(context.getFilesDir().toString());
        sb2.append('/');
        sb2.append(str);
        File file = new File(sb2.toString());
        if (file.exists() && file.delete()) {
            LogHelper.INSTANCE.i("downloadservice", "file deleted");
        }
        Bundle bundle = new Bundle();
        bundle.putString("file_name", str);
        gk.a.b(bundle, "asset_download_file_fail");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x014c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0139 A[Catch: Exception -> 0x0135, TryCatch #8 {Exception -> 0x0135, blocks: (B:65:0x0131, B:69:0x0139, B:71:0x013e), top: B:106:0x0131, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013e A[Catch: Exception -> 0x0135, TRY_LEAVE, TryCatch #8 {Exception -> 0x0135, blocks: (B:65:0x0131, B:69:0x0139, B:71:0x013e), top: B:106:0x0131, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0154 A[Catch: Exception -> 0x0150, TryCatch #0 {Exception -> 0x0150, blocks: (B:78:0x014c, B:82:0x0154, B:84:0x0159), top: B:101:0x014c, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0159 A[Catch: Exception -> 0x0150, TRY_LEAVE, TryCatch #0 {Exception -> 0x0150, blocks: (B:78:0x014c, B:82:0x0154, B:84:0x0159), top: B:101:0x014c, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016e A[Catch: Exception -> 0x0196, TryCatch #7 {Exception -> 0x0196, blocks: (B:2:0x0000, B:4:0x000c, B:6:0x0014, B:7:0x0016, B:9:0x0024, B:10:0x0025, B:12:0x004b, B:32:0x00d0, B:73:0x0142, B:87:0x0162, B:86:0x015d, B:13:0x004f, B:91:0x0166, B:93:0x016e, B:96:0x017c, B:94:0x0176, B:78:0x014c, B:82:0x0154, B:84:0x0159, B:27:0x00c2, B:29:0x00ca, B:8:0x0017, B:65:0x0131, B:69:0x0139, B:71:0x013e), top: B:105:0x0000, inners: #0, #1, #8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        int i6;
        String str;
        String str2;
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        HttpURLConnection httpURLConnection;
        try {
            HttpURLConnection httpURLConnection2 = null;
            gk.a.b(null, "asset_download_start");
            if (ConnectionStatusReceiver.isConnected()) {
                while (this.f24400b.size() > 0) {
                    synchronized (this.f24400b) {
                        str = this.f24400b.get(0).f19464u;
                        k kVar = k.f19476a;
                    }
                    String[] strArr = (String[]) r.a1(str, new String[]{"/"}, 0, 6).toArray(new String[0]);
                    String str3 = strArr[strArr.length - 1];
                    if (r.J0(str, "https:")) {
                        str2 = str;
                    } else {
                        str2 = "https:" + str;
                    }
                    try {
                        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str2).openConnection());
                        i.e(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                        httpURLConnection = (HttpURLConnection) uRLConnection;
                    } catch (Exception e10) {
                        e = e10;
                        httpURLConnection = null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = null;
                        inputStream = null;
                        if (httpURLConnection2 != null) {
                            try {
                                httpURLConnection2.disconnect();
                            } catch (Exception e11) {
                                LogHelper.INSTANCE.e(e11);
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
                    try {
                        httpURLConnection.setRequestMethod("GET");
                        httpURLConnection.setConnectTimeout(5000);
                        httpURLConnection.connect();
                        httpURLConnection.getContentLength();
                        Context context = this.f24401c;
                        i.d(context);
                        fileOutputStream = context.openFileOutput(str3, 0);
                    } catch (Exception e12) {
                        e = e12;
                        fileOutputStream = null;
                        inputStream = null;
                        if (!(e instanceof InterruptedIOException)) {
                            LogHelper.INSTANCE.e(this.f24399a, e);
                            b(fileOutputStream, str3);
                            ConnectionStatusReceiver.isConnected();
                            Bundle bundle = new Bundle();
                            bundle.putString("file_name", str3);
                            gk.a.b(bundle, "asset_download_disconnected");
                            if (httpURLConnection != null) {
                            }
                            if (inputStream != null) {
                            }
                            if (fileOutputStream != null) {
                            }
                            if (this.f24400b.size() == 0) {
                            }
                            i6 = 2;
                            Intent intent = new Intent("com.theinnerhour.b2b.campaignAllAssetDownloadBroadcast");
                            intent.putExtra("asset_download_status", i6);
                            n1.a.a(MyApplication.V.a()).c(intent);
                        }
                        LogHelper.INSTANCE.w(this.f24399a, e.toString());
                        b(fileOutputStream, str3);
                        ConnectionStatusReceiver.isConnected();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("file_name", str3);
                        gk.a.b(bundle2, "asset_download_disconnected");
                        if (httpURLConnection != null) {
                        }
                        if (inputStream != null) {
                        }
                        if (fileOutputStream != null) {
                        }
                        if (this.f24400b.size() == 0) {
                        }
                        i6 = 2;
                        Intent intent2 = new Intent("com.theinnerhour.b2b.campaignAllAssetDownloadBroadcast");
                        intent2.putExtra("asset_download_status", i6);
                        n1.a.a(MyApplication.V.a()).c(intent2);
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = null;
                        inputStream = null;
                    }
                    try {
                        inputStream = httpURLConnection.getInputStream();
                    } catch (Exception e13) {
                        e = e13;
                        inputStream = null;
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream = null;
                        httpURLConnection2 = httpURLConnection;
                        if (httpURLConnection2 != null) {
                        }
                        if (inputStream != null) {
                        }
                        if (fileOutputStream != null) {
                        }
                        throw th;
                    }
                    try {
                        try {
                            byte[] bArr = new byte[Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID];
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (read <= 0) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, read);
                            }
                            a(str3);
                            d(str);
                            synchronized (this.f24400b) {
                                this.f24400b.remove(0);
                            }
                            new Bundle().putString("file_name", str3);
                            try {
                                httpURLConnection.disconnect();
                                inputStream.close();
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                            } catch (Exception e14) {
                                LogHelper.INSTANCE.e(e14);
                            }
                        } catch (Exception e15) {
                            e = e15;
                            if (!(e instanceof InterruptedIOException) && !(e instanceof UnknownHostException) && !(e instanceof ConnectException) && !(e instanceof SSLException)) {
                                LogHelper.INSTANCE.e(this.f24399a, e);
                                b(fileOutputStream, str3);
                                ConnectionStatusReceiver.isConnected();
                                Bundle bundle22 = new Bundle();
                                bundle22.putString("file_name", str3);
                                gk.a.b(bundle22, "asset_download_disconnected");
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
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                if (this.f24400b.size() == 0) {
                                }
                                i6 = 2;
                                Intent intent22 = new Intent("com.theinnerhour.b2b.campaignAllAssetDownloadBroadcast");
                                intent22.putExtra("asset_download_status", i6);
                                n1.a.a(MyApplication.V.a()).c(intent22);
                            }
                            LogHelper.INSTANCE.w(this.f24399a, e.toString());
                            b(fileOutputStream, str3);
                            ConnectionStatusReceiver.isConnected();
                            Bundle bundle222 = new Bundle();
                            bundle222.putString("file_name", str3);
                            gk.a.b(bundle222, "asset_download_disconnected");
                            if (httpURLConnection != null) {
                            }
                            if (inputStream != null) {
                            }
                            if (fileOutputStream != null) {
                            }
                            if (this.f24400b.size() == 0) {
                            }
                            i6 = 2;
                            Intent intent222 = new Intent("com.theinnerhour.b2b.campaignAllAssetDownloadBroadcast");
                            intent222.putExtra("asset_download_status", i6);
                            n1.a.a(MyApplication.V.a()).c(intent222);
                        }
                    } catch (Throwable th5) {
                        th = th5;
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
                if (this.f24400b.size() == 0) {
                    gk.a.b(null, "asset_download_finish");
                    i6 = 100;
                    Intent intent2222 = new Intent("com.theinnerhour.b2b.campaignAllAssetDownloadBroadcast");
                    intent2222.putExtra("asset_download_status", i6);
                    n1.a.a(MyApplication.V.a()).c(intent2222);
                }
            } else {
                gk.a.b(null, "asset_download_no_network");
            }
            i6 = 2;
            Intent intent22222 = new Intent("com.theinnerhour.b2b.campaignAllAssetDownloadBroadcast");
            intent22222.putExtra("asset_download_status", i6);
            n1.a.a(MyApplication.V.a()).c(intent22222);
        } catch (Exception e17) {
            LogHelper.INSTANCE.e(e17);
        }
    }
}
