package hn;

import c9.j;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import e4.l;
import org.json.JSONObject;
import p7.o;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements l.b, j.a {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f17785u;

    public /* synthetic */ a(int i6) {
        this.f17785u = i6;
    }

    @Override // e4.l.b
    public void a(Object obj) {
        switch (this.f17785u) {
            case 0:
                JSONObject jSONObject = (JSONObject) obj;
                try {
                    LogHelper logHelper = LogHelper.INSTANCE;
                    String tag_util = Utils.INSTANCE.getTAG_UTIL();
                    logHelper.i(tag_util, " " + jSONObject);
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(Utils.INSTANCE.getTAG_UTIL(), "exception", e10);
                    return;
                }
            default:
                Utils.updateTimezone$lambda$1((JSONObject) obj);
                return;
        }
    }

    @Override // c9.j.a
    public void invoke(Object obj) {
        switch (this.f17785u) {
            case 0:
                p7.o oVar = (p7.o) obj;
                oVar.p0();
                oVar.Y();
                oVar.X();
                return;
            default:
                p7.o oVar2 = (p7.o) obj;
                oVar2.D();
                oVar2.P();
                oVar2.X();
                return;
        }
    }

    public /* synthetic */ a(o.a aVar, String str, long j10, long j11, int i6) {
        this.f17785u = i6;
    }
}
