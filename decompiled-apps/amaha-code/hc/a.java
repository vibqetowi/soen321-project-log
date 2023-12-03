package hc;

import android.app.PendingIntent;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.play:app-update@@2.0.1 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f17358a;

    /* renamed from: b  reason: collision with root package name */
    public final int f17359b;

    /* renamed from: c  reason: collision with root package name */
    public final long f17360c;

    /* renamed from: d  reason: collision with root package name */
    public final long f17361d;

    /* renamed from: e  reason: collision with root package name */
    public final PendingIntent f17362e;
    public final PendingIntent f;

    /* renamed from: g  reason: collision with root package name */
    public final PendingIntent f17363g;

    /* renamed from: h  reason: collision with root package name */
    public final PendingIntent f17364h;

    /* renamed from: i  reason: collision with root package name */
    public final Map f17365i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f17366j = false;

    public a(int i6, int i10, long j10, long j11, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, HashMap hashMap) {
        this.f17358a = i6;
        this.f17359b = i10;
        this.f17360c = j10;
        this.f17361d = j11;
        this.f17362e = pendingIntent;
        this.f = pendingIntent2;
        this.f17363g = pendingIntent3;
        this.f17364h = pendingIntent4;
        this.f17365i = hashMap;
    }

    public final PendingIntent a(m mVar) {
        long j10 = this.f17361d;
        long j11 = this.f17360c;
        boolean z10 = false;
        boolean z11 = mVar.f17394b;
        int i6 = mVar.f17393a;
        if (i6 == 0) {
            PendingIntent pendingIntent = this.f;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            if (z11 && j11 <= j10) {
                z10 = true;
            }
            if (!z10) {
                return null;
            }
            return this.f17364h;
        }
        if (i6 == 1) {
            PendingIntent pendingIntent2 = this.f17362e;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            if (z11 && j11 <= j10) {
                z10 = true;
            }
            if (z10) {
                return this.f17363g;
            }
        }
        return null;
    }
}
