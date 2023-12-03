package v9;

import android.accounts.Account;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Account f34854a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<Scope> f34855b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<Scope> f34856c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<com.google.android.gms.common.api.a<?>, u> f34857d;

    /* renamed from: e  reason: collision with root package name */
    public final String f34858e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final va.a f34859g;

    /* renamed from: h  reason: collision with root package name */
    public Integer f34860h;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public Account f34861a;

        /* renamed from: b  reason: collision with root package name */
        public t.d<Scope> f34862b;

        /* renamed from: c  reason: collision with root package name */
        public String f34863c;

        /* renamed from: d  reason: collision with root package name */
        public String f34864d;
    }

    public c(Account account, t.d dVar, String str, String str2) {
        Set<Scope> unmodifiableSet;
        va.a aVar = va.a.f34964u;
        this.f34854a = account;
        if (dVar == null) {
            unmodifiableSet = Collections.emptySet();
        } else {
            unmodifiableSet = Collections.unmodifiableSet(dVar);
        }
        this.f34855b = unmodifiableSet;
        Map<com.google.android.gms.common.api.a<?>, u> emptyMap = Collections.emptyMap();
        this.f34857d = emptyMap;
        this.f34858e = str;
        this.f = str2;
        this.f34859g = aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        for (u uVar : emptyMap.values()) {
            uVar.getClass();
            hashSet.addAll(null);
        }
        this.f34856c = Collections.unmodifiableSet(hashSet);
    }
}
