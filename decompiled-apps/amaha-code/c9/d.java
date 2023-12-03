package c9;

import android.app.job.JobParameters;
/* compiled from: ConditionVariable.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5131a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5132b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f5133c;

    public d(int i6) {
        s sVar = b.f5126a;
        this.f5131a = 0;
        this.f5133c = sVar;
    }

    public final synchronized void a() {
        while (!this.f5132b) {
            wait();
        }
    }

    public final synchronized void b() {
        this.f5132b = false;
    }

    public final synchronized boolean c() {
        if (this.f5132b) {
            return false;
        }
        this.f5132b = true;
        notifyAll();
        return true;
    }

    public final String toString() {
        switch (this.f5131a) {
            case 4:
                return "DeviceAddResponse(isSuccess=" + this.f5132b + ", tokenState=" + ((ih.r) this.f5133c) + ')';
            default:
                return super.toString();
        }
    }

    public d(JobParameters jobParameters) {
        this.f5131a = 3;
        kotlin.jvm.internal.i.g(jobParameters, "jobParameters");
        this.f5133c = jobParameters;
        this.f5132b = false;
    }

    public d(String instanceId) {
        this.f5131a = 2;
        kotlin.jvm.internal.i.g(instanceId, "instanceId");
        this.f5133c = instanceId;
        this.f5132b = true;
    }

    public d(boolean z10, ih.r rVar) {
        this.f5131a = 4;
        this.f5132b = z10;
        this.f5133c = rVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d() {
        this(0);
        this.f5131a = 0;
    }
}
