package wh;

import android.net.Uri;
import hh.g;
import ih.m;
import ih.n;
import ih.o;
import ih.p;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;
import org.json.JSONObject;
import tr.r;
/* compiled from: RemoteRepositoryImpl.kt */
/* loaded from: classes.dex */
public final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    public final f f36704a;

    /* renamed from: b  reason: collision with root package name */
    public final kc.f f36705b = new kc.f();

    public h(f fVar) {
        this.f36704a = fVar;
    }

    @Override // wh.g
    public final boolean e(oh.b bVar) {
        xh.a cVar;
        f fVar = this.f36704a;
        p pVar = fVar.f36702a;
        try {
            Uri build = f6.b.A0(pVar).appendEncodedPath("v2/sdk/device").appendPath((String) bVar.f22020c).build();
            i.f(build, "uriBuilder.build()");
            xh.b z02 = f6.b.z0(build, 2, pVar);
            z02.f37776c = r.l(bVar);
            z02.f37775b.put("MOE-REQUEST-ID", bVar.f27463g);
            cVar = new xh.e(z02.a(), pVar).e();
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new b(fVar));
            cVar = new xh.c(-100, "");
        }
        this.f36705b.getClass();
        if (cVar instanceof xh.d) {
            return true;
        }
        if (cVar instanceof xh.c) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // wh.g
    public final m f0(oh.a aVar) {
        xh.a cVar;
        f fVar = this.f36704a;
        p pVar = fVar.f36702a;
        try {
            Uri.Builder appendEncodedPath = f6.b.A0(pVar).appendEncodedPath("v3/sdkconfig/android/").appendEncodedPath((String) aVar.f22020c);
            JSONObject n10 = r.n(aVar);
            Uri build = appendEncodedPath.build();
            i.f(build, "uriBuilder.build()");
            xh.b z02 = f6.b.z0(build, 2, pVar);
            z02.f37776c = n10;
            if (aVar.f27460g) {
                String lowerCase = "DEFAULT".toLowerCase(Locale.ROOT);
                i.f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                z02.f37775b.put("MOE-PAYLOAD-ENC-KEY-TYPE", lowerCase);
                z02.f37779g = "28caa46a6e9c77fbe291287e4fec061f";
                z02.f37780h = true;
            }
            cVar = new xh.e(z02.a(), pVar).e();
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new a(fVar));
            cVar = new xh.c(-100, "");
        }
        kc.f fVar2 = this.f36705b;
        fVar2.getClass();
        try {
            if (cVar instanceof xh.d) {
                return new o(new ih.c(((xh.d) cVar).f37784a));
            }
            if (cVar instanceof xh.c) {
                return new n(null);
            }
            throw new NoWhenBranchMatchedException();
        } catch (Exception e11) {
            hh.a aVar2 = hh.g.f17610d;
            g.a.a(1, e11, new uh.d(fVar2));
            return new n(null);
        }
    }

    @Override // wh.g
    public final void q(oh.c cVar) {
        f fVar = this.f36704a;
        p pVar = fVar.f36702a;
        try {
            Uri build = f6.b.A0(pVar).appendEncodedPath("v1/sdk_logging/android").appendEncodedPath((String) cVar.f22020c).build();
            i.f(build, "uriBuilder.build()");
            xh.b z02 = f6.b.z0(build, 2, pVar);
            z02.f37781i = false;
            z02.f37776c = fVar.a(cVar);
            new xh.e(z02.a(), pVar).e();
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new e(fVar));
        }
    }

    @Override // wh.g
    public final oh.f z(oh.e eVar) {
        xh.a cVar;
        f fVar = this.f36704a;
        p pVar = fVar.f36702a;
        oh.d dVar = eVar.f27471i;
        try {
            Uri.Builder A0 = f6.b.A0(pVar);
            if (eVar.f27472j) {
                A0.appendEncodedPath("integration/send_report_add_call");
            } else {
                A0.appendEncodedPath("v2/sdk/report").appendEncodedPath((String) eVar.f22020c);
            }
            JSONObject jSONObject = dVar.f27467a;
            jSONObject.remove("MOE-REQUEST-ID");
            jSONObject.put("query_params", dVar.f27468b);
            Uri build = A0.build();
            i.f(build, "uriBuilder.build()");
            xh.b z02 = f6.b.z0(build, 2, pVar);
            z02.f37775b.put("MOE-REQUEST-ID", eVar.f27470h);
            z02.f37776c = jSONObject;
            cVar = new xh.e(z02.a(), pVar).e();
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new d(fVar));
            cVar = new xh.c(-100, "");
        }
        this.f36705b.getClass();
        if (cVar instanceof xh.d) {
            return new oh.f(true);
        }
        if (cVar instanceof xh.c) {
            xh.c cVar2 = (xh.c) cVar;
            return new oh.f(false);
        }
        throw new NoWhenBranchMatchedException();
    }
}
