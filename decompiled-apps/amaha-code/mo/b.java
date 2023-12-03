package mo;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;
import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import dw.z;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.j;
import lv.e0;
import org.json.JSONObject;
/* compiled from: ProDashboardRepository.kt */
/* loaded from: classes2.dex */
public final class b implements ValueEventListener, CustomRetrofitCallback {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ j f25657u;

    @Override // com.google.firebase.database.ValueEventListener
    public void onCancelled(DatabaseError error) {
        i.g(error, "error");
        j jVar = this.f25657u;
        if (jVar.a()) {
            jVar.resumeWith(null);
        }
    }

    @Override // com.google.firebase.database.ValueEventListener
    public void onDataChange(DataSnapshot snapshot) {
        i.g(snapshot, "snapshot");
        boolean exists = snapshot.exists();
        j jVar = this.f25657u;
        if (exists && snapshot.hasChildren()) {
            if (jVar.a()) {
                jVar.resumeWith(Integer.valueOf((int) snapshot.getChildrenCount()));
            }
        } else if (jVar.a()) {
            jVar.resumeWith(null);
        }
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public void onFailure(dw.b call, Throwable t3) {
        i.g(call, "call");
        i.g(t3, "t");
        j jVar = this.f25657u;
        if (jVar.a()) {
            jVar.resumeWith(new hs.f(Boolean.FALSE, "Something went wrong"));
        }
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public void onResponse(dw.b call, z response) {
        boolean z10;
        String optString;
        i.g(call, "call");
        i.g(response, "response");
        CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
        boolean a10 = response.a();
        String str = null;
        j jVar = this.f25657u;
        if (a10) {
            if (jVar.a()) {
                jVar.resumeWith(new hs.f(Boolean.TRUE, null));
            }
        } else if (jVar.a()) {
            e0 e0Var = response.f13697c;
            if (e0Var != null) {
                str = e0Var.h();
            }
            Boolean bool = Boolean.FALSE;
            if (str != null && str.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            String str2 = "Something went wrong";
            if (!z10 && (optString = new JSONObject(str).optString("message")) != null) {
                str2 = optString;
            }
            jVar.resumeWith(new hs.f(bool, str2));
        }
    }
}
