package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import com.google.firebase.messaging.m0;
import hh.g;
import java.util.concurrent.ScheduledFuture;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements ya.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9740a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9741b;

    public /* synthetic */ j0(int i6, Object obj) {
        this.f9740a = i6;
        this.f9741b = obj;
    }

    @Override // ya.d
    public final void a(ya.h task) {
        int i6 = this.f9740a;
        Object obj = this.f9741b;
        switch (i6) {
            case 0:
                k0.b((Intent) obj);
                return;
            case 1:
                int i10 = l0.f9750b;
                ((m0.a) obj).f9761b.d(null);
                return;
            case 2:
                ((ScheduledFuture) obj).cancel(false);
                return;
            default:
                Context context = (Context) obj;
                kotlin.jvm.internal.i.g(context, "$context");
                kotlin.jvm.internal.i.g(task, "task");
                try {
                    ji.o.a(context, task);
                    return;
                } catch (Exception e10) {
                    hh.a aVar = hh.g.f17610d;
                    g.a.a(1, e10, ji.p.f22061u);
                    ji.o.c(context);
                    return;
                }
        }
    }
}
