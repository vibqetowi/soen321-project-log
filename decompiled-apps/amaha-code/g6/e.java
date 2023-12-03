package g6;

import com.facebook.FacebookException;
import g6.h;
import g6.p;
import h5.q;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements q.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16254a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f16255b;

    public /* synthetic */ e(h hVar, int i6) {
        this.f16254a = i6;
        this.f16255b = hVar;
    }

    @Override // h5.q.b
    public final void a(h5.u uVar) {
        boolean z10 = false;
        switch (this.f16254a) {
            case 0:
                h this$0 = this.f16255b;
                int i6 = h.F;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (!this$0.f16268y.get()) {
                    h5.n nVar = uVar.f17318c;
                    if (nVar != null) {
                        int i10 = nVar.f17261w;
                        if ((i10 == 1349174 || i10 == 1349172) ? true : true) {
                            this$0.Q();
                            return;
                        } else if (i10 == 1349152) {
                            h.c cVar = this$0.B;
                            if (cVar != null) {
                                v5.a aVar = v5.a.f34812a;
                                v5.a.a(cVar.f16274v);
                            }
                            p.d dVar = this$0.E;
                            if (dVar != null) {
                                this$0.U(dVar);
                                return;
                            } else {
                                this$0.K();
                                return;
                            }
                        } else if (i10 == 1349173) {
                            this$0.K();
                            return;
                        } else {
                            FacebookException facebookException = nVar.C;
                            if (facebookException == null) {
                                facebookException = new FacebookException();
                            }
                            this$0.M(facebookException);
                            return;
                        }
                    }
                    try {
                        JSONObject jSONObject = uVar.f17317b;
                        if (jSONObject == null) {
                            jSONObject = new JSONObject();
                        }
                        String string = jSONObject.getString("access_token");
                        kotlin.jvm.internal.i.f(string, "resultObject.getString(\"access_token\")");
                        this$0.O(string, jSONObject.getLong("expires_in"), Long.valueOf(jSONObject.optLong("data_access_expiration_time")));
                        return;
                    } catch (JSONException e10) {
                        this$0.M(new FacebookException(e10));
                        return;
                    }
                }
                return;
            default:
                int i11 = h.F;
                h this$02 = this.f16255b;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                if (!this$02.C) {
                    h5.n nVar2 = uVar.f17318c;
                    if (nVar2 != null) {
                        FacebookException facebookException2 = nVar2.C;
                        if (facebookException2 == null) {
                            facebookException2 = new FacebookException();
                        }
                        this$02.M(facebookException2);
                        return;
                    }
                    JSONObject jSONObject2 = uVar.f17317b;
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                    }
                    h.c cVar2 = new h.c();
                    try {
                        String string2 = jSONObject2.getString("user_code");
                        cVar2.f16274v = string2;
                        String format = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{string2}, 1));
                        kotlin.jvm.internal.i.f(format, "java.lang.String.format(locale, format, *args)");
                        cVar2.f16273u = format;
                        cVar2.f16275w = jSONObject2.getString("code");
                        cVar2.f16276x = jSONObject2.getLong("interval");
                        this$02.S(cVar2);
                        return;
                    } catch (JSONException e11) {
                        this$02.M(new FacebookException(e11));
                        return;
                    }
                }
                return;
        }
    }
}
