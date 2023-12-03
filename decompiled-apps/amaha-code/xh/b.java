package xh;

import android.net.Uri;
import com.moengage.core.internal.rest.exceptions.InvalidRequestException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: Request.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f37774a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f37775b;

    /* renamed from: c  reason: collision with root package name */
    public JSONObject f37776c;

    /* renamed from: d  reason: collision with root package name */
    public final String f37777d;

    /* renamed from: e  reason: collision with root package name */
    public final Uri f37778e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public String f37779g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f37780h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f37781i;

    public /* synthetic */ b(Uri uri, int i6, Map map, JSONObject jSONObject, String str, int i10, String str2, boolean z10, boolean z11) {
        this.f37778e = uri;
        this.f37774a = i6;
        this.f37775b = map;
        this.f37776c = jSONObject;
        this.f37777d = str;
        this.f = i10;
        this.f37779g = str2;
        this.f37780h = z10;
        this.f37781i = z11;
    }

    public final b a() {
        if (this.f37774a == 1 && this.f37776c != null) {
            throw new InvalidRequestException();
        }
        if (this.f37780h && di.b.t(this.f37779g)) {
            throw new InvalidKeyException("Encryption key cannot be null.");
        }
        return new b(this.f37778e, this.f37774a, this.f37775b, this.f37776c, this.f37777d, this.f, this.f37779g, this.f37780h, this.f37781i);
    }

    public /* synthetic */ b(Uri uri, int i6) {
        this.f37781i = true;
        this.f37778e = uri;
        this.f37774a = i6;
        this.f37775b = new HashMap();
        this.f37777d = "application/json";
        this.f = 10;
    }
}
