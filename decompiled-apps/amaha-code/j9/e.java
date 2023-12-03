package j9;

import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public static final y9.a f21757w = new y9.a("RevokeAccessOperation", new String[0]);

    /* renamed from: u  reason: collision with root package name */
    public final String f21758u;

    /* renamed from: v  reason: collision with root package name */
    public final com.google.android.gms.common.api.internal.o f21759v;

    public e(String str) {
        v9.o.e(str);
        this.f21758u = str;
        this.f21759v = new com.google.android.gms.common.api.internal.o(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        y9.a aVar = f21757w;
        Status status = Status.B;
        try {
            String str = this.f21758u;
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + str).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f7296z;
            } else {
                aVar.c("Unable to revoke access!", new Object[0]);
            }
            aVar.a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e10) {
            aVar.c("IOException when revoking access: ".concat(String.valueOf(e10.toString())), new Object[0]);
        } catch (Exception e11) {
            aVar.c("Exception when revoking access: ".concat(String.valueOf(e11.toString())), new Object[0]);
        }
        this.f21759v.a(status);
    }
}
