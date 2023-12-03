package ud;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.internal.cast.w;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONObject;
import s1.s;
import ya.k;
/* compiled from: SettingsController.java */
/* loaded from: classes.dex */
public final class c implements ya.g<Void, Void> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ d f34009u;

    public c(d dVar) {
        this.f34009u = dVar;
    }

    @Override // ya.g
    public final ya.h<Void> h(Void r12) {
        JSONObject jSONObject;
        FileWriter fileWriter;
        d dVar = this.f34009u;
        s sVar = dVar.f;
        g gVar = dVar.f34011b;
        sVar.getClass();
        FileWriter fileWriter2 = null;
        try {
            HashMap w10 = s.w(gVar);
            ((df.b) sVar.f31224v).getClass();
            rd.a aVar = new rd.a((String) sVar.f31225w, w10);
            HashMap hashMap = aVar.f30661c;
            hashMap.put("User-Agent", "Crashlytics Android SDK/18.3.5");
            hashMap.put("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            s.k(aVar, gVar);
            ((w) sVar.f31226x).e("Requesting settings from " + ((String) sVar.f31225w));
            ((w) sVar.f31226x).h("Settings query params were: " + w10);
            jSONObject = sVar.A(aVar.b());
        } catch (IOException e10) {
            if (((w) sVar.f31226x).d(6)) {
                Log.e("FirebaseCrashlytics", "Settings request failed.", e10);
            }
            jSONObject = null;
        }
        if (jSONObject != null) {
            b h10 = dVar.f34012c.h(jSONObject);
            long j10 = h10.f34002c;
            gd.d dVar2 = dVar.f34014e;
            dVar2.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j10);
                fileWriter = new FileWriter((File) dVar2.f16400v);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception e11) {
                        e = e11;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        nd.f.a(fileWriter, "Failed to close settings writer.");
                        d.c(jSONObject, "Loaded settings: ");
                        String str = gVar.f;
                        SharedPreferences.Editor edit = dVar.f34010a.getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        edit.putString("existing_instance_identifier", str);
                        edit.apply();
                        dVar.f34016h.set(h10);
                        dVar.f34017i.get().d(h10);
                        return k.e(null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter2 = fileWriter;
                    nd.f.a(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e12) {
                e = e12;
                fileWriter = null;
            } catch (Throwable th3) {
                th = th3;
                nd.f.a(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            nd.f.a(fileWriter, "Failed to close settings writer.");
            d.c(jSONObject, "Loaded settings: ");
            String str2 = gVar.f;
            SharedPreferences.Editor edit2 = dVar.f34010a.getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str2);
            edit2.apply();
            dVar.f34016h.set(h10);
            dVar.f34017i.get().d(h10);
        }
        return k.e(null);
    }
}
