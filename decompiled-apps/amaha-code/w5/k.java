package w5;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import org.json.JSONException;
import org.json.JSONObject;
import w5.j0;
/* compiled from: FacebookWebFallbackDialog.kt */
/* loaded from: classes.dex */
public final class k extends j0 {
    public static final /* synthetic */ int I = 0;
    public boolean H;

    public k(androidx.fragment.app.p pVar, String str, String str2) {
        super(pVar, str);
        this.f36478v = str2;
    }

    public static void g(k this$0) {
        kotlin.jvm.internal.i.g(this$0, "this$0");
        super.cancel();
    }

    @Override // w5.j0
    public final Bundle c(String str) {
        Uri parse = Uri.parse(str);
        e0 e0Var = e0.f36453a;
        Bundle F = e0.F(parse.getQuery());
        String string = F.getString("bridge_args");
        F.remove("bridge_args");
        if (!e0.A(string)) {
            try {
                F.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", c.a(new JSONObject(string)));
            } catch (JSONException unused) {
                e0 e0Var2 = e0.f36453a;
                h5.p pVar = h5.p.f17269a;
            }
        }
        String string2 = F.getString("method_results");
        F.remove("method_results");
        if (!e0.A(string2)) {
            try {
                F.putBundle("com.facebook.platform.protocol.RESULT_ARGS", c.a(new JSONObject(string2)));
            } catch (JSONException unused2) {
                e0 e0Var3 = e0.f36453a;
                h5.p pVar2 = h5.p.f17269a;
            }
        }
        F.remove("version");
        w wVar = w.f36549a;
        int i6 = 0;
        if (!b6.a.b(w.class)) {
            try {
                i6 = w.f36553e[0].intValue();
            } catch (Throwable th2) {
                b6.a.a(w.class, th2);
            }
        }
        F.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", i6);
        return F;
    }

    @Override // w5.j0, android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        j0.f fVar = this.f36480x;
        if (this.E && !this.C && fVar != null && fVar.isShown()) {
            if (this.H) {
                return;
            }
            this.H = true;
            fVar.loadUrl(kotlin.jvm.internal.i.n("(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();", "javascript:"));
            new Handler(Looper.getMainLooper()).postDelayed(new androidx.activity.b(13, this), 1500L);
            return;
        }
        super.cancel();
    }
}
