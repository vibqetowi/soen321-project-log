package pj;

import android.os.Bundle;
import java.util.List;
import kotlin.jvm.internal.i;
/* compiled from: NotificationPayload.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f28526a;

    /* renamed from: b  reason: collision with root package name */
    public final String f28527b;

    /* renamed from: c  reason: collision with root package name */
    public final qh.a f28528c;

    /* renamed from: d  reason: collision with root package name */
    public final String f28529d;

    /* renamed from: e  reason: collision with root package name */
    public String f28530e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final List<jj.a> f28531g;

    /* renamed from: h  reason: collision with root package name */
    public final a f28532h;

    /* renamed from: i  reason: collision with root package name */
    public final Bundle f28533i;

    /* JADX WARN: Multi-variable type inference failed */
    public b(String str, String str2, qh.a aVar, String str3, String str4, long j10, List<? extends jj.a> list, a aVar2, Bundle payload) {
        i.g(payload, "payload");
        this.f28526a = str;
        this.f28527b = str2;
        this.f28528c = aVar;
        this.f28529d = str3;
        this.f28530e = str4;
        this.f = j10;
        this.f28531g = list;
        this.f28532h = aVar2;
        this.f28533i = payload;
    }

    public final String toString() {
        return "NotificationPayload(notificationType='" + this.f28526a + "'\n campaignId='" + this.f28527b + "'\n text=" + this.f28528c + "\n imageUrl=" + ((Object) this.f28529d) + "\n channelId='" + this.f28530e + "'\n inboxExpiry=" + this.f + "\n actionButtons=" + this.f28531g + "\n kvFeatures=" + this.f28532h + "\n payloadBundle=" + this.f28533i + ')';
    }
}
