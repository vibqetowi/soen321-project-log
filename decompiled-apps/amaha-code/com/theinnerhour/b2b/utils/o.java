package com.theinnerhour.b2b.utils;

import android.content.Context;
import e4.l;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.u;
import org.json.JSONObject;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class o implements l.b {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f11819u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Serializable f11820v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Serializable f11821w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f11822x;

    public /* synthetic */ o(Serializable serializable, Serializable serializable2, Object obj, int i6) {
        this.f11819u = i6;
        this.f11820v = serializable;
        this.f11821w = serializable2;
        this.f11822x = obj;
    }

    @Override // e4.l.b
    public final void a(Object obj) {
        int i6 = this.f11819u;
        Object obj2 = this.f11822x;
        Serializable serializable = this.f11821w;
        Serializable serializable2 = this.f11820v;
        switch (i6) {
            case 0:
                Utils$checkAndDownloadProfileAssets$1.f((u) serializable2, (u) serializable, (Context) obj2, (JSONObject) obj);
                return;
            default:
                CourseApiUtil.b((String) serializable2, (ArrayList) serializable, (CourseApiUtil) obj2, (JSONObject) obj);
                return;
        }
    }
}
