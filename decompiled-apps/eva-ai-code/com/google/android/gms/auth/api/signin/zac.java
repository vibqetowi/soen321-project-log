package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
final class zac implements Comparator<Scope> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Scope scope, Scope scope2) {
        return scope.getScopeUri().compareTo(scope2.getScopeUri());
    }
}
