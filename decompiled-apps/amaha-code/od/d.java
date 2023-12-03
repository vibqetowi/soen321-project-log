package od;

import com.theinnerhour.b2b.utils.SessionManager;
import org.json.JSONObject;
/* compiled from: MetaDataStore.java */
/* loaded from: classes.dex */
public final class d extends JSONObject {
    public d(String str) {
        put(SessionManager.KEY_USERID, str);
    }
}
