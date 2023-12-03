package ov;

import kotlin.jvm.internal.i;
/* compiled from: Task.kt */
/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f27788a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f27789b;

    /* renamed from: c  reason: collision with root package name */
    public c f27790c;

    /* renamed from: d  reason: collision with root package name */
    public long f27791d;

    public /* synthetic */ a() {
        throw null;
    }

    public a(String name, boolean z10) {
        i.g(name, "name");
        this.f27788a = name;
        this.f27789b = z10;
        this.f27791d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f27788a;
    }
}
