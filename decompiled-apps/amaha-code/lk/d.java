package lk;

import android.content.Context;
import android.content.Intent;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.utils.LogHelper;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
/* compiled from: DynamicActivityAssetDownloader.kt */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Context f24402a;

    /* renamed from: b  reason: collision with root package name */
    public final String f24403b = LogHelper.INSTANCE.makeLogTag("DynamicActivityAssetDownloader");

    public d(Context context, ArrayList<String> arrayList) {
        this.f24402a = context;
    }

    public final void a(FileOutputStream fileOutputStream, String str) {
        if (fileOutputStream != null) {
            try {
                fileOutputStream.flush();
            } catch (IOException e10) {
                LogHelper.INSTANCE.e(e10);
            }
        }
        File file = new File(this.f24402a.getFilesDir().toString() + '/' + str);
        if (file.exists() && file.delete()) {
            LogHelper.INSTANCE.i("downloadservice", "file deleted");
        }
        Intent intent = new Intent("com.theinnerhour.b2b.assetFileDownloadBroadcast");
        intent.putExtra("asset_file_name", str);
        intent.putExtra("asset_file_download_status", false);
        n1.a.a(MyApplication.V.a()).c(intent);
    }
}
