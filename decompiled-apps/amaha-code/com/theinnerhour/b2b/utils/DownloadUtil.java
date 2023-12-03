package com.theinnerhour.b2b.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.model.OfflineAsset;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
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
/* loaded from: classes2.dex */
public class DownloadUtil {
    public static final String DOWNLOADING_FILE_URL = "downloading_file_url";
    public static final String DOWNLOADING_IN_PROGRESS = "download_inprogress";
    public static final String DOWNLOADING_IN_PROGRESS_VALUE = "download_inprogress_value";
    public static final int DOWNLOAD_COMPLETE = 100;
    public static final int DOWNLOAD_IN_PROGRESS = 99;
    public static final String DOWNLOAD_PRIORITY_BROADCAST = "com.theinnerhour.b2b.downloadPriorityBroadcast";
    public static final String DOWNLOAD_PROGRESS_BROADCAST = "com.theinnerhour.b2b.downloadProgressBroadcast";
    public static final String DOWNLOAD_SERVICE_BROADCAST = "com.theinnerhour.b2b.downloadServiceBroadcast";
    public static final String DOWNLOAD_SERVICE_PROGRESS_BROADCAST = "com.theinnerhour.b2b.downloadServiceProgressBroadcast";
    public static final String DOWNLOAD_STATUS = "download_status";
    public static final int INSUFFICIENT_SPACE = 3;
    public static final int INTERNET_DISCONNECTED = 2;
    public static final int START_DOWNLOAD = 1;
    Context context;
    private String TAG = LogHelper.INSTANCE.makeLogTag(getClass());
    private ArrayList<String> downloadUrl = new ArrayList<>();
    private boolean retrydownloadFlag = true;
    private BroadcastReceiver downloadPriorityBroadcast = new BroadcastReceiver() { // from class: com.theinnerhour.b2b.utils.DownloadUtil.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                LogHelper logHelper = LogHelper.INSTANCE;
                String str = DownloadUtil.this.TAG;
                logHelper.i(str, "sequence pre " + DownloadUtil.this.downloadUrl.toString());
                String stringExtra = intent.getStringExtra(DownloadUtil.DOWNLOADING_FILE_URL);
                synchronized (DownloadUtil.this.downloadUrl) {
                    if (DownloadUtil.this.downloadUrl.size() >= 1 && !((String) DownloadUtil.this.downloadUrl.get(0)).equals(stringExtra)) {
                        DownloadUtil.this.downloadUrl.remove(stringExtra);
                        DownloadUtil.this.downloadUrl.add(1, stringExtra);
                    }
                }
                String str2 = DownloadUtil.this.TAG;
                logHelper.i(str2, "sequence post " + DownloadUtil.this.downloadUrl.toString());
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(DownloadUtil.this.TAG, "error in unregistering listener", e10);
            }
        }
    };

    public DownloadUtil(Context context) {
        this.context = context;
    }

    private void broadcastDownloadProgress(String str, int i6) {
        Intent intent = new Intent(DOWNLOAD_PROGRESS_BROADCAST);
        intent.putExtra(DOWNLOADING_IN_PROGRESS_VALUE, i6);
        intent.putExtra(DOWNLOADING_FILE_URL, str);
        n1.a.a(MyApplication.V.a()).c(intent);
    }

    private void closeConnection(FileOutputStream fileOutputStream, String str, String str2, Boolean bool) {
        if (fileOutputStream != null) {
            try {
                fileOutputStream.flush();
            } catch (IOException e10) {
                LogHelper.INSTANCE.e(e10);
            }
        }
        if (!bool.booleanValue()) {
            File file = new File(this.context.getFilesDir() + "/" + str + "_temp");
            if (file.exists() && file.delete()) {
                LogHelper.INSTANCE.i("downloadservice", "file deleted");
            }
            changeStatus(str2, Boolean.FALSE);
        }
        Bundle bundle = new Bundle();
        bundle.putString("file_name", str);
        gk.a.b(bundle, "ad_file_fail");
    }

    private void updateDownloadedFile(String str) {
        Iterator<OfflineAsset> it = ApplicationPersistence.getInstance().getOfflineAssets().iterator();
        while (it.hasNext()) {
            OfflineAsset next = it.next();
            if (next.getFileUrl().equals(str)) {
                next.setDownloaded(true);
                next.setDownloading(false);
                next.setDownloadedBits(-1);
            }
        }
        ApplicationPersistence.getInstance().updateOfflineAssetsSP();
    }

    public void changeStatus(String str, Boolean bool) {
        Iterator<OfflineAsset> it = ApplicationPersistence.getInstance().getOfflineAssets().iterator();
        while (it.hasNext()) {
            OfflineAsset next = it.next();
            if (next.getFileUrl().equals(str)) {
                next.setDownloading(bool.booleanValue());
            }
        }
        ApplicationPersistence.getInstance().updateOfflineAssetsSP();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0242 A[Catch: Exception -> 0x023e, TryCatch #6 {Exception -> 0x023e, blocks: (B:102:0x023a, B:106:0x0242, B:108:0x0247), top: B:142:0x023a, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0247 A[Catch: Exception -> 0x023e, TRY_LEAVE, TryCatch #6 {Exception -> 0x023e, blocks: (B:102:0x023a, B:106:0x0242, B:108:0x0247), top: B:142:0x023a, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x025d A[Catch: Exception -> 0x0259, TryCatch #11 {Exception -> 0x0259, blocks: (B:115:0x0255, B:119:0x025d, B:121:0x0262), top: B:146:0x0255, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0262 A[Catch: Exception -> 0x0259, TRY_LEAVE, TryCatch #11 {Exception -> 0x0259, blocks: (B:115:0x0255, B:119:0x025d, B:121:0x0262), top: B:146:0x0255, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x023a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0255 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0205 A[EDGE_INSN: B:156:0x0205->B:89:0x0205 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01cf A[Catch: all -> 0x0251, TryCatch #5 {all -> 0x0251, blocks: (B:82:0x01c0, B:83:0x01c9, B:85:0x01cf, B:87:0x01df, B:88:0x0202, B:89:0x0205, B:91:0x0209, B:93:0x020d, B:95:0x0211, B:98:0x0216, B:100:0x022d, B:99:0x021e), top: B:140:0x01c0 }] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean downloadFileFromUrl(String str) {
        int i6;
        boolean z10;
        int i10;
        int i11;
        String str2;
        int i12;
        Throwable th2;
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        int i13;
        InputStream inputStream2;
        ArrayList<OfflineAsset> offlineAssets;
        int i14;
        try {
            if (this.downloadUrl.size() > 0 && this.downloadUrl.contains(str)) {
                synchronized (this.downloadUrl) {
                    this.downloadUrl.remove(str);
                }
            }
            if (ConnectionStatusReceiver.isConnected()) {
                Iterator<OfflineAsset> it = ApplicationPersistence.getInstance().getOfflineAssets().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    OfflineAsset next = it.next();
                    if (next.getFileUrl().equals(str)) {
                        if (next.getDownloadedBits() != -1) {
                            i10 = next.getDownloadedBits();
                            i11 = next.getOriginalFileSize();
                        }
                    }
                }
                i10 = -1;
                i11 = -1;
                File dataDirectory = Environment.getDataDirectory();
                String[] split = str.split("/");
                z10 = true;
                String str3 = split[split.length - 1];
                StatFs statFs = new StatFs(dataDirectory.getPath());
                if ((statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) / 1048576 > 100) {
                    if (str.contains("https:")) {
                        str2 = str;
                    } else {
                        str2 = "https:" + str;
                    }
                    if (i10 != -1) {
                        i12 = 32768;
                    } else {
                        i12 = 0;
                    }
                    HttpURLConnection httpURLConnection = null;
                    InputStream inputStream3 = null;
                    httpURLConnection = null;
                    try {
                        HttpURLConnection httpURLConnection2 = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str2).openConnection()));
                        try {
                            try {
                                httpURLConnection2.setRequestMethod("GET");
                                httpURLConnection2.setConnectTimeout(5000);
                                if (i10 != -1) {
                                    httpURLConnection2.setRequestProperty("Range", "bytes=" + i10 + "-");
                                }
                                httpURLConnection2.connect();
                                if (i10 == -1 || i11 <= 0) {
                                    i11 = httpURLConnection2.getContentLength();
                                }
                                try {
                                    fileOutputStream = this.context.openFileOutput(str3 + "_temp", i12);
                                    try {
                                        try {
                                            inputStream3 = httpURLConnection2.getInputStream();
                                            if (i10 != -1) {
                                                i13 = i10 + 0;
                                                try {
                                                    broadcastDownloadProgress(str2, (i13 * 100) / i11);
                                                } catch (Exception e10) {
                                                    e = e10;
                                                    inputStream = inputStream3;
                                                    httpURLConnection = httpURLConnection2;
                                                    try {
                                                        offlineAssets = ApplicationPersistence.getInstance().getOfflineAssets();
                                                        i14 = 0;
                                                        while (true) {
                                                            if (i14 >= offlineAssets.size()) {
                                                                break;
                                                            } else if (offlineAssets.get(i14).getFileUrl().equals(str)) {
                                                                ApplicationPersistence.getInstance().getOfflineAssets().get(i14).setDownloadedBits(i13);
                                                                ApplicationPersistence.getInstance().getOfflineAssets().get(i14).setOriginalFileSize(i11);
                                                                break;
                                                            } else {
                                                                i14++;
                                                            }
                                                        }
                                                        if (!(e instanceof InterruptedIOException) && !(e instanceof UnknownHostException) && !(e instanceof ConnectException) && !(e instanceof SSLException)) {
                                                            LogHelper.INSTANCE.e(this.TAG, e);
                                                            closeConnection(fileOutputStream, str3, str, Boolean.TRUE);
                                                            ConnectionStatusReceiver.isConnected();
                                                            broadcastDownloadProgress(str2, -1);
                                                            if (httpURLConnection != null) {
                                                                try {
                                                                    httpURLConnection.disconnect();
                                                                } catch (Exception e11) {
                                                                    LogHelper.INSTANCE.e(e11);
                                                                }
                                                            }
                                                            if (inputStream != null) {
                                                                inputStream.close();
                                                            }
                                                            if (fileOutputStream != null) {
                                                                fileOutputStream.close();
                                                            }
                                                            z10 = false;
                                                            i6 = 100;
                                                            Intent intent = new Intent(DOWNLOAD_SERVICE_BROADCAST);
                                                            intent.putExtra(DOWNLOAD_STATUS, i6);
                                                            n1.a.a(MyApplication.V.a()).c(intent);
                                                            return z10;
                                                        }
                                                        LogHelper.INSTANCE.w(this.TAG, e.toString());
                                                        closeConnection(fileOutputStream, str3, str, Boolean.TRUE);
                                                        ConnectionStatusReceiver.isConnected();
                                                        broadcastDownloadProgress(str2, -1);
                                                        if (httpURLConnection != null) {
                                                        }
                                                        if (inputStream != null) {
                                                        }
                                                        if (fileOutputStream != null) {
                                                        }
                                                        z10 = false;
                                                        i6 = 100;
                                                        Intent intent2 = new Intent(DOWNLOAD_SERVICE_BROADCAST);
                                                        intent2.putExtra(DOWNLOAD_STATUS, i6);
                                                        n1.a.a(MyApplication.V.a()).c(intent2);
                                                        return z10;
                                                    } catch (Throwable th3) {
                                                        th2 = th3;
                                                        inputStream2 = inputStream;
                                                        if (httpURLConnection != null) {
                                                        }
                                                        if (inputStream2 != 0) {
                                                        }
                                                        if (fileOutputStream != null) {
                                                        }
                                                        throw th2;
                                                    }
                                                }
                                            } else {
                                                i13 = 0;
                                            }
                                            byte[] bArr = new byte[Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID];
                                            while (true) {
                                                int read = inputStream3.read(bArr);
                                                if (read <= 0) {
                                                    break;
                                                }
                                                i13 += read;
                                                broadcastDownloadProgress(str2, (i13 * 100) / i11);
                                                fileOutputStream.write(bArr, 0, read);
                                            }
                                            File file = new File(this.context.getFilesDir().toString() + "/" + str3 + "_temp");
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(this.context.getFilesDir().toString());
                                            sb2.append("/");
                                            sb2.append(str3);
                                            file.renameTo(new File(sb2.toString()));
                                            updateDownloadedFile(str);
                                            this.retrydownloadFlag = true;
                                            try {
                                                httpURLConnection2.disconnect();
                                                inputStream3.close();
                                                if (fileOutputStream != null) {
                                                    fileOutputStream.close();
                                                }
                                            } catch (Exception e12) {
                                                LogHelper.INSTANCE.e(e12);
                                            }
                                        } catch (Exception e13) {
                                            e = e13;
                                            i13 = 0;
                                        }
                                    } catch (Throwable th4) {
                                        th2 = th4;
                                        inputStream2 = 0;
                                        httpURLConnection = httpURLConnection2;
                                        if (httpURLConnection != null) {
                                        }
                                        if (inputStream2 != 0) {
                                        }
                                        if (fileOutputStream != null) {
                                        }
                                        throw th2;
                                    }
                                } catch (Exception e14) {
                                    e = e14;
                                    fileOutputStream = null;
                                    i13 = 0;
                                    httpURLConnection = httpURLConnection2;
                                    inputStream = fileOutputStream;
                                    offlineAssets = ApplicationPersistence.getInstance().getOfflineAssets();
                                    i14 = 0;
                                    while (true) {
                                        if (i14 >= offlineAssets.size()) {
                                        }
                                        i14++;
                                    }
                                    if (!(e instanceof InterruptedIOException)) {
                                        LogHelper.INSTANCE.e(this.TAG, e);
                                        closeConnection(fileOutputStream, str3, str, Boolean.TRUE);
                                        ConnectionStatusReceiver.isConnected();
                                        broadcastDownloadProgress(str2, -1);
                                        if (httpURLConnection != null) {
                                        }
                                        if (inputStream != null) {
                                        }
                                        if (fileOutputStream != null) {
                                        }
                                        z10 = false;
                                        i6 = 100;
                                        Intent intent22 = new Intent(DOWNLOAD_SERVICE_BROADCAST);
                                        intent22.putExtra(DOWNLOAD_STATUS, i6);
                                        n1.a.a(MyApplication.V.a()).c(intent22);
                                        return z10;
                                    }
                                    LogHelper.INSTANCE.w(this.TAG, e.toString());
                                    closeConnection(fileOutputStream, str3, str, Boolean.TRUE);
                                    ConnectionStatusReceiver.isConnected();
                                    broadcastDownloadProgress(str2, -1);
                                    if (httpURLConnection != null) {
                                    }
                                    if (inputStream != null) {
                                    }
                                    if (fileOutputStream != null) {
                                    }
                                    z10 = false;
                                    i6 = 100;
                                    Intent intent222 = new Intent(DOWNLOAD_SERVICE_BROADCAST);
                                    intent222.putExtra(DOWNLOAD_STATUS, i6);
                                    n1.a.a(MyApplication.V.a()).c(intent222);
                                    return z10;
                                }
                            } catch (Throwable th5) {
                                th2 = th5;
                                fileOutputStream = null;
                                httpURLConnection = httpURLConnection2;
                                inputStream2 = fileOutputStream;
                                if (httpURLConnection != null) {
                                    try {
                                        httpURLConnection.disconnect();
                                    } catch (Exception e15) {
                                        LogHelper.INSTANCE.e(e15);
                                        throw th2;
                                    }
                                }
                                if (inputStream2 != 0) {
                                    inputStream2.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                throw th2;
                            }
                        } catch (Exception e16) {
                            e = e16;
                            fileOutputStream = null;
                            i11 = 0;
                        }
                    } catch (Exception e17) {
                        e = e17;
                        fileOutputStream = null;
                        inputStream = null;
                        i11 = 0;
                        i13 = 0;
                    } catch (Throwable th6) {
                        th2 = th6;
                        fileOutputStream = null;
                    }
                    i6 = 100;
                }
                z10 = false;
                i6 = 100;
            } else {
                changeStatus(str, Boolean.FALSE);
                i6 = 3;
                z10 = false;
            }
            Intent intent2222 = new Intent(DOWNLOAD_SERVICE_BROADCAST);
            intent2222.putExtra(DOWNLOAD_STATUS, i6);
            n1.a.a(MyApplication.V.a()).c(intent2222);
            return z10;
        } catch (Exception e18) {
            changeStatus(str, Boolean.FALSE);
            LogHelper.INSTANCE.e(e18);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0227 A[Catch: Exception -> 0x0280, TryCatch #5 {Exception -> 0x0280, blocks: (B:3:0x0001, B:5:0x0009, B:7:0x0027, B:9:0x0048, B:11:0x0050, B:12:0x0052, B:15:0x005c, B:40:0x0163, B:86:0x01eb, B:103:0x021b, B:102:0x0216, B:18:0x0076, B:107:0x021f, B:109:0x0227, B:119:0x0266, B:110:0x022f, B:112:0x023c, B:114:0x024b, B:116:0x0253, B:117:0x0260, B:75:0x01ca, B:79:0x01d2, B:81:0x01d7, B:82:0x01da, B:84:0x01e7, B:91:0x01f5, B:95:0x01fd, B:97:0x0202, B:98:0x0205, B:100:0x0212, B:13:0x0053, B:14:0x005b, B:32:0x0145, B:34:0x014d, B:35:0x0150, B:37:0x015d), top: B:131:0x0001, inners: #0, #9, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b9 A[Catch: all -> 0x01f1, TRY_LEAVE, TryCatch #6 {all -> 0x01f1, blocks: (B:23:0x00c6, B:24:0x00c9, B:26:0x00cf, B:27:0x00da, B:28:0x012d, B:31:0x0134, B:44:0x016c, B:60:0x0186, B:62:0x018a, B:64:0x018e, B:66:0x0192, B:69:0x0197, B:71:0x01ae, B:73:0x01b9, B:70:0x019f), top: B:132:0x00c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d2 A[Catch: Exception -> 0x01ce, TryCatch #0 {Exception -> 0x01ce, blocks: (B:75:0x01ca, B:79:0x01d2, B:81:0x01d7, B:82:0x01da, B:84:0x01e7), top: B:127:0x01ca, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d7 A[Catch: Exception -> 0x01ce, TryCatch #0 {Exception -> 0x01ce, blocks: (B:75:0x01ca, B:79:0x01d2, B:81:0x01d7, B:82:0x01da, B:84:0x01e7), top: B:127:0x01ca, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e7 A[Catch: Exception -> 0x01ce, TRY_LEAVE, TryCatch #0 {Exception -> 0x01ce, blocks: (B:75:0x01ca, B:79:0x01d2, B:81:0x01d7, B:82:0x01da, B:84:0x01e7), top: B:127:0x01ca, outer: #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void downloadFiles() {
        int i6;
        String str;
        String str2;
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        HttpURLConnection httpURLConnection;
        int contentLength;
        try {
            if (this.downloadUrl.size() > 0) {
                n1.a.a(this.context).b(this.downloadPriorityBroadcast, new IntentFilter(DOWNLOAD_PRIORITY_BROADCAST));
                HttpURLConnection httpURLConnection2 = null;
                gk.a.b(null, "ad_init");
                if (ConnectionStatusReceiver.isConnected()) {
                    StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                    if ((statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) / 1048576 > 100) {
                        while (this.downloadUrl.size() > 0) {
                            synchronized (this.downloadUrl) {
                                str = this.downloadUrl.get(0);
                            }
                            changeStatus(str, Boolean.TRUE);
                            String[] split = str.split("/");
                            String str3 = split[split.length - 1];
                            if (str.contains("https:")) {
                                str2 = str;
                            } else {
                                str2 = "https:" + str;
                            }
                            try {
                                httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str2).openConnection()));
                                try {
                                    httpURLConnection.setRequestMethod("GET");
                                    httpURLConnection.setConnectTimeout(5000);
                                    httpURLConnection.connect();
                                    contentLength = httpURLConnection.getContentLength();
                                    fileOutputStream = this.context.openFileOutput(str3 + "_temp", 0);
                                    try {
                                        inputStream = httpURLConnection.getInputStream();
                                    } catch (Exception e10) {
                                        e = e10;
                                        inputStream = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        inputStream = null;
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    fileOutputStream = null;
                                    inputStream = null;
                                    if (!(e instanceof InterruptedIOException) && !(e instanceof UnknownHostException) && !(e instanceof ConnectException) && !(e instanceof SSLException)) {
                                        LogHelper.INSTANCE.e(this.TAG, e);
                                        closeConnection(fileOutputStream, str3, str, Boolean.FALSE);
                                        if (!ConnectionStatusReceiver.isConnected()) {
                                            Bundle bundle = new Bundle();
                                            bundle.putString("file_name", str3);
                                            gk.a.b(bundle, "ad_disconnected");
                                        }
                                        if (httpURLConnection != null) {
                                            try {
                                                httpURLConnection.disconnect();
                                            } catch (Exception e12) {
                                                LogHelper.INSTANCE.e(e12);
                                            }
                                        }
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        if (fileOutputStream != null) {
                                            fileOutputStream.close();
                                        }
                                        n1.a.a(this.context).d(this.downloadPriorityBroadcast);
                                        if (fileOutputStream != null) {
                                            fileOutputStream.close();
                                        }
                                        if (this.downloadUrl.size() == 0) {
                                        }
                                        i6 = 2;
                                        Intent intent = new Intent(DOWNLOAD_SERVICE_BROADCAST);
                                        intent.putExtra(DOWNLOAD_STATUS, i6);
                                        n1.a.a(MyApplication.V.a()).c(intent);
                                    }
                                    LogHelper.INSTANCE.w(this.TAG, e.toString());
                                    closeConnection(fileOutputStream, str3, str, Boolean.FALSE);
                                    if (!ConnectionStatusReceiver.isConnected()) {
                                    }
                                    if (httpURLConnection != null) {
                                    }
                                    if (inputStream != null) {
                                    }
                                    if (fileOutputStream != null) {
                                    }
                                    n1.a.a(this.context).d(this.downloadPriorityBroadcast);
                                    if (fileOutputStream != null) {
                                    }
                                    if (this.downloadUrl.size() == 0) {
                                    }
                                    i6 = 2;
                                    Intent intent2 = new Intent(DOWNLOAD_SERVICE_BROADCAST);
                                    intent2.putExtra(DOWNLOAD_STATUS, i6);
                                    n1.a.a(MyApplication.V.a()).c(intent2);
                                } catch (Throwable th3) {
                                    th = th3;
                                    fileOutputStream = null;
                                    inputStream = null;
                                }
                                try {
                                    try {
                                        byte[] bArr = new byte[Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID];
                                        int i10 = 0;
                                        while (true) {
                                            int read = inputStream.read(bArr);
                                            if (read <= 0) {
                                                break;
                                            }
                                            i10 += read;
                                            broadcastDownloadProgress(str2, (i10 * 100) / contentLength);
                                            fileOutputStream.write(bArr, 0, read);
                                        }
                                        File file = new File(this.context.getFilesDir().toString() + "/" + str3 + "_temp");
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(this.context.getFilesDir().toString());
                                        sb2.append("/");
                                        sb2.append(str3);
                                        file.renameTo(new File(sb2.toString()));
                                        updateDownloadedFile(str);
                                        synchronized (this.downloadUrl) {
                                            this.downloadUrl.remove(0);
                                        }
                                        this.retrydownloadFlag = true;
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putString("file_name", str3);
                                        gk.a.b(bundle2, "ad_file_success");
                                        try {
                                            httpURLConnection.disconnect();
                                            inputStream.close();
                                            if (fileOutputStream != null) {
                                                fileOutputStream.close();
                                            }
                                            n1.a.a(this.context).d(this.downloadPriorityBroadcast);
                                            if (fileOutputStream != null) {
                                                fileOutputStream.close();
                                            }
                                        } catch (Exception e13) {
                                            LogHelper.INSTANCE.e(e13);
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        httpURLConnection2 = httpURLConnection;
                                        if (httpURLConnection2 != null) {
                                            try {
                                                httpURLConnection2.disconnect();
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
                                        n1.a.a(this.context).d(this.downloadPriorityBroadcast);
                                        if (fileOutputStream != null) {
                                            fileOutputStream.close();
                                        }
                                        throw th;
                                    }
                                } catch (Exception e15) {
                                    e = e15;
                                    if (!(e instanceof InterruptedIOException)) {
                                        LogHelper.INSTANCE.e(this.TAG, e);
                                        closeConnection(fileOutputStream, str3, str, Boolean.FALSE);
                                        if (!ConnectionStatusReceiver.isConnected()) {
                                        }
                                        if (httpURLConnection != null) {
                                        }
                                        if (inputStream != null) {
                                        }
                                        if (fileOutputStream != null) {
                                        }
                                        n1.a.a(this.context).d(this.downloadPriorityBroadcast);
                                        if (fileOutputStream != null) {
                                        }
                                        if (this.downloadUrl.size() == 0) {
                                        }
                                        i6 = 2;
                                        Intent intent22 = new Intent(DOWNLOAD_SERVICE_BROADCAST);
                                        intent22.putExtra(DOWNLOAD_STATUS, i6);
                                        n1.a.a(MyApplication.V.a()).c(intent22);
                                    }
                                    LogHelper.INSTANCE.w(this.TAG, e.toString());
                                    closeConnection(fileOutputStream, str3, str, Boolean.FALSE);
                                    if (!ConnectionStatusReceiver.isConnected()) {
                                    }
                                    if (httpURLConnection != null) {
                                    }
                                    if (inputStream != null) {
                                    }
                                    if (fileOutputStream != null) {
                                    }
                                    n1.a.a(this.context).d(this.downloadPriorityBroadcast);
                                    if (fileOutputStream != null) {
                                    }
                                    if (this.downloadUrl.size() == 0) {
                                    }
                                    i6 = 2;
                                    Intent intent222 = new Intent(DOWNLOAD_SERVICE_BROADCAST);
                                    intent222.putExtra(DOWNLOAD_STATUS, i6);
                                    n1.a.a(MyApplication.V.a()).c(intent222);
                                }
                            } catch (Exception e16) {
                                e = e16;
                                httpURLConnection = null;
                            } catch (Throwable th5) {
                                th = th5;
                                fileOutputStream = null;
                                inputStream = null;
                            }
                        }
                        if (this.downloadUrl.size() == 0) {
                            gk.a.b(null, "ad_all_complete");
                            i6 = 100;
                        }
                    } else {
                        gk.a.b(null, "ad_insufficient_space");
                        if (this.downloadUrl.size() > 0) {
                            changeStatus(this.downloadUrl.get(0), Boolean.FALSE);
                        }
                        i6 = 3;
                    }
                    Intent intent2222 = new Intent(DOWNLOAD_SERVICE_BROADCAST);
                    intent2222.putExtra(DOWNLOAD_STATUS, i6);
                    n1.a.a(MyApplication.V.a()).c(intent2222);
                }
                if (this.downloadUrl.size() > 0) {
                    changeStatus(this.downloadUrl.get(0), Boolean.FALSE);
                }
                gk.a.b(null, "ad_no_network");
                i6 = 2;
                Intent intent22222 = new Intent(DOWNLOAD_SERVICE_BROADCAST);
                intent22222.putExtra(DOWNLOAD_STATUS, i6);
                n1.a.a(MyApplication.V.a()).c(intent22222);
            }
        } catch (Exception e17) {
            if (this.downloadUrl.size() > 0) {
                changeStatus(this.downloadUrl.get(0), Boolean.FALSE);
            }
            LogHelper.INSTANCE.e(e17);
        }
    }

    public void downloadPendingFiles() {
        try {
            if (FirebasePersistence.getInstance().getUser() != null && FirebasePersistence.getInstance().getUser().getCurrentCourse() != null) {
                Iterator<OfflineAsset> it = ApplicationPersistence.getInstance().getOfflineAssets(FirebasePersistence.getInstance().getUser().getCurrentCourse()).iterator();
                while (it.hasNext()) {
                    OfflineAsset next = it.next();
                    if (!next.isDownloaded() && next.getIsDownloading() && !this.downloadUrl.contains(next.getFileUrl()) && next.getDownloadedBits() == -1) {
                        this.downloadUrl.add(next.getFileUrl());
                    }
                }
            }
            Iterator<OfflineAsset> it2 = ApplicationPersistence.getInstance().getOfflineAssets(Constants.COURSE_ALL_ID).iterator();
            while (it2.hasNext()) {
                OfflineAsset next2 = it2.next();
                if (!next2.isDownloaded() && next2.getIsDownloading() && !this.downloadUrl.contains(next2.getFileUrl()) && next2.getDownloadedBits() == -1) {
                    this.downloadUrl.add(next2.getFileUrl());
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }
}
