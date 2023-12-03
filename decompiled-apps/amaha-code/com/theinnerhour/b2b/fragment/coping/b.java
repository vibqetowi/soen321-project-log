package com.theinnerhour.b2b.fragment.coping;

import com.google.android.material.bottomsheet.f;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.x;
import ss.l;
/* compiled from: StressRelaxingActivityFragment.kt */
/* loaded from: classes2.dex */
public final class b extends k implements l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a f11717u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ FirestoreGoal f11718v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ x<f> f11719w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, FirestoreGoal firestoreGoal, x<f> xVar) {
        super(1);
        this.f11717u = aVar;
        this.f11718v = firestoreGoal;
        this.f11719w = xVar;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        if (bool.booleanValue()) {
            int i6 = a.f11685k0;
            this.f11717u.r0(this.f11718v, null);
        }
        f fVar = this.f11719w.f23469u;
        if (fVar != null) {
            fVar.dismiss();
        }
        return hs.k.f19476a;
    }
}
