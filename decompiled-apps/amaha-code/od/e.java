package od;

import android.util.Log;
import com.theinnerhour.b2b.utils.SessionManager;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: MetaDataStore.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f27355b = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final sd.b f27356a;

    public e(sd.b bVar) {
        this.f27356a = bVar;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String str2 = null;
            if (!jSONObject.isNull(next)) {
                str2 = jSONObject.optString(next, null);
            }
            hashMap.put(next, str2);
        }
        return hashMap;
    }

    public static void d(File file) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath(), null);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [long] */
    public final Map<String, String> b(String str, boolean z10) {
        File b10;
        FileInputStream fileInputStream;
        Exception e10;
        sd.b bVar = this.f27356a;
        if (z10) {
            b10 = bVar.b(str, "internal-keys");
        } else {
            b10 = bVar.b(str, "keys");
        }
        if (b10.exists()) {
            ?? length = b10.length();
            if (length != 0) {
                Closeable closeable = null;
                try {
                    try {
                        fileInputStream = new FileInputStream(b10);
                        try {
                            HashMap a10 = a(nd.f.l(fileInputStream));
                            nd.f.a(fileInputStream, "Failed to close user metadata file.");
                            return a10;
                        } catch (Exception e11) {
                            e10 = e11;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e10);
                            d(b10);
                            nd.f.a(fileInputStream, "Failed to close user metadata file.");
                            return Collections.emptyMap();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        closeable = length;
                        nd.f.a(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                } catch (Exception e12) {
                    fileInputStream = null;
                    e10 = e12;
                } catch (Throwable th3) {
                    th = th3;
                    nd.f.a(closeable, "Failed to close user metadata file.");
                    throw th;
                }
            }
        }
        d(b10);
        return Collections.emptyMap();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    public final String c(String str) {
        FileInputStream fileInputStream;
        String str2;
        File b10 = this.f27356a.b(str, "user-data");
        Closeable closeable = null;
        if (b10.exists()) {
            ?? r32 = (b10.length() > 0L ? 1 : (b10.length() == 0L ? 0 : -1));
            try {
                if (r32 != 0) {
                    try {
                        fileInputStream = new FileInputStream(b10);
                        try {
                            JSONObject jSONObject = new JSONObject(nd.f.l(fileInputStream));
                            if (!jSONObject.isNull(SessionManager.KEY_USERID)) {
                                str2 = jSONObject.optString(SessionManager.KEY_USERID, null);
                            } else {
                                str2 = null;
                            }
                            String str3 = "Loaded userId " + str2 + " for session " + str;
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str3, null);
                            }
                            nd.f.a(fileInputStream, "Failed to close user metadata file.");
                            return str2;
                        } catch (Exception e10) {
                            e = e10;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                            d(b10);
                            nd.f.a(fileInputStream, "Failed to close user metadata file.");
                            return null;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        fileInputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        nd.f.a(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                closeable = r32;
            }
        }
        String r = defpackage.c.r("No userId set for session ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", r, null);
        }
        d(b10);
        return null;
    }
}
