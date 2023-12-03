package q5;

import android.os.AsyncTask;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;
/* compiled from: FileDownloadTask.kt */
/* loaded from: classes.dex */
public final class g extends AsyncTask<String, Void, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public final String f29159a;

    /* renamed from: b  reason: collision with root package name */
    public final File f29160b;

    /* renamed from: c  reason: collision with root package name */
    public final a f29161c;

    /* compiled from: FileDownloadTask.kt */
    /* loaded from: classes.dex */
    public interface a {
        void c(File file);
    }

    public g(String uriStr, File file, a aVar) {
        kotlin.jvm.internal.i.g(uriStr, "uriStr");
        this.f29159a = uriStr;
        this.f29160b = file;
        this.f29161c = aVar;
    }

    public final Boolean a(String... args) {
        if (b6.a.b(this)) {
            return null;
        }
        try {
            kotlin.jvm.internal.i.g(args, "args");
            try {
                URL url = new URL(this.f29159a);
                int contentLength = ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection())).getContentLength();
                DataInputStream dataInputStream = new DataInputStream(FirebasePerfUrlConnection.openStream(url));
                byte[] bArr = new byte[contentLength];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.f29160b));
                dataOutputStream.write(bArr);
                dataOutputStream.flush();
                dataOutputStream.close();
                return Boolean.TRUE;
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Boolean doInBackground(String[] strArr) {
        if (b6.a.b(this)) {
            return null;
        }
        try {
            return a(strArr);
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Boolean bool) {
        if (b6.a.b(this)) {
            return;
        }
        try {
            boolean booleanValue = bool.booleanValue();
            if (!b6.a.b(this) && booleanValue) {
                this.f29161c.c(this.f29160b);
            }
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }
}
