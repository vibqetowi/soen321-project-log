package com.google.android.gms.internal.cast;

import android.content.Context;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class o2 extends l9.g {

    /* renamed from: d  reason: collision with root package name */
    public final l9.b f7612d;

    /* renamed from: e  reason: collision with root package name */
    public final c f7613e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o2(Context context, l9.b bVar, c cVar) {
        super(context, r0);
        String o02;
        boolean isEmpty = Collections.unmodifiableList(bVar.f24156v).isEmpty();
        String str = bVar.f24155u;
        if (isEmpty) {
            if (str != null) {
                o02 = kotlin.jvm.internal.h.o0(str, null);
            } else {
                throw new IllegalArgumentException("applicationId cannot be null");
            }
        } else {
            List unmodifiableList = Collections.unmodifiableList(bVar.f24156v);
            if (str != null) {
                if (unmodifiableList != null) {
                    o02 = kotlin.jvm.internal.h.o0(str, unmodifiableList);
                } else {
                    throw new IllegalArgumentException("namespaces cannot be null");
                }
            } else {
                throw new IllegalArgumentException("applicationId cannot be null");
            }
        }
        this.f7612d = bVar;
        this.f7613e = cVar;
    }

    @Override // l9.g
    public final l9.c a(String str) {
        return new l9.c(this.f24179a, this.f24180b, str, this.f7612d, new n9.j(this.f24179a, this.f7612d, this.f7613e));
    }

    @Override // l9.g
    public final boolean b() {
        return this.f7612d.f24159y;
    }
}
