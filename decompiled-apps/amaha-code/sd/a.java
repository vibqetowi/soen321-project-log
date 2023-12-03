package sd;

import android.util.Log;
import ce.c;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import p0.d;
import pd.l;
import ud.f;
import w5.d0;
/* compiled from: CrashlyticsReportPersistence.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f31452d = Charset.forName("UTF-8");

    /* renamed from: e  reason: collision with root package name */
    public static final int f31453e = 15;
    public static final qd.a f = new qd.a();

    /* renamed from: g  reason: collision with root package name */
    public static final d f31454g = new d(18);

    /* renamed from: h  reason: collision with root package name */
    public static final d0 f31455h = new d0(7);

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f31456a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    public final b f31457b;

    /* renamed from: c  reason: collision with root package name */
    public final f f31458c;

    public a(b bVar, ud.d dVar) {
        this.f31457b = bVar;
        this.f31458c = dVar;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String d(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f31452d);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static void e(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f31452d);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        b bVar = this.f31457b;
        arrayList.addAll(b.e(bVar.f31463e.listFiles()));
        arrayList.addAll(b.e(bVar.f.listFiles()));
        d dVar = f31454g;
        Collections.sort(arrayList, dVar);
        List e10 = b.e(bVar.f31462d.listFiles());
        Collections.sort(e10, dVar);
        arrayList.addAll(e10);
        return arrayList;
    }

    public final void c(l lVar, String str, boolean z10) {
        String str2;
        b bVar = this.f31457b;
        int i6 = ((ud.d) this.f31458c).b().f34000a.f34008a;
        f.getClass();
        c cVar = qd.a.f29523a;
        cVar.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            cVar.a(lVar, stringWriter);
        } catch (IOException unused) {
        }
        String stringWriter2 = stringWriter.toString();
        String format = String.format(Locale.US, "%010d", Integer.valueOf(this.f31456a.getAndIncrement()));
        if (z10) {
            str2 = "_";
        } else {
            str2 = "";
        }
        try {
            e(bVar.b(str, defpackage.b.m("event", format, str2)), stringWriter2);
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e10);
        }
        d0 d0Var = new d0(6);
        bVar.getClass();
        File file = new File(bVar.f31461c, str);
        file.mkdirs();
        List<File> e11 = b.e(file.listFiles(d0Var));
        Collections.sort(e11, new d(17));
        int size = e11.size();
        for (File file2 : e11) {
            if (size > i6) {
                b.d(file2);
                size--;
            } else {
                return;
            }
        }
    }
}
