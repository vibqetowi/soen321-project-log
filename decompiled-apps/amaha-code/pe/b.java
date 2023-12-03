package pe;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Callable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f28392u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ d f28393v;

    public /* synthetic */ b(d dVar, int i6) {
        this.f28392u = i6;
        this.f28393v = dVar;
    }

    private final void a() {
        d dVar = this.f28393v;
        synchronized (dVar) {
            dVar.f28396a.get().k(System.currentTimeMillis(), dVar.f28398c.get().a());
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String byteArrayOutputStream;
        switch (this.f28392u) {
            case 0:
                d dVar = this.f28393v;
                synchronized (dVar) {
                    h hVar = dVar.f28396a.get();
                    ArrayList c10 = hVar.c();
                    hVar.b();
                    JSONArray jSONArray = new JSONArray();
                    for (int i6 = 0; i6 < c10.size(); i6++) {
                        i iVar = (i) c10.get(i6);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("agent", iVar.b());
                        jSONObject.put("dates", new JSONArray((Collection) iVar.a()));
                        jSONArray.put(jSONObject);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("heartbeats", jSONArray);
                    jSONObject2.put("version", "2");
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                    } catch (Throwable th2) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
                return byteArrayOutputStream;
            default:
                a();
                return null;
        }
    }
}
