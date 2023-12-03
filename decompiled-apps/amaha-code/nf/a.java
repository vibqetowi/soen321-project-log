package nf;

import android.util.Log;
import com.google.firebase.abt.AbtException;
import org.json.JSONArray;
import org.json.JSONException;
import ya.g;
import ya.h;
import ya.k;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements g, ya.b {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ b f26288u;

    public /* synthetic */ a(b bVar) {
        this.f26288u = bVar;
    }

    @Override // ya.g
    public final h h(Object obj) {
        Void r12 = (Void) obj;
        return this.f26288u.a();
    }

    @Override // ya.b
    public final Object then(h hVar) {
        boolean z10;
        b bVar = this.f26288u;
        bVar.getClass();
        if (hVar.isSuccessful()) {
            of.b bVar2 = bVar.f26291c;
            synchronized (bVar2) {
                bVar2.f27441c = k.e(null);
            }
            bVar2.f27440b.a();
            if (hVar.getResult() != null) {
                JSONArray jSONArray = ((of.c) hVar.getResult()).f27446d;
                tc.b bVar3 = bVar.f26289a;
                if (bVar3 != null) {
                    try {
                        bVar3.b(b.i(jSONArray));
                    } catch (AbtException e10) {
                        Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e10);
                    } catch (JSONException e11) {
                        Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e11);
                    }
                }
            } else {
                Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
