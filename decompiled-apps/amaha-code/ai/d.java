package ai;

import android.content.Context;
import android.graphics.Bitmap;
import com.theinnerhour.b2b.utils.Constants;
import ih.p;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
/* compiled from: FileManager.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final p f576a;

    /* renamed from: b  reason: collision with root package name */
    public final String f577b;

    /* renamed from: c  reason: collision with root package name */
    public final String f578c;

    /* compiled from: FileManager.kt */
    /* loaded from: classes.dex */
    public static final class a extends k implements ss.a<String> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" doesDirectoryExists() : ", d.this.f578c);
        }
    }

    /* compiled from: FileManager.kt */
    /* loaded from: classes.dex */
    public static final class b extends k implements ss.a<String> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" saveFile() : ", d.this.f578c);
        }
    }

    public d(Context context, p sdkInstance) {
        i.g(context, "context");
        i.g(sdkInstance, "sdkInstance");
        this.f576a = sdkInstance;
        String str = context.getFilesDir().getAbsolutePath() + "/moengage/" + ((String) sdkInstance.f20102a.f5133c);
        this.f577b = str;
        File file = new File(str);
        boolean exists = file.exists();
        hh.g gVar = sdkInstance.f20105d;
        if (!exists) {
            hh.g.b(gVar, 0, new ai.b(this), 3);
            file.mkdir();
        } else {
            hh.g.b(gVar, 0, new c(this), 3);
        }
        this.f578c = "Core_FileManager";
    }

    public static void b(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            file.delete();
            return;
        }
        int length = listFiles.length;
        int i6 = 0;
        while (i6 < length) {
            File file2 = listFiles[i6];
            i6++;
            if (file2.isDirectory()) {
                b(file2);
            } else {
                file2.delete();
            }
        }
        file.delete();
    }

    public final void a(String str) {
        if (!d(str)) {
            new File(this.f577b + '/' + str).mkdirs();
        }
    }

    public final void c(String folder) {
        i.g(folder, "folder");
        b(new File(this.f577b + '/' + folder));
    }

    public final boolean d(String directoryName) {
        i.g(directoryName, "directoryName");
        try {
            return new File(this.f577b + '/' + directoryName).exists();
        } catch (Exception e10) {
            this.f576a.f20105d.a(1, e10, new a());
            return false;
        }
    }

    public final boolean e(String directoryName, String fileName) {
        i.g(directoryName, "directoryName");
        i.g(fileName, "fileName");
        return new File(this.f577b + '/' + directoryName + '/' + fileName).exists();
    }

    public final String f(String directoryName, String str) {
        i.g(directoryName, "directoryName");
        String absolutePath = new File(this.f577b + '/' + directoryName + '/' + str).getAbsolutePath();
        i.f(absolutePath, "file.absolutePath");
        return absolutePath;
    }

    public final File g(String directoryName, String str, InputStream inputStream) {
        i.g(directoryName, "directoryName");
        try {
            byte[] bArr = new byte[Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID];
            a(directoryName);
            File file = new File(this.f577b + '/' + directoryName + '/' + str);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            while (true) {
                int read = inputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.close();
                    return file;
                }
            }
        } catch (Exception e10) {
            this.f576a.f20105d.a(1, e10, new b());
            return null;
        }
    }

    public final void h(Bitmap bitmap, String directoryName, String str) {
        FileOutputStream fileOutputStream;
        f fVar;
        hh.g gVar;
        p pVar = this.f576a;
        i.g(directoryName, "directoryName");
        a(directoryName);
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(this.f577b + '/' + directoryName + '/' + str);
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
            }
        } catch (Exception e10) {
            e = e10;
        }
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            try {
                fileOutputStream.close();
            } catch (IOException e11) {
                e = e11;
                gVar = pVar.f20105d;
                fVar = new f(this);
                gVar.a(1, e, fVar);
            }
        } catch (Exception e12) {
            e = e12;
            fileOutputStream2 = fileOutputStream;
            pVar.f20105d.a(1, e, new e(this));
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e13) {
                    e = e13;
                    fVar = new f(this);
                    gVar = pVar.f20105d;
                    gVar.a(1, e, fVar);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e14) {
                    pVar.f20105d.a(1, e14, new f(this));
                }
            }
            throw th;
        }
    }
}
