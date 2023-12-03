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
/* compiled from: ProfileAssetDownloader.kt */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f24404a = LogHelper.INSTANCE.makeLogTag(e.class);

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<f<String, String>> f24405b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final Context f24406c;

    public e(Context context) {
        this.f24406c = context;
    }

    public static void a(String str, String str2) {
        Intent intent = new Intent("com.theinnerhour.b2b.campaignAssetFileDownloadBroadcast");
        intent.putExtra("asset_file_url", str);
        intent.putExtra("asset_file_type", str2);
        n1.a.a(MyApplication.V.a()).c(intent);
    }

    public static void d(String str, boolean z10) {
        Iterator<OfflineAsset> it = ApplicationPersistence.getInstance().getProfileAssets().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            OfflineAsset next = it.next();
            if (z10) {
                String fileUrl = next.getFileUrl();
                i.f(fileUrl, "tt.fileUrl");
                if (r.J0(fileUrl, "firebasestorage")) {
                    next.setDownloaded(true);
                    break;
                }
            } else if (i.b(next.getFileUrl(), str)) {
                next.setDownloaded(true);
                break;
            }
        }
        ApplicationPersistence.getInstance().updateProfileAssetsSP();
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
        Context context = this.f24406c;
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

    /* JADX WARN: Removed duplicated region for block: B:114:0x01d8 A[Catch: Exception -> 0x0200, TryCatch #8 {Exception -> 0x0200, blocks: (B:2:0x0000, B:4:0x000c, B:6:0x0014, B:7:0x0016, B:9:0x002e, B:10:0x002f, B:12:0x0052, B:14:0x0058, B:15:0x005a, B:17:0x0063, B:22:0x0068, B:24:0x0073, B:26:0x007e, B:28:0x0092, B:30:0x009d, B:31:0x00a8, B:33:0x00b3, B:53:0x013a, B:94:0x01ac, B:108:0x01cc, B:107:0x01c7, B:34:0x00b7, B:112:0x01d0, B:114:0x01d8, B:117:0x01e6, B:115:0x01e0, B:16:0x005b, B:8:0x0017, B:86:0x019b, B:90:0x01a3, B:92:0x01a8, B:99:0x01b6, B:103:0x01be, B:105:0x01c3, B:48:0x012c, B:50:0x0134), top: B:124:0x0000, inners: #9, #12, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x019b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a3 A[Catch: Exception -> 0x019f, TryCatch #9 {Exception -> 0x019f, blocks: (B:86:0x019b, B:90:0x01a3, B:92:0x01a8), top: B:125:0x019b, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a8 A[Catch: Exception -> 0x019f, TRY_LEAVE, TryCatch #9 {Exception -> 0x019f, blocks: (B:86:0x019b, B:90:0x01a3, B:92:0x01a8), top: B:125:0x019b, outer: #8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        int i6;
        String str;
        String str2;
        boolean z10;
        String str3;
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        HttpURLConnection httpURLConnection;
        try {
            HttpURLConnection httpURLConnection2 = null;
            gk.a.b(null, "asset_download_start");
            if (ConnectionStatusReceiver.isConnected()) {
                while (this.f24405b.size() > 0) {
                    synchronized (this.f24405b) {
                        str = this.f24405b.get(0).f19464u;
                        str2 = this.f24405b.get(0).f19465v;
                        k kVar = k.f19476a;
                    }
                    String[] strArr = (String[]) r.a1(str, new String[]{"/"}, 0, 6).toArray(new String[0]);
                    String str4 = strArr[strArr.length - 1];
                    if (r.J0(str4, "https:") && str4.length() == 6) {
                        synchronized (this.f24405b) {
                            this.f24405b.remove(0);
                        }
                    } else {
                        if (r.J0(str, "firebasestorage") && r.J0(str, ".jpg?")) {
                            str4 = str4.substring(0, r.O0(str4, ".jpg?", 0, false, 6) + 4);
                            i.f(str4, "this as java.lang.String…ing(startIndex, endIndex)");
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (r.J0(str, "https:https:")) {
                            str = str.substring(6);
                            i.f(str, "this as java.lang.String).substring(startIndex)");
                        }
                        if (r.J0(str, "https:")) {
                            str3 = str;
                        } else {
                            str3 = "https:" + str;
                        }
                        try {
                            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str3).openConnection());
                            i.e(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                            httpURLConnection = (HttpURLConnection) uRLConnection;
                        } catch (Exception e10) {
                            e = e10;
                            httpURLConnection = null;
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = null;
                            inputStream = null;
                        }
                        try {
                            httpURLConnection.setRequestMethod("GET");
                            httpURLConnection.setConnectTimeout(5000);
                            httpURLConnection.connect();
                            httpURLConnection.getContentLength();
                            Context context = this.f24406c;
                            i.d(context);
                            fileOutputStream = context.openFileOutput(str4, 0);
                            try {
                                inputStream = httpURLConnection.getInputStream();
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
                                        a(str4, str2);
                                        d(str, z10);
                                        synchronized (this.f24405b) {
                                            this.f24405b.remove(0);
                                        }
                                        new Bundle().putString("file_name", str4);
                                        try {
                                            httpURLConnection.disconnect();
                                            inputStream.close();
                                            if (fileOutputStream != null) {
                                                fileOutputStream.close();
                                            }
                                        } catch (Exception e11) {
                                            LogHelper.INSTANCE.e(e11);
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        httpURLConnection2 = httpURLConnection;
                                        if (httpURLConnection2 != null) {
                                            try {
                                                httpURLConnection2.disconnect();
                                            } catch (Exception e12) {
                                                LogHelper.INSTANCE.e(e12);
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
                                } catch (Exception e13) {
                                    e = e13;
                                    if (!(e instanceof InterruptedIOException) && !(e instanceof UnknownHostException) && !(e instanceof ConnectException) && !(e instanceof SSLException)) {
                                        LogHelper.INSTANCE.e(this.f24404a, e);
                                        b(fileOutputStream, str4);
                                        ConnectionStatusReceiver.isConnected();
                                        Bundle bundle = new Bundle();
                                        bundle.putString("file_name", str4);
                                        gk.a.b(bundle, "asset_download_disconnected");
                                        if (httpURLConnection != null) {
                                            try {
                                                httpURLConnection.disconnect();
                                            } catch (Exception e14) {
                                                LogHelper.INSTANCE.e(e14);
                                            }
                                        }
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        if (fileOutputStream != null) {
                                            fileOutputStream.close();
                                        }
                                        if (this.f24405b.size() == 0) {
                                        }
                                        i6 = 2;
                                        Intent intent = new Intent("com.theinnerhour.b2b.campaignAllAssetDownloadBroadcast");
                                        intent.putExtra("asset_download_status", i6);
                                        n1.a.a(MyApplication.V.a()).c(intent);
                                    }
                                    LogHelper.INSTANCE.w(this.f24404a, e.toString());
                                    b(fileOutputStream, str4);
                                    ConnectionStatusReceiver.isConnected();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("file_name", str4);
                                    gk.a.b(bundle2, "asset_download_disconnected");
                                    if (httpURLConnection != null) {
                                    }
                                    if (inputStream != null) {
                                    }
                                    if (fileOutputStream != null) {
                                    }
                                    if (this.f24405b.size() == 0) {
                                    }
                                    i6 = 2;
                                    Intent intent2 = new Intent("com.theinnerhour.b2b.campaignAllAssetDownloadBroadcast");
                                    intent2.putExtra("asset_download_status", i6);
                                    n1.a.a(MyApplication.V.a()).c(intent2);
                                }
                            } catch (Exception e15) {
                                e = e15;
                                inputStream = null;
                            } catch (Throwable th4) {
                                th = th4;
                                inputStream = null;
                            }
                        } catch (Exception e16) {
                            e = e16;
                            fileOutputStream = null;
                            inputStream = null;
                            if (!(e instanceof InterruptedIOException)) {
                                LogHelper.INSTANCE.e(this.f24404a, e);
                                b(fileOutputStream, str4);
                                ConnectionStatusReceiver.isConnected();
                                Bundle bundle22 = new Bundle();
                                bundle22.putString("file_name", str4);
                                gk.a.b(bundle22, "asset_download_disconnected");
                                if (httpURLConnection != null) {
                                }
                                if (inputStream != null) {
                                }
                                if (fileOutputStream != null) {
                                }
                                if (this.f24405b.size() == 0) {
                                }
                                i6 = 2;
                                Intent intent22 = new Intent("com.theinnerhour.b2b.campaignAllAssetDownloadBroadcast");
                                intent22.putExtra("asset_download_status", i6);
                                n1.a.a(MyApplication.V.a()).c(intent22);
                            }
                            LogHelper.INSTANCE.w(this.f24404a, e.toString());
                            b(fileOutputStream, str4);
                            ConnectionStatusReceiver.isConnected();
                            Bundle bundle222 = new Bundle();
                            bundle222.putString("file_name", str4);
                            gk.a.b(bundle222, "asset_download_disconnected");
                            if (httpURLConnection != null) {
                            }
                            if (inputStream != null) {
                            }
                            if (fileOutputStream != null) {
                            }
                            if (this.f24405b.size() == 0) {
                            }
                            i6 = 2;
                            Intent intent222 = new Intent("com.theinnerhour.b2b.campaignAllAssetDownloadBroadcast");
                            intent222.putExtra("asset_download_status", i6);
                            n1.a.a(MyApplication.V.a()).c(intent222);
                        } catch (Throwable th5) {
                            th = th5;
                            fileOutputStream = null;
                            inputStream = null;
                        }
                    }
                }
                if (this.f24405b.size() == 0) {
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
