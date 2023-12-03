package ph;

import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.i;
/* compiled from: RemoteDataTrackingConfig.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final long f28426a;

    /* renamed from: b  reason: collision with root package name */
    public final long f28427b;

    /* renamed from: c  reason: collision with root package name */
    public final int f28428c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<String> f28429d;

    /* renamed from: e  reason: collision with root package name */
    public final Set<String> f28430e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final Set<String> f28431g;

    /* renamed from: h  reason: collision with root package name */
    public final Set<String> f28432h;

    /* renamed from: i  reason: collision with root package name */
    public final Set<String> f28433i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f28434j;

    /* renamed from: k  reason: collision with root package name */
    public final Set<String> f28435k;

    /* renamed from: l  reason: collision with root package name */
    public final long f28436l;

    public a(long j10, long j11, int i6, Set blackListedEvents, HashSet hashSet, long j12, HashSet hashSet2, Set blockUniqueIdRegex, Set blackListedUserAttributes, boolean z10, HashSet hashSet3, long j13) {
        i.g(blackListedEvents, "blackListedEvents");
        i.g(blockUniqueIdRegex, "blockUniqueIdRegex");
        i.g(blackListedUserAttributes, "blackListedUserAttributes");
        this.f28426a = j10;
        this.f28427b = j11;
        this.f28428c = i6;
        this.f28429d = blackListedEvents;
        this.f28430e = hashSet;
        this.f = j12;
        this.f28431g = hashSet2;
        this.f28432h = blockUniqueIdRegex;
        this.f28433i = blackListedUserAttributes;
        this.f28434j = z10;
        this.f28435k = hashSet3;
        this.f28436l = j13;
    }
}
