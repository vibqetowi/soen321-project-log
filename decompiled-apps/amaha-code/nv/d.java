package nv;

import lv.d;
import lv.d0;
import lv.z;
/* compiled from: CacheStrategy.kt */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final z f26851a;

    /* renamed from: b  reason: collision with root package name */
    public final d0 f26852b;

    /* compiled from: CacheStrategy.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static boolean a(z request, d0 response) {
            kotlin.jvm.internal.i.g(response, "response");
            kotlin.jvm.internal.i.g(request, "request");
            int i6 = response.f24586x;
            if (i6 != 200 && i6 != 410 && i6 != 414 && i6 != 501 && i6 != 203 && i6 != 204) {
                if (i6 != 307) {
                    if (i6 != 308 && i6 != 404 && i6 != 405) {
                        switch (i6) {
                            case 300:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (d0.e(response, "Expires") == null && response.a().f24573c == -1 && !response.a().f && !response.a().f24575e) {
                    return false;
                }
            }
            if (response.a().f24572b) {
                return false;
            }
            lv.d dVar = request.f;
            if (dVar == null) {
                int i10 = lv.d.f24570n;
                dVar = d.b.b(request.f24753c);
                request.f = dVar;
            }
            if (dVar.f24572b) {
                return false;
            }
            return true;
        }
    }

    public d(z zVar, d0 d0Var) {
        this.f26851a = zVar;
        this.f26852b = d0Var;
    }
}
