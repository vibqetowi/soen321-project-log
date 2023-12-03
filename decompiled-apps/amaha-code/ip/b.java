package ip;

import com.theinnerhour.b2b.components.splash.activity.SplashScreenActivity;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.ConnectionStatusReceiver;
import jp.d;
import jp.e;
import kc.f;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ss.l;
import ta.v;
/* compiled from: SplashScreenActivity.kt */
/* loaded from: classes2.dex */
public final class b extends k implements l<hc.a, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ SplashScreenActivity f20507u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SplashScreenActivity splashScreenActivity) {
        super(1);
        this.f20507u = splashScreenActivity;
    }

    @Override // ss.l
    public final hs.k invoke(hc.a aVar) {
        hc.a it = aVar;
        i.f(it, "it");
        SplashScreenActivity splashScreenActivity = this.f20507u;
        splashScreenActivity.C = it;
        if (it.f17359b == 2) {
            if (ConnectionStatusReceiver.isConnected()) {
                d dVar = splashScreenActivity.B;
                if (dVar != null) {
                    hc.a aVar2 = splashScreenActivity.C;
                    if (aVar2 != null) {
                        v.H(f.H(dVar), null, 0, new e(dVar, aVar2.f17358a, null), 3);
                    } else {
                        i.q("appUpdateInfo");
                        throw null;
                    }
                } else {
                    i.q("splashScreenViewModel");
                    throw null;
                }
            } else if (214 < ApplicationPersistence.getInstance().getIntValue("last_supported_version", 78)) {
                hc.a aVar3 = splashScreenActivity.C;
                if (aVar3 != null) {
                    SplashScreenActivity.v0(splashScreenActivity, aVar3, 1, splashScreenActivity.A);
                } else {
                    i.q("appUpdateInfo");
                    throw null;
                }
            } else {
                int intValue = ApplicationPersistence.getInstance().getIntValue("previousVersion");
                hc.a aVar4 = splashScreenActivity.C;
                if (aVar4 != null) {
                    if (intValue != aVar4.f17358a) {
                        ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
                        hc.a aVar5 = splashScreenActivity.C;
                        if (aVar5 != null) {
                            applicationPersistence.setIntValue("previousVersion", aVar5.f17358a);
                            hc.a aVar6 = splashScreenActivity.C;
                            if (aVar6 != null) {
                                SplashScreenActivity.v0(splashScreenActivity, aVar6, 0, splashScreenActivity.f11628z);
                            } else {
                                i.q("appUpdateInfo");
                                throw null;
                            }
                        } else {
                            i.q("appUpdateInfo");
                            throw null;
                        }
                    } else {
                        d dVar2 = splashScreenActivity.B;
                        if (dVar2 != null) {
                            dVar2.f();
                        } else {
                            i.q("splashScreenViewModel");
                            throw null;
                        }
                    }
                } else {
                    i.q("appUpdateInfo");
                    throw null;
                }
            }
        } else {
            d dVar3 = splashScreenActivity.B;
            if (dVar3 != null) {
                dVar3.f();
            } else {
                i.q("splashScreenViewModel");
                throw null;
            }
        }
        return hs.k.f19476a;
    }
}
