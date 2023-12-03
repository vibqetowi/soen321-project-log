package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.common.api.Status;
import fd.m;
import gd.i;
import v9.o;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.oe  reason: invalid package */
/* loaded from: classes.dex */
public final class oe implements yd {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ pe f8032a;

    public oe(pe peVar) {
        this.f8032a = peVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.yd
    public final void a(Status status, m mVar) {
        boolean z10;
        pe peVar = this.f8032a;
        int i6 = peVar.f8058a;
        if (i6 == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        o.j("Unexpected response type " + i6, z10);
        gd.m mVar2 = peVar.f;
        if (mVar2 != null) {
            mVar2.b(status);
        }
        peVar.f8065i = mVar;
        gd.m mVar3 = peVar.f;
        if (mVar3 != null) {
            mVar3.b(status);
        }
        peVar.g(status);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.yd
    public final void b(jf jfVar, ef efVar) {
        boolean z10;
        pe peVar = this.f8032a;
        int i6 = peVar.f8058a;
        if (i6 == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        o.j("Unexpected response type: " + i6, z10);
        peVar.f8063g = jfVar;
        peVar.f8064h = efVar;
        peVar.b();
        o.j("no success or failure set on method implementation", peVar.f8067k);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.yd
    public final void c(Status status) {
        String str = status.f7299w;
        if (str != null) {
            if (str.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081, null);
            } else if (str.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082, null);
            } else if (str.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083, null);
            } else if (str.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084, null);
            } else if (str.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085, null);
            } else if (str.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086, null);
            } else if (str.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087, null);
            } else if (str.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088, null);
            } else if (str.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089, null);
            } else if (str.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090, null);
            }
        }
        pe peVar = this.f8032a;
        if (peVar.f8058a != 8) {
            gd.m mVar = peVar.f;
            if (mVar != null) {
                mVar.b(status);
            }
            peVar.g(status);
            return;
        }
        peVar.f8067k = true;
        throw null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.yd
    public final void d(jf jfVar) {
        pe peVar = this.f8032a;
        int i6 = peVar.f8058a;
        boolean z10 = true;
        if (i6 != 1) {
            z10 = false;
        }
        o.j("Unexpected response type: " + i6, z10);
        peVar.f8063g = jfVar;
        peVar.b();
        o.j("no success or failure set on method implementation", peVar.f8067k);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.yd
    public final void e(md mdVar) {
        pe peVar = this.f8032a;
        peVar.f8066j = mdVar;
        peVar.g(i.a("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.yd
    public final void f(kd kdVar) {
        pe peVar = this.f8032a;
        gd.m mVar = peVar.f;
        Status status = kdVar.f7947u;
        if (mVar != null) {
            mVar.b(status);
        }
        peVar.f8065i = kdVar.f7948v;
        gd.m mVar2 = peVar.f;
        if (mVar2 != null) {
            mVar2.b(status);
        }
        peVar.g(status);
    }
}
