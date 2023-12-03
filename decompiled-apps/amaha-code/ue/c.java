package ue;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import sc.e;
import ue.a;
import v.h;
/* compiled from: PersistedInstallation.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public File f34041a;

    /* renamed from: b  reason: collision with root package name */
    public final e f34042b;

    public c(e eVar) {
        this.f34042b = eVar;
    }

    public final File a() {
        if (this.f34041a == null) {
            synchronized (this) {
                if (this.f34041a == null) {
                    e eVar = this.f34042b;
                    eVar.b();
                    File filesDir = eVar.f31432a.getFilesDir();
                    this.f34041a = new File(filesDir, "PersistedInstallation." + this.f34042b.g() + ".json");
                }
            }
        }
        return this.f34041a;
    }

    public final void b(a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", aVar.f34026b);
            jSONObject.put("Status", h.d(aVar.f34027c));
            jSONObject.put("AuthToken", aVar.f34028d);
            jSONObject.put("RefreshToken", aVar.f34029e);
            jSONObject.put("TokenCreationEpochInSecs", aVar.f34030g);
            jSONObject.put("ExpiresInSecs", aVar.f);
            jSONObject.put("FisError", aVar.f34031h);
            e eVar = this.f34042b;
            eVar.b();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", eVar.f31432a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(a())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public final a c() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(a());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i6 = d.f34043a;
        a.C0569a c0569a = new a.C0569a();
        c0569a.f = 0L;
        c0569a.b(1);
        c0569a.f34036e = 0L;
        c0569a.f34032a = optString;
        c0569a.b(h.e(5)[optInt]);
        c0569a.f34034c = optString2;
        c0569a.f34035d = optString3;
        c0569a.f = Long.valueOf(optLong);
        c0569a.f34036e = Long.valueOf(optLong2);
        c0569a.f34037g = optString4;
        return c0569a.a();
    }
}
