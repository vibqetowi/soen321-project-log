package io;

import com.theinnerhour.b2b.utils.LogHelper;
import e4.l;
import ls.d;
import ls.h;
import org.json.JSONObject;
/* compiled from: ProAssessmentViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class a<T> implements l.b {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ d<JSONObject> f20413u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ c f20414v;

    public a(c cVar, h hVar) {
        this.f20413u = hVar;
        this.f20414v = cVar;
    }

    @Override // e4.l.b
    public final void a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        d<JSONObject> dVar = this.f20413u;
        try {
            dVar.resumeWith(jSONObject);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f20414v.f20417u, e10);
            dVar.resumeWith(null);
        }
    }
}
