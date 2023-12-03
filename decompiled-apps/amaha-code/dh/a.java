package dh;

import is.y;
import pg.j;
import pg.k;
import pg.l;
import pg.m;
import pg.n;
/* compiled from: InitConfig.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f12855a;

    /* renamed from: b  reason: collision with root package name */
    public int f12856b = 1;

    /* renamed from: c  reason: collision with root package name */
    public final pg.a f12857c = new pg.a();

    /* renamed from: d  reason: collision with root package name */
    public final k f12858d = new k(new j(-1, -1), new pg.i(), new pg.c(true), new l());

    /* renamed from: e  reason: collision with root package name */
    public pg.h f12859e = new pg.h(3, false);
    public n f = new n(true, true, y.f20678u);

    /* renamed from: g  reason: collision with root package name */
    public final m f12860g = new m();

    /* renamed from: h  reason: collision with root package name */
    public final pg.e f12861h = new pg.e();

    /* renamed from: i  reason: collision with root package name */
    public final pg.b f12862i = new pg.b();

    /* renamed from: j  reason: collision with root package name */
    public final pg.d f12863j = new pg.d();

    public a(String str) {
        this.f12855a = str;
    }

    public final String toString() {
        return gv.j.u0("\n            {\n            appId: " + this.f12855a + "\n            dataRegion: " + defpackage.d.x(this.f12856b) + ",\n            cardConfig: " + this.f12857c + ",\n            pushConfig: " + this.f12858d + ",\n            isEncryptionEnabled: false,\n            log: " + this.f12859e + ",\n            trackingOptOut : " + this.f + "\n            rtt: " + this.f12860g + "\n            inApp :" + this.f12861h + "\n            dataSync: " + this.f12862i + "\n            geofence: " + this.f12863j + "\n            integrationPartner: null\n            }\n            ");
    }
}
